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
 * DkCloudDataModelMembersFeeDiscount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersFeeDiscount {
  @SerializedName("ValidUntil")
  private OffsetDateTime validUntil = null;

  @SerializedName("Percent")
  private Double percent = null;

  public DkCloudDataModelMembersFeeDiscount validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Get validUntil
   * @return validUntil
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }

  public DkCloudDataModelMembersFeeDiscount percent(Double percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @ApiModelProperty(value = "")
  public Double getPercent() {
    return percent;
  }

  public void setPercent(Double percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelMembersFeeDiscount dkCloudDataModelMembersFeeDiscount = (DkCloudDataModelMembersFeeDiscount) o;
    return Objects.equals(this.validUntil, dkCloudDataModelMembersFeeDiscount.validUntil) &&
        Objects.equals(this.percent, dkCloudDataModelMembersFeeDiscount.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validUntil, percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersFeeDiscount {\n");
    
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
