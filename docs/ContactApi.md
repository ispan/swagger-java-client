# ContactApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactCreateContact**](ContactApi.md#contactCreateContact) | **POST** /api/v1/Customer/{customer}/Contact | Create a contact
[**contactDelete**](ContactApi.md#contactDelete) | **DELETE** /api/v1/Customer/{customer}/Contact/{contactId} | Delete Contact
[**contactGetContact**](ContactApi.md#contactGetContact) | **GET** /api/v1/Customer/{customer}/Contact/{contactId} | Get contact assigned to a customer
[**contactGetContacts**](ContactApi.md#contactGetContacts) | **GET** /api/v1/Customer/{customer}/Contact | Get contacts assigned to a customer
[**contactPut**](ContactApi.md#contactPut) | **PUT** /api/v1/Customer/{customer}/Contact/{contactId} | Update Contact


<a name="contactCreateContact"></a>
# **contactCreateContact**
> contactCreateContact(customer, value)

Create a contact

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String customer = "customer_example"; // String | Customer Number
DkCloudDataModelCustomersContactModel value = new DkCloudDataModelCustomersContactModel(); // DkCloudDataModelCustomersContactModel | Contact Model
try {
    apiInstance.contactCreateContact(customer, value);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactCreateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |
 **value** | [**DkCloudDataModelCustomersContactModel**](DkCloudDataModelCustomersContactModel.md)| Contact Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="contactDelete"></a>
# **contactDelete**
> contactDelete(customer, contactId)

Delete Contact

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String customer = "customer_example"; // String | Customer Number
String contactId = "contactId_example"; // String | Contact Number
try {
    apiInstance.contactDelete(customer, contactId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |
 **contactId** | **String**| Contact Number |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="contactGetContact"></a>
# **contactGetContact**
> DkCloudDataModelCustomersContactModel contactGetContact(customer, contactId)

Get contact assigned to a customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String customer = "customer_example"; // String | Customer Number
String contactId = "contactId_example"; // String | Contact Number
try {
    DkCloudDataModelCustomersContactModel result = apiInstance.contactGetContact(customer, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactGetContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |
 **contactId** | **String**| Contact Number |

### Return type

[**DkCloudDataModelCustomersContactModel**](DkCloudDataModelCustomersContactModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="contactGetContacts"></a>
# **contactGetContacts**
> List&lt;DkCloudDataModelCustomersContactModel&gt; contactGetContacts(customer)

Get contacts assigned to a customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String customer = "customer_example"; // String | Customer Number
try {
    List<DkCloudDataModelCustomersContactModel> result = apiInstance.contactGetContacts(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactGetContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer Number |

### Return type

[**List&lt;DkCloudDataModelCustomersContactModel&gt;**](DkCloudDataModelCustomersContactModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="contactPut"></a>
# **contactPut**
> contactPut(customer, contactId, value)

Update Contact

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String customer = "customer_example"; // String | Customer number
String contactId = "contactId_example"; // String | Cintact Number
DkCloudDataModelCustomersContactModel value = new DkCloudDataModelCustomersContactModel(); // DkCloudDataModelCustomersContactModel | Contact Model
try {
    apiInstance.contactPut(customer, contactId, value);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Customer number |
 **contactId** | **String**| Cintact Number |
 **value** | [**DkCloudDataModelCustomersContactModel**](DkCloudDataModelCustomersContactModel.md)| Contact Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

