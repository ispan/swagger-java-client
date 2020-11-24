# MemberApplicationApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**memberApplicationGetApplicationAttachmentContent**](MemberApplicationApi.md#memberApplicationGetApplicationAttachmentContent) | **GET** /api/v1/Member/fund/{fund}/application/{application}/attachments/{id} | Get Application Attachment
[**memberApplicationGetApplicationAttachments**](MemberApplicationApi.md#memberApplicationGetApplicationAttachments) | **GET** /api/v1/Member/fund/{fund}/application/{id}/attachments | Get Attachment list for an Application
[**memberApplicationGetApplications**](MemberApplicationApi.md#memberApplicationGetApplications) | **GET** /api/v1/Member/{number}/application | Get Member Applications
[**memberApplicationPostApplication**](MemberApplicationApi.md#memberApplicationPostApplication) | **POST** /api/v1/member/{number}/application | Create a Member Application
[**memberApplicationUpdateApplicationStatus**](MemberApplicationApi.md#memberApplicationUpdateApplicationStatus) | **PUT** /api/v1/member/{number}/application/{id} | Update a Member Application
[**memberApplicationUploadFile**](MemberApplicationApi.md#memberApplicationUploadFile) | **POST** /api/v1/member/{number}/application/{id}/attachment | 


<a name="memberApplicationGetApplicationAttachmentContent"></a>
# **memberApplicationGetApplicationAttachmentContent**
> SystemWebMvcFileContentResult memberApplicationGetApplicationAttachmentContent(fund, application, id)

Get Application Attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApplicationApi;


MemberApplicationApi apiInstance = new MemberApplicationApi();
String fund = "fund_example"; // String | Fund Code
Integer application = 56; // Integer | Application Id
Integer id = 56; // Integer | Attachment Id
try {
    SystemWebMvcFileContentResult result = apiInstance.memberApplicationGetApplicationAttachmentContent(fund, application, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApplicationApi#memberApplicationGetApplicationAttachmentContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fund** | **String**| Fund Code |
 **application** | **Integer**| Application Id |
 **id** | **Integer**| Attachment Id |

### Return type

[**SystemWebMvcFileContentResult**](SystemWebMvcFileContentResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberApplicationGetApplicationAttachments"></a>
# **memberApplicationGetApplicationAttachments**
> SystemIOStream memberApplicationGetApplicationAttachments(fund, id)

Get Attachment list for an Application

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApplicationApi;


MemberApplicationApi apiInstance = new MemberApplicationApi();
String fund = "fund_example"; // String | Fund Code
Integer id = 56; // Integer | Application Id
try {
    SystemIOStream result = apiInstance.memberApplicationGetApplicationAttachments(fund, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApplicationApi#memberApplicationGetApplicationAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fund** | **String**| Fund Code |
 **id** | **Integer**| Application Id |

### Return type

[**SystemIOStream**](SystemIOStream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberApplicationGetApplications"></a>
# **memberApplicationGetApplications**
> List&lt;DkCloudDataModelMembersApplication&gt; memberApplicationGetApplications(number)

Get Member Applications

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApplicationApi;


MemberApplicationApi apiInstance = new MemberApplicationApi();
String number = "number_example"; // String | Member Number
try {
    List<DkCloudDataModelMembersApplication> result = apiInstance.memberApplicationGetApplications(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApplicationApi#memberApplicationGetApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**List&lt;DkCloudDataModelMembersApplication&gt;**](DkCloudDataModelMembersApplication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberApplicationPostApplication"></a>
# **memberApplicationPostApplication**
> DkPlusAPIModelsMemberMemberApplicationCreated memberApplicationPostApplication(number, obj)

Create a Member Application

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApplicationApi;


MemberApplicationApi apiInstance = new MemberApplicationApi();
String number = "number_example"; // String | Member Number
DkCloudDataModelMembersApplication obj = new DkCloudDataModelMembersApplication(); // DkCloudDataModelMembersApplication | Application Model
try {
    DkPlusAPIModelsMemberMemberApplicationCreated result = apiInstance.memberApplicationPostApplication(number, obj);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApplicationApi#memberApplicationPostApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |
 **obj** | [**DkCloudDataModelMembersApplication**](DkCloudDataModelMembersApplication.md)| Application Model |

### Return type

[**DkPlusAPIModelsMemberMemberApplicationCreated**](DkPlusAPIModelsMemberMemberApplicationCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberApplicationUpdateApplicationStatus"></a>
# **memberApplicationUpdateApplicationStatus**
> memberApplicationUpdateApplicationStatus(number, id, status, fund)

Update a Member Application

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApplicationApi;


MemberApplicationApi apiInstance = new MemberApplicationApi();
String number = "number_example"; // String | Member Number
Integer id = 56; // Integer | Application Id
String status = "status_example"; // String | Application Status
String fund = "fund_example"; // String | Fund Code
try {
    apiInstance.memberApplicationUpdateApplicationStatus(number, id, status, fund);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApplicationApi#memberApplicationUpdateApplicationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |
 **id** | **Integer**| Application Id |
 **status** | **String**| Application Status | [enum: InProgress, Accepted, Rejected, Expired, PartlyPaid, FullyPaid, Closed, PayedToCompany, OnHold, Invalid, NotFinished]
 **fund** | **String**| Fund Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberApplicationUploadFile"></a>
# **memberApplicationUploadFile**
> Object memberApplicationUploadFile(number, id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApplicationApi;


MemberApplicationApi apiInstance = new MemberApplicationApi();
String number = "number_example"; // String | 
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.memberApplicationUploadFile(number, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApplicationApi#memberApplicationUploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

