# PurchaseApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseDelete**](PurchaseApi.md#purchaseDelete) | **DELETE** /api/v1/purchase/{id} | Delete Purchase Order
[**purchaseDeleteLine**](PurchaseApi.md#purchaseDeleteLine) | **DELETE** /api/v1/purchase/{id}/line/{seq} | Delete Purchase Order Line
[**purchaseGet**](PurchaseApi.md#purchaseGet) | **GET** /api/v1/purchase | Get Purchase Orders
[**purchaseGetById**](PurchaseApi.md#purchaseGetById) | **GET** /api/v1/purchase/id/{id} | Get Purchase Order
[**purchaseGetByNumber**](PurchaseApi.md#purchaseGetByNumber) | **GET** /api/v1/purchase/number/{number} | Get Purchase Order By Number
[**purchaseGetByReference**](PurchaseApi.md#purchaseGetByReference) | **GET** /api/v1/purchase/reference/{number} | Get Purchase Order By Reference
[**purchasePatch**](PurchaseApi.md#purchasePatch) | **PATCH** /api/v1/purchase/{id} | Update Purchase Order
[**purchasePatchLine**](PurchaseApi.md#purchasePatchLine) | **PATCH** /api/v1/purchase/{id}/line/{seq} | Update Purchase Order Line
[**purchasePost**](PurchaseApi.md#purchasePost) | **POST** /api/v1/purchase | Create Purchase Order


<a name="purchaseDelete"></a>
# **purchaseDelete**
> purchaseDelete(id)

Delete Purchase Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
Integer id = 56; // Integer | Order Id
try {
    apiInstance.purchaseDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseDeleteLine"></a>
# **purchaseDeleteLine**
> purchaseDeleteLine(id, seq)

Delete Purchase Order Line

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
Integer id = 56; // Integer | Order Id
Integer seq = 56; // Integer | Line Sequence Number
try {
    apiInstance.purchaseDeleteLine(id, seq);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseDeleteLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Id |
 **seq** | **Integer**| Line Sequence Number |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseGet"></a>
# **purchaseGet**
> List&lt;DkCloudDataModelPurchaseHeadModel&gt; purchaseGet(modified)

Get Purchase Orders

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified
try {
    List<DkCloudDataModelPurchaseHeadModel> result = apiInstance.purchaseGet(modified);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modified** | **OffsetDateTime**| Modified | [optional]

### Return type

[**List&lt;DkCloudDataModelPurchaseHeadModel&gt;**](DkCloudDataModelPurchaseHeadModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseGetById"></a>
# **purchaseGetById**
> DkCloudDataModelPurchaseHeadModel purchaseGetById(id)

Get Purchase Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
Integer id = 56; // Integer | Order Id
try {
    DkCloudDataModelPurchaseHeadModel result = apiInstance.purchaseGetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Id |

### Return type

[**DkCloudDataModelPurchaseHeadModel**](DkCloudDataModelPurchaseHeadModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseGetByNumber"></a>
# **purchaseGetByNumber**
> DkCloudDataModelPurchaseHeadModel purchaseGetByNumber(number)

Get Purchase Order By Number

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
String number = "number_example"; // String | Purchase Order Number
try {
    DkCloudDataModelPurchaseHeadModel result = apiInstance.purchaseGetByNumber(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseGetByNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Purchase Order Number |

### Return type

[**DkCloudDataModelPurchaseHeadModel**](DkCloudDataModelPurchaseHeadModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseGetByReference"></a>
# **purchaseGetByReference**
> DkCloudDataModelPurchaseHeadModel purchaseGetByReference(number)

Get Purchase Order By Reference

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
String number = "number_example"; // String | Reference Number
try {
    DkCloudDataModelPurchaseHeadModel result = apiInstance.purchaseGetByReference(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseGetByReference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Reference Number |

### Return type

[**DkCloudDataModelPurchaseHeadModel**](DkCloudDataModelPurchaseHeadModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchasePatch"></a>
# **purchasePatch**
> purchasePatch(id, order)

Update Purchase Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
Integer id = 56; // Integer | Order Id
DkPlusAPIModelsPurchaseHead order = new DkPlusAPIModelsPurchaseHead(); // DkPlusAPIModelsPurchaseHead | Order Model
try {
    apiInstance.purchasePatch(id, order);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchasePatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Id |
 **order** | [**DkPlusAPIModelsPurchaseHead**](DkPlusAPIModelsPurchaseHead.md)| Order Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchasePatchLine"></a>
# **purchasePatchLine**
> purchasePatchLine(id, seq, line)

Update Purchase Order Line

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
Integer id = 56; // Integer | Order Id
Integer seq = 56; // Integer | Line Sequence Number
DkCloudDataModelPurchaseLineModel line = new DkCloudDataModelPurchaseLineModel(); // DkCloudDataModelPurchaseLineModel | Line Model
try {
    apiInstance.purchasePatchLine(id, seq, line);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchasePatchLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Id |
 **seq** | **Integer**| Line Sequence Number |
 **line** | [**DkCloudDataModelPurchaseLineModel**](DkCloudDataModelPurchaseLineModel.md)| Line Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchasePost"></a>
# **purchasePost**
> purchasePost(orders)

Create Purchase Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchaseApi;


PurchaseApi apiInstance = new PurchaseApi();
List<DkPlusAPIModelsPurchaseHead> orders = Arrays.asList(new DkPlusAPIModelsPurchaseHead()); // List<DkPlusAPIModelsPurchaseHead> | Order Model
try {
    apiInstance.purchasePost(orders);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchasePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | [**List&lt;DkPlusAPIModelsPurchaseHead&gt;**](DkPlusAPIModelsPurchaseHead.md)| Order Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

