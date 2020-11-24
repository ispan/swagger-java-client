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
import org.threeten.bp.OffsetDateTime;

/**
 * DkPlusAPIModelsInvoicePaymentPlanCancel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsInvoicePaymentPlanCancel {
  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("User")
  private String user = null;

  @SerializedName("Reason")
  private String reason = null;

  public DkPlusAPIModelsInvoicePaymentPlanCancel date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * When cancelation should be in effect
   * @return date
  **/
  @ApiModelProperty(value = "When cancelation should be in effect")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public DkPlusAPIModelsInvoicePaymentPlanCancel user(String user) {
    this.user = user;
    return this;
  }

   /**
   * User Id of user performing the cacelation
   * @return user
  **/
  @ApiModelProperty(required = true, value = "User Id of user performing the cacelation")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DkPlusAPIModelsInvoicePaymentPlanCancel reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for cancellation
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "Reason for cancellation")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsInvoicePaymentPlanCancel dkPlusAPIModelsInvoicePaymentPlanCancel = (DkPlusAPIModelsInvoicePaymentPlanCancel) o;
    return Objects.equals(this.date, dkPlusAPIModelsInvoicePaymentPlanCancel.date) &&
        Objects.equals(this.user, dkPlusAPIModelsInvoicePaymentPlanCancel.user) &&
        Objects.equals(this.reason, dkPlusAPIModelsInvoicePaymentPlanCancel.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, user, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsInvoicePaymentPlanCancel {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
