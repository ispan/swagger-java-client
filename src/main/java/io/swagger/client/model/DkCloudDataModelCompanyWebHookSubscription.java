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
import io.swagger.client.model.DkCloudDataModelCompanyWebHookOption;
import java.io.IOException;
import java.util.UUID;

/**
 * DkCloudDataModelCompanyWebHookSubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelCompanyWebHookSubscription {
  @SerializedName("ID")
  private UUID ID = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("AuthorizationScheme")
  private String authorizationScheme = null;

  @SerializedName("AuthorizationValue")
  private String authorizationValue = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("Options")
  private DkCloudDataModelCompanyWebHookOption options = null;

  public DkCloudDataModelCompanyWebHookSubscription ID(UUID ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getID() {
    return ID;
  }

  public void setID(UUID ID) {
    this.ID = ID;
  }

  public DkCloudDataModelCompanyWebHookSubscription description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DkCloudDataModelCompanyWebHookSubscription authorizationScheme(String authorizationScheme) {
    this.authorizationScheme = authorizationScheme;
    return this;
  }

   /**
   * Get authorizationScheme
   * @return authorizationScheme
  **/
  @ApiModelProperty(value = "")
  public String getAuthorizationScheme() {
    return authorizationScheme;
  }

  public void setAuthorizationScheme(String authorizationScheme) {
    this.authorizationScheme = authorizationScheme;
  }

  public DkCloudDataModelCompanyWebHookSubscription authorizationValue(String authorizationValue) {
    this.authorizationValue = authorizationValue;
    return this;
  }

   /**
   * Get authorizationValue
   * @return authorizationValue
  **/
  @ApiModelProperty(value = "")
  public String getAuthorizationValue() {
    return authorizationValue;
  }

  public void setAuthorizationValue(String authorizationValue) {
    this.authorizationValue = authorizationValue;
  }

  public DkCloudDataModelCompanyWebHookSubscription url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DkCloudDataModelCompanyWebHookSubscription options(DkCloudDataModelCompanyWebHookOption options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelCompanyWebHookOption getOptions() {
    return options;
  }

  public void setOptions(DkCloudDataModelCompanyWebHookOption options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelCompanyWebHookSubscription dkCloudDataModelCompanyWebHookSubscription = (DkCloudDataModelCompanyWebHookSubscription) o;
    return Objects.equals(this.ID, dkCloudDataModelCompanyWebHookSubscription.ID) &&
        Objects.equals(this.description, dkCloudDataModelCompanyWebHookSubscription.description) &&
        Objects.equals(this.authorizationScheme, dkCloudDataModelCompanyWebHookSubscription.authorizationScheme) &&
        Objects.equals(this.authorizationValue, dkCloudDataModelCompanyWebHookSubscription.authorizationValue) &&
        Objects.equals(this.url, dkCloudDataModelCompanyWebHookSubscription.url) &&
        Objects.equals(this.options, dkCloudDataModelCompanyWebHookSubscription.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, description, authorizationScheme, authorizationValue, url, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelCompanyWebHookSubscription {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authorizationScheme: ").append(toIndentedString(authorizationScheme)).append("\n");
    sb.append("    authorizationValue: ").append(toIndentedString(authorizationValue)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

