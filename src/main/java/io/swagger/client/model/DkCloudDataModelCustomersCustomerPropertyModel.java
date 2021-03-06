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
import org.threeten.bp.OffsetDateTime;

/**
 * DkCloudDataModelCustomersCustomerPropertyModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelCustomersCustomerPropertyModel {
  @SerializedName("ID")
  private String ID = null;

  @SerializedName("Attribute")
  private String attribute = null;

  @SerializedName("Option")
  private String option = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  public DkCloudDataModelCustomersCustomerPropertyModel ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public DkCloudDataModelCustomersCustomerPropertyModel attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(value = "")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public DkCloudDataModelCustomersCustomerPropertyModel option(String option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public DkCloudDataModelCustomersCustomerPropertyModel comment(String comment) {
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

  public DkCloudDataModelCustomersCustomerPropertyModel modified(OffsetDateTime modified) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelCustomersCustomerPropertyModel dkCloudDataModelCustomersCustomerPropertyModel = (DkCloudDataModelCustomersCustomerPropertyModel) o;
    return Objects.equals(this.ID, dkCloudDataModelCustomersCustomerPropertyModel.ID) &&
        Objects.equals(this.attribute, dkCloudDataModelCustomersCustomerPropertyModel.attribute) &&
        Objects.equals(this.option, dkCloudDataModelCustomersCustomerPropertyModel.option) &&
        Objects.equals(this.comment, dkCloudDataModelCustomersCustomerPropertyModel.comment) &&
        Objects.equals(this.modified, dkCloudDataModelCustomersCustomerPropertyModel.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, attribute, option, comment, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelCustomersCustomerPropertyModel {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

