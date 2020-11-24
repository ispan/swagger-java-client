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
 * DkCloudDataModelProductsVariationModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelProductsVariationModel {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Code2")
  private String code2 = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Description2")
  private String description2 = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("QuantityOnBackOrders")
  private Double quantityOnBackOrders = null;

  public DkCloudDataModelProductsVariationModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DkCloudDataModelProductsVariationModel code2(String code2) {
    this.code2 = code2;
    return this;
  }

   /**
   * Get code2
   * @return code2
  **/
  @ApiModelProperty(value = "")
  public String getCode2() {
    return code2;
  }

  public void setCode2(String code2) {
    this.code2 = code2;
  }

  public DkCloudDataModelProductsVariationModel description(String description) {
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

  public DkCloudDataModelProductsVariationModel description2(String description2) {
    this.description2 = description2;
    return this;
  }

   /**
   * Get description2
   * @return description2
  **/
  @ApiModelProperty(value = "")
  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public DkCloudDataModelProductsVariationModel quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public DkCloudDataModelProductsVariationModel quantityOnBackOrders(Double quantityOnBackOrders) {
    this.quantityOnBackOrders = quantityOnBackOrders;
    return this;
  }

   /**
   * Get quantityOnBackOrders
   * @return quantityOnBackOrders
  **/
  @ApiModelProperty(value = "")
  public Double getQuantityOnBackOrders() {
    return quantityOnBackOrders;
  }

  public void setQuantityOnBackOrders(Double quantityOnBackOrders) {
    this.quantityOnBackOrders = quantityOnBackOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelProductsVariationModel dkCloudDataModelProductsVariationModel = (DkCloudDataModelProductsVariationModel) o;
    return Objects.equals(this.code, dkCloudDataModelProductsVariationModel.code) &&
        Objects.equals(this.code2, dkCloudDataModelProductsVariationModel.code2) &&
        Objects.equals(this.description, dkCloudDataModelProductsVariationModel.description) &&
        Objects.equals(this.description2, dkCloudDataModelProductsVariationModel.description2) &&
        Objects.equals(this.quantity, dkCloudDataModelProductsVariationModel.quantity) &&
        Objects.equals(this.quantityOnBackOrders, dkCloudDataModelProductsVariationModel.quantityOnBackOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, code2, description, description2, quantity, quantityOnBackOrders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelProductsVariationModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    code2: ").append(toIndentedString(code2)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityOnBackOrders: ").append(toIndentedString(quantityOnBackOrders)).append("\n");
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
