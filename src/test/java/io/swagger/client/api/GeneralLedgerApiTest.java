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
import io.swagger.client.model.DkCloudDataModelGeneralLedgerAccount;
import io.swagger.client.model.DkCloudDataModelGeneralLedgerTransaction;
import io.swagger.client.model.DkPlusAPIModelsGeneralLedgerHead;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralLedgerApi
 */
@Ignore
public class GeneralLedgerApiTest {

    private final GeneralLedgerApi api = new GeneralLedgerApi();

    
    /**
     * Get General Ledger Accounts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generalLedgerAccountGetTest() throws ApiException {
        List<DkCloudDataModelGeneralLedgerAccount> response = api.generalLedgerAccountGet();

        // TODO: test validations
    }
    
    /**
     * Get General Ledger Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generalLedgerAccountGetAccountTest() throws ApiException {
        String number = null;
        DkCloudDataModelGeneralLedgerAccount response = api.generalLedgerAccountGetAccount(number);

        // TODO: test validations
    }
    
    /**
     * Get transactions for a General Ledger Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generalLedgerAccountGetTransactionsTest() throws ApiException {
        String id = null;
        Integer page = null;
        Integer count = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime dueAfter = null;
        String dim1 = null;
        String voucher = null;
        String reference = null;
        List<DkCloudDataModelGeneralLedgerTransaction> response = api.generalLedgerAccountGetTransactions(id, page, count, createdAfter, createdBefore, dueAfter, dim1, voucher, reference);

        // TODO: test validations
    }
    
    /**
     * Create a General Ledger Journal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generalLedgerJournalGetGeneralLedgerJournalTest() throws ApiException {
        DkPlusAPIModelsGeneralLedgerHead value = null;
        api.generalLedgerJournalGetGeneralLedgerJournal(value);

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
    public void generalLedgerTransactionGetGeneralTransactionPageTest() throws ApiException {
        Integer page = null;
        Integer count = null;
        String account = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        OffsetDateTime dueAfter = null;
        String dim1 = null;
        String voucher = null;
        String reference = null;
        Integer recordid = null;
        String include = null;
        String sort = null;
        String sorttype = null;
        List<DkCloudDataModelGeneralLedgerTransaction> response = api.generalLedgerTransactionGetGeneralTransactionPage(page, count, account, createdAfter, createdBefore, modifiedAfter, modifiedBefore, dueAfter, dim1, voucher, reference, recordid, include, sort, sorttype);

        // TODO: test validations
    }
    
}
