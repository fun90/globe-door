// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package com.xray.app.router;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.router.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xray.app.router.Config.DomainStrategy domain_strategy = 1;</code>
   * @return The enum numeric value on the wire for domainStrategy.
   */
  int getDomainStrategyValue();
  /**
   * <code>.xray.app.router.Config.DomainStrategy domain_strategy = 1;</code>
   * @return The domainStrategy.
   */
  com.xray.app.router.Config.DomainStrategy getDomainStrategy();

  /**
   * <code>repeated .xray.app.router.RoutingRule rule = 2;</code>
   */
  java.util.List<com.xray.app.router.RoutingRule> 
      getRuleList();
  /**
   * <code>repeated .xray.app.router.RoutingRule rule = 2;</code>
   */
  com.xray.app.router.RoutingRule getRule(int index);
  /**
   * <code>repeated .xray.app.router.RoutingRule rule = 2;</code>
   */
  int getRuleCount();
  /**
   * <code>repeated .xray.app.router.RoutingRule rule = 2;</code>
   */
  java.util.List<? extends com.xray.app.router.RoutingRuleOrBuilder> 
      getRuleOrBuilderList();
  /**
   * <code>repeated .xray.app.router.RoutingRule rule = 2;</code>
   */
  com.xray.app.router.RoutingRuleOrBuilder getRuleOrBuilder(
      int index);

  /**
   * <code>repeated .xray.app.router.BalancingRule balancing_rule = 3;</code>
   */
  java.util.List<com.xray.app.router.BalancingRule> 
      getBalancingRuleList();
  /**
   * <code>repeated .xray.app.router.BalancingRule balancing_rule = 3;</code>
   */
  com.xray.app.router.BalancingRule getBalancingRule(int index);
  /**
   * <code>repeated .xray.app.router.BalancingRule balancing_rule = 3;</code>
   */
  int getBalancingRuleCount();
  /**
   * <code>repeated .xray.app.router.BalancingRule balancing_rule = 3;</code>
   */
  java.util.List<? extends com.xray.app.router.BalancingRuleOrBuilder> 
      getBalancingRuleOrBuilderList();
  /**
   * <code>repeated .xray.app.router.BalancingRule balancing_rule = 3;</code>
   */
  com.xray.app.router.BalancingRuleOrBuilder getBalancingRuleOrBuilder(
      int index);
}
