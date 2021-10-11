// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

public interface UpdateOAuth2ClientRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:depot.devtools.auth.v0.identity.admin.UpdateOAuth2ClientRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string allowed_cors_origins = 1[json_name = "allowedCorsOrigins"];</code>
   * @return A list containing the allowedCorsOrigins.
   */
  java.util.List<java.lang.String>
      getAllowedCorsOriginsList();
  /**
   * <code>repeated string allowed_cors_origins = 1[json_name = "allowedCorsOrigins"];</code>
   * @return The count of allowedCorsOrigins.
   */
  int getAllowedCorsOriginsCount();
  /**
   * <code>repeated string allowed_cors_origins = 1[json_name = "allowedCorsOrigins"];</code>
   * @param index The index of the element to return.
   * @return The allowedCorsOrigins at the given index.
   */
  java.lang.String getAllowedCorsOrigins(int index);
  /**
   * <code>repeated string allowed_cors_origins = 1[json_name = "allowedCorsOrigins"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedCorsOrigins at the given index.
   */
  com.google.protobuf.ByteString
      getAllowedCorsOriginsBytes(int index);

  /**
   * <code>repeated string audience = 2[json_name = "audience"];</code>
   * @return A list containing the audience.
   */
  java.util.List<java.lang.String>
      getAudienceList();
  /**
   * <code>repeated string audience = 2[json_name = "audience"];</code>
   * @return The count of audience.
   */
  int getAudienceCount();
  /**
   * <code>repeated string audience = 2[json_name = "audience"];</code>
   * @param index The index of the element to return.
   * @return The audience at the given index.
   */
  java.lang.String getAudience(int index);
  /**
   * <code>repeated string audience = 2[json_name = "audience"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the audience at the given index.
   */
  com.google.protobuf.ByteString
      getAudienceBytes(int index);

  /**
   * <code>bool backchannel_logout_session_required = 3[json_name = "backchannelLogoutSessionRequired"];</code>
   * @return The backchannelLogoutSessionRequired.
   */
  boolean getBackchannelLogoutSessionRequired();

  /**
   * <code>string backchannel_logout_uri = 4[json_name = "backchannelLogoutUri"];</code>
   * @return The backchannelLogoutUri.
   */
  java.lang.String getBackchannelLogoutUri();
  /**
   * <code>string backchannel_logout_uri = 4[json_name = "backchannelLogoutUri"];</code>
   * @return The bytes for backchannelLogoutUri.
   */
  com.google.protobuf.ByteString
      getBackchannelLogoutUriBytes();

  /**
   * <code>string client_name = 6[json_name = "clientName"];</code>
   * @return The clientName.
   */
  java.lang.String getClientName();
  /**
   * <code>string client_name = 6[json_name = "clientName"];</code>
   * @return The bytes for clientName.
   */
  com.google.protobuf.ByteString
      getClientNameBytes();

  /**
   * <code>string client_uri = 8[json_name = "clientUri"];</code>
   * @return The clientUri.
   */
  java.lang.String getClientUri();
  /**
   * <code>string client_uri = 8[json_name = "clientUri"];</code>
   * @return The bytes for clientUri.
   */
  com.google.protobuf.ByteString
      getClientUriBytes();

  /**
   * <code>repeated string contacts = 9[json_name = "contacts"];</code>
   * @return A list containing the contacts.
   */
  java.util.List<java.lang.String>
      getContactsList();
  /**
   * <code>repeated string contacts = 9[json_name = "contacts"];</code>
   * @return The count of contacts.
   */
  int getContactsCount();
  /**
   * <code>repeated string contacts = 9[json_name = "contacts"];</code>
   * @param index The index of the element to return.
   * @return The contacts at the given index.
   */
  java.lang.String getContacts(int index);
  /**
   * <code>repeated string contacts = 9[json_name = "contacts"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the contacts at the given index.
   */
  com.google.protobuf.ByteString
      getContactsBytes(int index);

  /**
   * <code>bool frontchannel_logout_session_required = 11[json_name = "frontchannelLogoutSessionRequired"];</code>
   * @return The frontchannelLogoutSessionRequired.
   */
  boolean getFrontchannelLogoutSessionRequired();

  /**
   * <code>string frontchannel_logout_uri = 12[json_name = "frontchannelLogoutUri"];</code>
   * @return The frontchannelLogoutUri.
   */
  java.lang.String getFrontchannelLogoutUri();
  /**
   * <code>string frontchannel_logout_uri = 12[json_name = "frontchannelLogoutUri"];</code>
   * @return The bytes for frontchannelLogoutUri.
   */
  com.google.protobuf.ByteString
      getFrontchannelLogoutUriBytes();

  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GrantType grant_types = 13[json_name = "grantTypes"];</code>
   * @return A list containing the grantTypes.
   */
  java.util.List<dev.auth3.identity.admin.GrantType> getGrantTypesList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GrantType grant_types = 13[json_name = "grantTypes"];</code>
   * @return The count of grantTypes.
   */
  int getGrantTypesCount();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GrantType grant_types = 13[json_name = "grantTypes"];</code>
   * @param index The index of the element to return.
   * @return The grantTypes at the given index.
   */
  dev.auth3.identity.admin.GrantType getGrantTypes(int index);
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GrantType grant_types = 13[json_name = "grantTypes"];</code>
   * @return A list containing the enum numeric values on the wire for grantTypes.
   */
  java.util.List<java.lang.Integer>
  getGrantTypesValueList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.GrantType grant_types = 13[json_name = "grantTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of grantTypes at the given index.
   */
  int getGrantTypesValue(int index);

  /**
   * <code>.google.protobuf.Struct jwks = 14[json_name = "jwks"];</code>
   * @return Whether the jwks field is set.
   */
  boolean hasJwks();
  /**
   * <code>.google.protobuf.Struct jwks = 14[json_name = "jwks"];</code>
   * @return The jwks.
   */
  com.google.protobuf.Struct getJwks();
  /**
   * <code>.google.protobuf.Struct jwks = 14[json_name = "jwks"];</code>
   */
  com.google.protobuf.StructOrBuilder getJwksOrBuilder();

  /**
   * <code>string jwks_uri = 15[json_name = "jwksUri"];</code>
   * @return The jwksUri.
   */
  java.lang.String getJwksUri();
  /**
   * <code>string jwks_uri = 15[json_name = "jwksUri"];</code>
   * @return The bytes for jwksUri.
   */
  com.google.protobuf.ByteString
      getJwksUriBytes();

  /**
   * <code>string logo_uri = 16[json_name = "logoUri"];</code>
   * @return The logoUri.
   */
  java.lang.String getLogoUri();
  /**
   * <code>string logo_uri = 16[json_name = "logoUri"];</code>
   * @return The bytes for logoUri.
   */
  com.google.protobuf.ByteString
      getLogoUriBytes();

  /**
   * <code>.google.protobuf.Struct metadata = 17[json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.google.protobuf.Struct metadata = 17[json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <code>.google.protobuf.Struct metadata = 17[json_name = "metadata"];</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <code>string owner = 18[json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 18[json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string policy_uri = 19[json_name = "policyUri"];</code>
   * @return The policyUri.
   */
  java.lang.String getPolicyUri();
  /**
   * <code>string policy_uri = 19[json_name = "policyUri"];</code>
   * @return The bytes for policyUri.
   */
  com.google.protobuf.ByteString
      getPolicyUriBytes();

  /**
   * <code>repeated string post_logout_redirect_uris = 20[json_name = "postLogoutRedirectUris"];</code>
   * @return A list containing the postLogoutRedirectUris.
   */
  java.util.List<java.lang.String>
      getPostLogoutRedirectUrisList();
  /**
   * <code>repeated string post_logout_redirect_uris = 20[json_name = "postLogoutRedirectUris"];</code>
   * @return The count of postLogoutRedirectUris.
   */
  int getPostLogoutRedirectUrisCount();
  /**
   * <code>repeated string post_logout_redirect_uris = 20[json_name = "postLogoutRedirectUris"];</code>
   * @param index The index of the element to return.
   * @return The postLogoutRedirectUris at the given index.
   */
  java.lang.String getPostLogoutRedirectUris(int index);
  /**
   * <code>repeated string post_logout_redirect_uris = 20[json_name = "postLogoutRedirectUris"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the postLogoutRedirectUris at the given index.
   */
  com.google.protobuf.ByteString
      getPostLogoutRedirectUrisBytes(int index);

  /**
   * <code>repeated string redirect_uris = 21[json_name = "redirectUris"];</code>
   * @return A list containing the redirectUris.
   */
  java.util.List<java.lang.String>
      getRedirectUrisList();
  /**
   * <code>repeated string redirect_uris = 21[json_name = "redirectUris"];</code>
   * @return The count of redirectUris.
   */
  int getRedirectUrisCount();
  /**
   * <code>repeated string redirect_uris = 21[json_name = "redirectUris"];</code>
   * @param index The index of the element to return.
   * @return The redirectUris at the given index.
   */
  java.lang.String getRedirectUris(int index);
  /**
   * <code>repeated string redirect_uris = 21[json_name = "redirectUris"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the redirectUris at the given index.
   */
  com.google.protobuf.ByteString
      getRedirectUrisBytes(int index);

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.RequestObjectSigningAlg request_object_signing_alg = 22[json_name = "requestObjectSigningAlg"];</code>
   * @return The enum numeric value on the wire for requestObjectSigningAlg.
   */
  int getRequestObjectSigningAlgValue();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.RequestObjectSigningAlg request_object_signing_alg = 22[json_name = "requestObjectSigningAlg"];</code>
   * @return The requestObjectSigningAlg.
   */
  dev.auth3.identity.admin.RequestObjectSigningAlg getRequestObjectSigningAlg();

  /**
   * <code>repeated string request_uris = 23[json_name = "requestUris"];</code>
   * @return A list containing the requestUris.
   */
  java.util.List<java.lang.String>
      getRequestUrisList();
  /**
   * <code>repeated string request_uris = 23[json_name = "requestUris"];</code>
   * @return The count of requestUris.
   */
  int getRequestUrisCount();
  /**
   * <code>repeated string request_uris = 23[json_name = "requestUris"];</code>
   * @param index The index of the element to return.
   * @return The requestUris at the given index.
   */
  java.lang.String getRequestUris(int index);
  /**
   * <code>repeated string request_uris = 23[json_name = "requestUris"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the requestUris at the given index.
   */
  com.google.protobuf.ByteString
      getRequestUrisBytes(int index);

  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.ResponseType response_types = 24[json_name = "responseTypes"];</code>
   * @return A list containing the responseTypes.
   */
  java.util.List<dev.auth3.identity.admin.ResponseType> getResponseTypesList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.ResponseType response_types = 24[json_name = "responseTypes"];</code>
   * @return The count of responseTypes.
   */
  int getResponseTypesCount();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.ResponseType response_types = 24[json_name = "responseTypes"];</code>
   * @param index The index of the element to return.
   * @return The responseTypes at the given index.
   */
  dev.auth3.identity.admin.ResponseType getResponseTypes(int index);
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.ResponseType response_types = 24[json_name = "responseTypes"];</code>
   * @return A list containing the enum numeric values on the wire for responseTypes.
   */
  java.util.List<java.lang.Integer>
  getResponseTypesValueList();
  /**
   * <code>repeated .depot.devtools.auth.v0.identity.admin.ResponseType response_types = 24[json_name = "responseTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of responseTypes at the given index.
   */
  int getResponseTypesValue(int index);

  /**
   * <code>string scope = 25[json_name = "scope"];</code>
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   * <code>string scope = 25[json_name = "scope"];</code>
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString
      getScopeBytes();

  /**
   * <code>string sector_identifier_uri = 26[json_name = "sectorIdentifierUri"];</code>
   * @return The sectorIdentifierUri.
   */
  java.lang.String getSectorIdentifierUri();
  /**
   * <code>string sector_identifier_uri = 26[json_name = "sectorIdentifierUri"];</code>
   * @return The bytes for sectorIdentifierUri.
   */
  com.google.protobuf.ByteString
      getSectorIdentifierUriBytes();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.SubjectType subject_type = 27[json_name = "subjectType"];</code>
   * @return The enum numeric value on the wire for subjectType.
   */
  int getSubjectTypeValue();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.SubjectType subject_type = 27[json_name = "subjectType"];</code>
   * @return The subjectType.
   */
  dev.auth3.identity.admin.SubjectType getSubjectType();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.TokenEndpointAuthMethod token_endpoint_auth_method = 28[json_name = "tokenEndpointAuthMethod"];</code>
   * @return The enum numeric value on the wire for tokenEndpointAuthMethod.
   */
  int getTokenEndpointAuthMethodValue();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.TokenEndpointAuthMethod token_endpoint_auth_method = 28[json_name = "tokenEndpointAuthMethod"];</code>
   * @return The tokenEndpointAuthMethod.
   */
  dev.auth3.identity.admin.TokenEndpointAuthMethod getTokenEndpointAuthMethod();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.TokenEndpointAuthSigningAlg token_endpoint_auth_signing_alg = 29[json_name = "tokenEndpointAuthSigningAlg"];</code>
   * @return The enum numeric value on the wire for tokenEndpointAuthSigningAlg.
   */
  int getTokenEndpointAuthSigningAlgValue();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.TokenEndpointAuthSigningAlg token_endpoint_auth_signing_alg = 29[json_name = "tokenEndpointAuthSigningAlg"];</code>
   * @return The tokenEndpointAuthSigningAlg.
   */
  dev.auth3.identity.admin.TokenEndpointAuthSigningAlg getTokenEndpointAuthSigningAlg();

  /**
   * <code>string tos_uri = 30[json_name = "tosUri"];</code>
   * @return The tosUri.
   */
  java.lang.String getTosUri();
  /**
   * <code>string tos_uri = 30[json_name = "tosUri"];</code>
   * @return The bytes for tosUri.
   */
  com.google.protobuf.ByteString
      getTosUriBytes();

  /**
   * <code>.depot.devtools.auth.v0.identity.admin.UserinfoSignedResponseAlg userinfo_signed_response_alg = 31[json_name = "userinfoSignedResponseAlg"];</code>
   * @return The enum numeric value on the wire for userinfoSignedResponseAlg.
   */
  int getUserinfoSignedResponseAlgValue();
  /**
   * <code>.depot.devtools.auth.v0.identity.admin.UserinfoSignedResponseAlg userinfo_signed_response_alg = 31[json_name = "userinfoSignedResponseAlg"];</code>
   * @return The userinfoSignedResponseAlg.
   */
  dev.auth3.identity.admin.UserinfoSignedResponseAlg getUserinfoSignedResponseAlg();

  /**
   * <code>string client_secret = 32[json_name = "clientSecret"];</code>
   * @return The clientSecret.
   */
  java.lang.String getClientSecret();
  /**
   * <code>string client_secret = 32[json_name = "clientSecret"];</code>
   * @return The bytes for clientSecret.
   */
  com.google.protobuf.ByteString
      getClientSecretBytes();

  /**
   * <code>string client_id = 33[json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 33[json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();
}
