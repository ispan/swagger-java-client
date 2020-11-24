# ProductInventoryApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productInventoryCreateInventorying**](ProductInventoryApi.md#productInventoryCreateInventorying) | **POST** /api/v1/product/register/Inventorying | Create Product Inventorying
[**productInventoryCreateJournal**](ProductInventoryApi.md#productInventoryCreateJournal) | **POST** /api/v1/product/register/journal | Create Project Journal
[**productInventoryCreateTransfer**](ProductInventoryApi.md#productInventoryCreateTransfer) | **POST** /api/v1/product/register/transfer | Create Product Transfer


<a name="productInventoryCreateInventorying"></a>
# **productInventoryCreateInventorying**
> productInventoryCreateInventorying(value)

Create Product Inventorying

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductInventoryApi;


ProductInventoryApi apiInstance = new ProductInventoryApi();
DkPlusAPIModelsProductInventoryInventorying value = new DkPlusAPIModelsProductInventoryInventorying(); // DkPlusAPIModelsProductInventoryInventorying | Inventorying Model
try {
    apiInstance.productInventoryCreateInventorying(value);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductInventoryApi#productInventoryCreateInventorying");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkPlusAPIModelsProductInventoryInventorying**](DkPlusAPIModelsProductInventoryInventorying.md)| Inventorying Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productInventoryCreateJournal"></a>
# **productInventoryCreateJournal**
> productInventoryCreateJournal(value)

Create Project Journal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductInventoryApi;


ProductInventoryApi apiInstance = new ProductInventoryApi();
DkPlusAPIModelsProductInventoryJournal value = new DkPlusAPIModelsProductInventoryJournal(); // DkPlusAPIModelsProductInventoryJournal | Journal Model
try {
    apiInstance.productInventoryCreateJournal(value);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductInventoryApi#productInventoryCreateJournal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkPlusAPIModelsProductInventoryJournal**](DkPlusAPIModelsProductInventoryJournal.md)| Journal Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productInventoryCreateTransfer"></a>
# **productInventoryCreateTransfer**
> productInventoryCreateTransfer(value, append, post)

Create Product Transfer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductInventoryApi;


ProductInventoryApi apiInstance = new ProductInventoryApi();
List<DkPlusAPIModelsProductInventoryTransfer> value = Arrays.asList(new DkPlusAPIModelsProductInventoryTransfer()); // List<DkPlusAPIModelsProductInventoryTransfer> | Transfer Model
Boolean append = true; // Boolean | Append to an exists journal
Boolean post = true; // Boolean | Process the journal
try {
    apiInstance.productInventoryCreateTransfer(value, append, post);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductInventoryApi#productInventoryCreateTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**List&lt;DkPlusAPIModelsProductInventoryTransfer&gt;**](DkPlusAPIModelsProductInventoryTransfer.md)| Transfer Model |
 **append** | **Boolean**| Append to an exists journal | [optional]
 **post** | **Boolean**| Process the journal | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

