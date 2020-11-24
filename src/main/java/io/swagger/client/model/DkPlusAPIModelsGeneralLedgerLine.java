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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * DkPlusAPIModelsGeneralLedgerLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsGeneralLedgerLine {
  @SerializedName("Account")
  private String account = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("DueDate")
  private OffsetDateTime dueDate = null;

  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Voucher")
  private String voucher = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GENERALLEDGER("GeneralLedger"),
    
    CUSTOMER("Customer"),
    
    VENDOR("Vendor"),
    
    PROJECT("Project"),
    
    PAYROLL("Payroll"),
    
    FIXEDASSET("FixedAsset"),
    
    MEMBERPAYMENT("MemberPayment"),
    
    BANKTRANSACTION("BankTransaction"),
    
    SUPPORTER("Supporter"),
    
    BOOKING("Booking");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  @SerializedName("Properties")
  private Map<String, String> properties = null;

  public DkPlusAPIModelsGeneralLedgerLine account(String account) {
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

  public DkPlusAPIModelsGeneralLedgerLine amount(Double amount) {
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

  public DkPlusAPIModelsGeneralLedgerLine currency(String currency) {
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

  public DkPlusAPIModelsGeneralLedgerLine date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public DkPlusAPIModelsGeneralLedgerLine dueDate(OffsetDateTime dueDate) {
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

  public DkPlusAPIModelsGeneralLedgerLine dim1(String dim1) {
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

  public DkPlusAPIModelsGeneralLedgerLine reference(String reference) {
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

  public DkPlusAPIModelsGeneralLedgerLine text(String text) {
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

  public DkPlusAPIModelsGeneralLedgerLine voucher(String voucher) {
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

  public DkPlusAPIModelsGeneralLedgerLine type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DkPlusAPIModelsGeneralLedgerLine properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public DkPlusAPIModelsGeneralLedgerLine putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsGeneralLedgerLine dkPlusAPIModelsGeneralLedgerLine = (DkPlusAPIModelsGeneralLedgerLine) o;
    return Objects.equals(this.account, dkPlusAPIModelsGeneralLedgerLine.account) &&
        Objects.equals(this.amount, dkPlusAPIModelsGeneralLedgerLine.amount) &&
        Objects.equals(this.currency, dkPlusAPIModelsGeneralLedgerLine.currency) &&
        Objects.equals(this.date, dkPlusAPIModelsGeneralLedgerLine.date) &&
        Objects.equals(this.dueDate, dkPlusAPIModelsGeneralLedgerLine.dueDate) &&
        Objects.equals(this.dim1, dkPlusAPIModelsGeneralLedgerLine.dim1) &&
        Objects.equals(this.reference, dkPlusAPIModelsGeneralLedgerLine.reference) &&
        Objects.equals(this.text, dkPlusAPIModelsGeneralLedgerLine.text) &&
        Objects.equals(this.voucher, dkPlusAPIModelsGeneralLedgerLine.voucher) &&
        Objects.equals(this.type, dkPlusAPIModelsGeneralLedgerLine.type) &&
        Objects.equals(this.properties, dkPlusAPIModelsGeneralLedgerLine.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, currency, date, dueDate, dim1, reference, text, voucher, type, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsGeneralLedgerLine {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

