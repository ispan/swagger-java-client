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
import io.swagger.client.model.DkCloudDataModelInviteInviteModel;
import io.swagger.client.model.DkPlusAPIModelsMyPageInvite;
import io.swagger.client.model.DkPlusAPIModelsMyPageInviteCreate;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MyPagesApi
 */
@Ignore
public class MyPagesApiTest {

    private final MyPagesApi api = new MyPagesApi();

    
    /**
     * Create Invite
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myPagesCreateInviteTest() throws ApiException {
        DkPlusAPIModelsMyPageInviteCreate obj = null;
        DkCloudDataModelInviteInviteModel response = api.myPagesCreateInvite(obj);

        // TODO: test validations
    }
    
    /**
     * Get Invites
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myPagesGetInvitesForCustomerTest() throws ApiException {
        String customer = null;
        DkPlusAPIModelsMyPageInvite response = api.myPagesGetInvitesForCustomer(customer);

        // TODO: test validations
    }
    
    /**
     * Remove Invite
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myPagesRemoveInviteTest() throws ApiException {
        UUID id = null;
        Boolean permanent = null;
        api.myPagesRemoveInvite(id, permanent);

        // TODO: test validations
    }
    
}
