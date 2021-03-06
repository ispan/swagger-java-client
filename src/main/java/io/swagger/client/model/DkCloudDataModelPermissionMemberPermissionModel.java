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

/**
 * DkCloudDataModelPermissionMemberPermissionModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelPermissionMemberPermissionModel {
  /**
   * Gets or Sets members
   */
  @JsonAdapter(MembersEnum.Adapter.class)
  public enum MembersEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    MembersEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MembersEnum fromValue(String text) {
      for (MembersEnum b : MembersEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MembersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MembersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MembersEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MembersEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Members")
  private MembersEnum members = null;

  /**
   * Gets or Sets memberDashboard
   */
  @JsonAdapter(MemberDashboardEnum.Adapter.class)
  public enum MemberDashboardEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    MemberDashboardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MemberDashboardEnum fromValue(String text) {
      for (MemberDashboardEnum b : MemberDashboardEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MemberDashboardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MemberDashboardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MemberDashboardEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MemberDashboardEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("MemberDashboard")
  private MemberDashboardEnum memberDashboard = null;

  /**
   * Gets or Sets groups
   */
  @JsonAdapter(GroupsEnum.Adapter.class)
  public enum GroupsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    GroupsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GroupsEnum fromValue(String text) {
      for (GroupsEnum b : GroupsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GroupsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GroupsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Groups")
  private GroupsEnum groups = null;

  /**
   * Gets or Sets invoices
   */
  @JsonAdapter(InvoicesEnum.Adapter.class)
  public enum InvoicesEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    InvoicesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InvoicesEnum fromValue(String text) {
      for (InvoicesEnum b : InvoicesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InvoicesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvoicesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InvoicesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InvoicesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Invoices")
  private InvoicesEnum invoices = null;

  /**
   * Gets or Sets carrier
   */
  @JsonAdapter(CarrierEnum.Adapter.class)
  public enum CarrierEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    CarrierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CarrierEnum fromValue(String text) {
      for (CarrierEnum b : CarrierEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CarrierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CarrierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CarrierEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CarrierEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Carrier")
  private CarrierEnum carrier = null;

  /**
   * Gets or Sets subGroups
   */
  @JsonAdapter(SubGroupsEnum.Adapter.class)
  public enum SubGroupsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    SubGroupsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubGroupsEnum fromValue(String text) {
      for (SubGroupsEnum b : SubGroupsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubGroupsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubGroupsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubGroupsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubGroupsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SubGroups")
  private SubGroupsEnum subGroups = null;

  /**
   * Gets or Sets membership
   */
  @JsonAdapter(MembershipEnum.Adapter.class)
  public enum MembershipEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    MembershipEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MembershipEnum fromValue(String text) {
      for (MembershipEnum b : MembershipEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MembershipEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MembershipEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MembershipEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MembershipEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Membership")
  private MembershipEnum membership = null;

  /**
   * Gets or Sets education
   */
  @JsonAdapter(EducationEnum.Adapter.class)
  public enum EducationEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    EducationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EducationEnum fromValue(String text) {
      for (EducationEnum b : EducationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EducationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EducationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EducationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EducationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Education")
  private EducationEnum education = null;

  /**
   * Gets or Sets applications
   */
  @JsonAdapter(ApplicationsEnum.Adapter.class)
  public enum ApplicationsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    ApplicationsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationsEnum fromValue(String text) {
      for (ApplicationsEnum b : ApplicationsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApplicationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApplicationsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Applications")
  private ApplicationsEnum applications = null;

  /**
   * Gets or Sets fundPayments
   */
  @JsonAdapter(FundPaymentsEnum.Adapter.class)
  public enum FundPaymentsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    FundPaymentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FundPaymentsEnum fromValue(String text) {
      for (FundPaymentsEnum b : FundPaymentsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FundPaymentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FundPaymentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FundPaymentsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FundPaymentsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("FundPayments")
  private FundPaymentsEnum fundPayments = null;

  /**
   * Gets or Sets statistics
   */
  @JsonAdapter(StatisticsEnum.Adapter.class)
  public enum StatisticsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    StatisticsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatisticsEnum fromValue(String text) {
      for (StatisticsEnum b : StatisticsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatisticsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatisticsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatisticsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatisticsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Statistics")
  private StatisticsEnum statistics = null;

  /**
   * Gets or Sets resume
   */
  @JsonAdapter(ResumeEnum.Adapter.class)
  public enum ResumeEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    ResumeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResumeEnum fromValue(String text) {
      for (ResumeEnum b : ResumeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResumeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResumeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResumeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResumeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Resume")
  private ResumeEnum resume = null;

  /**
   * Gets or Sets settings
   */
  @JsonAdapter(SettingsEnum.Adapter.class)
  public enum SettingsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    SettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SettingsEnum fromValue(String text) {
      for (SettingsEnum b : SettingsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SettingsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Settings")
  private SettingsEnum settings = null;

  /**
   * Gets or Sets enabled
   */
  @JsonAdapter(EnabledEnum.Adapter.class)
  public enum EnabledEnum {
    ENABLED("Enabled"),
    
    DISABLED("Disabled"),
    
    BLOCKED("Blocked");

    private String value;

    EnabledEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnabledEnum fromValue(String text) {
      for (EnabledEnum b : EnabledEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EnabledEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnabledEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnabledEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnabledEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Enabled")
  private EnabledEnum enabled = null;

  public DkCloudDataModelPermissionMemberPermissionModel members(MembersEnum members) {
    this.members = members;
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(value = "")
  public MembersEnum getMembers() {
    return members;
  }

  public void setMembers(MembersEnum members) {
    this.members = members;
  }

  public DkCloudDataModelPermissionMemberPermissionModel memberDashboard(MemberDashboardEnum memberDashboard) {
    this.memberDashboard = memberDashboard;
    return this;
  }

   /**
   * Get memberDashboard
   * @return memberDashboard
  **/
  @ApiModelProperty(value = "")
  public MemberDashboardEnum getMemberDashboard() {
    return memberDashboard;
  }

  public void setMemberDashboard(MemberDashboardEnum memberDashboard) {
    this.memberDashboard = memberDashboard;
  }

  public DkCloudDataModelPermissionMemberPermissionModel groups(GroupsEnum groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public GroupsEnum getGroups() {
    return groups;
  }

  public void setGroups(GroupsEnum groups) {
    this.groups = groups;
  }

  public DkCloudDataModelPermissionMemberPermissionModel invoices(InvoicesEnum invoices) {
    this.invoices = invoices;
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")
  public InvoicesEnum getInvoices() {
    return invoices;
  }

  public void setInvoices(InvoicesEnum invoices) {
    this.invoices = invoices;
  }

  public DkCloudDataModelPermissionMemberPermissionModel carrier(CarrierEnum carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(value = "")
  public CarrierEnum getCarrier() {
    return carrier;
  }

  public void setCarrier(CarrierEnum carrier) {
    this.carrier = carrier;
  }

  public DkCloudDataModelPermissionMemberPermissionModel subGroups(SubGroupsEnum subGroups) {
    this.subGroups = subGroups;
    return this;
  }

   /**
   * Get subGroups
   * @return subGroups
  **/
  @ApiModelProperty(value = "")
  public SubGroupsEnum getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(SubGroupsEnum subGroups) {
    this.subGroups = subGroups;
  }

  public DkCloudDataModelPermissionMemberPermissionModel membership(MembershipEnum membership) {
    this.membership = membership;
    return this;
  }

   /**
   * Get membership
   * @return membership
  **/
  @ApiModelProperty(value = "")
  public MembershipEnum getMembership() {
    return membership;
  }

  public void setMembership(MembershipEnum membership) {
    this.membership = membership;
  }

  public DkCloudDataModelPermissionMemberPermissionModel education(EducationEnum education) {
    this.education = education;
    return this;
  }

   /**
   * Get education
   * @return education
  **/
  @ApiModelProperty(value = "")
  public EducationEnum getEducation() {
    return education;
  }

  public void setEducation(EducationEnum education) {
    this.education = education;
  }

  public DkCloudDataModelPermissionMemberPermissionModel applications(ApplicationsEnum applications) {
    this.applications = applications;
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @ApiModelProperty(value = "")
  public ApplicationsEnum getApplications() {
    return applications;
  }

  public void setApplications(ApplicationsEnum applications) {
    this.applications = applications;
  }

  public DkCloudDataModelPermissionMemberPermissionModel fundPayments(FundPaymentsEnum fundPayments) {
    this.fundPayments = fundPayments;
    return this;
  }

   /**
   * Get fundPayments
   * @return fundPayments
  **/
  @ApiModelProperty(value = "")
  public FundPaymentsEnum getFundPayments() {
    return fundPayments;
  }

  public void setFundPayments(FundPaymentsEnum fundPayments) {
    this.fundPayments = fundPayments;
  }

  public DkCloudDataModelPermissionMemberPermissionModel statistics(StatisticsEnum statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public StatisticsEnum getStatistics() {
    return statistics;
  }

  public void setStatistics(StatisticsEnum statistics) {
    this.statistics = statistics;
  }

  public DkCloudDataModelPermissionMemberPermissionModel resume(ResumeEnum resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Get resume
   * @return resume
  **/
  @ApiModelProperty(value = "")
  public ResumeEnum getResume() {
    return resume;
  }

  public void setResume(ResumeEnum resume) {
    this.resume = resume;
  }

  public DkCloudDataModelPermissionMemberPermissionModel settings(SettingsEnum settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public SettingsEnum getSettings() {
    return settings;
  }

  public void setSettings(SettingsEnum settings) {
    this.settings = settings;
  }

  public DkCloudDataModelPermissionMemberPermissionModel enabled(EnabledEnum enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public EnabledEnum getEnabled() {
    return enabled;
  }

  public void setEnabled(EnabledEnum enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelPermissionMemberPermissionModel dkCloudDataModelPermissionMemberPermissionModel = (DkCloudDataModelPermissionMemberPermissionModel) o;
    return Objects.equals(this.members, dkCloudDataModelPermissionMemberPermissionModel.members) &&
        Objects.equals(this.memberDashboard, dkCloudDataModelPermissionMemberPermissionModel.memberDashboard) &&
        Objects.equals(this.groups, dkCloudDataModelPermissionMemberPermissionModel.groups) &&
        Objects.equals(this.invoices, dkCloudDataModelPermissionMemberPermissionModel.invoices) &&
        Objects.equals(this.carrier, dkCloudDataModelPermissionMemberPermissionModel.carrier) &&
        Objects.equals(this.subGroups, dkCloudDataModelPermissionMemberPermissionModel.subGroups) &&
        Objects.equals(this.membership, dkCloudDataModelPermissionMemberPermissionModel.membership) &&
        Objects.equals(this.education, dkCloudDataModelPermissionMemberPermissionModel.education) &&
        Objects.equals(this.applications, dkCloudDataModelPermissionMemberPermissionModel.applications) &&
        Objects.equals(this.fundPayments, dkCloudDataModelPermissionMemberPermissionModel.fundPayments) &&
        Objects.equals(this.statistics, dkCloudDataModelPermissionMemberPermissionModel.statistics) &&
        Objects.equals(this.resume, dkCloudDataModelPermissionMemberPermissionModel.resume) &&
        Objects.equals(this.settings, dkCloudDataModelPermissionMemberPermissionModel.settings) &&
        Objects.equals(this.enabled, dkCloudDataModelPermissionMemberPermissionModel.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, memberDashboard, groups, invoices, carrier, subGroups, membership, education, applications, fundPayments, statistics, resume, settings, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelPermissionMemberPermissionModel {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    memberDashboard: ").append(toIndentedString(memberDashboard)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    subGroups: ").append(toIndentedString(subGroups)).append("\n");
    sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    fundPayments: ").append(toIndentedString(fundPayments)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

