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
 * DkCloudDataModelProductsProductUnitModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelProductsProductUnitModel {
  @SerializedName("UnitCode")
  private String unitCode = null;

  @SerializedName("UnitQuantity")
  private Double unitQuantity = null;

  @SerializedName("DefaultSaleQuantity")
  private Double defaultSaleQuantity = null;

  @SerializedName("UnitPriceRatio")
  private Double unitPriceRatio = null;

  @SerializedName("NetWeight")
  private Double netWeight = null;

  @SerializedName("UnitPrice")
  private Double unitPrice = null;

  @SerializedName("UnitPriceWithTax")
  private Double unitPriceWithTax = null;

  @SerializedName("QuantityOnHand")
  private Double quantityOnHand = null;

  public DkCloudDataModelProductsProductUnitModel unitCode(String unitCode) {
    this.unitCode = unitCode;
    return this;
  }

   /**
   * Get unitCode
   * @return unitCode
  **/
  @ApiModelProperty(value = "")
  public String getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  public DkCloudDataModelProductsProductUnitModel unitQuantity(Double unitQuantity) {
    this.unitQuantity = unitQuantity;
    return this;
  }

   /**
   * Get unitQuantity
   * @return unitQuantity
  **/
  @ApiModelProperty(value = "")
  public Double getUnitQuantity() {
    return unitQuantity;
  }

  public void setUnitQuantity(Double unitQuantity) {
    this.unitQuantity = unitQuantity;
  }

  public DkCloudDataModelProductsProductUnitModel defaultSaleQuantity(Double defaultSaleQuantity) {
    this.defaultSaleQuantity = defaultSaleQuantity;
    return this;
  }

   /**
   * Get defaultSaleQuantity
   * @return defaultSaleQuantity
  **/
  @ApiModelProperty(value = "")
  public Double getDefaultSaleQuantity() {
    return defaultSaleQuantity;
  }

  public void setDefaultSaleQuantity(Double defaultSaleQuantity) {
    this.defaultSaleQuantity = defaultSaleQuantity;
  }

  public DkCloudDataModelProductsProductUnitModel unitPriceRatio(Double unitPriceRatio) {
    this.unitPriceRatio = unitPriceRatio;
    return this;
  }

   /**
   * Get unitPriceRatio
   * @return unitPriceRatio
  **/
  @ApiModelProperty(value = "")
  public Double getUnitPriceRatio() {
    return unitPriceRatio;
  }

  public void setUnitPriceRatio(Double unitPriceRatio) {
    this.unitPriceRatio = unitPriceRatio;
  }

  public DkCloudDataModelProductsProductUnitModel netWeight(Double netWeight) {
    this.netWeight = netWeight;
    return this;
  }

   /**
   * Get netWeight
   * @return netWeight
  **/
  @ApiModelProperty(value = "")
  public Double getNetWeight() {
    return netWeight;
  }

  public void setNetWeight(Double netWeight) {
    this.netWeight = netWeight;
  }

  public DkCloudDataModelProductsProductUnitModel unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(value = "")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public DkCloudDataModelProductsProductUnitModel unitPriceWithTax(Double unitPriceWithTax) {
    this.unitPriceWithTax = unitPriceWithTax;
    return this;
  }

   /**
   * Get unitPriceWithTax
   * @return unitPriceWithTax
  **/
  @ApiModelProperty(value = "")
  public Double getUnitPriceWithTax() {
    return unitPriceWithTax;
  }

  public void setUnitPriceWithTax(Double unitPriceWithTax) {
    this.unitPriceWithTax = unitPriceWithTax;
  }

  public DkCloudDataModelProductsProductUnitModel quantityOnHand(Double quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
    return this;
  }

   /**
   * Get quantityOnHand
   * @return quantityOnHand
  **/
  @ApiModelProperty(value = "")
  public Double getQuantityOnHand() {
    return quantityOnHand;
  }

  public void setQuantityOnHand(Double quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelProductsProductUnitModel dkCloudDataModelProductsProductUnitModel = (DkCloudDataModelProductsProductUnitModel) o;
    return Objects.equals(this.unitCode, dkCloudDataModelProductsProductUnitModel.unitCode) &&
        Objects.equals(this.unitQuantity, dkCloudDataModelProductsProductUnitModel.unitQuantity) &&
        Objects.equals(this.defaultSaleQuantity, dkCloudDataModelProductsProductUnitModel.defaultSaleQuantity) &&
        Objects.equals(this.unitPriceRatio, dkCloudDataModelProductsProductUnitModel.unitPriceRatio) &&
        Objects.equals(this.netWeight, dkCloudDataModelProductsProductUnitModel.netWeight) &&
        Objects.equals(this.unitPrice, dkCloudDataModelProductsProductUnitModel.unitPrice) &&
        Objects.equals(this.unitPriceWithTax, dkCloudDataModelProductsProductUnitModel.unitPriceWithTax) &&
        Objects.equals(this.quantityOnHand, dkCloudDataModelProductsProductUnitModel.quantityOnHand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitCode, unitQuantity, defaultSaleQuantity, unitPriceRatio, netWeight, unitPrice, unitPriceWithTax, quantityOnHand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelProductsProductUnitModel {\n");
    
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    unitQuantity: ").append(toIndentedString(unitQuantity)).append("\n");
    sb.append("    defaultSaleQuantity: ").append(toIndentedString(defaultSaleQuantity)).append("\n");
    sb.append("    unitPriceRatio: ").append(toIndentedString(unitPriceRatio)).append("\n");
    sb.append("    netWeight: ").append(toIndentedString(netWeight)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitPriceWithTax: ").append(toIndentedString(unitPriceWithTax)).append("\n");
    sb.append("    quantityOnHand: ").append(toIndentedString(quantityOnHand)).append("\n");
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
