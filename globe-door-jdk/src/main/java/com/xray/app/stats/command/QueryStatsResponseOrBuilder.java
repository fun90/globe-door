// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/stats/command/command.proto

package com.xray.app.stats.command;

public interface QueryStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.stats.command.QueryStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  java.util.List<com.xray.app.stats.command.Stat> 
      getStatList();
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  com.xray.app.stats.command.Stat getStat(int index);
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  int getStatCount();
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  java.util.List<? extends com.xray.app.stats.command.StatOrBuilder> 
      getStatOrBuilderList();
  /**
   * <code>repeated .xray.app.stats.command.Stat stat = 1;</code>
   */
  com.xray.app.stats.command.StatOrBuilder getStatOrBuilder(
      int index);
}