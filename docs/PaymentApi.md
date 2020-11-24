# PaymentApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentModeGetPaymentMode**](PaymentApi.md#paymentModeGetPaymentMode) | **GET** /api/v1/general/payment/mode/{number} | Get a payment mode
[**paymentModeGetPaymentModes**](PaymentApi.md#paymentModeGetPaymentModes) | **GET** /api/v1/general/payment/mode | Get all payment modes
[**paymentTermGet**](PaymentApi.md#paymentTermGet) | **GET** /api/v1/general/payment/term | Get all payment terms
[**paymentTermGetInstance**](PaymentApi.md#paymentTermGetInstance) | **GET** /api/v1/general/payment/term/{number} | Get a payment term
[**paymentTypeGet**](PaymentApi.md#paymentTypeGet) | **GET** /api/v1/sales/payment/type | Get Payment Types
[**paymentTypeGetInstance**](PaymentApi.md#paymentTypeGetInstance) | **GET** /api/v1/sales/payment/type/{id} | Get Payment Type


<a name="paymentModeGetPaymentMode"></a>
# **paymentModeGetPaymentMode**
> DkCloudDataModelCustomersPaymentModeModel paymentModeGetPaymentMode(number)

Get a payment mode

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String number = "number_example"; // String | Payment Mode Number
try {
    DkCloudDataModelCustomersPaymentModeModel result = apiInstance.paymentModeGetPaymentMode(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#paymentModeGetPaymentMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Payment Mode Number |

### Return type

[**DkCloudDataModelCustomersPaymentModeModel**](DkCloudDataModelCustomersPaymentModeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="paymentModeGetPaymentModes"></a>
# **paymentModeGetPaymentModes**
> List&lt;DkCloudDataModelCustomersPaymentModeModel&gt; paymentModeGetPaymentModes()

Get all payment modes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
try {
    List<DkCloudDataModelCustomersPaymentModeModel> result = apiInstance.paymentModeGetPaymentModes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#paymentModeGetPaymentModes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelCustomersPaymentModeModel&gt;**](DkCloudDataModelCustomersPaymentModeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="paymentTermGet"></a>
# **paymentTermGet**
> List&lt;DkCloudDataModelCustomersPaymentTermModel&gt; paymentTermGet()

Get all payment terms

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
try {
    List<DkCloudDataModelCustomersPaymentTermModel> result = apiInstance.paymentTermGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#paymentTermGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelCustomersPaymentTermModel&gt;**](DkCloudDataModelCustomersPaymentTermModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="paymentTermGetInstance"></a>
# **paymentTermGetInstance**
> DkCloudDataModelCustomersPaymentTermModel paymentTermGetInstance(number)

Get a payment term

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String number = "number_example"; // String | Payment Term Number
try {
    DkCloudDataModelCustomersPaymentTermModel result = apiInstance.paymentTermGetInstance(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#paymentTermGetInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Payment Term Number |

### Return type

[**DkCloudDataModelCustomersPaymentTermModel**](DkCloudDataModelCustomersPaymentTermModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="paymentTypeGet"></a>
# **paymentTypeGet**
> List&lt;DkCloudDataModelSalesSalesPaymentMode&gt; paymentTypeGet()

Get Payment Types

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
try {
    List<DkCloudDataModelSalesSalesPaymentMode> result = apiInstance.paymentTypeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#paymentTypeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelSalesSalesPaymentMode&gt;**](DkCloudDataModelSalesSalesPaymentMode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="paymentTypeGetInstance"></a>
# **paymentTypeGetInstance**
> DkCloudDataModelSalesSalesPaymentMode paymentTypeGetInstance(id)

Get Payment Type

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
Integer id = 56; // Integer | 
try {
    DkCloudDataModelSalesSalesPaymentMode result = apiInstance.paymentTypeGetInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#paymentTypeGetInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**DkCloudDataModelSalesSalesPaymentMode**](DkCloudDataModelSalesSalesPaymentMode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

