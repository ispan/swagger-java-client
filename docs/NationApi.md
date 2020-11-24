# NationApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nationGet**](NationApi.md#nationGet) | **GET** /api/v1/nation/entry/{id} | Get Entry based on Social Security Number


<a name="nationGet"></a>
# **nationGet**
> DkCloudDataModelNationEntry nationGet(id)

Get Entry based on Social Security Number

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NationApi;


NationApi apiInstance = new NationApi();
String id = "id_example"; // String | SSNumber
try {
    DkCloudDataModelNationEntry result = apiInstance.nationGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NationApi#nationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| SSNumber |

### Return type

[**DkCloudDataModelNationEntry**](DkCloudDataModelNationEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

