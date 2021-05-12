# NetworkLoadBalancersApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersNetworkloadbalancersDelete**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersdelete) | **DELETE** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Remove an Network Load Balancer |
| [**datacentersNetworkloadbalancersFindByNetworkLoadBalancerId**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersfindbynetworkloadbalancerid) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Retrieve an Network Load Balancer |
| [**datacentersNetworkloadbalancersFlowlogsDelete**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsdelete) | **DELETE** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Remove Flow Log from Network Load Balancer |
| [**datacentersNetworkloadbalancersFlowlogsFindByFlowLogId**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsfindbyflowlogid) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Retrieve a Flow Log of the Network Load Balancer |
| [**datacentersNetworkloadbalancersFlowlogsGet**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsget) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs | List Network Load Balancer Flow Logs |
| [**datacentersNetworkloadbalancersFlowlogsPatch**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogspatch) | **PATCH** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Partially modify a Flow Log of the Network Load Balancer |
| [**datacentersNetworkloadbalancersFlowlogsPost**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogspost) | **POST** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs | Add a Network Load Balancer Flow Log |
| [**datacentersNetworkloadbalancersFlowlogsPut**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsput) | **PUT** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Modify a Flow Log of the Network Load Balancer |
| [**datacentersNetworkloadbalancersForwardingrulesDelete**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesdelete) | **DELETE** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Remove Forwarding Rule from Network Load Balancer |
| [**datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesfindbyforwardingruleid) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Retrieve a Forwarding Rule of the Network Load Balancer |
| [**datacentersNetworkloadbalancersForwardingrulesGet**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesget) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules | List Network Load Balancer Forwarding Rules |
| [**datacentersNetworkloadbalancersForwardingrulesPatch**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulespatch) | **PATCH** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Partially modify a forwarding rule of the Network Load Balancer |
| [**datacentersNetworkloadbalancersForwardingrulesPost**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulespost) | **POST** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules | Add a Network Load Balancer Forwarding Rule |
| [**datacentersNetworkloadbalancersForwardingrulesPut**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesput) | **PUT** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Modify a forwarding rule of the Network Load Balancer |
| [**datacentersNetworkloadbalancersGet**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersget) | **GET** /datacenters/{datacenterId}/networkloadbalancers | List Network Load Balancers |
| [**datacentersNetworkloadbalancersPatch**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancerspatch) | **PATCH** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Partially update an Network Load Balancer |
| [**datacentersNetworkloadbalancersPost**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancerspost) | **POST** /datacenters/{datacenterId}/networkloadbalancers | Create an Network Load Balancer |
| [**datacentersNetworkloadbalancersPut**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersput) | **PUT** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Update an Network Load Balancer |


<a name="datacentersNetworkloadbalancersDelete"></a>
# **datacentersNetworkloadbalancersDelete**
> Object datacentersNetworkloadbalancersDelete(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

Remove an Network Load Balancer

Removes the specified Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersNetworkloadbalancersDelete(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersFindByNetworkLoadBalancerId"></a>
# **datacentersNetworkloadbalancersFindByNetworkLoadBalancerId**
> NetworkLoadBalancer datacentersNetworkloadbalancersFindByNetworkLoadBalancerId(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

Retrieve an Network Load Balancer

Retrieves the attributes of a given Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersFindByNetworkLoadBalancerId(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFindByNetworkLoadBalancerId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancer**](NetworkLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersFlowlogsDelete"></a>
# **datacentersNetworkloadbalancersFlowlogsDelete**
> Object datacentersNetworkloadbalancersFlowlogsDelete(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Remove Flow Log from Network Load Balancer

This will remove a flow log from the network load balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String flowLogId = "flowLogId_example"; // String | The unique ID of the flow log
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersNetworkloadbalancersFlowlogsDelete(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **flowLogId** | **String**| The unique ID of the flow log |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersFlowlogsFindByFlowLogId"></a>
# **datacentersNetworkloadbalancersFlowlogsFindByFlowLogId**
> FlowLog datacentersNetworkloadbalancersFlowlogsFindByFlowLogId(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Retrieve a Flow Log of the Network Load Balancer

This will return a Flow Log of the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsFindByFlowLogId(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsFindByFlowLogId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **flowLogId** | **String**| The unique ID of the Flow Log |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersFlowlogsGet"></a>
# **datacentersNetworkloadbalancersFlowlogsGet**
> FlowLogs datacentersNetworkloadbalancersFlowlogsGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

List Network Load Balancer Flow Logs

You can retrieve a list of Flow Logs of the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FlowLogs result = apiInstance.datacentersNetworkloadbalancersFlowlogsGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FlowLogs**](FlowLogs.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersFlowlogsPatch"></a>
# **datacentersNetworkloadbalancersFlowlogsPatch**
> FlowLog datacentersNetworkloadbalancersFlowlogsPatch(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLogProperties, pretty, depth, xContractNumber)

Partially modify a Flow Log of the Network Load Balancer

You can use to partially update a Flow Log of a Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log
    FlowLogProperties networkLoadBalancerFlowLogProperties = new FlowLogProperties(); // FlowLogProperties | Properties of a Flow Log to be updated
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPatch(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLogProperties, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **flowLogId** | **String**| The unique ID of the Flow Log |
| **networkLoadBalancerFlowLogProperties** |  [**FlowLogProperties**](FlowLogProperties.md)| Properties of a Flow Log to be updated |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersFlowlogsPost"></a>
# **datacentersNetworkloadbalancersFlowlogsPost**
> FlowLog datacentersNetworkloadbalancersFlowlogsPost(datacenterId, networkLoadBalancerId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber)

Add a Network Load Balancer Flow Log

This will add a new Flow Log to the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    FlowLog networkLoadBalancerFlowLog = new FlowLog(); // FlowLog | Flow Log to add
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPost(datacenterId, networkLoadBalancerId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **networkLoadBalancerFlowLog** |  [**FlowLog**](FlowLog.md)| Flow Log to add |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersFlowlogsPut"></a>
# **datacentersNetworkloadbalancersFlowlogsPut**
> FlowLog datacentersNetworkloadbalancersFlowlogsPut(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber)

Modify a Flow Log of the Network Load Balancer

You can use to update a Flow Log of the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log
    FlowLogPut networkLoadBalancerFlowLog = new FlowLogPut(); // FlowLogPut | Modified Network Load Balancer Flow Log
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPut(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **flowLogId** | **String**| The unique ID of the Flow Log |
| **networkLoadBalancerFlowLog** |  [**FlowLogPut**](FlowLogPut.md)| Modified Network Load Balancer Flow Log |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersForwardingrulesDelete"></a>
# **datacentersNetworkloadbalancersForwardingrulesDelete**
> Object datacentersNetworkloadbalancersForwardingrulesDelete(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Remove Forwarding Rule from Network Load Balancer

This will remove a forwarding rule from the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersNetworkloadbalancersForwardingrulesDelete(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId"></a>
# **datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Retrieve a Forwarding Rule of the Network Load Balancer

This will a forwarding rule of the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancerForwardingRule**](NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersForwardingrulesGet"></a>
# **datacentersNetworkloadbalancersForwardingrulesGet**
> NetworkLoadBalancerForwardingRules datacentersNetworkloadbalancersForwardingrulesGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

List Network Load Balancer Forwarding Rules

You can retrieve a list of forwarding rules of the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancerForwardingRules result = apiInstance.datacentersNetworkloadbalancersForwardingrulesGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancerForwardingRules**](NetworkLoadBalancerForwardingRules.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersForwardingrulesPatch"></a>
# **datacentersNetworkloadbalancersForwardingrulesPatch**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesPatch(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber)

Partially modify a forwarding rule of the Network Load Balancer

You can use to partially update a forwarding rule of a Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule
    NetworkLoadBalancerForwardingRuleProperties networkLoadBalancerForwardingRuleProperties = new NetworkLoadBalancerForwardingRuleProperties(); // NetworkLoadBalancerForwardingRuleProperties | Properties of a forwarding rule to be updated
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPatch(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule |
| **networkLoadBalancerForwardingRuleProperties** |  [**NetworkLoadBalancerForwardingRuleProperties**](NetworkLoadBalancerForwardingRuleProperties.md)| Properties of a forwarding rule to be updated |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancerForwardingRule**](NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersForwardingrulesPost"></a>
# **datacentersNetworkloadbalancersForwardingrulesPost**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesPost(datacenterId, networkLoadBalancerId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Add a Network Load Balancer Forwarding Rule

This will add a new forwarding rule to the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    NetworkLoadBalancerForwardingRule networkLoadBalancerForwardingRule = new NetworkLoadBalancerForwardingRule(); // NetworkLoadBalancerForwardingRule | forwarding rule to add
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPost(datacenterId, networkLoadBalancerId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **networkLoadBalancerForwardingRule** |  [**NetworkLoadBalancerForwardingRule**](NetworkLoadBalancerForwardingRule.md)| forwarding rule to add |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancerForwardingRule**](NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersForwardingrulesPut"></a>
# **datacentersNetworkloadbalancersForwardingrulesPut**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesPut(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Modify a forwarding rule of the Network Load Balancer

You can use to update a forwarding rule of the Network Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule
    NetworkLoadBalancerForwardingRulePut networkLoadBalancerForwardingRule = new NetworkLoadBalancerForwardingRulePut(); // NetworkLoadBalancerForwardingRulePut | Modified Network Load Balancer Forwarding Rule
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPut(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule |
| **networkLoadBalancerForwardingRule** |  [**NetworkLoadBalancerForwardingRulePut**](NetworkLoadBalancerForwardingRulePut.md)| Modified Network Load Balancer Forwarding Rule |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancerForwardingRule**](NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersGet"></a>
# **datacentersNetworkloadbalancersGet**
> NetworkLoadBalancers datacentersNetworkloadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit)

List Network Load Balancers

Retrieve a list of Network Load Balancers within the datacenter.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with limit for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with offset for pagination)
    try {
      NetworkLoadBalancers result = apiInstance.datacentersNetworkloadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with limit for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with offset for pagination) | [optional] [default to 1000]

### Return type

[**NetworkLoadBalancers**](NetworkLoadBalancers.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersPatch"></a>
# **datacentersNetworkloadbalancersPatch**
> NetworkLoadBalancer datacentersNetworkloadbalancersPatch(datacenterId, networkLoadBalancerId, networkLoadBalancerProperties, pretty, depth, xContractNumber)

Partially update an Network Load Balancer

Partially update the attributes of a given Network Load Balancer

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    NetworkLoadBalancerProperties networkLoadBalancerProperties = new NetworkLoadBalancerProperties(); // NetworkLoadBalancerProperties | Network Load Balancer properties to be updated
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPatch(datacenterId, networkLoadBalancerId, networkLoadBalancerProperties, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **networkLoadBalancerProperties** |  [**NetworkLoadBalancerProperties**](NetworkLoadBalancerProperties.md)| Network Load Balancer properties to be updated |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancer**](NetworkLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersPost"></a>
# **datacentersNetworkloadbalancersPost**
> NetworkLoadBalancer datacentersNetworkloadbalancersPost(datacenterId, networkLoadBalancer, pretty, depth, xContractNumber)

Create an Network Load Balancer

Creates an Network Load Balancer within the datacenter.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    NetworkLoadBalancer networkLoadBalancer = new NetworkLoadBalancer(); // NetworkLoadBalancer | Network Load Balancer to be created
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPost(datacenterId, networkLoadBalancer, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancer** |  [**NetworkLoadBalancer**](NetworkLoadBalancer.md)| Network Load Balancer to be created |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**NetworkLoadBalancer**](NetworkLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersNetworkloadbalancersPut"></a>
# **datacentersNetworkloadbalancersPut**
> NetworkLoadBalancer datacentersNetworkloadbalancersPut(datacenterId, networkLoadBalancerId, networkLoadBalancer, pretty, depth, xContractNumber, offset, limit)

Update an Network Load Balancer

Update the attributes of a given Network Load Balancer

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer
    NetworkLoadBalancerPut networkLoadBalancer = new NetworkLoadBalancerPut(); // NetworkLoadBalancerPut | Modified Network Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with limit for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with offset for pagination)
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPut(datacenterId, networkLoadBalancerId, networkLoadBalancer, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer |
| **networkLoadBalancer** |  [**NetworkLoadBalancerPut**](NetworkLoadBalancerPut.md)| Modified Network Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with limit for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with offset for pagination) | [optional] [default to 1000]

### Return type

[**NetworkLoadBalancer**](NetworkLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
