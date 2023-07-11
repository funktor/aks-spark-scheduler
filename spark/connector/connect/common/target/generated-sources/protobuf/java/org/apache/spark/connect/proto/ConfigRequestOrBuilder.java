// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/base.proto

package org.apache.spark.connect.proto;

public interface ConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.ConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required)
   *
   * The session_id specifies a spark session for a user id (which is specified
   * by user_context.user_id). The session_id is set by the client to be able to
   * collate streaming responses from different queries within the dedicated session.
   * </pre>
   *
   * <code>string session_id = 1;</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <pre>
   * (Required)
   *
   * The session_id specifies a spark session for a user id (which is specified
   * by user_context.user_id). The session_id is set by the client to be able to
   * collate streaming responses from different queries within the dedicated session.
   * </pre>
   *
   * <code>string session_id = 1;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <pre>
   * (Required) User context
   * </pre>
   *
   * <code>.spark.connect.UserContext user_context = 2;</code>
   * @return Whether the userContext field is set.
   */
  boolean hasUserContext();
  /**
   * <pre>
   * (Required) User context
   * </pre>
   *
   * <code>.spark.connect.UserContext user_context = 2;</code>
   * @return The userContext.
   */
  org.apache.spark.connect.proto.UserContext getUserContext();
  /**
   * <pre>
   * (Required) User context
   * </pre>
   *
   * <code>.spark.connect.UserContext user_context = 2;</code>
   */
  org.apache.spark.connect.proto.UserContextOrBuilder getUserContextOrBuilder();

  /**
   * <pre>
   * (Required) The operation for the config.
   * </pre>
   *
   * <code>.spark.connect.ConfigRequest.Operation operation = 3;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * (Required) The operation for the config.
   * </pre>
   *
   * <code>.spark.connect.ConfigRequest.Operation operation = 3;</code>
   * @return The operation.
   */
  org.apache.spark.connect.proto.ConfigRequest.Operation getOperation();
  /**
   * <pre>
   * (Required) The operation for the config.
   * </pre>
   *
   * <code>.spark.connect.ConfigRequest.Operation operation = 3;</code>
   */
  org.apache.spark.connect.proto.ConfigRequest.OperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * Provides optional information about the client sending the request. This field
   * can be used for language or version specific information and is only intended for
   * logging purposes and will not be interpreted by the server.
   * </pre>
   *
   * <code>optional string client_type = 4;</code>
   * @return Whether the clientType field is set.
   */
  boolean hasClientType();
  /**
   * <pre>
   * Provides optional information about the client sending the request. This field
   * can be used for language or version specific information and is only intended for
   * logging purposes and will not be interpreted by the server.
   * </pre>
   *
   * <code>optional string client_type = 4;</code>
   * @return The clientType.
   */
  java.lang.String getClientType();
  /**
   * <pre>
   * Provides optional information about the client sending the request. This field
   * can be used for language or version specific information and is only intended for
   * logging purposes and will not be interpreted by the server.
   * </pre>
   *
   * <code>optional string client_type = 4;</code>
   * @return The bytes for clientType.
   */
  com.google.protobuf.ByteString
      getClientTypeBytes();
}
