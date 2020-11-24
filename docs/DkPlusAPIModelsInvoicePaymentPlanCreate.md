
# DkPlusAPIModelsInvoicePaymentPlanCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Payment plan description | 
**amount** | **Double** | Netto Invoice Amount | 
**netAmount** | **Double** | Net amount of invoice |  [optional]
**transactions** | [**List&lt;DkPlusAPIModelsInvoicePaymentPlanTransaction&gt;**](DkPlusAPIModelsInvoicePaymentPlanTransaction.md) | Breakdown of payment transactions when to process | 
**reference** | **String** | Plan External Reference Id |  [optional]
**card** | [**DkPlusAPIModelsInvoicePaymentPlanCard**](DkPlusAPIModelsInvoicePaymentPlanCard.md) | Card to use for Payment Plan | 
**senderId** | **String** | Sender Provider Id | 



