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
 * VLinkDkSoftwareDkSOAPTInvoiceEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class VLinkDkSoftwareDkSOAPTInvoiceEntry {
  @SerializedName("InvoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("CustomerNumber")
  private String customerNumber = null;

  @SerializedName("InvoiceDate")
  private OffsetDateTime invoiceDate = null;

  @SerializedName("TotalAmount")
  private Double totalAmount = null;

  @SerializedName("TotalAmountWithTax")
  private Double totalAmountWithTax = null;

  @SerializedName("ReferenceNumber")
  private String referenceNumber = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  /**
   * Gets or Sets settledType
   */
  @JsonAdapter(SettledTypeEnum.Adapter.class)
  public enum SettledTypeEnum {
    CBNOTSETTLED("_cbNotSettled"),
    
    CBPARTLYSETTLED("_cbPartlySettled"),
    
    CBFULLYSETTLED("_cbFullySettled");

    private String value;

    SettledTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SettledTypeEnum fromValue(String text) {
      for (SettledTypeEnum b : SettledTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SettledTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SettledTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SettledTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SettledTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SettledType")
  private SettledTypeEnum settledType = null;

  @SerializedName("SettledAmount")
  private Double settledAmount = null;

  @SerializedName("Discount")
  private Double discount = null;

  @SerializedName("DiscountPercent")
  private Double discountPercent = null;

  public VLinkDkSoftwareDkSOAPTInvoiceEntry invoiceNumber(String invoiceNumber) {
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

  public VLinkDkSoftwareDkSOAPTInvoiceEntry customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @ApiModelProperty(value = "")
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public VLinkDkSoftwareDkSOAPTInvoiceEntry invoiceDate(OffsetDateTime invoiceDate) {
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

  public VLinkDkSoftwareDkSOAPTInvoiceEntry totalAmount(Double totalAmount) {
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

  public VLinkDkSoftwareDkSOAPTInvoiceEntry totalAmountWithTax(Double totalAmountWithTax) {
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

  public VLinkDkSoftwareDkSOAPTInvoiceEntry referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public VLinkDkSoftwareDkSOAPTInvoiceEntry currencyCode(String currencyCode) {
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

  public VLinkDkSoftwareDkSOAPTInvoiceEntry settledType(SettledTypeEnum settledType) {
    this.settledType = settledType;
    return this;
  }

   /**
   * Get settledType
   * @return settledType
  **/
  @ApiModelProperty(value = "")
  public SettledTypeEnum getSettledType() {
    return settledType;
  }

  public void setSettledType(SettledTypeEnum settledType) {
    this.settledType = settledType;
  }

  public VLinkDkSoftwareDkSOAPTInvoiceEntry settledAmount(Double settledAmount) {
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

  public VLinkDkSoftwareDkSOAPTInvoiceEntry discount(Double discount) {
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

  public VLinkDkSoftwareDkSOAPTInvoiceEntry discountPercent(Double discountPercent) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VLinkDkSoftwareDkSOAPTInvoiceEntry vLinkDkSoftwareDkSOAPTInvoiceEntry = (VLinkDkSoftwareDkSOAPTInvoiceEntry) o;
    return Objects.equals(this.invoiceNumber, vLinkDkSoftwareDkSOAPTInvoiceEntry.invoiceNumber) &&
        Objects.equals(this.customerNumber, vLinkDkSoftwareDkSOAPTInvoiceEntry.customerNumber) &&
        Objects.equals(this.invoiceDate, vLinkDkSoftwareDkSOAPTInvoiceEntry.invoiceDate) &&
        Objects.equals(this.totalAmount, vLinkDkSoftwareDkSOAPTInvoiceEntry.totalAmount) &&
        Objects.equals(this.totalAmountWithTax, vLinkDkSoftwareDkSOAPTInvoiceEntry.totalAmountWithTax) &&
        Objects.equals(this.referenceNumber, vLinkDkSoftwareDkSOAPTInvoiceEntry.referenceNumber) &&
        Objects.equals(this.currencyCode, vLinkDkSoftwareDkSOAPTInvoiceEntry.currencyCode) &&
        Objects.equals(this.settledType, vLinkDkSoftwareDkSOAPTInvoiceEntry.settledType) &&
        Objects.equals(this.settledAmount, vLinkDkSoftwareDkSOAPTInvoiceEntry.settledAmount) &&
        Objects.equals(this.discount, vLinkDkSoftwareDkSOAPTInvoiceEntry.discount) &&
        Objects.equals(this.discountPercent, vLinkDkSoftwareDkSOAPTInvoiceEntry.discountPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, customerNumber, invoiceDate, totalAmount, totalAmountWithTax, referenceNumber, currencyCode, settledType, settledAmount, discount, discountPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VLinkDkSoftwareDkSOAPTInvoiceEntry {\n");
    
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalAmountWithTax: ").append(toIndentedString(totalAmountWithTax)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    settledType: ").append(toIndentedString(settledType)).append("\n");
    sb.append("    settledAmount: ").append(toIndentedString(settledAmount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
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

