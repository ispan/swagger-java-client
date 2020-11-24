# SalesOrderApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salesOrderCreateOrder**](SalesOrderApi.md#salesOrderCreateOrder) | **POST** /api/v1/sales/order | Create Sales Order
[**salesOrderDelete**](SalesOrderApi.md#salesOrderDelete) | **DELETE** /api/v1/sales/order/{id} | Delete Sales Order
[**salesOrderGetByReference**](SalesOrderApi.md#salesOrderGetByReference) | **GET** /api/v1/sales/order/reference/{reference} | Get Sales Order by Reference
[**salesOrderGetHtml**](SalesOrderApi.md#salesOrderGetHtml) | **GET** /api/v1/sales/order/{number}/html | Get Sales Order as HTML
[**salesOrderGetOrder**](SalesOrderApi.md#salesOrderGetOrder) | **GET** /api/v1/sales/order/{id} | Get Sales Order
[**salesOrderGetOrderFromFilter**](SalesOrderApi.md#salesOrderGetOrderFromFilter) | **GET** /api/v1/sales/order | Get Orders by Filter
[**salesOrderGetPDF**](SalesOrderApi.md#salesOrderGetPDF) | **GET** /api/v1/sales/order/{number}/pdf | Get Sales Order as PDF
[**salesOrderSendEmail**](SalesOrderApi.md#salesOrderSendEmail) | **POST** /api/v1/sales/order/{number}/email | Send Sales Order to Email
[**salesOrderUpdateOrder**](SalesOrderApi.md#salesOrderUpdateOrder) | **PUT** /api/v1/sales/order/{id} | Update Sales Order


<a name="salesOrderCreateOrder"></a>
# **salesOrderCreateOrder**
> DkPlusAPIModelsStatusValueModel salesOrderCreateOrder(value)

Create Sales Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
DkPlusAPIModelsOrderHead value = new DkPlusAPIModelsOrderHead(); // DkPlusAPIModelsOrderHead | Order Model
try {
    DkPlusAPIModelsStatusValueModel result = apiInstance.salesOrderCreateOrder(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderCreateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkPlusAPIModelsOrderHead**](DkPlusAPIModelsOrderHead.md)| Order Model |

### Return type

[**DkPlusAPIModelsStatusValueModel**](DkPlusAPIModelsStatusValueModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderDelete"></a>
# **salesOrderDelete**
> salesOrderDelete(id)

Delete Sales Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
Integer id = 56; // Integer | Order Id
try {
    apiInstance.salesOrderDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderDelete");
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

<a name="salesOrderGetByReference"></a>
# **salesOrderGetByReference**
> List&lt;DkCloudDataModelSalesSalesOrderModel&gt; salesOrderGetByReference(reference)

Get Sales Order by Reference

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
String reference = "reference_example"; // String | Order Reference
try {
    List<DkCloudDataModelSalesSalesOrderModel> result = apiInstance.salesOrderGetByReference(reference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetByReference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **String**| Order Reference |

### Return type

[**List&lt;DkCloudDataModelSalesSalesOrderModel&gt;**](DkCloudDataModelSalesSalesOrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderGetHtml"></a>
# **salesOrderGetHtml**
> Object salesOrderGetHtml(number, custom)

Get Sales Order as HTML

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
Integer number = 56; // Integer | Order Number
String custom = "custom_example"; // String | Customer Report Name
try {
    Object result = apiInstance.salesOrderGetHtml(number, custom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| Order Number |
 **custom** | **String**| Customer Report Name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderGetOrder"></a>
# **salesOrderGetOrder**
> DkCloudDataModelSalesSalesOrderModel salesOrderGetOrder(id)

Get Sales Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
Integer id = 56; // Integer | Order Id
try {
    DkCloudDataModelSalesSalesOrderModel result = apiInstance.salesOrderGetOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Id |

### Return type

[**DkCloudDataModelSalesSalesOrderModel**](DkCloudDataModelSalesSalesOrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderGetOrderFromFilter"></a>
# **salesOrderGetOrderFromFilter**
> DkCloudDataModelSalesSalesOrderModel salesOrderGetOrderFromFilter(modified, status, deliveryStatus)

Get Orders by Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified After
String status = "status_example"; // String | Order Status
String deliveryStatus = "deliveryStatus_example"; // String | Order Delivery status
try {
    DkCloudDataModelSalesSalesOrderModel result = apiInstance.salesOrderGetOrderFromFilter(modified, status, deliveryStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetOrderFromFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modified** | **OffsetDateTime**| Modified After |
 **status** | **String**| Order Status | [optional] [enum: InProcess, Sent, PartHandled, Handled, OnHold, Canceled]
 **deliveryStatus** | **String**| Order Delivery status | [optional] [enum: InProcess, Ready, Hurry, Wait, Request]

### Return type

[**DkCloudDataModelSalesSalesOrderModel**](DkCloudDataModelSalesSalesOrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderGetPDF"></a>
# **salesOrderGetPDF**
> Object salesOrderGetPDF(number, custom)

Get Sales Order as PDF

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
Integer number = 56; // Integer | Order Number
String custom = "custom_example"; // String | Customer Report Name
try {
    Object result = apiInstance.salesOrderGetPDF(number, custom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetPDF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| Order Number |
 **custom** | **String**| Customer Report Name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderSendEmail"></a>
# **salesOrderSendEmail**
> salesOrderSendEmail(number, message, custom)

Send Sales Order to Email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
Integer number = 56; // Integer | Order Number
DkPlusMailModelMailInfo message = new DkPlusMailModelMailInfo(); // DkPlusMailModelMailInfo | Message Model
String custom = "custom_example"; // String | Customer Report Name
try {
    apiInstance.salesOrderSendEmail(number, message, custom);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderSendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| Order Number |
 **message** | [**DkPlusMailModelMailInfo**](DkPlusMailModelMailInfo.md)| Message Model |
 **custom** | **String**| Customer Report Name | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderUpdateOrder"></a>
# **salesOrderUpdateOrder**
> VLinkDkSoftwareDkSOAPTOrder salesOrderUpdateOrder(id, value)

Update Sales Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesOrderApi;


SalesOrderApi apiInstance = new SalesOrderApi();
Integer id = 56; // Integer | Order Id
DkCloudDataModelSalesSalesOrderModel value = new DkCloudDataModelSalesSalesOrderModel(); // DkCloudDataModelSalesSalesOrderModel | Order Model
try {
    VLinkDkSoftwareDkSOAPTOrder result = apiInstance.salesOrderUpdateOrder(id, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderUpdateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Id |
 **value** | [**DkCloudDataModelSalesSalesOrderModel**](DkCloudDataModelSalesSalesOrderModel.md)| Order Model |

### Return type

[**VLinkDkSoftwareDkSOAPTOrder**](VLinkDkSoftwareDkSOAPTOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

