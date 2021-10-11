// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/admin/admin.proto

package dev.auth3.identity.admin;

/**
 * Protobuf type {@code depot.devtools.auth.v0.identity.admin.GetIdentitiesByAttributeRequest}
 */
public final class GetIdentitiesByAttributeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:depot.devtools.auth.v0.identity.admin.GetIdentitiesByAttributeRequest)
    GetIdentitiesByAttributeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetIdentitiesByAttributeRequest.newBuilder() to construct.
  private GetIdentitiesByAttributeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetIdentitiesByAttributeRequest() {
    attribute_ = "";
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetIdentitiesByAttributeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetIdentitiesByAttributeRequest(
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

            attribute_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            value_ = s;
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
    return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetIdentitiesByAttributeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetIdentitiesByAttributeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.class, dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.Builder.class);
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 1;
  private volatile java.lang.Object attribute_;
  /**
   * <code>string attribute = 1[json_name = "attribute"];</code>
   * @return The attribute.
   */
  @java.lang.Override
  public java.lang.String getAttribute() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attribute_ = s;
      return s;
    }
  }
  /**
   * <code>string attribute = 1[json_name = "attribute"];</code>
   * @return The bytes for attribute.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttributeBytes() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attribute_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object value_;
  /**
   * <code>string value = 2[json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 2[json_name = "value"];</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
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
    if (!getAttributeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attribute_);
    }
    if (!getValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAttributeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attribute_);
    }
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
    if (!(obj instanceof dev.auth3.identity.admin.GetIdentitiesByAttributeRequest)) {
      return super.equals(obj);
    }
    dev.auth3.identity.admin.GetIdentitiesByAttributeRequest other = (dev.auth3.identity.admin.GetIdentitiesByAttributeRequest) obj;

    if (!getAttribute()
        .equals(other.getAttribute())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
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
    hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
    hash = (53 * hash) + getAttribute().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parseFrom(
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
  public static Builder newBuilder(dev.auth3.identity.admin.GetIdentitiesByAttributeRequest prototype) {
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
   * Protobuf type {@code depot.devtools.auth.v0.identity.admin.GetIdentitiesByAttributeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:depot.devtools.auth.v0.identity.admin.GetIdentitiesByAttributeRequest)
      dev.auth3.identity.admin.GetIdentitiesByAttributeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetIdentitiesByAttributeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetIdentitiesByAttributeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.class, dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.Builder.class);
    }

    // Construct using dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.newBuilder()
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
      attribute_ = "";

      value_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.auth3.identity.admin.AdminProto.internal_static_depot_devtools_auth_v0_identity_admin_GetIdentitiesByAttributeRequest_descriptor;
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetIdentitiesByAttributeRequest getDefaultInstanceForType() {
      return dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetIdentitiesByAttributeRequest build() {
      dev.auth3.identity.admin.GetIdentitiesByAttributeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.auth3.identity.admin.GetIdentitiesByAttributeRequest buildPartial() {
      dev.auth3.identity.admin.GetIdentitiesByAttributeRequest result = new dev.auth3.identity.admin.GetIdentitiesByAttributeRequest(this);
      result.attribute_ = attribute_;
      result.value_ = value_;
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
      if (other instanceof dev.auth3.identity.admin.GetIdentitiesByAttributeRequest) {
        return mergeFrom((dev.auth3.identity.admin.GetIdentitiesByAttributeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.auth3.identity.admin.GetIdentitiesByAttributeRequest other) {
      if (other == dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.getDefaultInstance()) return this;
      if (!other.getAttribute().isEmpty()) {
        attribute_ = other.attribute_;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
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
      dev.auth3.identity.admin.GetIdentitiesByAttributeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.auth3.identity.admin.GetIdentitiesByAttributeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object attribute_ = "";
    /**
     * <code>string attribute = 1[json_name = "attribute"];</code>
     * @return The attribute.
     */
    public java.lang.String getAttribute() {
      java.lang.Object ref = attribute_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attribute_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string attribute = 1[json_name = "attribute"];</code>
     * @return The bytes for attribute.
     */
    public com.google.protobuf.ByteString
        getAttributeBytes() {
      java.lang.Object ref = attribute_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attribute_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string attribute = 1[json_name = "attribute"];</code>
     * @param value The attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttribute(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      attribute_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string attribute = 1[json_name = "attribute"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttribute() {
      
      attribute_ = getDefaultInstance().getAttribute();
      onChanged();
      return this;
    }
    /**
     * <code>string attribute = 1[json_name = "attribute"];</code>
     * @param value The bytes for attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      attribute_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 2[json_name = "value"];</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 2[json_name = "value"];</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 2[json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2[json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2[json_name = "value"];</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
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


    // @@protoc_insertion_point(builder_scope:depot.devtools.auth.v0.identity.admin.GetIdentitiesByAttributeRequest)
  }

  // @@protoc_insertion_point(class_scope:depot.devtools.auth.v0.identity.admin.GetIdentitiesByAttributeRequest)
  private static final dev.auth3.identity.admin.GetIdentitiesByAttributeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.auth3.identity.admin.GetIdentitiesByAttributeRequest();
  }

  public static dev.auth3.identity.admin.GetIdentitiesByAttributeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetIdentitiesByAttributeRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetIdentitiesByAttributeRequest>() {
    @java.lang.Override
    public GetIdentitiesByAttributeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetIdentitiesByAttributeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetIdentitiesByAttributeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetIdentitiesByAttributeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.auth3.identity.admin.GetIdentitiesByAttributeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
