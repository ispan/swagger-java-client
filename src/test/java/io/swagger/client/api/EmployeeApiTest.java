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
import io.swagger.client.model.DkCloudDataModelEmployeeEmployeeModel;
import io.swagger.client.model.DkCloudDataModelProjectProjectModel;
import io.swagger.client.model.DkCloudDataModelTimeClockEntryModel;
import io.swagger.client.model.DkPlusAPIModelsEmployeeEmployeeWork;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeeApi
 */
@Ignore
public class EmployeeApiTest {

    private final EmployeeApi api = new EmployeeApi();

    
    /**
     * Create an employee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeCreateEmployeeTest() throws ApiException {
        DkCloudDataModelEmployeeEmployeeModel employee = null;
        DkCloudDataModelEmployeeEmployeeModel response = api.employeeCreateEmployee(employee);

        // TODO: test validations
    }
    
    /**
     * Use this method to get an employee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeGetEmployeeTest() throws ApiException {
        String number = null;
        DkCloudDataModelEmployeeEmployeeModel response = api.employeeGetEmployee(number);

        // TODO: test validations
    }
    
    /**
     * Time clock entries for an employee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeGetEmployeeTimeClockTest() throws ApiException {
        String number = null;
        Integer page = null;
        Integer count = null;
        List<DkCloudDataModelTimeClockEntryModel> response = api.employeeGetEmployeeTimeClock(number, page, count);

        // TODO: test validations
    }
    
    /**
     * Using this method you can get all employee´s from the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeGetEmployeesTest() throws ApiException {
        List<DkCloudDataModelEmployeeEmployeeModel> response = api.employeeGetEmployees();

        // TODO: test validations
    }
    
    /**
     * Get projects where employee is assigned as a supervior
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeGetProjectSupervisorTest() throws ApiException {
        String number = null;
        List<DkCloudDataModelProjectProjectModel> response = api.employeeGetProjectSupervisor(number);

        // TODO: test validations
    }
    
    /**
     * Get projects where employee is assigned as a worker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeGetProjectWorkerTest() throws ApiException {
        String number = null;
        List<DkCloudDataModelProjectProjectModel> response = api.employeeGetProjectWorker(number);

        // TODO: test validations
    }
    
    /**
     * Update an employee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeUpdateTest() throws ApiException {
        String number = null;
        DkCloudDataModelEmployeeEmployeeModel employee = null;
        DkCloudDataModelEmployeeEmployeeModel response = api.employeeUpdate(number, employee);

        // TODO: test validations
    }
    
    /**
     * Add Employee Work Journal Entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeeWorkCreateEmployeeWorkTest() throws ApiException {
        String employee = null;
        List<DkPlusAPIModelsEmployeeEmployeeWork> lines = null;
        Boolean post = null;
        api.employeeWorkCreateEmployeeWork(employee, lines, post);

        // TODO: test validations
    }
    
}
