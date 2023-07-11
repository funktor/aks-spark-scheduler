// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

public interface WriteOperationV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.WriteOperationV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) The output of the `input` relation will be persisted according to the options.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * (Required) The output of the `input` relation will be persisted according to the options.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  org.apache.spark.connect.proto.Relation getInput();
  /**
   * <pre>
   * (Required) The output of the `input` relation will be persisted according to the options.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * (Required) The destination of the write operation must be either a path or a table.
   * </pre>
   *
   * <code>string table_name = 2;</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <pre>
   * (Required) The destination of the write operation must be either a path or a table.
   * </pre>
   *
   * <code>string table_name = 2;</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * (Optional) A provider for the underlying output data source. Spark's default catalog supports
   * "parquet", "json", etc.
   * </pre>
   *
   * <code>optional string provider = 3;</code>
   * @return Whether the provider field is set.
   */
  boolean hasProvider();
  /**
   * <pre>
   * (Optional) A provider for the underlying output data source. Spark's default catalog supports
   * "parquet", "json", etc.
   * </pre>
   *
   * <code>optional string provider = 3;</code>
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   * <pre>
   * (Optional) A provider for the underlying output data source. Spark's default catalog supports
   * "parquet", "json", etc.
   * </pre>
   *
   * <code>optional string provider = 3;</code>
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <pre>
   * (Optional) List of columns for partitioning for output table created by `create`,
   * `createOrReplace`, or `replace`
   * </pre>
   *
   * <code>repeated .spark.connect.Expression partitioning_columns = 4;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getPartitioningColumnsList();
  /**
   * <pre>
   * (Optional) List of columns for partitioning for output table created by `create`,
   * `createOrReplace`, or `replace`
   * </pre>
   *
   * <code>repeated .spark.connect.Expression partitioning_columns = 4;</code>
   */
  org.apache.spark.connect.proto.Expression getPartitioningColumns(int index);
  /**
   * <pre>
   * (Optional) List of columns for partitioning for output table created by `create`,
   * `createOrReplace`, or `replace`
   * </pre>
   *
   * <code>repeated .spark.connect.Expression partitioning_columns = 4;</code>
   */
  int getPartitioningColumnsCount();
  /**
   * <pre>
   * (Optional) List of columns for partitioning for output table created by `create`,
   * `createOrReplace`, or `replace`
   * </pre>
   *
   * <code>repeated .spark.connect.Expression partitioning_columns = 4;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getPartitioningColumnsOrBuilderList();
  /**
   * <pre>
   * (Optional) List of columns for partitioning for output table created by `create`,
   * `createOrReplace`, or `replace`
   * </pre>
   *
   * <code>repeated .spark.connect.Expression partitioning_columns = 4;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getPartitioningColumnsOrBuilder(
      int index);

  /**
   * <pre>
   * (Optional) A list of configuration options.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * (Optional) A list of configuration options.
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
   * (Optional) A list of configuration options.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getOptionsMap();
  /**
   * <pre>
   * (Optional) A list of configuration options.
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
   * (Optional) A list of configuration options.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 5;</code>
   */
  java.lang.String getOptionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * (Optional) A list of table properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; table_properties = 6;</code>
   */
  int getTablePropertiesCount();
  /**
   * <pre>
   * (Optional) A list of table properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; table_properties = 6;</code>
   */
  boolean containsTableProperties(
      java.lang.String key);
  /**
   * Use {@link #getTablePropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTableProperties();
  /**
   * <pre>
   * (Optional) A list of table properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; table_properties = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTablePropertiesMap();
  /**
   * <pre>
   * (Optional) A list of table properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; table_properties = 6;</code>
   */
  /* nullable */
java.lang.String getTablePropertiesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * (Optional) A list of table properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; table_properties = 6;</code>
   */
  java.lang.String getTablePropertiesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * (Required) Write mode.
   * </pre>
   *
   * <code>.spark.connect.WriteOperationV2.Mode mode = 7;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <pre>
   * (Required) Write mode.
   * </pre>
   *
   * <code>.spark.connect.WriteOperationV2.Mode mode = 7;</code>
   * @return The mode.
   */
  org.apache.spark.connect.proto.WriteOperationV2.Mode getMode();

  /**
   * <pre>
   * (Optional) A condition for overwrite saving mode
   * </pre>
   *
   * <code>.spark.connect.Expression overwrite_condition = 8;</code>
   * @return Whether the overwriteCondition field is set.
   */
  boolean hasOverwriteCondition();
  /**
   * <pre>
   * (Optional) A condition for overwrite saving mode
   * </pre>
   *
   * <code>.spark.connect.Expression overwrite_condition = 8;</code>
   * @return The overwriteCondition.
   */
  org.apache.spark.connect.proto.Expression getOverwriteCondition();
  /**
   * <pre>
   * (Optional) A condition for overwrite saving mode
   * </pre>
   *
   * <code>.spark.connect.Expression overwrite_condition = 8;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getOverwriteConditionOrBuilder();
}
