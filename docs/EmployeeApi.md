# EmployeeApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeeCreateEmployee**](EmployeeApi.md#employeeCreateEmployee) | **POST** /api/v1/general/employee | Create an employee
[**employeeGetEmployee**](EmployeeApi.md#employeeGetEmployee) | **GET** /api/v1/general/employee/{number} | Use this method to get an employee
[**employeeGetEmployeeTimeClock**](EmployeeApi.md#employeeGetEmployeeTimeClock) | **GET** /api/v1/general/employee/{number}/timeclock/page/{page}/{count} | Time clock entries for an employee
[**employeeGetEmployees**](EmployeeApi.md#employeeGetEmployees) | **GET** /api/v1/general/employee | Using this method you can get all employee´s from the system
[**employeeGetProjectSupervisor**](EmployeeApi.md#employeeGetProjectSupervisor) | **GET** /api/v1/general/employee/{number}/supervisor | Get projects where employee is assigned as a supervior
[**employeeGetProjectWorker**](EmployeeApi.md#employeeGetProjectWorker) | **GET** /api/v1/general/employee/{number}/worker | Get projects where employee is assigned as a worker
[**employeeUpdate**](EmployeeApi.md#employeeUpdate) | **PUT** /api/v1/general/employee/{number} | Update an employee
[**employeeWorkCreateEmployeeWork**](EmployeeApi.md#employeeWorkCreateEmployeeWork) | **POST** /api/v1/general/employee/{employee}/work | Add Employee Work Journal Entry


<a name="employeeCreateEmployee"></a>
# **employeeCreateEmployee**
> DkCloudDataModelEmployeeEmployeeModel employeeCreateEmployee(employee)

Create an employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
DkCloudDataModelEmployeeEmployeeModel employee = new DkCloudDataModelEmployeeEmployeeModel(); // DkCloudDataModelEmployeeEmployeeModel | 
try {
    DkCloudDataModelEmployeeEmployeeModel result = apiInstance.employeeCreateEmployee(employee);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeCreateEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | [**DkCloudDataModelEmployeeEmployeeModel**](DkCloudDataModelEmployeeEmployeeModel.md)|  |

### Return type

[**DkCloudDataModelEmployeeEmployeeModel**](DkCloudDataModelEmployeeEmployeeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="employeeGetEmployee"></a>
# **employeeGetEmployee**
> DkCloudDataModelEmployeeEmployeeModel employeeGetEmployee(number)

Use this method to get an employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
String number = "number_example"; // String | Employee number
try {
    DkCloudDataModelEmployeeEmployeeModel result = apiInstance.employeeGetEmployee(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Employee number |

### Return type

[**DkCloudDataModelEmployeeEmployeeModel**](DkCloudDataModelEmployeeEmployeeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="employeeGetEmployeeTimeClock"></a>
# **employeeGetEmployeeTimeClock**
> List&lt;DkCloudDataModelTimeClockEntryModel&gt; employeeGetEmployeeTimeClock(number, page, count)

Time clock entries for an employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
String number = "number_example"; // String | Employee number
Integer page = 56; // Integer | Page number (default=1)
Integer count = 56; // Integer | Number of objects on page (default=100)
try {
    List<DkCloudDataModelTimeClockEntryModel> result = apiInstance.employeeGetEmployeeTimeClock(number, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetEmployeeTimeClock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Employee number |
 **page** | **Integer**| Page number (default&#x3D;1) |
 **count** | **Integer**| Number of objects on page (default&#x3D;100) |

### Return type

[**List&lt;DkCloudDataModelTimeClockEntryModel&gt;**](DkCloudDataModelTimeClockEntryModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="employeeGetEmployees"></a>
# **employeeGetEmployees**
> List&lt;DkCloudDataModelEmployeeEmployeeModel&gt; employeeGetEmployees()

Using this method you can get all employee´s from the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
try {
    List<DkCloudDataModelEmployeeEmployeeModel> result = apiInstance.employeeGetEmployees();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetEmployees");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DkCloudDataModelEmployeeEmployeeModel&gt;**](DkCloudDataModelEmployeeEmployeeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="employeeGetProjectSupervisor"></a>
# **employeeGetProjectSupervisor**
> List&lt;DkCloudDataModelProjectProjectModel&gt; employeeGetProjectSupervisor(number)

Get projects where employee is assigned as a supervior

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
String number = "number_example"; // String | Employee number
try {
    List<DkCloudDataModelProjectProjectModel> result = apiInstance.employeeGetProjectSupervisor(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetProjectSupervisor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Employee number |

### Return type

[**List&lt;DkCloudDataModelProjectProjectModel&gt;**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="employeeGetProjectWorker"></a>
# **employeeGetProjectWorker**
> List&lt;DkCloudDataModelProjectProjectModel&gt; employeeGetProjectWorker(number)

Get projects where employee is assigned as a worker

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
String number = "number_example"; // String | Employee number
try {
    List<DkCloudDataModelProjectProjectModel> result = apiInstance.employeeGetProjectWorker(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetProjectWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Employee number |

### Return type

[**List&lt;DkCloudDataModelProjectProjectModel&gt;**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="employeeUpdate"></a>
# **employeeUpdate**
> DkCloudDataModelEmployeeEmployeeModel employeeUpdate(number, employee)

Update an employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
String number = "number_example"; // String | Employee number
DkCloudDataModelEmployeeEmployeeModel employee = new DkCloudDataModelEmployeeEmployeeModel(); // DkCloudDataModelEmployeeEmployeeModel | Employee Object
try {
    DkCloudDataModelEmployeeEmployeeModel result = apiInstance.employeeUpdate(number, employee);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Employee number |
 **employee** | [**DkCloudDataModelEmployeeEmployeeModel**](DkCloudDataModelEmployeeEmployeeModel.md)| Employee Object |

### Return type

[**DkCloudDataModelEmployeeEmployeeModel**](DkCloudDataModelEmployeeEmployeeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="employeeWorkCreateEmployeeWork"></a>
# **employeeWorkCreateEmployeeWork**
> employeeWorkCreateEmployeeWork(employee, lines, post)

Add Employee Work Journal Entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
String employee = "employee_example"; // String | Employee Number
List<DkPlusAPIModelsEmployeeEmployeeWork> lines = Arrays.asList(new DkPlusAPIModelsEmployeeEmployeeWork()); // List<DkPlusAPIModelsEmployeeEmployeeWork> | Journal Lines
Boolean post = true; // Boolean | Post Lines(Will be Locked and invoiced)
try {
    apiInstance.employeeWorkCreateEmployeeWork(employee, lines, post);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeWorkCreateEmployeeWork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | **String**| Employee Number |
 **lines** | [**List&lt;DkPlusAPIModelsEmployeeEmployeeWork&gt;**](DkPlusAPIModelsEmployeeEmployeeWork.md)| Journal Lines |
 **post** | **Boolean**| Post Lines(Will be Locked and invoiced) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

