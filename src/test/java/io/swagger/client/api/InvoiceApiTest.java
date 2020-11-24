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
import io.swagger.client.model.DkCloudDataModelSalesInvoiceModel;
import io.swagger.client.model.DkPlusAPIModelsInvoiceHead;
import io.swagger.client.model.DkPlusAPIModelsInvoicePaymentPlanCancel;
import io.swagger.client.model.DkPlusAPIModelsInvoicePaymentPlanCreate;
import io.swagger.client.model.DkPlusMailModelMailInfo;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceApi
 */
@Ignore
public class InvoiceApiTest {

    private final InvoiceApi api = new InvoiceApi();

    
    /**
     * Cancel a Payment Plan for Invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceCancelPaymentPlanTest() throws ApiException {
        String invoice = null;
        Integer number = null;
        DkPlusAPIModelsInvoicePaymentPlanCancel content = null;
        api.invoiceCancelPaymentPlan(invoice, number, content);

        // TODO: test validations
    }
    
    /**
     * Create credit invoice based on another invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceCreateCreditInvoiceTest() throws ApiException {
        Integer id = null;
        Boolean post = null;
        OffsetDateTime date = null;
        api.invoiceCreateCreditInvoice(id, post, date);

        // TODO: test validations
    }
    
    /**
     * Create a Sales Invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceCreateInvoiceTest() throws ApiException {
        DkPlusAPIModelsInvoiceHead value = null;
        Boolean post = null;
        DkCloudDataModelSalesInvoiceModel response = api.invoiceCreateInvoice(value, post);

        // TODO: test validations
    }
    
    /**
     * Create a payment plan for a invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceCreatePaymentPlanTest() throws ApiException {
        String number = null;
        DkPlusAPIModelsInvoicePaymentPlanCreate content = null;
        Integer response = api.invoiceCreatePaymentPlan(number, content);

        // TODO: test validations
    }
    
    /**
     * Use to delete invoices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceDeleteInvoiceTest() throws ApiException {
        String reference = null;
        String warehouse = null;
        api.invoiceDeleteInvoice(reference, warehouse);

        // TODO: test validations
    }
    
    /**
     * Get a Sales Invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceGetTest() throws ApiException {
        String number = null;
        DkCloudDataModelSalesInvoiceModel response = api.invoiceGet(number);

        // TODO: test validations
    }
    
    /**
     * Get Invoices by Date
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceGetByDateTest() throws ApiException {
        OffsetDateTime invoicedate = null;
        Integer page = null;
        Integer count = null;
        List<DkCloudDataModelSalesInvoiceModel> response = api.invoiceGetByDate(invoicedate, page, count);

        // TODO: test validations
    }
    
    /**
     * This method returnes prices as if DK calculated based on product,customer and based on discount groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceGetDiscountsTest() throws ApiException {
        DkPlusAPIModelsInvoiceHead value = null;
        DkCloudDataModelSalesInvoiceModel response = api.invoiceGetDiscounts(value);

        // TODO: test validations
    }
    
    /**
     * Get a HTML generated from the Invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceGetHtmlTest() throws ApiException {
        String number = null;
        String custom = null;
        String response = api.invoiceGetHtml(number, custom);

        // TODO: test validations
    }
    
    /**
     * Get PDF version of a invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceGetPDFTest() throws ApiException {
        String number = null;
        String custom = null;
        Object response = api.invoiceGetPDF(number, custom);

        // TODO: test validations
    }
    
    /**
     * Get Sale Invoices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceGetPageTest() throws ApiException {
        Integer page = null;
        Integer count = null;
        Boolean includeLines = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime dueAfter = null;
        String salesPerson = null;
        String reference = null;
        Integer recordid = null;
        String customer = null;
        String project = null;
        String include = null;
        List<DkCloudDataModelSalesInvoiceModel> response = api.invoiceGetPage(page, count, includeLines, createdAfter, createdBefore, dueAfter, salesPerson, reference, recordid, customer, project, include);

        // TODO: test validations
    }
    
    /**
     * Get Invoice by Reference Number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceGetReferenceTest() throws ApiException {
        String reference = null;
        Integer page = null;
        Integer count = null;
        String type = null;
        List<DkCloudDataModelSalesInvoiceModel> response = api.invoiceGetReference(reference, page, count, type);

        // TODO: test validations
    }
    
    /**
     * Refresh invoice in dk+ from DK(Force Method)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceRefreshInvoiceFromDKTest() throws ApiException {
        String number = null;
        api.invoiceRefreshInvoiceFromDK(number);

        // TODO: test validations
    }
    
    /**
     * Send invoice as email.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceSendEmailTest() throws ApiException {
        String number = null;
        DkPlusMailModelMailInfo message = null;
        String custom = null;
        api.invoiceSendEmail(number, message, custom);

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
    public void invoiceSendMassEmailTest() throws ApiException {
        String number = null;
        DkPlusMailModelMailInfo message = null;
        String custom = null;
        Object response = api.invoiceSendMassEmail(number, message, custom);

        // TODO: test validations
    }
    
}
