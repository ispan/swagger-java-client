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
 * DkCloudDataModelVendorsInvoiceLineModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelVendorsInvoiceLineModel {
  @SerializedName("HeadID")
  private Integer headID = null;

  @SerializedName("SequenceID")
  private Integer sequenceID = null;

  @SerializedName("Account")
  private String account = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("Voucher")
  private String voucher = null;

  @SerializedName("TaxPercent")
  private Double taxPercent = null;

  @SerializedName("LineType")
  private Integer lineType = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Code")
  private Integer code = null;

  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Dim2")
  private String dim2 = null;

  @SerializedName("Dim3")
  private String dim3 = null;

  public DkCloudDataModelVendorsInvoiceLineModel headID(Integer headID) {
    this.headID = headID;
    return this;
  }

   /**
   * Get headID
   * @return headID
  **/
  @ApiModelProperty(value = "")
  public Integer getHeadID() {
    return headID;
  }

  public void setHeadID(Integer headID) {
    this.headID = headID;
  }

  public DkCloudDataModelVendorsInvoiceLineModel sequenceID(Integer sequenceID) {
    this.sequenceID = sequenceID;
    return this;
  }

   /**
   * Get sequenceID
   * @return sequenceID
  **/
  @ApiModelProperty(value = "")
  public Integer getSequenceID() {
    return sequenceID;
  }

  public void setSequenceID(Integer sequenceID) {
    this.sequenceID = sequenceID;
  }

  public DkCloudDataModelVendorsInvoiceLineModel account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public DkCloudDataModelVendorsInvoiceLineModel text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public DkCloudDataModelVendorsInvoiceLineModel reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public DkCloudDataModelVendorsInvoiceLineModel voucher(String voucher) {
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @ApiModelProperty(value = "")
  public String getVoucher() {
    return voucher;
  }

  public void setVoucher(String voucher) {
    this.voucher = voucher;
  }

  public DkCloudDataModelVendorsInvoiceLineModel taxPercent(Double taxPercent) {
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

  public DkCloudDataModelVendorsInvoiceLineModel lineType(Integer lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @ApiModelProperty(value = "")
  public Integer getLineType() {
    return lineType;
  }

  public void setLineType(Integer lineType) {
    this.lineType = lineType;
  }

  public DkCloudDataModelVendorsInvoiceLineModel amount(Double amount) {
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

  public DkCloudDataModelVendorsInvoiceLineModel code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public DkCloudDataModelVendorsInvoiceLineModel dim1(String dim1) {
    this.dim1 = dim1;
    return this;
  }

   /**
   * Get dim1
   * @return dim1
  **/
  @ApiModelProperty(value = "")
  public String getDim1() {
    return dim1;
  }

  public void setDim1(String dim1) {
    this.dim1 = dim1;
  }

  public DkCloudDataModelVendorsInvoiceLineModel dim2(String dim2) {
    this.dim2 = dim2;
    return this;
  }

   /**
   * Get dim2
   * @return dim2
  **/
  @ApiModelProperty(value = "")
  public String getDim2() {
    return dim2;
  }

  public void setDim2(String dim2) {
    this.dim2 = dim2;
  }

  public DkCloudDataModelVendorsInvoiceLineModel dim3(String dim3) {
    this.dim3 = dim3;
    return this;
  }

   /**
   * Get dim3
   * @return dim3
  **/
  @ApiModelProperty(value = "")
  public String getDim3() {
    return dim3;
  }

  public void setDim3(String dim3) {
    this.dim3 = dim3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelVendorsInvoiceLineModel dkCloudDataModelVendorsInvoiceLineModel = (DkCloudDataModelVendorsInvoiceLineModel) o;
    return Objects.equals(this.headID, dkCloudDataModelVendorsInvoiceLineModel.headID) &&
        Objects.equals(this.sequenceID, dkCloudDataModelVendorsInvoiceLineModel.sequenceID) &&
        Objects.equals(this.account, dkCloudDataModelVendorsInvoiceLineModel.account) &&
        Objects.equals(this.text, dkCloudDataModelVendorsInvoiceLineModel.text) &&
        Objects.equals(this.reference, dkCloudDataModelVendorsInvoiceLineModel.reference) &&
        Objects.equals(this.voucher, dkCloudDataModelVendorsInvoiceLineModel.voucher) &&
        Objects.equals(this.taxPercent, dkCloudDataModelVendorsInvoiceLineModel.taxPercent) &&
        Objects.equals(this.lineType, dkCloudDataModelVendorsInvoiceLineModel.lineType) &&
        Objects.equals(this.amount, dkCloudDataModelVendorsInvoiceLineModel.amount) &&
        Objects.equals(this.code, dkCloudDataModelVendorsInvoiceLineModel.code) &&
        Objects.equals(this.dim1, dkCloudDataModelVendorsInvoiceLineModel.dim1) &&
        Objects.equals(this.dim2, dkCloudDataModelVendorsInvoiceLineModel.dim2) &&
        Objects.equals(this.dim3, dkCloudDataModelVendorsInvoiceLineModel.dim3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headID, sequenceID, account, text, reference, voucher, taxPercent, lineType, amount, code, dim1, dim2, dim3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelVendorsInvoiceLineModel {\n");
    
    sb.append("    headID: ").append(toIndentedString(headID)).append("\n");
    sb.append("    sequenceID: ").append(toIndentedString(sequenceID)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
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

