
# DkCloudDataModelMembersApplication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**member** | **String** |  |  [optional]
**bankAccount** | [**DkCloudDataModelMembersApplicationBankAccount**](DkCloudDataModelMembersApplicationBankAccount.md) |  |  [optional]
**contact** | [**DkCloudDataModelMembersApplicationContact**](DkCloudDataModelMembersApplicationContact.md) |  |  [optional]
**fund** | **String** |  |  [optional]
**grantDescription** | **String** |  |  [optional]
**grant** | **String** |  |  [optional]
**purpose** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**number** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**managedBy** | [**ManagedByEnum**](#ManagedByEnum) |  |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dateOfMeeting** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**denialCode** | **String** |  |  [optional]
**denialCodeDescription** | **String** |  |  [optional]
**group** | **String** |  |  [optional]
**subGroup** | **String** |  |  [optional]
**totalAmount** | **Double** |  |  [optional]
**period** | [**DkCloudDataModelGeneralDateRange**](DkCloudDataModelGeneralDateRange.md) |  |  [optional]
**amount** | **Double** |  |  [optional]
**posted** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**comment** | **String** |  |  [optional]
**text1** | **String** |  |  [optional]
**text2** | **String** |  |  [optional]
**membershipRulesOK** | **Boolean** |  |  [optional]
**grantRulesOK** | **Boolean** |  |  [optional]
**reference** | **String** |  |  [optional]
**jobRatio** | **Double** |  |  [optional]
**periodDesc** | **String** |  |  [optional]
**communicationMemo** | **String** |  |  [optional]
**grantCount** | **Integer** |  |  [optional]
**unitCount** | **Integer** |  |  [optional]
**location** | **String** |  |  [optional]
**periodDescription** | **String** |  |  [optional]
**organizer** | **String** |  |  [optional]
**workPlace** | **String** |  |  [optional]
**workPlaceNumber** | **String** |  |  [optional]
**voucherTag** | **String** |  |  [optional]
**details** | [**List&lt;DkCloudDataModelMembersApplicationDetail&gt;**](DkCloudDataModelMembersApplicationDetail.md) |  |  [optional]
**workPlaceHistory** | [**List&lt;DkCloudDataModelMembersWorkPlaceHistory&gt;**](DkCloudDataModelMembersWorkPlaceHistory.md) |  |  [optional]
**maternityLeaves** | [**List&lt;DkCloudDataModelMembersMaternityLeave&gt;**](DkCloudDataModelMembersMaternityLeave.md) |  |  [optional]
**amountTraveled** | **Double** |  |  [optional]
**travelCost** | **Double** |  |  [optional]
**companyID** | **String** |  |  [optional]
**attachments** | [**List&lt;DkCloudDataModelGeneralAttachmentModel&gt;**](DkCloudDataModelGeneralAttachmentModel.md) |  |  [optional]
**termsConsentGiven** | **Boolean** |  |  [optional]
**termId** | **Integer** |  |  [optional]
**extraProperties** | **Map&lt;String, String&gt;** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INPROGRESS | &quot;InProgress&quot;
ACCEPTED | &quot;Accepted&quot;
REJECTED | &quot;Rejected&quot;
EXPIRED | &quot;Expired&quot;
PARTLYPAID | &quot;PartlyPaid&quot;
FULLYPAID | &quot;FullyPaid&quot;
CLOSED | &quot;Closed&quot;
PAYEDTOCOMPANY | &quot;PayedToCompany&quot;
ONHOLD | &quot;OnHold&quot;
INVALID | &quot;Invalid&quot;
NOTFINISHED | &quot;NotFinished&quot;


<a name="ManagedByEnum"></a>
## Enum: ManagedByEnum
Name | Value
---- | -----
EMPLOYEE | &quot;Employee&quot;
MEETING | &quot;Meeting&quot;



