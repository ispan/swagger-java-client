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


import io.swagger.client.model.DkCloudDataModelCustomersContactModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactApi {
    private ApiClient apiClient;

    public ContactApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContactApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for contactCreateContact
     * @param customer Customer Number (required)
     * @param value Contact Model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call contactCreateContactCall(String customer, DkCloudDataModelCustomersContactModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{customer}/Contact"
            .replaceAll("\\{" + "customer" + "\\}", apiClient.escapeString(customer.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call contactCreateContactValidateBeforeCall(String customer, DkCloudDataModelCustomersContactModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new ApiException("Missing the required parameter 'customer' when calling contactCreateContact(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling contactCreateContact(Async)");
        }
        

        com.squareup.okhttp.Call call = contactCreateContactCall(customer, value, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a contact
     * 
     * @param customer Customer Number (required)
     * @param value Contact Model (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void contactCreateContact(String customer, DkCloudDataModelCustomersContactModel value) throws ApiException {
        contactCreateContactWithHttpInfo(customer, value);
    }

    /**
     * Create a contact
     * 
     * @param customer Customer Number (required)
     * @param value Contact Model (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> contactCreateContactWithHttpInfo(String customer, DkCloudDataModelCustomersContactModel value) throws ApiException {
        com.squareup.okhttp.Call call = contactCreateContactValidateBeforeCall(customer, value, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create a contact (asynchronously)
     * 
     * @param customer Customer Number (required)
     * @param value Contact Model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call contactCreateContactAsync(String customer, DkCloudDataModelCustomersContactModel value, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = contactCreateContactValidateBeforeCall(customer, value, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for contactDelete
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call contactDeleteCall(String customer, String contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{customer}/Contact/{contactId}"
            .replaceAll("\\{" + "customer" + "\\}", apiClient.escapeString(customer.toString()))
            .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call contactDeleteValidateBeforeCall(String customer, String contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new ApiException("Missing the required parameter 'customer' when calling contactDelete(Async)");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling contactDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = contactDeleteCall(customer, contactId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Contact
     * 
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void contactDelete(String customer, String contactId) throws ApiException {
        contactDeleteWithHttpInfo(customer, contactId);
    }

    /**
     * Delete Contact
     * 
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> contactDeleteWithHttpInfo(String customer, String contactId) throws ApiException {
        com.squareup.okhttp.Call call = contactDeleteValidateBeforeCall(customer, contactId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Contact (asynchronously)
     * 
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call contactDeleteAsync(String customer, String contactId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = contactDeleteValidateBeforeCall(customer, contactId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for contactGetContact
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call contactGetContactCall(String customer, String contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{customer}/Contact/{contactId}"
            .replaceAll("\\{" + "customer" + "\\}", apiClient.escapeString(customer.toString()))
            .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
    private com.squareup.okhttp.Call contactGetContactValidateBeforeCall(String customer, String contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new ApiException("Missing the required parameter 'customer' when calling contactGetContact(Async)");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling contactGetContact(Async)");
        }
        

        com.squareup.okhttp.Call call = contactGetContactCall(customer, contactId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get contact assigned to a customer
     * 
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @return DkCloudDataModelCustomersContactModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DkCloudDataModelCustomersContactModel contactGetContact(String customer, String contactId) throws ApiException {
        ApiResponse<DkCloudDataModelCustomersContactModel> resp = contactGetContactWithHttpInfo(customer, contactId);
        return resp.getData();
    }

    /**
     * Get contact assigned to a customer
     * 
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @return ApiResponse&lt;DkCloudDataModelCustomersContactModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DkCloudDataModelCustomersContactModel> contactGetContactWithHttpInfo(String customer, String contactId) throws ApiException {
        com.squareup.okhttp.Call call = contactGetContactValidateBeforeCall(customer, contactId, null, null);
        Type localVarReturnType = new TypeToken<DkCloudDataModelCustomersContactModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contact assigned to a customer (asynchronously)
     * 
     * @param customer Customer Number (required)
     * @param contactId Contact Number (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call contactGetContactAsync(String customer, String contactId, final ApiCallback<DkCloudDataModelCustomersContactModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = contactGetContactValidateBeforeCall(customer, contactId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DkCloudDataModelCustomersContactModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for contactGetContacts
     * @param customer Customer Number (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call contactGetContactsCall(String customer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{customer}/Contact"
            .replaceAll("\\{" + "customer" + "\\}", apiClient.escapeString(customer.toString()));

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
    private com.squareup.okhttp.Call contactGetContactsValidateBeforeCall(String customer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new ApiException("Missing the required parameter 'customer' when calling contactGetContacts(Async)");
        }
        

        com.squareup.okhttp.Call call = contactGetContactsCall(customer, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get contacts assigned to a customer
     * 
     * @param customer Customer Number (required)
     * @return List&lt;DkCloudDataModelCustomersContactModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DkCloudDataModelCustomersContactModel> contactGetContacts(String customer) throws ApiException {
        ApiResponse<List<DkCloudDataModelCustomersContactModel>> resp = contactGetContactsWithHttpInfo(customer);
        return resp.getData();
    }

    /**
     * Get contacts assigned to a customer
     * 
     * @param customer Customer Number (required)
     * @return ApiResponse&lt;List&lt;DkCloudDataModelCustomersContactModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DkCloudDataModelCustomersContactModel>> contactGetContactsWithHttpInfo(String customer) throws ApiException {
        com.squareup.okhttp.Call call = contactGetContactsValidateBeforeCall(customer, null, null);
        Type localVarReturnType = new TypeToken<List<DkCloudDataModelCustomersContactModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contacts assigned to a customer (asynchronously)
     * 
     * @param customer Customer Number (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call contactGetContactsAsync(String customer, final ApiCallback<List<DkCloudDataModelCustomersContactModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = contactGetContactsValidateBeforeCall(customer, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DkCloudDataModelCustomersContactModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for contactPut
     * @param customer Customer number (required)
     * @param contactId Cintact Number (required)
     * @param value Contact Model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call contactPutCall(String customer, String contactId, DkCloudDataModelCustomersContactModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{customer}/Contact/{contactId}"
            .replaceAll("\\{" + "customer" + "\\}", apiClient.escapeString(customer.toString()))
            .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call contactPutValidateBeforeCall(String customer, String contactId, DkCloudDataModelCustomersContactModel value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new ApiException("Missing the required parameter 'customer' when calling contactPut(Async)");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling contactPut(Async)");
        }
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling contactPut(Async)");
        }
        

        com.squareup.okhttp.Call call = contactPutCall(customer, contactId, value, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update Contact
     * 
     * @param customer Customer number (required)
     * @param contactId Cintact Number (required)
     * @param value Contact Model (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void contactPut(String customer, String contactId, DkCloudDataModelCustomersContactModel value) throws ApiException {
        contactPutWithHttpInfo(customer, contactId, value);
    }

    /**
     * Update Contact
     * 
     * @param customer Customer number (required)
     * @param contactId Cintact Number (required)
     * @param value Contact Model (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> contactPutWithHttpInfo(String customer, String contactId, DkCloudDataModelCustomersContactModel value) throws ApiException {
        com.squareup.okhttp.Call call = contactPutValidateBeforeCall(customer, contactId, value, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update Contact (asynchronously)
     * 
     * @param customer Customer number (required)
     * @param contactId Cintact Number (required)
     * @param value Contact Model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call contactPutAsync(String customer, String contactId, DkCloudDataModelCustomersContactModel value, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = contactPutValidateBeforeCall(customer, contactId, value, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
