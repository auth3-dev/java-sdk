// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface GetDefaultIdSchemaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.GetDefaultIdSchemaResponse)
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
   * <code>string name = 2[json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2[json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Struct content = 3[json_name = "content"];</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>.google.protobuf.Struct content = 3[json_name = "content"];</code>
   * @return The content.
   */
  com.google.protobuf.Struct getContent();
  /**
   * <code>.google.protobuf.Struct content = 3[json_name = "content"];</code>
   */
  com.google.protobuf.StructOrBuilder getContentOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp created_at = 4[json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 4[json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 4[json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 5[json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 5[json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 5[json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>bool is_default = 6[json_name = "isDefault"];</code>
   * @return The isDefault.
   */
  boolean getIsDefault();
}
