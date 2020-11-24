# DimensionApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dimensionGet**](DimensionApi.md#dimensionGet) | **GET** /api/v1/general/dimension/{page}/{size} | Get dimensions


<a name="dimensionGet"></a>
# **dimensionGet**
> List&lt;DkCloudDataModelGeneralDim1Model&gt; dimensionGet(page, size)

Get dimensions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DimensionApi;


DimensionApi apiInstance = new DimensionApi();
Integer page = 56; // Integer | 
Integer size = 56; // Integer | 
try {
    List<DkCloudDataModelGeneralDim1Model> result = apiInstance.dimensionGet(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DimensionApi#dimensionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  |
 **size** | **Integer**|  |

### Return type

[**List&lt;DkCloudDataModelGeneralDim1Model&gt;**](DkCloudDataModelGeneralDim1Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

