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
import io.swagger.client.model.DkCloudDataModelMembersFund;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DkCloudDataModelMembersMemberShipCompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersMemberShipCompany {
  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Funds")
  private List<DkCloudDataModelMembersFund> funds = null;

  public DkCloudDataModelMembersMemberShipCompany number(Integer number) {
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

  public DkCloudDataModelMembersMemberShipCompany code(String code) {
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

  public DkCloudDataModelMembersMemberShipCompany name(String name) {
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

  public DkCloudDataModelMembersMemberShipCompany funds(List<DkCloudDataModelMembersFund> funds) {
    this.funds = funds;
    return this;
  }

  public DkCloudDataModelMembersMemberShipCompany addFundsItem(DkCloudDataModelMembersFund fundsItem) {
    if (this.funds == null) {
      this.funds = new ArrayList<DkCloudDataModelMembersFund>();
    }
    this.funds.add(fundsItem);
    return this;
  }

   /**
   * Get funds
   * @return funds
  **/
  @ApiModelProperty(value = "")
  public List<DkCloudDataModelMembersFund> getFunds() {
    return funds;
  }

  public void setFunds(List<DkCloudDataModelMembersFund> funds) {
    this.funds = funds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelMembersMemberShipCompany dkCloudDataModelMembersMemberShipCompany = (DkCloudDataModelMembersMemberShipCompany) o;
    return Objects.equals(this.number, dkCloudDataModelMembersMemberShipCompany.number) &&
        Objects.equals(this.code, dkCloudDataModelMembersMemberShipCompany.code) &&
        Objects.equals(this.name, dkCloudDataModelMembersMemberShipCompany.name) &&
        Objects.equals(this.funds, dkCloudDataModelMembersMemberShipCompany.funds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, code, name, funds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersMemberShipCompany {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    funds: ").append(toIndentedString(funds)).append("\n");
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
