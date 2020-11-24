
# DkPlusAPIModelsInvoiceHead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer** | [**DkPlusAPIModelsInvoiceCustomer**](DkPlusAPIModelsInvoiceCustomer.md) | Customer Model | 
**reference** | **String** | External Invoice Reference |  [optional]
**text1** | **String** | Invoice Detail Text |  [optional]
**text2** | **String** | Invoice Additional Detail Text |  [optional]
**term** | **String** | Payment Terms |  [optional]
**mode** | **String** | Payment Mode |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Invoice Date |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Invoice Due Date |  [optional]
**currency** | **String** | Currency Code |  [optional]
**salesPerson** | **String** | Sales Person | 
**exchange** | **Double** | Currency Exchange Rate |  [optional]
**options** | [**DkPlusAPIModelsInvoiceOptions**](DkPlusAPIModelsInvoiceOptions.md) | Options Model |  [optional]
**lines** | [**List&lt;DkPlusAPIModelsInvoiceLine&gt;**](DkPlusAPIModelsInvoiceLine.md) | Invoice Lines |  [optional]
**payments** | [**List&lt;DkPlusAPIModelsInvoicePayment&gt;**](DkPlusAPIModelsInvoicePayment.md) | Invoice Payments |  [optional]
**attachment** | [**DkPlusAPIModelsFileModel**](DkPlusAPIModelsFileModel.md) | Attachment Model |  [optional]
**receiver** | [**DkPlusAPIModelsInvoiceReceiver**](DkPlusAPIModelsInvoiceReceiver.md) | Item Receiver |  [optional]
**contact** | [**DkPlusAPIModelsInvoiceContact**](DkPlusAPIModelsInvoiceContact.md) | Contact |  [optional]
**saleType** | [**SaleTypeEnum**](#SaleTypeEnum) | Sales Type |  [optional]
**properties** | **Map&lt;String, String&gt;** | Additional Properties |  [optional]
**project** | **String** | Project Job Number |  [optional]


<a name="SaleTypeEnum"></a>
## Enum: SaleTypeEnum
Name | Value
---- | -----
DEBIT | &quot;Debit&quot;
CREDIT | &quot;Credit&quot;
RETURNSALE | &quot;ReturnSale&quot;
DEBITCOMPUTATION | &quot;DebitComputation&quot;
CREDITCOMPUTATION | &quot;CreditComputation&quot;



