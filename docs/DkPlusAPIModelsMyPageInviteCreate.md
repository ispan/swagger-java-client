
# DkPlusAPIModelsMyPageInviteCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Email Address | 
**customer** | **String** | Customer Number | 
**expires** | [**OffsetDateTime**](OffsetDateTime.md) | Invite Expires At |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Assigned Role |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
USER | &quot;User&quot;
POWERUSER | &quot;PowerUser&quot;
ACCOUNTANT | &quot;Accountant&quot;
ADMIN | &quot;Admin&quot;
OWNER | &quot;Owner&quot;



