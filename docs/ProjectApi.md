# ProjectApi

All URIs are relative to *https://api.dkplus.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeeWorkCreateEmployeeWork**](ProjectApi.md#employeeWorkCreateEmployeeWork) | **POST** /api/v1/general/employee/{employee}/work | Add Employee Work Journal Entry
[**phasesCreatePhase**](ProjectApi.md#phasesCreatePhase) | **POST** /api/v1/projects/Phase | Create a Phase for the Project System
[**phasesGetPhase**](ProjectApi.md#phasesGetPhase) | **GET** /api/v1/Project/Phase/{number} | Get a phase
[**phasesGetPhases**](ProjectApi.md#phasesGetPhases) | **GET** /api/v1/Project/Phase/{page}/{count} | Get Project Phases
[**phasesUpdatePhase**](ProjectApi.md#phasesUpdatePhase) | **PUT** /api/v1/projects/Phase/{number} | Update Project System Phase
[**projectCreateProject**](ProjectApi.md#projectCreateProject) | **POST** /api/v1/project | Method used to create a new Project(Job)
[**projectGetModified**](ProjectApi.md#projectGetModified) | **GET** /api/v1/project/modified/{modified}/{page}/{count} | Get modified Projects
[**projectGetPage**](ProjectApi.md#projectGetPage) | **GET** /api/v1/project/page/{page}/{count} | Get Projects Paged
[**projectGetProject**](ProjectApi.md#projectGetProject) | **GET** /api/v1/project/{number} | Get Project
[**projectGetProjectInvoices**](ProjectApi.md#projectGetProjectInvoices) | **GET** /api/v1/project/{number}/invoice | Get Invoices for Project
[**projectGetProjects**](ProjectApi.md#projectGetProjects) | **GET** /api/v1/project | Get all Projects
[**projectTransactionGetProjectTransactionPage**](ProjectApi.md#projectTransactionGetProjectTransactionPage) | **GET** /api/v1/project/transaction/page/{page}/{count} | Get Project Transactions
[**tasksCreateTask**](ProjectApi.md#tasksCreateTask) | **POST** /api/v1/projects/task | Create a Task for the Project System
[**tasksGetTask**](ProjectApi.md#tasksGetTask) | **GET** /api/v1/Project/Tasks/{number} | 
[**tasksGetTasks**](ProjectApi.md#tasksGetTasks) | **GET** /api/v1/Project/Tasks/{page}/{count} | Get Project Tasks
[**tasksUpdateTask**](ProjectApi.md#tasksUpdateTask) | **PUT** /api/v1/projects/task/{number} | 


<a name="employeeWorkCreateEmployeeWork"></a>
# **employeeWorkCreateEmployeeWork**
> employeeWorkCreateEmployeeWork(employee, lines, post)

Add Employee Work Journal Entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String employee = "employee_example"; // String | Employee Number
List<DkPlusAPIModelsEmployeeEmployeeWork> lines = Arrays.asList(new DkPlusAPIModelsEmployeeEmployeeWork()); // List<DkPlusAPIModelsEmployeeEmployeeWork> | Journal Lines
Boolean post = true; // Boolean | Post Lines(Will be Locked and invoiced)
try {
    apiInstance.employeeWorkCreateEmployeeWork(employee, lines, post);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#employeeWorkCreateEmployeeWork");
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

<a name="phasesCreatePhase"></a>
# **phasesCreatePhase**
> phasesCreatePhase(model)

Create a Phase for the Project System

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
DkCloudDataModelProjectPhaseModel model = new DkCloudDataModelProjectPhaseModel(); // DkCloudDataModelProjectPhaseModel | Phase Model
try {
    apiInstance.phasesCreatePhase(model);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#phasesCreatePhase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**DkCloudDataModelProjectPhaseModel**](DkCloudDataModelProjectPhaseModel.md)| Phase Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="phasesGetPhase"></a>
# **phasesGetPhase**
> List&lt;DkCloudDataModelProjectPhaseModel&gt; phasesGetPhase(number, include)

Get a phase

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String number = "number_example"; // String | Phase Number
String include = "include_example"; // String | 
try {
    List<DkCloudDataModelProjectPhaseModel> result = apiInstance.phasesGetPhase(number, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#phasesGetPhase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Phase Number |
 **include** | **String**|  | [optional]

### Return type

[**List&lt;DkCloudDataModelProjectPhaseModel&gt;**](DkCloudDataModelProjectPhaseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="phasesGetPhases"></a>
# **phasesGetPhases**
> List&lt;DkCloudDataModelProjectPhaseModel&gt; phasesGetPhases(page, count, modifiedBefore, modifiedAfter, include)

Get Project Phases

Note: On every project there is a list og Phases for that project. if that list is empty all Phases can be used.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Objects per Page
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified after
String include = "include_example"; // String | Properties to include
try {
    List<DkCloudDataModelProjectPhaseModel> result = apiInstance.phasesGetPhases(page, count, modifiedBefore, modifiedAfter, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#phasesGetPhases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Objects per Page |
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **modifiedAfter** | **OffsetDateTime**| Modified after | [optional]
 **include** | **String**| Properties to include | [optional]

### Return type

[**List&lt;DkCloudDataModelProjectPhaseModel&gt;**](DkCloudDataModelProjectPhaseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="phasesUpdatePhase"></a>
# **phasesUpdatePhase**
> phasesUpdatePhase(number, model)

Update Project System Phase

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String number = "number_example"; // String | Phase Number
DkCloudDataModelProjectPhaseModel model = new DkCloudDataModelProjectPhaseModel(); // DkCloudDataModelProjectPhaseModel | Phase Model
try {
    apiInstance.phasesUpdatePhase(number, model);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#phasesUpdatePhase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Phase Number |
 **model** | [**DkCloudDataModelProjectPhaseModel**](DkCloudDataModelProjectPhaseModel.md)| Phase Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectCreateProject"></a>
# **projectCreateProject**
> DkCloudDataModelProjectProjectModel projectCreateProject(model)

Method used to create a new Project(Job)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
DkCloudDataModelProjectProjectModel model = new DkCloudDataModelProjectProjectModel(); // DkCloudDataModelProjectProjectModel | Project Model
try {
    DkCloudDataModelProjectProjectModel result = apiInstance.projectCreateProject(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectCreateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**DkCloudDataModelProjectProjectModel**](DkCloudDataModelProjectProjectModel.md)| Project Model |

### Return type

[**DkCloudDataModelProjectProjectModel**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectGetModified"></a>
# **projectGetModified**
> List&lt;DkCloudDataModelProjectProjectModel&gt; projectGetModified(modified, page, count)

Get modified Projects

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
OffsetDateTime modified = OffsetDateTime.now(); // OffsetDateTime | Modified
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Projects per Page
try {
    List<DkCloudDataModelProjectProjectModel> result = apiInstance.projectGetModified(modified, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectGetModified");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modified** | **OffsetDateTime**| Modified |
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Projects per Page |

### Return type

[**List&lt;DkCloudDataModelProjectProjectModel&gt;**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectGetPage"></a>
# **projectGetPage**
> List&lt;DkCloudDataModelProjectProjectModel&gt; projectGetPage(page, count, modifiedBefore, modifiedAfter, customer, group, dim1, dim2, dim3, type, status, include)

Get Projects Paged

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Projects per Page
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | 
String customer = "customer_example"; // String | 
String group = "group_example"; // String | 
String dim1 = "dim1_example"; // String | 
String dim2 = "dim2_example"; // String | 
String dim3 = "dim3_example"; // String | 
Integer type = 56; // Integer | 
Integer status = 56; // Integer | 
String include = "include_example"; // String | 
try {
    List<DkCloudDataModelProjectProjectModel> result = apiInstance.projectGetPage(page, count, modifiedBefore, modifiedAfter, customer, group, dim1, dim2, dim3, type, status, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectGetPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Projects per Page |
 **modifiedBefore** | **OffsetDateTime**|  | [optional]
 **modifiedAfter** | **OffsetDateTime**|  | [optional]
 **customer** | **String**|  | [optional]
 **group** | **String**|  | [optional]
 **dim1** | **String**|  | [optional]
 **dim2** | **String**|  | [optional]
 **dim3** | **String**|  | [optional]
 **type** | **Integer**|  | [optional]
 **status** | **Integer**|  | [optional]
 **include** | **String**|  | [optional]

### Return type

[**List&lt;DkCloudDataModelProjectProjectModel&gt;**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectGetProject"></a>
# **projectGetProject**
> DkCloudDataModelProjectProjectModel projectGetProject(number)

Get Project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String number = "number_example"; // String | 
try {
    DkCloudDataModelProjectProjectModel result = apiInstance.projectGetProject(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectGetProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |

### Return type

[**DkCloudDataModelProjectProjectModel**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectGetProjectInvoices"></a>
# **projectGetProjectInvoices**
> List&lt;DkCloudDataModelSalesInvoiceModel&gt; projectGetProjectInvoices(number)

Get Invoices for Project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String number = "number_example"; // String | 
try {
    List<DkCloudDataModelSalesInvoiceModel> result = apiInstance.projectGetProjectInvoices(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectGetProjectInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |

### Return type

[**List&lt;DkCloudDataModelSalesInvoiceModel&gt;**](DkCloudDataModelSalesInvoiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectGetProjects"></a>
# **projectGetProjects**
> List&lt;DkCloudDataModelProjectProjectModel&gt; projectGetProjects(modifiedBefore, modifiedAfter, customer, group, dim1, dim2, dim3, type, status, max, include)

Get all Projects

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | 
String customer = "customer_example"; // String | 
String group = "group_example"; // String | 
String dim1 = "dim1_example"; // String | 
String dim2 = "dim2_example"; // String | 
String dim3 = "dim3_example"; // String | 
Integer type = 56; // Integer | 
Integer status = 56; // Integer | 
Integer max = 56; // Integer | 
String include = "include_example"; // String | 
try {
    List<DkCloudDataModelProjectProjectModel> result = apiInstance.projectGetProjects(modifiedBefore, modifiedAfter, customer, group, dim1, dim2, dim3, type, status, max, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectGetProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifiedBefore** | **OffsetDateTime**|  | [optional]
 **modifiedAfter** | **OffsetDateTime**|  | [optional]
 **customer** | **String**|  | [optional]
 **group** | **String**|  | [optional]
 **dim1** | **String**|  | [optional]
 **dim2** | **String**|  | [optional]
 **dim3** | **String**|  | [optional]
 **type** | **Integer**|  | [optional]
 **status** | **Integer**|  | [optional]
 **max** | **Integer**|  | [optional]
 **include** | **String**|  | [optional]

### Return type

[**List&lt;DkCloudDataModelProjectProjectModel&gt;**](DkCloudDataModelProjectProjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="projectTransactionGetProjectTransactionPage"></a>
# **projectTransactionGetProjectTransactionPage**
> List&lt;DkCloudDataModelGeneralLedgerTransaction&gt; projectTransactionGetProjectTransactionPage(page, count, project, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dim1, voucher, reference, recordid, origin, include, sort, sorttype)

Get Project Transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer page = 56; // Integer | Page Number (default=1)
Integer count = 56; // Integer | Transactions per Page (default=100)
String project = "project_example"; // String | Project Number
String account = "account_example"; // String | General Ledger Account Number
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Created After
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Created Before
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified After
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
String dim1 = "dim1_example"; // String | Dimmention
String voucher = "voucher_example"; // String | Voucher
String reference = "reference_example"; // String | Referenec
Integer recordid = 56; // Integer | Record Id After
String origin = "origin_example"; // String | Origin
String include = "include_example"; // String | Fields to include
String sort = "sort_example"; // String | Field to Sort
String sorttype = "sorttype_example"; // String | Sort Direction
try {
    List<DkCloudDataModelGeneralLedgerTransaction> result = apiInstance.projectTransactionGetProjectTransactionPage(page, count, project, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dim1, voucher, reference, recordid, origin, include, sort, sorttype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectTransactionGetProjectTransactionPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number (default&#x3D;1) |
 **count** | **Integer**| Transactions per Page (default&#x3D;100) |
 **project** | **String**| Project Number | [optional]
 **account** | **String**| General Ledger Account Number | [optional]
 **createdAfter** | **OffsetDateTime**| Created After | [optional]
 **createdBefore** | **OffsetDateTime**| Created Before | [optional]
 **modifiedAfter** | **OffsetDateTime**| Modified After | [optional]
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **dim1** | **String**| Dimmention | [optional]
 **voucher** | **String**| Voucher | [optional]
 **reference** | **String**| Referenec | [optional]
 **recordid** | **Integer**| Record Id After | [optional]
 **origin** | **String**| Origin | [optional] [enum: GLJournal, ARJournal, APJournal, SOInvoice, ARInterestCalc, InJournal, SOJournal, SOOpenInvoice, PjJournal, APInvoice, APInvoicePayment, PjInvoice, SKIPayment, PjDirect, GeSaldo, FAJournal, INBOMFabricate, NOT_USED, Payments, BankTrans, PjPostedJournal, CustomReport, DepreciationReport, Visa, Euro, DoJournal, POJournal, POPostedJournal, DataExport, ORGrantApplication, OrGrantPayment, APInterestCalc, ARBSSPayment, ORMemberFee, ORMemberFeeClaim, ORMemberFeeClaimDrop, ARBSSPaymentEx_NOTUSED, ORMemberFeeClaimEx_NOTUSED, ORMemberFeeClaimDropEx_NOTUSED, InTrans, ORMemberFeeCreditcardEx, ORMemberFeeCreditcardPaymentEx, InWOPJournal, InOpenJournal, InUndispatchedSalesOrder, InWOPPostedJournal, GLTrans, APRequest, ArTrans, ApTrans, InPrescription, DiscardedAccountPeriod, SoHead, GLFastGd]
 **include** | **String**| Fields to include | [optional]
 **sort** | **String**| Field to Sort | [optional]
 **sorttype** | **String**| Sort Direction | [optional] [enum: Ascending, Descending]

### Return type

[**List&lt;DkCloudDataModelGeneralLedgerTransaction&gt;**](DkCloudDataModelGeneralLedgerTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tasksCreateTask"></a>
# **tasksCreateTask**
> tasksCreateTask(model)

Create a Task for the Project System

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
DkCloudDataModelProjectTaskModel model = new DkCloudDataModelProjectTaskModel(); // DkCloudDataModelProjectTaskModel | Task Model
try {
    apiInstance.tasksCreateTask(model);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#tasksCreateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**DkCloudDataModelProjectTaskModel**](DkCloudDataModelProjectTaskModel.md)| Task Model |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tasksGetTask"></a>
# **tasksGetTask**
> List&lt;DkCloudDataModelProjectTaskModel&gt; tasksGetTask(number, include)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String number = "number_example"; // String | 
String include = "include_example"; // String | 
try {
    List<DkCloudDataModelProjectTaskModel> result = apiInstance.tasksGetTask(number, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#tasksGetTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **include** | **String**|  | [optional]

### Return type

[**List&lt;DkCloudDataModelProjectTaskModel&gt;**](DkCloudDataModelProjectTaskModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tasksGetTasks"></a>
# **tasksGetTasks**
> List&lt;DkCloudDataModelProjectTaskModel&gt; tasksGetTasks(page, count, modifiedBefore, modifiedAfter, include)

Get Project Tasks

Note: On every project there is a list og Tasks for that project. if that list is empty all tasks can be used.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer page = 56; // Integer | Page Number
Integer count = 56; // Integer | Objects per Page
OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | Modified Before
OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | Modified after
String include = "include_example"; // String | Properties to include
try {
    List<DkCloudDataModelProjectTaskModel> result = apiInstance.tasksGetTasks(page, count, modifiedBefore, modifiedAfter, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#tasksGetTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Number |
 **count** | **Integer**| Objects per Page |
 **modifiedBefore** | **OffsetDateTime**| Modified Before | [optional]
 **modifiedAfter** | **OffsetDateTime**| Modified after | [optional]
 **include** | **String**| Properties to include | [optional]

### Return type

[**List&lt;DkCloudDataModelProjectTaskModel&gt;**](DkCloudDataModelProjectTaskModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tasksUpdateTask"></a>
# **tasksUpdateTask**
> tasksUpdateTask(number, model)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String number = "number_example"; // String | 
DkCloudDataModelProjectTaskModel model = new DkCloudDataModelProjectTaskModel(); // DkCloudDataModelProjectTaskModel | 
try {
    apiInstance.tasksUpdateTask(number, model);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#tasksUpdateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **model** | [**DkCloudDataModelProjectTaskModel**](DkCloudDataModelProjectTaskModel.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

