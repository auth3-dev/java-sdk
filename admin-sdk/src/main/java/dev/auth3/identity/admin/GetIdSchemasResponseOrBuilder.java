// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface GetIdSchemasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse.JsonSchema jsonschemas = 1[json_name = "jsonschemas"];</code>
   */
  java.util.List<dev.auth3.identity.admin.GetIdSchemasResponse.JsonSchema> 
      getJsonschemasList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse.JsonSchema jsonschemas = 1[json_name = "jsonschemas"];</code>
   */
  dev.auth3.identity.admin.GetIdSchemasResponse.JsonSchema getJsonschemas(int index);
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse.JsonSchema jsonschemas = 1[json_name = "jsonschemas"];</code>
   */
  int getJsonschemasCount();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse.JsonSchema jsonschemas = 1[json_name = "jsonschemas"];</code>
   */
  java.util.List<? extends dev.auth3.identity.admin.GetIdSchemasResponse.JsonSchemaOrBuilder> 
      getJsonschemasOrBuilderList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse.JsonSchema jsonschemas = 1[json_name = "jsonschemas"];</code>
   */
  dev.auth3.identity.admin.GetIdSchemasResponse.JsonSchemaOrBuilder getJsonschemasOrBuilder(
      int index);
}