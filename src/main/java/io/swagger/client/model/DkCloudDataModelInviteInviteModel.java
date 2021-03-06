/*
 * dkPlus.API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelInviteInviteModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelInviteInviteModel {
  @SerializedName("Id")
  private UUID id = null;

  @SerializedName("Company")
  private UUID company = null;

  @SerializedName("Customer")
  private String customer = null;

  @SerializedName("InvitedBy")
  private String invitedBy = null;

  /**
   * Gets or Sets inviteType
   */
  @JsonAdapter(InviteTypeEnum.Adapter.class)
  public enum InviteTypeEnum {
    MYPAGE("MyPage"),
    
    DKPLUS("dkPlus");

    private String value;

    InviteTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InviteTypeEnum fromValue(String text) {
      for (InviteTypeEnum b : InviteTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InviteTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InviteTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InviteTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InviteTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("InviteType")
  private InviteTypeEnum inviteType = null;

  @SerializedName("Expires")
  private OffsetDateTime expires = null;

  @SerializedName("CancelledBy")
  private String cancelledBy = null;

  @SerializedName("Confirmed")
  private OffsetDateTime confirmed = null;

  @SerializedName("ExtraInfo")
  private String extraInfo = null;

  public DkCloudDataModelInviteInviteModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DkCloudDataModelInviteInviteModel company(UUID company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getCompany() {
    return company;
  }

  public void setCompany(UUID company) {
    this.company = company;
  }

  public DkCloudDataModelInviteInviteModel customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public DkCloudDataModelInviteInviteModel invitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }

   /**
   * Get invitedBy
   * @return invitedBy
  **/
  @ApiModelProperty(value = "")
  public String getInvitedBy() {
    return invitedBy;
  }

  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }

  public DkCloudDataModelInviteInviteModel inviteType(InviteTypeEnum inviteType) {
    this.inviteType = inviteType;
    return this;
  }

   /**
   * Get inviteType
   * @return inviteType
  **/
  @ApiModelProperty(value = "")
  public InviteTypeEnum getInviteType() {
    return inviteType;
  }

  public void setInviteType(InviteTypeEnum inviteType) {
    this.inviteType = inviteType;
  }

  public DkCloudDataModelInviteInviteModel expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public DkCloudDataModelInviteInviteModel cancelledBy(String cancelledBy) {
    this.cancelledBy = cancelledBy;
    return this;
  }

   /**
   * Get cancelledBy
   * @return cancelledBy
  **/
  @ApiModelProperty(value = "")
  public String getCancelledBy() {
    return cancelledBy;
  }

  public void setCancelledBy(String cancelledBy) {
    this.cancelledBy = cancelledBy;
  }

  public DkCloudDataModelInviteInviteModel confirmed(OffsetDateTime confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(OffsetDateTime confirmed) {
    this.confirmed = confirmed;
  }

  public DkCloudDataModelInviteInviteModel extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @ApiModelProperty(value = "")
  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelInviteInviteModel dkCloudDataModelInviteInviteModel = (DkCloudDataModelInviteInviteModel) o;
    return Objects.equals(this.id, dkCloudDataModelInviteInviteModel.id) &&
        Objects.equals(this.company, dkCloudDataModelInviteInviteModel.company) &&
        Objects.equals(this.customer, dkCloudDataModelInviteInviteModel.customer) &&
        Objects.equals(this.invitedBy, dkCloudDataModelInviteInviteModel.invitedBy) &&
        Objects.equals(this.inviteType, dkCloudDataModelInviteInviteModel.inviteType) &&
        Objects.equals(this.expires, dkCloudDataModelInviteInviteModel.expires) &&
        Objects.equals(this.cancelledBy, dkCloudDataModelInviteInviteModel.cancelledBy) &&
        Objects.equals(this.confirmed, dkCloudDataModelInviteInviteModel.confirmed) &&
        Objects.equals(this.extraInfo, dkCloudDataModelInviteInviteModel.extraInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, company, customer, invitedBy, inviteType, expires, cancelledBy, confirmed, extraInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelInviteInviteModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    cancelledBy: ").append(toIndentedString(cancelledBy)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

