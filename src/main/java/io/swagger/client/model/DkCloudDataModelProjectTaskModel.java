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
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelProjectTaskModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelProjectTaskModel {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  @SerializedName("ExtraProperties")
  private Map<String, String> extraProperties = null;

  public DkCloudDataModelProjectTaskModel number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DkCloudDataModelProjectTaskModel name(String name) {
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

  public DkCloudDataModelProjectTaskModel modified(OffsetDateTime modified) {
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

  public DkCloudDataModelProjectTaskModel extraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
    return this;
  }

  public DkCloudDataModelProjectTaskModel putExtraPropertiesItem(String key, String extraPropertiesItem) {
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
    DkCloudDataModelProjectTaskModel dkCloudDataModelProjectTaskModel = (DkCloudDataModelProjectTaskModel) o;
    return Objects.equals(this.number, dkCloudDataModelProjectTaskModel.number) &&
        Objects.equals(this.name, dkCloudDataModelProjectTaskModel.name) &&
        Objects.equals(this.modified, dkCloudDataModelProjectTaskModel.modified) &&
        Objects.equals(this.extraProperties, dkCloudDataModelProjectTaskModel.extraProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, name, modified, extraProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelProjectTaskModel {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

