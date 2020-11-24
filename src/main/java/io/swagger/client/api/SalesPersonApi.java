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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.DkCloudDataModelSalesSalesPersonModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesPersonApi {
    private ApiClient apiClient;

    public SalesPersonApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SalesPersonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for salesPersonCreateSalesPerson
     * @param value Sales Person Model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call salesPersonCreateSalesPersonCall(DkCloudDataModelSalesSalesPersonModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;

        // create path and map variables
        String localVarPath = "/api/v1/sales/person";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call salesPersonCreateSalesPersonValidateBeforeCall(DkCloudDataModelSalesSalesPersonModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling salesPersonCreateSalesPerson(Async)");
        }
        

        com.squareup.okhttp.Call call = salesPersonCreateSalesPersonCall(value, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Sales Person
     * 
     * @param value Sales Person Model (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void salesPersonCreateSalesPerson(DkCloudDataModelSalesSalesPersonModel value) throws ApiException {
        salesPersonCreateSalesPersonWithHttpInfo(value);
    }

    /**
     * Create Sales Person
     * 
     * @param value Sales Person Model (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> salesPersonCreateSalesPersonWithHttpInfo(DkCloudDataModelSalesSalesPersonModel value) throws ApiException {
        com.squareup.okhttp.Call call = salesPersonCreateSalesPersonValidateBeforeCall(value, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create Sales Person (asynchronously)
     * 
     * @param value Sales Person Model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call salesPersonCreateSalesPersonAsync(DkCloudDataModelSalesSalesPersonModel value, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = salesPersonCreateSalesPersonValidateBeforeCall(value, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for salesPersonGetSalesPerson
     * @param number  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call salesPersonGetSalesPersonCall(String number, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/sales/person/{number}"
            .replaceAll("\\{" + "number" + "\\}", apiClient.escapeString(number.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call salesPersonGetSalesPersonValidateBeforeCall(String number, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new ApiException("Missing the required parameter 'number' when calling salesPersonGetSalesPerson(Async)");
        }
        

        com.squareup.okhttp.Call call = salesPersonGetSalesPersonCall(number, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Sales Person
     * 
     * @param number  (required)
     * @return DkCloudDataModelSalesSalesPersonModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DkCloudDataModelSalesSalesPersonModel salesPersonGetSalesPerson(String number) throws ApiException {
        ApiResponse<DkCloudDataModelSalesSalesPersonModel> resp = salesPersonGetSalesPersonWithHttpInfo(number);
        return resp.getData();
    }

    /**
     * Get Sales Person
     * 
     * @param number  (required)
     * @return ApiResponse&lt;DkCloudDataModelSalesSalesPersonModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DkCloudDataModelSalesSalesPersonModel> salesPersonGetSalesPersonWithHttpInfo(String number) throws ApiException {
        com.squareup.okhttp.Call call = salesPersonGetSalesPersonValidateBeforeCall(number, null, null);
        Type localVarReturnType = new TypeToken<DkCloudDataModelSalesSalesPersonModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Sales Person (asynchronously)
     * 
     * @param number  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call salesPersonGetSalesPersonAsync(String number, final ApiCallback<DkCloudDataModelSalesSalesPersonModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = salesPersonGetSalesPersonValidateBeforeCall(number, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DkCloudDataModelSalesSalesPersonModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for salesPersonGetSalesPersons
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call salesPersonGetSalesPersonsCall(Integer page, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/sales/person/{page}/{count}"
            .replaceAll("\\{" + "page" + "\\}", apiClient.escapeString(page.toString()))
            .replaceAll("\\{" + "count" + "\\}", apiClient.escapeString(count.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call salesPersonGetSalesPersonsValidateBeforeCall(Integer page, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling salesPersonGetSalesPersons(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling salesPersonGetSalesPersons(Async)");
        }
        

        com.squareup.okhttp.Call call = salesPersonGetSalesPersonsCall(page, count, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Sales Persons Paged
     * 
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @return List&lt;DkCloudDataModelSalesSalesPersonModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DkCloudDataModelSalesSalesPersonModel> salesPersonGetSalesPersons(Integer page, Integer count) throws ApiException {
        ApiResponse<List<DkCloudDataModelSalesSalesPersonModel>> resp = salesPersonGetSalesPersonsWithHttpInfo(page, count);
        return resp.getData();
    }

    /**
     * Get Sales Persons Paged
     * 
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @return ApiResponse&lt;List&lt;DkCloudDataModelSalesSalesPersonModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DkCloudDataModelSalesSalesPersonModel>> salesPersonGetSalesPersonsWithHttpInfo(Integer page, Integer count) throws ApiException {
        com.squareup.okhttp.Call call = salesPersonGetSalesPersonsValidateBeforeCall(page, count, null, null);
        Type localVarReturnType = new TypeToken<List<DkCloudDataModelSalesSalesPersonModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Sales Persons Paged (asynchronously)
     * 
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call salesPersonGetSalesPersonsAsync(Integer page, Integer count, final ApiCallback<List<DkCloudDataModelSalesSalesPersonModel>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = salesPersonGetSalesPersonsValidateBeforeCall(page, count, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DkCloudDataModelSalesSalesPersonModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for salesPersonGetSalesPersonsPage
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call salesPersonGetSalesPersonsPageCall(Integer page, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/sales/person/page/{page}/{count}"
            .replaceAll("\\{" + "page" + "\\}", apiClient.escapeString(page.toString()))
            .replaceAll("\\{" + "count" + "\\}", apiClient.escapeString(count.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call salesPersonGetSalesPersonsPageValidateBeforeCall(Integer page, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling salesPersonGetSalesPersonsPage(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling salesPersonGetSalesPersonsPage(Async)");
        }
        

        com.squareup.okhttp.Call call = salesPersonGetSalesPersonsPageCall(page, count, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Sales Persons Paged
     * 
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @return List&lt;DkCloudDataModelSalesSalesPersonModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public List<DkCloudDataModelSalesSalesPersonModel> salesPersonGetSalesPersonsPage(Integer page, Integer count) throws ApiException {
        ApiResponse<List<DkCloudDataModelSalesSalesPersonModel>> resp = salesPersonGetSalesPersonsPageWithHttpInfo(page, count);
        return resp.getData();
    }

    /**
     * Get Sales Persons Paged
     * 
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @return ApiResponse&lt;List&lt;DkCloudDataModelSalesSalesPersonModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<List<DkCloudDataModelSalesSalesPersonModel>> salesPersonGetSalesPersonsPageWithHttpInfo(Integer page, Integer count) throws ApiException {
        com.squareup.okhttp.Call call = salesPersonGetSalesPersonsPageValidateBeforeCall(page, count, null, null);
        Type localVarReturnType = new TypeToken<List<DkCloudDataModelSalesSalesPersonModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Sales Persons Paged (asynchronously)
     * 
     * @param page Page Number (required)
     * @param count Sales Persons per Page (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call salesPersonGetSalesPersonsPageAsync(Integer page, Integer count, final ApiCallback<List<DkCloudDataModelSalesSalesPersonModel>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = salesPersonGetSalesPersonsPageValidateBeforeCall(page, count, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DkCloudDataModelSalesSalesPersonModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for salesPersonRemoveSalesPerson
     * @param number Sales Person Number (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call salesPersonRemoveSalesPersonCall(String number, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/sales/person/{number}"
            .replaceAll("\\{" + "number" + "\\}", apiClient.escapeString(number.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call salesPersonRemoveSalesPersonValidateBeforeCall(String number, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new ApiException("Missing the required parameter 'number' when calling salesPersonRemoveSalesPerson(Async)");
        }
        

        com.squareup.okhttp.Call call = salesPersonRemoveSalesPersonCall(number, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Sales Person
     * 
     * @param number Sales Person Number (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void salesPersonRemoveSalesPerson(String number) throws ApiException {
        salesPersonRemoveSalesPersonWithHttpInfo(number);
    }

    /**
     * Delete Sales Person
     * 
     * @param number Sales Person Number (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> salesPersonRemoveSalesPersonWithHttpInfo(String number) throws ApiException {
        com.squareup.okhttp.Call call = salesPersonRemoveSalesPersonValidateBeforeCall(number, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Sales Person (asynchronously)
     * 
     * @param number Sales Person Number (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call salesPersonRemoveSalesPersonAsync(String number, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = salesPersonRemoveSalesPersonValidateBeforeCall(number, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for salesPersonUpdateSalesPerson
     * @param number Sales Person Number (required)
     * @param value Sales Person Model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call salesPersonUpdateSalesPersonCall(String number, DkCloudDataModelSalesSalesPersonModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;

        // create path and map variables
        String localVarPath = "/api/v1/sales/person/{number}"
            .replaceAll("\\{" + "number" + "\\}", apiClient.escapeString(number.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call salesPersonUpdateSalesPersonValidateBeforeCall(String number, DkCloudDataModelSalesSalesPersonModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new ApiException("Missing the required parameter 'number' when calling salesPersonUpdateSalesPerson(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling salesPersonUpdateSalesPerson(Async)");
        }
        

        com.squareup.okhttp.Call call = salesPersonUpdateSalesPersonCall(number, value, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update Sales Person
     * 
     * @param number Sales Person Number (required)
     * @param value Sales Person Model (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void salesPersonUpdateSalesPerson(String number, DkCloudDataModelSalesSalesPersonModel value) throws ApiException {
        salesPersonUpdateSalesPersonWithHttpInfo(number, value);
    }

    /**
     * Update Sales Person
     * 
     * @param number Sales Person Number (required)
     * @param value Sales Person Model (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> salesPersonUpdateSalesPersonWithHttpInfo(String number, DkCloudDataModelSalesSalesPersonModel value) throws ApiException {
        com.squareup.okhttp.Call call = salesPersonUpdateSalesPersonValidateBeforeCall(number, value, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update Sales Person (asynchronously)
     * 
     * @param number Sales Person Number (required)
     * @param value Sales Person Model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call salesPersonUpdateSalesPersonAsync(String number, DkCloudDataModelSalesSalesPersonModel value, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = salesPersonUpdateSalesPersonValidateBeforeCall(number, value, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}