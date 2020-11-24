
# VLinkDkSoftwareDkSOAPTCustomer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordID** | **Integer** |  |  [optional]
**number** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**ssNumber** | **String** |  |  [optional]
**address1** | **String** |  |  [optional]
**address2** | **String** |  |  [optional]
**address3** | **String** |  |  [optional]
**address4** | **String** |  |  [optional]
**zipCode** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**countryCode** | **String** |  |  [optional]
**countryName** | **String** |  |  [optional]
**countyCode** | **String** |  |  [optional]
**originCountryCode** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**phoneLocal** | **String** |  |  [optional]
**phoneMobile** | **String** |  |  [optional]
**phoneFax** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**group** | **String** |  |  [optional]
**salesPerson** | **String** |  |  [optional]
**discount** | **Double** |  |  [optional]
**itemReceivers** | [**List&lt;VLinkDkSoftwareDkSOAPTItemReceiver&gt;**](VLinkDkSoftwareDkSOAPTItemReceiver.md) |  |  [optional]
**useItemReceiver** | **Boolean** |  |  [optional]
**contacts** | [**List&lt;VLinkDkSoftwareDkSOAPTContact&gt;**](VLinkDkSoftwareDkSOAPTContact.md) |  |  [optional]
**paymentTerm** | **String** |  |  [optional]
**paymentMode** | **String** |  |  [optional]
**BSSID** | **String** |  |  [optional]
**bsSCondition** | [**BsSConditionEnum**](#BsSConditionEnum) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**noVat** | **Boolean** |  |  [optional]
**ledgerCode** | **String** |  |  [optional]
**recordCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**recordModified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**blocked** | **Boolean** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**creditCard** | [**VLinkDkSoftwareDkSOAPTCreditCard**](VLinkDkSoftwareDkSOAPTCreditCard.md) |  |  [optional]
**priceGroup** | [**PriceGroupEnum**](#PriceGroupEnum) |  |  [optional]
**billingFree** | **Double** |  |  [optional]
**properties** | [**List&lt;VLinkDkSoftwareDkSOAPTCustomerProperty&gt;**](VLinkDkSoftwareDkSOAPTCustomerProperty.md) |  |  [optional]
**memos** | [**List&lt;VLinkDkSoftwareDkSOAPTMemo&gt;**](VLinkDkSoftwareDkSOAPTMemo.md) |  |  [optional]
**changes** | [**List&lt;VLinkDkSoftwareDkSOAPTRecordChange&gt;**](VLinkDkSoftwareDkSOAPTRecordChange.md) |  |  [optional]
**attachments** | [**List&lt;VLinkDkSoftwareDkSOAPTAttachment&gt;**](VLinkDkSoftwareDkSOAPTAttachment.md) |  |  [optional]
**invoices** | [**List&lt;VLinkDkSoftwareDkSOAPTInvoiceEntry&gt;**](VLinkDkSoftwareDkSOAPTInvoiceEntry.md) |  |  [optional]
**balanceAmount** | **Double** |  |  [optional]
**notSendToRetailSystem** | **Boolean** |  |  [optional]
**jobs** | [**List&lt;VLinkDkSoftwareDkSOAPTJob&gt;**](VLinkDkSoftwareDkSOAPTJob.md) |  |  [optional]
**extraProperties** | [**List&lt;VLinkDkSoftwareDkSOAPTExtraProperty&gt;**](VLinkDkSoftwareDkSOAPTExtraProperty.md) |  |  [optional]


<a name="BsSConditionEnum"></a>
## Enum: BsSConditionEnum
Name | Value
---- | -----
CBBSSGENERAL | &quot;_cbBSSGeneral&quot;
CBBSSSPECIAL | &quot;_cbBSSSpecial&quot;


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
CONSMALE | &quot;_consMale&quot;
CONSFEMALE | &quot;_consFemale&quot;
CONSGENDERCOMPANY | &quot;_consGenderCompany&quot;
CONSNOGENDER | &quot;_consNoGender&quot;
CONSNOTEXISTS | &quot;_consNotExists&quot;
CBBOY | &quot;_cbBoy&quot;
CBGIRL | &quot;_cbGirl&quot;


<a name="PriceGroupEnum"></a>
## Enum: PriceGroupEnum
Name | Value
---- | -----
CBPRICE1 | &quot;_cbPrice1&quot;
CBPRICE2 | &quot;_cbPrice2&quot;
CBPRICE3 | &quot;_cbPrice3&quot;



