
# DkCloudDataModelMembersGrant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  |  [optional]
**allowsTravelCost** | **Boolean** |  |  [optional]
**amountPerUnitOfTravel** | **Double** |  |  [optional]
**attachment1** | **String** |  |  [optional]
**attachment2** | **String** |  |  [optional]
**attachment3** | **String** |  |  [optional]
**attachment4** | **String** |  |  [optional]
**attachmentRequired** | **Boolean** |  |  [optional]
**description** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**text** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**rights** | [**DkCloudDataModelMembersGrantRights**](DkCloudDataModelMembersGrantRights.md) |  |  [optional]
**therapyType** | [**TherapyTypeEnum**](#TherapyTypeEnum) |  |  [optional]
**requirements** | [**DkCloudDataModelMembersGrantFieldRequirements**](DkCloudDataModelMembersGrantFieldRequirements.md) |  |  [optional]
**staticTravelAmount** | **Double** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GENERALAMOUNT | &quot;GeneralAmount&quot;
GENERALCOUNT | &quot;GeneralCount&quot;
GRADUATESTUDY | &quot;GraduateStudy&quot;
SEMINAR | &quot;Seminar&quot;
STUDYTOUR | &quot;StudyTour&quot;
SCHOOLFEES | &quot;SchoolFees&quot;
TRAVELCOST | &quot;TravelCost&quot;
STUDYHOLIDAY | &quot;StudyHoliday&quot;


<a name="TherapyTypeEnum"></a>
## Enum: TherapyTypeEnum
Name | Value
---- | -----
NOAPPLICATION | &quot;NoApplication&quot;
THERAPYPAY | &quot;TherapyPay&quot;
SICKPAYSELF | &quot;SickPaySelf&quot;
SICKPAYOTHER | &quot;SickPayOther&quot;
FUNERALPAY | &quot;FuneralPay&quot;
OTHERPAY | &quot;OtherPay&quot;
OTHERPAY2 | &quot;OtherPay2&quot;
VIS_A | &quot;VIS_A&quot;
VIS_B | &quot;VIS_B&quot;
VISINDIVIDUALS | &quot;VISIndividuals&quot;
VISGROUP | &quot;VISGroup&quot;



