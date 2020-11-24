# GeneralLedgerApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generalLedgerAccountGet**](GeneralLedgerApi.md#generalLedgerAccountGet) | **GET** /api/v1/generalledger/account | Get General Ledger Accounts
[**generalLedgerAccountGetAccount**](GeneralLedgerApi.md#generalLedgerAccountGetAccount) | **GET** /api/v1/generalledger/account/{number} | Get General Ledger Account
[**generalLedgerAccountGetTransactions**](GeneralLedgerApi.md#generalLedgerAccountGetTransactions) | **GET** /api/v1/generalledger/account/{id}/transaction/{page}/{count} | Get transactions for a General Ledger Account
[**generalLedgerJournalGetGeneralLedgerJournal**](GeneralLedgerApi.md#generalLedgerJournalGetGeneralLedgerJournal) | **POST** /api/v1/generalLedger/journal | Create a General Ledger Journal
[**generalLedgerTransactionGetGeneralTransactionPage**](GeneralLedgerApi.md#generalLedgerTransactionGetGeneralTransactionPage) | **GET** /api/v1/generalledger/transaction/page/{page}/{count} | Get General Ledger Transaction


<a name="generalLedgerAccountGet"></a>
# **generalLedgerAccountGet**
> List&lt;DkCloudDataModelGeneralLedgerAccount&gt; generalLedgerAccountGet()

Get General Ledger Accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GeneralLedgerApi;


GeneralLedgerApi apiInstance = new GeneralLedgerApi();
try {
    List<DkCloudDataModelGeneralLedgerAccount> result = apiInstance.generalLedgerAccountGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerApi#generalLedgerAccountGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelGeneralLedgerAccount&gt;**](DkCloudDataModelGeneralLedgerAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="generalLedgerAccountGetAccount"></a>
# **generalLedgerAccountGetAccount**
> DkCloudDataModelGeneralLedgerAccount generalLedgerAccountGetAccount(number)

Get General Ledger Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GeneralLedgerApi;


GeneralLedgerApi apiInstance = new GeneralLedgerApi();
String number = "number_example"; // String | Account Number
try {
    DkCloudDataModelGeneralLedgerAccount result = apiInstance.generalLedgerAccountGetAccount(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerApi#generalLedgerAccountGetAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Account Number |

### Return type

[**DkCloudDataModelGeneralLedgerAccount**](DkCloudDataModelGeneralLedgerAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="generalLedgerAccountGetTransactions"></a>
# **generalLedgerAccountGetTransactions**
> List&lt;DkCloudDataModelGeneralLedgerTransaction&gt; generalLedgerAccountGetTransactions(id, page, count, createdAfter, createdBefore, dueAfter, dim1, voucher, reference)

Get transactions for a General Ledger Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GeneralLedgerApi;


GeneralLedgerApi apiInstance = new GeneralLedgerApi();
String id = "id_example"; // String | Account Number
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Transactions per Page (default=100)
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
OffsetDateTime dueAfter = OffsetDateTime.now(); // OffsetDateTime | Due After
String dim1 = "dim1_example"; // String | Dimmention
String voucher = "voucher_example"; // String | Voucher
String reference = "reference_example"; // String | Reference
try {
    List<DkCloudDataModelGeneralLedgerTransaction> result = apiInstance.generalLedgerAccountGetTransactions(id, page, count, createdAfter, createdBefore, dueAfter, dim1, voucher, reference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerApi#generalLedgerAccountGetTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account Number |
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Transactions per Page (default&#x3D;100) |
 **createdAfter** | **OffsetDateTime**| Created After | [optional]
 **createdBefore** | **OffsetDateTime**| Created Before | [optional]
 **dueAfter** | **OffsetDateTime**| Due After | [optional]
 **dim1** | **String**| Dimmention | [optional]
 **voucher** | **String**| Voucher | [optional]
 **reference** | **String**| Reference | [optional]

### Return type

[**List&lt;DkCloudDataModelGeneralLedgerTransaction&gt;**](DkCloudDataModelGeneralLedgerTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="generalLedgerJournalGetGeneralLedgerJournal"></a>
# **generalLedgerJournalGetGeneralLedgerJournal**
> generalLedgerJournalGetGeneralLedgerJournal(value)

Create a General Ledger Journal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GeneralLedgerApi;


GeneralLedgerApi apiInstance = new GeneralLedgerApi();
DkPlusAPIModelsGeneralLedgerHead value = new DkPlusAPIModelsGeneralLedgerHead(); // DkPlusAPIModelsGeneralLedgerHead | Journal Model
try {
    apiInstance.generalLedgerJournalGetGeneralLedgerJournal(value);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerApi#generalLedgerJournalGetGeneralLedgerJournal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkPlusAPIModelsGeneralLedgerHead**](DkPlusAPIModelsGeneralLedgerHead.md)| Journal Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="generalLedgerTransactionGetGeneralTransactionPage"></a>
# **generalLedgerTransactionGetGeneralTransactionPage**
> List&lt;DkCloudDataModelGeneralLedgerTransaction&gt; generalLedgerTransactionGetGeneralTransactionPage(page, count, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dueAfter, dim1, voucher, reference, recordid, include, sort, sorttype)

Get General Ledger Transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GeneralLedgerApi;


GeneralLedgerApi apiInstance = new GeneralLedgerApi();
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
    System.err.println("Exception when calling GeneralLedgerApi#generalLedgerTransactionGetGeneralTransactionPage");
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

