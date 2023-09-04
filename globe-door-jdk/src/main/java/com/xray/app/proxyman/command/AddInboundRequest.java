// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/proxyman/command/command.proto

package com.xray.app.proxyman.command;

/**
 * Protobuf type {@code xray.app.proxyman.command.AddInboundRequest}
 */
public final class AddInboundRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.proxyman.command.AddInboundRequest)
    AddInboundRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddInboundRequest.newBuilder() to construct.
  private AddInboundRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddInboundRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddInboundRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddInboundRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddInboundRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.proxyman.command.AddInboundRequest.class, com.xray.app.proxyman.command.AddInboundRequest.Builder.class);
  }

  public static final int INBOUND_FIELD_NUMBER = 1;
  private com.xray.core.InboundHandlerConfig inbound_;
  /**
   * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
   * @return Whether the inbound field is set.
   */
  @java.lang.Override
  public boolean hasInbound() {
    return inbound_ != null;
  }
  /**
   * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
   * @return The inbound.
   */
  @java.lang.Override
  public com.xray.core.InboundHandlerConfig getInbound() {
    return inbound_ == null ? com.xray.core.InboundHandlerConfig.getDefaultInstance() : inbound_;
  }
  /**
   * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
   */
  @java.lang.Override
  public com.xray.core.InboundHandlerConfigOrBuilder getInboundOrBuilder() {
    return inbound_ == null ? com.xray.core.InboundHandlerConfig.getDefaultInstance() : inbound_;
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
    if (inbound_ != null) {
      output.writeMessage(1, getInbound());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inbound_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInbound());
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
    if (!(obj instanceof com.xray.app.proxyman.command.AddInboundRequest)) {
      return super.equals(obj);
    }
    com.xray.app.proxyman.command.AddInboundRequest other = (com.xray.app.proxyman.command.AddInboundRequest) obj;

    if (hasInbound() != other.hasInbound()) return false;
    if (hasInbound()) {
      if (!getInbound()
          .equals(other.getInbound())) return false;
    }
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
    if (hasInbound()) {
      hash = (37 * hash) + INBOUND_FIELD_NUMBER;
      hash = (53 * hash) + getInbound().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.proxyman.command.AddInboundRequest parseFrom(
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
  public static Builder newBuilder(com.xray.app.proxyman.command.AddInboundRequest prototype) {
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
   * Protobuf type {@code xray.app.proxyman.command.AddInboundRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.proxyman.command.AddInboundRequest)
      com.xray.app.proxyman.command.AddInboundRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddInboundRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddInboundRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.proxyman.command.AddInboundRequest.class, com.xray.app.proxyman.command.AddInboundRequest.Builder.class);
    }

    // Construct using com.xray.app.proxyman.command.AddInboundRequest.newBuilder()
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
      inbound_ = null;
      if (inboundBuilder_ != null) {
        inboundBuilder_.dispose();
        inboundBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddInboundRequest_descriptor;
    }

    @java.lang.Override
    public com.xray.app.proxyman.command.AddInboundRequest getDefaultInstanceForType() {
      return com.xray.app.proxyman.command.AddInboundRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.proxyman.command.AddInboundRequest build() {
      com.xray.app.proxyman.command.AddInboundRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.proxyman.command.AddInboundRequest buildPartial() {
      com.xray.app.proxyman.command.AddInboundRequest result = new com.xray.app.proxyman.command.AddInboundRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.xray.app.proxyman.command.AddInboundRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inbound_ = inboundBuilder_ == null
            ? inbound_
            : inboundBuilder_.build();
      }
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
      if (other instanceof com.xray.app.proxyman.command.AddInboundRequest) {
        return mergeFrom((com.xray.app.proxyman.command.AddInboundRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.proxyman.command.AddInboundRequest other) {
      if (other == com.xray.app.proxyman.command.AddInboundRequest.getDefaultInstance()) return this;
      if (other.hasInbound()) {
        mergeInbound(other.getInbound());
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
              input.readMessage(
                  getInboundFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.xray.core.InboundHandlerConfig inbound_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.core.InboundHandlerConfig, com.xray.core.InboundHandlerConfig.Builder, com.xray.core.InboundHandlerConfigOrBuilder> inboundBuilder_;
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     * @return Whether the inbound field is set.
     */
    public boolean hasInbound() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     * @return The inbound.
     */
    public com.xray.core.InboundHandlerConfig getInbound() {
      if (inboundBuilder_ == null) {
        return inbound_ == null ? com.xray.core.InboundHandlerConfig.getDefaultInstance() : inbound_;
      } else {
        return inboundBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     */
    public Builder setInbound(com.xray.core.InboundHandlerConfig value) {
      if (inboundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inbound_ = value;
      } else {
        inboundBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     */
    public Builder setInbound(
        com.xray.core.InboundHandlerConfig.Builder builderForValue) {
      if (inboundBuilder_ == null) {
        inbound_ = builderForValue.build();
      } else {
        inboundBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     */
    public Builder mergeInbound(com.xray.core.InboundHandlerConfig value) {
      if (inboundBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          inbound_ != null &&
          inbound_ != com.xray.core.InboundHandlerConfig.getDefaultInstance()) {
          getInboundBuilder().mergeFrom(value);
        } else {
          inbound_ = value;
        }
      } else {
        inboundBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     */
    public Builder clearInbound() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inbound_ = null;
      if (inboundBuilder_ != null) {
        inboundBuilder_.dispose();
        inboundBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     */
    public com.xray.core.InboundHandlerConfig.Builder getInboundBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInboundFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     */
    public com.xray.core.InboundHandlerConfigOrBuilder getInboundOrBuilder() {
      if (inboundBuilder_ != null) {
        return inboundBuilder_.getMessageOrBuilder();
      } else {
        return inbound_ == null ?
            com.xray.core.InboundHandlerConfig.getDefaultInstance() : inbound_;
      }
    }
    /**
     * <code>.xray.core.InboundHandlerConfig inbound = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.core.InboundHandlerConfig, com.xray.core.InboundHandlerConfig.Builder, com.xray.core.InboundHandlerConfigOrBuilder> 
        getInboundFieldBuilder() {
      if (inboundBuilder_ == null) {
        inboundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xray.core.InboundHandlerConfig, com.xray.core.InboundHandlerConfig.Builder, com.xray.core.InboundHandlerConfigOrBuilder>(
                getInbound(),
                getParentForChildren(),
                isClean());
        inbound_ = null;
      }
      return inboundBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.app.proxyman.command.AddInboundRequest)
  }

  // @@protoc_insertion_point(class_scope:xray.app.proxyman.command.AddInboundRequest)
  private static final com.xray.app.proxyman.command.AddInboundRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.proxyman.command.AddInboundRequest();
  }

  public static com.xray.app.proxyman.command.AddInboundRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddInboundRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddInboundRequest>() {
    @java.lang.Override
    public AddInboundRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddInboundRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddInboundRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.proxyman.command.AddInboundRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
