// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/global/config.proto

package com.xray.transport.global;

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
    internal_static_xray_transport_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035transport/global/config.proto\022\016xray.tr" +
      "ansport\032\037transport/internet/config.proto" +
      "\"R\n\006Config\022D\n\022transport_settings\030\001 \003(\0132(" +
      ".xray.transport.internet.TransportConfig" +
      ":\002\030\001Ba\n\031com.xray.transport.globalP\001Z*git" +
      "hub.com/xtls/xray-core/transport/global\252" +
      "\002\025Xray.Transport.Globalb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xray.transport.internet.Config.getDescriptor(),
        });
    internal_static_xray_transport_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_transport_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_Config_descriptor,
        new java.lang.String[] { "TransportSettings", });
    com.xray.transport.internet.Config.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
