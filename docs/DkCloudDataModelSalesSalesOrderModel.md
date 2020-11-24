
# DkCloudDataModelSalesSalesOrderModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **Integer** |  |  [optional]
**customer** | [**DkCloudDataModelCustomersCustomerModel**](DkCloudDataModelCustomersCustomerModel.md) |  | 
**ccontact** | **String** |  |  [optional]
**ID** | **Integer** |  |  [optional]
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**totalAmount** | **Double** |  |  [optional]
**currency** | **String** |  |  [optional]
**reference** | **String** |  |  [optional]
**settledType** | **Integer** |  |  [optional]
**settledAmount** | **Double** |  |  [optional]
**salePerson** | **String** |  |  [optional]
**text1** | **String** |  |  [optional]
**text2** | **String** |  |  [optional]
**dim1** | **String** |  |  [optional]
**origin** | **Integer** |  |  [optional]
**paymentTerm** | **String** |  |  [optional]
**claimStatus** | **Integer** |  |  [optional]
**exchange** | **Double** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum) |  |  [optional]
**deliverTo** | [**DkCloudDataModelCustomersItemReciverModel**](DkCloudDataModelCustomersItemReciverModel.md) |  |  [optional]
**lines** | [**List&lt;DkCloudDataModelSalesSalesOrderLineModel&gt;**](DkCloudDataModelSalesSalesOrderLineModel.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INPROCESS | &quot;InProcess&quot;
SENT | &quot;Sent&quot;
PARTHANDLED | &quot;PartHandled&quot;
HANDLED | &quot;Handled&quot;
ONHOLD | &quot;OnHold&quot;
CANCELED | &quot;Canceled&quot;


<a name="DeliveryStatusEnum"></a>
## Enum: DeliveryStatusEnum
Name | Value
---- | -----
INPROCESS | &quot;InProcess&quot;
READY | &quot;Ready&quot;
HURRY | &quot;Hurry&quot;
WAIT | &quot;Wait&quot;
REQUEST | &quot;Request&quot;



