// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/dns/config.proto

package com.xray.app.dns;

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
    internal_static_xray_app_dns_NameServer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_dns_NameServer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_dns_NameServer_PriorityDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_dns_NameServer_PriorityDomain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_dns_NameServer_OriginalRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_dns_NameServer_OriginalRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_dns_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_dns_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_dns_Config_HostsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_dns_Config_HostsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_dns_Config_HostMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_dns_Config_HostMapping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024app/dns/config.proto\022\014xray.app.dns\032\030co" +
      "mmon/net/address.proto\032\034common/net/desti" +
      "nation.proto\032\027app/router/config.proto\"\212\003" +
      "\n\nNameServer\022*\n\007address\030\001 \001(\0132\031.xray.com" +
      "mon.net.Endpoint\022\021\n\tclient_ip\030\005 \001(\014\022\024\n\014s" +
      "kipFallback\030\006 \001(\010\022C\n\022prioritized_domain\030" +
      "\002 \003(\0132\'.xray.app.dns.NameServer.Priority" +
      "Domain\022%\n\005geoip\030\003 \003(\0132\026.xray.app.router." +
      "GeoIP\022=\n\016original_rules\030\004 \003(\0132%.xray.app" +
      ".dns.NameServer.OriginalRule\032P\n\016Priority" +
      "Domain\022.\n\004type\030\001 \001(\0162 .xray.app.dns.Doma" +
      "inMatchingType\022\016\n\006domain\030\002 \001(\t\032*\n\014Origin" +
      "alRule\022\014\n\004rule\030\001 \001(\t\022\014\n\004size\030\002 \001(\r\"\277\004\n\006C" +
      "onfig\0222\n\013NameServers\030\001 \003(\0132\031.xray.common" +
      ".net.EndpointB\002\030\001\022-\n\013name_server\030\005 \003(\0132\030" +
      ".xray.app.dns.NameServer\0222\n\005Hosts\030\002 \003(\0132" +
      "\037.xray.app.dns.Config.HostsEntryB\002\030\001\022\021\n\t" +
      "client_ip\030\003 \001(\014\0226\n\014static_hosts\030\004 \003(\0132 ." +
      "xray.app.dns.Config.HostMapping\022\013\n\003tag\030\006" +
      " \001(\t\022\024\n\014disableCache\030\010 \001(\010\0223\n\016query_stra" +
      "tegy\030\t \001(\0162\033.xray.app.dns.QueryStrategy\022" +
      "\027\n\017disableFallback\030\n \001(\010\022\036\n\026disableFallb" +
      "ackIfMatch\030\013 \001(\010\032I\n\nHostsEntry\022\013\n\003key\030\001 " +
      "\001(\t\022*\n\005value\030\002 \001(\0132\033.xray.common.net.IPO" +
      "rDomain:\0028\001\032q\n\013HostMapping\022.\n\004type\030\001 \001(\016" +
      "2 .xray.app.dns.DomainMatchingType\022\016\n\006do" +
      "main\030\002 \001(\t\022\n\n\002ip\030\003 \003(\014\022\026\n\016proxied_domain" +
      "\030\004 \001(\tJ\004\010\007\020\010*E\n\022DomainMatchingType\022\010\n\004Fu" +
      "ll\020\000\022\r\n\tSubdomain\020\001\022\013\n\007Keyword\020\002\022\t\n\005Rege" +
      "x\020\003*5\n\rQueryStrategy\022\n\n\006USE_IP\020\000\022\013\n\007USE_" +
      "IP4\020\001\022\013\n\007USE_IP6\020\002BF\n\020com.xray.app.dnsP\001" +
      "Z!github.com/xtls/xray-core/app/dns\252\002\014Xr" +
      "ay.App.Dnsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xray.common.net.Address.getDescriptor(),
          com.xray.common.net.Destination.getDescriptor(),
          com.xray.app.router.ConfigOuterClass.getDescriptor(),
        });
    internal_static_xray_app_dns_NameServer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_app_dns_NameServer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_dns_NameServer_descriptor,
        new java.lang.String[] { "Address", "ClientIp", "SkipFallback", "PrioritizedDomain", "Geoip", "OriginalRules", });
    internal_static_xray_app_dns_NameServer_PriorityDomain_descriptor =
      internal_static_xray_app_dns_NameServer_descriptor.getNestedTypes().get(0);
    internal_static_xray_app_dns_NameServer_PriorityDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_dns_NameServer_PriorityDomain_descriptor,
        new java.lang.String[] { "Type", "Domain", });
    internal_static_xray_app_dns_NameServer_OriginalRule_descriptor =
      internal_static_xray_app_dns_NameServer_descriptor.getNestedTypes().get(1);
    internal_static_xray_app_dns_NameServer_OriginalRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_dns_NameServer_OriginalRule_descriptor,
        new java.lang.String[] { "Rule", "Size", });
    internal_static_xray_app_dns_Config_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_app_dns_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_dns_Config_descriptor,
        new java.lang.String[] { "NameServers", "NameServer", "Hosts", "ClientIp", "StaticHosts", "Tag", "DisableCache", "QueryStrategy", "DisableFallback", "DisableFallbackIfMatch", });
    internal_static_xray_app_dns_Config_HostsEntry_descriptor =
      internal_static_xray_app_dns_Config_descriptor.getNestedTypes().get(0);
    internal_static_xray_app_dns_Config_HostsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_dns_Config_HostsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_xray_app_dns_Config_HostMapping_descriptor =
      internal_static_xray_app_dns_Config_descriptor.getNestedTypes().get(1);
    internal_static_xray_app_dns_Config_HostMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_dns_Config_HostMapping_descriptor,
        new java.lang.String[] { "Type", "Domain", "Ip", "ProxiedDomain", });
    com.xray.common.net.Address.getDescriptor();
    com.xray.common.net.Destination.getDescriptor();
    com.xray.app.router.ConfigOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}