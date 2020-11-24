
# VLinkDkSoftwareDkSOAPTOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**recordModified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**recordID** | **Integer** |  |  [optional]
**orderNumber** | **Integer** |  |  [optional]
**customerNumber** | **String** |  |  [optional]
**customer** | [**VLinkDkSoftwareDkSOAPTCustomer**](VLinkDkSoftwareDkSOAPTCustomer.md) |  |  [optional]
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**salePerson** | **String** |  |  [optional]
**totalAmount** | **Double** |  |  [optional]
**itemReceiver** | [**VLinkDkSoftwareDkSOAPTItemReceiver**](VLinkDkSoftwareDkSOAPTItemReceiver.md) |  |  [optional]
**contact** | [**VLinkDkSoftwareDkSOAPTContact**](VLinkDkSoftwareDkSOAPTContact.md) |  |  [optional]
**lines** | [**List&lt;VLinkDkSoftwareDkSOAPTOrderLine&gt;**](VLinkDkSoftwareDkSOAPTOrderLine.md) |  |  [optional]
**referenceNumber** | **String** |  |  [optional]
**customerOrderNo** | **String** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**exchange** | **Double** |  |  [optional]
**text1** | **String** |  |  [optional]
**text2** | **String** |  |  [optional]
**goodsmarking** | **String** |  |  [optional]
**customerOrderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**requestedDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**options** | [**VLinkDkSoftwareDkSOAPTOrderOptions**](VLinkDkSoftwareDkSOAPTOrderOptions.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum) |  |  [optional]
**headOriginType** | [**HeadOriginTypeEnum**](#HeadOriginTypeEnum) |  |  [optional]
**origin** | [**OriginEnum**](#OriginEnum) |  |  [optional]
**confirmedDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**finalDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**orgSalesOrderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**extraProperties** | [**List&lt;VLinkDkSoftwareDkSOAPTExtraProperty&gt;**](VLinkDkSoftwareDkSOAPTExtraProperty.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CBSOINPROCESS | &quot;_cbSOInProcess&quot;
CBSOSENT | &quot;_cbSOSent&quot;
CBSOPARTHANDLED | &quot;_cbSOPartHandled&quot;
CBSOHANDLED | &quot;_cbSOHandled&quot;
CBSOONHOLD | &quot;_cbSOOnHold&quot;
CBSOCANCELED | &quot;_cbSOCanceled&quot;


<a name="DeliveryStatusEnum"></a>
## Enum: DeliveryStatusEnum
Name | Value
---- | -----
CBDELINPROCESS | &quot;_cbDelInProcess&quot;
CBDELREADY | &quot;_cbDelReady&quot;
CBDELHURRY | &quot;_cbDelHurry&quot;
CBDELWAIT | &quot;_cbDelWait&quot;
CBDELREQUEST | &quot;_cbDelRequest&quot;


<a name="HeadOriginTypeEnum"></a>
## Enum: HeadOriginTypeEnum
Name | Value
---- | -----
CBSOHEADORIGINARCUSTOMER | &quot;_cbSOHeadOriginARCustomer&quot;
CBSOHEADORIGINCRMPROSPECT | &quot;_cbSOHeadOriginCRMProspect&quot;
CBSOHEADORIGINROOMER | &quot;_cbSOHeadOriginRoomer&quot;
CBSOHEADORIGINDKHOTEL | &quot;_cbSOHeadOriginDkHotel&quot;
CBSOHEADORIGINCODCUSTOMER | &quot;_cbSOHeadOriginCODCustomer&quot;
CBSOHEADORIGINDKONE | &quot;_cbSOHeadOriginDkOne&quot;
CBSOHEADORIGINGODO | &quot;_cbSOHeadOriginGoDo&quot;


<a name="OriginEnum"></a>
## Enum: OriginEnum
Name | Value
---- | -----
CBORIGINSALESORDER | &quot;_cbOriginSalesOrder&quot;
CBORIGINBACKORDER | &quot;_cbOriginBackOrder&quot;
CBORIGINQUOTATION | &quot;_cbOriginQuotation&quot;
CBORIGINRECURRINGORDER | &quot;_cbOriginRecurringOrder&quot;
CBORIGINJOB | &quot;_cbOriginJob&quot;
CBORIGINDKPOSINVOICE | &quot;_cbOrigindkPosInvoice&quot;
CBORIGINDKWEBSERVICE | &quot;_cbOrigindkWebService&quot;
CBORIGINSUBSCRIPTION | &quot;_cbOriginSubscription&quot;
CBORIGINHANDCOMPUTERS | &quot;_cbOriginHandComputers&quot;
CBORIGINCABAS | &quot;_cbOriginCabas&quot;
CBORIGINBOOKINGSYSTEM | &quot;_cbOriginBookingSystem&quot;
CBORIGINDISTRIBUTION | &quot;_cbOriginDistribution&quot;
CBORIGINMEKOCAT | &quot;_cbOriginMekoCat&quot;
CBORIGINUNDISPATCHEDSALESORDER | &quot;_cbOriginUndispatchedSalesOrder&quot;
CBORIGINPRESCRIPTION | &quot;_cbOriginPrescription&quot;
CBINVOICEORIGINUBLORDER | &quot;_cbInvoiceOriginUBLOrder&quot;
CBORIGINFASTEIGNAGJOLD | &quot;_cbOriginFasteignagjold&quot;



