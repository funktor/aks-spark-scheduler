// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/example_plugins.proto

package org.apache.spark.connect.proto;

public interface ExamplePluginExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.ExamplePluginExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.spark.connect.Expression child = 1;</code>
   * @return Whether the child field is set.
   */
  boolean hasChild();
  /**
   * <code>.spark.connect.Expression child = 1;</code>
   * @return The child.
   */
  org.apache.spark.connect.proto.Expression getChild();
  /**
   * <code>.spark.connect.Expression child = 1;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getChildOrBuilder();

  /**
   * <code>string custom_field = 2;</code>
   * @return The customField.
   */
  java.lang.String getCustomField();
  /**
   * <code>string custom_field = 2;</code>
   * @return The bytes for customField.
   */
  com.google.protobuf.ByteString
      getCustomFieldBytes();
}
