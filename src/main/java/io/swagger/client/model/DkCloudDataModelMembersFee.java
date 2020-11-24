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
import io.swagger.client.model.DkCloudDataModelCustomersCustomerBaseModel;
import io.swagger.client.model.DkCloudDataModelGeneralCreditCard;
import io.swagger.client.model.DkCloudDataModelMembersFeeDiscount;
import io.swagger.client.model.DkCloudDataModelMembersFeePeriod;
import io.swagger.client.model.DkCloudDataModelMembersPaymentOptions;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DkCloudDataModelMembersFee
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersFee {
  @SerializedName("Period")
  private DkCloudDataModelMembersFeePeriod period = null;

  @SerializedName("Discount")
  private DkCloudDataModelMembersFeeDiscount discount = null;

  @SerializedName("Payment")
  private DkCloudDataModelMembersPaymentOptions payment = null;

  @SerializedName("Disabled")
  private Boolean disabled = null;

  @SerializedName("RateMonth")
  private Integer rateMonth = null;

  @SerializedName("IntrestRate")
  private Double intrestRate = null;

  /**
   * Gets or Sets interval
   */
  @JsonAdapter(IntervalEnum.Adapter.class)
  public enum IntervalEnum {
    ONETIME("OneTime"),
    
    MONTHLY("Monthly"),
    
    YEARLY("Yearly");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalEnum fromValue(String text) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Interval")
  private IntervalEnum interval = null;

  @SerializedName("Dim2")
  private String dim2 = null;

  @SerializedName("Campaign")
  private String campaign = null;

  @SerializedName("FeeType")
  private String feeType = null;

  @SerializedName("Memo")
  private String memo = null;

  @SerializedName("ReductionPayment")
  private Double reductionPayment = null;

  @SerializedName("ContactName")
  private String contactName = null;

  @SerializedName("Saleperson")
  private String saleperson = null;

  @SerializedName("RateSplit")
  private Integer rateSplit = null;

  @SerializedName("CreditCard")
  private DkCloudDataModelGeneralCreditCard creditCard = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("ItemCode")
  private String itemCode = null;

  @SerializedName("Payer")
  private DkCloudDataModelCustomersCustomerBaseModel payer = null;

  @SerializedName("Properties")
  private Map<String, String> properties = null;

  public DkCloudDataModelMembersFee period(DkCloudDataModelMembersFeePeriod period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersFeePeriod getPeriod() {
    return period;
  }

  public void setPeriod(DkCloudDataModelMembersFeePeriod period) {
    this.period = period;
  }

  public DkCloudDataModelMembersFee discount(DkCloudDataModelMembersFeeDiscount discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersFeeDiscount getDiscount() {
    return discount;
  }

  public void setDiscount(DkCloudDataModelMembersFeeDiscount discount) {
    this.discount = discount;
  }

  public DkCloudDataModelMembersFee payment(DkCloudDataModelMembersPaymentOptions payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersPaymentOptions getPayment() {
    return payment;
  }

  public void setPayment(DkCloudDataModelMembersPaymentOptions payment) {
    this.payment = payment;
  }

  public DkCloudDataModelMembersFee disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public DkCloudDataModelMembersFee rateMonth(Integer rateMonth) {
    this.rateMonth = rateMonth;
    return this;
  }

   /**
   * Get rateMonth
   * @return rateMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getRateMonth() {
    return rateMonth;
  }

  public void setRateMonth(Integer rateMonth) {
    this.rateMonth = rateMonth;
  }

  public DkCloudDataModelMembersFee intrestRate(Double intrestRate) {
    this.intrestRate = intrestRate;
    return this;
  }

   /**
   * Get intrestRate
   * @return intrestRate
  **/
  @ApiModelProperty(value = "")
  public Double getIntrestRate() {
    return intrestRate;
  }

  public void setIntrestRate(Double intrestRate) {
    this.intrestRate = intrestRate;
  }

  public DkCloudDataModelMembersFee interval(IntervalEnum interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")
  public IntervalEnum getInterval() {
    return interval;
  }

  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }

  public DkCloudDataModelMembersFee dim2(String dim2) {
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

  public DkCloudDataModelMembersFee campaign(String campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(value = "")
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  public DkCloudDataModelMembersFee feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @ApiModelProperty(value = "")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public DkCloudDataModelMembersFee memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public DkCloudDataModelMembersFee reductionPayment(Double reductionPayment) {
    this.reductionPayment = reductionPayment;
    return this;
  }

   /**
   * Get reductionPayment
   * @return reductionPayment
  **/
  @ApiModelProperty(value = "")
  public Double getReductionPayment() {
    return reductionPayment;
  }

  public void setReductionPayment(Double reductionPayment) {
    this.reductionPayment = reductionPayment;
  }

  public DkCloudDataModelMembersFee contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  @ApiModelProperty(value = "")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public DkCloudDataModelMembersFee saleperson(String saleperson) {
    this.saleperson = saleperson;
    return this;
  }

   /**
   * Get saleperson
   * @return saleperson
  **/
  @ApiModelProperty(value = "")
  public String getSaleperson() {
    return saleperson;
  }

  public void setSaleperson(String saleperson) {
    this.saleperson = saleperson;
  }

  public DkCloudDataModelMembersFee rateSplit(Integer rateSplit) {
    this.rateSplit = rateSplit;
    return this;
  }

   /**
   * Get rateSplit
   * @return rateSplit
  **/
  @ApiModelProperty(value = "")
  public Integer getRateSplit() {
    return rateSplit;
  }

  public void setRateSplit(Integer rateSplit) {
    this.rateSplit = rateSplit;
  }

  public DkCloudDataModelMembersFee creditCard(DkCloudDataModelGeneralCreditCard creditCard) {
    this.creditCard = creditCard;
    return this;
  }

   /**
   * Get creditCard
   * @return creditCard
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelGeneralCreditCard getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(DkCloudDataModelGeneralCreditCard creditCard) {
    this.creditCard = creditCard;
  }

  public DkCloudDataModelMembersFee amount(Double amount) {
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

  public DkCloudDataModelMembersFee itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * Get itemCode
   * @return itemCode
  **/
  @ApiModelProperty(value = "")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public DkCloudDataModelMembersFee payer(DkCloudDataModelCustomersCustomerBaseModel payer) {
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelCustomersCustomerBaseModel getPayer() {
    return payer;
  }

  public void setPayer(DkCloudDataModelCustomersCustomerBaseModel payer) {
    this.payer = payer;
  }

  public DkCloudDataModelMembersFee properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public DkCloudDataModelMembersFee putPropertiesItem(String key, String propertiesItem) {
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
    DkCloudDataModelMembersFee dkCloudDataModelMembersFee = (DkCloudDataModelMembersFee) o;
    return Objects.equals(this.period, dkCloudDataModelMembersFee.period) &&
        Objects.equals(this.discount, dkCloudDataModelMembersFee.discount) &&
        Objects.equals(this.payment, dkCloudDataModelMembersFee.payment) &&
        Objects.equals(this.disabled, dkCloudDataModelMembersFee.disabled) &&
        Objects.equals(this.rateMonth, dkCloudDataModelMembersFee.rateMonth) &&
        Objects.equals(this.intrestRate, dkCloudDataModelMembersFee.intrestRate) &&
        Objects.equals(this.interval, dkCloudDataModelMembersFee.interval) &&
        Objects.equals(this.dim2, dkCloudDataModelMembersFee.dim2) &&
        Objects.equals(this.campaign, dkCloudDataModelMembersFee.campaign) &&
        Objects.equals(this.feeType, dkCloudDataModelMembersFee.feeType) &&
        Objects.equals(this.memo, dkCloudDataModelMembersFee.memo) &&
        Objects.equals(this.reductionPayment, dkCloudDataModelMembersFee.reductionPayment) &&
        Objects.equals(this.contactName, dkCloudDataModelMembersFee.contactName) &&
        Objects.equals(this.saleperson, dkCloudDataModelMembersFee.saleperson) &&
        Objects.equals(this.rateSplit, dkCloudDataModelMembersFee.rateSplit) &&
        Objects.equals(this.creditCard, dkCloudDataModelMembersFee.creditCard) &&
        Objects.equals(this.amount, dkCloudDataModelMembersFee.amount) &&
        Objects.equals(this.itemCode, dkCloudDataModelMembersFee.itemCode) &&
        Objects.equals(this.payer, dkCloudDataModelMembersFee.payer) &&
        Objects.equals(this.properties, dkCloudDataModelMembersFee.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, discount, payment, disabled, rateMonth, intrestRate, interval, dim2, campaign, feeType, memo, reductionPayment, contactName, saleperson, rateSplit, creditCard, amount, itemCode, payer, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersFee {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    rateMonth: ").append(toIndentedString(rateMonth)).append("\n");
    sb.append("    intrestRate: ").append(toIndentedString(intrestRate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    reductionPayment: ").append(toIndentedString(reductionPayment)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    saleperson: ").append(toIndentedString(saleperson)).append("\n");
    sb.append("    rateSplit: ").append(toIndentedString(rateSplit)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
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
