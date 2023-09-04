// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package com.xray.app.router;

public interface RoutingRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.router.RoutingRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tag of outbound that this rule is pointing to.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   * <pre>
   * Tag of outbound that this rule is pointing to.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Tag of outbound that this rule is pointing to.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Tag of routing balancer.
   * </pre>
   *
   * <code>string balancing_tag = 12;</code>
   * @return Whether the balancingTag field is set.
   */
  boolean hasBalancingTag();
  /**
   * <pre>
   * Tag of routing balancer.
   * </pre>
   *
   * <code>string balancing_tag = 12;</code>
   * @return The balancingTag.
   */
  java.lang.String getBalancingTag();
  /**
   * <pre>
   * Tag of routing balancer.
   * </pre>
   *
   * <code>string balancing_tag = 12;</code>
   * @return The bytes for balancingTag.
   */
  com.google.protobuf.ByteString
      getBalancingTagBytes();

  /**
   * <pre>
   * List of domains for target domain matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain domain = 2;</code>
   */
  java.util.List<com.xray.app.router.Domain> 
      getDomainList();
  /**
   * <pre>
   * List of domains for target domain matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain domain = 2;</code>
   */
  com.xray.app.router.Domain getDomain(int index);
  /**
   * <pre>
   * List of domains for target domain matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain domain = 2;</code>
   */
  int getDomainCount();
  /**
   * <pre>
   * List of domains for target domain matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain domain = 2;</code>
   */
  java.util.List<? extends com.xray.app.router.DomainOrBuilder> 
      getDomainOrBuilderList();
  /**
   * <pre>
   * List of domains for target domain matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain domain = 2;</code>
   */
  com.xray.app.router.DomainOrBuilder getDomainOrBuilder(
      int index);

  /**
   * <pre>
   * List of CIDRs for target IP address matching.
   * Deprecated. Use geoip below.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR cidr = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.xray.app.router.CIDR> 
      getCidrList();
  /**
   * <pre>
   * List of CIDRs for target IP address matching.
   * Deprecated. Use geoip below.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR cidr = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.xray.app.router.CIDR getCidr(int index);
  /**
   * <pre>
   * List of CIDRs for target IP address matching.
   * Deprecated. Use geoip below.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR cidr = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getCidrCount();
  /**
   * <pre>
   * List of CIDRs for target IP address matching.
   * Deprecated. Use geoip below.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR cidr = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.xray.app.router.CIDROrBuilder> 
      getCidrOrBuilderList();
  /**
   * <pre>
   * List of CIDRs for target IP address matching.
   * Deprecated. Use geoip below.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR cidr = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.xray.app.router.CIDROrBuilder getCidrOrBuilder(
      int index);

  /**
   * <pre>
   * List of GeoIPs for target IP address matching. If this entry exists, the
   * cidr above will have no effect. GeoIP fields with the same country code are
   * supposed to contain exactly same content. They will be merged during
   * runtime. For customized GeoIPs, please leave country code empty.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP geoip = 10;</code>
   */
  java.util.List<com.xray.app.router.GeoIP> 
      getGeoipList();
  /**
   * <pre>
   * List of GeoIPs for target IP address matching. If this entry exists, the
   * cidr above will have no effect. GeoIP fields with the same country code are
   * supposed to contain exactly same content. They will be merged during
   * runtime. For customized GeoIPs, please leave country code empty.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP geoip = 10;</code>
   */
  com.xray.app.router.GeoIP getGeoip(int index);
  /**
   * <pre>
   * List of GeoIPs for target IP address matching. If this entry exists, the
   * cidr above will have no effect. GeoIP fields with the same country code are
   * supposed to contain exactly same content. They will be merged during
   * runtime. For customized GeoIPs, please leave country code empty.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP geoip = 10;</code>
   */
  int getGeoipCount();
  /**
   * <pre>
   * List of GeoIPs for target IP address matching. If this entry exists, the
   * cidr above will have no effect. GeoIP fields with the same country code are
   * supposed to contain exactly same content. They will be merged during
   * runtime. For customized GeoIPs, please leave country code empty.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP geoip = 10;</code>
   */
  java.util.List<? extends com.xray.app.router.GeoIPOrBuilder> 
      getGeoipOrBuilderList();
  /**
   * <pre>
   * List of GeoIPs for target IP address matching. If this entry exists, the
   * cidr above will have no effect. GeoIP fields with the same country code are
   * supposed to contain exactly same content. They will be merged during
   * runtime. For customized GeoIPs, please leave country code empty.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP geoip = 10;</code>
   */
  com.xray.app.router.GeoIPOrBuilder getGeoipOrBuilder(
      int index);

  /**
   * <pre>
   * A range of port [from, to]. If the destination port is in this range, this
   * rule takes effect. Deprecated. Use port_list.
   * </pre>
   *
   * <code>.xray.common.net.PortRange port_range = 4 [deprecated = true];</code>
   * @deprecated xray.app.router.RoutingRule.port_range is deprecated.
   *     See app/router/config.proto;l=96
   * @return Whether the portRange field is set.
   */
  @java.lang.Deprecated boolean hasPortRange();
  /**
   * <pre>
   * A range of port [from, to]. If the destination port is in this range, this
   * rule takes effect. Deprecated. Use port_list.
   * </pre>
   *
   * <code>.xray.common.net.PortRange port_range = 4 [deprecated = true];</code>
   * @deprecated xray.app.router.RoutingRule.port_range is deprecated.
   *     See app/router/config.proto;l=96
   * @return The portRange.
   */
  @java.lang.Deprecated com.xray.common.net.PortRange getPortRange();
  /**
   * <pre>
   * A range of port [from, to]. If the destination port is in this range, this
   * rule takes effect. Deprecated. Use port_list.
   * </pre>
   *
   * <code>.xray.common.net.PortRange port_range = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.xray.common.net.PortRangeOrBuilder getPortRangeOrBuilder();

  /**
   * <pre>
   * List of ports.
   * </pre>
   *
   * <code>.xray.common.net.PortList port_list = 14;</code>
   * @return Whether the portList field is set.
   */
  boolean hasPortList();
  /**
   * <pre>
   * List of ports.
   * </pre>
   *
   * <code>.xray.common.net.PortList port_list = 14;</code>
   * @return The portList.
   */
  com.xray.common.net.PortList getPortList();
  /**
   * <pre>
   * List of ports.
   * </pre>
   *
   * <code>.xray.common.net.PortList port_list = 14;</code>
   */
  com.xray.common.net.PortListOrBuilder getPortListOrBuilder();

  /**
   * <pre>
   * List of networks. Deprecated. Use networks.
   * </pre>
   *
   * <code>.xray.common.net.NetworkList network_list = 5 [deprecated = true];</code>
   * @deprecated xray.app.router.RoutingRule.network_list is deprecated.
   *     See app/router/config.proto;l=102
   * @return Whether the networkList field is set.
   */
  @java.lang.Deprecated boolean hasNetworkList();
  /**
   * <pre>
   * List of networks. Deprecated. Use networks.
   * </pre>
   *
   * <code>.xray.common.net.NetworkList network_list = 5 [deprecated = true];</code>
   * @deprecated xray.app.router.RoutingRule.network_list is deprecated.
   *     See app/router/config.proto;l=102
   * @return The networkList.
   */
  @java.lang.Deprecated com.xray.common.net.NetworkList getNetworkList();
  /**
   * <pre>
   * List of networks. Deprecated. Use networks.
   * </pre>
   *
   * <code>.xray.common.net.NetworkList network_list = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.xray.common.net.NetworkListOrBuilder getNetworkListOrBuilder();

  /**
   * <pre>
   * List of networks for matching.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 13;</code>
   * @return A list containing the networks.
   */
  java.util.List<com.xray.common.net.Network> getNetworksList();
  /**
   * <pre>
   * List of networks for matching.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 13;</code>
   * @return The count of networks.
   */
  int getNetworksCount();
  /**
   * <pre>
   * List of networks for matching.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 13;</code>
   * @param index The index of the element to return.
   * @return The networks at the given index.
   */
  com.xray.common.net.Network getNetworks(int index);
  /**
   * <pre>
   * List of networks for matching.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 13;</code>
   * @return A list containing the enum numeric values on the wire for networks.
   */
  java.util.List<java.lang.Integer>
  getNetworksValueList();
  /**
   * <pre>
   * List of networks for matching.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 13;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of networks at the given index.
   */
  int getNetworksValue(int index);

  /**
   * <pre>
   * List of CIDRs for source IP address matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR source_cidr = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.xray.app.router.CIDR> 
      getSourceCidrList();
  /**
   * <pre>
   * List of CIDRs for source IP address matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR source_cidr = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.xray.app.router.CIDR getSourceCidr(int index);
  /**
   * <pre>
   * List of CIDRs for source IP address matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR source_cidr = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getSourceCidrCount();
  /**
   * <pre>
   * List of CIDRs for source IP address matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR source_cidr = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.xray.app.router.CIDROrBuilder> 
      getSourceCidrOrBuilderList();
  /**
   * <pre>
   * List of CIDRs for source IP address matching.
   * </pre>
   *
   * <code>repeated .xray.app.router.CIDR source_cidr = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.xray.app.router.CIDROrBuilder getSourceCidrOrBuilder(
      int index);

  /**
   * <pre>
   * List of GeoIPs for source IP address matching. If this entry exists, the
   * source_cidr above will have no effect.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP source_geoip = 11;</code>
   */
  java.util.List<com.xray.app.router.GeoIP> 
      getSourceGeoipList();
  /**
   * <pre>
   * List of GeoIPs for source IP address matching. If this entry exists, the
   * source_cidr above will have no effect.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP source_geoip = 11;</code>
   */
  com.xray.app.router.GeoIP getSourceGeoip(int index);
  /**
   * <pre>
   * List of GeoIPs for source IP address matching. If this entry exists, the
   * source_cidr above will have no effect.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP source_geoip = 11;</code>
   */
  int getSourceGeoipCount();
  /**
   * <pre>
   * List of GeoIPs for source IP address matching. If this entry exists, the
   * source_cidr above will have no effect.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP source_geoip = 11;</code>
   */
  java.util.List<? extends com.xray.app.router.GeoIPOrBuilder> 
      getSourceGeoipOrBuilderList();
  /**
   * <pre>
   * List of GeoIPs for source IP address matching. If this entry exists, the
   * source_cidr above will have no effect.
   * </pre>
   *
   * <code>repeated .xray.app.router.GeoIP source_geoip = 11;</code>
   */
  com.xray.app.router.GeoIPOrBuilder getSourceGeoipOrBuilder(
      int index);

  /**
   * <pre>
   * List of ports for source port matching.
   * </pre>
   *
   * <code>.xray.common.net.PortList source_port_list = 16;</code>
   * @return Whether the sourcePortList field is set.
   */
  boolean hasSourcePortList();
  /**
   * <pre>
   * List of ports for source port matching.
   * </pre>
   *
   * <code>.xray.common.net.PortList source_port_list = 16;</code>
   * @return The sourcePortList.
   */
  com.xray.common.net.PortList getSourcePortList();
  /**
   * <pre>
   * List of ports for source port matching.
   * </pre>
   *
   * <code>.xray.common.net.PortList source_port_list = 16;</code>
   */
  com.xray.common.net.PortListOrBuilder getSourcePortListOrBuilder();

  /**
   * <code>repeated string user_email = 7;</code>
   * @return A list containing the userEmail.
   */
  java.util.List<java.lang.String>
      getUserEmailList();
  /**
   * <code>repeated string user_email = 7;</code>
   * @return The count of userEmail.
   */
  int getUserEmailCount();
  /**
   * <code>repeated string user_email = 7;</code>
   * @param index The index of the element to return.
   * @return The userEmail at the given index.
   */
  java.lang.String getUserEmail(int index);
  /**
   * <code>repeated string user_email = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the userEmail at the given index.
   */
  com.google.protobuf.ByteString
      getUserEmailBytes(int index);

  /**
   * <code>repeated string inbound_tag = 8;</code>
   * @return A list containing the inboundTag.
   */
  java.util.List<java.lang.String>
      getInboundTagList();
  /**
   * <code>repeated string inbound_tag = 8;</code>
   * @return The count of inboundTag.
   */
  int getInboundTagCount();
  /**
   * <code>repeated string inbound_tag = 8;</code>
   * @param index The index of the element to return.
   * @return The inboundTag at the given index.
   */
  java.lang.String getInboundTag(int index);
  /**
   * <code>repeated string inbound_tag = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the inboundTag at the given index.
   */
  com.google.protobuf.ByteString
      getInboundTagBytes(int index);

  /**
   * <code>repeated string protocol = 9;</code>
   * @return A list containing the protocol.
   */
  java.util.List<java.lang.String>
      getProtocolList();
  /**
   * <code>repeated string protocol = 9;</code>
   * @return The count of protocol.
   */
  int getProtocolCount();
  /**
   * <code>repeated string protocol = 9;</code>
   * @param index The index of the element to return.
   * @return The protocol at the given index.
   */
  java.lang.String getProtocol(int index);
  /**
   * <code>repeated string protocol = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the protocol at the given index.
   */
  com.google.protobuf.ByteString
      getProtocolBytes(int index);

  /**
   * <code>map&lt;string, string&gt; attributes = 15;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, string&gt; attributes = 15;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <code>map&lt;string, string&gt; attributes = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <code>map&lt;string, string&gt; attributes = 15;</code>
   */
  /* nullable */
java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attributes = 15;</code>
   */
  java.lang.String getAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>string domain_matcher = 17;</code>
   * @return The domainMatcher.
   */
  java.lang.String getDomainMatcher();
  /**
   * <code>string domain_matcher = 17;</code>
   * @return The bytes for domainMatcher.
   */
  com.google.protobuf.ByteString
      getDomainMatcherBytes();

  public com.xray.app.router.RoutingRule.TargetTagCase getTargetTagCase();
}
