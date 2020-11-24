
# DkCloudDataModelMembersMember

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **Integer** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**number** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**ssNumber** | **String** |  |  [optional]
**address** | [**DkCloudDataModelGeneralAddress**](DkCloudDataModelGeneralAddress.md) |  |  [optional]
**contactDetail** | [**DkCloudDataModelGeneralContactInfo**](DkCloudDataModelGeneralContactInfo.md) |  |  [optional]
**password** | **String** |  |  [optional]
**group** | **String** |  |  [optional]
**tag** | **String** |  |  [optional]
**salesPerson** | **String** |  |  [optional]
**discount** | **Double** |  |  [optional]
**paymentType** | **String** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**noVat** | **Boolean** |  |  [optional]
**ledgerCode** | **String** |  |  [optional]
**points** | **Double** |  |  [optional]
**bankAccount** | [**DkCloudDataModelMembersBankAccount**](DkCloudDataModelMembersBankAccount.md) |  |  [optional]
**creditCard** | [**DkCloudDataModelGeneralCreditCard**](DkCloudDataModelGeneralCreditCard.md) |  |  [optional]
**statistics** | [**DkCloudDataModelMembersStatistics**](DkCloudDataModelMembersStatistics.md) |  |  [optional]
**status** | [**DkCloudDataModelMembersStatus**](DkCloudDataModelMembersStatus.md) |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**paymentMode** | **String** |  |  [optional]
**hasConfirmedTerms** | **Boolean** |  |  [optional]
**confirmedTermId** | **Integer** |  |  [optional]
**extraProperties** | **Map&lt;String, String&gt;** |  |  [optional]


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



