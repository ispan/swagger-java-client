# VendorApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vendorGetByID**](VendorApi.md#vendorGetByID) | **GET** /api/v1/Vendor/{id} | Get Vendor
[**vendorGetVendors**](VendorApi.md#vendorGetVendors) | **GET** /api/v1/Vendor | Get All Vendors
[**vendorGetVendorsPage**](VendorApi.md#vendorGetVendorsPage) | **GET** /api/v1/Vendor/page/{page}/{count} | Get Vendors Pages
[**vendorPost**](VendorApi.md#vendorPost) | **POST** /api/v1/Vendor | Create Vendor
[**vendorSearchVendors**](VendorApi.md#vendorSearchVendors) | **GET** /api/v1/Vendor/search/{value}/{max} | Search Vendors
[**vendorTransactionGetVendorTransactions**](VendorApi.md#vendorTransactionGetVendorTransactions) | **GET** /api/v1/vendor/transaction/{page}/{count} | 
[**vendorTransactionGetVendorTransactionsForVendor**](VendorApi.md#vendorTransactionGetVendorTransactionsForVendor) | **GET** /api/v1/vendor/{vendor}/transaction/{page}/{count} | Get Transactions for supplied Vendor
[**vendorUpdateVendor**](VendorApi.md#vendorUpdateVendor) | **PUT** /api/v1/Vendor/{number} | Update Vendor


<a name="vendorGetByID"></a>
# **vendorGetByID**
> DkCloudDataModelVendorsVendorModel vendorGetByID(id)

Get Vendor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
String id = "id_example"; // String | Vendor Number
try {
    DkCloudDataModelVendorsVendorModel result = apiInstance.vendorGetByID(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorGetByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Vendor Number |

### Return type

[**DkCloudDataModelVendorsVendorModel**](DkCloudDataModelVendorsVendorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorGetVendors"></a>
# **vendorGetVendors**
> List&lt;DkCloudDataModelVendorsVendorModel&gt; vendorGetVendors(zipCode, modifiedAfter, modifiedBefore, group)

Get All Vendors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
String zipCode = "zipCode_example"; // String | 
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | 
String group = "group_example"; // String | 
try {
    List<DkCloudDataModelVendorsVendorModel> result = apiInstance.vendorGetVendors(zipCode, modifiedAfter, modifiedBefore, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorGetVendors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCode** | **String**|  | [optional]
 **modifiedAfter** | **OffsetDateTime**|  | [optional]
 **modifiedBefore** | **OffsetDateTime**|  | [optional]
 **group** | **String**|  | [optional]

### Return type

[**List&lt;DkCloudDataModelVendorsVendorModel&gt;**](DkCloudDataModelVendorsVendorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorGetVendorsPage"></a>
# **vendorGetVendorsPage**
> List&lt;DkCloudDataModelVendorsVendorModel&gt; vendorGetVendorsPage(page, count)

Get Vendors Pages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Objects on page
try {
    List<DkCloudDataModelVendorsVendorModel> result = apiInstance.vendorGetVendorsPage(page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorGetVendorsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Objects on page |

### Return type

[**List&lt;DkCloudDataModelVendorsVendorModel&gt;**](DkCloudDataModelVendorsVendorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorPost"></a>
# **vendorPost**
> vendorPost(obj)

Create Vendor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
DkCloudDataModelVendorsVendorModel obj = new DkCloudDataModelVendorsVendorModel(); // DkCloudDataModelVendorsVendorModel | Vendor Model
try {
    apiInstance.vendorPost(obj);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obj** | [**DkCloudDataModelVendorsVendorModel**](DkCloudDataModelVendorsVendorModel.md)| Vendor Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorSearchVendors"></a>
# **vendorSearchVendors**
> List&lt;DkCloudDataModelVendorsVendorModel&gt; vendorSearchVendors(value, max)

Search Vendors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
String value = "value_example"; // String | Value to Search For
Integer max = 56; // Integer | Max to return
try {
    List<DkCloudDataModelVendorsVendorModel> result = apiInstance.vendorSearchVendors(value, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorSearchVendors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Value to Search For |
 **max** | **Integer**| Max to return |

### Return type

[**List&lt;DkCloudDataModelVendorsVendorModel&gt;**](DkCloudDataModelVendorsVendorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorTransactionGetVendorTransactions"></a>
# **vendorTransactionGetVendorTransactions**
> List&lt;DkCloudDataModelVendorsTransaction&gt; vendorTransactionGetVendorTransactions(page, count, modifiedAfter, createdAfter, createdBefore, dueAfter, dim1, voucher, reference, recordid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Transactions per Page (default=100)
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Transaction modified after
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
OffsetDateTime dueAfter = OffsetDateTime.now(); // OffsetDateTime | Due After
String dim1 = "dim1_example"; // String | Dimmention
String voucher = "voucher_example"; // String | Voucher
String reference = "reference_example"; // String | Reference
Integer recordid = 56; // Integer | 
try {
    List<DkCloudDataModelVendorsTransaction> result = apiInstance.vendorTransactionGetVendorTransactions(page, count, modifiedAfter, createdAfter, createdBefore, dueAfter, dim1, voucher, reference, recordid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorTransactionGetVendorTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Transactions per Page (default&#x3D;100) |
 **modifiedAfter** | **OffsetDateTime**| Transaction modified after | [optional]
 **createdAfter** | **OffsetDateTime**| Created After | [optional]
 **createdBefore** | **OffsetDateTime**| Created Before | [optional]
 **dueAfter** | **OffsetDateTime**| Due After | [optional]
 **dim1** | **String**| Dimmention | [optional]
 **voucher** | **String**| Voucher | [optional]
 **reference** | **String**| Reference | [optional]
 **recordid** | **Integer**|  | [optional]

### Return type

[**List&lt;DkCloudDataModelVendorsTransaction&gt;**](DkCloudDataModelVendorsTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorTransactionGetVendorTransactionsForVendor"></a>
# **vendorTransactionGetVendorTransactionsForVendor**
> List&lt;DkCloudDataModelVendorsTransaction&gt; vendorTransactionGetVendorTransactionsForVendor(vendor, page, count)

Get Transactions for supplied Vendor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
String vendor = "vendor_example"; // String | Vendor Number
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Objects on Page
try {
    List<DkCloudDataModelVendorsTransaction> result = apiInstance.vendorTransactionGetVendorTransactionsForVendor(vendor, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorTransactionGetVendorTransactionsForVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor** | **String**| Vendor Number |
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Objects on Page |

### Return type

[**List&lt;DkCloudDataModelVendorsTransaction&gt;**](DkCloudDataModelVendorsTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorUpdateVendor"></a>
# **vendorUpdateVendor**
> vendorUpdateVendor(number, obj)

Update Vendor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorApi;


VendorApi apiInstance = new VendorApi();
String number = "number_example"; // String | Vendor Number
DkCloudDataModelVendorsVendorModel obj = new DkCloudDataModelVendorsVendorModel(); // DkCloudDataModelVendorsVendorModel | Vendor Model
try {
    apiInstance.vendorUpdateVendor(number, obj);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#vendorUpdateVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Vendor Number |
 **obj** | [**DkCloudDataModelVendorsVendorModel**](DkCloudDataModelVendorsVendorModel.md)| Vendor Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

