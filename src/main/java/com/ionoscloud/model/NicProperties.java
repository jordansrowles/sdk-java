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
import java.util.ArrayList;
import java.util.List;

/**
 * NicProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-18T10:41:36.947Z[Etc/UTC]")

public class NicProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;

  public static final String SERIALIZED_NAME_DHCP = "dhcp";
  @SerializedName(SERIALIZED_NAME_DHCP)
  private Boolean dhcp;

  public static final String SERIALIZED_NAME_LAN = "lan";
  @SerializedName(SERIALIZED_NAME_LAN)
  private Integer lan;

  public static final String SERIALIZED_NAME_FIREWALL_ACTIVE = "firewallActive";
  @SerializedName(SERIALIZED_NAME_FIREWALL_ACTIVE)
  private Boolean firewallActive;

  public static final String SERIALIZED_NAME_NAT = "nat";
  @SerializedName(SERIALIZED_NAME_NAT)
  private Boolean nat;


  public NicProperties name(String name) {
    
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


   /**
   * The MAC address of the NIC
   * @return mac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:0a:95:9d:68:16", value = "The MAC address of the NIC")

  public String getMac() {
    return mac;
  }


  public void setMac(String mac) {
    this.mac = mac;
  }


  public NicProperties ips(List<String> ips) {
    
    this.ips = ips;
    return this;
  }

  public NicProperties addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<String>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Collection of IP addresses assigned to a nic. Explicitly assigned public IPs need to come from reserved IP blocks, Passing value null or empty array will assign an IP address automatically.
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of IP addresses assigned to a nic. Explicitly assigned public IPs need to come from reserved IP blocks, Passing value null or empty array will assign an IP address automatically.")

  public List<String> getIps() {
    return ips;
  }


  public void setIps(List<String> ips) {
    this.ips = ips;
  }


  public NicProperties dhcp(Boolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Indicates if the nic will reserve an IP using DHCP
   * @return dhcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the nic will reserve an IP using DHCP")

  public Boolean getDhcp() {
    return dhcp;
  }


  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }


  public NicProperties lan(Integer lan) {
    
    this.lan = lan;
    return this;
  }

   /**
   * The LAN ID the NIC will sit on. If the LAN ID does not exist it will be implicitly created
   * @return lan
  **/
  @ApiModelProperty(example = "2", required = true, value = "The LAN ID the NIC will sit on. If the LAN ID does not exist it will be implicitly created")

  public Integer getLan() {
    return lan;
  }


  public void setLan(Integer lan) {
    this.lan = lan;
  }


  public NicProperties firewallActive(Boolean firewallActive) {
    
    this.firewallActive = firewallActive;
    return this;
  }

   /**
   * Activate or deactivate the firewall. By default an active firewall without any defined rules will block all incoming network traffic except for the firewall rules that explicitly allows certain protocols, ip addresses and ports.
   * @return firewallActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Activate or deactivate the firewall. By default an active firewall without any defined rules will block all incoming network traffic except for the firewall rules that explicitly allows certain protocols, ip addresses and ports.")

  public Boolean getFirewallActive() {
    return firewallActive;
  }


  public void setFirewallActive(Boolean firewallActive) {
    this.firewallActive = firewallActive;
  }


  public NicProperties nat(Boolean nat) {
    
    this.nat = nat;
    return this;
  }

   /**
   * Indicates if NAT is enabled on this NIC. This is now deprecated.
   * @return nat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if NAT is enabled on this NIC. This is now deprecated.")

  public Boolean getNat() {
    return nat;
  }


  public void setNat(Boolean nat) {
    this.nat = nat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NicProperties nicProperties = (NicProperties) o;
    return Objects.equals(this.name, nicProperties.name) && Objects.equals(this.mac, nicProperties.mac) && Objects.equals(this.ips, nicProperties.ips) && Objects.equals(this.dhcp, nicProperties.dhcp) && Objects.equals(this.lan, nicProperties.lan) && Objects.equals(this.firewallActive, nicProperties.firewallActive) && Objects.equals(this.nat, nicProperties.nat);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NicProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
    sb.append("    lan: ").append(toIndentedString(lan)).append("\n");
    sb.append("    firewallActive: ").append(toIndentedString(firewallActive)).append("\n");
    sb.append("    nat: ").append(toIndentedString(nat)).append("\n");
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

