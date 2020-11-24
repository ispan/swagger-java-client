# WebHooksApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webHooksDelete**](WebHooksApi.md#webHooksDelete) | **DELETE** /api/v1/admin/webhook/{id} | 
[**webHooksGet**](WebHooksApi.md#webHooksGet) | **GET** /api/v1/admin/webhook | 
[**webHooksGetById**](WebHooksApi.md#webHooksGetById) | **GET** /api/v1/admin/webhook/{id} | 
[**webHooksPost**](WebHooksApi.md#webHooksPost) | **POST** /api/v1/admin/webhook | 
[**webHooksPut**](WebHooksApi.md#webHooksPut) | **PUT** /api/v1/admin/webhook/{id} | 
[**webHooksReceiver**](WebHooksApi.md#webHooksReceiver) | **POST** /api/v1/admin/webhook/Receiver | 
[**webHooksTest**](WebHooksApi.md#webHooksTest) | **POST** /api/v1/admin/webhook/action/test | 


<a name="webHooksDelete"></a>
# **webHooksDelete**
> Object webHooksDelete(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebHooksApi;


WebHooksApi apiInstance = new WebHooksApi();
UUID id = new UUID(); // UUID | 
try {
    Object result = apiInstance.webHooksDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHooksApi#webHooksDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="webHooksGet"></a>
# **webHooksGet**
> Object webHooksGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebHooksApi;


WebHooksApi apiInstance = new WebHooksApi();
try {
    Object result = apiInstance.webHooksGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHooksApi#webHooksGet");
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

<a name="webHooksGetById"></a>
# **webHooksGetById**
> Object webHooksGetById(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebHooksApi;


WebHooksApi apiInstance = new WebHooksApi();
UUID id = new UUID(); // UUID | 
try {
    Object result = apiInstance.webHooksGetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHooksApi#webHooksGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="webHooksPost"></a>
# **webHooksPost**
> Object webHooksPost(value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebHooksApi;


WebHooksApi apiInstance = new WebHooksApi();
DkCloudDataModelCompanyWebHookSubscription value = new DkCloudDataModelCompanyWebHookSubscription(); // DkCloudDataModelCompanyWebHookSubscription | 
try {
    Object result = apiInstance.webHooksPost(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHooksApi#webHooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkCloudDataModelCompanyWebHookSubscription**](DkCloudDataModelCompanyWebHookSubscription.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="webHooksPut"></a>
# **webHooksPut**
> Object webHooksPut(id, value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebHooksApi;


WebHooksApi apiInstance = new WebHooksApi();
UUID id = new UUID(); // UUID | 
DkCloudDataModelCompanyWebHookSubscription value = new DkCloudDataModelCompanyWebHookSubscription(); // DkCloudDataModelCompanyWebHookSubscription | 
try {
    Object result = apiInstance.webHooksPut(id, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHooksApi#webHooksPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **value** | [**DkCloudDataModelCompanyWebHookSubscription**](DkCloudDataModelCompanyWebHookSubscription.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="webHooksReceiver"></a>
# **webHooksReceiver**
> Object webHooksReceiver(value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebHooksApi;


WebHooksApi apiInstance = new WebHooksApi();
Object value = null; // Object | 
try {
    Object result = apiInstance.webHooksReceiver(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHooksApi#webHooksReceiver");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **Object**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="webHooksTest"></a>
# **webHooksTest**
> Object webHooksTest(value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebHooksApi;


WebHooksApi apiInstance = new WebHooksApi();
DkCloudDataModelCompanyWebHookSubscription value = new DkCloudDataModelCompanyWebHookSubscription(); // DkCloudDataModelCompanyWebHookSubscription | 
try {
    Object result = apiInstance.webHooksTest(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHooksApi#webHooksTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkCloudDataModelCompanyWebHookSubscription**](DkCloudDataModelCompanyWebHookSubscription.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

