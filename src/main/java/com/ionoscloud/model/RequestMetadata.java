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
import com.ionoscloud.model.RequestStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * RequestMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-16T08:23:53.274Z[Etc/UTC]")

public class RequestMetadata {
  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_REQUEST_STATUS = "requestStatus";
  @SerializedName(SERIALIZED_NAME_REQUEST_STATUS)
  private RequestStatus requestStatus;


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
   * The user who created the resource.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The user who created the resource.")

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * Resource&#39;s Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an &#39;ETag response header to requests which don&#39;t use &#39;depth&#39; parameter. 
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45480eb3fbfc31f1d916c1eaa4abdcc3", value = "Resource's Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an 'ETag response header to requests which don't use 'depth' parameter. ")

  public String getEtag() {
    return etag;
  }




  public RequestMetadata requestStatus(RequestStatus requestStatus) {
    
    this.requestStatus = requestStatus;
    return this;
  }

   /**
   * Get requestStatus
   * @return requestStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestStatus getRequestStatus() {
    return requestStatus;
  }


  public void setRequestStatus(RequestStatus requestStatus) {
    this.requestStatus = requestStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestMetadata requestMetadata = (RequestMetadata) o;
    return Objects.equals(this.createdDate, requestMetadata.createdDate) && Objects.equals(this.createdBy, requestMetadata.createdBy) && Objects.equals(this.etag, requestMetadata.etag) && Objects.equals(this.requestStatus, requestMetadata.requestStatus);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestMetadata {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    requestStatus: ").append(toIndentedString(requestStatus)).append("\n");
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

