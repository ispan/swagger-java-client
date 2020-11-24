# WarehouseApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**warehouseGetProductWarehouses**](WarehouseApi.md#warehouseGetProductWarehouses) | **GET** /api/v1/productwarehouse | Get all product warehouses


<a name="warehouseGetProductWarehouses"></a>
# **warehouseGetProductWarehouses**
> List&lt;DkCloudDataModelProductsWarehouseModel&gt; warehouseGetProductWarehouses()

Get all product warehouses

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WarehouseApi;


WarehouseApi apiInstance = new WarehouseApi();
try {
    List<DkCloudDataModelProductsWarehouseModel> result = apiInstance.warehouseGetProductWarehouses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#warehouseGetProductWarehouses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelProductsWarehouseModel&gt;**](DkCloudDataModelProductsWarehouseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

