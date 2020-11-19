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


package org.openapitools.client.model;

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
import org.threeten.bp.OffsetDateTime;

/**
 * KubernetesNodeMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-19T13:06:24.019174+02:00[Europe/Bucharest]")
public class KubernetesNodeMetadata {
  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;

  /**
   * State of the resource.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PROVISIONING("PROVISIONING"),
    
    PROVISIONED("PROVISIONED"),
    
    READY("READY"),
    
    TERMINATING("TERMINATING"),
    
    REBUILDING("REBUILDING"),
    
    BUSY("BUSY");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_LAST_SOFTWARE_UPDATED_DATE = "lastSoftwareUpdatedDate";
  @SerializedName(SERIALIZED_NAME_LAST_SOFTWARE_UPDATED_DATE)
  private OffsetDateTime lastSoftwareUpdatedDate;


   /**
   * Resource&#39;s Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an &#39;ETag response header to requests which don&#39;t use &#39;depth&#39; parameter. 
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45480eb3fbfc31f1d916c1eaa4abdcc3", value = "Resource's Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an 'ETag response header to requests which don't use 'depth' parameter. ")

  public String getEtag() {
    return etag;
  }




   /**
   * The last time the resource was created
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "The last time the resource was created")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




   /**
   * The last time the resource has been modified
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "The last time the resource has been modified")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }




   /**
   * State of the resource.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AVAILABLE", value = "State of the resource.")

  public StateEnum getState() {
    return state;
  }




   /**
   * The last time the software updated on node.
   * @return lastSoftwareUpdatedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "The last time the software updated on node.")

  public OffsetDateTime getLastSoftwareUpdatedDate() {
    return lastSoftwareUpdatedDate;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesNodeMetadata kubernetesNodeMetadata = (KubernetesNodeMetadata) o;
    return Objects.equals(this.etag, kubernetesNodeMetadata.etag) &&
        Objects.equals(this.createdDate, kubernetesNodeMetadata.createdDate) &&
        Objects.equals(this.lastModifiedDate, kubernetesNodeMetadata.lastModifiedDate) &&
        Objects.equals(this.state, kubernetesNodeMetadata.state) &&
        Objects.equals(this.lastSoftwareUpdatedDate, kubernetesNodeMetadata.lastSoftwareUpdatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, createdDate, lastModifiedDate, state, lastSoftwareUpdatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesNodeMetadata {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lastSoftwareUpdatedDate: ").append(toIndentedString(lastSoftwareUpdatedDate)).append("\n");
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

