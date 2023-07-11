// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface DropOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.Drop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  org.apache.spark.connect.proto.Relation getInput();
  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * (Optional) columns to drop.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression columns = 2;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getColumnsList();
  /**
   * <pre>
   * (Optional) columns to drop.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression columns = 2;</code>
   */
  org.apache.spark.connect.proto.Expression getColumns(int index);
  /**
   * <pre>
   * (Optional) columns to drop.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression columns = 2;</code>
   */
  int getColumnsCount();
  /**
   * <pre>
   * (Optional) columns to drop.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression columns = 2;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <pre>
   * (Optional) columns to drop.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression columns = 2;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getColumnsOrBuilder(
      int index);

  /**
   * <pre>
   * (Optional) names of columns to drop.
   * </pre>
   *
   * <code>repeated string column_names = 3;</code>
   * @return A list containing the columnNames.
   */
  java.util.List<java.lang.String>
      getColumnNamesList();
  /**
   * <pre>
   * (Optional) names of columns to drop.
   * </pre>
   *
   * <code>repeated string column_names = 3;</code>
   * @return The count of columnNames.
   */
  int getColumnNamesCount();
  /**
   * <pre>
   * (Optional) names of columns to drop.
   * </pre>
   *
   * <code>repeated string column_names = 3;</code>
   * @param index The index of the element to return.
   * @return The columnNames at the given index.
   */
  java.lang.String getColumnNames(int index);
  /**
   * <pre>
   * (Optional) names of columns to drop.
   * </pre>
   *
   * <code>repeated string column_names = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the columnNames at the given index.
   */
  com.google.protobuf.ByteString
      getColumnNamesBytes(int index);
}