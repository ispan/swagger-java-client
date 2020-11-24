# InvoiceApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceCancelPaymentPlan**](InvoiceApi.md#invoiceCancelPaymentPlan) | **PUT** /api/v1/sales/invoice/{invoice}/paymentplan/{number} | Cancel a Payment Plan for Invoice
[**invoiceCreateCreditInvoice**](InvoiceApi.md#invoiceCreateCreditInvoice) | **POST** /api/v1/sales/invoice/{id}/reverse | Create credit invoice based on another invoice
[**invoiceCreateInvoice**](InvoiceApi.md#invoiceCreateInvoice) | **POST** /api/v1/sales/invoice | Create a Sales Invoice
[**invoiceCreatePaymentPlan**](InvoiceApi.md#invoiceCreatePaymentPlan) | **POST** /api/v1/sales/invoice/{number}/paymentplan | Create a payment plan for a invoice
[**invoiceDeleteInvoice**](InvoiceApi.md#invoiceDeleteInvoice) | **DELETE** /api/v1/sales/invoice | Use to delete invoices
[**invoiceGet**](InvoiceApi.md#invoiceGet) | **GET** /api/v1/sales/invoice/{number} | Get a Sales Invoice
[**invoiceGetByDate**](InvoiceApi.md#invoiceGetByDate) | **GET** /api/v1/sales/invoice/date/{invoicedate}/{page}/{count} | Get Invoices by Date
[**invoiceGetDiscounts**](InvoiceApi.md#invoiceGetDiscounts) | **PATCH** /api/v1/sales/invoice/calculate | This method returnes prices as if DK calculated based on product,customer and based on discount groups
[**invoiceGetHtml**](InvoiceApi.md#invoiceGetHtml) | **GET** /api/v1/sales/invoice/{number}/html | Get a HTML generated from the Invoice
[**invoiceGetPDF**](InvoiceApi.md#invoiceGetPDF) | **GET** /api/v1/sales/invoice/{number}/pdf | Get PDF version of a invoice
[**invoiceGetPage**](InvoiceApi.md#invoiceGetPage) | **GET** /api/v1/sales/invoice/page/{page}/{count} | Get Sale Invoices
[**invoiceGetReference**](InvoiceApi.md#invoiceGetReference) | **GET** /api/v1/sales/invoice/reference/{reference}/{page}/{count} | Get Invoice by Reference Number
[**invoiceRefreshInvoiceFromDK**](InvoiceApi.md#invoiceRefreshInvoiceFromDK) | **PATCH** /api/v1/sales/invoice/{number}/refresh | Refresh invoice in dk+ from DK(Force Method)
[**invoiceSendEmail**](InvoiceApi.md#invoiceSendEmail) | **POST** /api/v1/sales/invoice/{number}/email | Send invoice as email.
[**invoiceSendMassEmail**](InvoiceApi.md#invoiceSendMassEmail) | **POST** /api/v1/sales/invoice/sendto/email | 


<a name="invoiceCancelPaymentPlan"></a>
# **invoiceCancelPaymentPlan**
> invoiceCancelPaymentPlan(invoice, number, content)

Cancel a Payment Plan for Invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String invoice = "invoice_example"; // String | Invoice Number
Integer number = 56; // Integer | Payment Plan Id
DkPlusAPIModelsInvoicePaymentPlanCancel content = new DkPlusAPIModelsInvoicePaymentPlanCancel(); // DkPlusAPIModelsInvoicePaymentPlanCancel | Cancel Model
try {
    apiInstance.invoiceCancelPaymentPlan(invoice, number, content);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceCancelPaymentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | **String**| Invoice Number |
 **number** | **Integer**| Payment Plan Id |
 **content** | [**DkPlusAPIModelsInvoicePaymentPlanCancel**](DkPlusAPIModelsInvoicePaymentPlanCancel.md)| Cancel Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceCreateCreditInvoice"></a>
# **invoiceCreateCreditInvoice**
> invoiceCreateCreditInvoice(id, post, date)

Create credit invoice based on another invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
Integer id = 56; // Integer | invoice number
Boolean post = true; // Boolean | Book the invoice
OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | Reverse Invoice Date
try {
    apiInstance.invoiceCreateCreditInvoice(id, post, date);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceCreateCreditInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| invoice number |
 **post** | **Boolean**| Book the invoice | [optional]
 **date** | **OffsetDateTime**| Reverse Invoice Date | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceCreateInvoice"></a>
# **invoiceCreateInvoice**
> DkCloudDataModelSalesInvoiceModel invoiceCreateInvoice(value, post)

Create a Sales Invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
DkPlusAPIModelsInvoiceHead value = new DkPlusAPIModelsInvoiceHead(); // DkPlusAPIModelsInvoiceHead | Invoice Post Model
Boolean post = true; // Boolean | Post Invoice
try {
    DkCloudDataModelSalesInvoiceModel result = apiInstance.invoiceCreateInvoice(value, post);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceCreateInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkPlusAPIModelsInvoiceHead**](DkPlusAPIModelsInvoiceHead.md)| Invoice Post Model |
 **post** | **Boolean**| Post Invoice | [optional]

### Return type

[**DkCloudDataModelSalesInvoiceModel**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceCreatePaymentPlan"></a>
# **invoiceCreatePaymentPlan**
> Integer invoiceCreatePaymentPlan(number, content)

Create a payment plan for a invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String number = "number_example"; // String | Invoice Number
DkPlusAPIModelsInvoicePaymentPlanCreate content = new DkPlusAPIModelsInvoicePaymentPlanCreate(); // DkPlusAPIModelsInvoicePaymentPlanCreate | Payment Plan Model
try {
    Integer result = apiInstance.invoiceCreatePaymentPlan(number, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceCreatePaymentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Invoice Number |
 **content** | [**DkPlusAPIModelsInvoicePaymentPlanCreate**](DkPlusAPIModelsInvoicePaymentPlanCreate.md)| Payment Plan Model |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceDeleteInvoice"></a>
# **invoiceDeleteInvoice**
> invoiceDeleteInvoice(reference, warehouse)

Use to delete invoices

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String reference = "reference_example"; // String | Reference Number
String warehouse = "warehouse_example"; // String | Warehouse Id
try {
    apiInstance.invoiceDeleteInvoice(reference, warehouse);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceDeleteInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **String**| Reference Number |
 **warehouse** | **String**| Warehouse Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceGet"></a>
# **invoiceGet**
> DkCloudDataModelSalesInvoiceModel invoiceGet(number)

Get a Sales Invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String number = "number_example"; // String | Invoice Number
try {
    DkCloudDataModelSalesInvoiceModel result = apiInstance.invoiceGet(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Invoice Number |

### Return type

[**DkCloudDataModelSalesInvoiceModel**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceGetByDate"></a>
# **invoiceGetByDate**
> List&lt;DkCloudDataModelSalesInvoiceModel&gt; invoiceGetByDate(invoicedate, page, count)

Get Invoices by Date

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
OffsetDateTime invoicedate = OffsetDateTime.now(); // OffsetDateTime | Invoice Date
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Invoices per Page (default=100)
try {
    List<DkCloudDataModelSalesInvoiceModel> result = apiInstance.invoiceGetByDate(invoicedate, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetByDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicedate** | **OffsetDateTime**| Invoice Date |
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Invoices per Page (default&#x3D;100) |

### Return type

[**List&lt;DkCloudDataModelSalesInvoiceModel&gt;**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceGetDiscounts"></a>
# **invoiceGetDiscounts**
> DkCloudDataModelSalesInvoiceModel invoiceGetDiscounts(value)

This method returnes prices as if DK calculated based on product,customer and based on discount groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
DkPlusAPIModelsInvoiceHead value = new DkPlusAPIModelsInvoiceHead(); // DkPlusAPIModelsInvoiceHead | Invoce Model
try {
    DkCloudDataModelSalesInvoiceModel result = apiInstance.invoiceGetDiscounts(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetDiscounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkPlusAPIModelsInvoiceHead**](DkPlusAPIModelsInvoiceHead.md)| Invoce Model |

### Return type

[**DkCloudDataModelSalesInvoiceModel**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceGetHtml"></a>
# **invoiceGetHtml**
> String invoiceGetHtml(number, custom)

Get a HTML generated from the Invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String number = "number_example"; // String | 
String custom = "custom_example"; // String | Use a predefined invoice look
try {
    String result = apiInstance.invoiceGetHtml(number, custom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **custom** | **String**| Use a predefined invoice look | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceGetPDF"></a>
# **invoiceGetPDF**
> Object invoiceGetPDF(number, custom)

Get PDF version of a invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String number = "number_example"; // String | 
String custom = "custom_example"; // String | 
try {
    Object result = apiInstance.invoiceGetPDF(number, custom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetPDF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **custom** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceGetPage"></a>
# **invoiceGetPage**
> List&lt;DkCloudDataModelSalesInvoiceModel&gt; invoiceGetPage(page, count, includeLines, createdAfter, createdBefore, dueAfter, salesPerson, reference, recordid, customer, project, include)

Get Sale Invoices

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
Integer page = 56; // Integer | Page Number (default=0)
Integer count = 56; // Integer | Invoices per Page (default=100)
Boolean includeLines = true; // Boolean | Include Sale Lines with Invoice
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Date on the format YYYY-MM-DD
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Date on the format YYYY-MM-DD
OffsetDateTime dueAfter = OffsetDateTime.now(); // OffsetDateTime | 
String salesPerson = "salesPerson_example"; // String | Sales person number
String reference = "reference_example"; // String | Reference Number
Integer recordid = 56; // Integer | Record Id After
String customer = "customer_example"; // String | Customer Number
String project = "project_example"; // String | Project Number
String include = "include_example"; // String | Fields to include
try {
    List<DkCloudDataModelSalesInvoiceModel> result = apiInstance.invoiceGetPage(page, count, includeLines, createdAfter, createdBefore, dueAfter, salesPerson, reference, recordid, customer, project, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number (default&#x3D;0) |
 **count** | **Integer**| Invoices per Page (default&#x3D;100) |
 **includeLines** | **Boolean**| Include Sale Lines with Invoice | [optional]
 **createdAfter** | **OffsetDateTime**| Date on the format YYYY-MM-DD | [optional]
 **createdBefore** | **OffsetDateTime**| Date on the format YYYY-MM-DD | [optional]
 **dueAfter** | **OffsetDateTime**|  | [optional]
 **salesPerson** | **String**| Sales person number | [optional]
 **reference** | **String**| Reference Number | [optional]
 **recordid** | **Integer**| Record Id After | [optional]
 **customer** | **String**| Customer Number | [optional]
 **project** | **String**| Project Number | [optional]
 **include** | **String**| Fields to include | [optional]

### Return type

[**List&lt;DkCloudDataModelSalesInvoiceModel&gt;**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceGetReference"></a>
# **invoiceGetReference**
> List&lt;DkCloudDataModelSalesInvoiceModel&gt; invoiceGetReference(reference, page, count, type)

Get Invoice by Reference Number

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String reference = "reference_example"; // String | Reference Number
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Invoices per Page (default=100)
String type = "type_example"; // String | Invoice type
try {
    List<DkCloudDataModelSalesInvoiceModel> result = apiInstance.invoiceGetReference(reference, page, count, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceGetReference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **String**| Reference Number |
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Invoices per Page (default&#x3D;100) |
 **type** | **String**| Invoice type | [optional] [enum: SalesOrder, BackOrder, Quotation, RecurringOrder, Project, dkPosInvoice, Distribution, UndispatchedSalesOrder, Prescription]

### Return type

[**List&lt;DkCloudDataModelSalesInvoiceModel&gt;**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceRefreshInvoiceFromDK"></a>
# **invoiceRefreshInvoiceFromDK**
> invoiceRefreshInvoiceFromDK(number)

Refresh invoice in dk+ from DK(Force Method)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String number = "number_example"; // String | Invoice Number
try {
    apiInstance.invoiceRefreshInvoiceFromDK(number);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceRefreshInvoiceFromDK");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Invoice Number |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceSendEmail"></a>
# **invoiceSendEmail**
> invoiceSendEmail(number, message, custom)

Send invoice as email.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String number = "number_example"; // String | invoice number
DkPlusMailModelMailInfo message = new DkPlusMailModelMailInfo(); // DkPlusMailModelMailInfo | Message model
String custom = "custom_example"; // String | Use a predefined invoice look
try {
    apiInstance.invoiceSendEmail(number, message, custom);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceSendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| invoice number |
 **message** | [**DkPlusMailModelMailInfo**](DkPlusMailModelMailInfo.md)| Message model |
 **custom** | **String**| Use a predefined invoice look | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="invoiceSendMassEmail"></a>
# **invoiceSendMassEmail**
> Object invoiceSendMassEmail(number, message, custom)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String number = "number_example"; // String | Invoice
DkPlusMailModelMailInfo message = new DkPlusMailModelMailInfo(); // DkPlusMailModelMailInfo | Message Model
String custom = "custom_example"; // String | Use a predefined invoice look
try {
    Object result = apiInstance.invoiceSendMassEmail(number, message, custom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoiceSendMassEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Invoice |
 **message** | [**DkPlusMailModelMailInfo**](DkPlusMailModelMailInfo.md)| Message Model |
 **custom** | **String**| Use a predefined invoice look | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

