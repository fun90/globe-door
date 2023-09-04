// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/headers/http/config.proto

package com.xray.transport.internet.headers.http;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.transport.internet.headers.http.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status code. Default "200".
   * </pre>
   *
   * <code>string code = 1;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <pre>
   * Status code. Default "200".
   * </pre>
   *
   * <code>string code = 1;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * Statue reason. Default "OK".
   * </pre>
   *
   * <code>string reason = 2;</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <pre>
   * Statue reason. Default "OK".
   * </pre>
   *
   * <code>string reason = 2;</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();
}