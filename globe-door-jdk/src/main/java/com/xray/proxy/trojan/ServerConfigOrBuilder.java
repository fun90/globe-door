// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/trojan/config.proto

package com.xray.proxy.trojan;

public interface ServerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.trojan.ServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  java.util.List<com.xray.common.protocol.User> 
      getUsersList();
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  com.xray.common.protocol.User getUsers(int index);
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  java.util.List<? extends com.xray.common.protocol.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  com.xray.common.protocol.UserOrBuilder getUsersOrBuilder(
      int index);

  /**
   * <code>repeated .xray.proxy.trojan.Fallback fallbacks = 2;</code>
   */
  java.util.List<com.xray.proxy.trojan.Fallback> 
      getFallbacksList();
  /**
   * <code>repeated .xray.proxy.trojan.Fallback fallbacks = 2;</code>
   */
  com.xray.proxy.trojan.Fallback getFallbacks(int index);
  /**
   * <code>repeated .xray.proxy.trojan.Fallback fallbacks = 2;</code>
   */
  int getFallbacksCount();
  /**
   * <code>repeated .xray.proxy.trojan.Fallback fallbacks = 2;</code>
   */
  java.util.List<? extends com.xray.proxy.trojan.FallbackOrBuilder> 
      getFallbacksOrBuilderList();
  /**
   * <code>repeated .xray.proxy.trojan.Fallback fallbacks = 2;</code>
   */
  com.xray.proxy.trojan.FallbackOrBuilder getFallbacksOrBuilder(
      int index);
}