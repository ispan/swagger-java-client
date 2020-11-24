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
 * DkCloudDataModelGeneralContactInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelGeneralContactInfo {
  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("Direct")
  private String direct = null;

  @SerializedName("Mobile")
  private String mobile = null;

  @SerializedName("Fax")
  private String fax = null;

  @SerializedName("Telex")
  private String telex = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("URL")
  private String URL = null;

  public DkCloudDataModelGeneralContactInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public DkCloudDataModelGeneralContactInfo direct(String direct) {
    this.direct = direct;
    return this;
  }

   /**
   * Get direct
   * @return direct
  **/
  @ApiModelProperty(value = "")
  public String getDirect() {
    return direct;
  }

  public void setDirect(String direct) {
    this.direct = direct;
  }

  public DkCloudDataModelGeneralContactInfo mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(value = "")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public DkCloudDataModelGeneralContactInfo fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public DkCloudDataModelGeneralContactInfo telex(String telex) {
    this.telex = telex;
    return this;
  }

   /**
   * Get telex
   * @return telex
  **/
  @ApiModelProperty(value = "")
  public String getTelex() {
    return telex;
  }

  public void setTelex(String telex) {
    this.telex = telex;
  }

  public DkCloudDataModelGeneralContactInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DkCloudDataModelGeneralContactInfo URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * Get URL
   * @return URL
  **/
  @ApiModelProperty(value = "")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelGeneralContactInfo dkCloudDataModelGeneralContactInfo = (DkCloudDataModelGeneralContactInfo) o;
    return Objects.equals(this.phone, dkCloudDataModelGeneralContactInfo.phone) &&
        Objects.equals(this.direct, dkCloudDataModelGeneralContactInfo.direct) &&
        Objects.equals(this.mobile, dkCloudDataModelGeneralContactInfo.mobile) &&
        Objects.equals(this.fax, dkCloudDataModelGeneralContactInfo.fax) &&
        Objects.equals(this.telex, dkCloudDataModelGeneralContactInfo.telex) &&
        Objects.equals(this.email, dkCloudDataModelGeneralContactInfo.email) &&
        Objects.equals(this.URL, dkCloudDataModelGeneralContactInfo.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, direct, mobile, fax, telex, email, URL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelGeneralContactInfo {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    telex: ").append(toIndentedString(telex)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

