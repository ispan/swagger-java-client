# QuoteApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quoteCreateSalesOrder**](QuoteApi.md#quoteCreateSalesOrder) | **POST** /api/v1/sales/quote | Create Sales Quote
[**quoteGetHtml**](QuoteApi.md#quoteGetHtml) | **GET** /api/v1/sales/quote/{number}/html | Get Sales Quote as HTML
[**quoteGetPDF**](QuoteApi.md#quoteGetPDF) | **GET** /api/v1/sales/quote/{number}/pdf | Get Sales Quote as PDF
[**quoteGetSalesQuote**](QuoteApi.md#quoteGetSalesQuote) | **GET** /api/v1/sales/quote/{id} | Get Sales Quote
[**quoteSendEmail**](QuoteApi.md#quoteSendEmail) | **POST** /api/v1/sales/quote/{number}/email | Send Sales Quote to Email


<a name="quoteCreateSalesOrder"></a>
# **quoteCreateSalesOrder**
> DkCloudDataModelSalesQuoteHead quoteCreateSalesOrder(value)

Create Sales Quote

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteApi;


QuoteApi apiInstance = new QuoteApi();
DkCloudDataModelSalesQuoteHead value = new DkCloudDataModelSalesQuoteHead(); // DkCloudDataModelSalesQuoteHead | 
try {
    DkCloudDataModelSalesQuoteHead result = apiInstance.quoteCreateSalesOrder(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteApi#quoteCreateSalesOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkCloudDataModelSalesQuoteHead**](DkCloudDataModelSalesQuoteHead.md)|  |

### Return type

[**DkCloudDataModelSalesQuoteHead**](DkCloudDataModelSalesQuoteHead.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="quoteGetHtml"></a>
# **quoteGetHtml**
> Object quoteGetHtml(number)

Get Sales Quote as HTML

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteApi;


QuoteApi apiInstance = new QuoteApi();
Integer number = 56; // Integer | 
try {
    Object result = apiInstance.quoteGetHtml(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteApi#quoteGetHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="quoteGetPDF"></a>
# **quoteGetPDF**
> Object quoteGetPDF(number)

Get Sales Quote as PDF

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteApi;


QuoteApi apiInstance = new QuoteApi();
Integer number = 56; // Integer | 
try {
    Object result = apiInstance.quoteGetPDF(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteApi#quoteGetPDF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="quoteGetSalesQuote"></a>
# **quoteGetSalesQuote**
> DkCloudDataModelSalesQuoteHead quoteGetSalesQuote(id)

Get Sales Quote

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteApi;


QuoteApi apiInstance = new QuoteApi();
Integer id = 56; // Integer | Quote Id
try {
    DkCloudDataModelSalesQuoteHead result = apiInstance.quoteGetSalesQuote(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteApi#quoteGetSalesQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Quote Id |

### Return type

[**DkCloudDataModelSalesQuoteHead**](DkCloudDataModelSalesQuoteHead.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="quoteSendEmail"></a>
# **quoteSendEmail**
> quoteSendEmail(number, message)

Send Sales Quote to Email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteApi;


QuoteApi apiInstance = new QuoteApi();
Integer number = 56; // Integer | 
DkPlusMailModelMailInfo message = new DkPlusMailModelMailInfo(); // DkPlusMailModelMailInfo | 
try {
    apiInstance.quoteSendEmail(number, message);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteApi#quoteSendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**|  |
 **message** | [**DkPlusMailModelMailInfo**](DkPlusMailModelMailInfo.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

