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
 * LoadbalancerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-15T15:14:48.811Z[Etc/UTC]")

public class LoadbalancerProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_DHCP = "dhcp";
  @SerializedName(SERIALIZED_NAME_DHCP)
  private Boolean dhcp;


  public LoadbalancerProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name of that resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "A name of that resource")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LoadbalancerProperties ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 address of the loadbalancer. All attached NICs will inherit this IP. Leaving value null will assign IP automatically
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "IPv4 address of the loadbalancer. All attached NICs will inherit this IP. Leaving value null will assign IP automatically")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public LoadbalancerProperties dhcp(Boolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Indicates if the loadbalancer will reserve an IP using DHCP
   * @return dhcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the loadbalancer will reserve an IP using DHCP")

  public Boolean getDhcp() {
    return dhcp;
  }


  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadbalancerProperties loadbalancerProperties = (LoadbalancerProperties) o;
    return Objects.equals(this.name, loadbalancerProperties.name) && Objects.equals(this.ip, loadbalancerProperties.ip) && Objects.equals(this.dhcp, loadbalancerProperties.dhcp);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadbalancerProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
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

