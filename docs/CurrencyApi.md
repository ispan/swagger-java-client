# CurrencyApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currencyGet**](CurrencyApi.md#currencyGet) | **GET** /api/v1/general/currency | Get all currencies


<a name="currencyGet"></a>
# **currencyGet**
> List&lt;DkCloudDataModelGeneralCurrencyModel&gt; currencyGet()

Get all currencies

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CurrencyApi;


CurrencyApi apiInstance = new CurrencyApi();
try {
    List<DkCloudDataModelGeneralCurrencyModel> result = apiInstance.currencyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyApi#currencyGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelGeneralCurrencyModel&gt;**](DkCloudDataModelGeneralCurrencyModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

