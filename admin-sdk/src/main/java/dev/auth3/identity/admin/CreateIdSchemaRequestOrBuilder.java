// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface CreateIdSchemaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.CreateIdSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1[json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1[json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Struct content = 2[json_name = "content"];</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>.google.protobuf.Struct content = 2[json_name = "content"];</code>
   * @return The content.
   */
  com.google.protobuf.Struct getContent();
  /**
   * <code>.google.protobuf.Struct content = 2[json_name = "content"];</code>
   */
  com.google.protobuf.StructOrBuilder getContentOrBuilder();
}
