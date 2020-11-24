# VendorInvoiceApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vendorInvoiceApprovalGetBooked**](VendorInvoiceApi.md#vendorInvoiceApprovalGetBooked) | **GET** /api/v1/vendor/invoice/my/approved | 
[**vendorInvoiceApprovalGetMyUnApproved**](VendorInvoiceApi.md#vendorInvoiceApprovalGetMyUnApproved) | **GET** /api/v1/vendor/invoice/my/unapproved | 
[**vendorInvoiceApprovalUpdateApproval**](VendorInvoiceApi.md#vendorInvoiceApprovalUpdateApproval) | **PUT** /api/v1/vendor/invoice/my/approval/{id} | 
[**vendorInvoiceCreatedVendorInvoice**](VendorInvoiceApi.md#vendorInvoiceCreatedVendorInvoice) | **POST** /api/v1/Vendor/{number}/Invoice | Create a Vendor Invoice
[**vendorInvoiceGetProcessedInvoices**](VendorInvoiceApi.md#vendorInvoiceGetProcessedInvoices) | **GET** /api/v1/vendor/invoice/processed/page/{page}/{count} | Get Booked Invoices
[**vendorInvoiceGetVendorInvoice**](VendorInvoiceApi.md#vendorInvoiceGetVendorInvoice) | **GET** /api/v1/vendor/invoice/processed/page/{id} | Get vendor invoice
[**vendorInvoiceGetVendorInvoiceAttachment**](VendorInvoiceApi.md#vendorInvoiceGetVendorInvoiceAttachment) | **GET** /api/v1/Vendor/Invoice/{id}/attachment | Get Vendor Invoice Attachments
[**vendorInvoiceUnProcessedGetAttachment**](VendorInvoiceApi.md#vendorInvoiceUnProcessedGetAttachment) | **GET** /api/v1/Vendor/Invoice/unprocessed/{id}/attachment | 
[**vendorInvoiceUnProcessedGetUnProcessedInvoices**](VendorInvoiceApi.md#vendorInvoiceUnProcessedGetUnProcessedInvoices) | **GET** /api/v1/vendor/invoice/unprocessed | Get un-booked Vendor Invoices
[**vendorInvoiceUnProcessedGetUnProcessedInvoicesById**](VendorInvoiceApi.md#vendorInvoiceUnProcessedGetUnProcessedInvoicesById) | **GET** /api/v1/vendor/invoice/unprocessed/{id} | Get a Vendor Invoice


<a name="vendorInvoiceApprovalGetBooked"></a>
# **vendorInvoiceApprovalGetBooked**
> List&lt;DkCloudDataModelVendorsInvoiceModel&gt; vendorInvoiceApprovalGetBooked()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
try {
    List<DkCloudDataModelVendorsInvoiceModel> result = apiInstance.vendorInvoiceApprovalGetBooked();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceApprovalGetBooked");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelVendorsInvoiceModel&gt;**](DkCloudDataModelVendorsInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceApprovalGetMyUnApproved"></a>
# **vendorInvoiceApprovalGetMyUnApproved**
> List&lt;DkCloudDataModelVendorsInvoiceModel&gt; vendorInvoiceApprovalGetMyUnApproved()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
try {
    List<DkCloudDataModelVendorsInvoiceModel> result = apiInstance.vendorInvoiceApprovalGetMyUnApproved();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceApprovalGetMyUnApproved");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelVendorsInvoiceModel&gt;**](DkCloudDataModelVendorsInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceApprovalUpdateApproval"></a>
# **vendorInvoiceApprovalUpdateApproval**
> vendorInvoiceApprovalUpdateApproval(id, value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
Integer id = 56; // Integer | 
DkPlusAPIModelsVendorInvoiceApprovalRequestModel value = new DkPlusAPIModelsVendorInvoiceApprovalRequestModel(); // DkPlusAPIModelsVendorInvoiceApprovalRequestModel | 
try {
    apiInstance.vendorInvoiceApprovalUpdateApproval(id, value);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceApprovalUpdateApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **value** | [**DkPlusAPIModelsVendorInvoiceApprovalRequestModel**](DkPlusAPIModelsVendorInvoiceApprovalRequestModel.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceCreatedVendorInvoice"></a>
# **vendorInvoiceCreatedVendorInvoice**
> DkCloudDataModelVendorsInvoiceModel vendorInvoiceCreatedVendorInvoice(number, value)

Create a Vendor Invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
String number = "number_example"; // String | Vendor Number
DkPlusAPIModelsVendorInvoiceInvoice value = new DkPlusAPIModelsVendorInvoiceInvoice(); // DkPlusAPIModelsVendorInvoiceInvoice | Invoice Model
try {
    DkCloudDataModelVendorsInvoiceModel result = apiInstance.vendorInvoiceCreatedVendorInvoice(number, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceCreatedVendorInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Vendor Number |
 **value** | [**DkPlusAPIModelsVendorInvoiceInvoice**](DkPlusAPIModelsVendorInvoiceInvoice.md)| Invoice Model |

### Return type

[**DkCloudDataModelVendorsInvoiceModel**](DkCloudDataModelVendorsInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceGetProcessedInvoices"></a>
# **vendorInvoiceGetProcessedInvoices**
> List&lt;DkCloudDataModelVendorsInvoiceModel&gt; vendorInvoiceGetProcessedInvoices(page, count)

Get Booked Invoices

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | number on page
try {
    List<DkCloudDataModelVendorsInvoiceModel> result = apiInstance.vendorInvoiceGetProcessedInvoices(page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceGetProcessedInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| number on page |

### Return type

[**List&lt;DkCloudDataModelVendorsInvoiceModel&gt;**](DkCloudDataModelVendorsInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceGetVendorInvoice"></a>
# **vendorInvoiceGetVendorInvoice**
> DkCloudDataModelVendorsInvoiceModel vendorInvoiceGetVendorInvoice(id)

Get vendor invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
Integer id = 56; // Integer | 
try {
    DkCloudDataModelVendorsInvoiceModel result = apiInstance.vendorInvoiceGetVendorInvoice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceGetVendorInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**DkCloudDataModelVendorsInvoiceModel**](DkCloudDataModelVendorsInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceGetVendorInvoiceAttachment"></a>
# **vendorInvoiceGetVendorInvoiceAttachment**
> Object vendorInvoiceGetVendorInvoiceAttachment(id)

Get Vendor Invoice Attachments

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.vendorInvoiceGetVendorInvoiceAttachment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceGetVendorInvoiceAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceUnProcessedGetAttachment"></a>
# **vendorInvoiceUnProcessedGetAttachment**
> Object vendorInvoiceUnProcessedGetAttachment(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.vendorInvoiceUnProcessedGetAttachment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceUnProcessedGetAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceUnProcessedGetUnProcessedInvoices"></a>
# **vendorInvoiceUnProcessedGetUnProcessedInvoices**
> List&lt;DkCloudDataModelVendorsInvoiceModel&gt; vendorInvoiceUnProcessedGetUnProcessedInvoices()

Get un-booked Vendor Invoices

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
try {
    List<DkCloudDataModelVendorsInvoiceModel> result = apiInstance.vendorInvoiceUnProcessedGetUnProcessedInvoices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceUnProcessedGetUnProcessedInvoices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelVendorsInvoiceModel&gt;**](DkCloudDataModelVendorsInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="vendorInvoiceUnProcessedGetUnProcessedInvoicesById"></a>
# **vendorInvoiceUnProcessedGetUnProcessedInvoicesById**
> DkCloudDataModelVendorsInvoiceModel vendorInvoiceUnProcessedGetUnProcessedInvoicesById(id)

Get a Vendor Invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
Integer id = 56; // Integer | Invoice number
try {
    DkCloudDataModelVendorsInvoiceModel result = apiInstance.vendorInvoiceUnProcessedGetUnProcessedInvoicesById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#vendorInvoiceUnProcessedGetUnProcessedInvoicesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Invoice number |

### Return type

[**DkCloudDataModelVendorsInvoiceModel**](DkCloudDataModelVendorsInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

