// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface GetIdentityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.GetIdentityResponse)
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
   * <code>.google.protobuf.Timestamp created_at = 2[json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 2[json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 2[json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 3[json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 3[json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 3[json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>string main_identifier = 4[json_name = "mainIdentifier"];</code>
   * @return The mainIdentifier.
   */
  java.lang.String getMainIdentifier();
  /**
   * <code>string main_identifier = 4[json_name = "mainIdentifier"];</code>
   * @return The bytes for mainIdentifier.
   */
  com.google.protobuf.ByteString
      getMainIdentifierBytes();

  /**
   * <code>string profile_id = 5[json_name = "profileId"];</code>
   * @return The profileId.
   */
  java.lang.String getProfileId();
  /**
   * <code>string profile_id = 5[json_name = "profileId"];</code>
   * @return The bytes for profileId.
   */
  com.google.protobuf.ByteString
      getProfileIdBytes();

  /**
   * <code>repeated string addresses_ids = 6[json_name = "addressesIds"];</code>
   * @return A list containing the addressesIds.
   */
  java.util.List<java.lang.String>
      getAddressesIdsList();
  /**
   * <code>repeated string addresses_ids = 6[json_name = "addressesIds"];</code>
   * @return The count of addressesIds.
   */
  int getAddressesIdsCount();
  /**
   * <code>repeated string addresses_ids = 6[json_name = "addressesIds"];</code>
   * @param index The index of the element to return.
   * @return The addressesIds at the given index.
   */
  java.lang.String getAddressesIds(int index);
  /**
   * <code>repeated string addresses_ids = 6[json_name = "addressesIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addressesIds at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesIdsBytes(int index);

  /**
   * <code>map&lt;string, string&gt; credentials_ids = 7[json_name = "credentialsIds"];</code>
   */
  int getCredentialsIdsCount();
  /**
   * <code>map&lt;string, string&gt; credentials_ids = 7[json_name = "credentialsIds"];</code>
   */
  boolean containsCredentialsIds(
      java.lang.String key);
  /**
   * Use {@link #getCredentialsIdsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCredentialsIds();
  /**
   * <code>map&lt;string, string&gt; credentials_ids = 7[json_name = "credentialsIds"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCredentialsIdsMap();
  /**
   * <code>map&lt;string, string&gt; credentials_ids = 7[json_name = "credentialsIds"];</code>
   */

  java.lang.String getCredentialsIdsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; credentials_ids = 7[json_name = "credentialsIds"];</code>
   */

  java.lang.String getCredentialsIdsOrThrow(
      java.lang.String key);

  /**
   * <code>string schema_id = 8[json_name = "schemaId"];</code>
   * @return The schemaId.
   */
  java.lang.String getSchemaId();
  /**
   * <code>string schema_id = 8[json_name = "schemaId"];</code>
   * @return The bytes for schemaId.
   */
  com.google.protobuf.ByteString
      getSchemaIdBytes();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetIdentityResponse.Lock lock = 9[json_name = "lock"];</code>
   * @return The enum numeric value on the wire for lock.
   */
  int getLockValue();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.GetIdentityResponse.Lock lock = 9[json_name = "lock"];</code>
   * @return The lock.
   */
  dev.auth3.identity.admin.GetIdentityResponse.Lock getLock();
}
