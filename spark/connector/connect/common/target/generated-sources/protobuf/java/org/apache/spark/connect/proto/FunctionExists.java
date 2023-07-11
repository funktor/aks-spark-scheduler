// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/catalog.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * See `spark.catalog.functionExists`
 * </pre>
 *
 * Protobuf type {@code spark.connect.FunctionExists}
 */
public final class FunctionExists extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.FunctionExists)
    FunctionExistsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionExists.newBuilder() to construct.
  private FunctionExists(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionExists() {
    functionName_ = "";
    dbName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FunctionExists();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_FunctionExists_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_FunctionExists_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.FunctionExists.class, org.apache.spark.connect.proto.FunctionExists.Builder.class);
  }

  private int bitField0_;
  public static final int FUNCTION_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object functionName_ = "";
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string function_name = 1;</code>
   * @return The functionName.
   */
  @java.lang.Override
  public java.lang.String getFunctionName() {
    java.lang.Object ref = functionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      functionName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string function_name = 1;</code>
   * @return The bytes for functionName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFunctionNameBytes() {
    java.lang.Object ref = functionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      functionName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DB_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dbName_ = "";
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string db_name = 2;</code>
   * @return Whether the dbName field is set.
   */
  @java.lang.Override
  public boolean hasDbName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string db_name = 2;</code>
   * @return The dbName.
   */
  @java.lang.Override
  public java.lang.String getDbName() {
    java.lang.Object ref = dbName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dbName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string db_name = 2;</code>
   * @return The bytes for dbName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDbNameBytes() {
    java.lang.Object ref = dbName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dbName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(functionName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, functionName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dbName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(functionName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, functionName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dbName_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.FunctionExists)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.FunctionExists other = (org.apache.spark.connect.proto.FunctionExists) obj;

    if (!getFunctionName()
        .equals(other.getFunctionName())) return false;
    if (hasDbName() != other.hasDbName()) return false;
    if (hasDbName()) {
      if (!getDbName()
          .equals(other.getDbName())) return false;
    }
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
    hash = (37 * hash) + FUNCTION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFunctionName().hashCode();
    if (hasDbName()) {
      hash = (37 * hash) + DB_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getDbName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.FunctionExists parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.FunctionExists parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.FunctionExists parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.FunctionExists prototype) {
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
   * See `spark.catalog.functionExists`
   * </pre>
   *
   * Protobuf type {@code spark.connect.FunctionExists}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.FunctionExists)
      org.apache.spark.connect.proto.FunctionExistsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_FunctionExists_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_FunctionExists_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.FunctionExists.class, org.apache.spark.connect.proto.FunctionExists.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.FunctionExists.newBuilder()
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
      functionName_ = "";
      dbName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_FunctionExists_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.FunctionExists getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.FunctionExists.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.FunctionExists build() {
      org.apache.spark.connect.proto.FunctionExists result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.FunctionExists buildPartial() {
      org.apache.spark.connect.proto.FunctionExists result = new org.apache.spark.connect.proto.FunctionExists(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.FunctionExists result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.functionName_ = functionName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dbName_ = dbName_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof org.apache.spark.connect.proto.FunctionExists) {
        return mergeFrom((org.apache.spark.connect.proto.FunctionExists)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.FunctionExists other) {
      if (other == org.apache.spark.connect.proto.FunctionExists.getDefaultInstance()) return this;
      if (!other.getFunctionName().isEmpty()) {
        functionName_ = other.functionName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDbName()) {
        dbName_ = other.dbName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
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
              functionName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              dbName_ = input.readStringRequireUtf8();
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

    private java.lang.Object functionName_ = "";
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string function_name = 1;</code>
     * @return The functionName.
     */
    public java.lang.String getFunctionName() {
      java.lang.Object ref = functionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        functionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string function_name = 1;</code>
     * @return The bytes for functionName.
     */
    public com.google.protobuf.ByteString
        getFunctionNameBytes() {
      java.lang.Object ref = functionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        functionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string function_name = 1;</code>
     * @param value The functionName to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      functionName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string function_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFunctionName() {
      functionName_ = getDefaultInstance().getFunctionName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string function_name = 1;</code>
     * @param value The bytes for functionName to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      functionName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object dbName_ = "";
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional string db_name = 2;</code>
     * @return Whether the dbName field is set.
     */
    public boolean hasDbName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional string db_name = 2;</code>
     * @return The dbName.
     */
    public java.lang.String getDbName() {
      java.lang.Object ref = dbName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dbName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional string db_name = 2;</code>
     * @return The bytes for dbName.
     */
    public com.google.protobuf.ByteString
        getDbNameBytes() {
      java.lang.Object ref = dbName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dbName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional string db_name = 2;</code>
     * @param value The dbName to set.
     * @return This builder for chaining.
     */
    public Builder setDbName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dbName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional string db_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbName() {
      dbName_ = getDefaultInstance().getDbName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional string db_name = 2;</code>
     * @param value The bytes for dbName to set.
     * @return This builder for chaining.
     */
    public Builder setDbNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dbName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:spark.connect.FunctionExists)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.FunctionExists)
  private static final org.apache.spark.connect.proto.FunctionExists DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.FunctionExists();
  }

  public static org.apache.spark.connect.proto.FunctionExists getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionExists>
      PARSER = new com.google.protobuf.AbstractParser<FunctionExists>() {
    @java.lang.Override
    public FunctionExists parsePartialFrom(
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

  public static com.google.protobuf.Parser<FunctionExists> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionExists> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.FunctionExists getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

