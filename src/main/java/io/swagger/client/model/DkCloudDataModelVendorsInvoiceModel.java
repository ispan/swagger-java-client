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
import io.swagger.client.model.DkCloudDataModelVendorsInvoiceLineModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelVendorsInvoiceModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelVendorsInvoiceModel {
  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  @SerializedName("Vendor")
  private String vendor = null;

  @SerializedName("VendorName")
  private String vendorName = null;

  @SerializedName("InvoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("DueDate")
  private OffsetDateTime dueDate = null;

  @SerializedName("InvoiceDate")
  private OffsetDateTime invoiceDate = null;

  @SerializedName("ReceivedDate")
  private OffsetDateTime receivedDate = null;

  @SerializedName("Voucher")
  private String voucher = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("InvoiceType")
  private Integer invoiceType = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("Exchange")
  private Double exchange = null;

  @SerializedName("Origin")
  private Integer origin = null;

  @SerializedName("HasAttachment")
  private Boolean hasAttachment = null;

  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Dim2")
  private String dim2 = null;

  @SerializedName("Dim3")
  private String dim3 = null;

  @SerializedName("ApprovedBy1")
  private String approvedBy1 = null;

  @SerializedName("FromApprovement1")
  private OffsetDateTime fromApprovement1 = null;

  @SerializedName("ToApprovement1")
  private OffsetDateTime toApprovement1 = null;

  @SerializedName("ApprovedStatus1")
  private Integer approvedStatus1 = null;

  @SerializedName("ApprovedBy2")
  private String approvedBy2 = null;

  @SerializedName("FromApprovement2")
  private OffsetDateTime fromApprovement2 = null;

  @SerializedName("ToApprovement2")
  private OffsetDateTime toApprovement2 = null;

  @SerializedName("ApprovedStatus2")
  private Integer approvedStatus2 = null;

  @SerializedName("ApprovedBy3")
  private String approvedBy3 = null;

  @SerializedName("FromApprovement3")
  private OffsetDateTime fromApprovement3 = null;

  @SerializedName("ToApprovement3")
  private OffsetDateTime toApprovement3 = null;

  @SerializedName("ApprovedStatus3")
  private Integer approvedStatus3 = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Posted")
  private Boolean posted = null;

  @SerializedName("Lines")
  private List<DkCloudDataModelVendorsInvoiceLineModel> lines = null;

  @SerializedName("DueDateHours")
  private Double dueDateHours = null;

  @SerializedName("DueDateDays")
  private Double dueDateDays = null;

  @SerializedName("IsApproved")
  private Boolean isApproved = null;

  @SerializedName("ApprovalStatus")
  private Integer approvalStatus = null;

  public DkCloudDataModelVendorsInvoiceModel ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public DkCloudDataModelVendorsInvoiceModel modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public DkCloudDataModelVendorsInvoiceModel vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public DkCloudDataModelVendorsInvoiceModel vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(value = "")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public DkCloudDataModelVendorsInvoiceModel invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public DkCloudDataModelVendorsInvoiceModel dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public DkCloudDataModelVendorsInvoiceModel invoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public DkCloudDataModelVendorsInvoiceModel receivedDate(OffsetDateTime receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Get receivedDate
   * @return receivedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(OffsetDateTime receivedDate) {
    this.receivedDate = receivedDate;
  }

  public DkCloudDataModelVendorsInvoiceModel voucher(String voucher) {
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

  public DkCloudDataModelVendorsInvoiceModel text(String text) {
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

  public DkCloudDataModelVendorsInvoiceModel reference(String reference) {
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

  public DkCloudDataModelVendorsInvoiceModel invoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * Get invoiceType
   * @return invoiceType
  **/
  @ApiModelProperty(value = "")
  public Integer getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
  }

  public DkCloudDataModelVendorsInvoiceModel amount(Double amount) {
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

  public DkCloudDataModelVendorsInvoiceModel currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public DkCloudDataModelVendorsInvoiceModel exchange(Double exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @ApiModelProperty(value = "")
  public Double getExchange() {
    return exchange;
  }

  public void setExchange(Double exchange) {
    this.exchange = exchange;
  }

  public DkCloudDataModelVendorsInvoiceModel origin(Integer origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public Integer getOrigin() {
    return origin;
  }

  public void setOrigin(Integer origin) {
    this.origin = origin;
  }

  public DkCloudDataModelVendorsInvoiceModel hasAttachment(Boolean hasAttachment) {
    this.hasAttachment = hasAttachment;
    return this;
  }

   /**
   * Get hasAttachment
   * @return hasAttachment
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasAttachment() {
    return hasAttachment;
  }

  public void setHasAttachment(Boolean hasAttachment) {
    this.hasAttachment = hasAttachment;
  }

  public DkCloudDataModelVendorsInvoiceModel dim1(String dim1) {
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

  public DkCloudDataModelVendorsInvoiceModel dim2(String dim2) {
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

  public DkCloudDataModelVendorsInvoiceModel dim3(String dim3) {
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

  public DkCloudDataModelVendorsInvoiceModel approvedBy1(String approvedBy1) {
    this.approvedBy1 = approvedBy1;
    return this;
  }

   /**
   * Get approvedBy1
   * @return approvedBy1
  **/
  @ApiModelProperty(value = "")
  public String getApprovedBy1() {
    return approvedBy1;
  }

  public void setApprovedBy1(String approvedBy1) {
    this.approvedBy1 = approvedBy1;
  }

  public DkCloudDataModelVendorsInvoiceModel fromApprovement1(OffsetDateTime fromApprovement1) {
    this.fromApprovement1 = fromApprovement1;
    return this;
  }

   /**
   * Get fromApprovement1
   * @return fromApprovement1
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFromApprovement1() {
    return fromApprovement1;
  }

  public void setFromApprovement1(OffsetDateTime fromApprovement1) {
    this.fromApprovement1 = fromApprovement1;
  }

  public DkCloudDataModelVendorsInvoiceModel toApprovement1(OffsetDateTime toApprovement1) {
    this.toApprovement1 = toApprovement1;
    return this;
  }

   /**
   * Get toApprovement1
   * @return toApprovement1
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getToApprovement1() {
    return toApprovement1;
  }

  public void setToApprovement1(OffsetDateTime toApprovement1) {
    this.toApprovement1 = toApprovement1;
  }

  public DkCloudDataModelVendorsInvoiceModel approvedStatus1(Integer approvedStatus1) {
    this.approvedStatus1 = approvedStatus1;
    return this;
  }

   /**
   * Get approvedStatus1
   * @return approvedStatus1
  **/
  @ApiModelProperty(value = "")
  public Integer getApprovedStatus1() {
    return approvedStatus1;
  }

  public void setApprovedStatus1(Integer approvedStatus1) {
    this.approvedStatus1 = approvedStatus1;
  }

  public DkCloudDataModelVendorsInvoiceModel approvedBy2(String approvedBy2) {
    this.approvedBy2 = approvedBy2;
    return this;
  }

   /**
   * Get approvedBy2
   * @return approvedBy2
  **/
  @ApiModelProperty(value = "")
  public String getApprovedBy2() {
    return approvedBy2;
  }

  public void setApprovedBy2(String approvedBy2) {
    this.approvedBy2 = approvedBy2;
  }

  public DkCloudDataModelVendorsInvoiceModel fromApprovement2(OffsetDateTime fromApprovement2) {
    this.fromApprovement2 = fromApprovement2;
    return this;
  }

   /**
   * Get fromApprovement2
   * @return fromApprovement2
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFromApprovement2() {
    return fromApprovement2;
  }

  public void setFromApprovement2(OffsetDateTime fromApprovement2) {
    this.fromApprovement2 = fromApprovement2;
  }

  public DkCloudDataModelVendorsInvoiceModel toApprovement2(OffsetDateTime toApprovement2) {
    this.toApprovement2 = toApprovement2;
    return this;
  }

   /**
   * Get toApprovement2
   * @return toApprovement2
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getToApprovement2() {
    return toApprovement2;
  }

  public void setToApprovement2(OffsetDateTime toApprovement2) {
    this.toApprovement2 = toApprovement2;
  }

  public DkCloudDataModelVendorsInvoiceModel approvedStatus2(Integer approvedStatus2) {
    this.approvedStatus2 = approvedStatus2;
    return this;
  }

   /**
   * Get approvedStatus2
   * @return approvedStatus2
  **/
  @ApiModelProperty(value = "")
  public Integer getApprovedStatus2() {
    return approvedStatus2;
  }

  public void setApprovedStatus2(Integer approvedStatus2) {
    this.approvedStatus2 = approvedStatus2;
  }

  public DkCloudDataModelVendorsInvoiceModel approvedBy3(String approvedBy3) {
    this.approvedBy3 = approvedBy3;
    return this;
  }

   /**
   * Get approvedBy3
   * @return approvedBy3
  **/
  @ApiModelProperty(value = "")
  public String getApprovedBy3() {
    return approvedBy3;
  }

  public void setApprovedBy3(String approvedBy3) {
    this.approvedBy3 = approvedBy3;
  }

  public DkCloudDataModelVendorsInvoiceModel fromApprovement3(OffsetDateTime fromApprovement3) {
    this.fromApprovement3 = fromApprovement3;
    return this;
  }

   /**
   * Get fromApprovement3
   * @return fromApprovement3
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFromApprovement3() {
    return fromApprovement3;
  }

  public void setFromApprovement3(OffsetDateTime fromApprovement3) {
    this.fromApprovement3 = fromApprovement3;
  }

  public DkCloudDataModelVendorsInvoiceModel toApprovement3(OffsetDateTime toApprovement3) {
    this.toApprovement3 = toApprovement3;
    return this;
  }

   /**
   * Get toApprovement3
   * @return toApprovement3
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getToApprovement3() {
    return toApprovement3;
  }

  public void setToApprovement3(OffsetDateTime toApprovement3) {
    this.toApprovement3 = toApprovement3;
  }

  public DkCloudDataModelVendorsInvoiceModel approvedStatus3(Integer approvedStatus3) {
    this.approvedStatus3 = approvedStatus3;
    return this;
  }

   /**
   * Get approvedStatus3
   * @return approvedStatus3
  **/
  @ApiModelProperty(value = "")
  public Integer getApprovedStatus3() {
    return approvedStatus3;
  }

  public void setApprovedStatus3(Integer approvedStatus3) {
    this.approvedStatus3 = approvedStatus3;
  }

  public DkCloudDataModelVendorsInvoiceModel description(String description) {
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

  public DkCloudDataModelVendorsInvoiceModel posted(Boolean posted) {
    this.posted = posted;
    return this;
  }

   /**
   * Get posted
   * @return posted
  **/
  @ApiModelProperty(value = "")
  public Boolean isPosted() {
    return posted;
  }

  public void setPosted(Boolean posted) {
    this.posted = posted;
  }

  public DkCloudDataModelVendorsInvoiceModel lines(List<DkCloudDataModelVendorsInvoiceLineModel> lines) {
    this.lines = lines;
    return this;
  }

  public DkCloudDataModelVendorsInvoiceModel addLinesItem(DkCloudDataModelVendorsInvoiceLineModel linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<DkCloudDataModelVendorsInvoiceLineModel>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelVendorsInvoiceLineModel> getLines() {
    return lines;
  }

  public void setLines(List<DkCloudDataModelVendorsInvoiceLineModel> lines) {
    this.lines = lines;
  }

   /**
   * Get dueDateHours
   * @return dueDateHours
  **/
  @ApiModelProperty(value = "")
  public Double getDueDateHours() {
    return dueDateHours;
  }

   /**
   * Get dueDateDays
   * @return dueDateDays
  **/
  @ApiModelProperty(value = "")
  public Double getDueDateDays() {
    return dueDateDays;
  }

   /**
   * Get isApproved
   * @return isApproved
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsApproved() {
    return isApproved;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getApprovalStatus() {
    return approvalStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelVendorsInvoiceModel dkCloudDataModelVendorsInvoiceModel = (DkCloudDataModelVendorsInvoiceModel) o;
    return Objects.equals(this.ID, dkCloudDataModelVendorsInvoiceModel.ID) &&
        Objects.equals(this.modified, dkCloudDataModelVendorsInvoiceModel.modified) &&
        Objects.equals(this.vendor, dkCloudDataModelVendorsInvoiceModel.vendor) &&
        Objects.equals(this.vendorName, dkCloudDataModelVendorsInvoiceModel.vendorName) &&
        Objects.equals(this.invoiceNumber, dkCloudDataModelVendorsInvoiceModel.invoiceNumber) &&
        Objects.equals(this.dueDate, dkCloudDataModelVendorsInvoiceModel.dueDate) &&
        Objects.equals(this.invoiceDate, dkCloudDataModelVendorsInvoiceModel.invoiceDate) &&
        Objects.equals(this.receivedDate, dkCloudDataModelVendorsInvoiceModel.receivedDate) &&
        Objects.equals(this.voucher, dkCloudDataModelVendorsInvoiceModel.voucher) &&
        Objects.equals(this.text, dkCloudDataModelVendorsInvoiceModel.text) &&
        Objects.equals(this.reference, dkCloudDataModelVendorsInvoiceModel.reference) &&
        Objects.equals(this.invoiceType, dkCloudDataModelVendorsInvoiceModel.invoiceType) &&
        Objects.equals(this.amount, dkCloudDataModelVendorsInvoiceModel.amount) &&
        Objects.equals(this.currencyCode, dkCloudDataModelVendorsInvoiceModel.currencyCode) &&
        Objects.equals(this.exchange, dkCloudDataModelVendorsInvoiceModel.exchange) &&
        Objects.equals(this.origin, dkCloudDataModelVendorsInvoiceModel.origin) &&
        Objects.equals(this.hasAttachment, dkCloudDataModelVendorsInvoiceModel.hasAttachment) &&
        Objects.equals(this.dim1, dkCloudDataModelVendorsInvoiceModel.dim1) &&
        Objects.equals(this.dim2, dkCloudDataModelVendorsInvoiceModel.dim2) &&
        Objects.equals(this.dim3, dkCloudDataModelVendorsInvoiceModel.dim3) &&
        Objects.equals(this.approvedBy1, dkCloudDataModelVendorsInvoiceModel.approvedBy1) &&
        Objects.equals(this.fromApprovement1, dkCloudDataModelVendorsInvoiceModel.fromApprovement1) &&
        Objects.equals(this.toApprovement1, dkCloudDataModelVendorsInvoiceModel.toApprovement1) &&
        Objects.equals(this.approvedStatus1, dkCloudDataModelVendorsInvoiceModel.approvedStatus1) &&
        Objects.equals(this.approvedBy2, dkCloudDataModelVendorsInvoiceModel.approvedBy2) &&
        Objects.equals(this.fromApprovement2, dkCloudDataModelVendorsInvoiceModel.fromApprovement2) &&
        Objects.equals(this.toApprovement2, dkCloudDataModelVendorsInvoiceModel.toApprovement2) &&
        Objects.equals(this.approvedStatus2, dkCloudDataModelVendorsInvoiceModel.approvedStatus2) &&
        Objects.equals(this.approvedBy3, dkCloudDataModelVendorsInvoiceModel.approvedBy3) &&
        Objects.equals(this.fromApprovement3, dkCloudDataModelVendorsInvoiceModel.fromApprovement3) &&
        Objects.equals(this.toApprovement3, dkCloudDataModelVendorsInvoiceModel.toApprovement3) &&
        Objects.equals(this.approvedStatus3, dkCloudDataModelVendorsInvoiceModel.approvedStatus3) &&
        Objects.equals(this.description, dkCloudDataModelVendorsInvoiceModel.description) &&
        Objects.equals(this.posted, dkCloudDataModelVendorsInvoiceModel.posted) &&
        Objects.equals(this.lines, dkCloudDataModelVendorsInvoiceModel.lines) &&
        Objects.equals(this.dueDateHours, dkCloudDataModelVendorsInvoiceModel.dueDateHours) &&
        Objects.equals(this.dueDateDays, dkCloudDataModelVendorsInvoiceModel.dueDateDays) &&
        Objects.equals(this.isApproved, dkCloudDataModelVendorsInvoiceModel.isApproved) &&
        Objects.equals(this.approvalStatus, dkCloudDataModelVendorsInvoiceModel.approvalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, modified, vendor, vendorName, invoiceNumber, dueDate, invoiceDate, receivedDate, voucher, text, reference, invoiceType, amount, currencyCode, exchange, origin, hasAttachment, dim1, dim2, dim3, approvedBy1, fromApprovement1, toApprovement1, approvedStatus1, approvedBy2, fromApprovement2, toApprovement2, approvedStatus2, approvedBy3, fromApprovement3, toApprovement3, approvedStatus3, description, posted, lines, dueDateHours, dueDateDays, isApproved, approvalStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelVendorsInvoiceModel {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    hasAttachment: ").append(toIndentedString(hasAttachment)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
    sb.append("    approvedBy1: ").append(toIndentedString(approvedBy1)).append("\n");
    sb.append("    fromApprovement1: ").append(toIndentedString(fromApprovement1)).append("\n");
    sb.append("    toApprovement1: ").append(toIndentedString(toApprovement1)).append("\n");
    sb.append("    approvedStatus1: ").append(toIndentedString(approvedStatus1)).append("\n");
    sb.append("    approvedBy2: ").append(toIndentedString(approvedBy2)).append("\n");
    sb.append("    fromApprovement2: ").append(toIndentedString(fromApprovement2)).append("\n");
    sb.append("    toApprovement2: ").append(toIndentedString(toApprovement2)).append("\n");
    sb.append("    approvedStatus2: ").append(toIndentedString(approvedStatus2)).append("\n");
    sb.append("    approvedBy3: ").append(toIndentedString(approvedBy3)).append("\n");
    sb.append("    fromApprovement3: ").append(toIndentedString(fromApprovement3)).append("\n");
    sb.append("    toApprovement3: ").append(toIndentedString(toApprovement3)).append("\n");
    sb.append("    approvedStatus3: ").append(toIndentedString(approvedStatus3)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    posted: ").append(toIndentedString(posted)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    dueDateHours: ").append(toIndentedString(dueDateHours)).append("\n");
    sb.append("    dueDateDays: ").append(toIndentedString(dueDateDays)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
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

