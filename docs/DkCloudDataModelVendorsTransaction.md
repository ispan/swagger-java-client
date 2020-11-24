
# DkCloudDataModelVendorsTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **Integer** |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**vendor** | **String** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | **String** |  |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**text** | **String** |  |  [optional]
**reference** | **String** |  |  [optional]
**dim1** | **String** |  |  [optional]
**dim2** | **String** |  |  [optional]
**dim3** | **String** |  |  [optional]
**ledgerAccount** | **String** |  |  [optional]
**journalDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**journalType** | [**JournalTypeEnum**](#JournalTypeEnum) |  |  [optional]
**journalHeadType** | [**JournalHeadTypeEnum**](#JournalHeadTypeEnum) |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**inputAmount** | **Double** |  |  [optional]
**currencyAmount** | **Double** |  |  [optional]
**settleAmount** | **Double** |  |  [optional]
**settledCurrencyAmount** | **Double** |  |  [optional]
**settleId** | **Integer** |  |  [optional]
**amount** | **Double** |  |  [optional]
**currency** | **String** |  |  [optional]
**exchange** | **Double** |  |  [optional]
**voucher** | **String** |  |  [optional]
**origin** | [**OriginEnum**](#OriginEnum) |  |  [optional]
**code** | [**CodeEnum**](#CodeEnum) |  |  [optional]
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  |  [optional]
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  [optional]
**paymentSlip** | [**PaymentSlipEnum**](#PaymentSlipEnum) |  |  [optional]
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional]
**journalHeadCode** | **String** |  |  [optional]


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


<a name="JournalHeadTypeEnum"></a>
## Enum: JournalHeadTypeEnum
Name | Value
---- | -----
MANUAL | &quot;Manual&quot;
AUTOMATIC | &quot;Automatic&quot;
EXCHANGERATEDIFFERENCE | &quot;ExchangeRateDifference&quot;
PAYMENTS | &quot;Payments&quot;
RECEIPT | &quot;Receipt&quot;
FUNDTRANSFER | &quot;FundTransfer&quot;
MEDICOR | &quot;Medicor&quot;
WEBSERVICE | &quot;WebService&quot;
_CBSOONLINEPOSTING | &quot;_cbSoOnlinePosting&quot;
PRINTING | &quot;Printing&quot;
TIMECLOCK | &quot;TimeClock&quot;


<a name="OriginEnum"></a>
## Enum: OriginEnum
Name | Value
---- | -----
GLJOURNAL | &quot;GLJournal&quot;
ARJOURNAL | &quot;ARJournal&quot;
APJOURNAL | &quot;APJournal&quot;
SOINVOICE | &quot;SOInvoice&quot;
ARINTERESTCALC | &quot;ARInterestCalc&quot;
INJOURNAL | &quot;InJournal&quot;
SOJOURNAL | &quot;SOJournal&quot;
SOOPENINVOICE | &quot;SOOpenInvoice&quot;
PJJOURNAL | &quot;PjJournal&quot;
APINVOICE | &quot;APInvoice&quot;
APINVOICEPAYMENT | &quot;APInvoicePayment&quot;
PJINVOICE | &quot;PjInvoice&quot;
SKIPAYMENT | &quot;SKIPayment&quot;
PJDIRECT | &quot;PjDirect&quot;
GESALDO | &quot;GeSaldo&quot;
FAJOURNAL | &quot;FAJournal&quot;
INBOMFABRICATE | &quot;INBOMFabricate&quot;
NOT_USED | &quot;NOT_USED&quot;
PAYMENTS | &quot;Payments&quot;
BANKTRANS | &quot;BankTrans&quot;
PJPOSTEDJOURNAL | &quot;PjPostedJournal&quot;
CUSTOMREPORT | &quot;CustomReport&quot;
DEPRECIATIONREPORT | &quot;DepreciationReport&quot;
VISA | &quot;Visa&quot;
EURO | &quot;Euro&quot;
DOJOURNAL | &quot;DoJournal&quot;
POJOURNAL | &quot;POJournal&quot;
POPOSTEDJOURNAL | &quot;POPostedJournal&quot;
DATAEXPORT | &quot;DataExport&quot;
ORGRANTAPPLICATION | &quot;ORGrantApplication&quot;
ORGRANTPAYMENT | &quot;OrGrantPayment&quot;
APINTERESTCALC | &quot;APInterestCalc&quot;
ARBSSPAYMENT | &quot;ARBSSPayment&quot;
ORMEMBERFEE | &quot;ORMemberFee&quot;
ORMEMBERFEECLAIM | &quot;ORMemberFeeClaim&quot;
ORMEMBERFEECLAIMDROP | &quot;ORMemberFeeClaimDrop&quot;
ARBSSPAYMENTEX_NOTUSED | &quot;ARBSSPaymentEx_NOTUSED&quot;
ORMEMBERFEECLAIMEX_NOTUSED | &quot;ORMemberFeeClaimEx_NOTUSED&quot;
ORMEMBERFEECLAIMDROPEX_NOTUSED | &quot;ORMemberFeeClaimDropEx_NOTUSED&quot;
INTRANS | &quot;InTrans&quot;
ORMEMBERFEECREDITCARDEX | &quot;ORMemberFeeCreditcardEx&quot;
ORMEMBERFEECREDITCARDPAYMENTEX | &quot;ORMemberFeeCreditcardPaymentEx&quot;
INWOPJOURNAL | &quot;InWOPJournal&quot;
INOPENJOURNAL | &quot;InOpenJournal&quot;
INUNDISPATCHEDSALESORDER | &quot;InUndispatchedSalesOrder&quot;
INWOPPOSTEDJOURNAL | &quot;InWOPPostedJournal&quot;
GLTRANS | &quot;GLTrans&quot;
APREQUEST | &quot;APRequest&quot;
ARTRANS | &quot;ArTrans&quot;
APTRANS | &quot;ApTrans&quot;
INPRESCRIPTION | &quot;InPrescription&quot;
DISCARDEDACCOUNTPERIOD | &quot;DiscardedAccountPeriod&quot;
SOHEAD | &quot;SoHead&quot;
GLFASTGD | &quot;GLFastGd&quot;


<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
ORDINARY | &quot;Ordinary&quot;
BASETAX | &quot;BaseTax&quot;
TAX | &quot;Tax&quot;
OPENING | &quot;Opening&quot;
TAXSETTLEMENT | &quot;TaxSettlement&quot;
EXCHANGERATEDIFFERENCE | &quot;ExchangeRateDifference&quot;


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
DEBIT | &quot;Debit&quot;
CREDIT | &quot;Credit&quot;


<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
DEBITJOURNAL | &quot;DebitJournal&quot;
CREDITJOURNAL | &quot;CreditJournal&quot;
DEBITINVOICE | &quot;DebitInvoice&quot;
CREDITINVOICE | &quot;CreditInvoice&quot;
PAIDINVOICE | &quot;PaidInvoice&quot;
_CBSKIPAIDAPPLICATION | &quot;_cbSKIPaidApplication&quot;
EXCHANGERATEDIFFERENCE | &quot;ExchangeRateDifference&quot;
INTEREST | &quot;Interest&quot;
CAPITALTAX | &quot;CapitalTax&quot;


<a name="PaymentSlipEnum"></a>
## Enum: PaymentSlipEnum
Name | Value
---- | -----
BANKTRANSFER | &quot;BankTransfer&quot;
BANKSLIP | &quot;BankSlip&quot;
ABGIRO | &quot;ABGiro&quot;
CGIRO | &quot;CGiro&quot;
NOTDEFINED | &quot;NotDefined&quot;


<a name="PaymentStatusEnum"></a>
## Enum: PaymentStatusEnum
Name | Value
---- | -----
STATUSNONE | &quot;StatusNone&quot;
STATUSONHOLD | &quot;StatusOnHold&quot;



