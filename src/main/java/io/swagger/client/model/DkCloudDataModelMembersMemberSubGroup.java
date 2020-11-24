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

/**
 * DkCloudDataModelMembersMemberSubGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersMemberSubGroup {
  @SerializedName("Group")
  private String group = null;

  @SerializedName("SubGroup")
  private String subGroup = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("GroupDescription")
  private String groupDescription = null;

  @SerializedName("DefaultItemCode")
  private String defaultItemCode = null;

  @SerializedName("ExtraProperties")
  private Map<String, String> extraProperties = null;

  public DkCloudDataModelMembersMemberSubGroup group(String group) {
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

  public DkCloudDataModelMembersMemberSubGroup subGroup(String subGroup) {
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

  public DkCloudDataModelMembersMemberSubGroup description(String description) {
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

  public DkCloudDataModelMembersMemberSubGroup groupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
    return this;
  }

   /**
   * Get groupDescription
   * @return groupDescription
  **/
  @ApiModelProperty(value = "")
  public String getGroupDescription() {
    return groupDescription;
  }

  public void setGroupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
  }

  public DkCloudDataModelMembersMemberSubGroup defaultItemCode(String defaultItemCode) {
    this.defaultItemCode = defaultItemCode;
    return this;
  }

   /**
   * Get defaultItemCode
   * @return defaultItemCode
  **/
  @ApiModelProperty(value = "")
  public String getDefaultItemCode() {
    return defaultItemCode;
  }

  public void setDefaultItemCode(String defaultItemCode) {
    this.defaultItemCode = defaultItemCode;
  }

  public DkCloudDataModelMembersMemberSubGroup extraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
    return this;
  }

  public DkCloudDataModelMembersMemberSubGroup putExtraPropertiesItem(String key, String extraPropertiesItem) {
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
    DkCloudDataModelMembersMemberSubGroup dkCloudDataModelMembersMemberSubGroup = (DkCloudDataModelMembersMemberSubGroup) o;
    return Objects.equals(this.group, dkCloudDataModelMembersMemberSubGroup.group) &&
        Objects.equals(this.subGroup, dkCloudDataModelMembersMemberSubGroup.subGroup) &&
        Objects.equals(this.description, dkCloudDataModelMembersMemberSubGroup.description) &&
        Objects.equals(this.groupDescription, dkCloudDataModelMembersMemberSubGroup.groupDescription) &&
        Objects.equals(this.defaultItemCode, dkCloudDataModelMembersMemberSubGroup.defaultItemCode) &&
        Objects.equals(this.extraProperties, dkCloudDataModelMembersMemberSubGroup.extraProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, subGroup, description, groupDescription, defaultItemCode, extraProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersMemberSubGroup {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    subGroup: ").append(toIndentedString(subGroup)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupDescription: ").append(toIndentedString(groupDescription)).append("\n");
    sb.append("    defaultItemCode: ").append(toIndentedString(defaultItemCode)).append("\n");
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
