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
import io.swagger.client.model.DkCloudDataModelGeneralAddress;
import io.swagger.client.model.DkCloudDataModelGeneralContactInfo;
import io.swagger.client.model.DkCloudDataModelGeneralCreditCard;
import io.swagger.client.model.DkCloudDataModelMembersBankAccount;
import io.swagger.client.model.DkCloudDataModelMembersStatistics;
import io.swagger.client.model.DkCloudDataModelMembersStatus;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelMembersMember
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersMember {
  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("Created")
  private OffsetDateTime created = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("SSNumber")
  private String ssNumber = null;

  @SerializedName("Address")
  private DkCloudDataModelGeneralAddress address = null;

  @SerializedName("ContactDetail")
  private DkCloudDataModelGeneralContactInfo contactDetail = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("Group")
  private String group = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("SalesPerson")
  private String salesPerson = null;

  @SerializedName("Discount")
  private Double discount = null;

  @SerializedName("PaymentType")
  private String paymentType = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("NoVat")
  private Boolean noVat = null;

  @SerializedName("LedgerCode")
  private String ledgerCode = null;

  @SerializedName("Points")
  private Double points = null;

  @SerializedName("BankAccount")
  private DkCloudDataModelMembersBankAccount bankAccount = null;

  @SerializedName("CreditCard")
  private DkCloudDataModelGeneralCreditCard creditCard = null;

  @SerializedName("Statistics")
  private DkCloudDataModelMembersStatistics statistics = null;

  @SerializedName("Status")
  private DkCloudDataModelMembersStatus status = null;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("Male"),
    
    FEMALE("Female"),
    
    GENDERCOMPANY("GenderCompany"),
    
    NOGENDER("NoGender"),
    
    NOTEXISTS("NotExists"),
    
    BOY("Boy"),
    
    GIRL("Girl");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GenderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Gender")
  private GenderEnum gender = null;

  @SerializedName("PaymentMode")
  private String paymentMode = null;

  @SerializedName("HasConfirmedTerms")
  private Boolean hasConfirmedTerms = null;

  @SerializedName("ConfirmedTermId")
  private Integer confirmedTermId = null;

  @SerializedName("ExtraProperties")
  private Map<String, String> extraProperties = null;

  public DkCloudDataModelMembersMember ID(Integer ID) {
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

  public DkCloudDataModelMembersMember created(OffsetDateTime created) {
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

  public DkCloudDataModelMembersMember modified(OffsetDateTime modified) {
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

  public DkCloudDataModelMembersMember number(String number) {
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

  public DkCloudDataModelMembersMember name(String name) {
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

  public DkCloudDataModelMembersMember ssNumber(String ssNumber) {
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

  public DkCloudDataModelMembersMember address(DkCloudDataModelGeneralAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelGeneralAddress getAddress() {
    return address;
  }

  public void setAddress(DkCloudDataModelGeneralAddress address) {
    this.address = address;
  }

  public DkCloudDataModelMembersMember contactDetail(DkCloudDataModelGeneralContactInfo contactDetail) {
    this.contactDetail = contactDetail;
    return this;
  }

   /**
   * Get contactDetail
   * @return contactDetail
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelGeneralContactInfo getContactDetail() {
    return contactDetail;
  }

  public void setContactDetail(DkCloudDataModelGeneralContactInfo contactDetail) {
    this.contactDetail = contactDetail;
  }

  public DkCloudDataModelMembersMember password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DkCloudDataModelMembersMember group(String group) {
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

  public DkCloudDataModelMembersMember tag(String tag) {
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

  public DkCloudDataModelMembersMember salesPerson(String salesPerson) {
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

  public DkCloudDataModelMembersMember discount(Double discount) {
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

  public DkCloudDataModelMembersMember paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public DkCloudDataModelMembersMember currencyCode(String currencyCode) {
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

  public DkCloudDataModelMembersMember noVat(Boolean noVat) {
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

  public DkCloudDataModelMembersMember ledgerCode(String ledgerCode) {
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

  public DkCloudDataModelMembersMember points(Double points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @ApiModelProperty(value = "")
  public Double getPoints() {
    return points;
  }

  public void setPoints(Double points) {
    this.points = points;
  }

  public DkCloudDataModelMembersMember bankAccount(DkCloudDataModelMembersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(DkCloudDataModelMembersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public DkCloudDataModelMembersMember creditCard(DkCloudDataModelGeneralCreditCard creditCard) {
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

  public DkCloudDataModelMembersMember statistics(DkCloudDataModelMembersStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(DkCloudDataModelMembersStatistics statistics) {
    this.statistics = statistics;
  }

  public DkCloudDataModelMembersMember status(DkCloudDataModelMembersStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersStatus getStatus() {
    return status;
  }

  public void setStatus(DkCloudDataModelMembersStatus status) {
    this.status = status;
  }

  public DkCloudDataModelMembersMember gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public DkCloudDataModelMembersMember paymentMode(String paymentMode) {
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

  public DkCloudDataModelMembersMember hasConfirmedTerms(Boolean hasConfirmedTerms) {
    this.hasConfirmedTerms = hasConfirmedTerms;
    return this;
  }

   /**
   * Get hasConfirmedTerms
   * @return hasConfirmedTerms
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasConfirmedTerms() {
    return hasConfirmedTerms;
  }

  public void setHasConfirmedTerms(Boolean hasConfirmedTerms) {
    this.hasConfirmedTerms = hasConfirmedTerms;
  }

  public DkCloudDataModelMembersMember confirmedTermId(Integer confirmedTermId) {
    this.confirmedTermId = confirmedTermId;
    return this;
  }

   /**
   * Get confirmedTermId
   * @return confirmedTermId
  **/
  @ApiModelProperty(value = "")
  public Integer getConfirmedTermId() {
    return confirmedTermId;
  }

  public void setConfirmedTermId(Integer confirmedTermId) {
    this.confirmedTermId = confirmedTermId;
  }

  public DkCloudDataModelMembersMember extraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
    return this;
  }

  public DkCloudDataModelMembersMember putExtraPropertiesItem(String key, String extraPropertiesItem) {
    if (this.extraProperties == null) {
      this.extraProperties = new HashMap<String, String>();
    }
    this.extraProperties.put(key, extraPropertiesItem);
    return this;
  }

   /**
   * Get extraProperties
   * @return extraProperties
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getExtraProperties() {
    return extraProperties;
  }

  public void setExtraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelMembersMember dkCloudDataModelMembersMember = (DkCloudDataModelMembersMember) o;
    return Objects.equals(this.ID, dkCloudDataModelMembersMember.ID) &&
        Objects.equals(this.created, dkCloudDataModelMembersMember.created) &&
        Objects.equals(this.modified, dkCloudDataModelMembersMember.modified) &&
        Objects.equals(this.number, dkCloudDataModelMembersMember.number) &&
        Objects.equals(this.name, dkCloudDataModelMembersMember.name) &&
        Objects.equals(this.ssNumber, dkCloudDataModelMembersMember.ssNumber) &&
        Objects.equals(this.address, dkCloudDataModelMembersMember.address) &&
        Objects.equals(this.contactDetail, dkCloudDataModelMembersMember.contactDetail) &&
        Objects.equals(this.password, dkCloudDataModelMembersMember.password) &&
        Objects.equals(this.group, dkCloudDataModelMembersMember.group) &&
        Objects.equals(this.tag, dkCloudDataModelMembersMember.tag) &&
        Objects.equals(this.salesPerson, dkCloudDataModelMembersMember.salesPerson) &&
        Objects.equals(this.discount, dkCloudDataModelMembersMember.discount) &&
        Objects.equals(this.paymentType, dkCloudDataModelMembersMember.paymentType) &&
        Objects.equals(this.currencyCode, dkCloudDataModelMembersMember.currencyCode) &&
        Objects.equals(this.noVat, dkCloudDataModelMembersMember.noVat) &&
        Objects.equals(this.ledgerCode, dkCloudDataModelMembersMember.ledgerCode) &&
        Objects.equals(this.points, dkCloudDataModelMembersMember.points) &&
        Objects.equals(this.bankAccount, dkCloudDataModelMembersMember.bankAccount) &&
        Objects.equals(this.creditCard, dkCloudDataModelMembersMember.creditCard) &&
        Objects.equals(this.statistics, dkCloudDataModelMembersMember.statistics) &&
        Objects.equals(this.status, dkCloudDataModelMembersMember.status) &&
        Objects.equals(this.gender, dkCloudDataModelMembersMember.gender) &&
        Objects.equals(this.paymentMode, dkCloudDataModelMembersMember.paymentMode) &&
        Objects.equals(this.hasConfirmedTerms, dkCloudDataModelMembersMember.hasConfirmedTerms) &&
        Objects.equals(this.confirmedTermId, dkCloudDataModelMembersMember.confirmedTermId) &&
        Objects.equals(this.extraProperties, dkCloudDataModelMembersMember.extraProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, created, modified, number, name, ssNumber, address, contactDetail, password, group, tag, salesPerson, discount, paymentType, currencyCode, noVat, ledgerCode, points, bankAccount, creditCard, statistics, status, gender, paymentMode, hasConfirmedTerms, confirmedTermId, extraProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersMember {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ssNumber: ").append(toIndentedString(ssNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactDetail: ").append(toIndentedString(contactDetail)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    salesPerson: ").append(toIndentedString(salesPerson)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    noVat: ").append(toIndentedString(noVat)).append("\n");
    sb.append("    ledgerCode: ").append(toIndentedString(ledgerCode)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    hasConfirmedTerms: ").append(toIndentedString(hasConfirmedTerms)).append("\n");
    sb.append("    confirmedTermId: ").append(toIndentedString(confirmedTermId)).append("\n");
    sb.append("    extraProperties: ").append(toIndentedString(extraProperties)).append("\n");
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

