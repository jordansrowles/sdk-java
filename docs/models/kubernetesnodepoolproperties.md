# KubernetesNodePoolProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A Kubernetes Node Pool Name. Valid Kubernetes Node Pool name must be 63 characters or less and must be empty or begin and end with an alphanumeric character \(\[a-z0-9A-Z\]\) with dashes \(-\), underscores \(\_\), dots \(.\), and alphanumerics between. |  |
| **datacenterId** | **String** | A valid uuid of the datacenter on which user has access |  |
| **nodeCount** | **Integer** | Number of nodes part of the Node Pool |  |
| **cpuFamily** | **String** | A valid cpu family name |  |
| **coresCount** | **Integer** | Number of cores for node |  |
| **ramSize** | **Integer** | RAM size for node, minimum size is 2048MB. Ram size must be set to multiple of 1024MB. |  |
| **availabilityZone** | [**AvailabilityZoneEnum**](kubernetesnodepoolproperties.md#AvailabilityZoneEnum) | The availability zone in which the target VM should exist |  |
| **storageType** | [**StorageTypeEnum**](kubernetesnodepoolproperties.md#StorageTypeEnum) | Hardware type of the volume |  |
| **storageSize** | **Integer** | The size of the volume in GB. The size should be greater than 10GB. |  |
| **k8sVersion** | **String** | The kubernetes version in which a nodepool is running. This imposes restrictions on what kubernetes versions can be run in a cluster's nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions. | \[optional\] |
| **maintenanceWindow** | [**KubernetesMaintenanceWindow**](kubernetesmaintenancewindow.md) |  | \[optional\] |
| **autoScaling** | [**KubernetesAutoScaling**](kubernetesautoscaling.md) |  | \[optional\] |
| **lans** | [**List&lt;KubernetesNodePoolLan&gt;**](kubernetesnodepoollan.md) | array of additional LANs attached to worker nodes | \[optional\] |
| **labels** | **Map&lt;String, String&gt;** | map of labels attached to node pool | \[optional\] |
| **annotations** | **Map&lt;String, String&gt;** | map of annotations attached to node pool | \[optional\] |
| **publicIps** | **List&lt;String&gt;** | Optional array of reserved public IP addresses to be used by the nodes. IPs must be from same location as the data center used for the node pool. The array must contain one extra IP than maximum number of nodes could be. \(nodeCount+1 if fixed node amount or maxNodeCount+1 if auto scaling is used\) The extra provided IP Will be used during rebuilding of nodes. | \[optional\] |
| **availableUpgradeVersions** | **List&lt;String&gt;** | List of available versions for upgrading the node pool | \[optional\] |

## Enum: AvailabilityZoneEnum

| Name | Value |
| :--- | :--- |
| AUTO | "AUTO" |
| ZONE\_1 | "ZONE\_1" |
| ZONE\_2 | "ZONE\_2" |

## Enum: StorageTypeEnum

| Name | Value |
| :--- | :--- |
| HDD | "HDD" |
| SSD | "SSD" |

