# CustomerApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCallerIdByPhone**](CustomerApi.md#customerCallerIdByPhone) | **GET** /api/v1/Customer/Phone/{number}/display | Generate Phone Caller id by phone number
[**customerCreateCustomer**](CustomerApi.md#customerCreateCustomer) | **POST** /api/v1/Customer | Create Customer
[**customerGetAttachment**](CustomerApi.md#customerGetAttachment) | **GET** /api/v1/customer/{customer}/attachment/{id} | Get a document assigned to a Customer
[**customerGetCustomerById**](CustomerApi.md#customerGetCustomerById) | **GET** /api/v1/Customer/{customer} | Get a Customer
[**customerGetCustomerCount**](CustomerApi.md#customerGetCustomerCount) | **GET** /api/v1/Customer/info/count | 
[**customerGetCustomerInvoices**](CustomerApi.md#customerGetCustomerInvoices) | **GET** /api/v1/Customer/{customer}/invoice | Get Invoices for a Customer
[**customerGetCustomerOrders**](CustomerApi.md#customerGetCustomerOrders) | **GET** /api/v1/Customer/{customer}/order | Get Orders for a Customer
[**customerGetCustomerQuote**](CustomerApi.md#customerGetCustomerQuote) | **GET** /api/v1/Customer/{customer}/quote | Get Quotes for a Customer
[**customerGetCustomerTransactions**](CustomerApi.md#customerGetCustomerTransactions) | **GET** /api/v1/Customer/{customer}/transaction | Get Transactions for a Customer
[**customerGetCustomers**](CustomerApi.md#customerGetCustomers) | **GET** /api/v1/Customer/{includeObjects} | Get Customers
[**customerGetCustomersPaged**](CustomerApi.md#customerGetCustomersPaged) | **GET** /api/v1/Customer/page/{page}/{count} | Get Customers base on Filter
[**customerGetCutomerProjects**](CustomerApi.md#customerGetCutomerProjects) | **GET** /api/v1/Customer/{customer}/project | Get Projects for a Customer
[**customerGetGroup**](CustomerApi.md#customerGetGroup) | **GET** /api/v1/Customer/group/{id}/{page}/{count} | Get Customers by Groups
[**customerGetSearch**](CustomerApi.md#customerGetSearch) | **GET** /api/v1/Customer/search/{value}/{max} | Search for Customers
[**customerGroupGet**](CustomerApi.md#customerGroupGet) | **GET** /api/v1/customergroup | Get customer groups
[**customerRemoveCustomer**](CustomerApi.md#customerRemoveCustomer) | **DELETE** /api/v1/Customer/{customer} | Delete a Customer
[**customerSearchByPhone**](CustomerApi.md#customerSearchByPhone) | **GET** /api/v1/Customer/Phone/{number} | Lookup customer by phone number  this looks into Phone,PhoneLocal,PhoneMobile on customer,contacts and Recivers
[**customerTransactionGetCustomerTransactions**](CustomerApi.md#customerTransactionGetCustomerTransactions) | **GET** /api/v1/customer/transaction/page/{page}/{count} | Get General Ledger Transaction
[**customerUpdateCustomer**](CustomerApi.md#customerUpdateCustomer) | **PUT** /api/v1/Customer/{customer} | Update a Customer


<a name="customerCallerIdByPhone"></a>
# **customerCallerIdByPhone**
> String customerCallerIdByPhone(number, format)

Generate Phone Caller id by phone number

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String number = "number_example"; // String | Phone Number
String format = "format_example"; // String | Display format
try {
    String result = apiInstance.customerCallerIdByPhone(number, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCallerIdByPhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Phone Number |
 **format** | **String**| Display format | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerCreateCustomer"></a>
# **customerCreateCustomer**
> customerCreateCustomer(obj)

Create Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
DkCloudDataModelCustomersCustomerModel obj = new DkCloudDataModelCustomersCustomerModel(); // DkCloudDataModelCustomersCustomerModel | Customer Model
try {
    apiInstance.customerCreateCustomer(obj);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCreateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obj** | [**DkCloudDataModelCustomersCustomerModel**](DkCloudDataModelCustomersCustomerModel.md)| Customer Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetAttachment"></a>
# **customerGetAttachment**
> Object customerGetAttachment(customer, id)

Get a document assigned to a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
Integer id = 56; // Integer | Document Id
try {
    Object result = apiInstance.customerGetAttachment(customer, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |
 **id** | **Integer**| Document Id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerById"></a>
# **customerGetCustomerById**
> DkCloudDataModelCustomersCustomerModel customerGetCustomerById(customer)

Get a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
try {
    DkCloudDataModelCustomersCustomerModel result = apiInstance.customerGetCustomerById(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

[**DkCloudDataModelCustomersCustomerModel**](DkCloudDataModelCustomersCustomerModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerCount"></a>
# **customerGetCustomerCount**
> Long customerGetCustomerCount(group, zipcode, country, salesperson, paymentterm, paymentmode, novat, blocked, attribute, attributecomment, attributeoption, memo, deleted, modifiedBefore, modifiedAfter)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String group = "group_example"; // String | 
String zipcode = "zipcode_example"; // String | 
String country = "country_example"; // String | 
String salesperson = "salesperson_example"; // String | 
String paymentterm = "paymentterm_example"; // String | 
String paymentmode = "paymentmode_example"; // String | 
Boolean novat = true; // Boolean | 
Boolean blocked = true; // Boolean | 
String attribute = "attribute_example"; // String | 
String attributecomment = "attributecomment_example"; // String | 
String attributeoption = "attributeoption_example"; // String | 
String memo = "memo_example"; // String | 
Boolean deleted = true; // Boolean | 
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | 
try {
    Long result = apiInstance.customerGetCustomerCount(group, zipcode, country, salesperson, paymentterm, paymentmode, novat, blocked, attribute, attributecomment, attributeoption, memo, deleted, modifiedBefore, modifiedAfter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | [optional]
 **zipcode** | **String**|  | [optional]
 **country** | **String**|  | [optional]
 **salesperson** | **String**|  | [optional]
 **paymentterm** | **String**|  | [optional]
 **paymentmode** | **String**|  | [optional]
 **novat** | **Boolean**|  | [optional]
 **blocked** | **Boolean**|  | [optional]
 **attribute** | **String**|  | [optional]
 **attributecomment** | **String**|  | [optional]
 **attributeoption** | **String**|  | [optional]
 **memo** | **String**|  | [optional]
 **deleted** | **Boolean**|  | [optional]
 **modifiedBefore** | **OffsetDateTime**|  | [optional]
 **modifiedAfter** | **OffsetDateTime**|  | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerInvoices"></a>
# **customerGetCustomerInvoices**
> List&lt;DkCloudDataModelSalesInvoiceModel&gt; customerGetCustomerInvoices(customer)

Get Invoices for a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
try {
    List<DkCloudDataModelSalesInvoiceModel> result = apiInstance.customerGetCustomerInvoices(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

[**List&lt;DkCloudDataModelSalesInvoiceModel&gt;**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerOrders"></a>
# **customerGetCustomerOrders**
> List&lt;DkCloudDataModelSalesSalesOrderModel&gt; customerGetCustomerOrders(customer)

Get Orders for a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
try {
    List<DkCloudDataModelSalesSalesOrderModel> result = apiInstance.customerGetCustomerOrders(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

[**List&lt;DkCloudDataModelSalesSalesOrderModel&gt;**](DkCloudDataModelSalesSalesOrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerQuote"></a>
# **customerGetCustomerQuote**
> List&lt;DkCloudDataModelSalesQuoteHead&gt; customerGetCustomerQuote(customer)

Get Quotes for a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
try {
    List<DkCloudDataModelSalesQuoteHead> result = apiInstance.customerGetCustomerQuote(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

[**List&lt;DkCloudDataModelSalesQuoteHead&gt;**](DkCloudDataModelSalesQuoteHead.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerTransactions"></a>
# **customerGetCustomerTransactions**
> List&lt;DkCloudDataModelProductsTransactionsModel&gt; customerGetCustomerTransactions(customer)

Get Transactions for a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
try {
    List<DkCloudDataModelProductsTransactionsModel> result = apiInstance.customerGetCustomerTransactions(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

[**List&lt;DkCloudDataModelProductsTransactionsModel&gt;**](DkCloudDataModelProductsTransactionsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomers"></a>
# **customerGetCustomers**
> List&lt;DkCloudDataModelCustomersCustomerModel&gt; customerGetCustomers(includeObjects, include)

Get Customers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
Boolean includeObjects = true; // Boolean | Include Objects
String include = "include_example"; // String | Field to include
try {
    List<DkCloudDataModelCustomersCustomerModel> result = apiInstance.customerGetCustomers(includeObjects, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeObjects** | **Boolean**| Include Objects |
 **include** | **String**| Field to include | [optional]

### Return type

[**List&lt;DkCloudDataModelCustomersCustomerModel&gt;**](DkCloudDataModelCustomersCustomerModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomersPaged"></a>
# **customerGetCustomersPaged**
> List&lt;DkCloudDataModelCustomersCustomerModel&gt; customerGetCustomersPaged(page, count, group, zipcode, country, salesperson, paymentterm, paymentmode, novat, blocked, attribute, attributecomment, attributeoption, memo, deleted, modifiedBefore, modifiedAfter, include)

Get Customers base on Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Customers per page (default=100)
String group = "group_example"; // String | Group
String zipcode = "zipcode_example"; // String | Zip Code
String country = "country_example"; // String | Country
String salesperson = "salesperson_example"; // String | Sales Person
String paymentterm = "paymentterm_example"; // String | Payment Term
String paymentmode = "paymentmode_example"; // String | Payment Mode
Boolean novat = true; // Boolean | No VAT
Boolean blocked = true; // Boolean | Blocked
String attribute = "attribute_example"; // String | Attribute
String attributecomment = "attributecomment_example"; // String | Attribute Comment
String attributeoption = "attributeoption_example"; // String | Attribute Option
String memo = "memo_example"; // String | Search memo for string
Boolean deleted = true; // Boolean | Customer Deleted
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified After
String include = "include_example"; // String | Fields to Include
try {
    List<DkCloudDataModelCustomersCustomerModel> result = apiInstance.customerGetCustomersPaged(page, count, group, zipcode, country, salesperson, paymentterm, paymentmode, novat, blocked, attribute, attributecomment, attributeoption, memo, deleted, modifiedBefore, modifiedAfter, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomersPaged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Customers per page (default&#x3D;100) |
 **group** | **String**| Group | [optional]
 **zipcode** | **String**| Zip Code | [optional]
 **country** | **String**| Country | [optional]
 **salesperson** | **String**| Sales Person | [optional]
 **paymentterm** | **String**| Payment Term | [optional]
 **paymentmode** | **String**| Payment Mode | [optional]
 **novat** | **Boolean**| No VAT | [optional]
 **blocked** | **Boolean**| Blocked | [optional]
 **attribute** | **String**| Attribute | [optional]
 **attributecomment** | **String**| Attribute Comment | [optional]
 **attributeoption** | **String**| Attribute Option | [optional]
 **memo** | **String**| Search memo for string | [optional]
 **deleted** | **Boolean**| Customer Deleted | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **modifiedAfter** | **OffsetDateTime**| Modified After | [optional]
 **include** | **String**| Fields to Include | [optional]

### Return type

[**List&lt;DkCloudDataModelCustomersCustomerModel&gt;**](DkCloudDataModelCustomersCustomerModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCutomerProjects"></a>
# **customerGetCutomerProjects**
> List&lt;DkCloudDataModelProjectProjectModel&gt; customerGetCutomerProjects(customer)

Get Projects for a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
try {
    List<DkCloudDataModelProjectProjectModel> result = apiInstance.customerGetCutomerProjects(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCutomerProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

[**List&lt;DkCloudDataModelProjectProjectModel&gt;**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetGroup"></a>
# **customerGetGroup**
> List&lt;DkCloudDataModelCustomersCustomerModel&gt; customerGetGroup(id, page, count)

Get Customers by Groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String id = "id_example"; // String | Group Number
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Groups per Page (default=100)
try {
    List<DkCloudDataModelCustomersCustomerModel> result = apiInstance.customerGetGroup(id, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Group Number |
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Groups per Page (default&#x3D;100) |

### Return type

[**List&lt;DkCloudDataModelCustomersCustomerModel&gt;**](DkCloudDataModelCustomersCustomerModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetSearch"></a>
# **customerGetSearch**
> List&lt;DkCloudDataModelCustomersCustomerModel&gt; customerGetSearch(value, max)

Search for Customers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String value = "value_example"; // String | Search Value
Integer max = 56; // Integer | Return Maximum Count
try {
    List<DkCloudDataModelCustomersCustomerModel> result = apiInstance.customerGetSearch(value, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Search Value |
 **max** | **Integer**| Return Maximum Count |

### Return type

[**List&lt;DkCloudDataModelCustomersCustomerModel&gt;**](DkCloudDataModelCustomersCustomerModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGroupGet"></a>
# **customerGroupGet**
> List&lt;DkCloudDataModelCustomersCustomerGroupModel&gt; customerGroupGet()

Get customer groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
try {
    List<DkCloudDataModelCustomersCustomerGroupModel> result = apiInstance.customerGroupGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGroupGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelCustomersCustomerGroupModel&gt;**](DkCloudDataModelCustomersCustomerGroupModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerRemoveCustomer"></a>
# **customerRemoveCustomer**
> customerRemoveCustomer(customer)

Delete a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
try {
    apiInstance.customerRemoveCustomer(customer);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerRemoveCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerSearchByPhone"></a>
# **customerSearchByPhone**
> DkCloudDataModelCustomersCustomerModel customerSearchByPhone(number)

Lookup customer by phone number  this looks into Phone,PhoneLocal,PhoneMobile on customer,contacts and Recivers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String number = "number_example"; // String | Phone Number
try {
    DkCloudDataModelCustomersCustomerModel result = apiInstance.customerSearchByPhone(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerSearchByPhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Phone Number |

### Return type

[**DkCloudDataModelCustomersCustomerModel**](DkCloudDataModelCustomersCustomerModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerTransactionGetCustomerTransactions"></a>
# **customerTransactionGetCustomerTransactions**
> List&lt;DkCloudDataModelCustomersTransactionModel&gt; customerTransactionGetCustomerTransactions(page, count, modifiedAfter, createdAfter, createdBefore, dueAfter, dim1, voucher, reference, recordid, include, customer)

Get General Ledger Transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Transactions per Page (default=100)
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Transaction modified after
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
OffsetDateTime dueAfter = OffsetDateTime.now(); // OffsetDateTime | Due After
String dim1 = "dim1_example"; // String | Dimmention
String voucher = "voucher_example"; // String | Voucher
String reference = "reference_example"; // String | Reference
Integer recordid = 56; // Integer | Id Greater Than
String include = "include_example"; // String | fields to include
String customer = "customer_example"; // String | Customer Number
try {
    List<DkCloudDataModelCustomersTransactionModel> result = apiInstance.customerTransactionGetCustomerTransactions(page, count, modifiedAfter, createdAfter, createdBefore, dueAfter, dim1, voucher, reference, recordid, include, customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerTransactionGetCustomerTransactions");
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
 **recordid** | **Integer**| Id Greater Than | [optional]
 **include** | **String**| fields to include | [optional]
 **customer** | **String**| Customer Number | [optional]

### Return type

[**List&lt;DkCloudDataModelCustomersTransactionModel&gt;**](DkCloudDataModelCustomersTransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerUpdateCustomer"></a>
# **customerUpdateCustomer**
> customerUpdateCustomer(customer, obj)

Update a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Customer Number
DkCloudDataModelCustomersCustomerModel obj = new DkCloudDataModelCustomersCustomerModel(); // DkCloudDataModelCustomersCustomerModel | Customer Model
try {
    apiInstance.customerUpdateCustomer(customer, obj);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerUpdateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |
 **obj** | [**DkCloudDataModelCustomersCustomerModel**](DkCloudDataModelCustomersCustomerModel.md)| Customer Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

