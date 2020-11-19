

# KubernetesClusters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique representation for Kubernetes Cluster as a collection on a resource. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | The type of resource within a collection |  [optional] [readonly]
**href** | [**URI**](URI.md) | URL to the collection representation (absolute path) |  [optional] [readonly]
**items** | [**List&lt;KubernetesCluster&gt;**](KubernetesCluster.md) | Array of items in that collection |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
K8S | &quot;k8s&quot;


