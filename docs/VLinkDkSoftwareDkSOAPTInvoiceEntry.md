
# VLinkDkSoftwareDkSOAPTInvoiceEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceNumber** | **String** |  |  [optional]
**customerNumber** | **String** |  |  [optional]
**invoiceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**totalAmount** | **Double** |  |  [optional]
**totalAmountWithTax** | **Double** |  |  [optional]
**referenceNumber** | **String** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**settledType** | [**SettledTypeEnum**](#SettledTypeEnum) |  |  [optional]
**settledAmount** | **Double** |  |  [optional]
**discount** | **Double** |  |  [optional]
**discountPercent** | **Double** |  |  [optional]


<a name="SettledTypeEnum"></a>
## Enum: SettledTypeEnum
Name | Value
---- | -----
CBNOTSETTLED | &quot;_cbNotSettled&quot;
CBPARTLYSETTLED | &quot;_cbPartlySettled&quot;
CBFULLYSETTLED | &quot;_cbFullySettled&quot;



