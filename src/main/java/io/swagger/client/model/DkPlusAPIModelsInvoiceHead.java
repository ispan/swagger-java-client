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
import io.swagger.client.model.DkPlusAPIModelsFileModel;
import io.swagger.client.model.DkPlusAPIModelsInvoiceContact;
import io.swagger.client.model.DkPlusAPIModelsInvoiceCustomer;
import io.swagger.client.model.DkPlusAPIModelsInvoiceLine;
import io.swagger.client.model.DkPlusAPIModelsInvoiceOptions;
import io.swagger.client.model.DkPlusAPIModelsInvoicePayment;
import io.swagger.client.model.DkPlusAPIModelsInvoiceReceiver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Invoice Post Model
 */
@ApiModel(description = "Invoice Post Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsInvoiceHead {
  @SerializedName("Customer")
  private DkPlusAPIModelsInvoiceCustomer customer = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("Text1")
  private String text1 = null;

  @SerializedName("Text2")
  private String text2 = null;

  @SerializedName("Term")
  private String term = null;

  @SerializedName("Mode")
  private String mode = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("DueDate")
  private OffsetDateTime dueDate = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("SalesPerson")
  private String salesPerson = null;

  @SerializedName("Exchange")
  private Double exchange = null;

  @SerializedName("Options")
  private DkPlusAPIModelsInvoiceOptions options = null;

  @SerializedName("Lines")
  private List<DkPlusAPIModelsInvoiceLine> lines = null;

  @SerializedName("Payments")
  private List<DkPlusAPIModelsInvoicePayment> payments = null;

  @SerializedName("Attachment")
  private DkPlusAPIModelsFileModel attachment = null;

  @SerializedName("Receiver")
  private DkPlusAPIModelsInvoiceReceiver receiver = null;

  @SerializedName("Contact")
  private DkPlusAPIModelsInvoiceContact contact = null;

  /**
   * Sales Type
   */
  @JsonAdapter(SaleTypeEnum.Adapter.class)
  public enum SaleTypeEnum {
    DEBIT("Debit"),
    
    CREDIT("Credit"),
    
    RETURNSALE("ReturnSale"),
    
    DEBITCOMPUTATION("DebitComputation"),
    
    CREDITCOMPUTATION("CreditComputation");

    private String value;

    SaleTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SaleTypeEnum fromValue(String text) {
      for (SaleTypeEnum b : SaleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SaleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SaleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SaleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SaleTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SaleType")
  private SaleTypeEnum saleType = null;

  @SerializedName("Properties")
  private Map<String, String> properties = null;

  @SerializedName("Project")
  private String project = null;

  public DkPlusAPIModelsInvoiceHead customer(DkPlusAPIModelsInvoiceCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Customer Model
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "Customer Model")
  public DkPlusAPIModelsInvoiceCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(DkPlusAPIModelsInvoiceCustomer customer) {
    this.customer = customer;
  }

  public DkPlusAPIModelsInvoiceHead reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * External Invoice Reference
   * @return reference
  **/
  @ApiModelProperty(value = "External Invoice Reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public DkPlusAPIModelsInvoiceHead text1(String text1) {
    this.text1 = text1;
    return this;
  }

   /**
   * Invoice Detail Text
   * @return text1
  **/
  @ApiModelProperty(value = "Invoice Detail Text")
  public String getText1() {
    return text1;
  }

  public void setText1(String text1) {
    this.text1 = text1;
  }

  public DkPlusAPIModelsInvoiceHead text2(String text2) {
    this.text2 = text2;
    return this;
  }

   /**
   * Invoice Additional Detail Text
   * @return text2
  **/
  @ApiModelProperty(value = "Invoice Additional Detail Text")
  public String getText2() {
    return text2;
  }

  public void setText2(String text2) {
    this.text2 = text2;
  }

  public DkPlusAPIModelsInvoiceHead term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Payment Terms
   * @return term
  **/
  @ApiModelProperty(value = "Payment Terms")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public DkPlusAPIModelsInvoiceHead mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Payment Mode
   * @return mode
  **/
  @ApiModelProperty(value = "Payment Mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public DkPlusAPIModelsInvoiceHead date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Invoice Date
   * @return date
  **/
  @ApiModelProperty(value = "Invoice Date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public DkPlusAPIModelsInvoiceHead dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Invoice Due Date
   * @return dueDate
  **/
  @ApiModelProperty(value = "Invoice Due Date")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public DkPlusAPIModelsInvoiceHead currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency Code
   * @return currency
  **/
  @ApiModelProperty(value = "Currency Code")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DkPlusAPIModelsInvoiceHead salesPerson(String salesPerson) {
    this.salesPerson = salesPerson;
    return this;
  }

   /**
   * Sales Person
   * @return salesPerson
  **/
  @ApiModelProperty(required = true, value = "Sales Person")
  public String getSalesPerson() {
    return salesPerson;
  }

  public void setSalesPerson(String salesPerson) {
    this.salesPerson = salesPerson;
  }

  public DkPlusAPIModelsInvoiceHead exchange(Double exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Currency Exchange Rate
   * @return exchange
  **/
  @ApiModelProperty(value = "Currency Exchange Rate")
  public Double getExchange() {
    return exchange;
  }

  public void setExchange(Double exchange) {
    this.exchange = exchange;
  }

  public DkPlusAPIModelsInvoiceHead options(DkPlusAPIModelsInvoiceOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Options Model
   * @return options
  **/
  @ApiModelProperty(value = "Options Model")
  public DkPlusAPIModelsInvoiceOptions getOptions() {
    return options;
  }

  public void setOptions(DkPlusAPIModelsInvoiceOptions options) {
    this.options = options;
  }

  public DkPlusAPIModelsInvoiceHead lines(List<DkPlusAPIModelsInvoiceLine> lines) {
    this.lines = lines;
    return this;
  }

  public DkPlusAPIModelsInvoiceHead addLinesItem(DkPlusAPIModelsInvoiceLine linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<DkPlusAPIModelsInvoiceLine>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Invoice Lines
   * @return lines
  **/
  @ApiModelProperty(value = "Invoice Lines")
  public List<DkPlusAPIModelsInvoiceLine> getLines() {
    return lines;
  }

  public void setLines(List<DkPlusAPIModelsInvoiceLine> lines) {
    this.lines = lines;
  }

  public DkPlusAPIModelsInvoiceHead payments(List<DkPlusAPIModelsInvoicePayment> payments) {
    this.payments = payments;
    return this;
  }

  public DkPlusAPIModelsInvoiceHead addPaymentsItem(DkPlusAPIModelsInvoicePayment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<DkPlusAPIModelsInvoicePayment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Invoice Payments
   * @return payments
  **/
  @ApiModelProperty(value = "Invoice Payments")
  public List<DkPlusAPIModelsInvoicePayment> getPayments() {
    return payments;
  }

  public void setPayments(List<DkPlusAPIModelsInvoicePayment> payments) {
    this.payments = payments;
  }

  public DkPlusAPIModelsInvoiceHead attachment(DkPlusAPIModelsFileModel attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Attachment Model
   * @return attachment
  **/
  @ApiModelProperty(value = "Attachment Model")
  public DkPlusAPIModelsFileModel getAttachment() {
    return attachment;
  }

  public void setAttachment(DkPlusAPIModelsFileModel attachment) {
    this.attachment = attachment;
  }

  public DkPlusAPIModelsInvoiceHead receiver(DkPlusAPIModelsInvoiceReceiver receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Item Receiver
   * @return receiver
  **/
  @ApiModelProperty(value = "Item Receiver")
  public DkPlusAPIModelsInvoiceReceiver getReceiver() {
    return receiver;
  }

  public void setReceiver(DkPlusAPIModelsInvoiceReceiver receiver) {
    this.receiver = receiver;
  }

  public DkPlusAPIModelsInvoiceHead contact(DkPlusAPIModelsInvoiceContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact
   * @return contact
  **/
  @ApiModelProperty(value = "Contact")
  public DkPlusAPIModelsInvoiceContact getContact() {
    return contact;
  }

  public void setContact(DkPlusAPIModelsInvoiceContact contact) {
    this.contact = contact;
  }

  public DkPlusAPIModelsInvoiceHead saleType(SaleTypeEnum saleType) {
    this.saleType = saleType;
    return this;
  }

   /**
   * Sales Type
   * @return saleType
  **/
  @ApiModelProperty(value = "Sales Type")
  public SaleTypeEnum getSaleType() {
    return saleType;
  }

  public void setSaleType(SaleTypeEnum saleType) {
    this.saleType = saleType;
  }

  public DkPlusAPIModelsInvoiceHead properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public DkPlusAPIModelsInvoiceHead putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Additional Properties
   * @return properties
  **/
  @ApiModelProperty(value = "Additional Properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public DkPlusAPIModelsInvoiceHead project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Project Job Number
   * @return project
  **/
  @ApiModelProperty(value = "Project Job Number")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsInvoiceHead dkPlusAPIModelsInvoiceHead = (DkPlusAPIModelsInvoiceHead) o;
    return Objects.equals(this.customer, dkPlusAPIModelsInvoiceHead.customer) &&
        Objects.equals(this.reference, dkPlusAPIModelsInvoiceHead.reference) &&
        Objects.equals(this.text1, dkPlusAPIModelsInvoiceHead.text1) &&
        Objects.equals(this.text2, dkPlusAPIModelsInvoiceHead.text2) &&
        Objects.equals(this.term, dkPlusAPIModelsInvoiceHead.term) &&
        Objects.equals(this.mode, dkPlusAPIModelsInvoiceHead.mode) &&
        Objects.equals(this.date, dkPlusAPIModelsInvoiceHead.date) &&
        Objects.equals(this.dueDate, dkPlusAPIModelsInvoiceHead.dueDate) &&
        Objects.equals(this.currency, dkPlusAPIModelsInvoiceHead.currency) &&
        Objects.equals(this.salesPerson, dkPlusAPIModelsInvoiceHead.salesPerson) &&
        Objects.equals(this.exchange, dkPlusAPIModelsInvoiceHead.exchange) &&
        Objects.equals(this.options, dkPlusAPIModelsInvoiceHead.options) &&
        Objects.equals(this.lines, dkPlusAPIModelsInvoiceHead.lines) &&
        Objects.equals(this.payments, dkPlusAPIModelsInvoiceHead.payments) &&
        Objects.equals(this.attachment, dkPlusAPIModelsInvoiceHead.attachment) &&
        Objects.equals(this.receiver, dkPlusAPIModelsInvoiceHead.receiver) &&
        Objects.equals(this.contact, dkPlusAPIModelsInvoiceHead.contact) &&
        Objects.equals(this.saleType, dkPlusAPIModelsInvoiceHead.saleType) &&
        Objects.equals(this.properties, dkPlusAPIModelsInvoiceHead.properties) &&
        Objects.equals(this.project, dkPlusAPIModelsInvoiceHead.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, reference, text1, text2, term, mode, date, dueDate, currency, salesPerson, exchange, options, lines, payments, attachment, receiver, contact, saleType, properties, project);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsInvoiceHead {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    text1: ").append(toIndentedString(text1)).append("\n");
    sb.append("    text2: ").append(toIndentedString(text2)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    salesPerson: ").append(toIndentedString(salesPerson)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    saleType: ").append(toIndentedString(saleType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
