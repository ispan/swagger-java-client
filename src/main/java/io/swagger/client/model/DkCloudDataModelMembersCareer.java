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
import io.swagger.client.model.DkCloudDataModelGeneralDateRange;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DkCloudDataModelMembersCareer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersCareer {
  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("Company")
  private String company = null;

  @SerializedName("JobTitleCode")
  private String jobTitleCode = null;

  @SerializedName("JobTitle")
  private String jobTitle = null;

  @SerializedName("Period")
  private DkCloudDataModelGeneralDateRange period = null;

  @SerializedName("WorkPercentage")
  private Double workPercentage = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Workplace")
  private String workplace = null;

  @SerializedName("WorkplaceName")
  private String workplaceName = null;

  @SerializedName("CompanyName")
  private String companyName = null;

  @SerializedName("ExtraProperties")
  private Map<String, String> extraProperties = null;

  public DkCloudDataModelMembersCareer ID(Integer ID) {
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

  public DkCloudDataModelMembersCareer company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public DkCloudDataModelMembersCareer jobTitleCode(String jobTitleCode) {
    this.jobTitleCode = jobTitleCode;
    return this;
  }

   /**
   * Get jobTitleCode
   * @return jobTitleCode
  **/
  @ApiModelProperty(value = "")
  public String getJobTitleCode() {
    return jobTitleCode;
  }

  public void setJobTitleCode(String jobTitleCode) {
    this.jobTitleCode = jobTitleCode;
  }

  public DkCloudDataModelMembersCareer jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public DkCloudDataModelMembersCareer period(DkCloudDataModelGeneralDateRange period) {
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

  public DkCloudDataModelMembersCareer workPercentage(Double workPercentage) {
    this.workPercentage = workPercentage;
    return this;
  }

   /**
   * Get workPercentage
   * @return workPercentage
  **/
  @ApiModelProperty(value = "")
  public Double getWorkPercentage() {
    return workPercentage;
  }

  public void setWorkPercentage(Double workPercentage) {
    this.workPercentage = workPercentage;
  }

  public DkCloudDataModelMembersCareer description(String description) {
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

  public DkCloudDataModelMembersCareer workplace(String workplace) {
    this.workplace = workplace;
    return this;
  }

   /**
   * Get workplace
   * @return workplace
  **/
  @ApiModelProperty(value = "")
  public String getWorkplace() {
    return workplace;
  }

  public void setWorkplace(String workplace) {
    this.workplace = workplace;
  }

  public DkCloudDataModelMembersCareer workplaceName(String workplaceName) {
    this.workplaceName = workplaceName;
    return this;
  }

   /**
   * Get workplaceName
   * @return workplaceName
  **/
  @ApiModelProperty(value = "")
  public String getWorkplaceName() {
    return workplaceName;
  }

  public void setWorkplaceName(String workplaceName) {
    this.workplaceName = workplaceName;
  }

  public DkCloudDataModelMembersCareer companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public DkCloudDataModelMembersCareer extraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
    return this;
  }

  public DkCloudDataModelMembersCareer putExtraPropertiesItem(String key, String extraPropertiesItem) {
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
    DkCloudDataModelMembersCareer dkCloudDataModelMembersCareer = (DkCloudDataModelMembersCareer) o;
    return Objects.equals(this.ID, dkCloudDataModelMembersCareer.ID) &&
        Objects.equals(this.company, dkCloudDataModelMembersCareer.company) &&
        Objects.equals(this.jobTitleCode, dkCloudDataModelMembersCareer.jobTitleCode) &&
        Objects.equals(this.jobTitle, dkCloudDataModelMembersCareer.jobTitle) &&
        Objects.equals(this.period, dkCloudDataModelMembersCareer.period) &&
        Objects.equals(this.workPercentage, dkCloudDataModelMembersCareer.workPercentage) &&
        Objects.equals(this.description, dkCloudDataModelMembersCareer.description) &&
        Objects.equals(this.workplace, dkCloudDataModelMembersCareer.workplace) &&
        Objects.equals(this.workplaceName, dkCloudDataModelMembersCareer.workplaceName) &&
        Objects.equals(this.companyName, dkCloudDataModelMembersCareer.companyName) &&
        Objects.equals(this.extraProperties, dkCloudDataModelMembersCareer.extraProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, company, jobTitleCode, jobTitle, period, workPercentage, description, workplace, workplaceName, companyName, extraProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersCareer {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    jobTitleCode: ").append(toIndentedString(jobTitleCode)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    workPercentage: ").append(toIndentedString(workPercentage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    workplace: ").append(toIndentedString(workplace)).append("\n");
    sb.append("    workplaceName: ").append(toIndentedString(workplaceName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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
