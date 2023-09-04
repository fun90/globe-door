// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/config.proto

package com.xray.core;

public interface InboundHandlerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.core.InboundHandlerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tag of the inbound handler. The tag must be unique among all inbound
   * handlers
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Tag of the inbound handler. The tag must be unique among all inbound
   * handlers
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Settings for how this inbound proxy is handled.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
   * @return Whether the receiverSettings field is set.
   */
  boolean hasReceiverSettings();
  /**
   * <pre>
   * Settings for how this inbound proxy is handled.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
   * @return The receiverSettings.
   */
  com.xray.common.serial.TypedMessage getReceiverSettings();
  /**
   * <pre>
   * Settings for how this inbound proxy is handled.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  com.xray.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder();

  /**
   * <pre>
   * Settings for inbound proxy. Must be one of the inbound proxies.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return Whether the proxySettings field is set.
   */
  boolean hasProxySettings();
  /**
   * <pre>
   * Settings for inbound proxy. Must be one of the inbound proxies.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return The proxySettings.
   */
  com.xray.common.serial.TypedMessage getProxySettings();
  /**
   * <pre>
   * Settings for inbound proxy. Must be one of the inbound proxies.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  com.xray.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder();
}