
# DkCloudDataModelMembersApplicationDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeOfPayment** | [**TypeOfPaymentEnum**](#TypeOfPaymentEnum) |  |  [optional]
**actualPaymentDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**paymentAmount** | **Double** |  |  [optional]
**paymentPaid** | **Boolean** |  |  [optional]
**amountPaid** | **Double** |  |  [optional]
**taxAmountPaid** | **Double** |  |  [optional]
**extraProperties** | **Map&lt;String, String&gt;** |  |  [optional]


<a name="TypeOfPaymentEnum"></a>
## Enum: TypeOfPaymentEnum
Name | Value
---- | -----
NORMAL | &quot;Normal&quot;
COST | &quot;Cost&quot;
PAID | &quot;Paid&quot;



