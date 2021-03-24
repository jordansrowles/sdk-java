# KubernetesNodePools

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Unique representation for Kubernetes Node Pool as a collection on a resource. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](kubernetesnodepools.md#TypeEnum) | The type of object that has been created | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/8f2023b15d2a11cc163b3abd7b642806c3db5f2c/docs/URI.md) | URL to the collection representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;KubernetesNodePool&gt;**](kubernetesnodepool.md) | Array of items in that collection | \[optional\] \[readonly\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| COLLECTION | "collection" |
