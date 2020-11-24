# SimpleInvoiceApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**simpleInvoiceCrateSimpleInvoice**](SimpleInvoiceApi.md#simpleInvoiceCrateSimpleInvoice) | **POST** /api/v1/sales/simple/invoice | 
[**simpleInvoiceGetSimpleInvoice**](SimpleInvoiceApi.md#simpleInvoiceGetSimpleInvoice) | **GET** /api/v1/sales/simple/invoice | 


<a name="simpleInvoiceCrateSimpleInvoice"></a>
# **simpleInvoiceCrateSimpleInvoice**
> simpleInvoiceCrateSimpleInvoice(value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimpleInvoiceApi;


SimpleInvoiceApi apiInstance = new SimpleInvoiceApi();
DkCloudDataModelSalesSimpleInvoiceModel value = new DkCloudDataModelSalesSimpleInvoiceModel(); // DkCloudDataModelSalesSimpleInvoiceModel | 
try {
    apiInstance.simpleInvoiceCrateSimpleInvoice(value);
} catch (ApiException e) {
    System.err.println("Exception when calling SimpleInvoiceApi#simpleInvoiceCrateSimpleInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkCloudDataModelSalesSimpleInvoiceModel**](DkCloudDataModelSalesSimpleInvoiceModel.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="simpleInvoiceGetSimpleInvoice"></a>
# **simpleInvoiceGetSimpleInvoice**
> Object simpleInvoiceGetSimpleInvoice()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimpleInvoiceApi;


SimpleInvoiceApi apiInstance = new SimpleInvoiceApi();
try {
    Object result = apiInstance.simpleInvoiceGetSimpleInvoice();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimpleInvoiceApi#simpleInvoiceGetSimpleInvoice");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

