// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/command/command.proto

package com.xray.app.router.command;

/**
 * <pre>
 * SubscribeRoutingStatsRequest subscribes to routing statistics channel if
 * opened by xray-core.
 * * FieldSelectors selects a subset of fields in routing statistics to return.
 * Valid selectors:
 *  - inbound: Selects connection's inbound tag.
 *  - network: Selects connection's network.
 *  - ip: Equivalent as "ip_source" and "ip_target", selects both source and
 *  target IP.
 *  - port: Equivalent as "port_source" and "port_target", selects both source
 *  and target port.
 *  - domain: Selects target domain.
 *  - protocol: Select connection's protocol.
 *  - user: Select connection's inbound user email.
 *  - attributes: Select connection's additional attributes.
 *  - outbound: Equivalent as "outbound" and "outbound_group", select both
 *  outbound tag and outbound group tags.
 * * If FieldSelectors is left empty, all fields will be returned.
 * </pre>
 *
 * Protobuf type {@code xray.app.router.command.SubscribeRoutingStatsRequest}
 */
public final class SubscribeRoutingStatsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.router.command.SubscribeRoutingStatsRequest)
    SubscribeRoutingStatsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscribeRoutingStatsRequest.newBuilder() to construct.
  private SubscribeRoutingStatsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeRoutingStatsRequest() {
    fieldSelectors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubscribeRoutingStatsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.app.router.command.Command.internal_static_xray_app_router_command_SubscribeRoutingStatsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.router.command.Command.internal_static_xray_app_router_command_SubscribeRoutingStatsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.router.command.SubscribeRoutingStatsRequest.class, com.xray.app.router.command.SubscribeRoutingStatsRequest.Builder.class);
  }

  public static final int FIELDSELECTORS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList fieldSelectors_;
  /**
   * <code>repeated string FieldSelectors = 1;</code>
   * @return A list containing the fieldSelectors.
   */
  public com.google.protobuf.ProtocolStringList
      getFieldSelectorsList() {
    return fieldSelectors_;
  }
  /**
   * <code>repeated string FieldSelectors = 1;</code>
   * @return The count of fieldSelectors.
   */
  public int getFieldSelectorsCount() {
    return fieldSelectors_.size();
  }
  /**
   * <code>repeated string FieldSelectors = 1;</code>
   * @param index The index of the element to return.
   * @return The fieldSelectors at the given index.
   */
  public java.lang.String getFieldSelectors(int index) {
    return fieldSelectors_.get(index);
  }
  /**
   * <code>repeated string FieldSelectors = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldSelectors at the given index.
   */
  public com.google.protobuf.ByteString
      getFieldSelectorsBytes(int index) {
    return fieldSelectors_.getByteString(index);
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
    for (int i = 0; i < fieldSelectors_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldSelectors_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < fieldSelectors_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldSelectors_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldSelectorsList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xray.app.router.command.SubscribeRoutingStatsRequest)) {
      return super.equals(obj);
    }
    com.xray.app.router.command.SubscribeRoutingStatsRequest other = (com.xray.app.router.command.SubscribeRoutingStatsRequest) obj;

    if (!getFieldSelectorsList()
        .equals(other.getFieldSelectorsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFieldSelectorsCount() > 0) {
      hash = (37 * hash) + FIELDSELECTORS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldSelectorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.router.command.SubscribeRoutingStatsRequest parseFrom(
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
  public static Builder newBuilder(com.xray.app.router.command.SubscribeRoutingStatsRequest prototype) {
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
   * <pre>
   * SubscribeRoutingStatsRequest subscribes to routing statistics channel if
   * opened by xray-core.
   * * FieldSelectors selects a subset of fields in routing statistics to return.
   * Valid selectors:
   *  - inbound: Selects connection's inbound tag.
   *  - network: Selects connection's network.
   *  - ip: Equivalent as "ip_source" and "ip_target", selects both source and
   *  target IP.
   *  - port: Equivalent as "port_source" and "port_target", selects both source
   *  and target port.
   *  - domain: Selects target domain.
   *  - protocol: Select connection's protocol.
   *  - user: Select connection's inbound user email.
   *  - attributes: Select connection's additional attributes.
   *  - outbound: Equivalent as "outbound" and "outbound_group", select both
   *  outbound tag and outbound group tags.
   * * If FieldSelectors is left empty, all fields will be returned.
   * </pre>
   *
   * Protobuf type {@code xray.app.router.command.SubscribeRoutingStatsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.router.command.SubscribeRoutingStatsRequest)
      com.xray.app.router.command.SubscribeRoutingStatsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.router.command.Command.internal_static_xray_app_router_command_SubscribeRoutingStatsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.router.command.Command.internal_static_xray_app_router_command_SubscribeRoutingStatsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.router.command.SubscribeRoutingStatsRequest.class, com.xray.app.router.command.SubscribeRoutingStatsRequest.Builder.class);
    }

    // Construct using com.xray.app.router.command.SubscribeRoutingStatsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fieldSelectors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.router.command.Command.internal_static_xray_app_router_command_SubscribeRoutingStatsRequest_descriptor;
    }

    @java.lang.Override
    public com.xray.app.router.command.SubscribeRoutingStatsRequest getDefaultInstanceForType() {
      return com.xray.app.router.command.SubscribeRoutingStatsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.router.command.SubscribeRoutingStatsRequest build() {
      com.xray.app.router.command.SubscribeRoutingStatsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.router.command.SubscribeRoutingStatsRequest buildPartial() {
      com.xray.app.router.command.SubscribeRoutingStatsRequest result = new com.xray.app.router.command.SubscribeRoutingStatsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.xray.app.router.command.SubscribeRoutingStatsRequest result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        fieldSelectors_ = fieldSelectors_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fieldSelectors_ = fieldSelectors_;
    }

    private void buildPartial0(com.xray.app.router.command.SubscribeRoutingStatsRequest result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.xray.app.router.command.SubscribeRoutingStatsRequest) {
        return mergeFrom((com.xray.app.router.command.SubscribeRoutingStatsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.router.command.SubscribeRoutingStatsRequest other) {
      if (other == com.xray.app.router.command.SubscribeRoutingStatsRequest.getDefaultInstance()) return this;
      if (!other.fieldSelectors_.isEmpty()) {
        if (fieldSelectors_.isEmpty()) {
          fieldSelectors_ = other.fieldSelectors_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldSelectorsIsMutable();
          fieldSelectors_.addAll(other.fieldSelectors_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              ensureFieldSelectorsIsMutable();
              fieldSelectors_.add(s);
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList fieldSelectors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFieldSelectorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fieldSelectors_ = new com.google.protobuf.LazyStringArrayList(fieldSelectors_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @return A list containing the fieldSelectors.
     */
    public com.google.protobuf.ProtocolStringList
        getFieldSelectorsList() {
      return fieldSelectors_.getUnmodifiableView();
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @return The count of fieldSelectors.
     */
    public int getFieldSelectorsCount() {
      return fieldSelectors_.size();
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @param index The index of the element to return.
     * @return The fieldSelectors at the given index.
     */
    public java.lang.String getFieldSelectors(int index) {
      return fieldSelectors_.get(index);
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the fieldSelectors at the given index.
     */
    public com.google.protobuf.ByteString
        getFieldSelectorsBytes(int index) {
      return fieldSelectors_.getByteString(index);
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @param index The index to set the value at.
     * @param value The fieldSelectors to set.
     * @return This builder for chaining.
     */
    public Builder setFieldSelectors(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldSelectorsIsMutable();
      fieldSelectors_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @param value The fieldSelectors to add.
     * @return This builder for chaining.
     */
    public Builder addFieldSelectors(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldSelectorsIsMutable();
      fieldSelectors_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @param values The fieldSelectors to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldSelectors(
        java.lang.Iterable<java.lang.String> values) {
      ensureFieldSelectorsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fieldSelectors_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldSelectors() {
      fieldSelectors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string FieldSelectors = 1;</code>
     * @param value The bytes of the fieldSelectors to add.
     * @return This builder for chaining.
     */
    public Builder addFieldSelectorsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFieldSelectorsIsMutable();
      fieldSelectors_.add(value);
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


    // @@protoc_insertion_point(builder_scope:xray.app.router.command.SubscribeRoutingStatsRequest)
  }

  // @@protoc_insertion_point(class_scope:xray.app.router.command.SubscribeRoutingStatsRequest)
  private static final com.xray.app.router.command.SubscribeRoutingStatsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.router.command.SubscribeRoutingStatsRequest();
  }

  public static com.xray.app.router.command.SubscribeRoutingStatsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeRoutingStatsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeRoutingStatsRequest>() {
    @java.lang.Override
    public SubscribeRoutingStatsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SubscribeRoutingStatsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeRoutingStatsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.router.command.SubscribeRoutingStatsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

