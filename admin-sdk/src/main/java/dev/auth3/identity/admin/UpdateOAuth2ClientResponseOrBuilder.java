// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface UpdateOAuth2ClientResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.UpdateOAuth2ClientResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1[json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 1[json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string client_secret = 2[json_name = "clientSecret"];</code>
   * @return The clientSecret.
   */
  java.lang.String getClientSecret();
  /**
   * <code>string client_secret = 2[json_name = "clientSecret"];</code>
   * @return The bytes for clientSecret.
   */
  com.google.protobuf.ByteString
      getClientSecretBytes();
}
