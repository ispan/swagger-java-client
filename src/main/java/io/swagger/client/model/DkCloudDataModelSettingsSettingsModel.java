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
import io.swagger.client.model.DkCloudDataModelSettingsCustomerSettings;
import io.swagger.client.model.DkCloudDataModelSettingsDimmensionSetting;
import io.swagger.client.model.DkCloudDataModelSettingsGeneralSetting;
import io.swagger.client.model.DkCloudDataModelSettingsInformationModel;
import io.swagger.client.model.DkCloudDataModelSettingsMemberSetting;
import io.swagger.client.model.DkCloudDataModelSettingsProductSetting;
import io.swagger.client.model.DkCloudDataModelSettingsProjectSetting;
import io.swagger.client.model.DkCloudDataModelSettingsSaleSetting;
import io.swagger.client.model.DkCloudDataModelSettingsVendorSetting;
import java.io.IOException;

/**
 * DkCloudDataModelSettingsSettingsModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelSettingsSettingsModel {
  @SerializedName("Information")
  private DkCloudDataModelSettingsInformationModel information = null;

  @SerializedName("Customer")
  private DkCloudDataModelSettingsCustomerSettings customer = null;

  @SerializedName("Product")
  private DkCloudDataModelSettingsProductSetting product = null;

  @SerializedName("Vendor")
  private DkCloudDataModelSettingsVendorSetting vendor = null;

  @SerializedName("Sale")
  private DkCloudDataModelSettingsSaleSetting sale = null;

  @SerializedName("Project")
  private DkCloudDataModelSettingsProjectSetting project = null;

  @SerializedName("Dimmension")
  private DkCloudDataModelSettingsDimmensionSetting dimmension = null;

  @SerializedName("General")
  private DkCloudDataModelSettingsGeneralSetting general = null;

  @SerializedName("Member")
  private DkCloudDataModelSettingsMemberSetting member = null;

  public DkCloudDataModelSettingsSettingsModel information(DkCloudDataModelSettingsInformationModel information) {
    this.information = information;
    return this;
  }

   /**
   * Get information
   * @return information
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsInformationModel getInformation() {
    return information;
  }

  public void setInformation(DkCloudDataModelSettingsInformationModel information) {
    this.information = information;
  }

  public DkCloudDataModelSettingsSettingsModel customer(DkCloudDataModelSettingsCustomerSettings customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsCustomerSettings getCustomer() {
    return customer;
  }

  public void setCustomer(DkCloudDataModelSettingsCustomerSettings customer) {
    this.customer = customer;
  }

  public DkCloudDataModelSettingsSettingsModel product(DkCloudDataModelSettingsProductSetting product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsProductSetting getProduct() {
    return product;
  }

  public void setProduct(DkCloudDataModelSettingsProductSetting product) {
    this.product = product;
  }

  public DkCloudDataModelSettingsSettingsModel vendor(DkCloudDataModelSettingsVendorSetting vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsVendorSetting getVendor() {
    return vendor;
  }

  public void setVendor(DkCloudDataModelSettingsVendorSetting vendor) {
    this.vendor = vendor;
  }

  public DkCloudDataModelSettingsSettingsModel sale(DkCloudDataModelSettingsSaleSetting sale) {
    this.sale = sale;
    return this;
  }

   /**
   * Get sale
   * @return sale
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsSaleSetting getSale() {
    return sale;
  }

  public void setSale(DkCloudDataModelSettingsSaleSetting sale) {
    this.sale = sale;
  }

  public DkCloudDataModelSettingsSettingsModel project(DkCloudDataModelSettingsProjectSetting project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsProjectSetting getProject() {
    return project;
  }

  public void setProject(DkCloudDataModelSettingsProjectSetting project) {
    this.project = project;
  }

  public DkCloudDataModelSettingsSettingsModel dimmension(DkCloudDataModelSettingsDimmensionSetting dimmension) {
    this.dimmension = dimmension;
    return this;
  }

   /**
   * Get dimmension
   * @return dimmension
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsDimmensionSetting getDimmension() {
    return dimmension;
  }

  public void setDimmension(DkCloudDataModelSettingsDimmensionSetting dimmension) {
    this.dimmension = dimmension;
  }

  public DkCloudDataModelSettingsSettingsModel general(DkCloudDataModelSettingsGeneralSetting general) {
    this.general = general;
    return this;
  }

   /**
   * Get general
   * @return general
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsGeneralSetting getGeneral() {
    return general;
  }

  public void setGeneral(DkCloudDataModelSettingsGeneralSetting general) {
    this.general = general;
  }

  public DkCloudDataModelSettingsSettingsModel member(DkCloudDataModelSettingsMemberSetting member) {
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")
  public DkCloudDataModelSettingsMemberSetting getMember() {
    return member;
  }

  public void setMember(DkCloudDataModelSettingsMemberSetting member) {
    this.member = member;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelSettingsSettingsModel dkCloudDataModelSettingsSettingsModel = (DkCloudDataModelSettingsSettingsModel) o;
    return Objects.equals(this.information, dkCloudDataModelSettingsSettingsModel.information) &&
        Objects.equals(this.customer, dkCloudDataModelSettingsSettingsModel.customer) &&
        Objects.equals(this.product, dkCloudDataModelSettingsSettingsModel.product) &&
        Objects.equals(this.vendor, dkCloudDataModelSettingsSettingsModel.vendor) &&
        Objects.equals(this.sale, dkCloudDataModelSettingsSettingsModel.sale) &&
        Objects.equals(this.project, dkCloudDataModelSettingsSettingsModel.project) &&
        Objects.equals(this.dimmension, dkCloudDataModelSettingsSettingsModel.dimmension) &&
        Objects.equals(this.general, dkCloudDataModelSettingsSettingsModel.general) &&
        Objects.equals(this.member, dkCloudDataModelSettingsSettingsModel.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(information, customer, product, vendor, sale, project, dimmension, general, member);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelSettingsSettingsModel {\n");
    
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    sale: ").append(toIndentedString(sale)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    dimmension: ").append(toIndentedString(dimmension)).append("\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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
