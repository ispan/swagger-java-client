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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * DkCloudDataModelUserTokenModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelUserTokenModel {
  @SerializedName("Token")
  private UUID token = null;

  @SerializedName("Company")
  private UUID company = null;

  @SerializedName("User")
  private String user = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GENERAL("General"),
    
    BOKUN("Bokun");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Notify")
  private List<String> notify = null;

  public DkCloudDataModelUserTokenModel token(UUID token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getToken() {
    return token;
  }

  public void setToken(UUID token) {
    this.token = token;
  }

  public DkCloudDataModelUserTokenModel company(UUID company) {
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

  public DkCloudDataModelUserTokenModel user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DkCloudDataModelUserTokenModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DkCloudDataModelUserTokenModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DkCloudDataModelUserTokenModel notify(List<String> notify) {
    this.notify = notify;
    return this;
  }

  public DkCloudDataModelUserTokenModel addNotifyItem(String notifyItem) {
    if (this.notify == null) {
      this.notify = new ArrayList<String>();
    }
    this.notify.add(notifyItem);
    return this;
  }

   /**
   * Get notify
   * @return notify
  **/
  @ApiModelProperty(value = "")
  public List<String> getNotify() {
    return notify;
  }

  public void setNotify(List<String> notify) {
    this.notify = notify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelUserTokenModel dkCloudDataModelUserTokenModel = (DkCloudDataModelUserTokenModel) o;
    return Objects.equals(this.token, dkCloudDataModelUserTokenModel.token) &&
        Objects.equals(this.company, dkCloudDataModelUserTokenModel.company) &&
        Objects.equals(this.user, dkCloudDataModelUserTokenModel.user) &&
        Objects.equals(this.type, dkCloudDataModelUserTokenModel.type) &&
        Objects.equals(this.description, dkCloudDataModelUserTokenModel.description) &&
        Objects.equals(this.notify, dkCloudDataModelUserTokenModel.notify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, company, user, type, description, notify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelUserTokenModel {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
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

