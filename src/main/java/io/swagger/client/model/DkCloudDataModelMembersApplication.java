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
import io.swagger.client.model.DkCloudDataModelGeneralDateRange;
import io.swagger.client.model.DkCloudDataModelMembersApplicationBankAccount;
import io.swagger.client.model.DkCloudDataModelMembersApplicationContact;
import io.swagger.client.model.DkCloudDataModelMembersApplicationDetail;
import io.swagger.client.model.DkCloudDataModelMembersMaternityLeave;
import io.swagger.client.model.DkCloudDataModelMembersWorkPlaceHistory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelMembersApplication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersApplication {
  @SerializedName("Member")
  private String member = null;

  @SerializedName("BankAccount")
  private DkCloudDataModelMembersApplicationBankAccount bankAccount = null;

  @SerializedName("Contact")
  private DkCloudDataModelMembersApplicationContact contact = null;

  @SerializedName("Fund")
  private String fund = null;

  @SerializedName("GrantDescription")
  private String grantDescription = null;

  @SerializedName("Grant")
  private String grant = null;

  @SerializedName("Purpose")
  private String purpose = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Number")
  private Integer number = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INPROGRESS("InProgress"),
    
    ACCEPTED("Accepted"),
    
    REJECTED("Rejected"),
    
    EXPIRED("Expired"),
    
    PARTLYPAID("PartlyPaid"),
    
    FULLYPAID("FullyPaid"),
    
    CLOSED("Closed"),
    
    PAYEDTOCOMPANY("PayedToCompany"),
    
    ONHOLD("OnHold"),
    
    INVALID("Invalid"),
    
    NOTFINISHED("NotFinished");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  /**
   * Gets or Sets managedBy
   */
  @JsonAdapter(ManagedByEnum.Adapter.class)
  public enum ManagedByEnum {
    EMPLOYEE("Employee"),
    
    MEETING("Meeting");

    private String value;

    ManagedByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ManagedByEnum fromValue(String text) {
      for (ManagedByEnum b : ManagedByEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ManagedByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ManagedByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ManagedByEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ManagedByEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ManagedBy")
  private ManagedByEnum managedBy = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("DateOfMeeting")
  private OffsetDateTime dateOfMeeting = null;

  @SerializedName("DenialCode")
  private String denialCode = null;

  @SerializedName("DenialCodeDescription")
  private String denialCodeDescription = null;

  @SerializedName("Group")
  private String group = null;

  @SerializedName("SubGroup")
  private String subGroup = null;

  @SerializedName("TotalAmount")
  private Double totalAmount = null;

  @SerializedName("Period")
  private DkCloudDataModelGeneralDateRange period = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Posted")
  private OffsetDateTime posted = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Text1")
  private String text1 = null;

  @SerializedName("Text2")
  private String text2 = null;

  @SerializedName("MembershipRulesOK")
  private Boolean membershipRulesOK = null;

  @SerializedName("GrantRulesOK")
  private Boolean grantRulesOK = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("JobRatio")
  private Double jobRatio = null;

  @SerializedName("PeriodDesc")
  private String periodDesc = null;

  @SerializedName("CommunicationMemo")
  private String communicationMemo = null;

  @SerializedName("GrantCount")
  private Integer grantCount = null;

  @SerializedName("UnitCount")
  private Integer unitCount = null;

  @SerializedName("Location")
  private String location = null;

  @SerializedName("PeriodDescription")
  private String periodDescription = null;

  @SerializedName("Organizer")
  private String organizer = null;

  @SerializedName("WorkPlace")
  private String workPlace = null;

  @SerializedName("WorkPlaceNumber")
  private String workPlaceNumber = null;

  @SerializedName("VoucherTag")
  private String voucherTag = null;

  @SerializedName("Details")
  private List<DkCloudDataModelMembersApplicationDetail> details = null;

  @SerializedName("WorkPlaceHistory")
  private List<DkCloudDataModelMembersWorkPlaceHistory> workPlaceHistory = null;

  @SerializedName("MaternityLeaves")
  private List<DkCloudDataModelMembersMaternityLeave> maternityLeaves = null;

  @SerializedName("AmountTraveled")
  private Double amountTraveled = null;

  @SerializedName("TravelCost")
  private Double travelCost = null;

  @SerializedName("CompanyID")
  private String companyID = null;

  @SerializedName("Attachments")
  private List<DkCloudDataModelGeneralAttachmentModel> attachments = null;

  @SerializedName("TermsConsentGiven")
  private Boolean termsConsentGiven = null;

  @SerializedName("TermId")
  private Integer termId = null;

  @SerializedName("ExtraProperties")
  private Map<String, String> extraProperties = null;

  public DkCloudDataModelMembersApplication member(String member) {
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")
  public String getMember() {
    return member;
  }

  public void setMember(String member) {
    this.member = member;
  }

  public DkCloudDataModelMembersApplication bankAccount(DkCloudDataModelMembersApplicationBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersApplicationBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(DkCloudDataModelMembersApplicationBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public DkCloudDataModelMembersApplication contact(DkCloudDataModelMembersApplicationContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelMembersApplicationContact getContact() {
    return contact;
  }

  public void setContact(DkCloudDataModelMembersApplicationContact contact) {
    this.contact = contact;
  }

  public DkCloudDataModelMembersApplication fund(String fund) {
    this.fund = fund;
    return this;
  }

   /**
   * Get fund
   * @return fund
  **/
  @ApiModelProperty(value = "")
  public String getFund() {
    return fund;
  }

  public void setFund(String fund) {
    this.fund = fund;
  }

  public DkCloudDataModelMembersApplication grantDescription(String grantDescription) {
    this.grantDescription = grantDescription;
    return this;
  }

   /**
   * Get grantDescription
   * @return grantDescription
  **/
  @ApiModelProperty(value = "")
  public String getGrantDescription() {
    return grantDescription;
  }

  public void setGrantDescription(String grantDescription) {
    this.grantDescription = grantDescription;
  }

  public DkCloudDataModelMembersApplication grant(String grant) {
    this.grant = grant;
    return this;
  }

   /**
   * Get grant
   * @return grant
  **/
  @ApiModelProperty(value = "")
  public String getGrant() {
    return grant;
  }

  public void setGrant(String grant) {
    this.grant = grant;
  }

  public DkCloudDataModelMembersApplication purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @ApiModelProperty(value = "")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public DkCloudDataModelMembersApplication description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DkCloudDataModelMembersApplication number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public DkCloudDataModelMembersApplication status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DkCloudDataModelMembersApplication managedBy(ManagedByEnum managedBy) {
    this.managedBy = managedBy;
    return this;
  }

   /**
   * Get managedBy
   * @return managedBy
  **/
  @ApiModelProperty(value = "")
  public ManagedByEnum getManagedBy() {
    return managedBy;
  }

  public void setManagedBy(ManagedByEnum managedBy) {
    this.managedBy = managedBy;
  }

  public DkCloudDataModelMembersApplication date(OffsetDateTime date) {
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

  public DkCloudDataModelMembersApplication dateOfMeeting(OffsetDateTime dateOfMeeting) {
    this.dateOfMeeting = dateOfMeeting;
    return this;
  }

   /**
   * Get dateOfMeeting
   * @return dateOfMeeting
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateOfMeeting() {
    return dateOfMeeting;
  }

  public void setDateOfMeeting(OffsetDateTime dateOfMeeting) {
    this.dateOfMeeting = dateOfMeeting;
  }

  public DkCloudDataModelMembersApplication denialCode(String denialCode) {
    this.denialCode = denialCode;
    return this;
  }

   /**
   * Get denialCode
   * @return denialCode
  **/
  @ApiModelProperty(value = "")
  public String getDenialCode() {
    return denialCode;
  }

  public void setDenialCode(String denialCode) {
    this.denialCode = denialCode;
  }

  public DkCloudDataModelMembersApplication denialCodeDescription(String denialCodeDescription) {
    this.denialCodeDescription = denialCodeDescription;
    return this;
  }

   /**
   * Get denialCodeDescription
   * @return denialCodeDescription
  **/
  @ApiModelProperty(value = "")
  public String getDenialCodeDescription() {
    return denialCodeDescription;
  }

  public void setDenialCodeDescription(String denialCodeDescription) {
    this.denialCodeDescription = denialCodeDescription;
  }

  public DkCloudDataModelMembersApplication group(String group) {
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

  public DkCloudDataModelMembersApplication subGroup(String subGroup) {
    this.subGroup = subGroup;
    return this;
  }

   /**
   * Get subGroup
   * @return subGroup
  **/
  @ApiModelProperty(value = "")
  public String getSubGroup() {
    return subGroup;
  }

  public void setSubGroup(String subGroup) {
    this.subGroup = subGroup;
  }

  public DkCloudDataModelMembersApplication totalAmount(Double totalAmount) {
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

  public DkCloudDataModelMembersApplication period(DkCloudDataModelGeneralDateRange period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelGeneralDateRange getPeriod() {
    return period;
  }

  public void setPeriod(DkCloudDataModelGeneralDateRange period) {
    this.period = period;
  }

  public DkCloudDataModelMembersApplication amount(Double amount) {
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

  public DkCloudDataModelMembersApplication posted(OffsetDateTime posted) {
    this.posted = posted;
    return this;
  }

   /**
   * Get posted
   * @return posted
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPosted() {
    return posted;
  }

  public void setPosted(OffsetDateTime posted) {
    this.posted = posted;
  }

  public DkCloudDataModelMembersApplication comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public DkCloudDataModelMembersApplication text1(String text1) {
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

  public DkCloudDataModelMembersApplication text2(String text2) {
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

  public DkCloudDataModelMembersApplication membershipRulesOK(Boolean membershipRulesOK) {
    this.membershipRulesOK = membershipRulesOK;
    return this;
  }

   /**
   * Get membershipRulesOK
   * @return membershipRulesOK
  **/
  @ApiModelProperty(value = "")
  public Boolean isMembershipRulesOK() {
    return membershipRulesOK;
  }

  public void setMembershipRulesOK(Boolean membershipRulesOK) {
    this.membershipRulesOK = membershipRulesOK;
  }

  public DkCloudDataModelMembersApplication grantRulesOK(Boolean grantRulesOK) {
    this.grantRulesOK = grantRulesOK;
    return this;
  }

   /**
   * Get grantRulesOK
   * @return grantRulesOK
  **/
  @ApiModelProperty(value = "")
  public Boolean isGrantRulesOK() {
    return grantRulesOK;
  }

  public void setGrantRulesOK(Boolean grantRulesOK) {
    this.grantRulesOK = grantRulesOK;
  }

  public DkCloudDataModelMembersApplication reference(String reference) {
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

  public DkCloudDataModelMembersApplication jobRatio(Double jobRatio) {
    this.jobRatio = jobRatio;
    return this;
  }

   /**
   * Get jobRatio
   * @return jobRatio
  **/
  @ApiModelProperty(value = "")
  public Double getJobRatio() {
    return jobRatio;
  }

  public void setJobRatio(Double jobRatio) {
    this.jobRatio = jobRatio;
  }

  public DkCloudDataModelMembersApplication periodDesc(String periodDesc) {
    this.periodDesc = periodDesc;
    return this;
  }

   /**
   * Get periodDesc
   * @return periodDesc
  **/
  @ApiModelProperty(value = "")
  public String getPeriodDesc() {
    return periodDesc;
  }

  public void setPeriodDesc(String periodDesc) {
    this.periodDesc = periodDesc;
  }

  public DkCloudDataModelMembersApplication communicationMemo(String communicationMemo) {
    this.communicationMemo = communicationMemo;
    return this;
  }

   /**
   * Get communicationMemo
   * @return communicationMemo
  **/
  @ApiModelProperty(value = "")
  public String getCommunicationMemo() {
    return communicationMemo;
  }

  public void setCommunicationMemo(String communicationMemo) {
    this.communicationMemo = communicationMemo;
  }

  public DkCloudDataModelMembersApplication grantCount(Integer grantCount) {
    this.grantCount = grantCount;
    return this;
  }

   /**
   * Get grantCount
   * @return grantCount
  **/
  @ApiModelProperty(value = "")
  public Integer getGrantCount() {
    return grantCount;
  }

  public void setGrantCount(Integer grantCount) {
    this.grantCount = grantCount;
  }

  public DkCloudDataModelMembersApplication unitCount(Integer unitCount) {
    this.unitCount = unitCount;
    return this;
  }

   /**
   * Get unitCount
   * @return unitCount
  **/
  @ApiModelProperty(value = "")
  public Integer getUnitCount() {
    return unitCount;
  }

  public void setUnitCount(Integer unitCount) {
    this.unitCount = unitCount;
  }

  public DkCloudDataModelMembersApplication location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public DkCloudDataModelMembersApplication periodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
    return this;
  }

   /**
   * Get periodDescription
   * @return periodDescription
  **/
  @ApiModelProperty(value = "")
  public String getPeriodDescription() {
    return periodDescription;
  }

  public void setPeriodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
  }

  public DkCloudDataModelMembersApplication organizer(String organizer) {
    this.organizer = organizer;
    return this;
  }

   /**
   * Get organizer
   * @return organizer
  **/
  @ApiModelProperty(value = "")
  public String getOrganizer() {
    return organizer;
  }

  public void setOrganizer(String organizer) {
    this.organizer = organizer;
  }

  public DkCloudDataModelMembersApplication workPlace(String workPlace) {
    this.workPlace = workPlace;
    return this;
  }

   /**
   * Get workPlace
   * @return workPlace
  **/
  @ApiModelProperty(value = "")
  public String getWorkPlace() {
    return workPlace;
  }

  public void setWorkPlace(String workPlace) {
    this.workPlace = workPlace;
  }

  public DkCloudDataModelMembersApplication workPlaceNumber(String workPlaceNumber) {
    this.workPlaceNumber = workPlaceNumber;
    return this;
  }

   /**
   * Get workPlaceNumber
   * @return workPlaceNumber
  **/
  @ApiModelProperty(value = "")
  public String getWorkPlaceNumber() {
    return workPlaceNumber;
  }

  public void setWorkPlaceNumber(String workPlaceNumber) {
    this.workPlaceNumber = workPlaceNumber;
  }

  public DkCloudDataModelMembersApplication voucherTag(String voucherTag) {
    this.voucherTag = voucherTag;
    return this;
  }

   /**
   * Get voucherTag
   * @return voucherTag
  **/
  @ApiModelProperty(value = "")
  public String getVoucherTag() {
    return voucherTag;
  }

  public void setVoucherTag(String voucherTag) {
    this.voucherTag = voucherTag;
  }

  public DkCloudDataModelMembersApplication details(List<DkCloudDataModelMembersApplicationDetail> details) {
    this.details = details;
    return this;
  }

  public DkCloudDataModelMembersApplication addDetailsItem(DkCloudDataModelMembersApplicationDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<DkCloudDataModelMembersApplicationDetail>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelMembersApplicationDetail> getDetails() {
    return details;
  }

  public void setDetails(List<DkCloudDataModelMembersApplicationDetail> details) {
    this.details = details;
  }

  public DkCloudDataModelMembersApplication workPlaceHistory(List<DkCloudDataModelMembersWorkPlaceHistory> workPlaceHistory) {
    this.workPlaceHistory = workPlaceHistory;
    return this;
  }

  public DkCloudDataModelMembersApplication addWorkPlaceHistoryItem(DkCloudDataModelMembersWorkPlaceHistory workPlaceHistoryItem) {
    if (this.workPlaceHistory == null) {
      this.workPlaceHistory = new ArrayList<DkCloudDataModelMembersWorkPlaceHistory>();
    }
    this.workPlaceHistory.add(workPlaceHistoryItem);
    return this;
  }

   /**
   * Get workPlaceHistory
   * @return workPlaceHistory
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelMembersWorkPlaceHistory> getWorkPlaceHistory() {
    return workPlaceHistory;
  }

  public void setWorkPlaceHistory(List<DkCloudDataModelMembersWorkPlaceHistory> workPlaceHistory) {
    this.workPlaceHistory = workPlaceHistory;
  }

  public DkCloudDataModelMembersApplication maternityLeaves(List<DkCloudDataModelMembersMaternityLeave> maternityLeaves) {
    this.maternityLeaves = maternityLeaves;
    return this;
  }

  public DkCloudDataModelMembersApplication addMaternityLeavesItem(DkCloudDataModelMembersMaternityLeave maternityLeavesItem) {
    if (this.maternityLeaves == null) {
      this.maternityLeaves = new ArrayList<DkCloudDataModelMembersMaternityLeave>();
    }
    this.maternityLeaves.add(maternityLeavesItem);
    return this;
  }

   /**
   * Get maternityLeaves
   * @return maternityLeaves
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelMembersMaternityLeave> getMaternityLeaves() {
    return maternityLeaves;
  }

  public void setMaternityLeaves(List<DkCloudDataModelMembersMaternityLeave> maternityLeaves) {
    this.maternityLeaves = maternityLeaves;
  }

  public DkCloudDataModelMembersApplication amountTraveled(Double amountTraveled) {
    this.amountTraveled = amountTraveled;
    return this;
  }

   /**
   * Get amountTraveled
   * @return amountTraveled
  **/
  @ApiModelProperty(value = "")
  public Double getAmountTraveled() {
    return amountTraveled;
  }

  public void setAmountTraveled(Double amountTraveled) {
    this.amountTraveled = amountTraveled;
  }

  public DkCloudDataModelMembersApplication travelCost(Double travelCost) {
    this.travelCost = travelCost;
    return this;
  }

   /**
   * Get travelCost
   * @return travelCost
  **/
  @ApiModelProperty(value = "")
  public Double getTravelCost() {
    return travelCost;
  }

  public void setTravelCost(Double travelCost) {
    this.travelCost = travelCost;
  }

  public DkCloudDataModelMembersApplication companyID(String companyID) {
    this.companyID = companyID;
    return this;
  }

   /**
   * Get companyID
   * @return companyID
  **/
  @ApiModelProperty(value = "")
  public String getCompanyID() {
    return companyID;
  }

  public void setCompanyID(String companyID) {
    this.companyID = companyID;
  }

  public DkCloudDataModelMembersApplication attachments(List<DkCloudDataModelGeneralAttachmentModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public DkCloudDataModelMembersApplication addAttachmentsItem(DkCloudDataModelGeneralAttachmentModel attachmentsItem) {
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

  public DkCloudDataModelMembersApplication termsConsentGiven(Boolean termsConsentGiven) {
    this.termsConsentGiven = termsConsentGiven;
    return this;
  }

   /**
   * Get termsConsentGiven
   * @return termsConsentGiven
  **/
  @ApiModelProperty(value = "")
  public Boolean isTermsConsentGiven() {
    return termsConsentGiven;
  }

  public void setTermsConsentGiven(Boolean termsConsentGiven) {
    this.termsConsentGiven = termsConsentGiven;
  }

  public DkCloudDataModelMembersApplication termId(Integer termId) {
    this.termId = termId;
    return this;
  }

   /**
   * Get termId
   * @return termId
  **/
  @ApiModelProperty(value = "")
  public Integer getTermId() {
    return termId;
  }

  public void setTermId(Integer termId) {
    this.termId = termId;
  }

  public DkCloudDataModelMembersApplication extraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
    return this;
  }

  public DkCloudDataModelMembersApplication putExtraPropertiesItem(String key, String extraPropertiesItem) {
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
    DkCloudDataModelMembersApplication dkCloudDataModelMembersApplication = (DkCloudDataModelMembersApplication) o;
    return Objects.equals(this.member, dkCloudDataModelMembersApplication.member) &&
        Objects.equals(this.bankAccount, dkCloudDataModelMembersApplication.bankAccount) &&
        Objects.equals(this.contact, dkCloudDataModelMembersApplication.contact) &&
        Objects.equals(this.fund, dkCloudDataModelMembersApplication.fund) &&
        Objects.equals(this.grantDescription, dkCloudDataModelMembersApplication.grantDescription) &&
        Objects.equals(this.grant, dkCloudDataModelMembersApplication.grant) &&
        Objects.equals(this.purpose, dkCloudDataModelMembersApplication.purpose) &&
        Objects.equals(this.description, dkCloudDataModelMembersApplication.description) &&
        Objects.equals(this.number, dkCloudDataModelMembersApplication.number) &&
        Objects.equals(this.status, dkCloudDataModelMembersApplication.status) &&
        Objects.equals(this.managedBy, dkCloudDataModelMembersApplication.managedBy) &&
        Objects.equals(this.date, dkCloudDataModelMembersApplication.date) &&
        Objects.equals(this.dateOfMeeting, dkCloudDataModelMembersApplication.dateOfMeeting) &&
        Objects.equals(this.denialCode, dkCloudDataModelMembersApplication.denialCode) &&
        Objects.equals(this.denialCodeDescription, dkCloudDataModelMembersApplication.denialCodeDescription) &&
        Objects.equals(this.group, dkCloudDataModelMembersApplication.group) &&
        Objects.equals(this.subGroup, dkCloudDataModelMembersApplication.subGroup) &&
        Objects.equals(this.totalAmount, dkCloudDataModelMembersApplication.totalAmount) &&
        Objects.equals(this.period, dkCloudDataModelMembersApplication.period) &&
        Objects.equals(this.amount, dkCloudDataModelMembersApplication.amount) &&
        Objects.equals(this.posted, dkCloudDataModelMembersApplication.posted) &&
        Objects.equals(this.comment, dkCloudDataModelMembersApplication.comment) &&
        Objects.equals(this.text1, dkCloudDataModelMembersApplication.text1) &&
        Objects.equals(this.text2, dkCloudDataModelMembersApplication.text2) &&
        Objects.equals(this.membershipRulesOK, dkCloudDataModelMembersApplication.membershipRulesOK) &&
        Objects.equals(this.grantRulesOK, dkCloudDataModelMembersApplication.grantRulesOK) &&
        Objects.equals(this.reference, dkCloudDataModelMembersApplication.reference) &&
        Objects.equals(this.jobRatio, dkCloudDataModelMembersApplication.jobRatio) &&
        Objects.equals(this.periodDesc, dkCloudDataModelMembersApplication.periodDesc) &&
        Objects.equals(this.communicationMemo, dkCloudDataModelMembersApplication.communicationMemo) &&
        Objects.equals(this.grantCount, dkCloudDataModelMembersApplication.grantCount) &&
        Objects.equals(this.unitCount, dkCloudDataModelMembersApplication.unitCount) &&
        Objects.equals(this.location, dkCloudDataModelMembersApplication.location) &&
        Objects.equals(this.periodDescription, dkCloudDataModelMembersApplication.periodDescription) &&
        Objects.equals(this.organizer, dkCloudDataModelMembersApplication.organizer) &&
        Objects.equals(this.workPlace, dkCloudDataModelMembersApplication.workPlace) &&
        Objects.equals(this.workPlaceNumber, dkCloudDataModelMembersApplication.workPlaceNumber) &&
        Objects.equals(this.voucherTag, dkCloudDataModelMembersApplication.voucherTag) &&
        Objects.equals(this.details, dkCloudDataModelMembersApplication.details) &&
        Objects.equals(this.workPlaceHistory, dkCloudDataModelMembersApplication.workPlaceHistory) &&
        Objects.equals(this.maternityLeaves, dkCloudDataModelMembersApplication.maternityLeaves) &&
        Objects.equals(this.amountTraveled, dkCloudDataModelMembersApplication.amountTraveled) &&
        Objects.equals(this.travelCost, dkCloudDataModelMembersApplication.travelCost) &&
        Objects.equals(this.companyID, dkCloudDataModelMembersApplication.companyID) &&
        Objects.equals(this.attachments, dkCloudDataModelMembersApplication.attachments) &&
        Objects.equals(this.termsConsentGiven, dkCloudDataModelMembersApplication.termsConsentGiven) &&
        Objects.equals(this.termId, dkCloudDataModelMembersApplication.termId) &&
        Objects.equals(this.extraProperties, dkCloudDataModelMembersApplication.extraProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(member, bankAccount, contact, fund, grantDescription, grant, purpose, description, number, status, managedBy, date, dateOfMeeting, denialCode, denialCodeDescription, group, subGroup, totalAmount, period, amount, posted, comment, text1, text2, membershipRulesOK, grantRulesOK, reference, jobRatio, periodDesc, communicationMemo, grantCount, unitCount, location, periodDescription, organizer, workPlace, workPlaceNumber, voucherTag, details, workPlaceHistory, maternityLeaves, amountTraveled, travelCost, companyID, attachments, termsConsentGiven, termId, extraProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersApplication {\n");
    
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    grantDescription: ").append(toIndentedString(grantDescription)).append("\n");
    sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateOfMeeting: ").append(toIndentedString(dateOfMeeting)).append("\n");
    sb.append("    denialCode: ").append(toIndentedString(denialCode)).append("\n");
    sb.append("    denialCodeDescription: ").append(toIndentedString(denialCodeDescription)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    subGroup: ").append(toIndentedString(subGroup)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    posted: ").append(toIndentedString(posted)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    text1: ").append(toIndentedString(text1)).append("\n");
    sb.append("    text2: ").append(toIndentedString(text2)).append("\n");
    sb.append("    membershipRulesOK: ").append(toIndentedString(membershipRulesOK)).append("\n");
    sb.append("    grantRulesOK: ").append(toIndentedString(grantRulesOK)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    jobRatio: ").append(toIndentedString(jobRatio)).append("\n");
    sb.append("    periodDesc: ").append(toIndentedString(periodDesc)).append("\n");
    sb.append("    communicationMemo: ").append(toIndentedString(communicationMemo)).append("\n");
    sb.append("    grantCount: ").append(toIndentedString(grantCount)).append("\n");
    sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    periodDescription: ").append(toIndentedString(periodDescription)).append("\n");
    sb.append("    organizer: ").append(toIndentedString(organizer)).append("\n");
    sb.append("    workPlace: ").append(toIndentedString(workPlace)).append("\n");
    sb.append("    workPlaceNumber: ").append(toIndentedString(workPlaceNumber)).append("\n");
    sb.append("    voucherTag: ").append(toIndentedString(voucherTag)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    workPlaceHistory: ").append(toIndentedString(workPlaceHistory)).append("\n");
    sb.append("    maternityLeaves: ").append(toIndentedString(maternityLeaves)).append("\n");
    sb.append("    amountTraveled: ").append(toIndentedString(amountTraveled)).append("\n");
    sb.append("    travelCost: ").append(toIndentedString(travelCost)).append("\n");
    sb.append("    companyID: ").append(toIndentedString(companyID)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    termsConsentGiven: ").append(toIndentedString(termsConsentGiven)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
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

