
# DkPlusAPIModelsGeneralLedgerLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** |  |  [optional]
**amount** | **Double** |  |  [optional]
**currency** | **String** |  |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dim1** | **String** |  |  [optional]
**reference** | **String** |  |  [optional]
**text** | **String** |  |  [optional]
**voucher** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GENERALLEDGER | &quot;GeneralLedger&quot;
CUSTOMER | &quot;Customer&quot;
VENDOR | &quot;Vendor&quot;
PROJECT | &quot;Project&quot;
PAYROLL | &quot;Payroll&quot;
FIXEDASSET | &quot;FixedAsset&quot;
MEMBERPAYMENT | &quot;MemberPayment&quot;
BANKTRANSACTION | &quot;BankTransaction&quot;
SUPPORTER | &quot;Supporter&quot;
BOOKING | &quot;Booking&quot;



