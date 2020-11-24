# TokenApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenCreateToken**](TokenApi.md#tokenCreateToken) | **POST** /api/v1/Token | Create Token
[**tokenDelete**](TokenApi.md#tokenDelete) | **DELETE** /api/v1/Token/{id} | Delete Token
[**tokenGetMyCompaniesByToken**](TokenApi.md#tokenGetMyCompaniesByToken) | **GET** /api/v1/Token/companies | Get Companies that user has access to
[**tokenGetMyTokens**](TokenApi.md#tokenGetMyTokens) | **GET** /api/v1/Token | Get Tokens
[**tokenGetPDF**](TokenApi.md#tokenGetPDF) | **GET** /api/v1/token/report/usage/pdf | Get Token Report
[**tokenGetTokenByID**](TokenApi.md#tokenGetTokenByID) | **GET** /api/v1/Token/{id} | Get Token
[**tokenGetUserInfo**](TokenApi.md#tokenGetUserInfo) | **GET** /api/v1/Token/{userID}/{companyID} | Get Token Employee
[**tokenSendEmail**](TokenApi.md#tokenSendEmail) | **POST** /api/v1/token/report/usage/email | Send Token Report to Email
[**tokenUpdateToken**](TokenApi.md#tokenUpdateToken) | **PUT** /api/v1/Token/{id} | Update Token


<a name="tokenCreateToken"></a>
# **tokenCreateToken**
> DkCloudDataModelUserTokenModel tokenCreateToken(value)

Create Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
DkPlusAPIModelsCreateTokenCredentialModel value = new DkPlusAPIModelsCreateTokenCredentialModel(); // DkPlusAPIModelsCreateTokenCredentialModel | Create Token Credentials
try {
    DkCloudDataModelUserTokenModel result = apiInstance.tokenCreateToken(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenCreateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkPlusAPIModelsCreateTokenCredentialModel**](DkPlusAPIModelsCreateTokenCredentialModel.md)| Create Token Credentials |

### Return type

[**DkCloudDataModelUserTokenModel**](DkCloudDataModelUserTokenModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenDelete"></a>
# **tokenDelete**
> tokenDelete(id)

Delete Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
UUID id = new UUID(); // UUID | Token Id
try {
    apiInstance.tokenDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Token Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenGetMyCompaniesByToken"></a>
# **tokenGetMyCompaniesByToken**
> DkPlusAPIModelsCompanyAccessModel tokenGetMyCompaniesByToken()

Get Companies that user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
try {
    DkPlusAPIModelsCompanyAccessModel result = apiInstance.tokenGetMyCompaniesByToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenGetMyCompaniesByToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DkPlusAPIModelsCompanyAccessModel**](DkPlusAPIModelsCompanyAccessModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenGetMyTokens"></a>
# **tokenGetMyTokens**
> DkCloudDataModelUserTokenModel tokenGetMyTokens()

Get Tokens

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
try {
    DkCloudDataModelUserTokenModel result = apiInstance.tokenGetMyTokens();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenGetMyTokens");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DkCloudDataModelUserTokenModel**](DkCloudDataModelUserTokenModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenGetPDF"></a>
# **tokenGetPDF**
> Object tokenGetPDF(from, to)

Get Token Report

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
try {
    Object result = apiInstance.tokenGetPDF(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenGetPDF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenGetTokenByID"></a>
# **tokenGetTokenByID**
> DkCloudDataModelUserTokenModel tokenGetTokenByID(id)

Get Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
UUID id = new UUID(); // UUID | Token Id
try {
    DkCloudDataModelUserTokenModel result = apiInstance.tokenGetTokenByID(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenGetTokenByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Token Id |

### Return type

[**DkCloudDataModelUserTokenModel**](DkCloudDataModelUserTokenModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenGetUserInfo"></a>
# **tokenGetUserInfo**
> String tokenGetUserInfo(userID, companyID)

Get Token Employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
String userID = "userID_example"; // String | User Id
String companyID = "companyID_example"; // String | Company Id
try {
    String result = apiInstance.tokenGetUserInfo(userID, companyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenGetUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **String**| User Id |
 **companyID** | **String**| Company Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenSendEmail"></a>
# **tokenSendEmail**
> Object tokenSendEmail(message, from, to)

Send Token Report to Email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
DkPlusMailModelMailInfo message = new DkPlusMailModelMailInfo(); // DkPlusMailModelMailInfo | 
OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
try {
    Object result = apiInstance.tokenSendEmail(message, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenSendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**DkPlusMailModelMailInfo**](DkPlusMailModelMailInfo.md)|  |
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tokenUpdateToken"></a>
# **tokenUpdateToken**
> DkCloudDataModelUserTokenModel tokenUpdateToken(id, info)

Update Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
UUID id = new UUID(); // UUID | Token Id
DkPlusAPIModelsCreateTokenCredentialModel info = new DkPlusAPIModelsCreateTokenCredentialModel(); // DkPlusAPIModelsCreateTokenCredentialModel | Info Model
try {
    DkCloudDataModelUserTokenModel result = apiInstance.tokenUpdateToken(id, info);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#tokenUpdateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Token Id |
 **info** | [**DkPlusAPIModelsCreateTokenCredentialModel**](DkPlusAPIModelsCreateTokenCredentialModel.md)| Info Model |

### Return type

[**DkCloudDataModelUserTokenModel**](DkCloudDataModelUserTokenModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

