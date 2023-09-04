// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/http/config.proto

package com.xray.transport.internet.http;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.transport.internet.http.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string host = 1;</code>
   * @return A list containing the host.
   */
  java.util.List<java.lang.String>
      getHostList();
  /**
   * <code>repeated string host = 1;</code>
   * @return The count of host.
   */
  int getHostCount();
  /**
   * <code>repeated string host = 1;</code>
   * @param index The index of the element to return.
   * @return The host at the given index.
   */
  java.lang.String getHost(int index);
  /**
   * <code>repeated string host = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the host at the given index.
   */
  com.google.protobuf.ByteString
      getHostBytes(int index);

  /**
   * <code>string path = 2;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>int32 idle_timeout = 3;</code>
   * @return The idleTimeout.
   */
  int getIdleTimeout();

  /**
   * <code>int32 health_check_timeout = 4;</code>
   * @return The healthCheckTimeout.
   */
  int getHealthCheckTimeout();

  /**
   * <code>string method = 5;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>string method = 5;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 6;</code>
   */
  java.util.List<com.xray.transport.internet.headers.http.Header> 
      getHeaderList();
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 6;</code>
   */
  com.xray.transport.internet.headers.http.Header getHeader(int index);
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 6;</code>
   */
  int getHeaderCount();
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 6;</code>
   */
  java.util.List<? extends com.xray.transport.internet.headers.http.HeaderOrBuilder> 
      getHeaderOrBuilderList();
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 6;</code>
   */
  com.xray.transport.internet.headers.http.HeaderOrBuilder getHeaderOrBuilder(
      int index);
}