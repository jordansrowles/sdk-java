/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.model.KubernetesAutoScaling;
import com.ionoscloud.model.KubernetesMaintenanceWindow;
import com.ionoscloud.model.KubernetesNodePoolLan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * KubernetesNodePoolPropertiesForPut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-10T05:23:54.210Z[Etc/UTC]")

public class KubernetesNodePoolPropertiesForPut {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenterId";
  @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
  private String datacenterId;

  public static final String SERIALIZED_NAME_NODE_COUNT = "nodeCount";
  @SerializedName(SERIALIZED_NAME_NODE_COUNT)
  private Integer nodeCount;

  public static final String SERIALIZED_NAME_CPU_FAMILY = "cpuFamily";
  @SerializedName(SERIALIZED_NAME_CPU_FAMILY)
  private String cpuFamily;

  public static final String SERIALIZED_NAME_CORES_COUNT = "coresCount";
  @SerializedName(SERIALIZED_NAME_CORES_COUNT)
  private Integer coresCount;

  public static final String SERIALIZED_NAME_RAM_SIZE = "ramSize";
  @SerializedName(SERIALIZED_NAME_RAM_SIZE)
  private Integer ramSize;

  /**
   * The availability zone in which the target VM should exist
   */
  @JsonAdapter(AvailabilityZoneEnum.Adapter.class)
  public enum AvailabilityZoneEnum {
    AUTO("AUTO"),
    
    ZONE_1("ZONE_1"),
    
    ZONE_2("ZONE_2");

    private String value;

    AvailabilityZoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityZoneEnum fromValue(String value) {
      for (AvailabilityZoneEnum b : AvailabilityZoneEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AvailabilityZoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityZoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityZoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailabilityZoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "availabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private AvailabilityZoneEnum availabilityZone;

  /**
   * Hardware type of the volume
   */
  @JsonAdapter(StorageTypeEnum.Adapter.class)
  public enum StorageTypeEnum {
    HDD("HDD"),
    
    SSD("SSD");

    private String value;

    StorageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StorageTypeEnum fromValue(String value) {
      for (StorageTypeEnum b : StorageTypeEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StorageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StorageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StorageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "storageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private StorageTypeEnum storageType;

  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Integer storageSize;

  public static final String SERIALIZED_NAME_K8S_VERSION = "k8sVersion";
  @SerializedName(SERIALIZED_NAME_K8S_VERSION)
  private String k8sVersion;

  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private KubernetesMaintenanceWindow maintenanceWindow;

  public static final String SERIALIZED_NAME_AUTO_SCALING = "autoScaling";
  @SerializedName(SERIALIZED_NAME_AUTO_SCALING)
  private KubernetesAutoScaling autoScaling;

  public static final String SERIALIZED_NAME_LANS = "lans";
  @SerializedName(SERIALIZED_NAME_LANS)
  private List<KubernetesNodePoolLan> lans = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_PUBLIC_IPS = "publicIps";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IPS)
  private List<String> publicIps = null;


  public KubernetesNodePoolPropertiesForPut name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A Kubernetes Node Pool Name. Valid Kubernetes Node Pool name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * @return name
  **/
  @ApiModelProperty(example = "k8s-node-pool", required = true, value = "A Kubernetes Node Pool Name. Valid Kubernetes Node Pool name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KubernetesNodePoolPropertiesForPut datacenterId(String datacenterId) {
    
    this.datacenterId = datacenterId;
    return this;
  }

   /**
   * A valid uuid of the datacenter on which user has access
   * @return datacenterId
  **/
  @ApiModelProperty(example = "1e072e52-2ed3-492f-b6b6-c6b116907521", required = true, value = "A valid uuid of the datacenter on which user has access")

  public String getDatacenterId() {
    return datacenterId;
  }


  public void setDatacenterId(String datacenterId) {
    this.datacenterId = datacenterId;
  }


  public KubernetesNodePoolPropertiesForPut nodeCount(Integer nodeCount) {
    
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * Number of nodes part of the Node Pool
   * @return nodeCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "Number of nodes part of the Node Pool")

  public Integer getNodeCount() {
    return nodeCount;
  }


  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }


  public KubernetesNodePoolPropertiesForPut cpuFamily(String cpuFamily) {
    
    this.cpuFamily = cpuFamily;
    return this;
  }

   /**
   * A valid cpu family name
   * @return cpuFamily
  **/
  @ApiModelProperty(example = "AMD_OPTERON", required = true, value = "A valid cpu family name")

  public String getCpuFamily() {
    return cpuFamily;
  }


  public void setCpuFamily(String cpuFamily) {
    this.cpuFamily = cpuFamily;
  }


  public KubernetesNodePoolPropertiesForPut coresCount(Integer coresCount) {
    
    this.coresCount = coresCount;
    return this;
  }

   /**
   * Number of cores for node
   * @return coresCount
  **/
  @ApiModelProperty(example = "4", required = true, value = "Number of cores for node")

  public Integer getCoresCount() {
    return coresCount;
  }


  public void setCoresCount(Integer coresCount) {
    this.coresCount = coresCount;
  }


  public KubernetesNodePoolPropertiesForPut ramSize(Integer ramSize) {
    
    this.ramSize = ramSize;
    return this;
  }

   /**
   * RAM size for node, minimum size 2048MB is recommended. Ram size must be set to multiple of 1024MB.
   * @return ramSize
  **/
  @ApiModelProperty(example = "2048", required = true, value = "RAM size for node, minimum size 2048MB is recommended. Ram size must be set to multiple of 1024MB.")

  public Integer getRamSize() {
    return ramSize;
  }


  public void setRamSize(Integer ramSize) {
    this.ramSize = ramSize;
  }


  public KubernetesNodePoolPropertiesForPut availabilityZone(AvailabilityZoneEnum availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * The availability zone in which the target VM should exist
   * @return availabilityZone
  **/
  @ApiModelProperty(example = "AUTO", required = true, value = "The availability zone in which the target VM should exist")

  public AvailabilityZoneEnum getAvailabilityZone() {
    return availabilityZone;
  }


  public void setAvailabilityZone(AvailabilityZoneEnum availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public KubernetesNodePoolPropertiesForPut storageType(StorageTypeEnum storageType) {
    
    this.storageType = storageType;
    return this;
  }

   /**
   * Hardware type of the volume
   * @return storageType
  **/
  @ApiModelProperty(example = "HDD", required = true, value = "Hardware type of the volume")

  public StorageTypeEnum getStorageType() {
    return storageType;
  }


  public void setStorageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
  }


  public KubernetesNodePoolPropertiesForPut storageSize(Integer storageSize) {
    
    this.storageSize = storageSize;
    return this;
  }

   /**
   * The size of the volume in GB. The size should be greater than 10GB.
   * @return storageSize
  **/
  @ApiModelProperty(example = "100", required = true, value = "The size of the volume in GB. The size should be greater than 10GB.")

  public Integer getStorageSize() {
    return storageSize;
  }


  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }


  public KubernetesNodePoolPropertiesForPut k8sVersion(String k8sVersion) {
    
    this.k8sVersion = k8sVersion;
    return this;
  }

   /**
   * The kubernetes version in which a nodepool is running. This imposes restrictions on what kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions.
   * @return k8sVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.15.4", value = "The kubernetes version in which a nodepool is running. This imposes restrictions on what kubernetes versions can be run in a cluster's nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions.")

  public String getK8sVersion() {
    return k8sVersion;
  }


  public void setK8sVersion(String k8sVersion) {
    this.k8sVersion = k8sVersion;
  }


  public KubernetesNodePoolPropertiesForPut maintenanceWindow(KubernetesMaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KubernetesMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  public void setMaintenanceWindow(KubernetesMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }


  public KubernetesNodePoolPropertiesForPut autoScaling(KubernetesAutoScaling autoScaling) {
    
    this.autoScaling = autoScaling;
    return this;
  }

   /**
   * Get autoScaling
   * @return autoScaling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KubernetesAutoScaling getAutoScaling() {
    return autoScaling;
  }


  public void setAutoScaling(KubernetesAutoScaling autoScaling) {
    this.autoScaling = autoScaling;
  }


  public KubernetesNodePoolPropertiesForPut lans(List<KubernetesNodePoolLan> lans) {
    
    this.lans = lans;
    return this;
  }

  public KubernetesNodePoolPropertiesForPut addLansItem(KubernetesNodePoolLan lansItem) {
    if (this.lans == null) {
      this.lans = new ArrayList<KubernetesNodePoolLan>();
    }
    this.lans.add(lansItem);
    return this;
  }

   /**
   * array of additional LANs attached to worker nodes
   * @return lans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "array of additional LANs attached to worker nodes")

  public List<KubernetesNodePoolLan> getLans() {
    return lans;
  }


  public void setLans(List<KubernetesNodePoolLan> lans) {
    this.lans = lans;
  }


  public KubernetesNodePoolPropertiesForPut labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public KubernetesNodePoolPropertiesForPut putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * map of labels attached to node pool
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "map of labels attached to node pool")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public KubernetesNodePoolPropertiesForPut annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public KubernetesNodePoolPropertiesForPut putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * map of annotations attached to node pool
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "map of annotations attached to node pool")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public KubernetesNodePoolPropertiesForPut publicIps(List<String> publicIps) {
    
    this.publicIps = publicIps;
    return this;
  }

  public KubernetesNodePoolPropertiesForPut addPublicIpsItem(String publicIpsItem) {
    if (this.publicIps == null) {
      this.publicIps = new ArrayList<String>();
    }
    this.publicIps.add(publicIpsItem);
    return this;
  }

   /**
   * Optional array of reserved public IP addresses to be used by the nodes. IPs must be from same location as the data center used for the node pool. The array must contain one extra IP than maximum number of nodes could be. (nodeCount+1 if fixed node amount or maxNodeCount+1 if auto scaling is used) The extra provided IP Will be used during rebuilding of nodes.
   * @return publicIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[81.173.1.2, 82.231.2.5, 92.221.2.4]", value = "Optional array of reserved public IP addresses to be used by the nodes. IPs must be from same location as the data center used for the node pool. The array must contain one extra IP than maximum number of nodes could be. (nodeCount+1 if fixed node amount or maxNodeCount+1 if auto scaling is used) The extra provided IP Will be used during rebuilding of nodes.")

  public List<String> getPublicIps() {
    return publicIps;
  }


  public void setPublicIps(List<String> publicIps) {
    this.publicIps = publicIps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesNodePoolPropertiesForPut kubernetesNodePoolPropertiesForPut = (KubernetesNodePoolPropertiesForPut) o;
    return Objects.equals(this.name, kubernetesNodePoolPropertiesForPut.name) && Objects.equals(this.datacenterId, kubernetesNodePoolPropertiesForPut.datacenterId) && Objects.equals(this.nodeCount, kubernetesNodePoolPropertiesForPut.nodeCount) && Objects.equals(this.cpuFamily, kubernetesNodePoolPropertiesForPut.cpuFamily) && Objects.equals(this.coresCount, kubernetesNodePoolPropertiesForPut.coresCount) && Objects.equals(this.ramSize, kubernetesNodePoolPropertiesForPut.ramSize) && Objects.equals(this.availabilityZone, kubernetesNodePoolPropertiesForPut.availabilityZone) && Objects.equals(this.storageType, kubernetesNodePoolPropertiesForPut.storageType) && Objects.equals(this.storageSize, kubernetesNodePoolPropertiesForPut.storageSize) && Objects.equals(this.k8sVersion, kubernetesNodePoolPropertiesForPut.k8sVersion) && Objects.equals(this.maintenanceWindow, kubernetesNodePoolPropertiesForPut.maintenanceWindow) && Objects.equals(this.autoScaling, kubernetesNodePoolPropertiesForPut.autoScaling) && Objects.equals(this.lans, kubernetesNodePoolPropertiesForPut.lans) && Objects.equals(this.labels, kubernetesNodePoolPropertiesForPut.labels) && Objects.equals(this.annotations, kubernetesNodePoolPropertiesForPut.annotations) && Objects.equals(this.publicIps, kubernetesNodePoolPropertiesForPut.publicIps);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesNodePoolPropertiesForPut {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    cpuFamily: ").append(toIndentedString(cpuFamily)).append("\n");
    sb.append("    coresCount: ").append(toIndentedString(coresCount)).append("\n");
    sb.append("    ramSize: ").append(toIndentedString(ramSize)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");
    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
    sb.append("    autoScaling: ").append(toIndentedString(autoScaling)).append("\n");
    sb.append("    lans: ").append(toIndentedString(lans)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

