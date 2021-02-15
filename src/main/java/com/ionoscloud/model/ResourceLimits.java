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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-15T15:14:48.811Z[Etc/UTC]")

public class ResourceLimits {
  public static final String SERIALIZED_NAME_CORES_PER_SERVER = "coresPerServer";
  @SerializedName(SERIALIZED_NAME_CORES_PER_SERVER)
  private Integer coresPerServer;

  public static final String SERIALIZED_NAME_CORES_PER_CONTRACT = "coresPerContract";
  @SerializedName(SERIALIZED_NAME_CORES_PER_CONTRACT)
  private Integer coresPerContract;

  public static final String SERIALIZED_NAME_CORES_PROVISIONED = "coresProvisioned";
  @SerializedName(SERIALIZED_NAME_CORES_PROVISIONED)
  private Integer coresProvisioned;

  public static final String SERIALIZED_NAME_RAM_PER_SERVER = "ramPerServer";
  @SerializedName(SERIALIZED_NAME_RAM_PER_SERVER)
  private Integer ramPerServer;

  public static final String SERIALIZED_NAME_RAM_PER_CONTRACT = "ramPerContract";
  @SerializedName(SERIALIZED_NAME_RAM_PER_CONTRACT)
  private Integer ramPerContract;

  public static final String SERIALIZED_NAME_RAM_PROVISIONED = "ramProvisioned";
  @SerializedName(SERIALIZED_NAME_RAM_PROVISIONED)
  private Integer ramProvisioned;

  public static final String SERIALIZED_NAME_HDD_LIMIT_PER_VOLUME = "hddLimitPerVolume";
  @SerializedName(SERIALIZED_NAME_HDD_LIMIT_PER_VOLUME)
  private Long hddLimitPerVolume;

  public static final String SERIALIZED_NAME_HDD_LIMIT_PER_CONTRACT = "hddLimitPerContract";
  @SerializedName(SERIALIZED_NAME_HDD_LIMIT_PER_CONTRACT)
  private Long hddLimitPerContract;

  public static final String SERIALIZED_NAME_HDD_VOLUME_PROVISIONED = "hddVolumeProvisioned";
  @SerializedName(SERIALIZED_NAME_HDD_VOLUME_PROVISIONED)
  private Long hddVolumeProvisioned;

  public static final String SERIALIZED_NAME_SSD_LIMIT_PER_VOLUME = "ssdLimitPerVolume";
  @SerializedName(SERIALIZED_NAME_SSD_LIMIT_PER_VOLUME)
  private Long ssdLimitPerVolume;

  public static final String SERIALIZED_NAME_SSD_LIMIT_PER_CONTRACT = "ssdLimitPerContract";
  @SerializedName(SERIALIZED_NAME_SSD_LIMIT_PER_CONTRACT)
  private Long ssdLimitPerContract;

  public static final String SERIALIZED_NAME_SSD_VOLUME_PROVISIONED = "ssdVolumeProvisioned";
  @SerializedName(SERIALIZED_NAME_SSD_VOLUME_PROVISIONED)
  private Long ssdVolumeProvisioned;

  public static final String SERIALIZED_NAME_RESERVABLE_IPS = "reservableIps";
  @SerializedName(SERIALIZED_NAME_RESERVABLE_IPS)
  private Integer reservableIps;

  public static final String SERIALIZED_NAME_RESERVED_IPS_ON_CONTRACT = "reservedIpsOnContract";
  @SerializedName(SERIALIZED_NAME_RESERVED_IPS_ON_CONTRACT)
  private Integer reservedIpsOnContract;

  public static final String SERIALIZED_NAME_RESERVED_IPS_IN_USE = "reservedIpsInUse";
  @SerializedName(SERIALIZED_NAME_RESERVED_IPS_IN_USE)
  private Integer reservedIpsInUse;

  public static final String SERIALIZED_NAME_K8S_CLUSTER_LIMIT_TOTAL = "k8sClusterLimitTotal";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_LIMIT_TOTAL)
  private Integer k8sClusterLimitTotal;

  public static final String SERIALIZED_NAME_K8S_CLUSTERS_PROVISIONED = "k8sClustersProvisioned";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTERS_PROVISIONED)
  private Integer k8sClustersProvisioned;


  public ResourceLimits coresPerServer(Integer coresPerServer) {
    
    this.coresPerServer = coresPerServer;
    return this;
  }

   /**
   * maximum number of cores per server
   * @return coresPerServer
  **/
  @ApiModelProperty(required = true, value = "maximum number of cores per server")

  public Integer getCoresPerServer() {
    return coresPerServer;
  }


  public void setCoresPerServer(Integer coresPerServer) {
    this.coresPerServer = coresPerServer;
  }


  public ResourceLimits coresPerContract(Integer coresPerContract) {
    
    this.coresPerContract = coresPerContract;
    return this;
  }

   /**
   * maximum cores per contract
   * @return coresPerContract
  **/
  @ApiModelProperty(required = true, value = "maximum cores per contract")

  public Integer getCoresPerContract() {
    return coresPerContract;
  }


  public void setCoresPerContract(Integer coresPerContract) {
    this.coresPerContract = coresPerContract;
  }


  public ResourceLimits coresProvisioned(Integer coresProvisioned) {
    
    this.coresProvisioned = coresProvisioned;
    return this;
  }

   /**
   * number of cores provisioned
   * @return coresProvisioned
  **/
  @ApiModelProperty(required = true, value = "number of cores provisioned")

  public Integer getCoresProvisioned() {
    return coresProvisioned;
  }


  public void setCoresProvisioned(Integer coresProvisioned) {
    this.coresProvisioned = coresProvisioned;
  }


  public ResourceLimits ramPerServer(Integer ramPerServer) {
    
    this.ramPerServer = ramPerServer;
    return this;
  }

   /**
   * maximum ram per server
   * @return ramPerServer
  **/
  @ApiModelProperty(required = true, value = "maximum ram per server")

  public Integer getRamPerServer() {
    return ramPerServer;
  }


  public void setRamPerServer(Integer ramPerServer) {
    this.ramPerServer = ramPerServer;
  }


  public ResourceLimits ramPerContract(Integer ramPerContract) {
    
    this.ramPerContract = ramPerContract;
    return this;
  }

   /**
   * maximum ram per contract
   * @return ramPerContract
  **/
  @ApiModelProperty(required = true, value = "maximum ram per contract")

  public Integer getRamPerContract() {
    return ramPerContract;
  }


  public void setRamPerContract(Integer ramPerContract) {
    this.ramPerContract = ramPerContract;
  }


  public ResourceLimits ramProvisioned(Integer ramProvisioned) {
    
    this.ramProvisioned = ramProvisioned;
    return this;
  }

   /**
   * ram provisioned
   * @return ramProvisioned
  **/
  @ApiModelProperty(required = true, value = "ram provisioned")

  public Integer getRamProvisioned() {
    return ramProvisioned;
  }


  public void setRamProvisioned(Integer ramProvisioned) {
    this.ramProvisioned = ramProvisioned;
  }


  public ResourceLimits hddLimitPerVolume(Long hddLimitPerVolume) {
    
    this.hddLimitPerVolume = hddLimitPerVolume;
    return this;
  }

   /**
   * hdd limit per volume
   * @return hddLimitPerVolume
  **/
  @ApiModelProperty(required = true, value = "hdd limit per volume")

  public Long getHddLimitPerVolume() {
    return hddLimitPerVolume;
  }


  public void setHddLimitPerVolume(Long hddLimitPerVolume) {
    this.hddLimitPerVolume = hddLimitPerVolume;
  }


  public ResourceLimits hddLimitPerContract(Long hddLimitPerContract) {
    
    this.hddLimitPerContract = hddLimitPerContract;
    return this;
  }

   /**
   * hdd limit per contract
   * @return hddLimitPerContract
  **/
  @ApiModelProperty(required = true, value = "hdd limit per contract")

  public Long getHddLimitPerContract() {
    return hddLimitPerContract;
  }


  public void setHddLimitPerContract(Long hddLimitPerContract) {
    this.hddLimitPerContract = hddLimitPerContract;
  }


  public ResourceLimits hddVolumeProvisioned(Long hddVolumeProvisioned) {
    
    this.hddVolumeProvisioned = hddVolumeProvisioned;
    return this;
  }

   /**
   * hdd volume provisioned
   * @return hddVolumeProvisioned
  **/
  @ApiModelProperty(required = true, value = "hdd volume provisioned")

  public Long getHddVolumeProvisioned() {
    return hddVolumeProvisioned;
  }


  public void setHddVolumeProvisioned(Long hddVolumeProvisioned) {
    this.hddVolumeProvisioned = hddVolumeProvisioned;
  }


  public ResourceLimits ssdLimitPerVolume(Long ssdLimitPerVolume) {
    
    this.ssdLimitPerVolume = ssdLimitPerVolume;
    return this;
  }

   /**
   * ssd limit per volume
   * @return ssdLimitPerVolume
  **/
  @ApiModelProperty(required = true, value = "ssd limit per volume")

  public Long getSsdLimitPerVolume() {
    return ssdLimitPerVolume;
  }


  public void setSsdLimitPerVolume(Long ssdLimitPerVolume) {
    this.ssdLimitPerVolume = ssdLimitPerVolume;
  }


  public ResourceLimits ssdLimitPerContract(Long ssdLimitPerContract) {
    
    this.ssdLimitPerContract = ssdLimitPerContract;
    return this;
  }

   /**
   * ssd limit per contract
   * @return ssdLimitPerContract
  **/
  @ApiModelProperty(required = true, value = "ssd limit per contract")

  public Long getSsdLimitPerContract() {
    return ssdLimitPerContract;
  }


  public void setSsdLimitPerContract(Long ssdLimitPerContract) {
    this.ssdLimitPerContract = ssdLimitPerContract;
  }


  public ResourceLimits ssdVolumeProvisioned(Long ssdVolumeProvisioned) {
    
    this.ssdVolumeProvisioned = ssdVolumeProvisioned;
    return this;
  }

   /**
   * ssd volume provisioned
   * @return ssdVolumeProvisioned
  **/
  @ApiModelProperty(required = true, value = "ssd volume provisioned")

  public Long getSsdVolumeProvisioned() {
    return ssdVolumeProvisioned;
  }


  public void setSsdVolumeProvisioned(Long ssdVolumeProvisioned) {
    this.ssdVolumeProvisioned = ssdVolumeProvisioned;
  }


  public ResourceLimits reservableIps(Integer reservableIps) {
    
    this.reservableIps = reservableIps;
    return this;
  }

   /**
   * total reservable ip limit of the customer
   * @return reservableIps
  **/
  @ApiModelProperty(required = true, value = "total reservable ip limit of the customer")

  public Integer getReservableIps() {
    return reservableIps;
  }


  public void setReservableIps(Integer reservableIps) {
    this.reservableIps = reservableIps;
  }


  public ResourceLimits reservedIpsOnContract(Integer reservedIpsOnContract) {
    
    this.reservedIpsOnContract = reservedIpsOnContract;
    return this;
  }

   /**
   * reserved ips on a contract
   * @return reservedIpsOnContract
  **/
  @ApiModelProperty(required = true, value = "reserved ips on a contract")

  public Integer getReservedIpsOnContract() {
    return reservedIpsOnContract;
  }


  public void setReservedIpsOnContract(Integer reservedIpsOnContract) {
    this.reservedIpsOnContract = reservedIpsOnContract;
  }


  public ResourceLimits reservedIpsInUse(Integer reservedIpsInUse) {
    
    this.reservedIpsInUse = reservedIpsInUse;
    return this;
  }

   /**
   * reserved ips in use
   * @return reservedIpsInUse
  **/
  @ApiModelProperty(required = true, value = "reserved ips in use")

  public Integer getReservedIpsInUse() {
    return reservedIpsInUse;
  }


  public void setReservedIpsInUse(Integer reservedIpsInUse) {
    this.reservedIpsInUse = reservedIpsInUse;
  }


  public ResourceLimits k8sClusterLimitTotal(Integer k8sClusterLimitTotal) {
    
    this.k8sClusterLimitTotal = k8sClusterLimitTotal;
    return this;
  }

   /**
   * k8s clusters total limit
   * @return k8sClusterLimitTotal
  **/
  @ApiModelProperty(required = true, value = "k8s clusters total limit")

  public Integer getK8sClusterLimitTotal() {
    return k8sClusterLimitTotal;
  }


  public void setK8sClusterLimitTotal(Integer k8sClusterLimitTotal) {
    this.k8sClusterLimitTotal = k8sClusterLimitTotal;
  }


  public ResourceLimits k8sClustersProvisioned(Integer k8sClustersProvisioned) {
    
    this.k8sClustersProvisioned = k8sClustersProvisioned;
    return this;
  }

   /**
   * k8s clusters provisioned
   * @return k8sClustersProvisioned
  **/
  @ApiModelProperty(required = true, value = "k8s clusters provisioned")

  public Integer getK8sClustersProvisioned() {
    return k8sClustersProvisioned;
  }


  public void setK8sClustersProvisioned(Integer k8sClustersProvisioned) {
    this.k8sClustersProvisioned = k8sClustersProvisioned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceLimits resourceLimits = (ResourceLimits) o;
    return Objects.equals(this.coresPerServer, resourceLimits.coresPerServer) && Objects.equals(this.coresPerContract, resourceLimits.coresPerContract) && Objects.equals(this.coresProvisioned, resourceLimits.coresProvisioned) && Objects.equals(this.ramPerServer, resourceLimits.ramPerServer) && Objects.equals(this.ramPerContract, resourceLimits.ramPerContract) && Objects.equals(this.ramProvisioned, resourceLimits.ramProvisioned) && Objects.equals(this.hddLimitPerVolume, resourceLimits.hddLimitPerVolume) && Objects.equals(this.hddLimitPerContract, resourceLimits.hddLimitPerContract) && Objects.equals(this.hddVolumeProvisioned, resourceLimits.hddVolumeProvisioned) && Objects.equals(this.ssdLimitPerVolume, resourceLimits.ssdLimitPerVolume) && Objects.equals(this.ssdLimitPerContract, resourceLimits.ssdLimitPerContract) && Objects.equals(this.ssdVolumeProvisioned, resourceLimits.ssdVolumeProvisioned) && Objects.equals(this.reservableIps, resourceLimits.reservableIps) && Objects.equals(this.reservedIpsOnContract, resourceLimits.reservedIpsOnContract) && Objects.equals(this.reservedIpsInUse, resourceLimits.reservedIpsInUse) && Objects.equals(this.k8sClusterLimitTotal, resourceLimits.k8sClusterLimitTotal) && Objects.equals(this.k8sClustersProvisioned, resourceLimits.k8sClustersProvisioned);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLimits {\n");
    sb.append("    coresPerServer: ").append(toIndentedString(coresPerServer)).append("\n");
    sb.append("    coresPerContract: ").append(toIndentedString(coresPerContract)).append("\n");
    sb.append("    coresProvisioned: ").append(toIndentedString(coresProvisioned)).append("\n");
    sb.append("    ramPerServer: ").append(toIndentedString(ramPerServer)).append("\n");
    sb.append("    ramPerContract: ").append(toIndentedString(ramPerContract)).append("\n");
    sb.append("    ramProvisioned: ").append(toIndentedString(ramProvisioned)).append("\n");
    sb.append("    hddLimitPerVolume: ").append(toIndentedString(hddLimitPerVolume)).append("\n");
    sb.append("    hddLimitPerContract: ").append(toIndentedString(hddLimitPerContract)).append("\n");
    sb.append("    hddVolumeProvisioned: ").append(toIndentedString(hddVolumeProvisioned)).append("\n");
    sb.append("    ssdLimitPerVolume: ").append(toIndentedString(ssdLimitPerVolume)).append("\n");
    sb.append("    ssdLimitPerContract: ").append(toIndentedString(ssdLimitPerContract)).append("\n");
    sb.append("    ssdVolumeProvisioned: ").append(toIndentedString(ssdVolumeProvisioned)).append("\n");
    sb.append("    reservableIps: ").append(toIndentedString(reservableIps)).append("\n");
    sb.append("    reservedIpsOnContract: ").append(toIndentedString(reservedIpsOnContract)).append("\n");
    sb.append("    reservedIpsInUse: ").append(toIndentedString(reservedIpsInUse)).append("\n");
    sb.append("    k8sClusterLimitTotal: ").append(toIndentedString(k8sClusterLimitTotal)).append("\n");
    sb.append("    k8sClustersProvisioned: ").append(toIndentedString(k8sClustersProvisioned)).append("\n");
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

