# TimeClockApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timeClockDkPosRegister**](TimeClockApi.md#timeClockDkPosRegister) | **POST** /api/v1/TimeClock/dkposregister/{employee} | 
[**timeClockGetConfig**](TimeClockApi.md#timeClockGetConfig) | **GET** /api/v1/TimeClock/web/config | 
[**timeClockGetEmployee**](TimeClockApi.md#timeClockGetEmployee) | **GET** /api/v1/TimeClock/Employee | 
[**timeClockGetIn**](TimeClockApi.md#timeClockGetIn) | **GET** /api/v1/TimeClock/in | 
[**timeClockGetOut**](TimeClockApi.md#timeClockGetOut) | **GET** /api/v1/TimeClock/out | 
[**timeClockGetProject**](TimeClockApi.md#timeClockGetProject) | **GET** /api/v1/TimeClock/project/{number} | 
[**timeClockQuit**](TimeClockApi.md#timeClockQuit) | **POST** /api/v1/TimeClock/quit | 
[**timeClockRegister**](TimeClockApi.md#timeClockRegister) | **POST** /api/v1/TimeClock/register/{employee} | 


<a name="timeClockDkPosRegister"></a>
# **timeClockDkPosRegister**
> Object timeClockDkPosRegister(employee, company, license, info)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
String employee = "employee_example"; // String | 
String company = "company_example"; // String | 
String license = "license_example"; // String | 
DkPlusAPIModelsTimeClockRegisterInfo info = new DkPlusAPIModelsTimeClockRegisterInfo(); // DkPlusAPIModelsTimeClockRegisterInfo | 
try {
    Object result = apiInstance.timeClockDkPosRegister(employee, company, license, info);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockDkPosRegister");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | **String**|  |
 **company** | **String**|  |
 **license** | **String**|  |
 **info** | [**DkPlusAPIModelsTimeClockRegisterInfo**](DkPlusAPIModelsTimeClockRegisterInfo.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="timeClockGetConfig"></a>
# **timeClockGetConfig**
> Object timeClockGetConfig(host)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
String host = "host_example"; // String | 
try {
    Object result = apiInstance.timeClockGetConfig(host);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockGetConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **host** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="timeClockGetEmployee"></a>
# **timeClockGetEmployee**
> Object timeClockGetEmployee(phone)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
String phone = "phone_example"; // String | 
try {
    Object result = apiInstance.timeClockGetEmployee(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockGetEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="timeClockGetIn"></a>
# **timeClockGetIn**
> Object timeClockGetIn()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
try {
    Object result = apiInstance.timeClockGetIn();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockGetIn");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="timeClockGetOut"></a>
# **timeClockGetOut**
> Object timeClockGetOut()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
try {
    Object result = apiInstance.timeClockGetOut();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockGetOut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="timeClockGetProject"></a>
# **timeClockGetProject**
> Object timeClockGetProject(number, company)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
String number = "number_example"; // String | 
UUID company = new UUID(); // UUID | 
try {
    Object result = apiInstance.timeClockGetProject(number, company);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockGetProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **company** | [**UUID**](.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="timeClockQuit"></a>
# **timeClockQuit**
> Object timeClockQuit(company, employee)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
UUID company = new UUID(); // UUID | 
String employee = "employee_example"; // String | 
try {
    Object result = apiInstance.timeClockQuit(company, employee);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockQuit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**UUID**](.md)|  |
 **employee** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="timeClockRegister"></a>
# **timeClockRegister**
> Object timeClockRegister(employee, company, project)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimeClockApi;


TimeClockApi apiInstance = new TimeClockApi();
String employee = "employee_example"; // String | 
String company = "company_example"; // String | 
String project = "project_example"; // String | 
try {
    Object result = apiInstance.timeClockRegister(employee, company, project);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeClockApi#timeClockRegister");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | **String**|  |
 **company** | **String**|  | [optional]
 **project** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

