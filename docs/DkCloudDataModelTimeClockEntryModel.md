
# DkCloudDataModelTimeClockEntryModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | [**UUID**](UUID.md) |  |  [optional]
**employee** | **String** |  |  [optional]
**dim1** | **String** |  |  [optional]
**dim2** | **String** |  |  [optional]
**dim3** | **String** |  |  [optional]
**project** | **String** |  |  [optional]
**phase** | **String** |  |  [optional]
**task** | **String** |  |  [optional]
**comment** | **String** |  |  [optional]
**currentStatus** | [**CurrentStatusEnum**](#CurrentStatusEnum) |  |  [optional]
**entryType** | [**DkCloudDataModelTimeClockEntryTypeModel**](DkCloudDataModelTimeClockEntryTypeModel.md) |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**actualStart** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**actualEnd** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**totalHours** | **Double** |  |  [optional]
**actualTotalHours** | **Double** |  |  [optional]
**totalMinutes** | **Double** |  |  [optional]
**actualTotalMinutes** | **Double** |  |  [optional]
**lines** | [**List&lt;DkCloudDataModelTimeClockChildEntryModel&gt;**](DkCloudDataModelTimeClockChildEntryModel.md) |  |  [optional]
**processed** | **Boolean** |  |  [optional]
**processedJournal** | **Boolean** |  |  [optional]


<a name="CurrentStatusEnum"></a>
## Enum: CurrentStatusEnum
Name | Value
---- | -----
WORK | &quot;Work&quot;
VACATION | &quot;Vacation&quot;
SICK | &quot;Sick&quot;



