// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface GetIdentityByIdentifierRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.GetIdentityByIdentifierRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string attribute = 1[json_name = "attribute"];</code>
   * @return The attribute.
   */
  java.lang.String getAttribute();
  /**
   * <code>string attribute = 1[json_name = "attribute"];</code>
   * @return The bytes for attribute.
   */
  com.google.protobuf.ByteString
      getAttributeBytes();

  /**
   * <code>string value = 2[json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2[json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>string connection_id = 3[json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <code>string connection_id = 3[json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();
}
