# MemberApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**memberCreateMember**](MemberApi.md#memberCreateMember) | **POST** /api/v1/member | Create a Member
[**memberCreateMemberFee**](MemberApi.md#memberCreateMemberFee) | **POST** /api/v1/Member/{number}/fee | Use this method to create a member fee
[**memberGet**](MemberApi.md#memberGet) | **GET** /api/v1/Member/{page}/{size} | Get Memebers
[**memberGetByNumber**](MemberApi.md#memberGetByNumber) | **GET** /api/v1/Member/{number} | Get Member
[**memberGetCareer**](MemberApi.md#memberGetCareer) | **GET** /api/v1/Member/{number}/Career | Get Member Career
[**memberGetEducation**](MemberApi.md#memberGetEducation) | **GET** /api/v1/Member/{number}/education | Get Member Education
[**memberGetFund**](MemberApi.md#memberGetFund) | **GET** /api/v1/Member/{number}/fund | Get Member Funds
[**memberGetMembershipData**](MemberApi.md#memberGetMembershipData) | **GET** /api/v1/Member/{number}/membership | Get Membership Company assigned to Member
[**memberGetResume**](MemberApi.md#memberGetResume) | **GET** /api/v1/Member/{number}/Resume | Get Member Resume
[**memberGetSubGroup**](MemberApi.md#memberGetSubGroup) | **GET** /api/v1/Member/{number}/subgroup | Get Member Sub Groups
[**memberPut**](MemberApi.md#memberPut) | **PUT** /api/v1/member/{number} | Update Member


<a name="memberCreateMember"></a>
# **memberCreateMember**
> DkCloudDataModelMembersMember memberCreateMember(obj)

Create a Member

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
DkCloudDataModelMembersMember obj = new DkCloudDataModelMembersMember(); // DkCloudDataModelMembersMember | Member Model
try {
    DkCloudDataModelMembersMember result = apiInstance.memberCreateMember(obj);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberCreateMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obj** | [**DkCloudDataModelMembersMember**](DkCloudDataModelMembersMember.md)| Member Model |

### Return type

[**DkCloudDataModelMembersMember**](DkCloudDataModelMembersMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberCreateMemberFee"></a>
# **memberCreateMemberFee**
> memberCreateMemberFee(number, fee)

Use this method to create a member fee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
DkCloudDataModelMembersFee fee = new DkCloudDataModelMembersFee(); // DkCloudDataModelMembersFee | Fee Model
try {
    apiInstance.memberCreateMemberFee(number, fee);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberCreateMemberFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |
 **fee** | [**DkCloudDataModelMembersFee**](DkCloudDataModelMembersFee.md)| Fee Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGet"></a>
# **memberGet**
> List&lt;DkCloudDataModelMembersMember&gt; memberGet(page, size, modified, course, blocked)

Get Memebers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
Integer page = 56; // Integer | Page Number
Integer size = 56; // Integer | Members per Page
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified After
String course = "course_example"; // String | Cource Code
Boolean blocked = true; // Boolean | Blocked
try {
    List<DkCloudDataModelMembersMember> result = apiInstance.memberGet(page, size, modified, course, blocked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **size** | **Integer**| Members per Page |
 **modified** | **OffsetDateTime**| Modified After | [optional]
 **course** | **String**| Cource Code | [optional]
 **blocked** | **Boolean**| Blocked | [optional]

### Return type

[**List&lt;DkCloudDataModelMembersMember&gt;**](DkCloudDataModelMembersMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGetByNumber"></a>
# **memberGetByNumber**
> DkCloudDataModelMembersMember memberGetByNumber(number)

Get Member

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
try {
    DkCloudDataModelMembersMember result = apiInstance.memberGetByNumber(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGetByNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**DkCloudDataModelMembersMember**](DkCloudDataModelMembersMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGetCareer"></a>
# **memberGetCareer**
> List&lt;DkCloudDataModelMembersCareer&gt; memberGetCareer(number)

Get Member Career

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
try {
    List<DkCloudDataModelMembersCareer> result = apiInstance.memberGetCareer(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGetCareer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**List&lt;DkCloudDataModelMembersCareer&gt;**](DkCloudDataModelMembersCareer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGetEducation"></a>
# **memberGetEducation**
> List&lt;DkCloudDataModelMembersEducation&gt; memberGetEducation(number)

Get Member Education

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
try {
    List<DkCloudDataModelMembersEducation> result = apiInstance.memberGetEducation(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGetEducation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**List&lt;DkCloudDataModelMembersEducation&gt;**](DkCloudDataModelMembersEducation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGetFund"></a>
# **memberGetFund**
> DkCloudDataModelMembersMemberFund memberGetFund(number)

Get Member Funds

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
try {
    DkCloudDataModelMembersMemberFund result = apiInstance.memberGetFund(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGetFund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**DkCloudDataModelMembersMemberFund**](DkCloudDataModelMembersMemberFund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGetMembershipData"></a>
# **memberGetMembershipData**
> List&lt;DkCloudDataModelMembersMemberShipCompany&gt; memberGetMembershipData(number)

Get Membership Company assigned to Member

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
try {
    List<DkCloudDataModelMembersMemberShipCompany> result = apiInstance.memberGetMembershipData(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGetMembershipData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**List&lt;DkCloudDataModelMembersMemberShipCompany&gt;**](DkCloudDataModelMembersMemberShipCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGetResume"></a>
# **memberGetResume**
> List&lt;DkCloudDataModelMembersResume&gt; memberGetResume(number)

Get Member Resume

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
try {
    List<DkCloudDataModelMembersResume> result = apiInstance.memberGetResume(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGetResume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**List&lt;DkCloudDataModelMembersResume&gt;**](DkCloudDataModelMembersResume.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberGetSubGroup"></a>
# **memberGetSubGroup**
> List&lt;DkCloudDataModelMembersMemberSubGroup&gt; memberGetSubGroup(number)

Get Member Sub Groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
try {
    List<DkCloudDataModelMembersMemberSubGroup> result = apiInstance.memberGetSubGroup(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberGetSubGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |

### Return type

[**List&lt;DkCloudDataModelMembersMemberSubGroup&gt;**](DkCloudDataModelMembersMemberSubGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="memberPut"></a>
# **memberPut**
> DkCloudDataModelMembersMember memberPut(number, obj)

Update Member

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String number = "number_example"; // String | Member Number
DkCloudDataModelMembersMember obj = new DkCloudDataModelMembersMember(); // DkCloudDataModelMembersMember | Member Model
try {
    DkCloudDataModelMembersMember result = apiInstance.memberPut(number, obj);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#memberPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Member Number |
 **obj** | [**DkCloudDataModelMembersMember**](DkCloudDataModelMembersMember.md)| Member Model |

### Return type

[**DkCloudDataModelMembersMember**](DkCloudDataModelMembersMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

