# TableApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tableCreateRecord**](TableApi.md#tableCreateRecord) | **POST** /api/v1/general/table/{name} | Create Record In Table
[**tableDeleteRecord**](TableApi.md#tableDeleteRecord) | **DELETE** /api/v1/general/table/{name} | This action deletes a record WARNING: Action performed at own risk.
[**tableGetDeleted**](TableApi.md#tableGetDeleted) | **GET** /api/v1/general/table/{name}/deleted | Get Deleted Records from Table
[**tableGetRecordChangeCount**](TableApi.md#tableGetRecordChangeCount) | **GET** /api/v1/general/table/{name}/changes | Record Change Count from Table
[**tableGetRecordsFromTable**](TableApi.md#tableGetRecordsFromTable) | **GET** /api/v1/general/table/{name}/records | Get Records from a table
[**tableGetTableFields**](TableApi.md#tableGetTableFields) | **GET** /api/v1/general/table/{name}/fields | Return List of Table Fields
[**tableUpdateRecord**](TableApi.md#tableUpdateRecord) | **PUT** /api/v1/general/table/{name}/{key} | Update Record In DK


<a name="tableCreateRecord"></a>
# **tableCreateRecord**
> tableCreateRecord(name, values)

Create Record In Table

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TableApi;


TableApi apiInstance = new TableApi();
String name = "name_example"; // String | Table Name
Object values = null; // Object | Key Values
try {
    apiInstance.tableCreateRecord(name, values);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#tableCreateRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Table Name |
 **values** | **Object**| Key Values |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tableDeleteRecord"></a>
# **tableDeleteRecord**
> String tableDeleteRecord(name, value, key)

This action deletes a record WARNING: Action performed at own risk.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TableApi;


TableApi apiInstance = new TableApi();
String name = "name_example"; // String | Table Name
String value = "value_example"; // String | Lookup value
String key = "key_example"; // String | Field Name
try {
    String result = apiInstance.tableDeleteRecord(name, value, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#tableDeleteRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Table Name |
 **value** | **String**| Lookup value |
 **key** | **String**| Field Name | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tableGetDeleted"></a>
# **tableGetDeleted**
> List&lt;DkPlusAPIModelsRecordDeletedInfo&gt; tableGetDeleted(name, from)

Get Deleted Records from Table

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TableApi;


TableApi apiInstance = new TableApi();
String name = "name_example"; // String | Table Name
OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Deleted After
try {
    List<DkPlusAPIModelsRecordDeletedInfo> result = apiInstance.tableGetDeleted(name, from);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#tableGetDeleted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Table Name |
 **from** | **OffsetDateTime**| Deleted After | [optional]

### Return type

[**List&lt;DkPlusAPIModelsRecordDeletedInfo&gt;**](DkPlusAPIModelsRecordDeletedInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tableGetRecordChangeCount"></a>
# **tableGetRecordChangeCount**
> DkPlusAPIModelsTableChangeResponse tableGetRecordChangeCount(name, modified)

Record Change Count from Table

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TableApi;


TableApi apiInstance = new TableApi();
String name = "name_example"; // String | Table Name
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified After
try {
    DkPlusAPIModelsTableChangeResponse result = apiInstance.tableGetRecordChangeCount(name, modified);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#tableGetRecordChangeCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Table Name |
 **modified** | **OffsetDateTime**| Modified After | [optional]

### Return type

[**DkPlusAPIModelsTableChangeResponse**](DkPlusAPIModelsTableChangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tableGetRecordsFromTable"></a>
# **tableGetRecordsFromTable**
> String tableGetRecordsFromTable(name, output, modified, fields, count, key, value)

Get Records from a table

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TableApi;


TableApi apiInstance = new TableApi();
String name = "name_example"; // String | Table Name
String output = "output_example"; // String | Output Type
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified
String fields = "fields_example"; // String | Fields to Return
Integer count = 56; // Integer | Recourd Cout
String key = "key_example"; // String | 
String value = "value_example"; // String | 
try {
    String result = apiInstance.tableGetRecordsFromTable(name, output, modified, fields, count, key, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#tableGetRecordsFromTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Table Name |
 **output** | **String**| Output Type | [optional] [enum: Legacy, KeyValue]
 **modified** | **OffsetDateTime**| Modified | [optional]
 **fields** | **String**| Fields to Return | [optional]
 **count** | **Integer**| Recourd Cout | [optional]
 **key** | **String**|  | [optional]
 **value** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tableGetTableFields"></a>
# **tableGetTableFields**
> List&lt;String&gt; tableGetTableFields(name)

Return List of Table Fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TableApi;


TableApi apiInstance = new TableApi();
String name = "name_example"; // String | Table Name
try {
    List<String> result = apiInstance.tableGetTableFields(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#tableGetTableFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Table Name |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tableUpdateRecord"></a>
# **tableUpdateRecord**
> tableUpdateRecord(values, name, key)

Update Record In DK

## Set Values    Warning: you need to make sure 100% what you are doing

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TableApi;


TableApi apiInstance = new TableApi();
Object values = null; // Object | Values to Update
String name = "name_example"; // String | Table Nae
String key = "key_example"; // String | Index Keys
try {
    apiInstance.tableUpdateRecord(values, name, key);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#tableUpdateRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **values** | **Object**| Values to Update |
 **name** | **String**| Table Nae |
 **key** | **String**| Index Keys |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

