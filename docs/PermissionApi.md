# PermissionApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**permissionGet**](PermissionApi.md#permissionGet) | **GET** /api/v1/permission | Current User Permission


<a name="permissionGet"></a>
# **permissionGet**
> DkCloudDataModelPermissionModulePermission permissionGet()

Current User Permission

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionApi;


PermissionApi apiInstance = new PermissionApi();
try {
    DkCloudDataModelPermissionModulePermission result = apiInstance.permissionGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionApi#permissionGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DkCloudDataModelPermissionModulePermission**](DkCloudDataModelPermissionModulePermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

