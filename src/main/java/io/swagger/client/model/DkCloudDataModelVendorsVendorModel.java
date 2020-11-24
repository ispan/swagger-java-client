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
import io.swagger.client.model.DkCloudDataModelGeneralAttachmentModel;
import io.swagger.client.model.DkCloudDataModelGeneralBankAccountModel;
import io.swagger.client.model.DkCloudDataModelVendorsVendorApprove;
import io.swagger.client.model.DkCloudDataModelVendorsVendorDimmentions;
import io.swagger.client.model.DkCloudDataModelVendorsVendorExpenses;
import io.swagger.client.model.DkCloudDataModelVendorsVendorMemoModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelVendorsVendorModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelVendorsVendorModel {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("RecordID")
  private Integer recordID = null;

  @SerializedName("Created")
  private OffsetDateTime created = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  @SerializedName("SSNumber")
  private String ssNumber = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Address1")
  private String address1 = null;

  @SerializedName("Address2")
  private String address2 = null;

  @SerializedName("Address3")
  private String address3 = null;

  @SerializedName("Address4")
  private String address4 = null;

  @SerializedName("Group")
  private String group = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("Blocked")
  private Boolean blocked = null;

  @SerializedName("Approve")
  private DkCloudDataModelVendorsVendorApprove approve = null;

  @SerializedName("CreditMax")
  private Double creditMax = null;

  @SerializedName("CreditLimit")
  private Double creditLimit = null;

  @SerializedName("BankInfo")
  private DkCloudDataModelGeneralBankAccountModel bankInfo = null;

  @SerializedName("HandleBankInfo")
  private DkCloudDataModelGeneralBankAccountModel handleBankInfo = null;

  @SerializedName("ZipCode")
  private String zipCode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("PhoneLocal")
  private String phoneLocal = null;

  @SerializedName("PhoneMobile")
  private String phoneMobile = null;

  @SerializedName("Fax")
  private String fax = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("CountyCode")
  private String countyCode = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("Discount")
  private Double discount = null;

  @SerializedName("PaymentMode")
  private String paymentMode = null;

  @SerializedName("PaymentTerm")
  private String paymentTerm = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("CurrencyFixed")
  private Boolean currencyFixed = null;

  @SerializedName("UseCurrency")
  private Boolean useCurrency = null;

  @SerializedName("NoVat")
  private Boolean noVat = null;

  @SerializedName("VATNumber")
  private String vaTNumber = null;

  @SerializedName("DisableTax")
  private Boolean disableTax = null;

  @SerializedName("LedgerCode")
  private String ledgerCode = null;

  @SerializedName("Balance")
  private Double balance = null;

  @SerializedName("Dimmentions")
  private DkCloudDataModelVendorsVendorDimmentions dimmentions = null;

  @SerializedName("Expenses")
  private DkCloudDataModelVendorsVendorExpenses expenses = null;

  @SerializedName("Attachments")
  private List<DkCloudDataModelGeneralAttachmentModel> attachments = null;

  @SerializedName("Memos")
  private List<DkCloudDataModelVendorsVendorMemoModel> memos = null;

  public DkCloudDataModelVendorsVendorModel number(String number) {
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

  public DkCloudDataModelVendorsVendorModel recordID(Integer recordID) {
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

  public DkCloudDataModelVendorsVendorModel created(OffsetDateTime created) {
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

  public DkCloudDataModelVendorsVendorModel modified(OffsetDateTime modified) {
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

  public DkCloudDataModelVendorsVendorModel ssNumber(String ssNumber) {
    this.ssNumber = ssNumber;
    return this;
  }

   /**
   * Get ssNumber
   * @return ssNumber
  **/
  @ApiModelProperty(value = "")
  public String getSsNumber() {
    return ssNumber;
  }

  public void setSsNumber(String ssNumber) {
    this.ssNumber = ssNumber;
  }

  public DkCloudDataModelVendorsVendorModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DkCloudDataModelVendorsVendorModel address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public DkCloudDataModelVendorsVendorModel address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public DkCloudDataModelVendorsVendorModel address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Get address3
   * @return address3
  **/
  @ApiModelProperty(value = "")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public DkCloudDataModelVendorsVendorModel address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * Get address4
   * @return address4
  **/
  @ApiModelProperty(value = "")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public DkCloudDataModelVendorsVendorModel group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public DkCloudDataModelVendorsVendorModel tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public DkCloudDataModelVendorsVendorModel blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public DkCloudDataModelVendorsVendorModel approve(DkCloudDataModelVendorsVendorApprove approve) {
    this.approve = approve;
    return this;
  }

   /**
   * Get approve
   * @return approve
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelVendorsVendorApprove getApprove() {
    return approve;
  }

  public void setApprove(DkCloudDataModelVendorsVendorApprove approve) {
    this.approve = approve;
  }

  public DkCloudDataModelVendorsVendorModel creditMax(Double creditMax) {
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

  public DkCloudDataModelVendorsVendorModel creditLimit(Double creditLimit) {
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

  public DkCloudDataModelVendorsVendorModel bankInfo(DkCloudDataModelGeneralBankAccountModel bankInfo) {
    this.bankInfo = bankInfo;
    return this;
  }

   /**
   * Get bankInfo
   * @return bankInfo
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelGeneralBankAccountModel getBankInfo() {
    return bankInfo;
  }

  public void setBankInfo(DkCloudDataModelGeneralBankAccountModel bankInfo) {
    this.bankInfo = bankInfo;
  }

  public DkCloudDataModelVendorsVendorModel handleBankInfo(DkCloudDataModelGeneralBankAccountModel handleBankInfo) {
    this.handleBankInfo = handleBankInfo;
    return this;
  }

   /**
   * Get handleBankInfo
   * @return handleBankInfo
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelGeneralBankAccountModel getHandleBankInfo() {
    return handleBankInfo;
  }

  public void setHandleBankInfo(DkCloudDataModelGeneralBankAccountModel handleBankInfo) {
    this.handleBankInfo = handleBankInfo;
  }

  public DkCloudDataModelVendorsVendorModel zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public DkCloudDataModelVendorsVendorModel city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public DkCloudDataModelVendorsVendorModel phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public DkCloudDataModelVendorsVendorModel phoneLocal(String phoneLocal) {
    this.phoneLocal = phoneLocal;
    return this;
  }

   /**
   * Get phoneLocal
   * @return phoneLocal
  **/
  @ApiModelProperty(value = "")
  public String getPhoneLocal() {
    return phoneLocal;
  }

  public void setPhoneLocal(String phoneLocal) {
    this.phoneLocal = phoneLocal;
  }

  public DkCloudDataModelVendorsVendorModel phoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
    return this;
  }

   /**
   * Get phoneMobile
   * @return phoneMobile
  **/
  @ApiModelProperty(value = "")
  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }

  public DkCloudDataModelVendorsVendorModel fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public DkCloudDataModelVendorsVendorModel countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public DkCloudDataModelVendorsVendorModel countyCode(String countyCode) {
    this.countyCode = countyCode;
    return this;
  }

   /**
   * Get countyCode
   * @return countyCode
  **/
  @ApiModelProperty(value = "")
  public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode;
  }

  public DkCloudDataModelVendorsVendorModel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DkCloudDataModelVendorsVendorModel discount(Double discount) {
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

  public DkCloudDataModelVendorsVendorModel paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

   /**
   * Get paymentMode
   * @return paymentMode
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }

  public DkCloudDataModelVendorsVendorModel paymentTerm(String paymentTerm) {
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

  public DkCloudDataModelVendorsVendorModel currencyCode(String currencyCode) {
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

  public DkCloudDataModelVendorsVendorModel currencyFixed(Boolean currencyFixed) {
    this.currencyFixed = currencyFixed;
    return this;
  }

   /**
   * Get currencyFixed
   * @return currencyFixed
  **/
  @ApiModelProperty(value = "")
  public Boolean isCurrencyFixed() {
    return currencyFixed;
  }

  public void setCurrencyFixed(Boolean currencyFixed) {
    this.currencyFixed = currencyFixed;
  }

  public DkCloudDataModelVendorsVendorModel useCurrency(Boolean useCurrency) {
    this.useCurrency = useCurrency;
    return this;
  }

   /**
   * Get useCurrency
   * @return useCurrency
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseCurrency() {
    return useCurrency;
  }

  public void setUseCurrency(Boolean useCurrency) {
    this.useCurrency = useCurrency;
  }

  public DkCloudDataModelVendorsVendorModel noVat(Boolean noVat) {
    this.noVat = noVat;
    return this;
  }

   /**
   * Get noVat
   * @return noVat
  **/
  @ApiModelProperty(value = "")
  public Boolean isNoVat() {
    return noVat;
  }

  public void setNoVat(Boolean noVat) {
    this.noVat = noVat;
  }

  public DkCloudDataModelVendorsVendorModel vaTNumber(String vaTNumber) {
    this.vaTNumber = vaTNumber;
    return this;
  }

   /**
   * Get vaTNumber
   * @return vaTNumber
  **/
  @ApiModelProperty(value = "")
  public String getVaTNumber() {
    return vaTNumber;
  }

  public void setVaTNumber(String vaTNumber) {
    this.vaTNumber = vaTNumber;
  }

  public DkCloudDataModelVendorsVendorModel disableTax(Boolean disableTax) {
    this.disableTax = disableTax;
    return this;
  }

   /**
   * Get disableTax
   * @return disableTax
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisableTax() {
    return disableTax;
  }

  public void setDisableTax(Boolean disableTax) {
    this.disableTax = disableTax;
  }

  public DkCloudDataModelVendorsVendorModel ledgerCode(String ledgerCode) {
    this.ledgerCode = ledgerCode;
    return this;
  }

   /**
   * Get ledgerCode
   * @return ledgerCode
  **/
  @ApiModelProperty(value = "")
  public String getLedgerCode() {
    return ledgerCode;
  }

  public void setLedgerCode(String ledgerCode) {
    this.ledgerCode = ledgerCode;
  }

  public DkCloudDataModelVendorsVendorModel balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public DkCloudDataModelVendorsVendorModel dimmentions(DkCloudDataModelVendorsVendorDimmentions dimmentions) {
    this.dimmentions = dimmentions;
    return this;
  }

   /**
   * Get dimmentions
   * @return dimmentions
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelVendorsVendorDimmentions getDimmentions() {
    return dimmentions;
  }

  public void setDimmentions(DkCloudDataModelVendorsVendorDimmentions dimmentions) {
    this.dimmentions = dimmentions;
  }

  public DkCloudDataModelVendorsVendorModel expenses(DkCloudDataModelVendorsVendorExpenses expenses) {
    this.expenses = expenses;
    return this;
  }

   /**
   * Get expenses
   * @return expenses
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelVendorsVendorExpenses getExpenses() {
    return expenses;
  }

  public void setExpenses(DkCloudDataModelVendorsVendorExpenses expenses) {
    this.expenses = expenses;
  }

  public DkCloudDataModelVendorsVendorModel attachments(List<DkCloudDataModelGeneralAttachmentModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public DkCloudDataModelVendorsVendorModel addAttachmentsItem(DkCloudDataModelGeneralAttachmentModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<DkCloudDataModelGeneralAttachmentModel>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelGeneralAttachmentModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<DkCloudDataModelGeneralAttachmentModel> attachments) {
    this.attachments = attachments;
  }

  public DkCloudDataModelVendorsVendorModel memos(List<DkCloudDataModelVendorsVendorMemoModel> memos) {
    this.memos = memos;
    return this;
  }

  public DkCloudDataModelVendorsVendorModel addMemosItem(DkCloudDataModelVendorsVendorMemoModel memosItem) {
    if (this.memos == null) {
      this.memos = new ArrayList<DkCloudDataModelVendorsVendorMemoModel>();
    }
    this.memos.add(memosItem);
    return this;
  }

   /**
   * Get memos
   * @return memos
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelVendorsVendorMemoModel> getMemos() {
    return memos;
  }

  public void setMemos(List<DkCloudDataModelVendorsVendorMemoModel> memos) {
    this.memos = memos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelVendorsVendorModel dkCloudDataModelVendorsVendorModel = (DkCloudDataModelVendorsVendorModel) o;
    return Objects.equals(this.number, dkCloudDataModelVendorsVendorModel.number) &&
        Objects.equals(this.recordID, dkCloudDataModelVendorsVendorModel.recordID) &&
        Objects.equals(this.created, dkCloudDataModelVendorsVendorModel.created) &&
        Objects.equals(this.modified, dkCloudDataModelVendorsVendorModel.modified) &&
        Objects.equals(this.ssNumber, dkCloudDataModelVendorsVendorModel.ssNumber) &&
        Objects.equals(this.name, dkCloudDataModelVendorsVendorModel.name) &&
        Objects.equals(this.address1, dkCloudDataModelVendorsVendorModel.address1) &&
        Objects.equals(this.address2, dkCloudDataModelVendorsVendorModel.address2) &&
        Objects.equals(this.address3, dkCloudDataModelVendorsVendorModel.address3) &&
        Objects.equals(this.address4, dkCloudDataModelVendorsVendorModel.address4) &&
        Objects.equals(this.group, dkCloudDataModelVendorsVendorModel.group) &&
        Objects.equals(this.tag, dkCloudDataModelVendorsVendorModel.tag) &&
        Objects.equals(this.blocked, dkCloudDataModelVendorsVendorModel.blocked) &&
        Objects.equals(this.approve, dkCloudDataModelVendorsVendorModel.approve) &&
        Objects.equals(this.creditMax, dkCloudDataModelVendorsVendorModel.creditMax) &&
        Objects.equals(this.creditLimit, dkCloudDataModelVendorsVendorModel.creditLimit) &&
        Objects.equals(this.bankInfo, dkCloudDataModelVendorsVendorModel.bankInfo) &&
        Objects.equals(this.handleBankInfo, dkCloudDataModelVendorsVendorModel.handleBankInfo) &&
        Objects.equals(this.zipCode, dkCloudDataModelVendorsVendorModel.zipCode) &&
        Objects.equals(this.city, dkCloudDataModelVendorsVendorModel.city) &&
        Objects.equals(this.phone, dkCloudDataModelVendorsVendorModel.phone) &&
        Objects.equals(this.phoneLocal, dkCloudDataModelVendorsVendorModel.phoneLocal) &&
        Objects.equals(this.phoneMobile, dkCloudDataModelVendorsVendorModel.phoneMobile) &&
        Objects.equals(this.fax, dkCloudDataModelVendorsVendorModel.fax) &&
        Objects.equals(this.countryCode, dkCloudDataModelVendorsVendorModel.countryCode) &&
        Objects.equals(this.countyCode, dkCloudDataModelVendorsVendorModel.countyCode) &&
        Objects.equals(this.email, dkCloudDataModelVendorsVendorModel.email) &&
        Objects.equals(this.discount, dkCloudDataModelVendorsVendorModel.discount) &&
        Objects.equals(this.paymentMode, dkCloudDataModelVendorsVendorModel.paymentMode) &&
        Objects.equals(this.paymentTerm, dkCloudDataModelVendorsVendorModel.paymentTerm) &&
        Objects.equals(this.currencyCode, dkCloudDataModelVendorsVendorModel.currencyCode) &&
        Objects.equals(this.currencyFixed, dkCloudDataModelVendorsVendorModel.currencyFixed) &&
        Objects.equals(this.useCurrency, dkCloudDataModelVendorsVendorModel.useCurrency) &&
        Objects.equals(this.noVat, dkCloudDataModelVendorsVendorModel.noVat) &&
        Objects.equals(this.vaTNumber, dkCloudDataModelVendorsVendorModel.vaTNumber) &&
        Objects.equals(this.disableTax, dkCloudDataModelVendorsVendorModel.disableTax) &&
        Objects.equals(this.ledgerCode, dkCloudDataModelVendorsVendorModel.ledgerCode) &&
        Objects.equals(this.balance, dkCloudDataModelVendorsVendorModel.balance) &&
        Objects.equals(this.dimmentions, dkCloudDataModelVendorsVendorModel.dimmentions) &&
        Objects.equals(this.expenses, dkCloudDataModelVendorsVendorModel.expenses) &&
        Objects.equals(this.attachments, dkCloudDataModelVendorsVendorModel.attachments) &&
        Objects.equals(this.memos, dkCloudDataModelVendorsVendorModel.memos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, recordID, created, modified, ssNumber, name, address1, address2, address3, address4, group, tag, blocked, approve, creditMax, creditLimit, bankInfo, handleBankInfo, zipCode, city, phone, phoneLocal, phoneMobile, fax, countryCode, countyCode, email, discount, paymentMode, paymentTerm, currencyCode, currencyFixed, useCurrency, noVat, vaTNumber, disableTax, ledgerCode, balance, dimmentions, expenses, attachments, memos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelVendorsVendorModel {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    recordID: ").append(toIndentedString(recordID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    ssNumber: ").append(toIndentedString(ssNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    approve: ").append(toIndentedString(approve)).append("\n");
    sb.append("    creditMax: ").append(toIndentedString(creditMax)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    bankInfo: ").append(toIndentedString(bankInfo)).append("\n");
    sb.append("    handleBankInfo: ").append(toIndentedString(handleBankInfo)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneLocal: ").append(toIndentedString(phoneLocal)).append("\n");
    sb.append("    phoneMobile: ").append(toIndentedString(phoneMobile)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countyCode: ").append(toIndentedString(countyCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    paymentTerm: ").append(toIndentedString(paymentTerm)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyFixed: ").append(toIndentedString(currencyFixed)).append("\n");
    sb.append("    useCurrency: ").append(toIndentedString(useCurrency)).append("\n");
    sb.append("    noVat: ").append(toIndentedString(noVat)).append("\n");
    sb.append("    vaTNumber: ").append(toIndentedString(vaTNumber)).append("\n");
    sb.append("    disableTax: ").append(toIndentedString(disableTax)).append("\n");
    sb.append("    ledgerCode: ").append(toIndentedString(ledgerCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    dimmentions: ").append(toIndentedString(dimmentions)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    memos: ").append(toIndentedString(memos)).append("\n");
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
