// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/catalog.proto

package org.apache.spark.connect.proto;

public interface CreateExternalTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.CreateExternalTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string path = 2;</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string path = 2;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string path = 2;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string source = 3;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string source = 3;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string source = 3;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional .spark.connect.DataType schema = 4;</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional .spark.connect.DataType schema = 4;</code>
   * @return The schema.
   */
  org.apache.spark.connect.proto.DataType getSchema();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional .spark.connect.DataType schema = 4;</code>
   */
  org.apache.spark.connect.proto.DataTypeOrBuilder getSchemaOrBuilder();

  /**
   * <pre>
   * Options could be empty for valid data source format.
   * The map key is case insensitive.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * Options could be empty for valid data source format.
   * The map key is case insensitive.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  boolean containsOptions(
      java.lang.String key);
  /**
   * Use {@link #getOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getOptions();
  /**
   * <pre>
   * Options could be empty for valid data source format.
   * The map key is case insensitive.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getOptionsMap();
  /**
   * <pre>
   * Options could be empty for valid data source format.
   * The map key is case insensitive.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  /* nullable */
java.lang.String getOptionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Options could be empty for valid data source format.
   * The map key is case insensitive.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  java.lang.String getOptionsOrThrow(
      java.lang.String key);
}
