// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface GetConnectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.GetConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetConnectionsResponse.Connection connections = 1[json_name = "connections"];</code>
   */
  java.util.List<dev.auth3.identity.admin.GetConnectionsResponse.Connection> 
      getConnectionsList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetConnectionsResponse.Connection connections = 1[json_name = "connections"];</code>
   */
  dev.auth3.identity.admin.GetConnectionsResponse.Connection getConnections(int index);
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetConnectionsResponse.Connection connections = 1[json_name = "connections"];</code>
   */
  int getConnectionsCount();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetConnectionsResponse.Connection connections = 1[json_name = "connections"];</code>
   */
  java.util.List<? extends dev.auth3.identity.admin.GetConnectionsResponse.ConnectionOrBuilder> 
      getConnectionsOrBuilderList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GetConnectionsResponse.Connection connections = 1[json_name = "connections"];</code>
   */
  dev.auth3.identity.admin.GetConnectionsResponse.ConnectionOrBuilder getConnectionsOrBuilder(
      int index);
}