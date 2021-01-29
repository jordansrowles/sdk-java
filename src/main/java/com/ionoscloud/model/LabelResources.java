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
import com.ionoscloud.model.LabelResource;
import com.ionoscloud.model.PaginationLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * LabelResources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-29T11:40:35.062Z[Etc/UTC]")

public class LabelResources {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of resource within a collection
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LABEL("label");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<LabelResource> items = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private BigDecimal offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;


   /**
   * Unique representation for Label as a collection on a resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "labels", value = "Unique representation for Label as a collection on a resource.")

  public String getId() {
    return id;
  }




   /**
   * The type of resource within a collection
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "collection", value = "The type of resource within a collection")

  public TypeEnum getType() {
    return type;
  }




   /**
   * URL to the collection representation (absolute path)
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<RESOURCE-URI>", value = "URL to the collection representation (absolute path)")

  public URI getHref() {
    return href;
  }




   /**
   * Array of items in that collection
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of items in that collection")

  public List<LabelResource> getItems() {
    return items;
  }




  public LabelResources offset(BigDecimal offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * the offset (if specified in the request)
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "the offset (if specified in the request)")

  public BigDecimal getOffset() {
    return offset;
  }


  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }


  public LabelResources limit(BigDecimal limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * the limit (if specified in the request)
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "the limit (if specified in the request)")

  public BigDecimal getLimit() {
    return limit;
  }


  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  public LabelResources links(PaginationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationLinks getLinks() {
    return links;
  }


  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelResources labelResources = (LabelResources) o;
    return Objects.equals(this.id, labelResources.id) && Objects.equals(this.type, labelResources.type) && Objects.equals(this.href, labelResources.href) && Objects.equals(this.items, labelResources.items) && Objects.equals(this.offset, labelResources.offset) && Objects.equals(this.limit, labelResources.limit) && Objects.equals(this.links, labelResources.links);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelResources {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

