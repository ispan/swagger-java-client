
# DkCloudDataModelProductsTransactionsModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **Integer** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | **String** |  |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**origin** | [**OriginEnum**](#OriginEnum) |  |  [optional]
**headId** | **Integer** |  |  [optional]
**sequence** | **Integer** |  |  [optional]
**itemCode** | **String** |  |  [optional]
**warehouse** | **String** |  |  [optional]
**subGroup1** | **String** |  |  [optional]
**subGroup2** | **String** |  |  [optional]
**subGroup3** | **String** |  |  [optional]
**subGroup4** | **String** |  |  [optional]
**vendor** | **String** |  |  [optional]
**customer** | **String** |  |  [optional]
**voucher** | **String** |  |  [optional]
**transactionCode** | [**TransactionCodeEnum**](#TransactionCodeEnum) |  |  [optional]
**journalDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**journalType** | [**JournalTypeEnum**](#JournalTypeEnum) |  |  [optional]
**quantity** | **Double** |  |  [optional]
**purchasePrice** | **Double** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**exchange** | **Double** |  |  [optional]
**costPrice** | **Double** |  |  [optional]
**costAmount** | **Double** |  |  [optional]
**salesAmount** | **Double** |  |  [optional]
**inventOnHand** | **Double** |  |  [optional]
**text** | **String** |  |  [optional]
**reference** | **String** |  |  [optional]
**dim1** | **String** |  |  [optional]
**dim2** | **String** |  |  [optional]
**dim3** | **String** |  |  [optional]
**netWeight** | **Double** |  |  [optional]
**unitVolume** | **Double** |  |  [optional]
**numberOfPackages** | **Double** |  |  [optional]
**countedQuantity** | **Double** |  |  [optional]
**jobNumber** | **String** |  |  [optional]
**vendorPrice** | **Double** |  |  [optional]
**vendorDiscount** | **Double** |  |  [optional]
**fabrication** | **Integer** |  |  [optional]
**batch** | **String** |  |  [optional]
**batchExpiry** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**typeOf** | [**TypeOfEnum**](#TypeOfEnum) |  |  [optional]
**purchaseAmount** | **Double** |  |  [optional]
**unitCode** | **String** |  |  [optional]
**inPUnitCode** | **String** |  |  [optional]
**poBatchId** | **Integer** |  |  [optional]
**jobRequestId** | **String** |  |  [optional]


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
MEPAYMENTS | &quot;MEPayments&quot;
MEBANKTRANS | &quot;MEBankTrans&quot;
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
ARBSSPAYMENTEX | &quot;ARBSSPaymentEx&quot;
ORMEMBERFEECLAIMEX | &quot;ORMemberFeeClaimEx&quot;
ORMEMBERFEECLAIMDROPEX | &quot;ORMemberFeeClaimDropEx&quot;
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


<a name="TransactionCodeEnum"></a>
## Enum: TransactionCodeEnum
Name | Value
---- | -----
INTRANSACTIONJOURNAL | &quot;InTransactionJournal&quot;
INTRANSFERJOURNAL | &quot;InTransferJournal&quot;
INBOMJOURNAL | &quot;InBOMJournal&quot;
INCOUNTINGJOURNAL | &quot;InCountingJournal&quot;
SOSALESORDERS | &quot;SOSalesOrders&quot;
POPURCHASEORDERS | &quot;POPurchaseOrders&quot;
PJPROJECT | &quot;PjProject&quot;
SOAFREIKNINGUR | &quot;SOAfreikningur&quot;
POCUSTOMREPORT | &quot;POCustomReport&quot;


<a name="JournalTypeEnum"></a>
## Enum: JournalTypeEnum
Name | Value
---- | -----
MANUAL | &quot;Manual&quot;
AUTOMATIC | &quot;Automatic&quot;
EXCHANGERATEDIFFERENCE | &quot;ExchangeRateDifference&quot;
PAYMENTS | &quot;Payments&quot;
RECEIPT | &quot;Receipt&quot;
FUNDTRANSFER | &quot;FundTransfer&quot;
MEDICOR | &quot;Medicor&quot;
WEBSERVICE | &quot;Webservice&quot;
SOONLINEPOSTING | &quot;SoOnlinePosting&quot;
PRINTING | &quot;Printing&quot;


<a name="TypeOfEnum"></a>
## Enum: TypeOfEnum
Name | Value
---- | -----
NOTDEFINED | &quot;NotDefined&quot;
WASTAGE | &quot;Wastage&quot;
RETURNED | &quot;Returned&quot;
DEPRECIATED | &quot;Depreciated&quot;
ADJUSTED | &quot;Adjusted&quot;
EXTRAFEE | &quot;ExtraFee&quot;



