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
 * DkCloudDataModelMembersFeePeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelMembersFeePeriod {
  @SerializedName("From")
  private OffsetDateTime from = null;

  @SerializedName("To")
  private OffsetDateTime to = null;

  public DkCloudDataModelMembersFeePeriod from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public DkCloudDataModelMembersFeePeriod to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelMembersFeePeriod dkCloudDataModelMembersFeePeriod = (DkCloudDataModelMembersFeePeriod) o;
    return Objects.equals(this.from, dkCloudDataModelMembersFeePeriod.from) &&
        Objects.equals(this.to, dkCloudDataModelMembersFeePeriod.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelMembersFeePeriod {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

