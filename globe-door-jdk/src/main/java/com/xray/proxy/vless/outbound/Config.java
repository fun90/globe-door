// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vless/outbound/config.proto

package com.xray.proxy.vless.outbound;

/**
 * Protobuf type {@code xray.proxy.vless.outbound.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.proxy.vless.outbound.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    vnext_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.proxy.vless.outbound.ConfigOuterClass.internal_static_xray_proxy_vless_outbound_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.proxy.vless.outbound.ConfigOuterClass.internal_static_xray_proxy_vless_outbound_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.proxy.vless.outbound.Config.class, com.xray.proxy.vless.outbound.Config.Builder.class);
  }

  public static final int VNEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.xray.common.protocol.ServerEndpoint> vnext_;
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.xray.common.protocol.ServerEndpoint> getVnextList() {
    return vnext_;
  }
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.xray.common.protocol.ServerEndpointOrBuilder> 
      getVnextOrBuilderList() {
    return vnext_;
  }
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
   */
  @java.lang.Override
  public int getVnextCount() {
    return vnext_.size();
  }
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
   */
  @java.lang.Override
  public com.xray.common.protocol.ServerEndpoint getVnext(int index) {
    return vnext_.get(index);
  }
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
   */
  @java.lang.Override
  public com.xray.common.protocol.ServerEndpointOrBuilder getVnextOrBuilder(
      int index) {
    return vnext_.get(index);
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
    for (int i = 0; i < vnext_.size(); i++) {
      output.writeMessage(1, vnext_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vnext_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, vnext_.get(i));
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
    if (!(obj instanceof com.xray.proxy.vless.outbound.Config)) {
      return super.equals(obj);
    }
    com.xray.proxy.vless.outbound.Config other = (com.xray.proxy.vless.outbound.Config) obj;

    if (!getVnextList()
        .equals(other.getVnextList())) return false;
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
    if (getVnextCount() > 0) {
      hash = (37 * hash) + VNEXT_FIELD_NUMBER;
      hash = (53 * hash) + getVnextList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.proxy.vless.outbound.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.vless.outbound.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.proxy.vless.outbound.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.vless.outbound.Config parseFrom(
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
  public static Builder newBuilder(com.xray.proxy.vless.outbound.Config prototype) {
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
   * Protobuf type {@code xray.proxy.vless.outbound.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.proxy.vless.outbound.Config)
      com.xray.proxy.vless.outbound.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.proxy.vless.outbound.ConfigOuterClass.internal_static_xray_proxy_vless_outbound_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.proxy.vless.outbound.ConfigOuterClass.internal_static_xray_proxy_vless_outbound_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.proxy.vless.outbound.Config.class, com.xray.proxy.vless.outbound.Config.Builder.class);
    }

    // Construct using com.xray.proxy.vless.outbound.Config.newBuilder()
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
      if (vnextBuilder_ == null) {
        vnext_ = java.util.Collections.emptyList();
      } else {
        vnext_ = null;
        vnextBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.proxy.vless.outbound.ConfigOuterClass.internal_static_xray_proxy_vless_outbound_Config_descriptor;
    }

    @java.lang.Override
    public com.xray.proxy.vless.outbound.Config getDefaultInstanceForType() {
      return com.xray.proxy.vless.outbound.Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.proxy.vless.outbound.Config build() {
      com.xray.proxy.vless.outbound.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.proxy.vless.outbound.Config buildPartial() {
      com.xray.proxy.vless.outbound.Config result = new com.xray.proxy.vless.outbound.Config(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.xray.proxy.vless.outbound.Config result) {
      if (vnextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vnext_ = java.util.Collections.unmodifiableList(vnext_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vnext_ = vnext_;
      } else {
        result.vnext_ = vnextBuilder_.build();
      }
    }

    private void buildPartial0(com.xray.proxy.vless.outbound.Config result) {
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
      if (other instanceof com.xray.proxy.vless.outbound.Config) {
        return mergeFrom((com.xray.proxy.vless.outbound.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.proxy.vless.outbound.Config other) {
      if (other == com.xray.proxy.vless.outbound.Config.getDefaultInstance()) return this;
      if (vnextBuilder_ == null) {
        if (!other.vnext_.isEmpty()) {
          if (vnext_.isEmpty()) {
            vnext_ = other.vnext_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVnextIsMutable();
            vnext_.addAll(other.vnext_);
          }
          onChanged();
        }
      } else {
        if (!other.vnext_.isEmpty()) {
          if (vnextBuilder_.isEmpty()) {
            vnextBuilder_.dispose();
            vnextBuilder_ = null;
            vnext_ = other.vnext_;
            bitField0_ = (bitField0_ & ~0x00000001);
            vnextBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVnextFieldBuilder() : null;
          } else {
            vnextBuilder_.addAllMessages(other.vnext_);
          }
        }
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
              com.xray.common.protocol.ServerEndpoint m =
                  input.readMessage(
                      com.xray.common.protocol.ServerEndpoint.parser(),
                      extensionRegistry);
              if (vnextBuilder_ == null) {
                ensureVnextIsMutable();
                vnext_.add(m);
              } else {
                vnextBuilder_.addMessage(m);
              }
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

    private java.util.List<com.xray.common.protocol.ServerEndpoint> vnext_ =
      java.util.Collections.emptyList();
    private void ensureVnextIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vnext_ = new java.util.ArrayList<com.xray.common.protocol.ServerEndpoint>(vnext_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.common.protocol.ServerEndpoint, com.xray.common.protocol.ServerEndpoint.Builder, com.xray.common.protocol.ServerEndpointOrBuilder> vnextBuilder_;

    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public java.util.List<com.xray.common.protocol.ServerEndpoint> getVnextList() {
      if (vnextBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vnext_);
      } else {
        return vnextBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public int getVnextCount() {
      if (vnextBuilder_ == null) {
        return vnext_.size();
      } else {
        return vnextBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public com.xray.common.protocol.ServerEndpoint getVnext(int index) {
      if (vnextBuilder_ == null) {
        return vnext_.get(index);
      } else {
        return vnextBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder setVnext(
        int index, com.xray.common.protocol.ServerEndpoint value) {
      if (vnextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVnextIsMutable();
        vnext_.set(index, value);
        onChanged();
      } else {
        vnextBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder setVnext(
        int index, com.xray.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (vnextBuilder_ == null) {
        ensureVnextIsMutable();
        vnext_.set(index, builderForValue.build());
        onChanged();
      } else {
        vnextBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder addVnext(com.xray.common.protocol.ServerEndpoint value) {
      if (vnextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVnextIsMutable();
        vnext_.add(value);
        onChanged();
      } else {
        vnextBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder addVnext(
        int index, com.xray.common.protocol.ServerEndpoint value) {
      if (vnextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVnextIsMutable();
        vnext_.add(index, value);
        onChanged();
      } else {
        vnextBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder addVnext(
        com.xray.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (vnextBuilder_ == null) {
        ensureVnextIsMutable();
        vnext_.add(builderForValue.build());
        onChanged();
      } else {
        vnextBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder addVnext(
        int index, com.xray.common.protocol.ServerEndpoint.Builder builderForValue) {
      if (vnextBuilder_ == null) {
        ensureVnextIsMutable();
        vnext_.add(index, builderForValue.build());
        onChanged();
      } else {
        vnextBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder addAllVnext(
        java.lang.Iterable<? extends com.xray.common.protocol.ServerEndpoint> values) {
      if (vnextBuilder_ == null) {
        ensureVnextIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vnext_);
        onChanged();
      } else {
        vnextBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder clearVnext() {
      if (vnextBuilder_ == null) {
        vnext_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        vnextBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public Builder removeVnext(int index) {
      if (vnextBuilder_ == null) {
        ensureVnextIsMutable();
        vnext_.remove(index);
        onChanged();
      } else {
        vnextBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public com.xray.common.protocol.ServerEndpoint.Builder getVnextBuilder(
        int index) {
      return getVnextFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public com.xray.common.protocol.ServerEndpointOrBuilder getVnextOrBuilder(
        int index) {
      if (vnextBuilder_ == null) {
        return vnext_.get(index);  } else {
        return vnextBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public java.util.List<? extends com.xray.common.protocol.ServerEndpointOrBuilder> 
         getVnextOrBuilderList() {
      if (vnextBuilder_ != null) {
        return vnextBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vnext_);
      }
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public com.xray.common.protocol.ServerEndpoint.Builder addVnextBuilder() {
      return getVnextFieldBuilder().addBuilder(
          com.xray.common.protocol.ServerEndpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public com.xray.common.protocol.ServerEndpoint.Builder addVnextBuilder(
        int index) {
      return getVnextFieldBuilder().addBuilder(
          index, com.xray.common.protocol.ServerEndpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.common.protocol.ServerEndpoint vnext = 1;</code>
     */
    public java.util.List<com.xray.common.protocol.ServerEndpoint.Builder> 
         getVnextBuilderList() {
      return getVnextFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.common.protocol.ServerEndpoint, com.xray.common.protocol.ServerEndpoint.Builder, com.xray.common.protocol.ServerEndpointOrBuilder> 
        getVnextFieldBuilder() {
      if (vnextBuilder_ == null) {
        vnextBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.xray.common.protocol.ServerEndpoint, com.xray.common.protocol.ServerEndpoint.Builder, com.xray.common.protocol.ServerEndpointOrBuilder>(
                vnext_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vnext_ = null;
      }
      return vnextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.proxy.vless.outbound.Config)
  }

  // @@protoc_insertion_point(class_scope:xray.proxy.vless.outbound.Config)
  private static final com.xray.proxy.vless.outbound.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.proxy.vless.outbound.Config();
  }

  public static com.xray.proxy.vless.outbound.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
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

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.proxy.vless.outbound.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

