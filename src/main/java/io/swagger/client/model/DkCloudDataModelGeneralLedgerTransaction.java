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
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelGeneralLedgerTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelGeneralLedgerTransaction {
  @SerializedName("Created")
  private OffsetDateTime created = null;

  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("InvoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("Account")
  private String account = null;

  @SerializedName("CreatedBy")
  private String createdBy = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  @SerializedName("DueDate")
  private OffsetDateTime dueDate = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Dim2")
  private String dim2 = null;

  @SerializedName("Dim3")
  private String dim3 = null;

  @SerializedName("JournalDate")
  private OffsetDateTime journalDate = null;

  @SerializedName("Origin")
  private Integer origin = null;

  @SerializedName("Voucher")
  private String voucher = null;

  @SerializedName("JournalType")
  private Integer journalType = null;

  @SerializedName("Code")
  private Integer code = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("Exchange")
  private Double exchange = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("InputAmount")
  private Double inputAmount = null;

  @SerializedName("TaxCode")
  private String taxCode = null;

  @SerializedName("TaxGroup")
  private Integer taxGroup = null;

  @SerializedName("TaxPercent")
  private Double taxPercent = null;

  @SerializedName("HCode")
  private String hcode = null;

  @SerializedName("HType")
  private Integer htype = null;

  @SerializedName("SubAccount")
  private String subAccount = null;

  @SerializedName("IsCredit")
  private Boolean isCredit = null;

  @SerializedName("Krofunumer")
  private String krofunumer = null;

  @SerializedName("PeriodId")
  private Integer periodId = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("NumberOfQuantity")
  private Double numberOfQuantity = null;

  @SerializedName("QuantityUnitCode")
  private String quantityUnitCode = null;

  @SerializedName("PercentageOfVATUsed")
  private Double percentageOfVATUsed = null;

  @SerializedName("VATReportID")
  private Integer vaTReportID = null;

  @SerializedName("VATReportGroup")
  private String vaTReportGroup = null;

  public DkCloudDataModelGeneralLedgerTransaction created(OffsetDateTime created) {
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

  public DkCloudDataModelGeneralLedgerTransaction ID(Integer ID) {
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

  public DkCloudDataModelGeneralLedgerTransaction invoiceNumber(String invoiceNumber) {
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

  public DkCloudDataModelGeneralLedgerTransaction account(String account) {
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

  public DkCloudDataModelGeneralLedgerTransaction createdBy(String createdBy) {
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

  public DkCloudDataModelGeneralLedgerTransaction modified(OffsetDateTime modified) {
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

  public DkCloudDataModelGeneralLedgerTransaction dueDate(OffsetDateTime dueDate) {
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

  public DkCloudDataModelGeneralLedgerTransaction text(String text) {
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

  public DkCloudDataModelGeneralLedgerTransaction reference(String reference) {
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

  public DkCloudDataModelGeneralLedgerTransaction dim1(String dim1) {
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

  public DkCloudDataModelGeneralLedgerTransaction dim2(String dim2) {
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

  public DkCloudDataModelGeneralLedgerTransaction dim3(String dim3) {
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

  public DkCloudDataModelGeneralLedgerTransaction journalDate(OffsetDateTime journalDate) {
    this.journalDate = journalDate;
    return this;
  }

   /**
   * Get journalDate
   * @return journalDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getJournalDate() {
    return journalDate;
  }

  public void setJournalDate(OffsetDateTime journalDate) {
    this.journalDate = journalDate;
  }

  public DkCloudDataModelGeneralLedgerTransaction origin(Integer origin) {
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

  public DkCloudDataModelGeneralLedgerTransaction voucher(String voucher) {
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

  public DkCloudDataModelGeneralLedgerTransaction journalType(Integer journalType) {
    this.journalType = journalType;
    return this;
  }

   /**
   * Get journalType
   * @return journalType
  **/
  @ApiModelProperty(value = "")
  public Integer getJournalType() {
    return journalType;
  }

  public void setJournalType(Integer journalType) {
    this.journalType = journalType;
  }

  public DkCloudDataModelGeneralLedgerTransaction code(Integer code) {
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

  public DkCloudDataModelGeneralLedgerTransaction currency(String currency) {
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

  public DkCloudDataModelGeneralLedgerTransaction exchange(Double exchange) {
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

  public DkCloudDataModelGeneralLedgerTransaction amount(Double amount) {
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

  public DkCloudDataModelGeneralLedgerTransaction inputAmount(Double inputAmount) {
    this.inputAmount = inputAmount;
    return this;
  }

   /**
   * Get inputAmount
   * @return inputAmount
  **/
  @ApiModelProperty(value = "")
  public Double getInputAmount() {
    return inputAmount;
  }

  public void setInputAmount(Double inputAmount) {
    this.inputAmount = inputAmount;
  }

  public DkCloudDataModelGeneralLedgerTransaction taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Get taxCode
   * @return taxCode
  **/
  @ApiModelProperty(value = "")
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  public DkCloudDataModelGeneralLedgerTransaction taxGroup(Integer taxGroup) {
    this.taxGroup = taxGroup;
    return this;
  }

   /**
   * Get taxGroup
   * @return taxGroup
  **/
  @ApiModelProperty(value = "")
  public Integer getTaxGroup() {
    return taxGroup;
  }

  public void setTaxGroup(Integer taxGroup) {
    this.taxGroup = taxGroup;
  }

  public DkCloudDataModelGeneralLedgerTransaction taxPercent(Double taxPercent) {
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

  public DkCloudDataModelGeneralLedgerTransaction hcode(String hcode) {
    this.hcode = hcode;
    return this;
  }

   /**
   * Get hcode
   * @return hcode
  **/
  @ApiModelProperty(value = "")
  public String getHcode() {
    return hcode;
  }

  public void setHcode(String hcode) {
    this.hcode = hcode;
  }

  public DkCloudDataModelGeneralLedgerTransaction htype(Integer htype) {
    this.htype = htype;
    return this;
  }

   /**
   * Get htype
   * @return htype
  **/
  @ApiModelProperty(value = "")
  public Integer getHtype() {
    return htype;
  }

  public void setHtype(Integer htype) {
    this.htype = htype;
  }

  public DkCloudDataModelGeneralLedgerTransaction subAccount(String subAccount) {
    this.subAccount = subAccount;
    return this;
  }

   /**
   * Get subAccount
   * @return subAccount
  **/
  @ApiModelProperty(value = "")
  public String getSubAccount() {
    return subAccount;
  }

  public void setSubAccount(String subAccount) {
    this.subAccount = subAccount;
  }

  public DkCloudDataModelGeneralLedgerTransaction isCredit(Boolean isCredit) {
    this.isCredit = isCredit;
    return this;
  }

   /**
   * Get isCredit
   * @return isCredit
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCredit() {
    return isCredit;
  }

  public void setIsCredit(Boolean isCredit) {
    this.isCredit = isCredit;
  }

  public DkCloudDataModelGeneralLedgerTransaction krofunumer(String krofunumer) {
    this.krofunumer = krofunumer;
    return this;
  }

   /**
   * Get krofunumer
   * @return krofunumer
  **/
  @ApiModelProperty(value = "")
  public String getKrofunumer() {
    return krofunumer;
  }

  public void setKrofunumer(String krofunumer) {
    this.krofunumer = krofunumer;
  }

  public DkCloudDataModelGeneralLedgerTransaction periodId(Integer periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * Get periodId
   * @return periodId
  **/
  @ApiModelProperty(value = "")
  public Integer getPeriodId() {
    return periodId;
  }

  public void setPeriodId(Integer periodId) {
    this.periodId = periodId;
  }

  public DkCloudDataModelGeneralLedgerTransaction quantity(Double quantity) {
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

  public DkCloudDataModelGeneralLedgerTransaction numberOfQuantity(Double numberOfQuantity) {
    this.numberOfQuantity = numberOfQuantity;
    return this;
  }

   /**
   * Get numberOfQuantity
   * @return numberOfQuantity
  **/
  @ApiModelProperty(value = "")
  public Double getNumberOfQuantity() {
    return numberOfQuantity;
  }

  public void setNumberOfQuantity(Double numberOfQuantity) {
    this.numberOfQuantity = numberOfQuantity;
  }

  public DkCloudDataModelGeneralLedgerTransaction quantityUnitCode(String quantityUnitCode) {
    this.quantityUnitCode = quantityUnitCode;
    return this;
  }

   /**
   * Get quantityUnitCode
   * @return quantityUnitCode
  **/
  @ApiModelProperty(value = "")
  public String getQuantityUnitCode() {
    return quantityUnitCode;
  }

  public void setQuantityUnitCode(String quantityUnitCode) {
    this.quantityUnitCode = quantityUnitCode;
  }

  public DkCloudDataModelGeneralLedgerTransaction percentageOfVATUsed(Double percentageOfVATUsed) {
    this.percentageOfVATUsed = percentageOfVATUsed;
    return this;
  }

   /**
   * Get percentageOfVATUsed
   * @return percentageOfVATUsed
  **/
  @ApiModelProperty(value = "")
  public Double getPercentageOfVATUsed() {
    return percentageOfVATUsed;
  }

  public void setPercentageOfVATUsed(Double percentageOfVATUsed) {
    this.percentageOfVATUsed = percentageOfVATUsed;
  }

  public DkCloudDataModelGeneralLedgerTransaction vaTReportID(Integer vaTReportID) {
    this.vaTReportID = vaTReportID;
    return this;
  }

   /**
   * Get vaTReportID
   * @return vaTReportID
  **/
  @ApiModelProperty(value = "")
  public Integer getVaTReportID() {
    return vaTReportID;
  }

  public void setVaTReportID(Integer vaTReportID) {
    this.vaTReportID = vaTReportID;
  }

  public DkCloudDataModelGeneralLedgerTransaction vaTReportGroup(String vaTReportGroup) {
    this.vaTReportGroup = vaTReportGroup;
    return this;
  }

   /**
   * Get vaTReportGroup
   * @return vaTReportGroup
  **/
  @ApiModelProperty(value = "")
  public String getVaTReportGroup() {
    return vaTReportGroup;
  }

  public void setVaTReportGroup(String vaTReportGroup) {
    this.vaTReportGroup = vaTReportGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelGeneralLedgerTransaction dkCloudDataModelGeneralLedgerTransaction = (DkCloudDataModelGeneralLedgerTransaction) o;
    return Objects.equals(this.created, dkCloudDataModelGeneralLedgerTransaction.created) &&
        Objects.equals(this.ID, dkCloudDataModelGeneralLedgerTransaction.ID) &&
        Objects.equals(this.invoiceNumber, dkCloudDataModelGeneralLedgerTransaction.invoiceNumber) &&
        Objects.equals(this.account, dkCloudDataModelGeneralLedgerTransaction.account) &&
        Objects.equals(this.createdBy, dkCloudDataModelGeneralLedgerTransaction.createdBy) &&
        Objects.equals(this.modified, dkCloudDataModelGeneralLedgerTransaction.modified) &&
        Objects.equals(this.dueDate, dkCloudDataModelGeneralLedgerTransaction.dueDate) &&
        Objects.equals(this.text, dkCloudDataModelGeneralLedgerTransaction.text) &&
        Objects.equals(this.reference, dkCloudDataModelGeneralLedgerTransaction.reference) &&
        Objects.equals(this.dim1, dkCloudDataModelGeneralLedgerTransaction.dim1) &&
        Objects.equals(this.dim2, dkCloudDataModelGeneralLedgerTransaction.dim2) &&
        Objects.equals(this.dim3, dkCloudDataModelGeneralLedgerTransaction.dim3) &&
        Objects.equals(this.journalDate, dkCloudDataModelGeneralLedgerTransaction.journalDate) &&
        Objects.equals(this.origin, dkCloudDataModelGeneralLedgerTransaction.origin) &&
        Objects.equals(this.voucher, dkCloudDataModelGeneralLedgerTransaction.voucher) &&
        Objects.equals(this.journalType, dkCloudDataModelGeneralLedgerTransaction.journalType) &&
        Objects.equals(this.code, dkCloudDataModelGeneralLedgerTransaction.code) &&
        Objects.equals(this.currency, dkCloudDataModelGeneralLedgerTransaction.currency) &&
        Objects.equals(this.exchange, dkCloudDataModelGeneralLedgerTransaction.exchange) &&
        Objects.equals(this.amount, dkCloudDataModelGeneralLedgerTransaction.amount) &&
        Objects.equals(this.inputAmount, dkCloudDataModelGeneralLedgerTransaction.inputAmount) &&
        Objects.equals(this.taxCode, dkCloudDataModelGeneralLedgerTransaction.taxCode) &&
        Objects.equals(this.taxGroup, dkCloudDataModelGeneralLedgerTransaction.taxGroup) &&
        Objects.equals(this.taxPercent, dkCloudDataModelGeneralLedgerTransaction.taxPercent) &&
        Objects.equals(this.hcode, dkCloudDataModelGeneralLedgerTransaction.hcode) &&
        Objects.equals(this.htype, dkCloudDataModelGeneralLedgerTransaction.htype) &&
        Objects.equals(this.subAccount, dkCloudDataModelGeneralLedgerTransaction.subAccount) &&
        Objects.equals(this.isCredit, dkCloudDataModelGeneralLedgerTransaction.isCredit) &&
        Objects.equals(this.krofunumer, dkCloudDataModelGeneralLedgerTransaction.krofunumer) &&
        Objects.equals(this.periodId, dkCloudDataModelGeneralLedgerTransaction.periodId) &&
        Objects.equals(this.quantity, dkCloudDataModelGeneralLedgerTransaction.quantity) &&
        Objects.equals(this.numberOfQuantity, dkCloudDataModelGeneralLedgerTransaction.numberOfQuantity) &&
        Objects.equals(this.quantityUnitCode, dkCloudDataModelGeneralLedgerTransaction.quantityUnitCode) &&
        Objects.equals(this.percentageOfVATUsed, dkCloudDataModelGeneralLedgerTransaction.percentageOfVATUsed) &&
        Objects.equals(this.vaTReportID, dkCloudDataModelGeneralLedgerTransaction.vaTReportID) &&
        Objects.equals(this.vaTReportGroup, dkCloudDataModelGeneralLedgerTransaction.vaTReportGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, ID, invoiceNumber, account, createdBy, modified, dueDate, text, reference, dim1, dim2, dim3, journalDate, origin, voucher, journalType, code, currency, exchange, amount, inputAmount, taxCode, taxGroup, taxPercent, hcode, htype, subAccount, isCredit, krofunumer, periodId, quantity, numberOfQuantity, quantityUnitCode, percentageOfVATUsed, vaTReportID, vaTReportGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelGeneralLedgerTransaction {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
    sb.append("    journalDate: ").append(toIndentedString(journalDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    journalType: ").append(toIndentedString(journalType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    inputAmount: ").append(toIndentedString(inputAmount)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    taxGroup: ").append(toIndentedString(taxGroup)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
    sb.append("    hcode: ").append(toIndentedString(hcode)).append("\n");
    sb.append("    htype: ").append(toIndentedString(htype)).append("\n");
    sb.append("    subAccount: ").append(toIndentedString(subAccount)).append("\n");
    sb.append("    isCredit: ").append(toIndentedString(isCredit)).append("\n");
    sb.append("    krofunumer: ").append(toIndentedString(krofunumer)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    numberOfQuantity: ").append(toIndentedString(numberOfQuantity)).append("\n");
    sb.append("    quantityUnitCode: ").append(toIndentedString(quantityUnitCode)).append("\n");
    sb.append("    percentageOfVATUsed: ").append(toIndentedString(percentageOfVATUsed)).append("\n");
    sb.append("    vaTReportID: ").append(toIndentedString(vaTReportID)).append("\n");
    sb.append("    vaTReportGroup: ").append(toIndentedString(vaTReportGroup)).append("\n");
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

