# MyPagesApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**myPagesCreateInvite**](MyPagesApi.md#myPagesCreateInvite) | **POST** /api/v1/mypages/invites | Create Invite
[**myPagesGetInvitesForCustomer**](MyPagesApi.md#myPagesGetInvitesForCustomer) | **GET** /api/v1/mypages/invites | Get Invites
[**myPagesRemoveInvite**](MyPagesApi.md#myPagesRemoveInvite) | **DELETE** /api/v1/mypages/invites/{id} | Remove Invite


<a name="myPagesCreateInvite"></a>
# **myPagesCreateInvite**
> DkCloudDataModelInviteInviteModel myPagesCreateInvite(obj)

Create Invite

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MyPagesApi;


MyPagesApi apiInstance = new MyPagesApi();
DkPlusAPIModelsMyPageInviteCreate obj = new DkPlusAPIModelsMyPageInviteCreate(); // DkPlusAPIModelsMyPageInviteCreate | Invite Create Model
try {
    DkCloudDataModelInviteInviteModel result = apiInstance.myPagesCreateInvite(obj);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MyPagesApi#myPagesCreateInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obj** | [**DkPlusAPIModelsMyPageInviteCreate**](DkPlusAPIModelsMyPageInviteCreate.md)| Invite Create Model |

### Return type

[**DkCloudDataModelInviteInviteModel**](DkCloudDataModelInviteInviteModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="myPagesGetInvitesForCustomer"></a>
# **myPagesGetInvitesForCustomer**
> DkPlusAPIModelsMyPageInvite myPagesGetInvitesForCustomer(customer)

Get Invites

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MyPagesApi;


MyPagesApi apiInstance = new MyPagesApi();
String customer = "customer_example"; // String | 
try {
    DkPlusAPIModelsMyPageInvite result = apiInstance.myPagesGetInvitesForCustomer(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MyPagesApi#myPagesGetInvitesForCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**|  |

### Return type

[**DkPlusAPIModelsMyPageInvite**](DkPlusAPIModelsMyPageInvite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="myPagesRemoveInvite"></a>
# **myPagesRemoveInvite**
> myPagesRemoveInvite(id, permanent)

Remove Invite

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MyPagesApi;


MyPagesApi apiInstance = new MyPagesApi();
UUID id = new UUID(); // UUID | Invite Id
Boolean permanent = true; // Boolean | Permanent
try {
    apiInstance.myPagesRemoveInvite(id, permanent);
} catch (ApiException e) {
    System.err.println("Exception when calling MyPagesApi#myPagesRemoveInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Invite Id |
 **permanent** | **Boolean**| Permanent | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

