// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

public interface CommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.Command)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.spark.connect.CommonInlineUserDefinedFunction register_function = 1;</code>
   * @return Whether the registerFunction field is set.
   */
  boolean hasRegisterFunction();
  /**
   * <code>.spark.connect.CommonInlineUserDefinedFunction register_function = 1;</code>
   * @return The registerFunction.
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunction getRegisterFunction();
  /**
   * <code>.spark.connect.CommonInlineUserDefinedFunction register_function = 1;</code>
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunctionOrBuilder getRegisterFunctionOrBuilder();

  /**
   * <code>.spark.connect.WriteOperation write_operation = 2;</code>
   * @return Whether the writeOperation field is set.
   */
  boolean hasWriteOperation();
  /**
   * <code>.spark.connect.WriteOperation write_operation = 2;</code>
   * @return The writeOperation.
   */
  org.apache.spark.connect.proto.WriteOperation getWriteOperation();
  /**
   * <code>.spark.connect.WriteOperation write_operation = 2;</code>
   */
  org.apache.spark.connect.proto.WriteOperationOrBuilder getWriteOperationOrBuilder();

  /**
   * <code>.spark.connect.CreateDataFrameViewCommand create_dataframe_view = 3;</code>
   * @return Whether the createDataframeView field is set.
   */
  boolean hasCreateDataframeView();
  /**
   * <code>.spark.connect.CreateDataFrameViewCommand create_dataframe_view = 3;</code>
   * @return The createDataframeView.
   */
  org.apache.spark.connect.proto.CreateDataFrameViewCommand getCreateDataframeView();
  /**
   * <code>.spark.connect.CreateDataFrameViewCommand create_dataframe_view = 3;</code>
   */
  org.apache.spark.connect.proto.CreateDataFrameViewCommandOrBuilder getCreateDataframeViewOrBuilder();

  /**
   * <code>.spark.connect.WriteOperationV2 write_operation_v2 = 4;</code>
   * @return Whether the writeOperationV2 field is set.
   */
  boolean hasWriteOperationV2();
  /**
   * <code>.spark.connect.WriteOperationV2 write_operation_v2 = 4;</code>
   * @return The writeOperationV2.
   */
  org.apache.spark.connect.proto.WriteOperationV2 getWriteOperationV2();
  /**
   * <code>.spark.connect.WriteOperationV2 write_operation_v2 = 4;</code>
   */
  org.apache.spark.connect.proto.WriteOperationV2OrBuilder getWriteOperationV2OrBuilder();

  /**
   * <code>.spark.connect.SqlCommand sql_command = 5;</code>
   * @return Whether the sqlCommand field is set.
   */
  boolean hasSqlCommand();
  /**
   * <code>.spark.connect.SqlCommand sql_command = 5;</code>
   * @return The sqlCommand.
   */
  org.apache.spark.connect.proto.SqlCommand getSqlCommand();
  /**
   * <code>.spark.connect.SqlCommand sql_command = 5;</code>
   */
  org.apache.spark.connect.proto.SqlCommandOrBuilder getSqlCommandOrBuilder();

  /**
   * <code>.spark.connect.WriteStreamOperationStart write_stream_operation_start = 6;</code>
   * @return Whether the writeStreamOperationStart field is set.
   */
  boolean hasWriteStreamOperationStart();
  /**
   * <code>.spark.connect.WriteStreamOperationStart write_stream_operation_start = 6;</code>
   * @return The writeStreamOperationStart.
   */
  org.apache.spark.connect.proto.WriteStreamOperationStart getWriteStreamOperationStart();
  /**
   * <code>.spark.connect.WriteStreamOperationStart write_stream_operation_start = 6;</code>
   */
  org.apache.spark.connect.proto.WriteStreamOperationStartOrBuilder getWriteStreamOperationStartOrBuilder();

  /**
   * <code>.spark.connect.StreamingQueryCommand streaming_query_command = 7;</code>
   * @return Whether the streamingQueryCommand field is set.
   */
  boolean hasStreamingQueryCommand();
  /**
   * <code>.spark.connect.StreamingQueryCommand streaming_query_command = 7;</code>
   * @return The streamingQueryCommand.
   */
  org.apache.spark.connect.proto.StreamingQueryCommand getStreamingQueryCommand();
  /**
   * <code>.spark.connect.StreamingQueryCommand streaming_query_command = 7;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryCommandOrBuilder getStreamingQueryCommandOrBuilder();

  /**
   * <code>.spark.connect.GetResourcesCommand get_resources_command = 8;</code>
   * @return Whether the getResourcesCommand field is set.
   */
  boolean hasGetResourcesCommand();
  /**
   * <code>.spark.connect.GetResourcesCommand get_resources_command = 8;</code>
   * @return The getResourcesCommand.
   */
  org.apache.spark.connect.proto.GetResourcesCommand getGetResourcesCommand();
  /**
   * <code>.spark.connect.GetResourcesCommand get_resources_command = 8;</code>
   */
  org.apache.spark.connect.proto.GetResourcesCommandOrBuilder getGetResourcesCommandOrBuilder();

  /**
   * <code>.spark.connect.StreamingQueryManagerCommand streaming_query_manager_command = 9;</code>
   * @return Whether the streamingQueryManagerCommand field is set.
   */
  boolean hasStreamingQueryManagerCommand();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommand streaming_query_manager_command = 9;</code>
   * @return The streamingQueryManagerCommand.
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommand getStreamingQueryManagerCommand();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommand streaming_query_manager_command = 9;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandOrBuilder getStreamingQueryManagerCommandOrBuilder();

  /**
   * <pre>
   * This field is used to mark extensions to the protocol. When plugins generate arbitrary
   * Commands they can add them here. During the planning the correct resolution is done.
   * </pre>
   *
   * <code>.google.protobuf.Any extension = 999;</code>
   * @return Whether the extension field is set.
   */
  boolean hasExtension();
  /**
   * <pre>
   * This field is used to mark extensions to the protocol. When plugins generate arbitrary
   * Commands they can add them here. During the planning the correct resolution is done.
   * </pre>
   *
   * <code>.google.protobuf.Any extension = 999;</code>
   * @return The extension.
   */
  com.google.protobuf.Any getExtension();
  /**
   * <pre>
   * This field is used to mark extensions to the protocol. When plugins generate arbitrary
   * Commands they can add them here. During the planning the correct resolution is done.
   * </pre>
   *
   * <code>.google.protobuf.Any extension = 999;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder();

  org.apache.spark.connect.proto.Command.CommandTypeCase getCommandTypeCase();
}
