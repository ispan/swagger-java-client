# CompanyApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companyGet**](CompanyApi.md#companyGet) | **GET** /api/v1/company | Get company related information and settings
[**companyGetTestConnection**](CompanyApi.md#companyGetTestConnection) | **GET** /api/v1/company/connection | Test connection to dk Data


<a name="companyGet"></a>
# **companyGet**
> DkCloudDataModelSettingsSettingsModel companyGet()

Get company related information and settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
try {
    DkCloudDataModelSettingsSettingsModel result = apiInstance.companyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DkCloudDataModelSettingsSettingsModel**](DkCloudDataModelSettingsSettingsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="companyGetTestConnection"></a>
# **companyGetTestConnection**
> Boolean companyGetTestConnection()

Test connection to dk Data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
try {
    Boolean result = apiInstance.companyGetTestConnection();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyGetTestConnection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

