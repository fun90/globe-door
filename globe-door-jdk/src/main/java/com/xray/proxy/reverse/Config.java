// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/reverse/config.proto

package com.xray.proxy.reverse;

/**
 * Protobuf type {@code xray.app.reverse.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.reverse.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    bridgeConfig_ = java.util.Collections.emptyList();
    portalConfig_ = java.util.Collections.emptyList();
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
    return com.xray.proxy.reverse.ConfigOuterClass.internal_static_xray_app_reverse_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.proxy.reverse.ConfigOuterClass.internal_static_xray_app_reverse_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.proxy.reverse.Config.class, com.xray.proxy.reverse.Config.Builder.class);
  }

  public static final int BRIDGE_CONFIG_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.xray.proxy.reverse.BridgeConfig> bridgeConfig_;
  /**
   * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.xray.proxy.reverse.BridgeConfig> getBridgeConfigList() {
    return bridgeConfig_;
  }
  /**
   * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.xray.proxy.reverse.BridgeConfigOrBuilder> 
      getBridgeConfigOrBuilderList() {
    return bridgeConfig_;
  }
  /**
   * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
   */
  @java.lang.Override
  public int getBridgeConfigCount() {
    return bridgeConfig_.size();
  }
  /**
   * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
   */
  @java.lang.Override
  public com.xray.proxy.reverse.BridgeConfig getBridgeConfig(int index) {
    return bridgeConfig_.get(index);
  }
  /**
   * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
   */
  @java.lang.Override
  public com.xray.proxy.reverse.BridgeConfigOrBuilder getBridgeConfigOrBuilder(
      int index) {
    return bridgeConfig_.get(index);
  }

  public static final int PORTAL_CONFIG_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.xray.proxy.reverse.PortalConfig> portalConfig_;
  /**
   * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.xray.proxy.reverse.PortalConfig> getPortalConfigList() {
    return portalConfig_;
  }
  /**
   * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.xray.proxy.reverse.PortalConfigOrBuilder> 
      getPortalConfigOrBuilderList() {
    return portalConfig_;
  }
  /**
   * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
   */
  @java.lang.Override
  public int getPortalConfigCount() {
    return portalConfig_.size();
  }
  /**
   * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
   */
  @java.lang.Override
  public com.xray.proxy.reverse.PortalConfig getPortalConfig(int index) {
    return portalConfig_.get(index);
  }
  /**
   * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
   */
  @java.lang.Override
  public com.xray.proxy.reverse.PortalConfigOrBuilder getPortalConfigOrBuilder(
      int index) {
    return portalConfig_.get(index);
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
    for (int i = 0; i < bridgeConfig_.size(); i++) {
      output.writeMessage(1, bridgeConfig_.get(i));
    }
    for (int i = 0; i < portalConfig_.size(); i++) {
      output.writeMessage(2, portalConfig_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bridgeConfig_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bridgeConfig_.get(i));
    }
    for (int i = 0; i < portalConfig_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, portalConfig_.get(i));
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
    if (!(obj instanceof com.xray.proxy.reverse.Config)) {
      return super.equals(obj);
    }
    com.xray.proxy.reverse.Config other = (com.xray.proxy.reverse.Config) obj;

    if (!getBridgeConfigList()
        .equals(other.getBridgeConfigList())) return false;
    if (!getPortalConfigList()
        .equals(other.getPortalConfigList())) return false;
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
    if (getBridgeConfigCount() > 0) {
      hash = (37 * hash) + BRIDGE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getBridgeConfigList().hashCode();
    }
    if (getPortalConfigCount() > 0) {
      hash = (37 * hash) + PORTAL_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getPortalConfigList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.proxy.reverse.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.reverse.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.reverse.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.reverse.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.reverse.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.reverse.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.reverse.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.reverse.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.reverse.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.proxy.reverse.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.reverse.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.reverse.Config parseFrom(
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
  public static Builder newBuilder(com.xray.proxy.reverse.Config prototype) {
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
   * Protobuf type {@code xray.app.reverse.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.reverse.Config)
      com.xray.proxy.reverse.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.proxy.reverse.ConfigOuterClass.internal_static_xray_app_reverse_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.proxy.reverse.ConfigOuterClass.internal_static_xray_app_reverse_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.proxy.reverse.Config.class, com.xray.proxy.reverse.Config.Builder.class);
    }

    // Construct using com.xray.proxy.reverse.Config.newBuilder()
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
      if (bridgeConfigBuilder_ == null) {
        bridgeConfig_ = java.util.Collections.emptyList();
      } else {
        bridgeConfig_ = null;
        bridgeConfigBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (portalConfigBuilder_ == null) {
        portalConfig_ = java.util.Collections.emptyList();
      } else {
        portalConfig_ = null;
        portalConfigBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.proxy.reverse.ConfigOuterClass.internal_static_xray_app_reverse_Config_descriptor;
    }

    @java.lang.Override
    public com.xray.proxy.reverse.Config getDefaultInstanceForType() {
      return com.xray.proxy.reverse.Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.proxy.reverse.Config build() {
      com.xray.proxy.reverse.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.proxy.reverse.Config buildPartial() {
      com.xray.proxy.reverse.Config result = new com.xray.proxy.reverse.Config(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.xray.proxy.reverse.Config result) {
      if (bridgeConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bridgeConfig_ = java.util.Collections.unmodifiableList(bridgeConfig_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bridgeConfig_ = bridgeConfig_;
      } else {
        result.bridgeConfig_ = bridgeConfigBuilder_.build();
      }
      if (portalConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          portalConfig_ = java.util.Collections.unmodifiableList(portalConfig_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.portalConfig_ = portalConfig_;
      } else {
        result.portalConfig_ = portalConfigBuilder_.build();
      }
    }

    private void buildPartial0(com.xray.proxy.reverse.Config result) {
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
      if (other instanceof com.xray.proxy.reverse.Config) {
        return mergeFrom((com.xray.proxy.reverse.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.proxy.reverse.Config other) {
      if (other == com.xray.proxy.reverse.Config.getDefaultInstance()) return this;
      if (bridgeConfigBuilder_ == null) {
        if (!other.bridgeConfig_.isEmpty()) {
          if (bridgeConfig_.isEmpty()) {
            bridgeConfig_ = other.bridgeConfig_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBridgeConfigIsMutable();
            bridgeConfig_.addAll(other.bridgeConfig_);
          }
          onChanged();
        }
      } else {
        if (!other.bridgeConfig_.isEmpty()) {
          if (bridgeConfigBuilder_.isEmpty()) {
            bridgeConfigBuilder_.dispose();
            bridgeConfigBuilder_ = null;
            bridgeConfig_ = other.bridgeConfig_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bridgeConfigBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBridgeConfigFieldBuilder() : null;
          } else {
            bridgeConfigBuilder_.addAllMessages(other.bridgeConfig_);
          }
        }
      }
      if (portalConfigBuilder_ == null) {
        if (!other.portalConfig_.isEmpty()) {
          if (portalConfig_.isEmpty()) {
            portalConfig_ = other.portalConfig_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePortalConfigIsMutable();
            portalConfig_.addAll(other.portalConfig_);
          }
          onChanged();
        }
      } else {
        if (!other.portalConfig_.isEmpty()) {
          if (portalConfigBuilder_.isEmpty()) {
            portalConfigBuilder_.dispose();
            portalConfigBuilder_ = null;
            portalConfig_ = other.portalConfig_;
            bitField0_ = (bitField0_ & ~0x00000002);
            portalConfigBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPortalConfigFieldBuilder() : null;
          } else {
            portalConfigBuilder_.addAllMessages(other.portalConfig_);
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
              com.xray.proxy.reverse.BridgeConfig m =
                  input.readMessage(
                      com.xray.proxy.reverse.BridgeConfig.parser(),
                      extensionRegistry);
              if (bridgeConfigBuilder_ == null) {
                ensureBridgeConfigIsMutable();
                bridgeConfig_.add(m);
              } else {
                bridgeConfigBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              com.xray.proxy.reverse.PortalConfig m =
                  input.readMessage(
                      com.xray.proxy.reverse.PortalConfig.parser(),
                      extensionRegistry);
              if (portalConfigBuilder_ == null) {
                ensurePortalConfigIsMutable();
                portalConfig_.add(m);
              } else {
                portalConfigBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private java.util.List<com.xray.proxy.reverse.BridgeConfig> bridgeConfig_ =
      java.util.Collections.emptyList();
    private void ensureBridgeConfigIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bridgeConfig_ = new java.util.ArrayList<com.xray.proxy.reverse.BridgeConfig>(bridgeConfig_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.proxy.reverse.BridgeConfig, com.xray.proxy.reverse.BridgeConfig.Builder, com.xray.proxy.reverse.BridgeConfigOrBuilder> bridgeConfigBuilder_;

    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public java.util.List<com.xray.proxy.reverse.BridgeConfig> getBridgeConfigList() {
      if (bridgeConfigBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bridgeConfig_);
      } else {
        return bridgeConfigBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public int getBridgeConfigCount() {
      if (bridgeConfigBuilder_ == null) {
        return bridgeConfig_.size();
      } else {
        return bridgeConfigBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public com.xray.proxy.reverse.BridgeConfig getBridgeConfig(int index) {
      if (bridgeConfigBuilder_ == null) {
        return bridgeConfig_.get(index);
      } else {
        return bridgeConfigBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder setBridgeConfig(
        int index, com.xray.proxy.reverse.BridgeConfig value) {
      if (bridgeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBridgeConfigIsMutable();
        bridgeConfig_.set(index, value);
        onChanged();
      } else {
        bridgeConfigBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder setBridgeConfig(
        int index, com.xray.proxy.reverse.BridgeConfig.Builder builderForValue) {
      if (bridgeConfigBuilder_ == null) {
        ensureBridgeConfigIsMutable();
        bridgeConfig_.set(index, builderForValue.build());
        onChanged();
      } else {
        bridgeConfigBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder addBridgeConfig(com.xray.proxy.reverse.BridgeConfig value) {
      if (bridgeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBridgeConfigIsMutable();
        bridgeConfig_.add(value);
        onChanged();
      } else {
        bridgeConfigBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder addBridgeConfig(
        int index, com.xray.proxy.reverse.BridgeConfig value) {
      if (bridgeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBridgeConfigIsMutable();
        bridgeConfig_.add(index, value);
        onChanged();
      } else {
        bridgeConfigBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder addBridgeConfig(
        com.xray.proxy.reverse.BridgeConfig.Builder builderForValue) {
      if (bridgeConfigBuilder_ == null) {
        ensureBridgeConfigIsMutable();
        bridgeConfig_.add(builderForValue.build());
        onChanged();
      } else {
        bridgeConfigBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder addBridgeConfig(
        int index, com.xray.proxy.reverse.BridgeConfig.Builder builderForValue) {
      if (bridgeConfigBuilder_ == null) {
        ensureBridgeConfigIsMutable();
        bridgeConfig_.add(index, builderForValue.build());
        onChanged();
      } else {
        bridgeConfigBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder addAllBridgeConfig(
        java.lang.Iterable<? extends com.xray.proxy.reverse.BridgeConfig> values) {
      if (bridgeConfigBuilder_ == null) {
        ensureBridgeConfigIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bridgeConfig_);
        onChanged();
      } else {
        bridgeConfigBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder clearBridgeConfig() {
      if (bridgeConfigBuilder_ == null) {
        bridgeConfig_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bridgeConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public Builder removeBridgeConfig(int index) {
      if (bridgeConfigBuilder_ == null) {
        ensureBridgeConfigIsMutable();
        bridgeConfig_.remove(index);
        onChanged();
      } else {
        bridgeConfigBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public com.xray.proxy.reverse.BridgeConfig.Builder getBridgeConfigBuilder(
        int index) {
      return getBridgeConfigFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public com.xray.proxy.reverse.BridgeConfigOrBuilder getBridgeConfigOrBuilder(
        int index) {
      if (bridgeConfigBuilder_ == null) {
        return bridgeConfig_.get(index);  } else {
        return bridgeConfigBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public java.util.List<? extends com.xray.proxy.reverse.BridgeConfigOrBuilder> 
         getBridgeConfigOrBuilderList() {
      if (bridgeConfigBuilder_ != null) {
        return bridgeConfigBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bridgeConfig_);
      }
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public com.xray.proxy.reverse.BridgeConfig.Builder addBridgeConfigBuilder() {
      return getBridgeConfigFieldBuilder().addBuilder(
          com.xray.proxy.reverse.BridgeConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public com.xray.proxy.reverse.BridgeConfig.Builder addBridgeConfigBuilder(
        int index) {
      return getBridgeConfigFieldBuilder().addBuilder(
          index, com.xray.proxy.reverse.BridgeConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.reverse.BridgeConfig bridge_config = 1;</code>
     */
    public java.util.List<com.xray.proxy.reverse.BridgeConfig.Builder> 
         getBridgeConfigBuilderList() {
      return getBridgeConfigFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.proxy.reverse.BridgeConfig, com.xray.proxy.reverse.BridgeConfig.Builder, com.xray.proxy.reverse.BridgeConfigOrBuilder> 
        getBridgeConfigFieldBuilder() {
      if (bridgeConfigBuilder_ == null) {
        bridgeConfigBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.xray.proxy.reverse.BridgeConfig, com.xray.proxy.reverse.BridgeConfig.Builder, com.xray.proxy.reverse.BridgeConfigOrBuilder>(
                bridgeConfig_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bridgeConfig_ = null;
      }
      return bridgeConfigBuilder_;
    }

    private java.util.List<com.xray.proxy.reverse.PortalConfig> portalConfig_ =
      java.util.Collections.emptyList();
    private void ensurePortalConfigIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        portalConfig_ = new java.util.ArrayList<com.xray.proxy.reverse.PortalConfig>(portalConfig_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.proxy.reverse.PortalConfig, com.xray.proxy.reverse.PortalConfig.Builder, com.xray.proxy.reverse.PortalConfigOrBuilder> portalConfigBuilder_;

    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public java.util.List<com.xray.proxy.reverse.PortalConfig> getPortalConfigList() {
      if (portalConfigBuilder_ == null) {
        return java.util.Collections.unmodifiableList(portalConfig_);
      } else {
        return portalConfigBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public int getPortalConfigCount() {
      if (portalConfigBuilder_ == null) {
        return portalConfig_.size();
      } else {
        return portalConfigBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public com.xray.proxy.reverse.PortalConfig getPortalConfig(int index) {
      if (portalConfigBuilder_ == null) {
        return portalConfig_.get(index);
      } else {
        return portalConfigBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder setPortalConfig(
        int index, com.xray.proxy.reverse.PortalConfig value) {
      if (portalConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePortalConfigIsMutable();
        portalConfig_.set(index, value);
        onChanged();
      } else {
        portalConfigBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder setPortalConfig(
        int index, com.xray.proxy.reverse.PortalConfig.Builder builderForValue) {
      if (portalConfigBuilder_ == null) {
        ensurePortalConfigIsMutable();
        portalConfig_.set(index, builderForValue.build());
        onChanged();
      } else {
        portalConfigBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder addPortalConfig(com.xray.proxy.reverse.PortalConfig value) {
      if (portalConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePortalConfigIsMutable();
        portalConfig_.add(value);
        onChanged();
      } else {
        portalConfigBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder addPortalConfig(
        int index, com.xray.proxy.reverse.PortalConfig value) {
      if (portalConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePortalConfigIsMutable();
        portalConfig_.add(index, value);
        onChanged();
      } else {
        portalConfigBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder addPortalConfig(
        com.xray.proxy.reverse.PortalConfig.Builder builderForValue) {
      if (portalConfigBuilder_ == null) {
        ensurePortalConfigIsMutable();
        portalConfig_.add(builderForValue.build());
        onChanged();
      } else {
        portalConfigBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder addPortalConfig(
        int index, com.xray.proxy.reverse.PortalConfig.Builder builderForValue) {
      if (portalConfigBuilder_ == null) {
        ensurePortalConfigIsMutable();
        portalConfig_.add(index, builderForValue.build());
        onChanged();
      } else {
        portalConfigBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder addAllPortalConfig(
        java.lang.Iterable<? extends com.xray.proxy.reverse.PortalConfig> values) {
      if (portalConfigBuilder_ == null) {
        ensurePortalConfigIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, portalConfig_);
        onChanged();
      } else {
        portalConfigBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder clearPortalConfig() {
      if (portalConfigBuilder_ == null) {
        portalConfig_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        portalConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public Builder removePortalConfig(int index) {
      if (portalConfigBuilder_ == null) {
        ensurePortalConfigIsMutable();
        portalConfig_.remove(index);
        onChanged();
      } else {
        portalConfigBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public com.xray.proxy.reverse.PortalConfig.Builder getPortalConfigBuilder(
        int index) {
      return getPortalConfigFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public com.xray.proxy.reverse.PortalConfigOrBuilder getPortalConfigOrBuilder(
        int index) {
      if (portalConfigBuilder_ == null) {
        return portalConfig_.get(index);  } else {
        return portalConfigBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public java.util.List<? extends com.xray.proxy.reverse.PortalConfigOrBuilder> 
         getPortalConfigOrBuilderList() {
      if (portalConfigBuilder_ != null) {
        return portalConfigBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(portalConfig_);
      }
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public com.xray.proxy.reverse.PortalConfig.Builder addPortalConfigBuilder() {
      return getPortalConfigFieldBuilder().addBuilder(
          com.xray.proxy.reverse.PortalConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public com.xray.proxy.reverse.PortalConfig.Builder addPortalConfigBuilder(
        int index) {
      return getPortalConfigFieldBuilder().addBuilder(
          index, com.xray.proxy.reverse.PortalConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.reverse.PortalConfig portal_config = 2;</code>
     */
    public java.util.List<com.xray.proxy.reverse.PortalConfig.Builder> 
         getPortalConfigBuilderList() {
      return getPortalConfigFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.proxy.reverse.PortalConfig, com.xray.proxy.reverse.PortalConfig.Builder, com.xray.proxy.reverse.PortalConfigOrBuilder> 
        getPortalConfigFieldBuilder() {
      if (portalConfigBuilder_ == null) {
        portalConfigBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.xray.proxy.reverse.PortalConfig, com.xray.proxy.reverse.PortalConfig.Builder, com.xray.proxy.reverse.PortalConfigOrBuilder>(
                portalConfig_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        portalConfig_ = null;
      }
      return portalConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.app.reverse.Config)
  }

  // @@protoc_insertion_point(class_scope:xray.app.reverse.Config)
  private static final com.xray.proxy.reverse.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.proxy.reverse.Config();
  }

  public static com.xray.proxy.reverse.Config getDefaultInstance() {
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
  public com.xray.proxy.reverse.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

