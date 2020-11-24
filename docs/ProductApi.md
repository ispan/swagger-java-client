# ProductApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**barcodeCreateBarCode**](ProductApi.md#barcodeCreateBarCode) | **POST** /api/v1/barcode | Create a product barcode
[**barcodeGetBarcode**](ProductApi.md#barcodeGetBarcode) | **GET** /api/v1/barcode/{id} | Get a product from barcode
[**productCreateProduct**](ProductApi.md#productCreateProduct) | **POST** /api/v1/product | Create Product
[**productDeleteProduct**](ProductApi.md#productDeleteProduct) | **DELETE** /api/v1/Product/{id} | Delete Product
[**productGetModified**](ProductApi.md#productGetModified) | **GET** /api/v1/Product/modified/{modified}/{page}/{count} | Get Modified Products
[**productGetProductAttachment**](ProductApi.md#productGetProductAttachment) | **GET** /api/v1/product/{itemcode}/attachment/{id} | Get Product Attachment
[**productGetProductBarCodes**](ProductApi.md#productGetProductBarCodes) | **GET** /api/v1/product/{id}/barcode | Get Product Barcodes
[**productGetProductBarcode**](ProductApi.md#productGetProductBarcode) | **GET** /api/v1/product/{id}/barcode/{barcode} | Get Barcode for Product
[**productGetProductById**](ProductApi.md#productGetProductById) | **GET** /api/v1/Product/{id} | Get product
[**productGetProductCount**](ProductApi.md#productGetProductCount) | **GET** /api/v1/Product/info/count | Get Product count based on criteria
[**productGetProductSearch**](ProductApi.md#productGetProductSearch) | **GET** /api/v1/Product/search/{value}/{max} | Search for Product
[**productGetProductTransactions**](ProductApi.md#productGetProductTransactions) | **GET** /api/v1/product/{id}/transaction/{page}/{count} | Get Product Transactions
[**productGetProducts**](ProductApi.md#productGetProducts) | **GET** /api/v1/Product | Get Products
[**productGetProductsPage**](ProductApi.md#productGetProductsPage) | **GET** /api/v1/Product/page/{page}/{count} | Get Products Paged
[**productGroupGet**](ProductApi.md#productGroupGet) | **GET** /api/v1/productgroup | Get Product Groups
[**productTransactionGetInventoryTransactionsPage**](ProductApi.md#productTransactionGetInventoryTransactionsPage) | **GET** /api/v1/product/transaction/{page}/{count} | 
[**productUpdateProduct**](ProductApi.md#productUpdateProduct) | **PUT** /api/v1/product/{itemcode} | Update Product


<a name="barcodeCreateBarCode"></a>
# **barcodeCreateBarCode**
> barcodeCreateBarCode(model)

Create a product barcode

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
DkPlusAPIModelsProductInventoryBarcode model = new DkPlusAPIModelsProductInventoryBarcode(); // DkPlusAPIModelsProductInventoryBarcode | barcode model
try {
    apiInstance.barcodeCreateBarCode(model);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#barcodeCreateBarCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**DkPlusAPIModelsProductInventoryBarcode**](DkPlusAPIModelsProductInventoryBarcode.md)| barcode model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="barcodeGetBarcode"></a>
# **barcodeGetBarcode**
> DkCloudDataModelProductsProductModel barcodeGetBarcode(id)

Get a product from barcode

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Barcode
try {
    DkCloudDataModelProductsProductModel result = apiInstance.barcodeGetBarcode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#barcodeGetBarcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Barcode |

### Return type

[**DkCloudDataModelProductsProductModel**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productCreateProduct"></a>
# **productCreateProduct**
> DkCloudDataModelProductsProductModel productCreateProduct(value)

Create Product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
DkCloudDataModelProductsProductModel value = new DkCloudDataModelProductsProductModel(); // DkCloudDataModelProductsProductModel | Product Create Model
try {
    DkCloudDataModelProductsProductModel result = apiInstance.productCreateProduct(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCreateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**DkCloudDataModelProductsProductModel**](DkCloudDataModelProductsProductModel.md)| Product Create Model |

### Return type

[**DkCloudDataModelProductsProductModel**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productDeleteProduct"></a>
# **productDeleteProduct**
> productDeleteProduct(id, isBase64)

Delete Product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Item Code
Boolean isBase64 = true; // Boolean | Is Base64 Encoded
try {
    apiInstance.productDeleteProduct(id, isBase64);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productDeleteProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item Code |
 **isBase64** | **Boolean**| Is Base64 Encoded | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetModified"></a>
# **productGetModified**
> List&lt;DkCloudDataModelProductsProductModel&gt; productGetModified(modified, page, count, detailed, inactive, onweb, group, warehouse, include)

Get Modified Products

## Use Instead  api/v1/Product/Page&#39; instead with ?modified&#x3D;\&quot;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Product per Page
OffsetDateTime detailed = OffsetDateTime.now(); // OffsetDateTime | Detailed
Boolean inactive = true; // Boolean | Inactive
Boolean onweb = true; // Boolean | Show on web
String group = "group_example"; // String | Group
String warehouse = "warehouse_example"; // String | Warehouse
String include = "include_example"; // String | 
try {
    List<DkCloudDataModelProductsProductModel> result = apiInstance.productGetModified(modified, page, count, detailed, inactive, onweb, group, warehouse, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetModified");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modified** | **OffsetDateTime**| Modified |
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Product per Page |
 **detailed** | **OffsetDateTime**| Detailed | [optional]
 **inactive** | **Boolean**| Inactive | [optional]
 **onweb** | **Boolean**| Show on web | [optional]
 **group** | **String**| Group | [optional]
 **warehouse** | **String**| Warehouse | [optional]
 **include** | **String**|  | [optional]

### Return type

[**List&lt;DkCloudDataModelProductsProductModel&gt;**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductAttachment"></a>
# **productGetProductAttachment**
> Object productGetProductAttachment(itemcode, id, isBase64)

Get Product Attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String itemcode = "itemcode_example"; // String | Item Code
Integer id = 56; // Integer | Attachment Id
Boolean isBase64 = true; // Boolean | Is Base64 Encoded
try {
    Object result = apiInstance.productGetProductAttachment(itemcode, id, isBase64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemcode** | **String**| Item Code |
 **id** | **Integer**| Attachment Id |
 **isBase64** | **Boolean**| Is Base64 Encoded | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductBarCodes"></a>
# **productGetProductBarCodes**
> List&lt;DkCloudDataModelProductsBarcodesModel&gt; productGetProductBarCodes(id)

Get Product Barcodes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Item Code
try {
    List<DkCloudDataModelProductsBarcodesModel> result = apiInstance.productGetProductBarCodes(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductBarCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item Code |

### Return type

[**List&lt;DkCloudDataModelProductsBarcodesModel&gt;**](DkCloudDataModelProductsBarcodesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductBarcode"></a>
# **productGetProductBarcode**
> DkCloudDataModelProductsBarcodesModel productGetProductBarcode(id, barcode, isBase64)

Get Barcode for Product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Item Code
String barcode = "barcode_example"; // String | Barcode
Boolean isBase64 = true; // Boolean | Is Base64 Encoded
try {
    DkCloudDataModelProductsBarcodesModel result = apiInstance.productGetProductBarcode(id, barcode, isBase64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductBarcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item Code |
 **barcode** | **String**| Barcode |
 **isBase64** | **Boolean**| Is Base64 Encoded | [optional]

### Return type

[**DkCloudDataModelProductsBarcodesModel**](DkCloudDataModelProductsBarcodesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductById"></a>
# **productGetProductById**
> DkCloudDataModelProductsProductModel productGetProductById(id, isBase64)

Get product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Item Code
Boolean isBase64 = true; // Boolean | Is Base64 Encoded
try {
    DkCloudDataModelProductsProductModel result = apiInstance.productGetProductById(id, isBase64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item Code |
 **isBase64** | **Boolean**| Is Base64 Encoded | [optional]

### Return type

[**DkCloudDataModelProductsProductModel**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductCount"></a>
# **productGetProductCount**
> Long productGetProductCount(inactive, onweb, group, warehouse, modified, modifiedBefore)

Get Product count based on criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Boolean inactive = true; // Boolean | 
Boolean onweb = true; // Boolean | 
String group = "group_example"; // String | 
String warehouse = "warehouse_example"; // String | 
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | 
try {
    Long result = apiInstance.productGetProductCount(inactive, onweb, group, warehouse, modified, modifiedBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inactive** | **Boolean**|  | [optional]
 **onweb** | **Boolean**|  | [optional]
 **group** | **String**|  | [optional]
 **warehouse** | **String**|  | [optional]
 **modified** | **OffsetDateTime**|  | [optional]
 **modifiedBefore** | **OffsetDateTime**|  | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductSearch"></a>
# **productGetProductSearch**
> List&lt;DkCloudDataModelProductsProductModel&gt; productGetProductSearch(value, max)

Search for Product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String value = "value_example"; // String | Search string
Integer max = 56; // Integer | Maximum result
try {
    List<DkCloudDataModelProductsProductModel> result = apiInstance.productGetProductSearch(value, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Search string |
 **max** | **Integer**| Maximum result |

### Return type

[**List&lt;DkCloudDataModelProductsProductModel&gt;**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductTransactions"></a>
# **productGetProductTransactions**
> List&lt;DkCloudDataModelProductsTransactionsModel&gt; productGetProductTransactions(id, page, count, isBase64)

Get Product Transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Item Code
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Products per Page
Boolean isBase64 = true; // Boolean | Is Base64 Encoded
try {
    List<DkCloudDataModelProductsTransactionsModel> result = apiInstance.productGetProductTransactions(id, page, count, isBase64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item Code |
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Products per Page |
 **isBase64** | **Boolean**| Is Base64 Encoded | [optional]

### Return type

[**List&lt;DkCloudDataModelProductsTransactionsModel&gt;**](DkCloudDataModelProductsTransactionsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProducts"></a>
# **productGetProducts**
> List&lt;DkCloudDataModelProductsProductModel&gt; productGetProducts(inactive, onweb, group, warehouse, modified, modifiedBefore, include)

Get Products

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Boolean inactive = true; // Boolean | Inactive
Boolean onweb = true; // Boolean | Show on web
String group = "group_example"; // String | Group
String warehouse = "warehouse_example"; // String | Warehouse
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified after
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
String include = "include_example"; // String | Fields to include
try {
    List<DkCloudDataModelProductsProductModel> result = apiInstance.productGetProducts(inactive, onweb, group, warehouse, modified, modifiedBefore, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inactive** | **Boolean**| Inactive | [optional]
 **onweb** | **Boolean**| Show on web | [optional]
 **group** | **String**| Group | [optional]
 **warehouse** | **String**| Warehouse | [optional]
 **modified** | **OffsetDateTime**| Modified after | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **include** | **String**| Fields to include | [optional]

### Return type

[**List&lt;DkCloudDataModelProductsProductModel&gt;**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGetProductsPage"></a>
# **productGetProductsPage**
> List&lt;DkCloudDataModelProductsProductModel&gt; productGetProductsPage(page, count, inactive, onweb, group, warehouse, modified, modifiedBefore, deleted, include)

Get Products Paged

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Integer page = 56; // Integer | Page Numer
Integer count = 56; // Integer | Products per Page
Boolean inactive = true; // Boolean | Inactive
Boolean onweb = true; // Boolean | Show on web
String group = "group_example"; // String | Group
String warehouse = "warehouse_example"; // String | Warehouse
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified after
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
Boolean deleted = true; // Boolean | Product Deleted
String include = "include_example"; // String | Fields to include
try {
    List<DkCloudDataModelProductsProductModel> result = apiInstance.productGetProductsPage(page, count, inactive, onweb, group, warehouse, modified, modifiedBefore, deleted, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetProductsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Numer |
 **count** | **Integer**| Products per Page |
 **inactive** | **Boolean**| Inactive | [optional]
 **onweb** | **Boolean**| Show on web | [optional]
 **group** | **String**| Group | [optional]
 **warehouse** | **String**| Warehouse | [optional]
 **modified** | **OffsetDateTime**| Modified after | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **deleted** | **Boolean**| Product Deleted | [optional]
 **include** | **String**| Fields to include | [optional]

### Return type

[**List&lt;DkCloudDataModelProductsProductModel&gt;**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productGroupGet"></a>
# **productGroupGet**
> List&lt;DkCloudDataModelProductsProductGroupModel&gt; productGroupGet()

Get Product Groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
try {
    List<DkCloudDataModelProductsProductGroupModel> result = apiInstance.productGroupGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGroupGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelProductsProductGroupModel&gt;**](DkCloudDataModelProductsProductGroupModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productTransactionGetInventoryTransactionsPage"></a>
# **productTransactionGetInventoryTransactionsPage**
> List&lt;DkCloudDataModelProductsTransactionsModel&gt; productTransactionGetInventoryTransactionsPage(page, count, modifiedAfter, modifiedBefore, createdAfter, createdBefore, dim1, itemcode, warehouse, currency, reference, include)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Objects to return
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified After
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
String dim1 = "dim1_example"; // String | Dimmention
String itemcode = "itemcode_example"; // String | Item Code
String warehouse = "warehouse_example"; // String | Wharehouse
String currency = "currency_example"; // String | Currency Code
String reference = "reference_example"; // String | Reference
String include = "include_example"; // String | Fields to include
try {
    List<DkCloudDataModelProductsTransactionsModel> result = apiInstance.productTransactionGetInventoryTransactionsPage(page, count, modifiedAfter, modifiedBefore, createdAfter, createdBefore, dim1, itemcode, warehouse, currency, reference, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productTransactionGetInventoryTransactionsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Objects to return |
 **modifiedAfter** | **OffsetDateTime**| Modified After | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **createdAfter** | **OffsetDateTime**| Created After | [optional]
 **createdBefore** | **OffsetDateTime**| Created Before | [optional]
 **dim1** | **String**| Dimmention | [optional]
 **itemcode** | **String**| Item Code | [optional]
 **warehouse** | **String**| Wharehouse | [optional]
 **currency** | **String**| Currency Code | [optional]
 **reference** | **String**| Reference | [optional]
 **include** | **String**| Fields to include | [optional]

### Return type

[**List&lt;DkCloudDataModelProductsTransactionsModel&gt;**](DkCloudDataModelProductsTransactionsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productUpdateProduct"></a>
# **productUpdateProduct**
> DkCloudDataModelProductsProductModel productUpdateProduct(itemcode, value, isBase64)

Update Product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String itemcode = "itemcode_example"; // String | Item Code
DkCloudDataModelProductsProductModel value = new DkCloudDataModelProductsProductModel(); // DkCloudDataModelProductsProductModel | Product Update Model
Boolean isBase64 = true; // Boolean | Is Base64 Encoded
try {
    DkCloudDataModelProductsProductModel result = apiInstance.productUpdateProduct(itemcode, value, isBase64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productUpdateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemcode** | **String**| Item Code |
 **value** | [**DkCloudDataModelProductsProductModel**](DkCloudDataModelProductsProductModel.md)| Product Update Model |
 **isBase64** | **Boolean**| Is Base64 Encoded | [optional]

### Return type

[**DkCloudDataModelProductsProductModel**](DkCloudDataModelProductsProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

