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
import io.swagger.client.model.DkCloudDataModelSettingsCompanyModel;
import java.io.IOException;

/**
 * DkCloudDataModelSettingsInformationModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelSettingsInformationModel {
  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("OwnerName")
  private String ownerName = null;

  @SerializedName("License")
  private String license = null;

  @SerializedName("Company")
  private DkCloudDataModelSettingsCompanyModel company = null;

  public DkCloudDataModelSettingsInformationModel owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public DkCloudDataModelSettingsInformationModel ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @ApiModelProperty(value = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public DkCloudDataModelSettingsInformationModel license(String license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public DkCloudDataModelSettingsInformationModel company(DkCloudDataModelSettingsCompanyModel company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsCompanyModel getCompany() {
    return company;
  }

  public void setCompany(DkCloudDataModelSettingsCompanyModel company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelSettingsInformationModel dkCloudDataModelSettingsInformationModel = (DkCloudDataModelSettingsInformationModel) o;
    return Objects.equals(this.owner, dkCloudDataModelSettingsInformationModel.owner) &&
        Objects.equals(this.ownerName, dkCloudDataModelSettingsInformationModel.ownerName) &&
        Objects.equals(this.license, dkCloudDataModelSettingsInformationModel.license) &&
        Objects.equals(this.company, dkCloudDataModelSettingsInformationModel.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, ownerName, license, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelSettingsInformationModel {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
