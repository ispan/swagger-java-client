/*
 * dkPlus.API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DkCloudDataModelProductsBarcodesModel;
import io.swagger.client.model.DkCloudDataModelProductsProductGroupModel;
import io.swagger.client.model.DkCloudDataModelProductsProductModel;
import io.swagger.client.model.DkCloudDataModelProductsTransactionsModel;
import io.swagger.client.model.DkPlusAPIModelsProductInventoryBarcode;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductApi
 */
@Ignore
public class ProductApiTest {

    private final ProductApi api = new ProductApi();

    
    /**
     * Create a product barcode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void barcodeCreateBarCodeTest() throws ApiException {
        DkPlusAPIModelsProductInventoryBarcode model = null;
        api.barcodeCreateBarCode(model);

        // TODO: test validations
    }
    
    /**
     * Get a product from barcode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void barcodeGetBarcodeTest() throws ApiException {
        String id = null;
        DkCloudDataModelProductsProductModel response = api.barcodeGetBarcode(id);

        // TODO: test validations
    }
    
    /**
     * Create Product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productCreateProductTest() throws ApiException {
        DkCloudDataModelProductsProductModel value = null;
        DkCloudDataModelProductsProductModel response = api.productCreateProduct(value);

        // TODO: test validations
    }
    
    /**
     * Delete Product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productDeleteProductTest() throws ApiException {
        String id = null;
        Boolean isBase64 = null;
        api.productDeleteProduct(id, isBase64);

        // TODO: test validations
    }
    
    /**
     * Get Modified Products
     *
     * ## Use Instead  api/v1/Product/Page&#39; instead with ?modified&#x3D;\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetModifiedTest() throws ApiException {
        OffsetDateTime modified = null;
        Integer page = null;
        Integer count = null;
        OffsetDateTime detailed = null;
        Boolean inactive = null;
        Boolean onweb = null;
        String group = null;
        String warehouse = null;
        String include = null;
        List<DkCloudDataModelProductsProductModel> response = api.productGetModified(modified, page, count, detailed, inactive, onweb, group, warehouse, include);

        // TODO: test validations
    }
    
    /**
     * Get Product Attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductAttachmentTest() throws ApiException {
        String itemcode = null;
        Integer id = null;
        Boolean isBase64 = null;
        Object response = api.productGetProductAttachment(itemcode, id, isBase64);

        // TODO: test validations
    }
    
    /**
     * Get Product Barcodes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductBarCodesTest() throws ApiException {
        String id = null;
        List<DkCloudDataModelProductsBarcodesModel> response = api.productGetProductBarCodes(id);

        // TODO: test validations
    }
    
    /**
     * Get Barcode for Product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductBarcodeTest() throws ApiException {
        String id = null;
        String barcode = null;
        Boolean isBase64 = null;
        DkCloudDataModelProductsBarcodesModel response = api.productGetProductBarcode(id, barcode, isBase64);

        // TODO: test validations
    }
    
    /**
     * Get product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductByIdTest() throws ApiException {
        String id = null;
        Boolean isBase64 = null;
        DkCloudDataModelProductsProductModel response = api.productGetProductById(id, isBase64);

        // TODO: test validations
    }
    
    /**
     * Get Product count based on criteria
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductCountTest() throws ApiException {
        Boolean inactive = null;
        Boolean onweb = null;
        String group = null;
        String warehouse = null;
        OffsetDateTime modified = null;
        OffsetDateTime modifiedBefore = null;
        Long response = api.productGetProductCount(inactive, onweb, group, warehouse, modified, modifiedBefore);

        // TODO: test validations
    }
    
    /**
     * Search for Product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductSearchTest() throws ApiException {
        String value = null;
        Integer max = null;
        List<DkCloudDataModelProductsProductModel> response = api.productGetProductSearch(value, max);

        // TODO: test validations
    }
    
    /**
     * Get Product Transactions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductTransactionsTest() throws ApiException {
        String id = null;
        Integer page = null;
        Integer count = null;
        Boolean isBase64 = null;
        List<DkCloudDataModelProductsTransactionsModel> response = api.productGetProductTransactions(id, page, count, isBase64);

        // TODO: test validations
    }
    
    /**
     * Get Products
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductsTest() throws ApiException {
        Boolean inactive = null;
        Boolean onweb = null;
        String group = null;
        String warehouse = null;
        OffsetDateTime modified = null;
        OffsetDateTime modifiedBefore = null;
        String include = null;
        List<DkCloudDataModelProductsProductModel> response = api.productGetProducts(inactive, onweb, group, warehouse, modified, modifiedBefore, include);

        // TODO: test validations
    }
    
    /**
     * Get Products Paged
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetProductsPageTest() throws ApiException {
        Integer page = null;
        Integer count = null;
        Boolean inactive = null;
        Boolean onweb = null;
        String group = null;
        String warehouse = null;
        OffsetDateTime modified = null;
        OffsetDateTime modifiedBefore = null;
        Boolean deleted = null;
        String include = null;
        List<DkCloudDataModelProductsProductModel> response = api.productGetProductsPage(page, count, inactive, onweb, group, warehouse, modified, modifiedBefore, deleted, include);

        // TODO: test validations
    }
    
    /**
     * Get Product Groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGroupGetTest() throws ApiException {
        List<DkCloudDataModelProductsProductGroupModel> response = api.productGroupGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productTransactionGetInventoryTransactionsPageTest() throws ApiException {
        Integer page = null;
        Integer count = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String dim1 = null;
        String itemcode = null;
        String warehouse = null;
        String currency = null;
        String reference = null;
        String include = null;
        List<DkCloudDataModelProductsTransactionsModel> response = api.productTransactionGetInventoryTransactionsPage(page, count, modifiedAfter, modifiedBefore, createdAfter, createdBefore, dim1, itemcode, warehouse, currency, reference, include);

        // TODO: test validations
    }
    
    /**
     * Update Product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productUpdateProductTest() throws ApiException {
        String itemcode = null;
        DkCloudDataModelProductsProductModel value = null;
        Boolean isBase64 = null;
        DkCloudDataModelProductsProductModel response = api.productUpdateProduct(itemcode, value, isBase64);

        // TODO: test validations
    }
    
}