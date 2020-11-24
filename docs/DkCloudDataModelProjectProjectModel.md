
# DkCloudDataModelProjectProjectModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **String** |  | 
**name** | **String** |  |  [optional]
**group** | **String** |  |  [optional]
**masterJobNumber** | **String** |  |  [optional]
**quotationNumber** | **Integer** |  |  [optional]
**customerToBill** | **String** |  |  [optional]
**customerNameToBill** | **String** |  |  [optional]
**customerToRecieve** | **String** |  |  [optional]
**founder** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**supervisor** | **String** |  |  [optional]
**worker** | **String** |  |  [optional]
**dim1** | **String** |  |  [optional]
**dim2** | **String** |  |  [optional]
**dim3** | **String** |  |  [optional]
**dim1Required** | **Boolean** |  |  [optional]
**dim2Required** | **Boolean** |  |  [optional]
**dim3Required** | **Boolean** |  |  [optional]
**foundingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**estimatedBeginingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**estimatedFinishDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**actualBeginingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**actualFinishDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**optimistDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**pessimistDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]
**jobStatus** | [**JobStatusEnum**](#JobStatusEnum) |  |  [optional]
**jobBillingMode** | [**JobBillingModeEnum**](#JobBillingModeEnum) |  |  [optional]
**phaseId** | **String** |  |  [optional]
**phaseRequired** | **Boolean** |  |  [optional]
**taskId** | **String** |  |  [optional]
**taskRequired** | **Boolean** |  |  [optional]
**foreignName** | **String** |  |  [optional]
**jobContactName** | **String** |  |  [optional]
**quotationAmount** | **Double** |  |  [optional]
**serialnumber** | **String** |  |  [optional]
**quotationAmountWithVAT** | **Boolean** |  |  [optional]
**ledgerCode** | **String** |  |  [optional]
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) |  |  [optional]
**jobDiscountPercent** | **Double** |  |  [optional]
**discountOfTime** | **Boolean** |  |  [optional]
**discountOfDriveTime** | **Boolean** |  |  [optional]
**discountOfCost** | **Boolean** |  |  [optional]
**foreignPriceForWork** | **Double** |  |  [optional]
**skipTaxOnInvoice** | **Boolean** |  |  [optional]
**quotationCurrencyCode** | **String** |  |  [optional]
**quotationWorkingHours** | **Double** |  |  [optional]
**quotationWorkingAmount** | **Double** |  |  [optional]
**quotationCostAmount** | **Double** |  |  [optional]
**quotationLicenceAmount** | **Double** |  |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**linkedPhases** | [**List&lt;DkCloudDataModelProjectProjectPhaseLinkModel&gt;**](DkCloudDataModelProjectProjectPhaseLinkModel.md) |  |  [optional]
**linkedTasks** | [**List&lt;DkCloudDataModelProjectProjectTaskLinkModel&gt;**](DkCloudDataModelProjectProjectTaskLinkModel.md) |  |  [optional]


<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
CBTIMEJOB | &quot;_cbTimeJob&quot;
CBSERVICEJOB | &quot;_cbServiceJob&quot;
CBQUOTATIONJOB | &quot;_cbQuotationJob&quot;
CBINHOUSEJOB | &quot;_cbInHouseJob&quot;


<a name="JobStatusEnum"></a>
## Enum: JobStatusEnum
Name | Value
---- | -----
NOTSTARTED | &quot;NotStarted&quot;
INPROGRESS | &quot;InProgress&quot;
INWAITING | &quot;InWaiting&quot;
FINISHED | &quot;Finished&quot;
READY | &quot;Ready&quot;


<a name="JobBillingModeEnum"></a>
## Enum: JobBillingModeEnum
Name | Value
---- | -----
MONTHLY | &quot;Monthly&quot;
FINISHED | &quot;Finished&quot;
IRREGULARY | &quot;Irregulary&quot;
BILL | &quot;Bill&quot;
WARRANTY | &quot;Warranty&quot;


<a name="DiscountTypeEnum"></a>
## Enum: DiscountTypeEnum
Name | Value
---- | -----
CUSTOMERDISCOUNT | &quot;CustomerDiscount&quot;
JOBDISCOUNT | &quot;JobDiscount&quot;
NODISCOUNT | &quot;NoDiscount&quot;



