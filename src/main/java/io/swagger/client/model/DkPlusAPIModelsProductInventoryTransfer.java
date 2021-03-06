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
 * DkPlusAPIModelsProductInventoryTransfer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsProductInventoryTransfer {
  @SerializedName("ItemCode")
  private String itemCode = null;

  @SerializedName("From")
  private String from = null;

  @SerializedName("To")
  private String to = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  public DkPlusAPIModelsProductInventoryTransfer itemCode(String itemCode) {
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

  public DkPlusAPIModelsProductInventoryTransfer from(String from) {
    this.from = from;
    return this;
  }

   /**
   * From Warehouse
   * @return from
  **/
  @ApiModelProperty(value = "From Warehouse")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public DkPlusAPIModelsProductInventoryTransfer to(String to) {
    this.to = to;
    return this;
  }

   /**
   * To Warehouse
   * @return to
  **/
  @ApiModelProperty(value = "To Warehouse")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public DkPlusAPIModelsProductInventoryTransfer comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Transfer Comment
   * @return comment
  **/
  @ApiModelProperty(value = "Transfer Comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public DkPlusAPIModelsProductInventoryTransfer quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity")
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
    DkPlusAPIModelsProductInventoryTransfer dkPlusAPIModelsProductInventoryTransfer = (DkPlusAPIModelsProductInventoryTransfer) o;
    return Objects.equals(this.itemCode, dkPlusAPIModelsProductInventoryTransfer.itemCode) &&
        Objects.equals(this.from, dkPlusAPIModelsProductInventoryTransfer.from) &&
        Objects.equals(this.to, dkPlusAPIModelsProductInventoryTransfer.to) &&
        Objects.equals(this.comment, dkPlusAPIModelsProductInventoryTransfer.comment) &&
        Objects.equals(this.quantity, dkPlusAPIModelsProductInventoryTransfer.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCode, from, to, comment, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsProductInventoryTransfer {\n");
    
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

