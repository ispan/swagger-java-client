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
import io.swagger.client.model.DkCloudDataModelSalesPaymentModel;
import io.swagger.client.model.DkCloudDataModelSalesSimpleInvoiceLineModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelSalesSimpleInvoiceModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelSalesSimpleInvoiceModel {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("Customer")
  private String customer = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("DueDate")
  private OffsetDateTime dueDate = null;

  @SerializedName("Discount")
  private Double discount = null;

  @SerializedName("DiscountAmount")
  private Double discountAmount = null;

  @SerializedName("Receiver")
  private String receiver = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("Exchange")
  private Double exchange = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("TotalAmount")
  private Double totalAmount = null;

  @SerializedName("TotalAmountIncVat")
  private Double totalAmountIncVat = null;

  @SerializedName("SalesPerson")
  private String salesPerson = null;

  @SerializedName("Text1")
  private String text1 = null;

  @SerializedName("Text2")
  private String text2 = null;

  @SerializedName("Lines")
  private List<DkCloudDataModelSalesSimpleInvoiceLineModel> lines = null;

  @SerializedName("Payments")
  private List<DkCloudDataModelSalesPaymentModel> payments = null;

  public DkCloudDataModelSalesSimpleInvoiceModel number(String number) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel date(OffsetDateTime date) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel dueDate(OffsetDateTime dueDate) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel discount(Double discount) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @ApiModelProperty(value = "")
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel reference(String reference) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel exchange(Double exchange) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel currency(String currency) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel totalAmount(Double totalAmount) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel totalAmountIncVat(Double totalAmountIncVat) {
    this.totalAmountIncVat = totalAmountIncVat;
    return this;
  }

   /**
   * Get totalAmountIncVat
   * @return totalAmountIncVat
  **/
  @ApiModelProperty(value = "")
  public Double getTotalAmountIncVat() {
    return totalAmountIncVat;
  }

  public void setTotalAmountIncVat(Double totalAmountIncVat) {
    this.totalAmountIncVat = totalAmountIncVat;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel salesPerson(String salesPerson) {
    this.salesPerson = salesPerson;
    return this;
  }

   /**
   * Get salesPerson
   * @return salesPerson
  **/
  @ApiModelProperty(value = "")
  public String getSalesPerson() {
    return salesPerson;
  }

  public void setSalesPerson(String salesPerson) {
    this.salesPerson = salesPerson;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel text1(String text1) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel text2(String text2) {
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

  public DkCloudDataModelSalesSimpleInvoiceModel lines(List<DkCloudDataModelSalesSimpleInvoiceLineModel> lines) {
    this.lines = lines;
    return this;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel addLinesItem(DkCloudDataModelSalesSimpleInvoiceLineModel linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<DkCloudDataModelSalesSimpleInvoiceLineModel>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelSalesSimpleInvoiceLineModel> getLines() {
    return lines;
  }

  public void setLines(List<DkCloudDataModelSalesSimpleInvoiceLineModel> lines) {
    this.lines = lines;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel payments(List<DkCloudDataModelSalesPaymentModel> payments) {
    this.payments = payments;
    return this;
  }

  public DkCloudDataModelSalesSimpleInvoiceModel addPaymentsItem(DkCloudDataModelSalesPaymentModel paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<DkCloudDataModelSalesPaymentModel>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelSalesPaymentModel> getPayments() {
    return payments;
  }

  public void setPayments(List<DkCloudDataModelSalesPaymentModel> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelSalesSimpleInvoiceModel dkCloudDataModelSalesSimpleInvoiceModel = (DkCloudDataModelSalesSimpleInvoiceModel) o;
    return Objects.equals(this.number, dkCloudDataModelSalesSimpleInvoiceModel.number) &&
        Objects.equals(this.customer, dkCloudDataModelSalesSimpleInvoiceModel.customer) &&
        Objects.equals(this.date, dkCloudDataModelSalesSimpleInvoiceModel.date) &&
        Objects.equals(this.dueDate, dkCloudDataModelSalesSimpleInvoiceModel.dueDate) &&
        Objects.equals(this.discount, dkCloudDataModelSalesSimpleInvoiceModel.discount) &&
        Objects.equals(this.discountAmount, dkCloudDataModelSalesSimpleInvoiceModel.discountAmount) &&
        Objects.equals(this.receiver, dkCloudDataModelSalesSimpleInvoiceModel.receiver) &&
        Objects.equals(this.reference, dkCloudDataModelSalesSimpleInvoiceModel.reference) &&
        Objects.equals(this.exchange, dkCloudDataModelSalesSimpleInvoiceModel.exchange) &&
        Objects.equals(this.currency, dkCloudDataModelSalesSimpleInvoiceModel.currency) &&
        Objects.equals(this.totalAmount, dkCloudDataModelSalesSimpleInvoiceModel.totalAmount) &&
        Objects.equals(this.totalAmountIncVat, dkCloudDataModelSalesSimpleInvoiceModel.totalAmountIncVat) &&
        Objects.equals(this.salesPerson, dkCloudDataModelSalesSimpleInvoiceModel.salesPerson) &&
        Objects.equals(this.text1, dkCloudDataModelSalesSimpleInvoiceModel.text1) &&
        Objects.equals(this.text2, dkCloudDataModelSalesSimpleInvoiceModel.text2) &&
        Objects.equals(this.lines, dkCloudDataModelSalesSimpleInvoiceModel.lines) &&
        Objects.equals(this.payments, dkCloudDataModelSalesSimpleInvoiceModel.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, customer, date, dueDate, discount, discountAmount, receiver, reference, exchange, currency, totalAmount, totalAmountIncVat, salesPerson, text1, text2, lines, payments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelSalesSimpleInvoiceModel {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalAmountIncVat: ").append(toIndentedString(totalAmountIncVat)).append("\n");
    sb.append("    salesPerson: ").append(toIndentedString(salesPerson)).append("\n");
    sb.append("    text1: ").append(toIndentedString(text1)).append("\n");
    sb.append("    text2: ").append(toIndentedString(text2)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
