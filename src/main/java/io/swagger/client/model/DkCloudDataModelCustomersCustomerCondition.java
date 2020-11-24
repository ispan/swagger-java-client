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
 * DkCloudDataModelCustomersCustomerCondition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelCustomersCustomerCondition {
  @SerializedName("CreditLimit")
  private Double creditLimit = null;

  @SerializedName("CreditMax")
  private Double creditMax = null;

  @SerializedName("DisableSale")
  private Boolean disableSale = null;

  @SerializedName("DisableRetail")
  private Boolean disableRetail = null;

  public DkCloudDataModelCustomersCustomerCondition creditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")
  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public DkCloudDataModelCustomersCustomerCondition creditMax(Double creditMax) {
    this.creditMax = creditMax;
    return this;
  }

   /**
   * Get creditMax
   * @return creditMax
  **/
  @ApiModelProperty(value = "")
  public Double getCreditMax() {
    return creditMax;
  }

  public void setCreditMax(Double creditMax) {
    this.creditMax = creditMax;
  }

  public DkCloudDataModelCustomersCustomerCondition disableSale(Boolean disableSale) {
    this.disableSale = disableSale;
    return this;
  }

   /**
   * Get disableSale
   * @return disableSale
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisableSale() {
    return disableSale;
  }

  public void setDisableSale(Boolean disableSale) {
    this.disableSale = disableSale;
  }

  public DkCloudDataModelCustomersCustomerCondition disableRetail(Boolean disableRetail) {
    this.disableRetail = disableRetail;
    return this;
  }

   /**
   * Get disableRetail
   * @return disableRetail
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisableRetail() {
    return disableRetail;
  }

  public void setDisableRetail(Boolean disableRetail) {
    this.disableRetail = disableRetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelCustomersCustomerCondition dkCloudDataModelCustomersCustomerCondition = (DkCloudDataModelCustomersCustomerCondition) o;
    return Objects.equals(this.creditLimit, dkCloudDataModelCustomersCustomerCondition.creditLimit) &&
        Objects.equals(this.creditMax, dkCloudDataModelCustomersCustomerCondition.creditMax) &&
        Objects.equals(this.disableSale, dkCloudDataModelCustomersCustomerCondition.disableSale) &&
        Objects.equals(this.disableRetail, dkCloudDataModelCustomersCustomerCondition.disableRetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, creditMax, disableSale, disableRetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelCustomersCustomerCondition {\n");
    
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    creditMax: ").append(toIndentedString(creditMax)).append("\n");
    sb.append("    disableSale: ").append(toIndentedString(disableSale)).append("\n");
    sb.append("    disableRetail: ").append(toIndentedString(disableRetail)).append("\n");
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

