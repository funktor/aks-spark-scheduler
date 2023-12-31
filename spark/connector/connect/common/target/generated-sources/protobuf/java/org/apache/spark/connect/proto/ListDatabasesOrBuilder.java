// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/catalog.proto

package org.apache.spark.connect.proto;

public interface ListDatabasesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.ListDatabases)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Optional) The pattern that the database name needs to match
   * </pre>
   *
   * <code>optional string pattern = 1;</code>
   * @return Whether the pattern field is set.
   */
  boolean hasPattern();
  /**
   * <pre>
   * (Optional) The pattern that the database name needs to match
   * </pre>
   *
   * <code>optional string pattern = 1;</code>
   * @return The pattern.
   */
  java.lang.String getPattern();
  /**
   * <pre>
   * (Optional) The pattern that the database name needs to match
   * </pre>
   *
   * <code>optional string pattern = 1;</code>
   * @return The bytes for pattern.
   */
  com.google.protobuf.ByteString
      getPatternBytes();
}
