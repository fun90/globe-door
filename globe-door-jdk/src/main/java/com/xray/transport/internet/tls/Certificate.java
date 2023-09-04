// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/tls/config.proto

package com.xray.transport.internet.tls;

/**
 * Protobuf type {@code xray.transport.internet.tls.Certificate}
 */
public final class Certificate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.transport.internet.tls.Certificate)
    CertificateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Certificate.newBuilder() to construct.
  private Certificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Certificate() {
    certificate_ = com.google.protobuf.ByteString.EMPTY;
    key_ = com.google.protobuf.ByteString.EMPTY;
    usage_ = 0;
    certificatePath_ = "";
    keyPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Certificate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.transport.internet.tls.ConfigOuterClass.internal_static_xray_transport_internet_tls_Certificate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.transport.internet.tls.ConfigOuterClass.internal_static_xray_transport_internet_tls_Certificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.transport.internet.tls.Certificate.class, com.xray.transport.internet.tls.Certificate.Builder.class);
  }

  /**
   * Protobuf enum {@code xray.transport.internet.tls.Certificate.Usage}
   */
  public enum Usage
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENCIPHERMENT = 0;</code>
     */
    ENCIPHERMENT(0),
    /**
     * <code>AUTHORITY_VERIFY = 1;</code>
     */
    AUTHORITY_VERIFY(1),
    /**
     * <code>AUTHORITY_ISSUE = 2;</code>
     */
    AUTHORITY_ISSUE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ENCIPHERMENT = 0;</code>
     */
    public static final int ENCIPHERMENT_VALUE = 0;
    /**
     * <code>AUTHORITY_VERIFY = 1;</code>
     */
    public static final int AUTHORITY_VERIFY_VALUE = 1;
    /**
     * <code>AUTHORITY_ISSUE = 2;</code>
     */
    public static final int AUTHORITY_ISSUE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Usage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Usage forNumber(int value) {
      switch (value) {
        case 0: return ENCIPHERMENT;
        case 1: return AUTHORITY_VERIFY;
        case 2: return AUTHORITY_ISSUE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Usage>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Usage> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Usage>() {
            public Usage findValueByNumber(int number) {
              return Usage.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.xray.transport.internet.tls.Certificate.getDescriptor().getEnumTypes().get(0);
    }

    private static final Usage[] VALUES = values();

    public static Usage valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Usage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:xray.transport.internet.tls.Certificate.Usage)
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString certificate_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * TLS certificate in x509 format.
   * </pre>
   *
   * <code>bytes certificate = 1;</code>
   * @return The certificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCertificate() {
    return certificate_;
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * TLS key in x509 format.
   * </pre>
   *
   * <code>bytes key = 2;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int USAGE_FIELD_NUMBER = 3;
  private int usage_ = 0;
  /**
   * <code>.xray.transport.internet.tls.Certificate.Usage usage = 3;</code>
   * @return The enum numeric value on the wire for usage.
   */
  @java.lang.Override public int getUsageValue() {
    return usage_;
  }
  /**
   * <code>.xray.transport.internet.tls.Certificate.Usage usage = 3;</code>
   * @return The usage.
   */
  @java.lang.Override public com.xray.transport.internet.tls.Certificate.Usage getUsage() {
    com.xray.transport.internet.tls.Certificate.Usage result = com.xray.transport.internet.tls.Certificate.Usage.forNumber(usage_);
    return result == null ? com.xray.transport.internet.tls.Certificate.Usage.UNRECOGNIZED : result;
  }

  public static final int OCSP_STAPLING_FIELD_NUMBER = 4;
  private long ocspStapling_ = 0L;
  /**
   * <code>uint64 ocsp_stapling = 4;</code>
   * @return The ocspStapling.
   */
  @java.lang.Override
  public long getOcspStapling() {
    return ocspStapling_;
  }

  public static final int CERTIFICATE_PATH_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object certificatePath_ = "";
  /**
   * <pre>
   * TLS certificate path
   * </pre>
   *
   * <code>string certificate_path = 5;</code>
   * @return The certificatePath.
   */
  @java.lang.Override
  public java.lang.String getCertificatePath() {
    java.lang.Object ref = certificatePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificatePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * TLS certificate path
   * </pre>
   *
   * <code>string certificate_path = 5;</code>
   * @return The bytes for certificatePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCertificatePathBytes() {
    java.lang.Object ref = certificatePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certificatePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_PATH_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keyPath_ = "";
  /**
   * <pre>
   * TLS Key path
   * </pre>
   *
   * <code>string key_path = 6;</code>
   * @return The keyPath.
   */
  @java.lang.Override
  public java.lang.String getKeyPath() {
    java.lang.Object ref = keyPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * TLS Key path
   * </pre>
   *
   * <code>string key_path = 6;</code>
   * @return The bytes for keyPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyPathBytes() {
    java.lang.Object ref = keyPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ONE_TIME_LOADING_FIELD_NUMBER = 7;
  private boolean oneTimeLoading_ = false;
  /**
   * <pre>
   * If true, one-Time Loading
   * </pre>
   *
   * <code>bool One_time_loading = 7;</code>
   * @return The oneTimeLoading.
   */
  @java.lang.Override
  public boolean getOneTimeLoading() {
    return oneTimeLoading_;
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
    if (!certificate_.isEmpty()) {
      output.writeBytes(1, certificate_);
    }
    if (!key_.isEmpty()) {
      output.writeBytes(2, key_);
    }
    if (usage_ != com.xray.transport.internet.tls.Certificate.Usage.ENCIPHERMENT.getNumber()) {
      output.writeEnum(3, usage_);
    }
    if (ocspStapling_ != 0L) {
      output.writeUInt64(4, ocspStapling_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificatePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, certificatePath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, keyPath_);
    }
    if (oneTimeLoading_ != false) {
      output.writeBool(7, oneTimeLoading_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!certificate_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, certificate_);
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, key_);
    }
    if (usage_ != com.xray.transport.internet.tls.Certificate.Usage.ENCIPHERMENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, usage_);
    }
    if (ocspStapling_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, ocspStapling_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificatePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, certificatePath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, keyPath_);
    }
    if (oneTimeLoading_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, oneTimeLoading_);
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
    if (!(obj instanceof com.xray.transport.internet.tls.Certificate)) {
      return super.equals(obj);
    }
    com.xray.transport.internet.tls.Certificate other = (com.xray.transport.internet.tls.Certificate) obj;

    if (!getCertificate()
        .equals(other.getCertificate())) return false;
    if (!getKey()
        .equals(other.getKey())) return false;
    if (usage_ != other.usage_) return false;
    if (getOcspStapling()
        != other.getOcspStapling()) return false;
    if (!getCertificatePath()
        .equals(other.getCertificatePath())) return false;
    if (!getKeyPath()
        .equals(other.getKeyPath())) return false;
    if (getOneTimeLoading()
        != other.getOneTimeLoading()) return false;
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
    hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getCertificate().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + USAGE_FIELD_NUMBER;
    hash = (53 * hash) + usage_;
    hash = (37 * hash) + OCSP_STAPLING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOcspStapling());
    hash = (37 * hash) + CERTIFICATE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getCertificatePath().hashCode();
    hash = (37 * hash) + KEY_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getKeyPath().hashCode();
    hash = (37 * hash) + ONE_TIME_LOADING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOneTimeLoading());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.transport.internet.tls.Certificate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.transport.internet.tls.Certificate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.transport.internet.tls.Certificate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.transport.internet.tls.Certificate parseFrom(
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
  public static Builder newBuilder(com.xray.transport.internet.tls.Certificate prototype) {
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
   * Protobuf type {@code xray.transport.internet.tls.Certificate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.transport.internet.tls.Certificate)
      com.xray.transport.internet.tls.CertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.transport.internet.tls.ConfigOuterClass.internal_static_xray_transport_internet_tls_Certificate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.transport.internet.tls.ConfigOuterClass.internal_static_xray_transport_internet_tls_Certificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.transport.internet.tls.Certificate.class, com.xray.transport.internet.tls.Certificate.Builder.class);
    }

    // Construct using com.xray.transport.internet.tls.Certificate.newBuilder()
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
      certificate_ = com.google.protobuf.ByteString.EMPTY;
      key_ = com.google.protobuf.ByteString.EMPTY;
      usage_ = 0;
      ocspStapling_ = 0L;
      certificatePath_ = "";
      keyPath_ = "";
      oneTimeLoading_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.transport.internet.tls.ConfigOuterClass.internal_static_xray_transport_internet_tls_Certificate_descriptor;
    }

    @java.lang.Override
    public com.xray.transport.internet.tls.Certificate getDefaultInstanceForType() {
      return com.xray.transport.internet.tls.Certificate.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.transport.internet.tls.Certificate build() {
      com.xray.transport.internet.tls.Certificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.transport.internet.tls.Certificate buildPartial() {
      com.xray.transport.internet.tls.Certificate result = new com.xray.transport.internet.tls.Certificate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.xray.transport.internet.tls.Certificate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.certificate_ = certificate_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.usage_ = usage_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ocspStapling_ = ocspStapling_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.certificatePath_ = certificatePath_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.keyPath_ = keyPath_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.oneTimeLoading_ = oneTimeLoading_;
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
      if (other instanceof com.xray.transport.internet.tls.Certificate) {
        return mergeFrom((com.xray.transport.internet.tls.Certificate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.transport.internet.tls.Certificate other) {
      if (other == com.xray.transport.internet.tls.Certificate.getDefaultInstance()) return this;
      if (other.getCertificate() != com.google.protobuf.ByteString.EMPTY) {
        setCertificate(other.getCertificate());
      }
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.usage_ != 0) {
        setUsageValue(other.getUsageValue());
      }
      if (other.getOcspStapling() != 0L) {
        setOcspStapling(other.getOcspStapling());
      }
      if (!other.getCertificatePath().isEmpty()) {
        certificatePath_ = other.certificatePath_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getKeyPath().isEmpty()) {
        keyPath_ = other.keyPath_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (other.getOneTimeLoading() != false) {
        setOneTimeLoading(other.getOneTimeLoading());
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
              certificate_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              key_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              usage_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              ocspStapling_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              certificatePath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              keyPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 56: {
              oneTimeLoading_ = input.readBool();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private com.google.protobuf.ByteString certificate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes certificate = 1;</code>
     * @return The certificate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCertificate() {
      return certificate_;
    }
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes certificate = 1;</code>
     * @param value The certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificate(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      certificate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes certificate = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      certificate_ = getDefaultInstance().getCertificate();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes key = 2;</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes key = 2;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private int usage_ = 0;
    /**
     * <code>.xray.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @return The enum numeric value on the wire for usage.
     */
    @java.lang.Override public int getUsageValue() {
      return usage_;
    }
    /**
     * <code>.xray.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @param value The enum numeric value on the wire for usage to set.
     * @return This builder for chaining.
     */
    public Builder setUsageValue(int value) {
      usage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @return The usage.
     */
    @java.lang.Override
    public com.xray.transport.internet.tls.Certificate.Usage getUsage() {
      com.xray.transport.internet.tls.Certificate.Usage result = com.xray.transport.internet.tls.Certificate.Usage.forNumber(usage_);
      return result == null ? com.xray.transport.internet.tls.Certificate.Usage.UNRECOGNIZED : result;
    }
    /**
     * <code>.xray.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @param value The usage to set.
     * @return This builder for chaining.
     */
    public Builder setUsage(com.xray.transport.internet.tls.Certificate.Usage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      usage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.xray.transport.internet.tls.Certificate.Usage usage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      usage_ = 0;
      onChanged();
      return this;
    }

    private long ocspStapling_ ;
    /**
     * <code>uint64 ocsp_stapling = 4;</code>
     * @return The ocspStapling.
     */
    @java.lang.Override
    public long getOcspStapling() {
      return ocspStapling_;
    }
    /**
     * <code>uint64 ocsp_stapling = 4;</code>
     * @param value The ocspStapling to set.
     * @return This builder for chaining.
     */
    public Builder setOcspStapling(long value) {
      
      ocspStapling_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ocsp_stapling = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcspStapling() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ocspStapling_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object certificatePath_ = "";
    /**
     * <pre>
     * TLS certificate path
     * </pre>
     *
     * <code>string certificate_path = 5;</code>
     * @return The certificatePath.
     */
    public java.lang.String getCertificatePath() {
      java.lang.Object ref = certificatePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificatePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * TLS certificate path
     * </pre>
     *
     * <code>string certificate_path = 5;</code>
     * @return The bytes for certificatePath.
     */
    public com.google.protobuf.ByteString
        getCertificatePathBytes() {
      java.lang.Object ref = certificatePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certificatePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * TLS certificate path
     * </pre>
     *
     * <code>string certificate_path = 5;</code>
     * @param value The certificatePath to set.
     * @return This builder for chaining.
     */
    public Builder setCertificatePath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      certificatePath_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS certificate path
     * </pre>
     *
     * <code>string certificate_path = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificatePath() {
      certificatePath_ = getDefaultInstance().getCertificatePath();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS certificate path
     * </pre>
     *
     * <code>string certificate_path = 5;</code>
     * @param value The bytes for certificatePath to set.
     * @return This builder for chaining.
     */
    public Builder setCertificatePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      certificatePath_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object keyPath_ = "";
    /**
     * <pre>
     * TLS Key path
     * </pre>
     *
     * <code>string key_path = 6;</code>
     * @return The keyPath.
     */
    public java.lang.String getKeyPath() {
      java.lang.Object ref = keyPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * TLS Key path
     * </pre>
     *
     * <code>string key_path = 6;</code>
     * @return The bytes for keyPath.
     */
    public com.google.protobuf.ByteString
        getKeyPathBytes() {
      java.lang.Object ref = keyPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * TLS Key path
     * </pre>
     *
     * <code>string key_path = 6;</code>
     * @param value The keyPath to set.
     * @return This builder for chaining.
     */
    public Builder setKeyPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keyPath_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS Key path
     * </pre>
     *
     * <code>string key_path = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyPath() {
      keyPath_ = getDefaultInstance().getKeyPath();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS Key path
     * </pre>
     *
     * <code>string key_path = 6;</code>
     * @param value The bytes for keyPath to set.
     * @return This builder for chaining.
     */
    public Builder setKeyPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keyPath_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private boolean oneTimeLoading_ ;
    /**
     * <pre>
     * If true, one-Time Loading
     * </pre>
     *
     * <code>bool One_time_loading = 7;</code>
     * @return The oneTimeLoading.
     */
    @java.lang.Override
    public boolean getOneTimeLoading() {
      return oneTimeLoading_;
    }
    /**
     * <pre>
     * If true, one-Time Loading
     * </pre>
     *
     * <code>bool One_time_loading = 7;</code>
     * @param value The oneTimeLoading to set.
     * @return This builder for chaining.
     */
    public Builder setOneTimeLoading(boolean value) {
      
      oneTimeLoading_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, one-Time Loading
     * </pre>
     *
     * <code>bool One_time_loading = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearOneTimeLoading() {
      bitField0_ = (bitField0_ & ~0x00000040);
      oneTimeLoading_ = false;
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


    // @@protoc_insertion_point(builder_scope:xray.transport.internet.tls.Certificate)
  }

  // @@protoc_insertion_point(class_scope:xray.transport.internet.tls.Certificate)
  private static final com.xray.transport.internet.tls.Certificate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.transport.internet.tls.Certificate();
  }

  public static com.xray.transport.internet.tls.Certificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Certificate>
      PARSER = new com.google.protobuf.AbstractParser<Certificate>() {
    @java.lang.Override
    public Certificate parsePartialFrom(
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

  public static com.google.protobuf.Parser<Certificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Certificate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.transport.internet.tls.Certificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
