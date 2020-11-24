
# DkCloudDataModelMembersFee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**period** | [**DkCloudDataModelMembersFeePeriod**](DkCloudDataModelMembersFeePeriod.md) |  |  [optional]
**discount** | [**DkCloudDataModelMembersFeeDiscount**](DkCloudDataModelMembersFeeDiscount.md) |  |  [optional]
**payment** | [**DkCloudDataModelMembersPaymentOptions**](DkCloudDataModelMembersPaymentOptions.md) |  |  [optional]
**disabled** | **Boolean** |  |  [optional]
**rateMonth** | **Integer** |  |  [optional]
**intrestRate** | **Double** |  |  [optional]
**interval** | [**IntervalEnum**](#IntervalEnum) |  |  [optional]
**dim2** | **String** |  |  [optional]
**campaign** | **String** |  |  [optional]
**feeType** | **String** |  |  [optional]
**memo** | **String** |  |  [optional]
**reductionPayment** | **Double** |  |  [optional]
**contactName** | **String** |  |  [optional]
**saleperson** | **String** |  |  [optional]
**rateSplit** | **Integer** |  |  [optional]
**creditCard** | [**DkCloudDataModelGeneralCreditCard**](DkCloudDataModelGeneralCreditCard.md) |  |  [optional]
**amount** | **Double** |  |  [optional]
**itemCode** | **String** |  |  [optional]
**payer** | [**DkCloudDataModelCustomersCustomerBaseModel**](DkCloudDataModelCustomersCustomerBaseModel.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** |  |  [optional]


<a name="IntervalEnum"></a>
## Enum: IntervalEnum
Name | Value
---- | -----
ONETIME | &quot;OneTime&quot;
MONTHLY | &quot;Monthly&quot;
YEARLY | &quot;Yearly&quot;



