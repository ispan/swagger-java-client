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
 * DkCloudDataModelVendorsVendorDimmentions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelVendorsVendorDimmentions {
  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Dim2")
  private String dim2 = null;

  @SerializedName("Dim3")
  private String dim3 = null;

  public DkCloudDataModelVendorsVendorDimmentions dim1(String dim1) {
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

  public DkCloudDataModelVendorsVendorDimmentions dim2(String dim2) {
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

  public DkCloudDataModelVendorsVendorDimmentions dim3(String dim3) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelVendorsVendorDimmentions dkCloudDataModelVendorsVendorDimmentions = (DkCloudDataModelVendorsVendorDimmentions) o;
    return Objects.equals(this.dim1, dkCloudDataModelVendorsVendorDimmentions.dim1) &&
        Objects.equals(this.dim2, dkCloudDataModelVendorsVendorDimmentions.dim2) &&
        Objects.equals(this.dim3, dkCloudDataModelVendorsVendorDimmentions.dim3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dim1, dim2, dim3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelVendorsVendorDimmentions {\n");
    
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
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

