// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface UpdateAddressRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.UpdateAddressRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1[json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1[json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>bool verified = 2[json_name = "verified"];</code>
   * @return The verified.
   */
  boolean getVerified();

  /**
   * <code>string address = 3[json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 3[json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  public dev.auth3.identity.admin.UpdateAddressRequest.AttributeCase getAttributeCase();
}
