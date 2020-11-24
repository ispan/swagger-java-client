# SalesPersonApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salesPersonCreateSalesPerson**](SalesPersonApi.md#salesPersonCreateSalesPerson) | **POST** /api/v1/sales/person | Create Sales Person
[**salesPersonGetSalesPerson**](SalesPersonApi.md#salesPersonGetSalesPerson) | **GET** /api/v1/sales/person/{number} | Get Sales Person
[**salesPersonGetSalesPersons**](SalesPersonApi.md#salesPersonGetSalesPersons) | **GET** /api/v1/sales/person/{page}/{count} | Get Sales Persons Paged
[**salesPersonGetSalesPersonsPage**](SalesPersonApi.md#salesPersonGetSalesPersonsPage) | **GET** /api/v1/sales/person/page/{page}/{count} | Get Sales Persons Paged
[**salesPersonRemoveSalesPerson**](SalesPersonApi.md#salesPersonRemoveSalesPerson) | **DELETE** /api/v1/sales/person/{number} | Delete Sales Person
[**salesPersonUpdateSalesPerson**](SalesPersonApi.md#salesPersonUpdateSalesPerson) | **PUT** /api/v1/sales/person/{number} | Update Sales Person


<a name="salesPersonCreateSalesPerson"></a>
# **salesPersonCreateSalesPerson**
> salesPersonCreateSalesPerson(value)

Create Sales Person

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesPersonApi;


SalesPersonApi apiInstance = new SalesPersonApi();
DkCloudDataModelSalesSalesPersonModel value = new DkCloudDataModelSalesSalesPersonModel(); // DkCloudDataModelSalesSalesPersonModel | Sales Person Model
try {
    apiInstance.salesPersonCreateSalesPerson(value);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPersonApi#salesPersonCreateSalesPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkCloudDataModelSalesSalesPersonModel**](DkCloudDataModelSalesSalesPersonModel.md)| Sales Person Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesPersonGetSalesPerson"></a>
# **salesPersonGetSalesPerson**
> DkCloudDataModelSalesSalesPersonModel salesPersonGetSalesPerson(number)

Get Sales Person

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesPersonApi;


SalesPersonApi apiInstance = new SalesPersonApi();
String number = "number_example"; // String | 
try {
    DkCloudDataModelSalesSalesPersonModel result = apiInstance.salesPersonGetSalesPerson(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPersonApi#salesPersonGetSalesPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |

### Return type

[**DkCloudDataModelSalesSalesPersonModel**](DkCloudDataModelSalesSalesPersonModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesPersonGetSalesPersons"></a>
# **salesPersonGetSalesPersons**
> List&lt;DkCloudDataModelSalesSalesPersonModel&gt; salesPersonGetSalesPersons(page, count)

Get Sales Persons Paged

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesPersonApi;


SalesPersonApi apiInstance = new SalesPersonApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Sales Persons per Page
try {
    List<DkCloudDataModelSalesSalesPersonModel> result = apiInstance.salesPersonGetSalesPersons(page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPersonApi#salesPersonGetSalesPersons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Sales Persons per Page |

### Return type

[**List&lt;DkCloudDataModelSalesSalesPersonModel&gt;**](DkCloudDataModelSalesSalesPersonModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesPersonGetSalesPersonsPage"></a>
# **salesPersonGetSalesPersonsPage**
> List&lt;DkCloudDataModelSalesSalesPersonModel&gt; salesPersonGetSalesPersonsPage(page, count)

Get Sales Persons Paged

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesPersonApi;


SalesPersonApi apiInstance = new SalesPersonApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Sales Persons per Page
try {
    List<DkCloudDataModelSalesSalesPersonModel> result = apiInstance.salesPersonGetSalesPersonsPage(page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPersonApi#salesPersonGetSalesPersonsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Sales Persons per Page |

### Return type

[**List&lt;DkCloudDataModelSalesSalesPersonModel&gt;**](DkCloudDataModelSalesSalesPersonModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesPersonRemoveSalesPerson"></a>
# **salesPersonRemoveSalesPerson**
> salesPersonRemoveSalesPerson(number)

Delete Sales Person

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesPersonApi;


SalesPersonApi apiInstance = new SalesPersonApi();
String number = "number_example"; // String | Sales Person Number
try {
    apiInstance.salesPersonRemoveSalesPerson(number);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPersonApi#salesPersonRemoveSalesPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Sales Person Number |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesPersonUpdateSalesPerson"></a>
# **salesPersonUpdateSalesPerson**
> salesPersonUpdateSalesPerson(number, value)

Update Sales Person

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesPersonApi;


SalesPersonApi apiInstance = new SalesPersonApi();
String number = "number_example"; // String | Sales Person Number
DkCloudDataModelSalesSalesPersonModel value = new DkCloudDataModelSalesSalesPersonModel(); // DkCloudDataModelSalesSalesPersonModel | Sales Person Model
try {
    apiInstance.salesPersonUpdateSalesPerson(number, value);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPersonApi#salesPersonUpdateSalesPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Sales Person Number |
 **value** | [**DkCloudDataModelSalesSalesPersonModel**](DkCloudDataModelSalesSalesPersonModel.md)| Sales Person Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

