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

/**
 * DkPlusAPIModelsMemberMemberApplicationCreated
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsMemberMemberApplicationCreated {
  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("TaxAmount")
  private Double taxAmount = null;

  @SerializedName("TaxPercent")
  private Double taxPercent = null;

  public DkPlusAPIModelsMemberMemberApplicationCreated number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public DkPlusAPIModelsMemberMemberApplicationCreated amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DkPlusAPIModelsMemberMemberApplicationCreated message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DkPlusAPIModelsMemberMemberApplicationCreated taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public DkPlusAPIModelsMemberMemberApplicationCreated taxPercent(Double taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

   /**
   * Get taxPercent
   * @return taxPercent
  **/
  @ApiModelProperty(value = "")
  public Double getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(Double taxPercent) {
    this.taxPercent = taxPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsMemberMemberApplicationCreated dkPlusAPIModelsMemberMemberApplicationCreated = (DkPlusAPIModelsMemberMemberApplicationCreated) o;
    return Objects.equals(this.number, dkPlusAPIModelsMemberMemberApplicationCreated.number) &&
        Objects.equals(this.amount, dkPlusAPIModelsMemberMemberApplicationCreated.amount) &&
        Objects.equals(this.message, dkPlusAPIModelsMemberMemberApplicationCreated.message) &&
        Objects.equals(this.taxAmount, dkPlusAPIModelsMemberMemberApplicationCreated.taxAmount) &&
        Objects.equals(this.taxPercent, dkPlusAPIModelsMemberMemberApplicationCreated.taxPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, amount, message, taxAmount, taxPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsMemberMemberApplicationCreated {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
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
