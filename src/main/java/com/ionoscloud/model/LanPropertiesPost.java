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
import com.ionoscloud.model.IPFailover;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LanPropertiesPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-18T10:41:36.947Z[Etc/UTC]")

public class LanPropertiesPost {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IP_FAILOVER = "ipFailover";
  @SerializedName(SERIALIZED_NAME_IP_FAILOVER)
  private List<IPFailover> ipFailover = null;

  public static final String SERIALIZED_NAME_PCC = "pcc";
  @SerializedName(SERIALIZED_NAME_PCC)
  private String pcc;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;


  public LanPropertiesPost name(String name) {
    
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


  public LanPropertiesPost ipFailover(List<IPFailover> ipFailover) {
    
    this.ipFailover = ipFailover;
    return this;
  }

  public LanPropertiesPost addIpFailoverItem(IPFailover ipFailoverItem) {
    if (this.ipFailover == null) {
      this.ipFailover = new ArrayList<IPFailover>();
    }
    this.ipFailover.add(ipFailoverItem);
    return this;
  }

   /**
   * IP failover configurations for lan
   * @return ipFailover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP failover configurations for lan")

  public List<IPFailover> getIpFailover() {
    return ipFailover;
  }


  public void setIpFailover(List<IPFailover> ipFailover) {
    this.ipFailover = ipFailover;
  }


  public LanPropertiesPost pcc(String pcc) {
    
    this.pcc = pcc;
    return this;
  }

   /**
   * Unique identifier of the private cross connect the given LAN is connected to if any
   * @return pcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3c11273c-b3e1-4ca3-8134-84fd2dd4ebec", value = "Unique identifier of the private cross connect the given LAN is connected to if any")

  public String getPcc() {
    return pcc;
  }


  public void setPcc(String pcc) {
    this.pcc = pcc;
  }


  public LanPropertiesPost _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Does this LAN faces the public Internet or not
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Does this LAN faces the public Internet or not")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanPropertiesPost lanPropertiesPost = (LanPropertiesPost) o;
    return Objects.equals(this.name, lanPropertiesPost.name) && Objects.equals(this.ipFailover, lanPropertiesPost.ipFailover) && Objects.equals(this.pcc, lanPropertiesPost.pcc) && Objects.equals(this._public, lanPropertiesPost._public);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanPropertiesPost {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ipFailover: ").append(toIndentedString(ipFailover)).append("\n");
    sb.append("    pcc: ").append(toIndentedString(pcc)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

