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
 * DkCloudDataModelGeneralLedgerAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelGeneralLedgerAccount {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Group")
  private Integer group = null;

  @SerializedName("AccountType")
  private Integer accountType = null;

  @SerializedName("TaxCode")
  private String taxCode = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  @SerializedName("Closed")
  private Boolean closed = null;

  @SerializedName("UseCurrency")
  private Boolean useCurrency = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("SumReference")
  private String sumReference = null;

  @SerializedName("ReverseAccount")
  private String reverseAccount = null;

  public DkCloudDataModelGeneralLedgerAccount number(String number) {
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

  public DkCloudDataModelGeneralLedgerAccount name(String name) {
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

  public DkCloudDataModelGeneralLedgerAccount group(Integer group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public Integer getGroup() {
    return group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public DkCloudDataModelGeneralLedgerAccount accountType(Integer accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public DkCloudDataModelGeneralLedgerAccount taxCode(String taxCode) {
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

  public DkCloudDataModelGeneralLedgerAccount modified(OffsetDateTime modified) {
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

  public DkCloudDataModelGeneralLedgerAccount closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @ApiModelProperty(value = "")
  public Boolean isClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public DkCloudDataModelGeneralLedgerAccount useCurrency(Boolean useCurrency) {
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

  public DkCloudDataModelGeneralLedgerAccount currency(String currency) {
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

  public DkCloudDataModelGeneralLedgerAccount sumReference(String sumReference) {
    this.sumReference = sumReference;
    return this;
  }

   /**
   * Get sumReference
   * @return sumReference
  **/
  @ApiModelProperty(value = "")
  public String getSumReference() {
    return sumReference;
  }

  public void setSumReference(String sumReference) {
    this.sumReference = sumReference;
  }

  public DkCloudDataModelGeneralLedgerAccount reverseAccount(String reverseAccount) {
    this.reverseAccount = reverseAccount;
    return this;
  }

   /**
   * Get reverseAccount
   * @return reverseAccount
  **/
  @ApiModelProperty(value = "")
  public String getReverseAccount() {
    return reverseAccount;
  }

  public void setReverseAccount(String reverseAccount) {
    this.reverseAccount = reverseAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelGeneralLedgerAccount dkCloudDataModelGeneralLedgerAccount = (DkCloudDataModelGeneralLedgerAccount) o;
    return Objects.equals(this.number, dkCloudDataModelGeneralLedgerAccount.number) &&
        Objects.equals(this.name, dkCloudDataModelGeneralLedgerAccount.name) &&
        Objects.equals(this.group, dkCloudDataModelGeneralLedgerAccount.group) &&
        Objects.equals(this.accountType, dkCloudDataModelGeneralLedgerAccount.accountType) &&
        Objects.equals(this.taxCode, dkCloudDataModelGeneralLedgerAccount.taxCode) &&
        Objects.equals(this.modified, dkCloudDataModelGeneralLedgerAccount.modified) &&
        Objects.equals(this.closed, dkCloudDataModelGeneralLedgerAccount.closed) &&
        Objects.equals(this.useCurrency, dkCloudDataModelGeneralLedgerAccount.useCurrency) &&
        Objects.equals(this.currency, dkCloudDataModelGeneralLedgerAccount.currency) &&
        Objects.equals(this.sumReference, dkCloudDataModelGeneralLedgerAccount.sumReference) &&
        Objects.equals(this.reverseAccount, dkCloudDataModelGeneralLedgerAccount.reverseAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, name, group, accountType, taxCode, modified, closed, useCurrency, currency, sumReference, reverseAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelGeneralLedgerAccount {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    useCurrency: ").append(toIndentedString(useCurrency)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    sumReference: ").append(toIndentedString(sumReference)).append("\n");
    sb.append("    reverseAccount: ").append(toIndentedString(reverseAccount)).append("\n");
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
