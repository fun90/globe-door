// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vless/inbound/config.proto

package com.xray.proxy.vless.inbound;

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
    internal_static_xray_proxy_vless_inbound_Fallback_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_vless_inbound_Fallback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_vless_inbound_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_vless_inbound_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n proxy/vless/inbound/config.proto\022\030xray" +
      ".proxy.vless.inbound\032\032common/protocol/us" +
      "er.proto\"^\n\010Fallback\022\014\n\004name\030\001 \001(\t\022\014\n\004al" +
      "pn\030\002 \001(\t\022\014\n\004path\030\003 \001(\t\022\014\n\004type\030\004 \001(\t\022\014\n\004" +
      "dest\030\005 \001(\t\022\014\n\004xver\030\006 \001(\004\"\200\001\n\006Config\022+\n\007c" +
      "lients\030\001 \003(\0132\032.xray.common.protocol.User" +
      "\022\022\n\ndecryption\030\002 \001(\t\0225\n\tfallbacks\030\003 \003(\0132" +
      "\".xray.proxy.vless.inbound.FallbackBj\n\034c" +
      "om.xray.proxy.vless.inboundP\001Z-github.co" +
      "m/xtls/xray-core/proxy/vless/inbound\252\002\030X" +
      "ray.Proxy.Vless.Inboundb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xray.common.protocol.UserOuterClass.getDescriptor(),
        });
    internal_static_xray_proxy_vless_inbound_Fallback_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_proxy_vless_inbound_Fallback_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_vless_inbound_Fallback_descriptor,
        new java.lang.String[] { "Name", "Alpn", "Path", "Type", "Dest", "Xver", });
    internal_static_xray_proxy_vless_inbound_Config_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_proxy_vless_inbound_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_vless_inbound_Config_descriptor,
        new java.lang.String[] { "Clients", "Decryption", "Fallbacks", });
    com.xray.common.protocol.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
