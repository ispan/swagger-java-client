
# DkCloudDataModelCustomersCustomerModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **String** |  | 
**deleted** | **Boolean** |  |  [optional]
**contacts** | [**List&lt;DkCloudDataModelCustomersContactModel&gt;**](DkCloudDataModelCustomersContactModel.md) |  |  [optional]
**recivers** | [**List&lt;DkCloudDataModelCustomersItemReciverModel&gt;**](DkCloudDataModelCustomersItemReciverModel.md) |  |  [optional]
**memos** | [**List&lt;DkCloudDataModelCustomersCustomerMemoModel&gt;**](DkCloudDataModelCustomersCustomerMemoModel.md) |  |  [optional]
**properties** | [**List&lt;DkCloudDataModelCustomersCustomerPropertyModel&gt;**](DkCloudDataModelCustomersCustomerPropertyModel.md) |  |  [optional]
**changes** | [**List&lt;DkCloudDataModelGeneralChangesModel&gt;**](DkCloudDataModelGeneralChangesModel.md) |  |  [optional]
**attachments** | [**List&lt;DkCloudDataModelGeneralAttachmentModel&gt;**](DkCloudDataModelGeneralAttachmentModel.md) |  |  [optional]
**conditions** | [**DkCloudDataModelCustomersCustomerCondition**](DkCloudDataModelCustomersCustomerCondition.md) |  |  [optional]
**sendTo** | [**DkCloudDataModelCustomersCustomerSendTo**](DkCloudDataModelCustomersCustomerSendTo.md) |  |  [optional]
**recordID** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**alias** | **String** |  |  [optional]
**address1** | **String** |  |  [optional]
**address2** | **String** |  |  [optional]
**address3** | **String** |  |  [optional]
**zipCode** | **String** |  |  [optional]
**balanceAmount** | **Double** |  |  [optional]
**phone** | **String** |  |  [optional]
**phoneLocal** | **String** |  |  [optional]
**phoneMobile** | **String** |  |  [optional]
**phoneFax** | **String** |  |  [optional]
**countryCode** | **String** |  |  [optional]
**originCountryCode** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**group** | **String** |  |  [optional]
**salesPerson** | **String** |  |  [optional]
**discount** | **Double** |  |  [optional]
**useItemRecivers** | **Boolean** |  |  [optional]
**paymentTerm** | **String** |  |  [optional]
**paymentMode** | **String** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**noVat** | **Boolean** |  |  [optional]
**ledgerCode** | **String** |  |  [optional]
**blocked** | **Boolean** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**priceGroup** | **Integer** |  |  [optional]
**billingFee** | **Double** |  |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
MALE | &quot;Male&quot;
FEMALE | &quot;Female&quot;
GENDERCOMPANY | &quot;GenderCompany&quot;
NOGENDER | &quot;NoGender&quot;
NOTEXISTS | &quot;NotExists&quot;
BOY | &quot;Boy&quot;
GIRL | &quot;Girl&quot;



