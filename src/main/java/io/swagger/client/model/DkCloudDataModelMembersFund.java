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
import io.swagger.client.model.DkCloudDataModelMembersGrant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DkCloudDataModelMembersFund
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersFund {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("SecondaryName")
  private String secondaryName = null;

  @SerializedName("Company")
  private String company = null;

  @SerializedName("Grants")
  private List<DkCloudDataModelMembersGrant> grants = null;

  public DkCloudDataModelMembersFund code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DkCloudDataModelMembersFund type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DkCloudDataModelMembersFund name(String name) {
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

  public DkCloudDataModelMembersFund secondaryName(String secondaryName) {
    this.secondaryName = secondaryName;
    return this;
  }

   /**
   * Get secondaryName
   * @return secondaryName
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryName() {
    return secondaryName;
  }

  public void setSecondaryName(String secondaryName) {
    this.secondaryName = secondaryName;
  }

  public DkCloudDataModelMembersFund company(String company) {
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

  public DkCloudDataModelMembersFund grants(List<DkCloudDataModelMembersGrant> grants) {
    this.grants = grants;
    return this;
  }

  public DkCloudDataModelMembersFund addGrantsItem(DkCloudDataModelMembersGrant grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<DkCloudDataModelMembersGrant>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * Get grants
   * @return grants
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelMembersGrant> getGrants() {
    return grants;
  }

  public void setGrants(List<DkCloudDataModelMembersGrant> grants) {
    this.grants = grants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelMembersFund dkCloudDataModelMembersFund = (DkCloudDataModelMembersFund) o;
    return Objects.equals(this.code, dkCloudDataModelMembersFund.code) &&
        Objects.equals(this.type, dkCloudDataModelMembersFund.type) &&
        Objects.equals(this.name, dkCloudDataModelMembersFund.name) &&
        Objects.equals(this.secondaryName, dkCloudDataModelMembersFund.secondaryName) &&
        Objects.equals(this.company, dkCloudDataModelMembersFund.company) &&
        Objects.equals(this.grants, dkCloudDataModelMembersFund.grants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, name, secondaryName, company, grants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersFund {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryName: ").append(toIndentedString(secondaryName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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

