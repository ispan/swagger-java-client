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
import io.swagger.client.model.DkCloudDataModelCustomersCustomerGroupModel;
import io.swagger.client.model.DkCloudDataModelCustomersCustomerModel;
import io.swagger.client.model.DkCloudDataModelCustomersTransactionModel;
import io.swagger.client.model.DkCloudDataModelProductsTransactionsModel;
import io.swagger.client.model.DkCloudDataModelProjectProjectModel;
import io.swagger.client.model.DkCloudDataModelSalesInvoiceModel;
import io.swagger.client.model.DkCloudDataModelSalesQuoteHead;
import io.swagger.client.model.DkCloudDataModelSalesSalesOrderModel;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
@Ignore
public class CustomerApiTest {

    private final CustomerApi api = new CustomerApi();

    
    /**
     * Generate Phone Caller id by phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCallerIdByPhoneTest() throws ApiException {
        String number = null;
        String format = null;
        String response = api.customerCallerIdByPhone(number, format);

        // TODO: test validations
    }
    
    /**
     * Create Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCreateCustomerTest() throws ApiException {
        DkCloudDataModelCustomersCustomerModel obj = null;
        api.customerCreateCustomer(obj);

        // TODO: test validations
    }
    
    /**
     * Get a document assigned to a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetAttachmentTest() throws ApiException {
        String customer = null;
        Integer id = null;
        Object response = api.customerGetAttachment(customer, id);

        // TODO: test validations
    }
    
    /**
     * Get a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCustomerByIdTest() throws ApiException {
        String customer = null;
        DkCloudDataModelCustomersCustomerModel response = api.customerGetCustomerById(customer);

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
    public void customerGetCustomerCountTest() throws ApiException {
        String group = null;
        String zipcode = null;
        String country = null;
        String salesperson = null;
        String paymentterm = null;
        String paymentmode = null;
        Boolean novat = null;
        Boolean blocked = null;
        String attribute = null;
        String attributecomment = null;
        String attributeoption = null;
        String memo = null;
        Boolean deleted = null;
        OffsetDateTime modifiedBefore = null;
        OffsetDateTime modifiedAfter = null;
        Long response = api.customerGetCustomerCount(group, zipcode, country, salesperson, paymentterm, paymentmode, novat, blocked, attribute, attributecomment, attributeoption, memo, deleted, modifiedBefore, modifiedAfter);

        // TODO: test validations
    }
    
    /**
     * Get Invoices for a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCustomerInvoicesTest() throws ApiException {
        String customer = null;
        List<DkCloudDataModelSalesInvoiceModel> response = api.customerGetCustomerInvoices(customer);

        // TODO: test validations
    }
    
    /**
     * Get Orders for a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCustomerOrdersTest() throws ApiException {
        String customer = null;
        List<DkCloudDataModelSalesSalesOrderModel> response = api.customerGetCustomerOrders(customer);

        // TODO: test validations
    }
    
    /**
     * Get Quotes for a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCustomerQuoteTest() throws ApiException {
        String customer = null;
        List<DkCloudDataModelSalesQuoteHead> response = api.customerGetCustomerQuote(customer);

        // TODO: test validations
    }
    
    /**
     * Get Transactions for a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCustomerTransactionsTest() throws ApiException {
        String customer = null;
        List<DkCloudDataModelProductsTransactionsModel> response = api.customerGetCustomerTransactions(customer);

        // TODO: test validations
    }
    
    /**
     * Get Customers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCustomersTest() throws ApiException {
        Boolean includeObjects = null;
        String include = null;
        List<DkCloudDataModelCustomersCustomerModel> response = api.customerGetCustomers(includeObjects, include);

        // TODO: test validations
    }
    
    /**
     * Get Customers base on Filter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCustomersPagedTest() throws ApiException {
        Integer page = null;
        Integer count = null;
        String group = null;
        String zipcode = null;
        String country = null;
        String salesperson = null;
        String paymentterm = null;
        String paymentmode = null;
        Boolean novat = null;
        Boolean blocked = null;
        String attribute = null;
        String attributecomment = null;
        String attributeoption = null;
        String memo = null;
        Boolean deleted = null;
        OffsetDateTime modifiedBefore = null;
        OffsetDateTime modifiedAfter = null;
        String include = null;
        List<DkCloudDataModelCustomersCustomerModel> response = api.customerGetCustomersPaged(page, count, group, zipcode, country, salesperson, paymentterm, paymentmode, novat, blocked, attribute, attributecomment, attributeoption, memo, deleted, modifiedBefore, modifiedAfter, include);

        // TODO: test validations
    }
    
    /**
     * Get Projects for a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetCutomerProjectsTest() throws ApiException {
        String customer = null;
        List<DkCloudDataModelProjectProjectModel> response = api.customerGetCutomerProjects(customer);

        // TODO: test validations
    }
    
    /**
     * Get Customers by Groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetGroupTest() throws ApiException {
        String id = null;
        Integer page = null;
        Integer count = null;
        List<DkCloudDataModelCustomersCustomerModel> response = api.customerGetGroup(id, page, count);

        // TODO: test validations
    }
    
    /**
     * Search for Customers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGetSearchTest() throws ApiException {
        String value = null;
        Integer max = null;
        List<DkCloudDataModelCustomersCustomerModel> response = api.customerGetSearch(value, max);

        // TODO: test validations
    }
    
    /**
     * Get customer groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerGroupGetTest() throws ApiException {
        List<DkCloudDataModelCustomersCustomerGroupModel> response = api.customerGroupGet();

        // TODO: test validations
    }
    
    /**
     * Delete a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerRemoveCustomerTest() throws ApiException {
        String customer = null;
        api.customerRemoveCustomer(customer);

        // TODO: test validations
    }
    
    /**
     * Lookup customer by phone number  this looks into Phone,PhoneLocal,PhoneMobile on customer,contacts and Recivers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerSearchByPhoneTest() throws ApiException {
        String number = null;
        DkCloudDataModelCustomersCustomerModel response = api.customerSearchByPhone(number);

        // TODO: test validations
    }
    
    /**
     * Get General Ledger Transaction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerTransactionGetCustomerTransactionsTest() throws ApiException {
        Integer page = null;
        Integer count = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime dueAfter = null;
        String dim1 = null;
        String voucher = null;
        String reference = null;
        Integer recordid = null;
        String include = null;
        String customer = null;
        List<DkCloudDataModelCustomersTransactionModel> response = api.customerTransactionGetCustomerTransactions(page, count, modifiedAfter, createdAfter, createdBefore, dueAfter, dim1, voucher, reference, recordid, include, customer);

        // TODO: test validations
    }
    
    /**
     * Update a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerUpdateCustomerTest() throws ApiException {
        String customer = null;
        DkCloudDataModelCustomersCustomerModel obj = null;
        api.customerUpdateCustomer(customer, obj);

        // TODO: test validations
    }
    
}
