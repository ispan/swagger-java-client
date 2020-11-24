
# DkCloudDataModelInviteInviteModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**company** | [**UUID**](UUID.md) |  |  [optional]
**customer** | **String** |  |  [optional]
**invitedBy** | **String** |  |  [optional]
**inviteType** | [**InviteTypeEnum**](#InviteTypeEnum) |  |  [optional]
**expires** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**cancelledBy** | **String** |  |  [optional]
**confirmed** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**extraInfo** | **String** |  |  [optional]


<a name="InviteTypeEnum"></a>
## Enum: InviteTypeEnum
Name | Value
---- | -----
MYPAGE | &quot;MyPage&quot;
DKPLUS | &quot;dkPlus&quot;



