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
import java.util.ArrayList;
import java.util.List;

/**
 * VolumeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-18T10:41:36.947Z[Etc/UTC]")

public class VolumeProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Hardware type of the volume.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN_VALUE("UNKNOWN_VALUE"),
    HDD("HDD"),
    
    SSD("SSD"),
    
    SSD_STANDARD("SSD Standard"),
    
    SSD_PREMIUM("SSD Premium");

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
      return TypeEnum.UNKNOWN_VALUE;
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

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  /**
   * The availability zone in which the volume should exist. The storage volume will be provisioned on as less physical storages as possible but cannot guarantee upfront
   */
  @JsonAdapter(AvailabilityZoneEnum.Adapter.class)
  public enum AvailabilityZoneEnum {
    UNKNOWN_VALUE("UNKNOWN_VALUE"),
    AUTO("AUTO"),
    
    ZONE_1("ZONE_1"),
    
    ZONE_2("ZONE_2"),
    
    ZONE_3("ZONE_3");

    private String value;

    AvailabilityZoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityZoneEnum fromValue(String value) {
      for (AvailabilityZoneEnum b : AvailabilityZoneEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      return AvailabilityZoneEnum.UNKNOWN_VALUE;
    }

    public static class Adapter extends TypeAdapter<AvailabilityZoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityZoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityZoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailabilityZoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "availabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private AvailabilityZoneEnum availabilityZone;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PASSWORD = "imagePassword";
  @SerializedName(SERIALIZED_NAME_IMAGE_PASSWORD)
  private String imagePassword;

  public static final String SERIALIZED_NAME_IMAGE_ALIAS = "imageAlias";
  @SerializedName(SERIALIZED_NAME_IMAGE_ALIAS)
  private String imageAlias;

  public static final String SERIALIZED_NAME_SSH_KEYS = "sshKeys";
  @SerializedName(SERIALIZED_NAME_SSH_KEYS)
  private List<String> sshKeys = null;

  /**
   * The bus type of the volume. Default is VIRTIO
   */
  @JsonAdapter(BusEnum.Adapter.class)
  public enum BusEnum {
    UNKNOWN_VALUE("UNKNOWN_VALUE"),
    VIRTIO("VIRTIO"),
    
    IDE("IDE");

    private String value;

    BusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BusEnum fromValue(String value) {
      for (BusEnum b : BusEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      return BusEnum.UNKNOWN_VALUE;
    }

    public static class Adapter extends TypeAdapter<BusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private BusEnum bus;

  /**
   * OS type of this volume
   */
  @JsonAdapter(LicenceTypeEnum.Adapter.class)
  public enum LicenceTypeEnum {
    UNKNOWN_VALUE("UNKNOWN_VALUE"),
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
      return LicenceTypeEnum.UNKNOWN_VALUE;
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

  public static final String SERIALIZED_NAME_CPU_HOT_PLUG = "cpuHotPlug";
  @SerializedName(SERIALIZED_NAME_CPU_HOT_PLUG)
  private Boolean cpuHotPlug;

  public static final String SERIALIZED_NAME_RAM_HOT_PLUG = "ramHotPlug";
  @SerializedName(SERIALIZED_NAME_RAM_HOT_PLUG)
  private Boolean ramHotPlug;

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

  public static final String SERIALIZED_NAME_DEVICE_NUMBER = "deviceNumber";
  @SerializedName(SERIALIZED_NAME_DEVICE_NUMBER)
  private Long deviceNumber;

  public static final String SERIALIZED_NAME_BACKUPUNIT_ID = "backupunitId";
  @SerializedName(SERIALIZED_NAME_BACKUPUNIT_ID)
  private String backupunitId;

  public static final String SERIALIZED_NAME_USER_DATA = "userData";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private String userData;


  public VolumeProperties name(String name) {
    
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


  public VolumeProperties type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Hardware type of the volume.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HDD", value = "Hardware type of the volume.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public VolumeProperties size(BigDecimal size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the volume in GB
   * @return size
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "The size of the volume in GB")

  public BigDecimal getSize() {
    return size;
  }


  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public VolumeProperties availabilityZone(AvailabilityZoneEnum availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * The availability zone in which the volume should exist. The storage volume will be provisioned on as less physical storages as possible but cannot guarantee upfront
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUTO", value = "The availability zone in which the volume should exist. The storage volume will be provisioned on as less physical storages as possible but cannot guarantee upfront")

  public AvailabilityZoneEnum getAvailabilityZone() {
    return availabilityZone;
  }


  public void setAvailabilityZone(AvailabilityZoneEnum availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public VolumeProperties image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Image or snapshot ID to be used as template for this volume
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d6ad1576-fde9-4696-aa41-1ebd75bdaf49", value = "Image or snapshot ID to be used as template for this volume")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public VolumeProperties imagePassword(String imagePassword) {
    
    this.imagePassword = imagePassword;
    return this;
  }

   /**
   * Initial password to be set for installed OS. Works with public images only. Not modifiable, forbidden in update requests. Password rules allows all characters from a-z, A-Z, 0-9
   * @return imagePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mypass123", value = "Initial password to be set for installed OS. Works with public images only. Not modifiable, forbidden in update requests. Password rules allows all characters from a-z, A-Z, 0-9")

  public String getImagePassword() {
    return imagePassword;
  }


  public void setImagePassword(String imagePassword) {
    this.imagePassword = imagePassword;
  }


  public VolumeProperties imageAlias(String imageAlias) {
    
    this.imageAlias = imageAlias;
    return this;
  }

   /**
   * Get imageAlias
   * @return imageAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageAlias() {
    return imageAlias;
  }


  public void setImageAlias(String imageAlias) {
    this.imageAlias = imageAlias;
  }


  public VolumeProperties sshKeys(List<String> sshKeys) {
    
    this.sshKeys = sshKeys;
    return this;
  }

  public VolumeProperties addSshKeysItem(String sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<String>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Public SSH keys are set on the image as authorized keys for appropriate SSH login to the instance using the corresponding private key. This field may only be set in creation requests. When reading, it always returns null. SSH keys are only supported if a public Linux image is used for the volume creation.
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCyWh6LZ7f2wxnupVgtK2096bc69Vv9uT2A58lwN3ol0A6mxqlT0f4M1NbarVUxa+MVdxBLud5PvlkbYc9mY91OyzLGZMfVWvhAYz/tJSsDtsgRUl0GFVv332zDWk0i+mAVy0N408OORm5XqV6zvIDaiB/jopyjemUp2rnP7pXU4+98ilZw6ef9DF9y4YZ64mchL5//rcrGm1Lff3pC75X/polGONHeG6m4Vs8eIu+0epJ4PJBxO+rwRYp1zMnn90UCk21KvTcYops2cte7ouXQwkGUq3vmXxnSdvuivK/4JNoFQBsaGV974hDmloS5LOvSJjKpXs8Ed437ln712345, ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCyWh6LZ7f2wxnupVgtK2096bc69Vv9uT2A58lwN3ol0A6mxqlT0f4M1NbarVUxa+MVdxBLud5PvlkbYc9mY91OyzLGZMfVWvhAYz/tJSsDtsgRUl0GFVv332zDWk0i+mAVy0N408OORm5XqV6zvIDaiB/jopyjemUp2rnP7pXU4+98ilZw6ef9DF9y4YZ64mchL5//rcrGm1Lff3pC75X/polGONHeG6m4Vs8eIu+0epJ4PJBxO+rwRYp1zMnn90UCk21KvTcYops2cte7ouXQwkGUq3vmXxnSdvuivK/asdfghjkjhyutry545tgvbn76e4rf43]", value = "Public SSH keys are set on the image as authorized keys for appropriate SSH login to the instance using the corresponding private key. This field may only be set in creation requests. When reading, it always returns null. SSH keys are only supported if a public Linux image is used for the volume creation.")

  public List<String> getSshKeys() {
    return sshKeys;
  }


  public void setSshKeys(List<String> sshKeys) {
    this.sshKeys = sshKeys;
  }


  public VolumeProperties bus(BusEnum bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * The bus type of the volume. Default is VIRTIO
   * @return bus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VIRTIO", value = "The bus type of the volume. Default is VIRTIO")

  public BusEnum getBus() {
    return bus;
  }


  public void setBus(BusEnum bus) {
    this.bus = bus;
  }


   /**
   * OS type of this volume
   * @return licenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LINUX", value = "OS type of this volume")

  public LicenceTypeEnum getLicenceType() {
    return licenceType;
  }


  public void setLicenceType(LicenceTypeEnum licenceType) {
    this.licenceType = licenceType;
  }


  public VolumeProperties cpuHotPlug(Boolean cpuHotPlug) {
    
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


  public VolumeProperties ramHotPlug(Boolean ramHotPlug) {
    
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


  public VolumeProperties nicHotPlug(Boolean nicHotPlug) {
    
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


  public VolumeProperties nicHotUnplug(Boolean nicHotUnplug) {
    
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


  public VolumeProperties discVirtioHotPlug(Boolean discVirtioHotPlug) {
    
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


  public VolumeProperties discVirtioHotUnplug(Boolean discVirtioHotUnplug) {
    
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


   /**
   * The LUN ID of the storage volume. Null for volumes not mounted to any VM
   * @return deviceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The LUN ID of the storage volume. Null for volumes not mounted to any VM")

  public Long getDeviceNumber() {
    return deviceNumber;
  }


  public void setDeviceNumber(Long deviceNumber) {
    this.deviceNumber = deviceNumber;
  }


  public VolumeProperties backupunitId(String backupunitId) {
    
    this.backupunitId = backupunitId;
    return this;
  }

   /**
   * The uuid of the Backup Unit that user has access to. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either &#39;public image&#39; or &#39;imageAlias&#39; in conjunction with this property.
   * @return backupunitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25f67991-0f51-4efc-a8ad-ef1fb31a481c", value = "The uuid of the Backup Unit that user has access to. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either 'public image' or 'imageAlias' in conjunction with this property.")

  public String getBackupunitId() {
    return backupunitId;
  }


  public void setBackupunitId(String backupunitId) {
    this.backupunitId = backupunitId;
  }


  public VolumeProperties userData(String userData) {
    
    this.userData = userData;
    return this;
  }

   /**
   * The cloud-init configuration for the volume as base64 encoded string. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either &#39;public image&#39; or &#39;imageAlias&#39; that has cloud-init compatibility in conjunction with this property.
   * @return userData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud-init configuration for the volume as base64 encoded string. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either 'public image' or 'imageAlias' that has cloud-init compatibility in conjunction with this property.")

  public String getUserData() {
    return userData;
  }


  public void setUserData(String userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeProperties volumeProperties = (VolumeProperties) o;
    return Objects.equals(this.name, volumeProperties.name) && Objects.equals(this.type, volumeProperties.type) && Objects.equals(this.size, volumeProperties.size) && Objects.equals(this.availabilityZone, volumeProperties.availabilityZone) && Objects.equals(this.image, volumeProperties.image) && Objects.equals(this.imagePassword, volumeProperties.imagePassword) && Objects.equals(this.imageAlias, volumeProperties.imageAlias) && Objects.equals(this.sshKeys, volumeProperties.sshKeys) && Objects.equals(this.bus, volumeProperties.bus) && Objects.equals(this.licenceType, volumeProperties.licenceType) && Objects.equals(this.cpuHotPlug, volumeProperties.cpuHotPlug) && Objects.equals(this.ramHotPlug, volumeProperties.ramHotPlug) && Objects.equals(this.nicHotPlug, volumeProperties.nicHotPlug) && Objects.equals(this.nicHotUnplug, volumeProperties.nicHotUnplug) && Objects.equals(this.discVirtioHotPlug, volumeProperties.discVirtioHotPlug) && Objects.equals(this.discVirtioHotUnplug, volumeProperties.discVirtioHotUnplug) && Objects.equals(this.deviceNumber, volumeProperties.deviceNumber) && Objects.equals(this.backupunitId, volumeProperties.backupunitId) && Objects.equals(this.userData, volumeProperties.userData);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePassword: ").append(toIndentedString(imagePassword)).append("\n");
    sb.append("    imageAlias: ").append(toIndentedString(imageAlias)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    licenceType: ").append(toIndentedString(licenceType)).append("\n");
    sb.append("    cpuHotPlug: ").append(toIndentedString(cpuHotPlug)).append("\n");
    sb.append("    ramHotPlug: ").append(toIndentedString(ramHotPlug)).append("\n");
    sb.append("    nicHotPlug: ").append(toIndentedString(nicHotPlug)).append("\n");
    sb.append("    nicHotUnplug: ").append(toIndentedString(nicHotUnplug)).append("\n");
    sb.append("    discVirtioHotPlug: ").append(toIndentedString(discVirtioHotPlug)).append("\n");
    sb.append("    discVirtioHotUnplug: ").append(toIndentedString(discVirtioHotUnplug)).append("\n");
    sb.append("    deviceNumber: ").append(toIndentedString(deviceNumber)).append("\n");
    sb.append("    backupunitId: ").append(toIndentedString(backupunitId)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

