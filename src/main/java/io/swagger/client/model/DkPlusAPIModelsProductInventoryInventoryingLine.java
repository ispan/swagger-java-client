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
 * Product Inventorying Line
 */
@ApiModel(description = "Product Inventorying Line")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsProductInventoryInventoryingLine {
  @SerializedName("ItemCode")
  private String itemCode = null;

  @SerializedName("Counted")
  private Double counted = null;

  @SerializedName("Warehouse")
  private String warehouse = null;

  public DkPlusAPIModelsProductInventoryInventoryingLine itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * Item Code
   * @return itemCode
  **/
  @ApiModelProperty(required = true, value = "Item Code")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public DkPlusAPIModelsProductInventoryInventoryingLine counted(Double counted) {
    this.counted = counted;
    return this;
  }

   /**
   * Counted Quantity
   * @return counted
  **/
  @ApiModelProperty(value = "Counted Quantity")
  public Double getCounted() {
    return counted;
  }

  public void setCounted(Double counted) {
    this.counted = counted;
  }

  public DkPlusAPIModelsProductInventoryInventoryingLine warehouse(String warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Warehouse
   * @return warehouse
  **/
  @ApiModelProperty(value = "Warehouse")
  public String getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(String warehouse) {
    this.warehouse = warehouse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsProductInventoryInventoryingLine dkPlusAPIModelsProductInventoryInventoryingLine = (DkPlusAPIModelsProductInventoryInventoryingLine) o;
    return Objects.equals(this.itemCode, dkPlusAPIModelsProductInventoryInventoryingLine.itemCode) &&
        Objects.equals(this.counted, dkPlusAPIModelsProductInventoryInventoryingLine.counted) &&
        Objects.equals(this.warehouse, dkPlusAPIModelsProductInventoryInventoryingLine.warehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCode, counted, warehouse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsProductInventoryInventoryingLine {\n");
    
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    counted: ").append(toIndentedString(counted)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
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

