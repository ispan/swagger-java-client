
# VLinkDkSoftwareDkSOAPTJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordID** | **Integer** |  |  [optional]
**number** | **String** |  |  [optional]
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
**jobDescription** | **String** |  |  [optional]
**linkedPhases** | [**List&lt;VLinkDkSoftwareDkSOAPTJobPhaseLink&gt;**](VLinkDkSoftwareDkSOAPTJobPhaseLink.md) |  |  [optional]
**linkedTasks** | [**List&lt;VLinkDkSoftwareDkSOAPTJobTaskLink&gt;**](VLinkDkSoftwareDkSOAPTJobTaskLink.md) |  |  [optional]


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
CBJOBNOTSTARTED | &quot;_cbJobNotStarted&quot;
CBJOBINPROGRESS | &quot;_cbJobInProgress&quot;
CBJOBINWAITING | &quot;_cbJobInWaiting&quot;
CBJOBFINISHED | &quot;_cbJobFinished&quot;
CBJOBREADY | &quot;_cbJobReady&quot;


<a name="JobBillingModeEnum"></a>
## Enum: JobBillingModeEnum
Name | Value
---- | -----
CBBILLMONTHLY | &quot;_cbBillMonthly&quot;
CBBILLFINISHED | &quot;_cbBillFinished&quot;
CBBILLIRREGULARY | &quot;_cbBillIrregulary&quot;
CBNOBILL | &quot;_cbNoBill&quot;
CBBILLWARRANTY | &quot;_cbBillWarranty&quot;


<a name="DiscountTypeEnum"></a>
## Enum: DiscountTypeEnum
Name | Value
---- | -----
CBPJCUSTOMERDISCOUNT | &quot;_cbPjCustomerDiscount&quot;
CBPJJOBDISCOUNT | &quot;_cbPjJobDiscount&quot;
CBPJNODISCOUNT | &quot;_cbPjNoDiscount&quot;



