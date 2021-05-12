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
import com.ionoscloud.model.S3Key;
import com.ionoscloud.model.S3Keys;
import com.ionoscloud.model.S3ObjectStorageSSO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserS3KeysApi
 */
@Ignore
public class UserS3KeysApiTest {

    private final UserS3KeysApi api = new UserS3KeysApi();

    
    /**
     * Delete an S3 Key
     *
     * Delete an S3 key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void umUsersS3keysDeleteTest() throws ApiException {
        String userId = null;
        String keyId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.umUsersS3keysDelete(userId, keyId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve given S3 Key belonging to the given User
     *
     * You can retrieve S3 key belonging to the given User. This user Id can be found in the response body when a user is created or when you GET a list of users. The key Id can be found in the response body when a S3 key is created or when you GET a list of all S3 keys of a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void umUsersS3keysFindByKeyIdTest() throws ApiException {
        String userId = null;
        String keyId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        S3Key response = api.umUsersS3keysFindByKeyId(userId, keyId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve a User&#39;s S3 keys
     *
     * You can retrieve S3 keys owned by a user by using the users ID. This user Id can be found in the response body when a user is created or when you GET a list of users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void umUsersS3keysGetTest() throws ApiException {
        String userId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        S3Keys response = api.umUsersS3keysGet(userId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Create a S3 Key for the given User
     *
     * Creates a S3 key for the given user. This user Id can be found in the response body when a user is created or when you GET a list of users. Maximum of 5 keys can be generated for a given user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void umUsersS3keysPostTest() throws ApiException {
        String userId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        S3Key response = api.umUsersS3keysPost(userId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Modify a S3 key having the given key id
     *
     * You can enable or disable a given S3 key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void umUsersS3keysPutTest() throws ApiException {
        String userId = null;
        String keyId = null;
        S3Key s3Key = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        S3Key response = api.umUsersS3keysPut(userId, keyId, s3Key, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve S3 object storage single signon URL for the given user
     *
     * You can retrieve S3 object storage single signon URL for the given user. This user Id can be found in the response body when a user is created or when you GET a list of users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void umUsersS3ssourlGetTest() throws ApiException {
        String userId = null;
        Boolean pretty = null;
        Integer xContractNumber = null;
        S3ObjectStorageSSO response = api.umUsersS3ssourlGet(userId, pretty, xContractNumber);

        // TODO: test validations
    }
    
}