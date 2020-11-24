
# DkCloudDataModelProductsProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**objectDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**recordID** | **Integer** |  |  [optional]
**itemCode** | **String** |  | 
**description** | **String** |  |  [optional]
**description2** | **String** |  |  [optional]
**inactive** | **Boolean** |  |  [optional]
**recordCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**recordModified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**aliasItemCode** | **String** |  |  [optional]
**itemClass** | **Integer** |  |  [optional]
**unitCode** | **String** |  |  [optional]
**group** | **String** |  |  [optional]
**unitQuantity** | **Double** |  |  [optional]
**netWeight** | **Double** |  |  [optional]
**unitVolume** | **Double** |  |  [optional]
**totalQuantityInWarehouse** | **Double** |  |  [optional]
**purchasePrice** | **Double** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**exchange** | **Double** |  |  [optional]
**unitPrice1** | **Double** |  |  [optional]
**purchasefactor** | **Double** |  |  [optional]
**costPrice** | **Double** |  |  [optional]
**profitRatio1** | **Double** |  |  [optional]
**unitPrice1WithTax** | **Double** |  |  [optional]
**unitPrice2** | **Double** |  |  [optional]
**unitPrice3WithTax** | **Double** |  |  [optional]
**showItemInWebShop** | **Boolean** |  |  [optional]
**allowDiscount** | **Boolean** |  |  [optional]
**discount** | **Double** |  |  [optional]
**unitPrice2WithTax** | **Double** |  |  [optional]
**unitPrice3** | **Double** |  |  [optional]
**propositionPrice** | **Double** |  |  [optional]
**propositionDateTo** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**extraDesc1** | **String** |  |  [optional]
**extraDesc2** | **String** |  |  [optional]
**isVariation** | **Boolean** |  |  [optional]
**taxPercent** | **Double** |  |  [optional]
**salesTaxCode** | **String** |  |  [optional]
**salesLedgerCode** | **String** |  |  [optional]
**purchaseTaxCode** | **String** |  |  [optional]
**purchaseLedgerCode** | **String** |  |  [optional]
**allowNegativeInventiry** | **Boolean** |  |  [optional]
**discountQuantity** | **Double** |  |  [optional]
**maxDiscountAllowed** | **Double** |  |  [optional]
**defaultSaleQuantity** | **Double** |  |  [optional]
**extraFeeItemCode** | **String** |  |  [optional]
**costMethod** | [**CostMethodEnum**](#CostMethodEnum) |  |  [optional]
**dim1** | **String** |  |  [optional]
**dim2** | **String** |  |  [optional]
**dim3** | **String** |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**hasAttachments** | **Boolean** |  |  [optional]
**hasBarcodes** | **Boolean** |  |  [optional]
**hasCurrencyPrices** | **Boolean** |  |  [optional]
**hasUnits** | **Boolean** |  |  [optional]
**hasAlternative** | **Boolean** |  |  [optional]
**barcodes** | [**List&lt;DkCloudDataModelProductsBarcodesModel&gt;**](DkCloudDataModelProductsBarcodesModel.md) |  |  [optional]
**attachments** | [**List&lt;DkCloudDataModelGeneralAttachmentModel&gt;**](DkCloudDataModelGeneralAttachmentModel.md) |  |  [optional]
**categories** | [**List&lt;DkCloudDataModelProductsCategoriesModel&gt;**](DkCloudDataModelProductsCategoriesModel.md) |  |  [optional]
**warehouses** | [**List&lt;DkCloudDataModelProductsProductWarehouseModel&gt;**](DkCloudDataModelProductsProductWarehouseModel.md) |  |  [optional]
**currencyPrices** | [**List&lt;DkCloudDataModelProductsCurrencyPriceModel&gt;**](DkCloudDataModelProductsCurrencyPriceModel.md) |  |  [optional]
**units** | [**List&lt;DkCloudDataModelProductsProductUnitModel&gt;**](DkCloudDataModelProductsProductUnitModel.md) |  |  [optional]
**alternative** | [**List&lt;DkCloudDataModelProductsAlternativeProductModel&gt;**](DkCloudDataModelProductsAlternativeProductModel.md) |  |  [optional]
**changes** | [**List&lt;DkCloudDataModelGeneralChangesModel&gt;**](DkCloudDataModelGeneralChangesModel.md) |  |  [optional]
**memos** | [**List&lt;DkCloudDataModelProductsProductMemo&gt;**](DkCloudDataModelProductsProductMemo.md) |  |  [optional]
**vendors** | [**List&lt;DkCloudDataModelProductsProductVendor&gt;**](DkCloudDataModelProductsProductVendor.md) |  |  [optional]


<a name="CostMethodEnum"></a>
## Enum: CostMethodEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
AVERAGE | &quot;Average&quot;
FIFO | &quot;FIFO&quot;
LIFO | &quot;LIFO&quot;



