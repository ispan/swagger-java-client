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
 * Create Barcode Model
 */
@ApiModel(description = "Create Barcode Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsProductInventoryBarcode {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("ItemCode")
  private String itemCode = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  public DkPlusAPIModelsProductInventoryBarcode code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Barcode
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Barcode")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DkPlusAPIModelsProductInventoryBarcode itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * ItemCode assigned to barcode
   * @return itemCode
  **/
  @ApiModelProperty(required = true, value = "ItemCode assigned to barcode")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public DkPlusAPIModelsProductInventoryBarcode quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Sales quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Sales quantity")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsProductInventoryBarcode dkPlusAPIModelsProductInventoryBarcode = (DkPlusAPIModelsProductInventoryBarcode) o;
    return Objects.equals(this.code, dkPlusAPIModelsProductInventoryBarcode.code) &&
        Objects.equals(this.itemCode, dkPlusAPIModelsProductInventoryBarcode.itemCode) &&
        Objects.equals(this.quantity, dkPlusAPIModelsProductInventoryBarcode.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, itemCode, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsProductInventoryBarcode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
