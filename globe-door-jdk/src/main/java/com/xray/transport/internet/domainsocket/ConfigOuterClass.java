// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/domainsocket/config.proto

package com.xray.transport.internet.domainsocket;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_transport_internet_domainsocket_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_internet_domainsocket_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,transport/internet/domainsocket/config" +
      ".proto\022$xray.transport.internet.domainso" +
      "cket\"9\n\006Config\022\014\n\004path\030\001 \001(\t\022\020\n\010abstract" +
      "\030\002 \001(\010\022\017\n\007padding\030\003 \001(\010B\216\001\n(com.xray.tra" +
      "nsport.internet.domainsocketP\001Z9github.c" +
      "om/xtls/xray-core/transport/internet/dom" +
      "ainsocket\252\002$Xray.Transport.Internet.Doma" +
      "inSocketb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_transport_internet_domainsocket_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_transport_internet_domainsocket_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_internet_domainsocket_Config_descriptor,
        new java.lang.String[] { "Path", "Abstract", "Padding", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
