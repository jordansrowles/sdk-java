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
import java.math.BigDecimal;

/**
 * ImageProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-24T12:36:57.961Z[Etc/UTC]")

public class ImageProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_CPU_HOT_PLUG = "cpuHotPlug";
  @SerializedName(SERIALIZED_NAME_CPU_HOT_PLUG)
  private Boolean cpuHotPlug;

  public static final String SERIALIZED_NAME_CPU_HOT_UNPLUG = "cpuHotUnplug";
  @SerializedName(SERIALIZED_NAME_CPU_HOT_UNPLUG)
  private Boolean cpuHotUnplug;

  public static final String SERIALIZED_NAME_RAM_HOT_PLUG = "ramHotPlug";
  @SerializedName(SERIALIZED_NAME_RAM_HOT_PLUG)
  private Boolean ramHotPlug;

  public static final String SERIALIZED_NAME_RAM_HOT_UNPLUG = "ramHotUnplug";
  @SerializedName(SERIALIZED_NAME_RAM_HOT_UNPLUG)
  private Boolean ramHotUnplug;

  public static final String SERIALIZED_NAME_NIC_HOT_PLUG = "nicHotPlug";
  @SerializedName(SERIALIZED_NAME_NIC_HOT_PLUG)
  private Boolean nicHotPlug;

  public static final String SERIALIZED_NAME_NIC_HOT_UNPLUG = "nicHotUnplug";
  @SerializedName(SERIALIZED_NAME_NIC_HOT_UNPLUG)
  private Boolean nicHotUnplug;

  public static final String SERIALIZED_NAME_DISC_VIRTIO_HOT_PLUG = "discVirtioHotPlug";
  @SerializedName(SERIALIZED_NAME_DISC_VIRTIO_HOT_PLUG)
  private Boolean discVirtioHotPlug;

  public static final String SERIALIZED_NAME_DISC_VIRTIO_HOT_UNPLUG = "discVirtioHotUnplug";
  @SerializedName(SERIALIZED_NAME_DISC_VIRTIO_HOT_UNPLUG)
  private Boolean discVirtioHotUnplug;

  public static final String SERIALIZED_NAME_DISC_SCSI_HOT_PLUG = "discScsiHotPlug";
  @SerializedName(SERIALIZED_NAME_DISC_SCSI_HOT_PLUG)
  private Boolean discScsiHotPlug;

  public static final String SERIALIZED_NAME_DISC_SCSI_HOT_UNPLUG = "discScsiHotUnplug";
  @SerializedName(SERIALIZED_NAME_DISC_SCSI_HOT_UNPLUG)
  private Boolean discScsiHotUnplug;

  /**
   * OS type of this Image
   */
  @JsonAdapter(LicenceTypeEnum.Adapter.class)
  public enum LicenceTypeEnum {
    UNKNOWN("UNKNOWN"),
    
    WINDOWS("WINDOWS"),
    
    WINDOWS2016("WINDOWS2016"),
    
    LINUX("LINUX"),
    
    OTHER("OTHER");

    private String value;

    LicenceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LicenceTypeEnum fromValue(String value) {
      for (LicenceTypeEnum b : LicenceTypeEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LicenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LicenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LicenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LicenceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LICENCE_TYPE = "licenceType";
  @SerializedName(SERIALIZED_NAME_LICENCE_TYPE)
  private LicenceTypeEnum licenceType;

  /**
   * This indicates the type of image
   */
  @JsonAdapter(ImageTypeEnum.Adapter.class)
  public enum ImageTypeEnum {
    HDD("HDD"),
    
    CDROM("CDROM");

    private String value;

    ImageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageTypeEnum fromValue(String value) {
      for (ImageTypeEnum b : ImageTypeEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private ImageTypeEnum imageType;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;


  public ImageProperties name(String name) {
    
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


  public ImageProperties description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Human readable description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Image/Snapshot of Ubuntu ", value = "Human readable description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Location of that image/snapshot. 
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "us/las", value = "Location of that image/snapshot. ")

  public String getLocation() {
    return location;
  }




   /**
   * The size of the image in GB
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.0", value = "The size of the image in GB")

  public BigDecimal getSize() {
    return size;
  }




  public ImageProperties cpuHotPlug(Boolean cpuHotPlug) {
    
    this.cpuHotPlug = cpuHotPlug;
    return this;
  }

   /**
   * Is capable of CPU hot plug (no reboot required)
   * @return cpuHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of CPU hot plug (no reboot required)")

  public Boolean getCpuHotPlug() {
    return cpuHotPlug;
  }


  public void setCpuHotPlug(Boolean cpuHotPlug) {
    this.cpuHotPlug = cpuHotPlug;
  }


  public ImageProperties cpuHotUnplug(Boolean cpuHotUnplug) {
    
    this.cpuHotUnplug = cpuHotUnplug;
    return this;
  }

   /**
   * Is capable of CPU hot unplug (no reboot required)
   * @return cpuHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of CPU hot unplug (no reboot required)")

  public Boolean getCpuHotUnplug() {
    return cpuHotUnplug;
  }


  public void setCpuHotUnplug(Boolean cpuHotUnplug) {
    this.cpuHotUnplug = cpuHotUnplug;
  }


  public ImageProperties ramHotPlug(Boolean ramHotPlug) {
    
    this.ramHotPlug = ramHotPlug;
    return this;
  }

   /**
   * Is capable of memory hot plug (no reboot required)
   * @return ramHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of memory hot plug (no reboot required)")

  public Boolean getRamHotPlug() {
    return ramHotPlug;
  }


  public void setRamHotPlug(Boolean ramHotPlug) {
    this.ramHotPlug = ramHotPlug;
  }


  public ImageProperties ramHotUnplug(Boolean ramHotUnplug) {
    
    this.ramHotUnplug = ramHotUnplug;
    return this;
  }

   /**
   * Is capable of memory hot unplug (no reboot required)
   * @return ramHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of memory hot unplug (no reboot required)")

  public Boolean getRamHotUnplug() {
    return ramHotUnplug;
  }


  public void setRamHotUnplug(Boolean ramHotUnplug) {
    this.ramHotUnplug = ramHotUnplug;
  }


  public ImageProperties nicHotPlug(Boolean nicHotPlug) {
    
    this.nicHotPlug = nicHotPlug;
    return this;
  }

   /**
   * Is capable of nic hot plug (no reboot required)
   * @return nicHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of nic hot plug (no reboot required)")

  public Boolean getNicHotPlug() {
    return nicHotPlug;
  }


  public void setNicHotPlug(Boolean nicHotPlug) {
    this.nicHotPlug = nicHotPlug;
  }


  public ImageProperties nicHotUnplug(Boolean nicHotUnplug) {
    
    this.nicHotUnplug = nicHotUnplug;
    return this;
  }

   /**
   * Is capable of nic hot unplug (no reboot required)
   * @return nicHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of nic hot unplug (no reboot required)")

  public Boolean getNicHotUnplug() {
    return nicHotUnplug;
  }


  public void setNicHotUnplug(Boolean nicHotUnplug) {
    this.nicHotUnplug = nicHotUnplug;
  }


  public ImageProperties discVirtioHotPlug(Boolean discVirtioHotPlug) {
    
    this.discVirtioHotPlug = discVirtioHotPlug;
    return this;
  }

   /**
   * Is capable of Virt-IO drive hot plug (no reboot required)
   * @return discVirtioHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of Virt-IO drive hot plug (no reboot required)")

  public Boolean getDiscVirtioHotPlug() {
    return discVirtioHotPlug;
  }


  public void setDiscVirtioHotPlug(Boolean discVirtioHotPlug) {
    this.discVirtioHotPlug = discVirtioHotPlug;
  }


  public ImageProperties discVirtioHotUnplug(Boolean discVirtioHotUnplug) {
    
    this.discVirtioHotUnplug = discVirtioHotUnplug;
    return this;
  }

   /**
   * Is capable of Virt-IO drive hot unplug (no reboot required). This works only for non-Windows virtual Machines.
   * @return discVirtioHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of Virt-IO drive hot unplug (no reboot required). This works only for non-Windows virtual Machines.")

  public Boolean getDiscVirtioHotUnplug() {
    return discVirtioHotUnplug;
  }


  public void setDiscVirtioHotUnplug(Boolean discVirtioHotUnplug) {
    this.discVirtioHotUnplug = discVirtioHotUnplug;
  }


  public ImageProperties discScsiHotPlug(Boolean discScsiHotPlug) {
    
    this.discScsiHotPlug = discScsiHotPlug;
    return this;
  }

   /**
   * Is capable of SCSI drive hot plug (no reboot required)
   * @return discScsiHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of SCSI drive hot plug (no reboot required)")

  public Boolean getDiscScsiHotPlug() {
    return discScsiHotPlug;
  }


  public void setDiscScsiHotPlug(Boolean discScsiHotPlug) {
    this.discScsiHotPlug = discScsiHotPlug;
  }


  public ImageProperties discScsiHotUnplug(Boolean discScsiHotUnplug) {
    
    this.discScsiHotUnplug = discScsiHotUnplug;
    return this;
  }

   /**
   * Is capable of SCSI drive hot unplug (no reboot required). This works only for non-Windows virtual Machines.
   * @return discScsiHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is capable of SCSI drive hot unplug (no reboot required). This works only for non-Windows virtual Machines.")

  public Boolean getDiscScsiHotUnplug() {
    return discScsiHotUnplug;
  }


  public void setDiscScsiHotUnplug(Boolean discScsiHotUnplug) {
    this.discScsiHotUnplug = discScsiHotUnplug;
  }


  public ImageProperties licenceType(LicenceTypeEnum licenceType) {
    
    this.licenceType = licenceType;
    return this;
  }

   /**
   * OS type of this Image
   * @return licenceType
  **/
  @ApiModelProperty(example = "LINUX", required = true, value = "OS type of this Image")

  public LicenceTypeEnum getLicenceType() {
    return licenceType;
  }


  public void setLicenceType(LicenceTypeEnum licenceType) {
    this.licenceType = licenceType;
  }


   /**
   * This indicates the type of image
   * @return imageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HDD", value = "This indicates the type of image")

  public ImageTypeEnum getImageType() {
    return imageType;
  }




   /**
   * Indicates if the image is part of the public repository or not
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the image is part of the public repository or not")

  public Boolean getPublic() {
    return _public;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageProperties imageProperties = (ImageProperties) o;
    return Objects.equals(this.name, imageProperties.name) && Objects.equals(this.description, imageProperties.description) && Objects.equals(this.location, imageProperties.location) && Objects.equals(this.size, imageProperties.size) && Objects.equals(this.cpuHotPlug, imageProperties.cpuHotPlug) && Objects.equals(this.cpuHotUnplug, imageProperties.cpuHotUnplug) && Objects.equals(this.ramHotPlug, imageProperties.ramHotPlug) && Objects.equals(this.ramHotUnplug, imageProperties.ramHotUnplug) && Objects.equals(this.nicHotPlug, imageProperties.nicHotPlug) && Objects.equals(this.nicHotUnplug, imageProperties.nicHotUnplug) && Objects.equals(this.discVirtioHotPlug, imageProperties.discVirtioHotPlug) && Objects.equals(this.discVirtioHotUnplug, imageProperties.discVirtioHotUnplug) && Objects.equals(this.discScsiHotPlug, imageProperties.discScsiHotPlug) && Objects.equals(this.discScsiHotUnplug, imageProperties.discScsiHotUnplug) && Objects.equals(this.licenceType, imageProperties.licenceType) && Objects.equals(this.imageType, imageProperties.imageType) && Objects.equals(this._public, imageProperties._public);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    cpuHotPlug: ").append(toIndentedString(cpuHotPlug)).append("\n");
    sb.append("    cpuHotUnplug: ").append(toIndentedString(cpuHotUnplug)).append("\n");
    sb.append("    ramHotPlug: ").append(toIndentedString(ramHotPlug)).append("\n");
    sb.append("    ramHotUnplug: ").append(toIndentedString(ramHotUnplug)).append("\n");
    sb.append("    nicHotPlug: ").append(toIndentedString(nicHotPlug)).append("\n");
    sb.append("    nicHotUnplug: ").append(toIndentedString(nicHotUnplug)).append("\n");
    sb.append("    discVirtioHotPlug: ").append(toIndentedString(discVirtioHotPlug)).append("\n");
    sb.append("    discVirtioHotUnplug: ").append(toIndentedString(discVirtioHotUnplug)).append("\n");
    sb.append("    discScsiHotPlug: ").append(toIndentedString(discScsiHotPlug)).append("\n");
    sb.append("    discScsiHotUnplug: ").append(toIndentedString(discScsiHotUnplug)).append("\n");
    sb.append("    licenceType: ").append(toIndentedString(licenceType)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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

