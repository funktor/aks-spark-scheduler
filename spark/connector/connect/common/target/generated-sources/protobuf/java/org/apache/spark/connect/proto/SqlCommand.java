// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * A SQL Command is used to trigger the eager evaluation of SQL commands in Spark.
 *
 * When the SQL provide as part of the message is a command it will be immediately evaluated
 * and the result will be collected and returned as part of a LocalRelation. If the result is
 * not a command, the operation will simply return a SQL Relation. This allows the client to be
 * almost oblivious to the server-side behavior.
 * </pre>
 *
 * Protobuf type {@code spark.connect.SqlCommand}
 */
public final class SqlCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.SqlCommand)
    SqlCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SqlCommand.newBuilder() to construct.
  private SqlCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SqlCommand() {
    sql_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SqlCommand();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_SqlCommand_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetArgs();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_SqlCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.SqlCommand.class, org.apache.spark.connect.proto.SqlCommand.Builder.class);
  }

  public static final int SQL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sql_ = "";
  /**
   * <pre>
   * (Required) SQL Query.
   * </pre>
   *
   * <code>string sql = 1;</code>
   * @return The sql.
   */
  @java.lang.Override
  public java.lang.String getSql() {
    java.lang.Object ref = sql_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sql_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required) SQL Query.
   * </pre>
   *
   * <code>string sql = 1;</code>
   * @return The bytes for sql.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSqlBytes() {
    java.lang.Object ref = sql_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sql_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGS_FIELD_NUMBER = 2;
  private static final class ArgsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.apache.spark.connect.proto.Expression.Literal> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>newDefaultInstance(
                org.apache.spark.connect.proto.Commands.internal_static_spark_connect_SqlCommand_ArgsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.apache.spark.connect.proto.Expression.Literal.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, org.apache.spark.connect.proto.Expression.Literal> args_;
  private com.google.protobuf.MapField<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
  internalGetArgs() {
    if (args_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ArgsDefaultEntryHolder.defaultEntry);
    }
    return args_;
  }
  public int getArgsCount() {
    return internalGetArgs().getMap().size();
  }
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  @java.lang.Override
  public boolean containsArgs(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetArgs().getMap().containsKey(key);
  }
  /**
   * Use {@link #getArgsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> getArgs() {
    return getArgsMap();
  }
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> getArgsMap() {
    return internalGetArgs().getMap();
  }
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
org.apache.spark.connect.proto.Expression.Literal getArgsOrDefault(
      java.lang.String key,
      /* nullable */
org.apache.spark.connect.proto.Expression.Literal defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> map =
        internalGetArgs().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Expression.Literal getArgsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> map =
        internalGetArgs().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sql_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sql_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetArgs(),
        ArgsDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sql_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sql_);
    }
    for (java.util.Map.Entry<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> entry
         : internalGetArgs().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
      args__ = ArgsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, args__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.spark.connect.proto.SqlCommand)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.SqlCommand other = (org.apache.spark.connect.proto.SqlCommand) obj;

    if (!getSql()
        .equals(other.getSql())) return false;
    if (!internalGetArgs().equals(
        other.internalGetArgs())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SQL_FIELD_NUMBER;
    hash = (53 * hash) + getSql().hashCode();
    if (!internalGetArgs().getMap().isEmpty()) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetArgs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.SqlCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.SqlCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.SqlCommand parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.spark.connect.proto.SqlCommand prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A SQL Command is used to trigger the eager evaluation of SQL commands in Spark.
   *
   * When the SQL provide as part of the message is a command it will be immediately evaluated
   * and the result will be collected and returned as part of a LocalRelation. If the result is
   * not a command, the operation will simply return a SQL Relation. This allows the client to be
   * almost oblivious to the server-side behavior.
   * </pre>
   *
   * Protobuf type {@code spark.connect.SqlCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.SqlCommand)
      org.apache.spark.connect.proto.SqlCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_SqlCommand_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetArgs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableArgs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_SqlCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.SqlCommand.class, org.apache.spark.connect.proto.SqlCommand.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.SqlCommand.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sql_ = "";
      internalGetMutableArgs().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_SqlCommand_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.SqlCommand getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.SqlCommand.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.SqlCommand build() {
      org.apache.spark.connect.proto.SqlCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.SqlCommand buildPartial() {
      org.apache.spark.connect.proto.SqlCommand result = new org.apache.spark.connect.proto.SqlCommand(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.SqlCommand result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sql_ = sql_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.args_ = internalGetArgs();
        result.args_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.spark.connect.proto.SqlCommand) {
        return mergeFrom((org.apache.spark.connect.proto.SqlCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.SqlCommand other) {
      if (other == org.apache.spark.connect.proto.SqlCommand.getDefaultInstance()) return this;
      if (!other.getSql().isEmpty()) {
        sql_ = other.sql_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableArgs().mergeFrom(
          other.internalGetArgs());
      bitField0_ |= 0x00000002;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              sql_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
              args__ = input.readMessage(
                  ArgsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableArgs().getMutableMap().put(
                  args__.getKey(), args__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object sql_ = "";
    /**
     * <pre>
     * (Required) SQL Query.
     * </pre>
     *
     * <code>string sql = 1;</code>
     * @return The sql.
     */
    public java.lang.String getSql() {
      java.lang.Object ref = sql_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sql_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required) SQL Query.
     * </pre>
     *
     * <code>string sql = 1;</code>
     * @return The bytes for sql.
     */
    public com.google.protobuf.ByteString
        getSqlBytes() {
      java.lang.Object ref = sql_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sql_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required) SQL Query.
     * </pre>
     *
     * <code>string sql = 1;</code>
     * @param value The sql to set.
     * @return This builder for chaining.
     */
    public Builder setSql(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sql_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) SQL Query.
     * </pre>
     *
     * <code>string sql = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSql() {
      sql_ = getDefaultInstance().getSql();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) SQL Query.
     * </pre>
     *
     * <code>string sql = 1;</code>
     * @param value The bytes for sql to set.
     * @return This builder for chaining.
     */
    public Builder setSqlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sql_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, org.apache.spark.connect.proto.Expression.Literal> args_;
    private com.google.protobuf.MapField<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
        internalGetArgs() {
      if (args_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ArgsDefaultEntryHolder.defaultEntry);
      }
      return args_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
        internalGetMutableArgs() {
      if (args_ == null) {
        args_ = com.google.protobuf.MapField.newMapField(
            ArgsDefaultEntryHolder.defaultEntry);
      }
      if (!args_.isMutable()) {
        args_ = args_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return args_;
    }
    public int getArgsCount() {
      return internalGetArgs().getMap().size();
    }
    /**
     * <pre>
     * (Optional) A map of parameter names to literal expressions.
     * </pre>
     *
     * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
     */
    @java.lang.Override
    public boolean containsArgs(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetArgs().getMap().containsKey(key);
    }
    /**
     * Use {@link #getArgsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> getArgs() {
      return getArgsMap();
    }
    /**
     * <pre>
     * (Optional) A map of parameter names to literal expressions.
     * </pre>
     *
     * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> getArgsMap() {
      return internalGetArgs().getMap();
    }
    /**
     * <pre>
     * (Optional) A map of parameter names to literal expressions.
     * </pre>
     *
     * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
org.apache.spark.connect.proto.Expression.Literal getArgsOrDefault(
        java.lang.String key,
        /* nullable */
org.apache.spark.connect.proto.Expression.Literal defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> map =
          internalGetArgs().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * (Optional) A map of parameter names to literal expressions.
     * </pre>
     *
     * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
     */
    @java.lang.Override
    public org.apache.spark.connect.proto.Expression.Literal getArgsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> map =
          internalGetArgs().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearArgs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableArgs().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * (Optional) A map of parameter names to literal expressions.
     * </pre>
     *
     * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
     */
    public Builder removeArgs(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableArgs().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
        getMutableArgs() {
      bitField0_ |= 0x00000002;
      return internalGetMutableArgs().getMutableMap();
    }
    /**
     * <pre>
     * (Optional) A map of parameter names to literal expressions.
     * </pre>
     *
     * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
     */
    public Builder putArgs(
        java.lang.String key,
        org.apache.spark.connect.proto.Expression.Literal value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableArgs().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * (Optional) A map of parameter names to literal expressions.
     * </pre>
     *
     * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
     */
    public Builder putAllArgs(
        java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal> values) {
      internalGetMutableArgs().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:spark.connect.SqlCommand)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.SqlCommand)
  private static final org.apache.spark.connect.proto.SqlCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.SqlCommand();
  }

  public static org.apache.spark.connect.proto.SqlCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlCommand>
      PARSER = new com.google.protobuf.AbstractParser<SqlCommand>() {
    @java.lang.Override
    public SqlCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SqlCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlCommand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.SqlCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

