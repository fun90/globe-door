// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vless/inbound/config.proto

package com.xray.proxy.vless.inbound;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.vless.inbound.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .xray.common.protocol.User clients = 1;</code>
   */
  java.util.List<com.xray.common.protocol.User> 
      getClientsList();
  /**
   * <code>repeated .xray.common.protocol.User clients = 1;</code>
   */
  com.xray.common.protocol.User getClients(int index);
  /**
   * <code>repeated .xray.common.protocol.User clients = 1;</code>
   */
  int getClientsCount();
  /**
   * <code>repeated .xray.common.protocol.User clients = 1;</code>
   */
  java.util.List<? extends com.xray.common.protocol.UserOrBuilder> 
      getClientsOrBuilderList();
  /**
   * <code>repeated .xray.common.protocol.User clients = 1;</code>
   */
  com.xray.common.protocol.UserOrBuilder getClientsOrBuilder(
      int index);

  /**
   * <pre>
   * Decryption settings. Only applies to server side, and only accepts "none"
   * for now.
   * </pre>
   *
   * <code>string decryption = 2;</code>
   * @return The decryption.
   */
  java.lang.String getDecryption();
  /**
   * <pre>
   * Decryption settings. Only applies to server side, and only accepts "none"
   * for now.
   * </pre>
   *
   * <code>string decryption = 2;</code>
   * @return The bytes for decryption.
   */
  com.google.protobuf.ByteString
      getDecryptionBytes();

  /**
   * <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
   */
  java.util.List<com.xray.proxy.vless.inbound.Fallback> 
      getFallbacksList();
  /**
   * <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
   */
  com.xray.proxy.vless.inbound.Fallback getFallbacks(int index);
  /**
   * <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
   */
  int getFallbacksCount();
  /**
   * <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
   */
  java.util.List<? extends com.xray.proxy.vless.inbound.FallbackOrBuilder> 
      getFallbacksOrBuilderList();
  /**
   * <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
   */
  com.xray.proxy.vless.inbound.FallbackOrBuilder getFallbacksOrBuilder(
      int index);
}