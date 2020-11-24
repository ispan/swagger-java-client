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
 * VLinkDkSoftwareDkSOAPTContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class VLinkDkSoftwareDkSOAPTContact {
  @SerializedName("Customer")
  private String customer = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Address1")
  private String address1 = null;

  @SerializedName("Address2")
  private String address2 = null;

  @SerializedName("Address3")
  private String address3 = null;

  @SerializedName("ZipCode")
  private String zipCode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("Department")
  private String department = null;

  @SerializedName("SSNumber")
  private String ssNumber = null;

  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("PhoneLocal")
  private String phoneLocal = null;

  @SerializedName("PhoneMobile")
  private String phoneMobile = null;

  @SerializedName("Fax")
  private String fax = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("URL")
  private String URL = null;

  @SerializedName("Telex")
  private String telex = null;

  @SerializedName("JobTitleCode")
  private String jobTitleCode = null;

  @SerializedName("Modified")
  private OffsetDateTime modified = null;

  public VLinkDkSoftwareDkSOAPTContact customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public VLinkDkSoftwareDkSOAPTContact number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public VLinkDkSoftwareDkSOAPTContact name(String name) {
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

  public VLinkDkSoftwareDkSOAPTContact title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public VLinkDkSoftwareDkSOAPTContact address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public VLinkDkSoftwareDkSOAPTContact address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public VLinkDkSoftwareDkSOAPTContact address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Get address3
   * @return address3
  **/
  @ApiModelProperty(value = "")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public VLinkDkSoftwareDkSOAPTContact zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public VLinkDkSoftwareDkSOAPTContact city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public VLinkDkSoftwareDkSOAPTContact countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public VLinkDkSoftwareDkSOAPTContact department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public VLinkDkSoftwareDkSOAPTContact ssNumber(String ssNumber) {
    this.ssNumber = ssNumber;
    return this;
  }

   /**
   * Get ssNumber
   * @return ssNumber
  **/
  @ApiModelProperty(value = "")
  public String getSsNumber() {
    return ssNumber;
  }

  public void setSsNumber(String ssNumber) {
    this.ssNumber = ssNumber;
  }

  public VLinkDkSoftwareDkSOAPTContact phone(String phone) {
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

  public VLinkDkSoftwareDkSOAPTContact phoneLocal(String phoneLocal) {
    this.phoneLocal = phoneLocal;
    return this;
  }

   /**
   * Get phoneLocal
   * @return phoneLocal
  **/
  @ApiModelProperty(value = "")
  public String getPhoneLocal() {
    return phoneLocal;
  }

  public void setPhoneLocal(String phoneLocal) {
    this.phoneLocal = phoneLocal;
  }

  public VLinkDkSoftwareDkSOAPTContact phoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
    return this;
  }

   /**
   * Get phoneMobile
   * @return phoneMobile
  **/
  @ApiModelProperty(value = "")
  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }

  public VLinkDkSoftwareDkSOAPTContact fax(String fax) {
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

  public VLinkDkSoftwareDkSOAPTContact email(String email) {
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

  public VLinkDkSoftwareDkSOAPTContact URL(String URL) {
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

  public VLinkDkSoftwareDkSOAPTContact telex(String telex) {
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

  public VLinkDkSoftwareDkSOAPTContact jobTitleCode(String jobTitleCode) {
    this.jobTitleCode = jobTitleCode;
    return this;
  }

   /**
   * Get jobTitleCode
   * @return jobTitleCode
  **/
  @ApiModelProperty(value = "")
  public String getJobTitleCode() {
    return jobTitleCode;
  }

  public void setJobTitleCode(String jobTitleCode) {
    this.jobTitleCode = jobTitleCode;
  }

  public VLinkDkSoftwareDkSOAPTContact modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VLinkDkSoftwareDkSOAPTContact vLinkDkSoftwareDkSOAPTContact = (VLinkDkSoftwareDkSOAPTContact) o;
    return Objects.equals(this.customer, vLinkDkSoftwareDkSOAPTContact.customer) &&
        Objects.equals(this.number, vLinkDkSoftwareDkSOAPTContact.number) &&
        Objects.equals(this.name, vLinkDkSoftwareDkSOAPTContact.name) &&
        Objects.equals(this.title, vLinkDkSoftwareDkSOAPTContact.title) &&
        Objects.equals(this.address1, vLinkDkSoftwareDkSOAPTContact.address1) &&
        Objects.equals(this.address2, vLinkDkSoftwareDkSOAPTContact.address2) &&
        Objects.equals(this.address3, vLinkDkSoftwareDkSOAPTContact.address3) &&
        Objects.equals(this.zipCode, vLinkDkSoftwareDkSOAPTContact.zipCode) &&
        Objects.equals(this.city, vLinkDkSoftwareDkSOAPTContact.city) &&
        Objects.equals(this.countryCode, vLinkDkSoftwareDkSOAPTContact.countryCode) &&
        Objects.equals(this.department, vLinkDkSoftwareDkSOAPTContact.department) &&
        Objects.equals(this.ssNumber, vLinkDkSoftwareDkSOAPTContact.ssNumber) &&
        Objects.equals(this.phone, vLinkDkSoftwareDkSOAPTContact.phone) &&
        Objects.equals(this.phoneLocal, vLinkDkSoftwareDkSOAPTContact.phoneLocal) &&
        Objects.equals(this.phoneMobile, vLinkDkSoftwareDkSOAPTContact.phoneMobile) &&
        Objects.equals(this.fax, vLinkDkSoftwareDkSOAPTContact.fax) &&
        Objects.equals(this.email, vLinkDkSoftwareDkSOAPTContact.email) &&
        Objects.equals(this.URL, vLinkDkSoftwareDkSOAPTContact.URL) &&
        Objects.equals(this.telex, vLinkDkSoftwareDkSOAPTContact.telex) &&
        Objects.equals(this.jobTitleCode, vLinkDkSoftwareDkSOAPTContact.jobTitleCode) &&
        Objects.equals(this.modified, vLinkDkSoftwareDkSOAPTContact.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, number, name, title, address1, address2, address3, zipCode, city, countryCode, department, ssNumber, phone, phoneLocal, phoneMobile, fax, email, URL, telex, jobTitleCode, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VLinkDkSoftwareDkSOAPTContact {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    ssNumber: ").append(toIndentedString(ssNumber)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneLocal: ").append(toIndentedString(phoneLocal)).append("\n");
    sb.append("    phoneMobile: ").append(toIndentedString(phoneMobile)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    telex: ").append(toIndentedString(telex)).append("\n");
    sb.append("    jobTitleCode: ").append(toIndentedString(jobTitleCode)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
