// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface UpdateIdentityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.UpdateIdentityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string identity_id = 1[json_name = "identityId"];</code>
   * @return The identityId.
   */
  java.lang.String getIdentityId();
  /**
   * <code>string identity_id = 1[json_name = "identityId"];</code>
   * @return The bytes for identityId.
   */
  com.google.protobuf.ByteString
      getIdentityIdBytes();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.UpdateIdentityRequest.Lock lock = 2[json_name = "lock"];</code>
   * @return The enum numeric value on the wire for lock.
   */
  int getLockValue();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.UpdateIdentityRequest.Lock lock = 2[json_name = "lock"];</code>
   * @return The lock.
   */
  dev.auth3.identity.admin.UpdateIdentityRequest.Lock getLock();
}
