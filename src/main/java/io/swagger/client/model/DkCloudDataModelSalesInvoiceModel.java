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
import io.swagger.client.model.DkCloudDataModelSalesInvoiceLineModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelSalesInvoiceModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelSalesInvoiceModel {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("Created")
  private OffsetDateTime created = null;

  @SerializedName("CreatedBy")
  private String createdBy = null;

  @SerializedName("CNumber")
  private String cnumber = null;

  @SerializedName("CName")
  private String cname = null;

  @SerializedName("CAddress1")
  private String caddress1 = null;

  @SerializedName("CAddress2")
  private String caddress2 = null;

  @SerializedName("CZipCode")
  private String czipCode = null;

  @SerializedName("CCountryCode")
  private String ccountryCode = null;

  @SerializedName("CSSNumber")
  private String csSNumber = null;

  @SerializedName("CPhone")
  private String cphone = null;

  @SerializedName("CContact")
  private String ccontact = null;

  @SerializedName("RecordID")
  private Integer recordID = null;

  @SerializedName("OrderNumber")
  private Integer orderNumber = null;

  @SerializedName("InvoiceDate")
  private OffsetDateTime invoiceDate = null;

  @SerializedName("DueDate")
  private OffsetDateTime dueDate = null;

  @SerializedName("DiscountPercent")
  private Double discountPercent = null;

  @SerializedName("Discount")
  private Double discount = null;

  @SerializedName("TotalAmount")
  private Double totalAmount = null;

  @SerializedName("TotalAmountWithTax")
  private Double totalAmountWithTax = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("Voucher")
  private String voucher = null;

  @SerializedName("SettledType")
  private Integer settledType = null;

  @SerializedName("SettledAmount")
  private Double settledAmount = null;

  @SerializedName("SalePerson")
  private String salePerson = null;

  @SerializedName("Text1")
  private String text1 = null;

  @SerializedName("Text2")
  private String text2 = null;

  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Dim2")
  private String dim2 = null;

  @SerializedName("Origin")
  private Integer origin = null;

  @SerializedName("PaymentTerm")
  private String paymentTerm = null;

  @SerializedName("ClaimStatus")
  private Integer claimStatus = null;

  @SerializedName("Exchange")
  private Double exchange = null;

  @SerializedName("SalesType")
  private Integer salesType = null;

  @SerializedName("Version")
  private Integer version = null;

  @SerializedName("Project")
  private String project = null;

  @SerializedName("IRNumber")
  private String irNumber = null;

  @SerializedName("IRName")
  private String irName = null;

  @SerializedName("IRAddress1")
  private String irAddress1 = null;

  @SerializedName("IRAddress2")
  private String irAddress2 = null;

  @SerializedName("IRZipCode")
  private String irZipCode = null;

  @SerializedName("IRContact")
  private String irContact = null;

  @SerializedName("ExternalInvoiceNumber")
  private Integer externalInvoiceNumber = null;

  @SerializedName("ClaimNumber")
  private Integer claimNumber = null;

  @SerializedName("ClaimDate")
  private OffsetDateTime claimDate = null;

  @SerializedName("Register")
  private String register = null;

  @SerializedName("PosInvoice")
  private Integer posInvoice = null;

  @SerializedName("JournalId")
  private Integer journalId = null;

  @SerializedName("Lines")
  private List<DkCloudDataModelSalesInvoiceLineModel> lines = null;

  public DkCloudDataModelSalesInvoiceModel number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DkCloudDataModelSalesInvoiceModel created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public DkCloudDataModelSalesInvoiceModel createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public DkCloudDataModelSalesInvoiceModel cnumber(String cnumber) {
    this.cnumber = cnumber;
    return this;
  }

   /**
   * Get cnumber
   * @return cnumber
  **/
  @ApiModelProperty(value = "")
  public String getCnumber() {
    return cnumber;
  }

  public void setCnumber(String cnumber) {
    this.cnumber = cnumber;
  }

  public DkCloudDataModelSalesInvoiceModel cname(String cname) {
    this.cname = cname;
    return this;
  }

   /**
   * Get cname
   * @return cname
  **/
  @ApiModelProperty(value = "")
  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public DkCloudDataModelSalesInvoiceModel caddress1(String caddress1) {
    this.caddress1 = caddress1;
    return this;
  }

   /**
   * Get caddress1
   * @return caddress1
  **/
  @ApiModelProperty(value = "")
  public String getCaddress1() {
    return caddress1;
  }

  public void setCaddress1(String caddress1) {
    this.caddress1 = caddress1;
  }

  public DkCloudDataModelSalesInvoiceModel caddress2(String caddress2) {
    this.caddress2 = caddress2;
    return this;
  }

   /**
   * Get caddress2
   * @return caddress2
  **/
  @ApiModelProperty(value = "")
  public String getCaddress2() {
    return caddress2;
  }

  public void setCaddress2(String caddress2) {
    this.caddress2 = caddress2;
  }

  public DkCloudDataModelSalesInvoiceModel czipCode(String czipCode) {
    this.czipCode = czipCode;
    return this;
  }

   /**
   * Get czipCode
   * @return czipCode
  **/
  @ApiModelProperty(value = "")
  public String getCzipCode() {
    return czipCode;
  }

  public void setCzipCode(String czipCode) {
    this.czipCode = czipCode;
  }

  public DkCloudDataModelSalesInvoiceModel ccountryCode(String ccountryCode) {
    this.ccountryCode = ccountryCode;
    return this;
  }

   /**
   * Get ccountryCode
   * @return ccountryCode
  **/
  @ApiModelProperty(value = "")
  public String getCcountryCode() {
    return ccountryCode;
  }

  public void setCcountryCode(String ccountryCode) {
    this.ccountryCode = ccountryCode;
  }

  public DkCloudDataModelSalesInvoiceModel csSNumber(String csSNumber) {
    this.csSNumber = csSNumber;
    return this;
  }

   /**
   * Get csSNumber
   * @return csSNumber
  **/
  @ApiModelProperty(value = "")
  public String getCsSNumber() {
    return csSNumber;
  }

  public void setCsSNumber(String csSNumber) {
    this.csSNumber = csSNumber;
  }

  public DkCloudDataModelSalesInvoiceModel cphone(String cphone) {
    this.cphone = cphone;
    return this;
  }

   /**
   * Get cphone
   * @return cphone
  **/
  @ApiModelProperty(value = "")
  public String getCphone() {
    return cphone;
  }

  public void setCphone(String cphone) {
    this.cphone = cphone;
  }

  public DkCloudDataModelSalesInvoiceModel ccontact(String ccontact) {
    this.ccontact = ccontact;
    return this;
  }

   /**
   * Get ccontact
   * @return ccontact
  **/
  @ApiModelProperty(value = "")
  public String getCcontact() {
    return ccontact;
  }

  public void setCcontact(String ccontact) {
    this.ccontact = ccontact;
  }

  public DkCloudDataModelSalesInvoiceModel recordID(Integer recordID) {
    this.recordID = recordID;
    return this;
  }

   /**
   * Get recordID
   * @return recordID
  **/
  @ApiModelProperty(value = "")
  public Integer getRecordID() {
    return recordID;
  }

  public void setRecordID(Integer recordID) {
    this.recordID = recordID;
  }

  public DkCloudDataModelSalesInvoiceModel orderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }

  public DkCloudDataModelSalesInvoiceModel invoiceDate(OffsetDateTime invoiceDate) {
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

  public DkCloudDataModelSalesInvoiceModel dueDate(OffsetDateTime dueDate) {
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

  public DkCloudDataModelSalesInvoiceModel discountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Get discountPercent
   * @return discountPercent
  **/
  @ApiModelProperty(value = "")
  public Double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
  }

  public DkCloudDataModelSalesInvoiceModel discount(Double discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public DkCloudDataModelSalesInvoiceModel totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public DkCloudDataModelSalesInvoiceModel totalAmountWithTax(Double totalAmountWithTax) {
    this.totalAmountWithTax = totalAmountWithTax;
    return this;
  }

   /**
   * Get totalAmountWithTax
   * @return totalAmountWithTax
  **/
  @ApiModelProperty(value = "")
  public Double getTotalAmountWithTax() {
    return totalAmountWithTax;
  }

  public void setTotalAmountWithTax(Double totalAmountWithTax) {
    this.totalAmountWithTax = totalAmountWithTax;
  }

  public DkCloudDataModelSalesInvoiceModel currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DkCloudDataModelSalesInvoiceModel reference(String reference) {
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

  public DkCloudDataModelSalesInvoiceModel voucher(String voucher) {
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

  public DkCloudDataModelSalesInvoiceModel settledType(Integer settledType) {
    this.settledType = settledType;
    return this;
  }

   /**
   * Get settledType
   * @return settledType
  **/
  @ApiModelProperty(value = "")
  public Integer getSettledType() {
    return settledType;
  }

  public void setSettledType(Integer settledType) {
    this.settledType = settledType;
  }

  public DkCloudDataModelSalesInvoiceModel settledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
    return this;
  }

   /**
   * Get settledAmount
   * @return settledAmount
  **/
  @ApiModelProperty(value = "")
  public Double getSettledAmount() {
    return settledAmount;
  }

  public void setSettledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
  }

  public DkCloudDataModelSalesInvoiceModel salePerson(String salePerson) {
    this.salePerson = salePerson;
    return this;
  }

   /**
   * Get salePerson
   * @return salePerson
  **/
  @ApiModelProperty(value = "")
  public String getSalePerson() {
    return salePerson;
  }

  public void setSalePerson(String salePerson) {
    this.salePerson = salePerson;
  }

  public DkCloudDataModelSalesInvoiceModel text1(String text1) {
    this.text1 = text1;
    return this;
  }

   /**
   * Get text1
   * @return text1
  **/
  @ApiModelProperty(value = "")
  public String getText1() {
    return text1;
  }

  public void setText1(String text1) {
    this.text1 = text1;
  }

  public DkCloudDataModelSalesInvoiceModel text2(String text2) {
    this.text2 = text2;
    return this;
  }

   /**
   * Get text2
   * @return text2
  **/
  @ApiModelProperty(value = "")
  public String getText2() {
    return text2;
  }

  public void setText2(String text2) {
    this.text2 = text2;
  }

  public DkCloudDataModelSalesInvoiceModel dim1(String dim1) {
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

  public DkCloudDataModelSalesInvoiceModel dim2(String dim2) {
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

  public DkCloudDataModelSalesInvoiceModel origin(Integer origin) {
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

  public DkCloudDataModelSalesInvoiceModel paymentTerm(String paymentTerm) {
    this.paymentTerm = paymentTerm;
    return this;
  }

   /**
   * Get paymentTerm
   * @return paymentTerm
  **/
  @ApiModelProperty(value = "")
  public String getPaymentTerm() {
    return paymentTerm;
  }

  public void setPaymentTerm(String paymentTerm) {
    this.paymentTerm = paymentTerm;
  }

  public DkCloudDataModelSalesInvoiceModel claimStatus(Integer claimStatus) {
    this.claimStatus = claimStatus;
    return this;
  }

   /**
   * Get claimStatus
   * @return claimStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getClaimStatus() {
    return claimStatus;
  }

  public void setClaimStatus(Integer claimStatus) {
    this.claimStatus = claimStatus;
  }

  public DkCloudDataModelSalesInvoiceModel exchange(Double exchange) {
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

  public DkCloudDataModelSalesInvoiceModel salesType(Integer salesType) {
    this.salesType = salesType;
    return this;
  }

   /**
   * Get salesType
   * @return salesType
  **/
  @ApiModelProperty(value = "")
  public Integer getSalesType() {
    return salesType;
  }

  public void setSalesType(Integer salesType) {
    this.salesType = salesType;
  }

  public DkCloudDataModelSalesInvoiceModel version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public DkCloudDataModelSalesInvoiceModel project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public DkCloudDataModelSalesInvoiceModel irNumber(String irNumber) {
    this.irNumber = irNumber;
    return this;
  }

   /**
   * Get irNumber
   * @return irNumber
  **/
  @ApiModelProperty(value = "")
  public String getIrNumber() {
    return irNumber;
  }

  public void setIrNumber(String irNumber) {
    this.irNumber = irNumber;
  }

  public DkCloudDataModelSalesInvoiceModel irName(String irName) {
    this.irName = irName;
    return this;
  }

   /**
   * Get irName
   * @return irName
  **/
  @ApiModelProperty(value = "")
  public String getIrName() {
    return irName;
  }

  public void setIrName(String irName) {
    this.irName = irName;
  }

  public DkCloudDataModelSalesInvoiceModel irAddress1(String irAddress1) {
    this.irAddress1 = irAddress1;
    return this;
  }

   /**
   * Get irAddress1
   * @return irAddress1
  **/
  @ApiModelProperty(value = "")
  public String getIrAddress1() {
    return irAddress1;
  }

  public void setIrAddress1(String irAddress1) {
    this.irAddress1 = irAddress1;
  }

  public DkCloudDataModelSalesInvoiceModel irAddress2(String irAddress2) {
    this.irAddress2 = irAddress2;
    return this;
  }

   /**
   * Get irAddress2
   * @return irAddress2
  **/
  @ApiModelProperty(value = "")
  public String getIrAddress2() {
    return irAddress2;
  }

  public void setIrAddress2(String irAddress2) {
    this.irAddress2 = irAddress2;
  }

  public DkCloudDataModelSalesInvoiceModel irZipCode(String irZipCode) {
    this.irZipCode = irZipCode;
    return this;
  }

   /**
   * Get irZipCode
   * @return irZipCode
  **/
  @ApiModelProperty(value = "")
  public String getIrZipCode() {
    return irZipCode;
  }

  public void setIrZipCode(String irZipCode) {
    this.irZipCode = irZipCode;
  }

  public DkCloudDataModelSalesInvoiceModel irContact(String irContact) {
    this.irContact = irContact;
    return this;
  }

   /**
   * Get irContact
   * @return irContact
  **/
  @ApiModelProperty(value = "")
  public String getIrContact() {
    return irContact;
  }

  public void setIrContact(String irContact) {
    this.irContact = irContact;
  }

  public DkCloudDataModelSalesInvoiceModel externalInvoiceNumber(Integer externalInvoiceNumber) {
    this.externalInvoiceNumber = externalInvoiceNumber;
    return this;
  }

   /**
   * Get externalInvoiceNumber
   * @return externalInvoiceNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getExternalInvoiceNumber() {
    return externalInvoiceNumber;
  }

  public void setExternalInvoiceNumber(Integer externalInvoiceNumber) {
    this.externalInvoiceNumber = externalInvoiceNumber;
  }

  public DkCloudDataModelSalesInvoiceModel claimNumber(Integer claimNumber) {
    this.claimNumber = claimNumber;
    return this;
  }

   /**
   * Get claimNumber
   * @return claimNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getClaimNumber() {
    return claimNumber;
  }

  public void setClaimNumber(Integer claimNumber) {
    this.claimNumber = claimNumber;
  }

  public DkCloudDataModelSalesInvoiceModel claimDate(OffsetDateTime claimDate) {
    this.claimDate = claimDate;
    return this;
  }

   /**
   * Get claimDate
   * @return claimDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClaimDate() {
    return claimDate;
  }

  public void setClaimDate(OffsetDateTime claimDate) {
    this.claimDate = claimDate;
  }

  public DkCloudDataModelSalesInvoiceModel register(String register) {
    this.register = register;
    return this;
  }

   /**
   * Get register
   * @return register
  **/
  @ApiModelProperty(value = "")
  public String getRegister() {
    return register;
  }

  public void setRegister(String register) {
    this.register = register;
  }

  public DkCloudDataModelSalesInvoiceModel posInvoice(Integer posInvoice) {
    this.posInvoice = posInvoice;
    return this;
  }

   /**
   * Get posInvoice
   * @return posInvoice
  **/
  @ApiModelProperty(value = "")
  public Integer getPosInvoice() {
    return posInvoice;
  }

  public void setPosInvoice(Integer posInvoice) {
    this.posInvoice = posInvoice;
  }

  public DkCloudDataModelSalesInvoiceModel journalId(Integer journalId) {
    this.journalId = journalId;
    return this;
  }

   /**
   * Get journalId
   * @return journalId
  **/
  @ApiModelProperty(value = "")
  public Integer getJournalId() {
    return journalId;
  }

  public void setJournalId(Integer journalId) {
    this.journalId = journalId;
  }

  public DkCloudDataModelSalesInvoiceModel lines(List<DkCloudDataModelSalesInvoiceLineModel> lines) {
    this.lines = lines;
    return this;
  }

  public DkCloudDataModelSalesInvoiceModel addLinesItem(DkCloudDataModelSalesInvoiceLineModel linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<DkCloudDataModelSalesInvoiceLineModel>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelSalesInvoiceLineModel> getLines() {
    return lines;
  }

  public void setLines(List<DkCloudDataModelSalesInvoiceLineModel> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelSalesInvoiceModel dkCloudDataModelSalesInvoiceModel = (DkCloudDataModelSalesInvoiceModel) o;
    return Objects.equals(this.number, dkCloudDataModelSalesInvoiceModel.number) &&
        Objects.equals(this.created, dkCloudDataModelSalesInvoiceModel.created) &&
        Objects.equals(this.createdBy, dkCloudDataModelSalesInvoiceModel.createdBy) &&
        Objects.equals(this.cnumber, dkCloudDataModelSalesInvoiceModel.cnumber) &&
        Objects.equals(this.cname, dkCloudDataModelSalesInvoiceModel.cname) &&
        Objects.equals(this.caddress1, dkCloudDataModelSalesInvoiceModel.caddress1) &&
        Objects.equals(this.caddress2, dkCloudDataModelSalesInvoiceModel.caddress2) &&
        Objects.equals(this.czipCode, dkCloudDataModelSalesInvoiceModel.czipCode) &&
        Objects.equals(this.ccountryCode, dkCloudDataModelSalesInvoiceModel.ccountryCode) &&
        Objects.equals(this.csSNumber, dkCloudDataModelSalesInvoiceModel.csSNumber) &&
        Objects.equals(this.cphone, dkCloudDataModelSalesInvoiceModel.cphone) &&
        Objects.equals(this.ccontact, dkCloudDataModelSalesInvoiceModel.ccontact) &&
        Objects.equals(this.recordID, dkCloudDataModelSalesInvoiceModel.recordID) &&
        Objects.equals(this.orderNumber, dkCloudDataModelSalesInvoiceModel.orderNumber) &&
        Objects.equals(this.invoiceDate, dkCloudDataModelSalesInvoiceModel.invoiceDate) &&
        Objects.equals(this.dueDate, dkCloudDataModelSalesInvoiceModel.dueDate) &&
        Objects.equals(this.discountPercent, dkCloudDataModelSalesInvoiceModel.discountPercent) &&
        Objects.equals(this.discount, dkCloudDataModelSalesInvoiceModel.discount) &&
        Objects.equals(this.totalAmount, dkCloudDataModelSalesInvoiceModel.totalAmount) &&
        Objects.equals(this.totalAmountWithTax, dkCloudDataModelSalesInvoiceModel.totalAmountWithTax) &&
        Objects.equals(this.currency, dkCloudDataModelSalesInvoiceModel.currency) &&
        Objects.equals(this.reference, dkCloudDataModelSalesInvoiceModel.reference) &&
        Objects.equals(this.voucher, dkCloudDataModelSalesInvoiceModel.voucher) &&
        Objects.equals(this.settledType, dkCloudDataModelSalesInvoiceModel.settledType) &&
        Objects.equals(this.settledAmount, dkCloudDataModelSalesInvoiceModel.settledAmount) &&
        Objects.equals(this.salePerson, dkCloudDataModelSalesInvoiceModel.salePerson) &&
        Objects.equals(this.text1, dkCloudDataModelSalesInvoiceModel.text1) &&
        Objects.equals(this.text2, dkCloudDataModelSalesInvoiceModel.text2) &&
        Objects.equals(this.dim1, dkCloudDataModelSalesInvoiceModel.dim1) &&
        Objects.equals(this.dim2, dkCloudDataModelSalesInvoiceModel.dim2) &&
        Objects.equals(this.origin, dkCloudDataModelSalesInvoiceModel.origin) &&
        Objects.equals(this.paymentTerm, dkCloudDataModelSalesInvoiceModel.paymentTerm) &&
        Objects.equals(this.claimStatus, dkCloudDataModelSalesInvoiceModel.claimStatus) &&
        Objects.equals(this.exchange, dkCloudDataModelSalesInvoiceModel.exchange) &&
        Objects.equals(this.salesType, dkCloudDataModelSalesInvoiceModel.salesType) &&
        Objects.equals(this.version, dkCloudDataModelSalesInvoiceModel.version) &&
        Objects.equals(this.project, dkCloudDataModelSalesInvoiceModel.project) &&
        Objects.equals(this.irNumber, dkCloudDataModelSalesInvoiceModel.irNumber) &&
        Objects.equals(this.irName, dkCloudDataModelSalesInvoiceModel.irName) &&
        Objects.equals(this.irAddress1, dkCloudDataModelSalesInvoiceModel.irAddress1) &&
        Objects.equals(this.irAddress2, dkCloudDataModelSalesInvoiceModel.irAddress2) &&
        Objects.equals(this.irZipCode, dkCloudDataModelSalesInvoiceModel.irZipCode) &&
        Objects.equals(this.irContact, dkCloudDataModelSalesInvoiceModel.irContact) &&
        Objects.equals(this.externalInvoiceNumber, dkCloudDataModelSalesInvoiceModel.externalInvoiceNumber) &&
        Objects.equals(this.claimNumber, dkCloudDataModelSalesInvoiceModel.claimNumber) &&
        Objects.equals(this.claimDate, dkCloudDataModelSalesInvoiceModel.claimDate) &&
        Objects.equals(this.register, dkCloudDataModelSalesInvoiceModel.register) &&
        Objects.equals(this.posInvoice, dkCloudDataModelSalesInvoiceModel.posInvoice) &&
        Objects.equals(this.journalId, dkCloudDataModelSalesInvoiceModel.journalId) &&
        Objects.equals(this.lines, dkCloudDataModelSalesInvoiceModel.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, created, createdBy, cnumber, cname, caddress1, caddress2, czipCode, ccountryCode, csSNumber, cphone, ccontact, recordID, orderNumber, invoiceDate, dueDate, discountPercent, discount, totalAmount, totalAmountWithTax, currency, reference, voucher, settledType, settledAmount, salePerson, text1, text2, dim1, dim2, origin, paymentTerm, claimStatus, exchange, salesType, version, project, irNumber, irName, irAddress1, irAddress2, irZipCode, irContact, externalInvoiceNumber, claimNumber, claimDate, register, posInvoice, journalId, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelSalesInvoiceModel {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    cnumber: ").append(toIndentedString(cnumber)).append("\n");
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
    sb.append("    caddress1: ").append(toIndentedString(caddress1)).append("\n");
    sb.append("    caddress2: ").append(toIndentedString(caddress2)).append("\n");
    sb.append("    czipCode: ").append(toIndentedString(czipCode)).append("\n");
    sb.append("    ccountryCode: ").append(toIndentedString(ccountryCode)).append("\n");
    sb.append("    csSNumber: ").append(toIndentedString(csSNumber)).append("\n");
    sb.append("    cphone: ").append(toIndentedString(cphone)).append("\n");
    sb.append("    ccontact: ").append(toIndentedString(ccontact)).append("\n");
    sb.append("    recordID: ").append(toIndentedString(recordID)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalAmountWithTax: ").append(toIndentedString(totalAmountWithTax)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    settledType: ").append(toIndentedString(settledType)).append("\n");
    sb.append("    settledAmount: ").append(toIndentedString(settledAmount)).append("\n");
    sb.append("    salePerson: ").append(toIndentedString(salePerson)).append("\n");
    sb.append("    text1: ").append(toIndentedString(text1)).append("\n");
    sb.append("    text2: ").append(toIndentedString(text2)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    paymentTerm: ").append(toIndentedString(paymentTerm)).append("\n");
    sb.append("    claimStatus: ").append(toIndentedString(claimStatus)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    salesType: ").append(toIndentedString(salesType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    irNumber: ").append(toIndentedString(irNumber)).append("\n");
    sb.append("    irName: ").append(toIndentedString(irName)).append("\n");
    sb.append("    irAddress1: ").append(toIndentedString(irAddress1)).append("\n");
    sb.append("    irAddress2: ").append(toIndentedString(irAddress2)).append("\n");
    sb.append("    irZipCode: ").append(toIndentedString(irZipCode)).append("\n");
    sb.append("    irContact: ").append(toIndentedString(irContact)).append("\n");
    sb.append("    externalInvoiceNumber: ").append(toIndentedString(externalInvoiceNumber)).append("\n");
    sb.append("    claimNumber: ").append(toIndentedString(claimNumber)).append("\n");
    sb.append("    claimDate: ").append(toIndentedString(claimDate)).append("\n");
    sb.append("    register: ").append(toIndentedString(register)).append("\n");
    sb.append("    posInvoice: ").append(toIndentedString(posInvoice)).append("\n");
    sb.append("    journalId: ").append(toIndentedString(journalId)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

