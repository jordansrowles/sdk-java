/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.api;

import com.ionoscloud.ApiException;
import com.ionoscloud.model.Error;
import com.ionoscloud.model.Request;
import com.ionoscloud.model.RequestStatus;
import com.ionoscloud.model.Requests;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RequestsApi
 */
@Ignore
public class RequestsApiTest {

    private final RequestsApi api = new RequestsApi();

    
    /**
     * Retrieve a Request
     *
     * Retrieves the attributes of a given request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestsFindByIdTest() throws ApiException {
        String requestId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Request response = api.requestsFindById(requestId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Requests
     *
     * Retrieve a list of API requests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestsGetTest() throws ApiException {
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        String filterStatus = null;
        String filterCreatedAfter = null;
        String filterCreatedBefore = null;
        String filterCreatedDate = null;
        String filterCreatedBy = null;
        String filterEtag = null;
        String filterRequestStatus = null;
        String filterMethod = null;
        String filterHeaders = null;
        String filterBody = null;
        String filterUrl = null;
        Integer offset = null;
        Integer limit = null;
        Requests response = api.requestsGet(pretty, depth, xContractNumber, filterStatus, filterCreatedAfter, filterCreatedBefore, filterCreatedDate, filterCreatedBy, filterEtag, filterRequestStatus, filterMethod, filterHeaders, filterBody, filterUrl, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Retrieve Request Status
     *
     * Retrieves the status of a given request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestsStatusGetTest() throws ApiException {
        String requestId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        RequestStatus response = api.requestsStatusGet(requestId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
}