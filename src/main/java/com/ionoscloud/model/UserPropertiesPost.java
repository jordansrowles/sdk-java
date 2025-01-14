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
 * UserPropertiesPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-18T10:41:36.947Z[Etc/UTC]")

public class UserPropertiesPost {
  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ADMINISTRATOR = "administrator";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATOR)
  private Boolean administrator;

  public static final String SERIALIZED_NAME_FORCE_SEC_AUTH = "forceSecAuth";
  @SerializedName(SERIALIZED_NAME_FORCE_SEC_AUTH)
  private Boolean forceSecAuth;

  public static final String SERIALIZED_NAME_SEC_AUTH_ACTIVE = "secAuthActive";
  @SerializedName(SERIALIZED_NAME_SEC_AUTH_ACTIVE)
  private Boolean secAuthActive;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;


  public UserPropertiesPost firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * first name of the user
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "first name of the user")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public UserPropertiesPost lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * last name of the user
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "last name of the user")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public UserPropertiesPost email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * email address of the user
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "email address of the user")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserPropertiesPost administrator(Boolean administrator) {
    
    this.administrator = administrator;
    return this;
  }

   /**
   * indicates if the user has admin rights or not
   * @return administrator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "indicates if the user has admin rights or not")

  public Boolean getAdministrator() {
    return administrator;
  }


  public void setAdministrator(Boolean administrator) {
    this.administrator = administrator;
  }


  public UserPropertiesPost forceSecAuth(Boolean forceSecAuth) {
    
    this.forceSecAuth = forceSecAuth;
    return this;
  }

   /**
   * indicates if secure authentication should be forced on the user or not
   * @return forceSecAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "indicates if secure authentication should be forced on the user or not")

  public Boolean getForceSecAuth() {
    return forceSecAuth;
  }


  public void setForceSecAuth(Boolean forceSecAuth) {
    this.forceSecAuth = forceSecAuth;
  }


  public UserPropertiesPost secAuthActive(Boolean secAuthActive) {
    
    this.secAuthActive = secAuthActive;
    return this;
  }

   /**
   * indicates if secure authentication is active for the user or not
   * @return secAuthActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "indicates if secure authentication is active for the user or not")

  public Boolean getSecAuthActive() {
    return secAuthActive;
  }


  public void setSecAuthActive(Boolean secAuthActive) {
    this.secAuthActive = secAuthActive;
  }


  public UserPropertiesPost password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * User password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UserPropertiesPost active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * indicates if the user is active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "indicates if the user is active")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPropertiesPost userPropertiesPost = (UserPropertiesPost) o;
    return Objects.equals(this.firstname, userPropertiesPost.firstname) && Objects.equals(this.lastname, userPropertiesPost.lastname) && Objects.equals(this.email, userPropertiesPost.email) && Objects.equals(this.administrator, userPropertiesPost.administrator) && Objects.equals(this.forceSecAuth, userPropertiesPost.forceSecAuth) && Objects.equals(this.secAuthActive, userPropertiesPost.secAuthActive) && Objects.equals(this.password, userPropertiesPost.password) && Objects.equals(this.active, userPropertiesPost.active);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPropertiesPost {\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    administrator: ").append(toIndentedString(administrator)).append("\n");
    sb.append("    forceSecAuth: ").append(toIndentedString(forceSecAuth)).append("\n");
    sb.append("    secAuthActive: ").append(toIndentedString(secAuthActive)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

