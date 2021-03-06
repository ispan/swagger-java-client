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
 * DkCloudDataModelMembersResume
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersResume {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Description2")
  private String description2 = null;

  @SerializedName("Group")
  private String group = null;

  @SerializedName("ResumeType")
  private String resumeType = null;

  @SerializedName("Period")
  private DkCloudDataModelGeneralDateRange period = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("ExtraProperties")
  private Map<String, String> extraProperties = null;

  public DkCloudDataModelMembersResume description(String description) {
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

  public DkCloudDataModelMembersResume description2(String description2) {
    this.description2 = description2;
    return this;
  }

   /**
   * Get description2
   * @return description2
  **/
  @ApiModelProperty(value = "")
  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public DkCloudDataModelMembersResume group(String group) {
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

  public DkCloudDataModelMembersResume resumeType(String resumeType) {
    this.resumeType = resumeType;
    return this;
  }

   /**
   * Get resumeType
   * @return resumeType
  **/
  @ApiModelProperty(value = "")
  public String getResumeType() {
    return resumeType;
  }

  public void setResumeType(String resumeType) {
    this.resumeType = resumeType;
  }

  public DkCloudDataModelMembersResume period(DkCloudDataModelGeneralDateRange period) {
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

  public DkCloudDataModelMembersResume reference(String reference) {
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

  public DkCloudDataModelMembersResume extraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
    return this;
  }

  public DkCloudDataModelMembersResume putExtraPropertiesItem(String key, String extraPropertiesItem) {
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
    DkCloudDataModelMembersResume dkCloudDataModelMembersResume = (DkCloudDataModelMembersResume) o;
    return Objects.equals(this.description, dkCloudDataModelMembersResume.description) &&
        Objects.equals(this.description2, dkCloudDataModelMembersResume.description2) &&
        Objects.equals(this.group, dkCloudDataModelMembersResume.group) &&
        Objects.equals(this.resumeType, dkCloudDataModelMembersResume.resumeType) &&
        Objects.equals(this.period, dkCloudDataModelMembersResume.period) &&
        Objects.equals(this.reference, dkCloudDataModelMembersResume.reference) &&
        Objects.equals(this.extraProperties, dkCloudDataModelMembersResume.extraProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, description2, group, resumeType, period, reference, extraProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersResume {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    resumeType: ").append(toIndentedString(resumeType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

