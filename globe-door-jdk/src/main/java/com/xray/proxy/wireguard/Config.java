// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/wireguard/config.proto

package com.xray.proxy.wireguard;

public final class Config {
  private Config() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_wireguard_PeerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_wireguard_PeerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_wireguard_DeviceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_wireguard_DeviceConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034proxy/wireguard/config.proto\022\024xray.pro" +
      "xy.wireguard\"s\n\nPeerConfig\022\022\n\npublic_key" +
      "\030\001 \001(\t\022\026\n\016pre_shared_key\030\002 \001(\t\022\020\n\010endpoi" +
      "nt\030\003 \001(\t\022\022\n\nkeep_alive\030\004 \001(\005\022\023\n\013allowed_" +
      "ips\030\005 \003(\t\"\231\001\n\014DeviceConfig\022\022\n\nsecret_key" +
      "\030\001 \001(\t\022\020\n\010endpoint\030\002 \003(\t\022/\n\005peers\030\003 \003(\0132" +
      " .xray.proxy.wireguard.PeerConfig\022\013\n\003mtu" +
      "\030\004 \001(\005\022\023\n\013num_workers\030\005 \001(\005\022\020\n\010reserved\030" +
      "\006 \001(\014B^\n\030com.xray.proxy.wireguardP\001Z)git" +
      "hub.com/xtls/xray-core/proxy/wireguard\252\002" +
      "\024Xray.Proxy.WireGuardb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_proxy_wireguard_PeerConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_proxy_wireguard_PeerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_wireguard_PeerConfig_descriptor,
        new java.lang.String[] { "PublicKey", "PreSharedKey", "Endpoint", "KeepAlive", "AllowedIps", });
    internal_static_xray_proxy_wireguard_DeviceConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_proxy_wireguard_DeviceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_wireguard_DeviceConfig_descriptor,
        new java.lang.String[] { "SecretKey", "Endpoint", "Peers", "Mtu", "NumWorkers", "Reserved", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}