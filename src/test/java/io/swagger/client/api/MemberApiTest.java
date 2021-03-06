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
import io.swagger.client.model.DkCloudDataModelMembersCareer;
import io.swagger.client.model.DkCloudDataModelMembersEducation;
import io.swagger.client.model.DkCloudDataModelMembersFee;
import io.swagger.client.model.DkCloudDataModelMembersMember;
import io.swagger.client.model.DkCloudDataModelMembersMemberFund;
import io.swagger.client.model.DkCloudDataModelMembersMemberShipCompany;
import io.swagger.client.model.DkCloudDataModelMembersMemberSubGroup;
import io.swagger.client.model.DkCloudDataModelMembersResume;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MemberApi
 */
@Ignore
public class MemberApiTest {

    private final MemberApi api = new MemberApi();

    
    /**
     * Create a Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberCreateMemberTest() throws ApiException {
        DkCloudDataModelMembersMember obj = null;
        DkCloudDataModelMembersMember response = api.memberCreateMember(obj);

        // TODO: test validations
    }
    
    /**
     * Use this method to create a member fee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberCreateMemberFeeTest() throws ApiException {
        String number = null;
        DkCloudDataModelMembersFee fee = null;
        api.memberCreateMemberFee(number, fee);

        // TODO: test validations
    }
    
    /**
     * Get Memebers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        OffsetDateTime modified = null;
        String course = null;
        Boolean blocked = null;
        List<DkCloudDataModelMembersMember> response = api.memberGet(page, size, modified, course, blocked);

        // TODO: test validations
    }
    
    /**
     * Get Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetByNumberTest() throws ApiException {
        String number = null;
        DkCloudDataModelMembersMember response = api.memberGetByNumber(number);

        // TODO: test validations
    }
    
    /**
     * Get Member Career
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetCareerTest() throws ApiException {
        String number = null;
        List<DkCloudDataModelMembersCareer> response = api.memberGetCareer(number);

        // TODO: test validations
    }
    
    /**
     * Get Member Education
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetEducationTest() throws ApiException {
        String number = null;
        List<DkCloudDataModelMembersEducation> response = api.memberGetEducation(number);

        // TODO: test validations
    }
    
    /**
     * Get Member Funds
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetFundTest() throws ApiException {
        String number = null;
        DkCloudDataModelMembersMemberFund response = api.memberGetFund(number);

        // TODO: test validations
    }
    
    /**
     * Get Membership Company assigned to Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetMembershipDataTest() throws ApiException {
        String number = null;
        List<DkCloudDataModelMembersMemberShipCompany> response = api.memberGetMembershipData(number);

        // TODO: test validations
    }
    
    /**
     * Get Member Resume
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetResumeTest() throws ApiException {
        String number = null;
        List<DkCloudDataModelMembersResume> response = api.memberGetResume(number);

        // TODO: test validations
    }
    
    /**
     * Get Member Sub Groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberGetSubGroupTest() throws ApiException {
        String number = null;
        List<DkCloudDataModelMembersMemberSubGroup> response = api.memberGetSubGroup(number);

        // TODO: test validations
    }
    
    /**
     * Update Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void memberPutTest() throws ApiException {
        String number = null;
        DkCloudDataModelMembersMember obj = null;
        DkCloudDataModelMembersMember response = api.memberPut(number, obj);

        // TODO: test validations
    }
    
}
