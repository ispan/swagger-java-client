
# DkCloudDataModelCustomersTransactionModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **Integer** |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**customer** | **String** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | **String** |  |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**text** | **String** |  |  [optional]
**reference** | **String** |  |  [optional]
**dim1** | **String** |  |  [optional]
**dim2** | **String** |  |  [optional]
**dim3** | **String** |  |  [optional]
**journalDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**journalHeadCode** | **String** |  |  [optional]
**settledCurrencyAmount** | **Double** |  |  [optional]
**settledAmount** | **Double** |  |  [optional]
**settledStatus** | **Double** |  |  [optional]
**settled** | **Boolean** |  |  [optional]
**inputAmount** | **Double** |  |  [optional]
**currencyAmount** | **Double** |  |  [optional]
**amount** | **Double** |  |  [optional]
**currency** | **String** |  |  [optional]
**exchange** | **Double** |  |  [optional]
**code** | **Integer** |  |  [optional]
**voucher** | **String** |  |  [optional]
**origin** | **Integer** |  |  [optional]
**claimStatus** | **Integer** |  |  [optional]
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  [optional]
**journalType** | [**JournalTypeEnum**](#JournalTypeEnum) |  |  [optional]
**settleId** | **Integer** |  |  [optional]


<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
DEBETJOURNAL | &quot;DebetJournal&quot;
CREDITJOURNAL | &quot;CreditJournal&quot;
DEBETINVOICE | &quot;DebetInvoice&quot;
CREDITINVOICE | &quot;CreditInvoice&quot;
RETURNINVOICE | &quot;ReturnInvoice&quot;
INTEREST | &quot;Interest&quot;
EXCHANGERATEDIFFERENCE | &quot;ExchangeRateDifference&quot;
DEBETORJOURNAL | &quot;DebetORJournal&quot;
CREDITORJOURNAL | &quot;CreditORJournal&quot;
CLAIMBASE | &quot;ClaimBase&quot;
PAYEDCLAIM | &quot;PayedClaim&quot;
DROPPEDCLAIM | &quot;DroppedClaim&quot;
CREDITCARDBASE | &quot;CreditcardBase&quot;
PAYEDCREDITCARD | &quot;PayedCreditcard&quot;


<a name="JournalTypeEnum"></a>
## Enum: JournalTypeEnum
Name | Value
---- | -----
GENERALLEDGER | &quot;GeneralLedger&quot;
ACCOUNTSRECEIVABLE | &quot;AccountsReceivable&quot;
ACCOUNTSPAYABLE | &quot;AccountsPayable&quot;
PROJECTS | &quot;Projects&quot;
PAYROLL | &quot;Payroll&quot;
FIXEDASSETS | &quot;FixedAssets&quot;
MEMBERPAYMENTS | &quot;MemberPayments&quot;
BANKTRANSACTION | &quot;BankTransaction&quot;
SUPPORTER | &quot;Supporter&quot;
BOOKING | &quot;Booking&quot;



