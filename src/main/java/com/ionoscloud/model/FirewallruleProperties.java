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
 * FirewallruleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-28T09:07:45.117Z[Etc/UTC]")

public class FirewallruleProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The protocol for the rule. Property cannot be modified after creation (disallowed in update requests)
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    TCP("TCP"),
    
    UDP("UDP"),
    
    ICMP("ICMP"),
    
    ANY("ANY");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;

  /**
   * Only traffic originating from the respective MAC address is allowed. Valid format: aa:bb:cc:dd:ee:ff. Value null allows all source MAC address
   */
  @JsonAdapter(SourceMacEnum.Adapter.class)
  public enum SourceMacEnum {
    _VALID_MAC_ADDRESS_("@Valid MAC address@"),
    
    NULL("null");

    private String value;

    SourceMacEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceMacEnum fromValue(String value) {
      for (SourceMacEnum b : SourceMacEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceMacEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceMacEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceMacEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceMacEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_MAC = "sourceMac";
  @SerializedName(SERIALIZED_NAME_SOURCE_MAC)
  private SourceMacEnum sourceMac;

  /**
   * Only traffic originating from the respective IPv4 address is allowed. Value null allows all source IPs
   */
  @JsonAdapter(SourceIpEnum.Adapter.class)
  public enum SourceIpEnum {
    _VALID_IP_ADDRESS_("@Valid IP address@"),
    
    NULL("null");

    private String value;

    SourceIpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceIpEnum fromValue(String value) {
      for (SourceIpEnum b : SourceIpEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceIpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceIpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceIpEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceIpEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_IP = "sourceIp";
  @SerializedName(SERIALIZED_NAME_SOURCE_IP)
  private SourceIpEnum sourceIp;

  /**
   * In case the target NIC has multiple IP addresses, only traffic directed to the respective IP address of the NIC is allowed. Value null allows all target IPs
   */
  @JsonAdapter(TargetIpEnum.Adapter.class)
  public enum TargetIpEnum {
    _VALID_IP_ADDRESS_("@Valid IP address@"),
    
    NULL("null");

    private String value;

    TargetIpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetIpEnum fromValue(String value) {
      for (TargetIpEnum b : TargetIpEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetIpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetIpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetIpEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetIpEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET_IP = "targetIp";
  @SerializedName(SERIALIZED_NAME_TARGET_IP)
  private TargetIpEnum targetIp;

  public static final String SERIALIZED_NAME_ICMP_CODE = "icmpCode";
  @SerializedName(SERIALIZED_NAME_ICMP_CODE)
  private Integer icmpCode;

  public static final String SERIALIZED_NAME_ICMP_TYPE = "icmpType";
  @SerializedName(SERIALIZED_NAME_ICMP_TYPE)
  private Integer icmpType;

  public static final String SERIALIZED_NAME_PORT_RANGE_START = "portRangeStart";
  @SerializedName(SERIALIZED_NAME_PORT_RANGE_START)
  private Integer portRangeStart;

  public static final String SERIALIZED_NAME_PORT_RANGE_END = "portRangeEnd";
  @SerializedName(SERIALIZED_NAME_PORT_RANGE_END)
  private Integer portRangeEnd;


  public FirewallruleProperties name(String name) {
    
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


  public FirewallruleProperties protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * The protocol for the rule. Property cannot be modified after creation (disallowed in update requests)
   * @return protocol
  **/
  @ApiModelProperty(example = "TCP", required = true, value = "The protocol for the rule. Property cannot be modified after creation (disallowed in update requests)")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public FirewallruleProperties sourceMac(SourceMacEnum sourceMac) {
    
    this.sourceMac = sourceMac;
    return this;
  }

   /**
   * Only traffic originating from the respective MAC address is allowed. Valid format: aa:bb:cc:dd:ee:ff. Value null allows all source MAC address
   * @return sourceMac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:0a:95:9d:68:16", value = "Only traffic originating from the respective MAC address is allowed. Valid format: aa:bb:cc:dd:ee:ff. Value null allows all source MAC address")

  public SourceMacEnum getSourceMac() {
    return sourceMac;
  }


  public void setSourceMac(SourceMacEnum sourceMac) {
    this.sourceMac = sourceMac;
  }


  public FirewallruleProperties sourceIp(SourceIpEnum sourceIp) {
    
    this.sourceIp = sourceIp;
    return this;
  }

   /**
   * Only traffic originating from the respective IPv4 address is allowed. Value null allows all source IPs
   * @return sourceIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "Only traffic originating from the respective IPv4 address is allowed. Value null allows all source IPs")

  public SourceIpEnum getSourceIp() {
    return sourceIp;
  }


  public void setSourceIp(SourceIpEnum sourceIp) {
    this.sourceIp = sourceIp;
  }


  public FirewallruleProperties targetIp(TargetIpEnum targetIp) {
    
    this.targetIp = targetIp;
    return this;
  }

   /**
   * In case the target NIC has multiple IP addresses, only traffic directed to the respective IP address of the NIC is allowed. Value null allows all target IPs
   * @return targetIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "In case the target NIC has multiple IP addresses, only traffic directed to the respective IP address of the NIC is allowed. Value null allows all target IPs")

  public TargetIpEnum getTargetIp() {
    return targetIp;
  }


  public void setTargetIp(TargetIpEnum targetIp) {
    this.targetIp = targetIp;
  }


  public FirewallruleProperties icmpCode(Integer icmpCode) {
    
    this.icmpCode = icmpCode;
    return this;
  }

   /**
   * Defines the allowed code (from 0 to 254) if protocol ICMP is chosen. Value null allows all codes
   * minimum: 0
   * maximum: 254
   * @return icmpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Defines the allowed code (from 0 to 254) if protocol ICMP is chosen. Value null allows all codes")

  public Integer getIcmpCode() {
    return icmpCode;
  }


  public void setIcmpCode(Integer icmpCode) {
    this.icmpCode = icmpCode;
  }


  public FirewallruleProperties icmpType(Integer icmpType) {
    
    this.icmpType = icmpType;
    return this;
  }

   /**
   * Defines the allowed type (from 0 to 254) if the protocol ICMP is chosen. Value null allows all types
   * minimum: 0
   * maximum: 254
   * @return icmpType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Defines the allowed type (from 0 to 254) if the protocol ICMP is chosen. Value null allows all types")

  public Integer getIcmpType() {
    return icmpType;
  }


  public void setIcmpType(Integer icmpType) {
    this.icmpType = icmpType;
  }


  public FirewallruleProperties portRangeStart(Integer portRangeStart) {
    
    this.portRangeStart = portRangeStart;
    return this;
  }

   /**
   * Defines the start range of the allowed port (from 1 to 65534) if protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd value null to allow all ports
   * minimum: 1
   * maximum: 65534
   * @return portRangeStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Defines the start range of the allowed port (from 1 to 65534) if protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd value null to allow all ports")

  public Integer getPortRangeStart() {
    return portRangeStart;
  }


  public void setPortRangeStart(Integer portRangeStart) {
    this.portRangeStart = portRangeStart;
  }


  public FirewallruleProperties portRangeEnd(Integer portRangeEnd) {
    
    this.portRangeEnd = portRangeEnd;
    return this;
  }

   /**
   * Defines the end range of the allowed port (from 1 to 65534) if the protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd null to allow all ports
   * minimum: 1
   * maximum: 65534
   * @return portRangeEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Defines the end range of the allowed port (from 1 to 65534) if the protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd null to allow all ports")

  public Integer getPortRangeEnd() {
    return portRangeEnd;
  }


  public void setPortRangeEnd(Integer portRangeEnd) {
    this.portRangeEnd = portRangeEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallruleProperties firewallruleProperties = (FirewallruleProperties) o;
    return Objects.equals(this.name, firewallruleProperties.name) && Objects.equals(this.protocol, firewallruleProperties.protocol) && Objects.equals(this.sourceMac, firewallruleProperties.sourceMac) && Objects.equals(this.sourceIp, firewallruleProperties.sourceIp) && Objects.equals(this.targetIp, firewallruleProperties.targetIp) && Objects.equals(this.icmpCode, firewallruleProperties.icmpCode) && Objects.equals(this.icmpType, firewallruleProperties.icmpType) && Objects.equals(this.portRangeStart, firewallruleProperties.portRangeStart) && Objects.equals(this.portRangeEnd, firewallruleProperties.portRangeEnd);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallruleProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sourceMac: ").append(toIndentedString(sourceMac)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
    sb.append("    icmpCode: ").append(toIndentedString(icmpCode)).append("\n");
    sb.append("    icmpType: ").append(toIndentedString(icmpType)).append("\n");
    sb.append("    portRangeStart: ").append(toIndentedString(portRangeStart)).append("\n");
    sb.append("    portRangeEnd: ").append(toIndentedString(portRangeEnd)).append("\n");
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

