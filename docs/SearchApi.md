# SearchApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchGetSearchExtendedResult**](SearchApi.md#searchGetSearchExtendedResult) | **GET** /api/v1/search | Search Module for result
[**searchGetSearchResult**](SearchApi.md#searchGetSearchResult) | **GET** /api/v1/search/{value} | Deprecated search function  Use /api/v1/search?value&#x3D;{value}


<a name="searchGetSearchExtendedResult"></a>
# **searchGetSearchExtendedResult**
> List&lt;DkPlusAPIModelsSearchResultModel&gt; searchGetSearchExtendedResult(value, customer, product, vendor, defaultOp, max)

Search Module for result

### Search Filer Operators  * **+** signifies AND operation  * **|** signifies OR operation  * **-** negates a single token  * **\&quot;** wraps a number of tokens to signify a phrase for searching  * ***** at the end of a term signifies a prefix query  * **( and )** signify precedence  * **~N** after a word signifies edit distance (fuzziness)  * **~N** after a phrase signifies slop amount

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String value = "value_example"; // String | 
Boolean customer = true; // Boolean | Search Customers
Boolean product = true; // Boolean | Search products
Boolean vendor = true; // Boolean | Search Vendors
String defaultOp = "defaultOp_example"; // String | Default Serach operator
Integer max = 56; // Integer | Maximum result per module
try {
    List<DkPlusAPIModelsSearchResultModel> result = apiInstance.searchGetSearchExtendedResult(value, customer, product, vendor, defaultOp, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchGetSearchExtendedResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**|  |
 **customer** | **Boolean**| Search Customers | [optional]
 **product** | **Boolean**| Search products | [optional]
 **vendor** | **Boolean**| Search Vendors | [optional]
 **defaultOp** | **String**| Default Serach operator | [optional] [enum: And, Or]
 **max** | **Integer**| Maximum result per module | [optional]

### Return type

[**List&lt;DkPlusAPIModelsSearchResultModel&gt;**](DkPlusAPIModelsSearchResultModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="searchGetSearchResult"></a>
# **searchGetSearchResult**
> List&lt;DkPlusAPIModelsSearchResultModel&gt; searchGetSearchResult(value)

Deprecated search function  Use /api/v1/search?value&#x3D;{value}

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String value = "value_example"; // String | Seach string
try {
    List<DkPlusAPIModelsSearchResultModel> result = apiInstance.searchGetSearchResult(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchGetSearchResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Seach string |

### Return type

[**List&lt;DkPlusAPIModelsSearchResultModel&gt;**](DkPlusAPIModelsSearchResultModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

