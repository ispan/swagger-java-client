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
 * DkCloudDataModelProductsWarehouseModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelProductsWarehouseModel {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Location")
  private String location = null;

  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Dim2")
  private String dim2 = null;

  @SerializedName("Dim3")
  private String dim3 = null;

  @SerializedName("EanNumber")
  private String eanNumber = null;

  public DkCloudDataModelProductsWarehouseModel code(String code) {
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

  public DkCloudDataModelProductsWarehouseModel name(String name) {
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

  public DkCloudDataModelProductsWarehouseModel location(String location) {
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

  public DkCloudDataModelProductsWarehouseModel dim1(String dim1) {
    this.dim1 = dim1;
    return this;
  }

   /**
   * Get dim1
   * @return dim1
  **/
  @ApiModelProperty(value = "")
  public String getDim1() {
    return dim1;
  }

  public void setDim1(String dim1) {
    this.dim1 = dim1;
  }

  public DkCloudDataModelProductsWarehouseModel dim2(String dim2) {
    this.dim2 = dim2;
    return this;
  }

   /**
   * Get dim2
   * @return dim2
  **/
  @ApiModelProperty(value = "")
  public String getDim2() {
    return dim2;
  }

  public void setDim2(String dim2) {
    this.dim2 = dim2;
  }

  public DkCloudDataModelProductsWarehouseModel dim3(String dim3) {
    this.dim3 = dim3;
    return this;
  }

   /**
   * Get dim3
   * @return dim3
  **/
  @ApiModelProperty(value = "")
  public String getDim3() {
    return dim3;
  }

  public void setDim3(String dim3) {
    this.dim3 = dim3;
  }

  public DkCloudDataModelProductsWarehouseModel eanNumber(String eanNumber) {
    this.eanNumber = eanNumber;
    return this;
  }

   /**
   * Get eanNumber
   * @return eanNumber
  **/
  @ApiModelProperty(value = "")
  public String getEanNumber() {
    return eanNumber;
  }

  public void setEanNumber(String eanNumber) {
    this.eanNumber = eanNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelProductsWarehouseModel dkCloudDataModelProductsWarehouseModel = (DkCloudDataModelProductsWarehouseModel) o;
    return Objects.equals(this.code, dkCloudDataModelProductsWarehouseModel.code) &&
        Objects.equals(this.name, dkCloudDataModelProductsWarehouseModel.name) &&
        Objects.equals(this.location, dkCloudDataModelProductsWarehouseModel.location) &&
        Objects.equals(this.dim1, dkCloudDataModelProductsWarehouseModel.dim1) &&
        Objects.equals(this.dim2, dkCloudDataModelProductsWarehouseModel.dim2) &&
        Objects.equals(this.dim3, dkCloudDataModelProductsWarehouseModel.dim3) &&
        Objects.equals(this.eanNumber, dkCloudDataModelProductsWarehouseModel.eanNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, location, dim1, dim2, dim3, eanNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelProductsWarehouseModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
    sb.append("    eanNumber: ").append(toIndentedString(eanNumber)).append("\n");
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

