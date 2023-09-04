// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/stats/command/command.proto

package com.xray.app.stats.command;

/**
 * Protobuf type {@code xray.app.stats.command.QueryStatsResponse}
 */
public final class QueryStatsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.stats.command.QueryStatsResponse)
    QueryStatsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryStatsResponse.newBuilder() to construct.
  private QueryStatsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryStatsResponse() {
    stat_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryStatsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.stats.command.QueryStatsResponse.class, com.xray.app.stats.command.QueryStatsResponse.Builder.class);
  }

  public static final int STAT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.xray.app.stats.command.Stat> stat_;
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.xray.app.stats.command.Stat> getStatList() {
    return stat_;
  }
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.xray.app.stats.command.StatOrBuilder> 
      getStatOrBuilderList() {
    return stat_;
  }
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  @java.lang.Override
  public int getStatCount() {
    return stat_.size();
  }
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  @java.lang.Override
  public com.xray.app.stats.command.Stat getStat(int index) {
    return stat_.get(index);
  }
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  @java.lang.Override
  public com.xray.app.stats.command.StatOrBuilder getStatOrBuilder(
      int index) {
    return stat_.get(index);
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
    for (int i = 0; i < stat_.size(); i++) {
      output.writeMessage(1, stat_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stat_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, stat_.get(i));
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
    if (!(obj instanceof com.xray.app.stats.command.QueryStatsResponse)) {
      return super.equals(obj);
    }
    com.xray.app.stats.command.QueryStatsResponse other = (com.xray.app.stats.command.QueryStatsResponse) obj;

    if (!getStatList()
        .equals(other.getStatList())) return false;
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
    if (getStatCount() > 0) {
      hash = (37 * hash) + STAT_FIELD_NUMBER;
      hash = (53 * hash) + getStatList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.stats.command.QueryStatsResponse parseFrom(
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
  public static Builder newBuilder(com.xray.app.stats.command.QueryStatsResponse prototype) {
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
   * Protobuf type {@code xray.app.stats.command.QueryStatsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.stats.command.QueryStatsResponse)
      com.xray.app.stats.command.QueryStatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.stats.command.QueryStatsResponse.class, com.xray.app.stats.command.QueryStatsResponse.Builder.class);
    }

    // Construct using com.xray.app.stats.command.QueryStatsResponse.newBuilder()
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
      if (statBuilder_ == null) {
        stat_ = java.util.Collections.emptyList();
      } else {
        stat_ = null;
        statBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsResponse_descriptor;
    }

    @java.lang.Override
    public com.xray.app.stats.command.QueryStatsResponse getDefaultInstanceForType() {
      return com.xray.app.stats.command.QueryStatsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.stats.command.QueryStatsResponse build() {
      com.xray.app.stats.command.QueryStatsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.stats.command.QueryStatsResponse buildPartial() {
      com.xray.app.stats.command.QueryStatsResponse result = new com.xray.app.stats.command.QueryStatsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.xray.app.stats.command.QueryStatsResponse result) {
      if (statBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stat_ = java.util.Collections.unmodifiableList(stat_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stat_ = stat_;
      } else {
        result.stat_ = statBuilder_.build();
      }
    }

    private void buildPartial0(com.xray.app.stats.command.QueryStatsResponse result) {
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
      if (other instanceof com.xray.app.stats.command.QueryStatsResponse) {
        return mergeFrom((com.xray.app.stats.command.QueryStatsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.stats.command.QueryStatsResponse other) {
      if (other == com.xray.app.stats.command.QueryStatsResponse.getDefaultInstance()) return this;
      if (statBuilder_ == null) {
        if (!other.stat_.isEmpty()) {
          if (stat_.isEmpty()) {
            stat_ = other.stat_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatIsMutable();
            stat_.addAll(other.stat_);
          }
          onChanged();
        }
      } else {
        if (!other.stat_.isEmpty()) {
          if (statBuilder_.isEmpty()) {
            statBuilder_.dispose();
            statBuilder_ = null;
            stat_ = other.stat_;
            bitField0_ = (bitField0_ & ~0x00000001);
            statBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStatFieldBuilder() : null;
          } else {
            statBuilder_.addAllMessages(other.stat_);
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
              com.xray.app.stats.command.Stat m =
                  input.readMessage(
                      com.xray.app.stats.command.Stat.parser(),
                      extensionRegistry);
              if (statBuilder_ == null) {
                ensureStatIsMutable();
                stat_.add(m);
              } else {
                statBuilder_.addMessage(m);
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

    private java.util.List<com.xray.app.stats.command.Stat> stat_ =
      java.util.Collections.emptyList();
    private void ensureStatIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stat_ = new java.util.ArrayList<com.xray.app.stats.command.Stat>(stat_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.app.stats.command.Stat, com.xray.app.stats.command.Stat.Builder, com.xray.app.stats.command.StatOrBuilder> statBuilder_;

    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public java.util.List<com.xray.app.stats.command.Stat> getStatList() {
      if (statBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stat_);
      } else {
        return statBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public int getStatCount() {
      if (statBuilder_ == null) {
        return stat_.size();
      } else {
        return statBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public com.xray.app.stats.command.Stat getStat(int index) {
      if (statBuilder_ == null) {
        return stat_.get(index);
      } else {
        return statBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder setStat(
        int index, com.xray.app.stats.command.Stat value) {
      if (statBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatIsMutable();
        stat_.set(index, value);
        onChanged();
      } else {
        statBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder setStat(
        int index, com.xray.app.stats.command.Stat.Builder builderForValue) {
      if (statBuilder_ == null) {
        ensureStatIsMutable();
        stat_.set(index, builderForValue.build());
        onChanged();
      } else {
        statBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder addStat(com.xray.app.stats.command.Stat value) {
      if (statBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatIsMutable();
        stat_.add(value);
        onChanged();
      } else {
        statBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder addStat(
        int index, com.xray.app.stats.command.Stat value) {
      if (statBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatIsMutable();
        stat_.add(index, value);
        onChanged();
      } else {
        statBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder addStat(
        com.xray.app.stats.command.Stat.Builder builderForValue) {
      if (statBuilder_ == null) {
        ensureStatIsMutable();
        stat_.add(builderForValue.build());
        onChanged();
      } else {
        statBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder addStat(
        int index, com.xray.app.stats.command.Stat.Builder builderForValue) {
      if (statBuilder_ == null) {
        ensureStatIsMutable();
        stat_.add(index, builderForValue.build());
        onChanged();
      } else {
        statBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder addAllStat(
        java.lang.Iterable<? extends com.xray.app.stats.command.Stat> values) {
      if (statBuilder_ == null) {
        ensureStatIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stat_);
        onChanged();
      } else {
        statBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder clearStat() {
      if (statBuilder_ == null) {
        stat_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        statBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public Builder removeStat(int index) {
      if (statBuilder_ == null) {
        ensureStatIsMutable();
        stat_.remove(index);
        onChanged();
      } else {
        statBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public com.xray.app.stats.command.Stat.Builder getStatBuilder(
        int index) {
      return getStatFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public com.xray.app.stats.command.StatOrBuilder getStatOrBuilder(
        int index) {
      if (statBuilder_ == null) {
        return stat_.get(index);  } else {
        return statBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public java.util.List<? extends com.xray.app.stats.command.StatOrBuilder> 
         getStatOrBuilderList() {
      if (statBuilder_ != null) {
        return statBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stat_);
      }
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public com.xray.app.stats.command.Stat.Builder addStatBuilder() {
      return getStatFieldBuilder().addBuilder(
          com.xray.app.stats.command.Stat.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public com.xray.app.stats.command.Stat.Builder addStatBuilder(
        int index) {
      return getStatFieldBuilder().addBuilder(
          index, com.xray.app.stats.command.Stat.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
     */
    public java.util.List<com.xray.app.stats.command.Stat.Builder> 
         getStatBuilderList() {
      return getStatFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xray.app.stats.command.Stat, com.xray.app.stats.command.Stat.Builder, com.xray.app.stats.command.StatOrBuilder> 
        getStatFieldBuilder() {
      if (statBuilder_ == null) {
        statBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.xray.app.stats.command.Stat, com.xray.app.stats.command.Stat.Builder, com.xray.app.stats.command.StatOrBuilder>(
                stat_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        stat_ = null;
      }
      return statBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.app.stats.command.QueryStatsResponse)
  }

  // @@protoc_insertion_point(class_scope:xray.app.stats.command.QueryStatsResponse)
  private static final com.xray.app.stats.command.QueryStatsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.stats.command.QueryStatsResponse();
  }

  public static com.xray.app.stats.command.QueryStatsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryStatsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryStatsResponse>() {
    @java.lang.Override
    public QueryStatsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryStatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryStatsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.stats.command.QueryStatsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
