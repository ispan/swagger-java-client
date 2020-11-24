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
 * DkPlusAPIModelsVendorInvoiceApproval
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkPlusAPIModelsVendorInvoiceApproval {
  @SerializedName("Approver")
  private String approver = null;

  public DkPlusAPIModelsVendorInvoiceApproval approver(String approver) {
    this.approver = approver;
    return this;
  }

   /**
   * Get approver
   * @return approver
  **/
  @ApiModelProperty(value = "")
  public String getApprover() {
    return approver;
  }

  public void setApprover(String approver) {
    this.approver = approver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkPlusAPIModelsVendorInvoiceApproval dkPlusAPIModelsVendorInvoiceApproval = (DkPlusAPIModelsVendorInvoiceApproval) o;
    return Objects.equals(this.approver, dkPlusAPIModelsVendorInvoiceApproval.approver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approver);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkPlusAPIModelsVendorInvoiceApproval {\n");
    
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
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

