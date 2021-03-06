// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

/**
 * Protobuf type {@code depot.devtools.auth.v0.identity.admin.GetAddressResponse}
 */
public final class GetAddressResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:depot.devtools.auth.v0.identity.admin.GetAddressResponse)
    GetAddressResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAddressResponse.newBuilder() to construct.
  private GetAddressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAddressResponse() {
    id_ = "";
    identityId_ = "";
    name_ = "";
    address_ = "";
    idSchemaKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAddressResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAddressResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            identityId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            address_ = s;
            break;
          }
          case 40: {

            verified_ = input.readBool();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            idSchemaKey_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetAddressResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetAddressResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.auth3.identity.admin.GetAddressResponse.class, dev.auth3.identity.admin.GetAddressResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1[json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1[json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDENTITY_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object identityId_;
  /**
   * <code>string identity_id = 2[json_name = "identityId"];</code>
   * @return The identityId.
   */
  @java.lang.Override
  public java.lang.String getIdentityId() {
    java.lang.Object ref = identityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identityId_ = s;
      return s;
    }
  }
  /**
   * <code>string identity_id = 2[json_name = "identityId"];</code>
   * @return The bytes for identityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdentityIdBytes() {
    java.lang.Object ref = identityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3[json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3[json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 4;
  private volatile java.lang.Object address_;
  /**
   * <code>string address = 4[json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 4[json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERIFIED_FIELD_NUMBER = 5;
  private boolean verified_;
  /**
   * <code>bool verified = 5[json_name = "verified"];</code>
   * @return The verified.
   */
  @java.lang.Override
  public boolean getVerified() {
    return verified_;
  }

  public static final int ID_SCHEMA_KEY_FIELD_NUMBER = 6;
  private volatile java.lang.Object idSchemaKey_;
  /**
   * <code>string id_schema_key = 6[json_name = "idSchemaKey"];</code>
   * @return The idSchemaKey.
   */
  @java.lang.Override
  public java.lang.String getIdSchemaKey() {
    java.lang.Object ref = idSchemaKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idSchemaKey_ = s;
      return s;
    }
  }
  /**
   * <code>string id_schema_key = 6[json_name = "idSchemaKey"];</code>
   * @return The bytes for idSchemaKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdSchemaKeyBytes() {
    java.lang.Object ref = idSchemaKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idSchemaKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getIdentityIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identityId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!getAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, address_);
    }
    if (verified_ != false) {
      output.writeBool(5, verified_);
    }
    if (!getIdSchemaKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, idSchemaKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getIdentityIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identityId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!getAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, address_);
    }
    if (verified_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, verified_);
    }
    if (!getIdSchemaKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, idSchemaKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dev.auth3.identity.admin.GetAddressResponse)) {
      return super.equals(obj);
    }
    dev.auth3.identity.admin.GetAddressResponse other = (dev.auth3.identity.admin.GetAddressResponse) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getIdentityId()
        .equals(other.getIdentityId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (getVerified()
        != other.getVerified()) return false;
    if (!getIdSchemaKey()
        .equals(other.getIdSchemaKey())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + IDENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIdentityId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + VERIFIED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVerified());
    hash = (37 * hash) + ID_SCHEMA_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getIdSchemaKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dev.auth3.identity.admin.GetAddressResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code depot.devtools.auth.v0.identity.admin.GetAddressResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:depot.devtools.auth.v0.identity.admin.GetAddressResponse)
      dev.auth3.identity.admin.GetAddressResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetAddressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetAddressResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.auth3.identity.admin.GetAddressResponse.class, dev.auth3.identity.admin.GetAddressResponse.Builder.class);
    }

    // Construct using dev.auth3.identity.admin.GetAddressResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      identityId_ = "";

      name_ = "";

      address_ = "";

      verified_ = false;

      idSchemaKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetAddressResponse_descriptor;
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetAddressResponse getDefaultInstanceForType() {
      return dev.auth3.identity.admin.GetAddressResponse.getDefaultInstance();
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetAddressResponse build() {
      dev.auth3.identity.admin.GetAddressResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetAddressResponse buildPartial() {
      dev.auth3.identity.admin.GetAddressResponse result = new dev.auth3.identity.admin.GetAddressResponse(this);
      result.id_ = id_;
      result.identityId_ = identityId_;
      result.name_ = name_;
      result.address_ = address_;
      result.verified_ = verified_;
      result.idSchemaKey_ = idSchemaKey_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dev.auth3.identity.admin.GetAddressResponse) {
        return mergeFrom((dev.auth3.identity.admin.GetAddressResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.auth3.identity.admin.GetAddressResponse other) {
      if (other == dev.auth3.identity.admin.GetAddressResponse.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getIdentityId().isEmpty()) {
        identityId_ = other.identityId_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (other.getVerified() != false) {
        setVerified(other.getVerified());
      }
      if (!other.getIdSchemaKey().isEmpty()) {
        idSchemaKey_ = other.idSchemaKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dev.auth3.identity.admin.GetAddressResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.auth3.identity.admin.GetAddressResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1[json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1[json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1[json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1[json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1[json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object identityId_ = "";
    /**
     * <code>string identity_id = 2[json_name = "identityId"];</code>
     * @return The identityId.
     */
    public java.lang.String getIdentityId() {
      java.lang.Object ref = identityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identity_id = 2[json_name = "identityId"];</code>
     * @return The bytes for identityId.
     */
    public com.google.protobuf.ByteString
        getIdentityIdBytes() {
      java.lang.Object ref = identityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identity_id = 2[json_name = "identityId"];</code>
     * @param value The identityId to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string identity_id = 2[json_name = "identityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentityId() {
      
      identityId_ = getDefaultInstance().getIdentityId();
      onChanged();
      return this;
    }
    /**
     * <code>string identity_id = 2[json_name = "identityId"];</code>
     * @param value The bytes for identityId to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identityId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3[json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3[json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3[json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3[json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3[json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 4[json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 4[json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 4[json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 4[json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string address = 4[json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private boolean verified_ ;
    /**
     * <code>bool verified = 5[json_name = "verified"];</code>
     * @return The verified.
     */
    @java.lang.Override
    public boolean getVerified() {
      return verified_;
    }
    /**
     * <code>bool verified = 5[json_name = "verified"];</code>
     * @param value The verified to set.
     * @return This builder for chaining.
     */
    public Builder setVerified(boolean value) {
      
      verified_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool verified = 5[json_name = "verified"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVerified() {
      
      verified_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object idSchemaKey_ = "";
    /**
     * <code>string id_schema_key = 6[json_name = "idSchemaKey"];</code>
     * @return The idSchemaKey.
     */
    public java.lang.String getIdSchemaKey() {
      java.lang.Object ref = idSchemaKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idSchemaKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id_schema_key = 6[json_name = "idSchemaKey"];</code>
     * @return The bytes for idSchemaKey.
     */
    public com.google.protobuf.ByteString
        getIdSchemaKeyBytes() {
      java.lang.Object ref = idSchemaKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idSchemaKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id_schema_key = 6[json_name = "idSchemaKey"];</code>
     * @param value The idSchemaKey to set.
     * @return This builder for chaining.
     */
    public Builder setIdSchemaKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idSchemaKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id_schema_key = 6[json_name = "idSchemaKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIdSchemaKey() {
      
      idSchemaKey_ = getDefaultInstance().getIdSchemaKey();
      onChanged();
      return this;
    }
    /**
     * <code>string id_schema_key = 6[json_name = "idSchemaKey"];</code>
     * @param value The bytes for idSchemaKey to set.
     * @return This builder for chaining.
     */
    public Builder setIdSchemaKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idSchemaKey_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:depot.devtools.auth.v0.identity.admin.GetAddressResponse)
  }

  // @@protoc_insertion_point(class_scope:depot.devtools.auth.v0.identity.admin.GetAddressResponse)
  private static final dev.auth3.identity.admin.GetAddressResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.auth3.identity.admin.GetAddressResponse();
  }

  public static dev.auth3.identity.admin.GetAddressResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAddressResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAddressResponse>() {
    @java.lang.Override
    public GetAddressResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAddressResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAddressResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAddressResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.auth3.identity.admin.GetAddressResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

