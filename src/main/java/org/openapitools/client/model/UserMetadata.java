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
 * UserMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-19T13:36:53.491818+02:00[Europe/Bucharest]")
public class UserMetadata {
  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "lastLogin";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;


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
   * time of creation of the user
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "time of creation of the user")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




   /**
   * time of last login by the user
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "time of last login by the user")

  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMetadata userMetadata = (UserMetadata) o;
    return Objects.equals(this.etag, userMetadata.etag) &&
        Objects.equals(this.createdDate, userMetadata.createdDate) &&
        Objects.equals(this.lastLogin, userMetadata.lastLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, createdDate, lastLogin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMetadata {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
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

