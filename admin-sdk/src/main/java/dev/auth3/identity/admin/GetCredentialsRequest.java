// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

/**
 * Protobuf type {@code depot.devtools.auth.v0.identity.admin.GetCredentialsRequest}
 */
public final class GetCredentialsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:depot.devtools.auth.v0.identity.admin.GetCredentialsRequest)
    GetCredentialsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCredentialsRequest.newBuilder() to construct.
  private GetCredentialsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCredentialsRequest() {
    identityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCredentialsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCredentialsRequest(
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

            identityId_ = s;
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
    return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetCredentialsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetCredentialsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.auth3.identity.admin.GetCredentialsRequest.class, dev.auth3.identity.admin.GetCredentialsRequest.Builder.class);
  }

  public static final int IDENTITY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object identityId_;
  /**
   * <code>string identity_id = 1[json_name = "identityId"];</code>
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
   * <code>string identity_id = 1[json_name = "identityId"];</code>
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
    if (!getIdentityIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identityId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdentityIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identityId_);
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
    if (!(obj instanceof dev.auth3.identity.admin.GetCredentialsRequest)) {
      return super.equals(obj);
    }
    dev.auth3.identity.admin.GetCredentialsRequest other = (dev.auth3.identity.admin.GetCredentialsRequest) obj;

    if (!getIdentityId()
        .equals(other.getIdentityId())) return false;
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
    hash = (37 * hash) + IDENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIdentityId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetCredentialsRequest parseFrom(
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
  public static Builder newBuilder(dev.auth3.identity.admin.GetCredentialsRequest prototype) {
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
   * Protobuf type {@code depot.devtools.auth.v0.identity.admin.GetCredentialsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:depot.devtools.auth.v0.identity.admin.GetCredentialsRequest)
      dev.auth3.identity.admin.GetCredentialsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetCredentialsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetCredentialsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.auth3.identity.admin.GetCredentialsRequest.class, dev.auth3.identity.admin.GetCredentialsRequest.Builder.class);
    }

    // Construct using dev.auth3.identity.admin.GetCredentialsRequest.newBuilder()
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
      identityId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetCredentialsRequest_descriptor;
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetCredentialsRequest getDefaultInstanceForType() {
      return dev.auth3.identity.admin.GetCredentialsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetCredentialsRequest build() {
      dev.auth3.identity.admin.GetCredentialsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetCredentialsRequest buildPartial() {
      dev.auth3.identity.admin.GetCredentialsRequest result = new dev.auth3.identity.admin.GetCredentialsRequest(this);
      result.identityId_ = identityId_;
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
      if (other instanceof dev.auth3.identity.admin.GetCredentialsRequest) {
        return mergeFrom((dev.auth3.identity.admin.GetCredentialsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.auth3.identity.admin.GetCredentialsRequest other) {
      if (other == dev.auth3.identity.admin.GetCredentialsRequest.getDefaultInstance()) return this;
      if (!other.getIdentityId().isEmpty()) {
        identityId_ = other.identityId_;
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
      dev.auth3.identity.admin.GetCredentialsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.auth3.identity.admin.GetCredentialsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object identityId_ = "";
    /**
     * <code>string identity_id = 1[json_name = "identityId"];</code>
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
     * <code>string identity_id = 1[json_name = "identityId"];</code>
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
     * <code>string identity_id = 1[json_name = "identityId"];</code>
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
     * <code>string identity_id = 1[json_name = "identityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentityId() {
      
      identityId_ = getDefaultInstance().getIdentityId();
      onChanged();
      return this;
    }
    /**
     * <code>string identity_id = 1[json_name = "identityId"];</code>
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


    // @@protoc_insertion_point(builder_scope:depot.devtools.auth.v0.identity.admin.GetCredentialsRequest)
  }

  // @@protoc_insertion_point(class_scope:depot.devtools.auth.v0.identity.admin.GetCredentialsRequest)
  private static final dev.auth3.identity.admin.GetCredentialsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.auth3.identity.admin.GetCredentialsRequest();
  }

  public static dev.auth3.identity.admin.GetCredentialsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCredentialsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCredentialsRequest>() {
    @java.lang.Override
    public GetCredentialsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCredentialsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCredentialsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCredentialsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.auth3.identity.admin.GetCredentialsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

