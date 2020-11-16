# openapi-java-client

CLOUD API
- API version: 5.0
  - Build date: 2020-11-16T16:56:05.401268+02:00[Europe/Bucharest]

An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API. 

The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>5.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:5.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-5.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupUnitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth Basic Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    Basic Authentication.setUsername("YOUR USERNAME");
    Basic Authentication.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token Authentication
    ApiKeyAuth Token Authentication = (ApiKeyAuth) defaultClient.getAuthentication("Token Authentication");
    Token Authentication.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token Authentication.setApiKeyPrefix("Token");

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    String backupunitId = "backupunitId_example"; // String | The unique ID of the backup Unit
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.backupunitsDelete(backupunitId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.ionos.com/cloudapi/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BackupUnitApi* | [**backupunitsDelete**](docs/BackupUnitApi.md#backupunitsDelete) | **DELETE** /backupunits/{backupunitId} | Delete a Backup Unit
*BackupUnitApi* | [**backupunitsFindById**](docs/BackupUnitApi.md#backupunitsFindById) | **GET** /backupunits/{backupunitId} | Returns the specified backup Unit
*BackupUnitApi* | [**backupunitsGet**](docs/BackupUnitApi.md#backupunitsGet) | **GET** /backupunits | List Backup Units 
*BackupUnitApi* | [**backupunitsPatch**](docs/BackupUnitApi.md#backupunitsPatch) | **PATCH** /backupunits/{backupunitId} | Partially modify a Backup Unit
*BackupUnitApi* | [**backupunitsPost**](docs/BackupUnitApi.md#backupunitsPost) | **POST** /backupunits | Create a Backup Unit
*BackupUnitApi* | [**backupunitsPut**](docs/BackupUnitApi.md#backupunitsPut) | **PUT** /backupunits/{backupunitId} | Modify a Backup Unit
*BackupUnitApi* | [**backupunitsSsourlGet**](docs/BackupUnitApi.md#backupunitsSsourlGet) | **GET** /backupunits/{backupunitId}/ssourl | Returns a single signon URL for the specified backup Unit.
*ContractApi* | [**contractsGet**](docs/ContractApi.md#contractsGet) | **GET** /contracts | Retrieve a Contract
*DataCenterApi* | [**datacentersDelete**](docs/DataCenterApi.md#datacentersDelete) | **DELETE** /datacenters/{datacenterId} | Delete a Data Center
*DataCenterApi* | [**datacentersFindById**](docs/DataCenterApi.md#datacentersFindById) | **GET** /datacenters/{datacenterId} | Retrieve a Data Center
*DataCenterApi* | [**datacentersGet**](docs/DataCenterApi.md#datacentersGet) | **GET** /datacenters | List Data Centers under your account
*DataCenterApi* | [**datacentersPatch**](docs/DataCenterApi.md#datacentersPatch) | **PATCH** /datacenters/{datacenterId} | Partially modify a Data Center
*DataCenterApi* | [**datacentersPost**](docs/DataCenterApi.md#datacentersPost) | **POST** /datacenters | Create a Data Center
*DataCenterApi* | [**datacentersPut**](docs/DataCenterApi.md#datacentersPut) | **PUT** /datacenters/{datacenterId} | Modify a Data Center
*ImageApi* | [**imagesDelete**](docs/ImageApi.md#imagesDelete) | **DELETE** /images/{imageId} | Delete an Image
*ImageApi* | [**imagesFindById**](docs/ImageApi.md#imagesFindById) | **GET** /images/{imageId} | Retrieve an Image
*ImageApi* | [**imagesGet**](docs/ImageApi.md#imagesGet) | **GET** /images | List Images 
*ImageApi* | [**imagesPatch**](docs/ImageApi.md#imagesPatch) | **PATCH** /images/{imageId} | Partially modify an Image
*ImageApi* | [**imagesPut**](docs/ImageApi.md#imagesPut) | **PUT** /images/{imageId} | Modify an Image
*IpBlocksApi* | [**ipblocksDelete**](docs/IpBlocksApi.md#ipblocksDelete) | **DELETE** /ipblocks/{ipblockId} | Delete IP Block
*IpBlocksApi* | [**ipblocksFindById**](docs/IpBlocksApi.md#ipblocksFindById) | **GET** /ipblocks/{ipblockId} | Retrieve an IP Block
*IpBlocksApi* | [**ipblocksGet**](docs/IpBlocksApi.md#ipblocksGet) | **GET** /ipblocks | List IP Blocks 
*IpBlocksApi* | [**ipblocksPatch**](docs/IpBlocksApi.md#ipblocksPatch) | **PATCH** /ipblocks/{ipblockId} | Partially modify IP Block
*IpBlocksApi* | [**ipblocksPost**](docs/IpBlocksApi.md#ipblocksPost) | **POST** /ipblocks | Reserve IP Block
*IpBlocksApi* | [**ipblocksPut**](docs/IpBlocksApi.md#ipblocksPut) | **PUT** /ipblocks/{ipblockId} | Modify IP Block
*KubernetesApi* | [**k8sDelete**](docs/KubernetesApi.md#k8sDelete) | **DELETE** /k8s/{k8sClusterId} | Delete Kubernetes Cluster
*KubernetesApi* | [**k8sFindByClusterid**](docs/KubernetesApi.md#k8sFindByClusterid) | **GET** /k8s/{k8sClusterId} | Retrieve Kubernetes Cluster
*KubernetesApi* | [**k8sGet**](docs/KubernetesApi.md#k8sGet) | **GET** /k8s | List Kubernetes Clusters
*KubernetesApi* | [**k8sKubeconfigGet**](docs/KubernetesApi.md#k8sKubeconfigGet) | **GET** /k8s/{k8sClusterId}/kubeconfig | Retrieve Kubernetes Configuration File
*KubernetesApi* | [**k8sNodepoolsDelete**](docs/KubernetesApi.md#k8sNodepoolsDelete) | **DELETE** /k8s/{k8sClusterId}/nodepools/{nodepoolId} | Delete Kubernetes Node Pool
*KubernetesApi* | [**k8sNodepoolsFindById**](docs/KubernetesApi.md#k8sNodepoolsFindById) | **GET** /k8s/{k8sClusterId}/nodepools/{nodepoolId} | Retrieve Kubernetes Node Pool
*KubernetesApi* | [**k8sNodepoolsGet**](docs/KubernetesApi.md#k8sNodepoolsGet) | **GET** /k8s/{k8sClusterId}/nodepools | List Kubernetes Node Pools
*KubernetesApi* | [**k8sNodepoolsNodesDelete**](docs/KubernetesApi.md#k8sNodepoolsNodesDelete) | **DELETE** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes/{nodeId} | Delete Kubernetes node
*KubernetesApi* | [**k8sNodepoolsNodesFindById**](docs/KubernetesApi.md#k8sNodepoolsNodesFindById) | **GET** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes/{nodeId} | Retrieve Kubernetes node
*KubernetesApi* | [**k8sNodepoolsNodesGet**](docs/KubernetesApi.md#k8sNodepoolsNodesGet) | **GET** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes | Retrieve Kubernetes nodes.
*KubernetesApi* | [**k8sNodepoolsNodesReplacePost**](docs/KubernetesApi.md#k8sNodepoolsNodesReplacePost) | **POST** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes/{nodeId}/replace | Recreate the Kubernetes node
*KubernetesApi* | [**k8sNodepoolsPost**](docs/KubernetesApi.md#k8sNodepoolsPost) | **POST** /k8s/{k8sClusterId}/nodepools | Create a Kubernetes Node Pool
*KubernetesApi* | [**k8sNodepoolsPut**](docs/KubernetesApi.md#k8sNodepoolsPut) | **PUT** /k8s/{k8sClusterId}/nodepools/{nodepoolId} | Modify Kubernetes Node Pool
*KubernetesApi* | [**k8sPost**](docs/KubernetesApi.md#k8sPost) | **POST** /k8s | Create Kubernetes Cluster
*KubernetesApi* | [**k8sPut**](docs/KubernetesApi.md#k8sPut) | **PUT** /k8s/{k8sClusterId} | Modify Kubernetes Cluster
*KubernetesApi* | [**k8sVersionsCompatibilitiesGet**](docs/KubernetesApi.md#k8sVersionsCompatibilitiesGet) | **GET** /k8s/versions/{clusterVersion}/compatibilities | Retrieves a list of available kubernetes versions for nodepools depending on the given kubernetes version running in the cluster.
*KubernetesApi* | [**k8sVersionsDefaultGet**](docs/KubernetesApi.md#k8sVersionsDefaultGet) | **GET** /k8s/versions/default | Retrieve the current default kubernetes version for clusters and nodepools.
*KubernetesApi* | [**k8sVersionsGet**](docs/KubernetesApi.md#k8sVersionsGet) | **GET** /k8s/versions | Retrieve available Kubernetes versions
*LabelApi* | [**datacentersLabelsDelete**](docs/LabelApi.md#datacentersLabelsDelete) | **DELETE** /datacenters/{datacenterId}/labels/{key} | Delete a Label from Data Center
*LabelApi* | [**datacentersLabelsFindByKey**](docs/LabelApi.md#datacentersLabelsFindByKey) | **GET** /datacenters/{datacenterId}/labels/{key} | Retrieve a Label of Data Center
*LabelApi* | [**datacentersLabelsGet**](docs/LabelApi.md#datacentersLabelsGet) | **GET** /datacenters/{datacenterId}/labels | List all Data Center Labels
*LabelApi* | [**datacentersLabelsPost**](docs/LabelApi.md#datacentersLabelsPost) | **POST** /datacenters/{datacenterId}/labels | Add a Label to Data Center
*LabelApi* | [**datacentersLabelsPut**](docs/LabelApi.md#datacentersLabelsPut) | **PUT** /datacenters/{datacenterId}/labels/{key} | Modify a Label of Data Center
*LabelApi* | [**datacentersServersLabelsDelete**](docs/LabelApi.md#datacentersServersLabelsDelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/labels/{key} | Delete a Label from Server
*LabelApi* | [**datacentersServersLabelsFindByKey**](docs/LabelApi.md#datacentersServersLabelsFindByKey) | **GET** /datacenters/{datacenterId}/servers/{serverId}/labels/{key} | Retrieve a Label of Server
*LabelApi* | [**datacentersServersLabelsGet**](docs/LabelApi.md#datacentersServersLabelsGet) | **GET** /datacenters/{datacenterId}/servers/{serverId}/labels | List all Server Labels
*LabelApi* | [**datacentersServersLabelsPost**](docs/LabelApi.md#datacentersServersLabelsPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/labels | Add a Label to Server
*LabelApi* | [**datacentersServersLabelsPut**](docs/LabelApi.md#datacentersServersLabelsPut) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/labels/{key} | Modify a Label of Server
*LabelApi* | [**datacentersVolumesLabelsDelete**](docs/LabelApi.md#datacentersVolumesLabelsDelete) | **DELETE** /datacenters/{datacenterId}/volumes/{volumeId}/labels/{key} | Delete a Label from Volume
*LabelApi* | [**datacentersVolumesLabelsFindByKey**](docs/LabelApi.md#datacentersVolumesLabelsFindByKey) | **GET** /datacenters/{datacenterId}/volumes/{volumeId}/labels/{key} | Retrieve a Label of Volume
*LabelApi* | [**datacentersVolumesLabelsGet**](docs/LabelApi.md#datacentersVolumesLabelsGet) | **GET** /datacenters/{datacenterId}/volumes/{volumeId}/labels | List all Volume Labels
*LabelApi* | [**datacentersVolumesLabelsPost**](docs/LabelApi.md#datacentersVolumesLabelsPost) | **POST** /datacenters/{datacenterId}/volumes/{volumeId}/labels | Add a Label to Volume
*LabelApi* | [**datacentersVolumesLabelsPut**](docs/LabelApi.md#datacentersVolumesLabelsPut) | **PUT** /datacenters/{datacenterId}/volumes/{volumeId}/labels/{key} | Modify a Label of Volume
*LabelApi* | [**ipblocksLabelsDelete**](docs/LabelApi.md#ipblocksLabelsDelete) | **DELETE** /ipblocks/{ipblockId}/labels/{key} | Delete a Label from IP Block
*LabelApi* | [**ipblocksLabelsFindByKey**](docs/LabelApi.md#ipblocksLabelsFindByKey) | **GET** /ipblocks/{ipblockId}/labels/{key} | Retrieve a Label of IP Block
*LabelApi* | [**ipblocksLabelsGet**](docs/LabelApi.md#ipblocksLabelsGet) | **GET** /ipblocks/{ipblockId}/labels | List all Ip Block Labels
*LabelApi* | [**ipblocksLabelsPost**](docs/LabelApi.md#ipblocksLabelsPost) | **POST** /ipblocks/{ipblockId}/labels | Add a Label to IP Block
*LabelApi* | [**ipblocksLabelsPut**](docs/LabelApi.md#ipblocksLabelsPut) | **PUT** /ipblocks/{ipblockId}/labels/{key} | Modify a Label of IP Block
*LabelApi* | [**labelsFindByLabelurn**](docs/LabelApi.md#labelsFindByLabelurn) | **GET** /labels/{labelurn} | Returns the label by its URN.
*LabelApi* | [**labelsGet**](docs/LabelApi.md#labelsGet) | **GET** /labels | List Labels 
*LabelApi* | [**snapshotsLabelsDelete**](docs/LabelApi.md#snapshotsLabelsDelete) | **DELETE** /snapshots/{snapshotId}/labels/{key} | Delete a Label from Snapshot
*LabelApi* | [**snapshotsLabelsFindByKey**](docs/LabelApi.md#snapshotsLabelsFindByKey) | **GET** /snapshots/{snapshotId}/labels/{key} | Retrieve a Label of Snapshot
*LabelApi* | [**snapshotsLabelsGet**](docs/LabelApi.md#snapshotsLabelsGet) | **GET** /snapshots/{snapshotId}/labels | List all Snapshot Labels
*LabelApi* | [**snapshotsLabelsPost**](docs/LabelApi.md#snapshotsLabelsPost) | **POST** /snapshots/{snapshotId}/labels | Add a Label to Snapshot
*LabelApi* | [**snapshotsLabelsPut**](docs/LabelApi.md#snapshotsLabelsPut) | **PUT** /snapshots/{snapshotId}/labels/{key} | Modify a Label of Snapshot
*LanApi* | [**datacentersLansDelete**](docs/LanApi.md#datacentersLansDelete) | **DELETE** /datacenters/{datacenterId}/lans/{lanId} | Delete a Lan.
*LanApi* | [**datacentersLansFindById**](docs/LanApi.md#datacentersLansFindById) | **GET** /datacenters/{datacenterId}/lans/{lanId} | Retrieve a Lan
*LanApi* | [**datacentersLansGet**](docs/LanApi.md#datacentersLansGet) | **GET** /datacenters/{datacenterId}/lans | List Lans
*LanApi* | [**datacentersLansNicsFindById**](docs/LanApi.md#datacentersLansNicsFindById) | **GET** /datacenters/{datacenterId}/lans/{lanId}/nics/{nicId} | Retrieve a nic attached to lan
*LanApi* | [**datacentersLansNicsGet**](docs/LanApi.md#datacentersLansNicsGet) | **GET** /datacenters/{datacenterId}/lans/{lanId}/nics | List Lan Members 
*LanApi* | [**datacentersLansNicsPost**](docs/LanApi.md#datacentersLansNicsPost) | **POST** /datacenters/{datacenterId}/lans/{lanId}/nics | Attach a nic
*LanApi* | [**datacentersLansPatch**](docs/LanApi.md#datacentersLansPatch) | **PATCH** /datacenters/{datacenterId}/lans/{lanId} | Partially modify a Lan
*LanApi* | [**datacentersLansPost**](docs/LanApi.md#datacentersLansPost) | **POST** /datacenters/{datacenterId}/lans | Create a Lan
*LanApi* | [**datacentersLansPut**](docs/LanApi.md#datacentersLansPut) | **PUT** /datacenters/{datacenterId}/lans/{lanId} | Modify a Lan
*LoadBalancerApi* | [**datacentersLoadbalancersBalancednicsDelete**](docs/LoadBalancerApi.md#datacentersLoadbalancersBalancednicsDelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Detach a nic from loadbalancer
*LoadBalancerApi* | [**datacentersLoadbalancersBalancednicsFindByNic**](docs/LoadBalancerApi.md#datacentersLoadbalancersBalancednicsFindByNic) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Retrieve a nic attached to Load Balancer
*LoadBalancerApi* | [**datacentersLoadbalancersBalancednicsGet**](docs/LoadBalancerApi.md#datacentersLoadbalancersBalancednicsGet) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | List Load Balancer Members 
*LoadBalancerApi* | [**datacentersLoadbalancersBalancednicsPost**](docs/LoadBalancerApi.md#datacentersLoadbalancersBalancednicsPost) | **POST** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | Attach a nic to Load Balancer
*LoadBalancerApi* | [**datacentersLoadbalancersDelete**](docs/LoadBalancerApi.md#datacentersLoadbalancersDelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Delete a Loadbalancer.
*LoadBalancerApi* | [**datacentersLoadbalancersFindById**](docs/LoadBalancerApi.md#datacentersLoadbalancersFindById) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Retrieve a loadbalancer
*LoadBalancerApi* | [**datacentersLoadbalancersGet**](docs/LoadBalancerApi.md#datacentersLoadbalancersGet) | **GET** /datacenters/{datacenterId}/loadbalancers | List Load Balancers
*LoadBalancerApi* | [**datacentersLoadbalancersPatch**](docs/LoadBalancerApi.md#datacentersLoadbalancersPatch) | **PATCH** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Partially modify a Loadbalancer
*LoadBalancerApi* | [**datacentersLoadbalancersPost**](docs/LoadBalancerApi.md#datacentersLoadbalancersPost) | **POST** /datacenters/{datacenterId}/loadbalancers | Create a Load Balancer
*LoadBalancerApi* | [**datacentersLoadbalancersPut**](docs/LoadBalancerApi.md#datacentersLoadbalancersPut) | **PUT** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Modify a Load Balancer
*LocationApi* | [**locationsFindByRegion**](docs/LocationApi.md#locationsFindByRegion) | **GET** /locations/{regionId} | List Locations within a region
*LocationApi* | [**locationsFindByRegionAndId**](docs/LocationApi.md#locationsFindByRegionAndId) | **GET** /locations/{regionId}/{locationId} | Retrieve a Location
*LocationApi* | [**locationsGet**](docs/LocationApi.md#locationsGet) | **GET** /locations | List Locations
*NicApi* | [**datacentersServersNicsDelete**](docs/NicApi.md#datacentersServersNicsDelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Delete a Nic
*NicApi* | [**datacentersServersNicsFindById**](docs/NicApi.md#datacentersServersNicsFindById) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Retrieve a Nic
*NicApi* | [**datacentersServersNicsFirewallrulesDelete**](docs/NicApi.md#datacentersServersNicsFirewallrulesDelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Delete a Firewall Rule
*NicApi* | [**datacentersServersNicsFirewallrulesFindById**](docs/NicApi.md#datacentersServersNicsFirewallrulesFindById) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Retrieve a Firewall Rule
*NicApi* | [**datacentersServersNicsFirewallrulesGet**](docs/NicApi.md#datacentersServersNicsFirewallrulesGet) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules | List Firewall Rules 
*NicApi* | [**datacentersServersNicsFirewallrulesPatch**](docs/NicApi.md#datacentersServersNicsFirewallrulesPatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Partially modify a Firewall Rule
*NicApi* | [**datacentersServersNicsFirewallrulesPost**](docs/NicApi.md#datacentersServersNicsFirewallrulesPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules | Create a Firewall Rule
*NicApi* | [**datacentersServersNicsFirewallrulesPut**](docs/NicApi.md#datacentersServersNicsFirewallrulesPut) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Modify a Firewall Rule
*NicApi* | [**datacentersServersNicsGet**](docs/NicApi.md#datacentersServersNicsGet) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics | List Nics 
*NicApi* | [**datacentersServersNicsPatch**](docs/NicApi.md#datacentersServersNicsPatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Partially modify a Nic
*NicApi* | [**datacentersServersNicsPost**](docs/NicApi.md#datacentersServersNicsPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics | Create a Nic
*NicApi* | [**datacentersServersNicsPut**](docs/NicApi.md#datacentersServersNicsPut) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Modify a Nic
*PrivateCrossConnectApi* | [**pccsDelete**](docs/PrivateCrossConnectApi.md#pccsDelete) | **DELETE** /pccs/{pccId} | Delete a Private Cross-Connect
*PrivateCrossConnectApi* | [**pccsFindById**](docs/PrivateCrossConnectApi.md#pccsFindById) | **GET** /pccs/{pccId} | Retrieve a Private Cross-Connect
*PrivateCrossConnectApi* | [**pccsGet**](docs/PrivateCrossConnectApi.md#pccsGet) | **GET** /pccs | List Private Cross-Connects 
*PrivateCrossConnectApi* | [**pccsPatch**](docs/PrivateCrossConnectApi.md#pccsPatch) | **PATCH** /pccs/{pccId} | Partially modify a private cross-connect
*PrivateCrossConnectApi* | [**pccsPost**](docs/PrivateCrossConnectApi.md#pccsPost) | **POST** /pccs | Create a Private Cross-Connect
*RequestApi* | [**requestsFindById**](docs/RequestApi.md#requestsFindById) | **GET** /requests/{requestId} | Retrieve a Request
*RequestApi* | [**requestsGet**](docs/RequestApi.md#requestsGet) | **GET** /requests | List Requests
*RequestApi* | [**requestsStatusGet**](docs/RequestApi.md#requestsStatusGet) | **GET** /requests/{requestId}/status | Retrieve Request Status
*ServerApi* | [**datacentersServersCdromsDelete**](docs/ServerApi.md#datacentersServersCdromsDelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/cdroms/{cdromId} | Detach a CD-ROM
*ServerApi* | [**datacentersServersCdromsFindById**](docs/ServerApi.md#datacentersServersCdromsFindById) | **GET** /datacenters/{datacenterId}/servers/{serverId}/cdroms/{cdromId} | Retrieve an attached CD-ROM
*ServerApi* | [**datacentersServersCdromsGet**](docs/ServerApi.md#datacentersServersCdromsGet) | **GET** /datacenters/{datacenterId}/servers/{serverId}/cdroms | List attached CD-ROMs 
*ServerApi* | [**datacentersServersCdromsPost**](docs/ServerApi.md#datacentersServersCdromsPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/cdroms | Attach a CD-ROM
*ServerApi* | [**datacentersServersDelete**](docs/ServerApi.md#datacentersServersDelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId} | Delete a Server
*ServerApi* | [**datacentersServersFindById**](docs/ServerApi.md#datacentersServersFindById) | **GET** /datacenters/{datacenterId}/servers/{serverId} | Retrieve a Server
*ServerApi* | [**datacentersServersGet**](docs/ServerApi.md#datacentersServersGet) | **GET** /datacenters/{datacenterId}/servers | List Servers 
*ServerApi* | [**datacentersServersPatch**](docs/ServerApi.md#datacentersServersPatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId} | Partially modify a Server
*ServerApi* | [**datacentersServersPost**](docs/ServerApi.md#datacentersServersPost) | **POST** /datacenters/{datacenterId}/servers | Create a Server
*ServerApi* | [**datacentersServersPut**](docs/ServerApi.md#datacentersServersPut) | **PUT** /datacenters/{datacenterId}/servers/{serverId} | Modify a Server
*ServerApi* | [**datacentersServersRebootPost**](docs/ServerApi.md#datacentersServersRebootPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/reboot | Reboot a Server
*ServerApi* | [**datacentersServersStartPost**](docs/ServerApi.md#datacentersServersStartPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/start | Start a Server
*ServerApi* | [**datacentersServersStopPost**](docs/ServerApi.md#datacentersServersStopPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/stop | Stop a Server
*ServerApi* | [**datacentersServersUpgradePost**](docs/ServerApi.md#datacentersServersUpgradePost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/upgrade | Upgrade a Server
*ServerApi* | [**datacentersServersVolumesDelete**](docs/ServerApi.md#datacentersServersVolumesDelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/volumes/{volumeId} | Detach a volume
*ServerApi* | [**datacentersServersVolumesFindById**](docs/ServerApi.md#datacentersServersVolumesFindById) | **GET** /datacenters/{datacenterId}/servers/{serverId}/volumes/{volumeId} | Retrieve an attached volume
*ServerApi* | [**datacentersServersVolumesGet**](docs/ServerApi.md#datacentersServersVolumesGet) | **GET** /datacenters/{datacenterId}/servers/{serverId}/volumes | List Attached Volumes
*ServerApi* | [**datacentersServersVolumesPost**](docs/ServerApi.md#datacentersServersVolumesPost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/volumes | Attach a volume
*SnapshotApi* | [**snapshotsDelete**](docs/SnapshotApi.md#snapshotsDelete) | **DELETE** /snapshots/{snapshotId} | Delete a Snapshot
*SnapshotApi* | [**snapshotsFindById**](docs/SnapshotApi.md#snapshotsFindById) | **GET** /snapshots/{snapshotId} | Retrieve a Snapshot by its uuid.
*SnapshotApi* | [**snapshotsGet**](docs/SnapshotApi.md#snapshotsGet) | **GET** /snapshots | List Snapshots 
*SnapshotApi* | [**snapshotsPatch**](docs/SnapshotApi.md#snapshotsPatch) | **PATCH** /snapshots/{snapshotId} | Partially modify a Snapshot
*SnapshotApi* | [**snapshotsPut**](docs/SnapshotApi.md#snapshotsPut) | **PUT** /snapshots/{snapshotId} | Modify a Snapshot
*UserManagementApi* | [**umGroupsDelete**](docs/UserManagementApi.md#umGroupsDelete) | **DELETE** /um/groups/{groupId} | Delete a Group
*UserManagementApi* | [**umGroupsFindById**](docs/UserManagementApi.md#umGroupsFindById) | **GET** /um/groups/{groupId} | Retrieve a Group
*UserManagementApi* | [**umGroupsGet**](docs/UserManagementApi.md#umGroupsGet) | **GET** /um/groups | List All Groups.
*UserManagementApi* | [**umGroupsPost**](docs/UserManagementApi.md#umGroupsPost) | **POST** /um/groups | Create a Group
*UserManagementApi* | [**umGroupsPut**](docs/UserManagementApi.md#umGroupsPut) | **PUT** /um/groups/{groupId} | Modify a group
*UserManagementApi* | [**umGroupsResourcesGet**](docs/UserManagementApi.md#umGroupsResourcesGet) | **GET** /um/groups/{groupId}/resources | Retrieve resources assigned to a group
*UserManagementApi* | [**umGroupsSharesDelete**](docs/UserManagementApi.md#umGroupsSharesDelete) | **DELETE** /um/groups/{groupId}/shares/{resourceId} | Remove a resource from a group
*UserManagementApi* | [**umGroupsSharesFindByResource**](docs/UserManagementApi.md#umGroupsSharesFindByResource) | **GET** /um/groups/{groupId}/shares/{resourceId} | Retrieve a group share
*UserManagementApi* | [**umGroupsSharesGet**](docs/UserManagementApi.md#umGroupsSharesGet) | **GET** /um/groups/{groupId}/shares | List Group Shares 
*UserManagementApi* | [**umGroupsSharesPost**](docs/UserManagementApi.md#umGroupsSharesPost) | **POST** /um/groups/{groupId}/shares/{resourceId} | Add a resource to a group
*UserManagementApi* | [**umGroupsSharesPut**](docs/UserManagementApi.md#umGroupsSharesPut) | **PUT** /um/groups/{groupId}/shares/{resourceId} | Modify resource permissions of a group
*UserManagementApi* | [**umGroupsUsersDelete**](docs/UserManagementApi.md#umGroupsUsersDelete) | **DELETE** /um/groups/{groupId}/users/{userId} | Remove a user from a group
*UserManagementApi* | [**umGroupsUsersGet**](docs/UserManagementApi.md#umGroupsUsersGet) | **GET** /um/groups/{groupId}/users | List Group Members 
*UserManagementApi* | [**umGroupsUsersPost**](docs/UserManagementApi.md#umGroupsUsersPost) | **POST** /um/groups/{groupId}/users | Add a user to a group
*UserManagementApi* | [**umResourcesFindByType**](docs/UserManagementApi.md#umResourcesFindByType) | **GET** /um/resources/{resourceType} | Retrieve a list of Resources by type.
*UserManagementApi* | [**umResourcesFindByTypeAndId**](docs/UserManagementApi.md#umResourcesFindByTypeAndId) | **GET** /um/resources/{resourceType}/{resourceId} | Retrieve a Resource by type.
*UserManagementApi* | [**umResourcesGet**](docs/UserManagementApi.md#umResourcesGet) | **GET** /um/resources | List All Resources.
*UserManagementApi* | [**umUsersDelete**](docs/UserManagementApi.md#umUsersDelete) | **DELETE** /um/users/{userId} | Delete a User
*UserManagementApi* | [**umUsersFindById**](docs/UserManagementApi.md#umUsersFindById) | **GET** /um/users/{userId} | Retrieve a User
*UserManagementApi* | [**umUsersGet**](docs/UserManagementApi.md#umUsersGet) | **GET** /um/users | List all Users 
*UserManagementApi* | [**umUsersGroupsGet**](docs/UserManagementApi.md#umUsersGroupsGet) | **GET** /um/users/{userId}/groups | Retrieve a User&#39;s group resources
*UserManagementApi* | [**umUsersOwnsGet**](docs/UserManagementApi.md#umUsersOwnsGet) | **GET** /um/users/{userId}/owns | Retrieve a User&#39;s own resources
*UserManagementApi* | [**umUsersPost**](docs/UserManagementApi.md#umUsersPost) | **POST** /um/users | Create a user
*UserManagementApi* | [**umUsersPut**](docs/UserManagementApi.md#umUsersPut) | **PUT** /um/users/{userId} | Modify a user
*UserManagementApi* | [**umUsersS3keysDelete**](docs/UserManagementApi.md#umUsersS3keysDelete) | **DELETE** /um/users/{userId}/s3keys/{keyId} | Delete a S3 key
*UserManagementApi* | [**umUsersS3keysFindByKey**](docs/UserManagementApi.md#umUsersS3keysFindByKey) | **GET** /um/users/{userId}/s3keys/{keyId} | Retrieve given S3 key belonging to the given User
*UserManagementApi* | [**umUsersS3keysGet**](docs/UserManagementApi.md#umUsersS3keysGet) | **GET** /um/users/{userId}/s3keys | Retrieve a User&#39;s S3 keys
*UserManagementApi* | [**umUsersS3keysPost**](docs/UserManagementApi.md#umUsersS3keysPost) | **POST** /um/users/{userId}/s3keys | Create a S3 key for the given user
*UserManagementApi* | [**umUsersS3keysPut**](docs/UserManagementApi.md#umUsersS3keysPut) | **PUT** /um/users/{userId}/s3keys/{keyId} | Modify a S3 key having the given key id
*UserManagementApi* | [**umUsersS3ssourlGet**](docs/UserManagementApi.md#umUsersS3ssourlGet) | **GET** /um/users/{userId}/s3ssourl | Retrieve S3 object storage single signon URL for the given user
*VolumeApi* | [**datacentersVolumesCreateSnapshotPost**](docs/VolumeApi.md#datacentersVolumesCreateSnapshotPost) | **POST** /datacenters/{datacenterId}/volumes/{volumeId}/create-snapshot | Create Volume Snapshot
*VolumeApi* | [**datacentersVolumesDelete**](docs/VolumeApi.md#datacentersVolumesDelete) | **DELETE** /datacenters/{datacenterId}/volumes/{volumeId} | Delete a Volume
*VolumeApi* | [**datacentersVolumesFindById**](docs/VolumeApi.md#datacentersVolumesFindById) | **GET** /datacenters/{datacenterId}/volumes/{volumeId} | Retrieve a Volume
*VolumeApi* | [**datacentersVolumesGet**](docs/VolumeApi.md#datacentersVolumesGet) | **GET** /datacenters/{datacenterId}/volumes | List Volumes 
*VolumeApi* | [**datacentersVolumesPatch**](docs/VolumeApi.md#datacentersVolumesPatch) | **PATCH** /datacenters/{datacenterId}/volumes/{volumeId} | Partially modify a Volume
*VolumeApi* | [**datacentersVolumesPost**](docs/VolumeApi.md#datacentersVolumesPost) | **POST** /datacenters/{datacenterId}/volumes | Create a Volume
*VolumeApi* | [**datacentersVolumesPut**](docs/VolumeApi.md#datacentersVolumesPut) | **PUT** /datacenters/{datacenterId}/volumes/{volumeId} | Modify a Volume
*VolumeApi* | [**datacentersVolumesRestoreSnapshotPost**](docs/VolumeApi.md#datacentersVolumesRestoreSnapshotPost) | **POST** /datacenters/{datacenterId}/volumes/{volumeId}/restore-snapshot | Restore Volume Snapshot


## Documentation for Models

 - [AttachedVolumes](docs/AttachedVolumes.md)
 - [BackupUnit](docs/BackupUnit.md)
 - [BackupUnitProperties](docs/BackupUnitProperties.md)
 - [BackupUnitSSO](docs/BackupUnitSSO.md)
 - [BackupUnits](docs/BackupUnits.md)
 - [BalancedNics](docs/BalancedNics.md)
 - [Cdroms](docs/Cdroms.md)
 - [ConnectableDatacenter](docs/ConnectableDatacenter.md)
 - [Contract](docs/Contract.md)
 - [ContractProperties](docs/ContractProperties.md)
 - [Datacenter](docs/Datacenter.md)
 - [DatacenterElementMetadata](docs/DatacenterElementMetadata.md)
 - [DatacenterEntities](docs/DatacenterEntities.md)
 - [DatacenterProperties](docs/DatacenterProperties.md)
 - [Datacenters](docs/Datacenters.md)
 - [Error](docs/Error.md)
 - [ErrorMessage](docs/ErrorMessage.md)
 - [FirewallRule](docs/FirewallRule.md)
 - [FirewallRules](docs/FirewallRules.md)
 - [FirewallruleProperties](docs/FirewallruleProperties.md)
 - [Group](docs/Group.md)
 - [GroupEntities](docs/GroupEntities.md)
 - [GroupMembers](docs/GroupMembers.md)
 - [GroupProperties](docs/GroupProperties.md)
 - [GroupShare](docs/GroupShare.md)
 - [GroupShareProperties](docs/GroupShareProperties.md)
 - [GroupShares](docs/GroupShares.md)
 - [GroupUsers](docs/GroupUsers.md)
 - [Groups](docs/Groups.md)
 - [IPFailover](docs/IPFailover.md)
 - [Image](docs/Image.md)
 - [ImageProperties](docs/ImageProperties.md)
 - [Images](docs/Images.md)
 - [Info](docs/Info.md)
 - [IpBlock](docs/IpBlock.md)
 - [IpBlockProperties](docs/IpBlockProperties.md)
 - [IpBlocks](docs/IpBlocks.md)
 - [IpConsumer](docs/IpConsumer.md)
 - [KubernetesAutoScaling](docs/KubernetesAutoScaling.md)
 - [KubernetesCluster](docs/KubernetesCluster.md)
 - [KubernetesClusterEntities](docs/KubernetesClusterEntities.md)
 - [KubernetesClusterProperties](docs/KubernetesClusterProperties.md)
 - [KubernetesClusters](docs/KubernetesClusters.md)
 - [KubernetesConfig](docs/KubernetesConfig.md)
 - [KubernetesConfigProperties](docs/KubernetesConfigProperties.md)
 - [KubernetesMaintenanceWindow](docs/KubernetesMaintenanceWindow.md)
 - [KubernetesNode](docs/KubernetesNode.md)
 - [KubernetesNodeMetadata](docs/KubernetesNodeMetadata.md)
 - [KubernetesNodePool](docs/KubernetesNodePool.md)
 - [KubernetesNodePoolAnnotation](docs/KubernetesNodePoolAnnotation.md)
 - [KubernetesNodePoolForPut](docs/KubernetesNodePoolForPut.md)
 - [KubernetesNodePoolLabel](docs/KubernetesNodePoolLabel.md)
 - [KubernetesNodePoolLan](docs/KubernetesNodePoolLan.md)
 - [KubernetesNodePoolProperties](docs/KubernetesNodePoolProperties.md)
 - [KubernetesNodePoolPropertiesForPut](docs/KubernetesNodePoolPropertiesForPut.md)
 - [KubernetesNodePools](docs/KubernetesNodePools.md)
 - [KubernetesNodeProperties](docs/KubernetesNodeProperties.md)
 - [KubernetesNodes](docs/KubernetesNodes.md)
 - [Label](docs/Label.md)
 - [LabelProperties](docs/LabelProperties.md)
 - [LabelResource](docs/LabelResource.md)
 - [LabelResourceProperties](docs/LabelResourceProperties.md)
 - [LabelResources](docs/LabelResources.md)
 - [Labels](docs/Labels.md)
 - [Lan](docs/Lan.md)
 - [LanEntities](docs/LanEntities.md)
 - [LanNics](docs/LanNics.md)
 - [LanPost](docs/LanPost.md)
 - [LanProperties](docs/LanProperties.md)
 - [LanPropertiesPost](docs/LanPropertiesPost.md)
 - [Lans](docs/Lans.md)
 - [Loadbalancer](docs/Loadbalancer.md)
 - [LoadbalancerEntities](docs/LoadbalancerEntities.md)
 - [LoadbalancerProperties](docs/LoadbalancerProperties.md)
 - [Loadbalancers](docs/Loadbalancers.md)
 - [Location](docs/Location.md)
 - [LocationProperties](docs/LocationProperties.md)
 - [Locations](docs/Locations.md)
 - [Nic](docs/Nic.md)
 - [NicEntities](docs/NicEntities.md)
 - [NicProperties](docs/NicProperties.md)
 - [Nics](docs/Nics.md)
 - [NoStateMetaData](docs/NoStateMetaData.md)
 - [Peer](docs/Peer.md)
 - [PrivateCrossConnect](docs/PrivateCrossConnect.md)
 - [PrivateCrossConnectProperties](docs/PrivateCrossConnectProperties.md)
 - [PrivateCrossConnects](docs/PrivateCrossConnects.md)
 - [Request](docs/Request.md)
 - [RequestMetadata](docs/RequestMetadata.md)
 - [RequestProperties](docs/RequestProperties.md)
 - [RequestStatus](docs/RequestStatus.md)
 - [RequestStatusMetadata](docs/RequestStatusMetadata.md)
 - [RequestTarget](docs/RequestTarget.md)
 - [Requests](docs/Requests.md)
 - [Resource](docs/Resource.md)
 - [ResourceEntities](docs/ResourceEntities.md)
 - [ResourceGroups](docs/ResourceGroups.md)
 - [ResourceLimits](docs/ResourceLimits.md)
 - [ResourceProperties](docs/ResourceProperties.md)
 - [ResourceReference](docs/ResourceReference.md)
 - [Resources](docs/Resources.md)
 - [ResourcesUsers](docs/ResourcesUsers.md)
 - [S3Key](docs/S3Key.md)
 - [S3KeyMetadata](docs/S3KeyMetadata.md)
 - [S3KeyProperties](docs/S3KeyProperties.md)
 - [S3Keys](docs/S3Keys.md)
 - [S3ObjectStorageSSO](docs/S3ObjectStorageSSO.md)
 - [Server](docs/Server.md)
 - [ServerEntities](docs/ServerEntities.md)
 - [ServerProperties](docs/ServerProperties.md)
 - [Servers](docs/Servers.md)
 - [Snapshot](docs/Snapshot.md)
 - [SnapshotProperties](docs/SnapshotProperties.md)
 - [Snapshots](docs/Snapshots.md)
 - [Type](docs/Type.md)
 - [User](docs/User.md)
 - [UserMetadata](docs/UserMetadata.md)
 - [UserProperties](docs/UserProperties.md)
 - [Users](docs/Users.md)
 - [UsersEntities](docs/UsersEntities.md)
 - [Volume](docs/Volume.md)
 - [VolumeProperties](docs/VolumeProperties.md)
 - [Volumes](docs/Volumes.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Basic Authentication

- **Type**: HTTP basic authentication

### Token Authentication

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



