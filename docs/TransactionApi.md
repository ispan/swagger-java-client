# TransactionApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerTransactionGetCustomerTransactions**](TransactionApi.md#customerTransactionGetCustomerTransactions) | **GET** /api/v1/customer/transaction/page/{page}/{count} | Get General Ledger Transaction
[**generalLedgerTransactionGetGeneralTransactionPage**](TransactionApi.md#generalLedgerTransactionGetGeneralTransactionPage) | **GET** /api/v1/generalledger/transaction/page/{page}/{count} | Get General Ledger Transaction
[**productTransactionGetInventoryTransactionsPage**](TransactionApi.md#productTransactionGetInventoryTransactionsPage) | **GET** /api/v1/product/transaction/{page}/{count} | 
[**projectTransactionGetProjectTransactionPage**](TransactionApi.md#projectTransactionGetProjectTransactionPage) | **GET** /api/v1/project/transaction/page/{page}/{count} | Get Project Transactions
[**vendorTransactionGetVendorTransactions**](TransactionApi.md#vendorTransactionGetVendorTransactions) | **GET** /api/v1/vendor/transaction/{page}/{count} | 


<a name="customerTransactionGetCustomerTransactions"></a>
# **customerTransactionGetCustomerTransactions**
> List&lt;DkCloudDataModelCustomersTransactionModel&gt; customerTransactionGetCustomerTransactions(page, count, modifiedAfter, createdAfter, createdBefore, dueAfter, dim1, voucher, reference, recordid, include, customer)

Get General Ledger Transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
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
    System.err.println("Exception when calling TransactionApi#customerTransactionGetCustomerTransactions");
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

<a name="generalLedgerTransactionGetGeneralTransactionPage"></a>
# **generalLedgerTransactionGetGeneralTransactionPage**
> List&lt;DkCloudDataModelGeneralLedgerTransaction&gt; generalLedgerTransactionGetGeneralTransactionPage(page, count, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dueAfter, dim1, voucher, reference, recordid, include, sort, sorttype)

Get General Ledger Transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Transactions per Page (default=100)
String account = "account_example"; // String | General Ledger Account Number
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified After
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
OffsetDateTime dueAfter = OffsetDateTime.now(); // OffsetDateTime | Due After
String dim1 = "dim1_example"; // String | Dimmention
String voucher = "voucher_example"; // String | Voucher
String reference = "reference_example"; // String | Reference
Integer recordid = 56; // Integer | Id Greter Than
String include = "include_example"; // String | Fields to include
String sort = "sort_example"; // String | Field to sort by
String sorttype = "sorttype_example"; // String | Sort Direction
try {
    List<DkCloudDataModelGeneralLedgerTransaction> result = apiInstance.generalLedgerTransactionGetGeneralTransactionPage(page, count, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dueAfter, dim1, voucher, reference, recordid, include, sort, sorttype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#generalLedgerTransactionGetGeneralTransactionPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Transactions per Page (default&#x3D;100) |
 **account** | **String**| General Ledger Account Number | [optional]
 **createdAfter** | **OffsetDateTime**| Created After | [optional]
 **createdBefore** | **OffsetDateTime**| Created Before | [optional]
 **modifiedAfter** | **OffsetDateTime**| Modified After | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **dueAfter** | **OffsetDateTime**| Due After | [optional]
 **dim1** | **String**| Dimmention | [optional]
 **voucher** | **String**| Voucher | [optional]
 **reference** | **String**| Reference | [optional]
 **recordid** | **Integer**| Id Greter Than | [optional]
 **include** | **String**| Fields to include | [optional]
 **sort** | **String**| Field to sort by | [optional]
 **sorttype** | **String**| Sort Direction | [optional] [enum: Ascending, Descending]

### Return type

[**List&lt;DkCloudDataModelGeneralLedgerTransaction&gt;**](DkCloudDataModelGeneralLedgerTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productTransactionGetInventoryTransactionsPage"></a>
# **productTransactionGetInventoryTransactionsPage**
> List&lt;DkCloudDataModelProductsTransactionsModel&gt; productTransactionGetInventoryTransactionsPage(page, count, modifiedAfter, modifiedBefore, createdAfter, createdBefore, dim1, itemcode, warehouse, currency, reference, include)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Objects to return
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified After
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
String dim1 = "dim1_example"; // String | Dimmention
String itemcode = "itemcode_example"; // String | Item Code
String warehouse = "warehouse_example"; // String | Wharehouse
String currency = "currency_example"; // String | Currency Code
String reference = "reference_example"; // String | Reference
String include = "include_example"; // String | Fields to include
try {
    List<DkCloudDataModelProductsTransactionsModel> result = apiInstance.productTransactionGetInventoryTransactionsPage(page, count, modifiedAfter, modifiedBefore, createdAfter, createdBefore, dim1, itemcode, warehouse, currency, reference, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#productTransactionGetInventoryTransactionsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Objects to return |
 **modifiedAfter** | **OffsetDateTime**| Modified After | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **createdAfter** | **OffsetDateTime**| Created After | [optional]
 **createdBefore** | **OffsetDateTime**| Created Before | [optional]
 **dim1** | **String**| Dimmention | [optional]
 **itemcode** | **String**| Item Code | [optional]
 **warehouse** | **String**| Wharehouse | [optional]
 **currency** | **String**| Currency Code | [optional]
 **reference** | **String**| Reference | [optional]
 **include** | **String**| Fields to include | [optional]

### Return type

[**List&lt;DkCloudDataModelProductsTransactionsModel&gt;**](DkCloudDataModelProductsTransactionsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectTransactionGetProjectTransactionPage"></a>
# **projectTransactionGetProjectTransactionPage**
> List&lt;DkCloudDataModelGeneralLedgerTransaction&gt; projectTransactionGetProjectTransactionPage(page, count, project, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dim1, voucher, reference, recordid, origin, include, sort, sorttype)

Get Project Transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Transactions per Page (default=100)
String project = "project_example"; // String | Project Number
String account = "account_example"; // String | General Ledger Account Number
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified After
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
String dim1 = "dim1_example"; // String | Dimmention
String voucher = "voucher_example"; // String | Voucher
String reference = "reference_example"; // String | Referenec
Integer recordid = 56; // Integer | Record Id After
String origin = "origin_example"; // String | Origin
String include = "include_example"; // String | Fields to include
String sort = "sort_example"; // String | Field to Sort
String sorttype = "sorttype_example"; // String | Sort Direction
try {
    List<DkCloudDataModelGeneralLedgerTransaction> result = apiInstance.projectTransactionGetProjectTransactionPage(page, count, project, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dim1, voucher, reference, recordid, origin, include, sort, sorttype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#projectTransactionGetProjectTransactionPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Transactions per Page (default&#x3D;100) |
 **project** | **String**| Project Number | [optional]
 **account** | **String**| General Ledger Account Number | [optional]
 **createdAfter** | **OffsetDateTime**| Created After | [optional]
 **createdBefore** | **OffsetDateTime**| Created Before | [optional]
 **modifiedAfter** | **OffsetDateTime**| Modified After | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **dim1** | **String**| Dimmention | [optional]
 **voucher** | **String**| Voucher | [optional]
 **reference** | **String**| Referenec | [optional]
 **recordid** | **Integer**| Record Id After | [optional]
 **origin** | **String**| Origin | [optional] [enum: GLJournal, ARJournal, APJournal, SOInvoice, ARInterestCalc, InJournal, SOJournal, SOOpenInvoice, PjJournal, APInvoice, APInvoicePayment, PjInvoice, SKIPayment, PjDirect, GeSaldo, FAJournal, INBOMFabricate, NOT_USED, Payments, BankTrans, PjPostedJournal, CustomReport, DepreciationReport, Visa, Euro, DoJournal, POJournal, POPostedJournal, DataExport, ORGrantApplication, OrGrantPayment, APInterestCalc, ARBSSPayment, ORMemberFee, ORMemberFeeClaim, ORMemberFeeClaimDrop, ARBSSPaymentEx_NOTUSED, ORMemberFeeClaimEx_NOTUSED, ORMemberFeeClaimDropEx_NOTUSED, InTrans, ORMemberFeeCreditcardEx, ORMemberFeeCreditcardPaymentEx, InWOPJournal, InOpenJournal, InUndispatchedSalesOrder, InWOPPostedJournal, GLTrans, APRequest, ArTrans, ApTrans, InPrescription, DiscardedAccountPeriod, SoHead, GLFastGd]
 **include** | **String**| Fields to include | [optional]
 **sort** | **String**| Field to Sort | [optional]
 **sorttype** | **String**| Sort Direction | [optional] [enum: Ascending, Descending]

### Return type

[**List&lt;DkCloudDataModelGeneralLedgerTransaction&gt;**](DkCloudDataModelGeneralLedgerTransaction.md)

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
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
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
    System.err.println("Exception when calling TransactionApi#vendorTransactionGetVendorTransactions");
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

