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
 * DkPlusAPIModelsTimeClockRegisterInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsTimeClockRegisterInfo {
  @SerializedName("Dim1")
  private String dim1 = null;

  @SerializedName("Project")
  private String project = null;

  @SerializedName("Comment")
  private String comment = null;

  public DkPlusAPIModelsTimeClockRegisterInfo dim1(String dim1) {
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

  public DkPlusAPIModelsTimeClockRegisterInfo project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public DkPlusAPIModelsTimeClockRegisterInfo comment(String comment) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsTimeClockRegisterInfo dkPlusAPIModelsTimeClockRegisterInfo = (DkPlusAPIModelsTimeClockRegisterInfo) o;
    return Objects.equals(this.dim1, dkPlusAPIModelsTimeClockRegisterInfo.dim1) &&
        Objects.equals(this.project, dkPlusAPIModelsTimeClockRegisterInfo.project) &&
        Objects.equals(this.comment, dkPlusAPIModelsTimeClockRegisterInfo.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dim1, project, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsTimeClockRegisterInfo {\n");
    
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
