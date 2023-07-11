// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * Relation alias.
 * </pre>
 *
 * Protobuf type {@code spark.connect.SubqueryAlias}
 */
public final class SubqueryAlias extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.SubqueryAlias)
    SubqueryAliasOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubqueryAlias.newBuilder() to construct.
  private SubqueryAlias(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubqueryAlias() {
    alias_ = "";
    qualifier_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubqueryAlias();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_SubqueryAlias_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_SubqueryAlias_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.SubqueryAlias.class, org.apache.spark.connect.proto.SubqueryAlias.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private org.apache.spark.connect.proto.Relation input_;
  /**
   * <pre>
   * (Required) The input relation of SubqueryAlias.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  @java.lang.Override
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <pre>
   * (Required) The input relation of SubqueryAlias.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Relation getInput() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }
  /**
   * <pre>
   * (Required) The input relation of SubqueryAlias.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }

  public static final int ALIAS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object alias_ = "";
  /**
   * <pre>
   * (Required) The alias.
   * </pre>
   *
   * <code>string alias = 2;</code>
   * @return The alias.
   */
  @java.lang.Override
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required) The alias.
   * </pre>
   *
   * <code>string alias = 2;</code>
   * @return The bytes for alias.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUALIFIER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList qualifier_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * (Optional) Qualifier of the alias.
   * </pre>
   *
   * <code>repeated string qualifier = 3;</code>
   * @return A list containing the qualifier.
   */
  public com.google.protobuf.ProtocolStringList
      getQualifierList() {
    return qualifier_;
  }
  /**
   * <pre>
   * (Optional) Qualifier of the alias.
   * </pre>
   *
   * <code>repeated string qualifier = 3;</code>
   * @return The count of qualifier.
   */
  public int getQualifierCount() {
    return qualifier_.size();
  }
  /**
   * <pre>
   * (Optional) Qualifier of the alias.
   * </pre>
   *
   * <code>repeated string qualifier = 3;</code>
   * @param index The index of the element to return.
   * @return The qualifier at the given index.
   */
  public java.lang.String getQualifier(int index) {
    return qualifier_.get(index);
  }
  /**
   * <pre>
   * (Optional) Qualifier of the alias.
   * </pre>
   *
   * <code>repeated string qualifier = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the qualifier at the given index.
   */
  public com.google.protobuf.ByteString
      getQualifierBytes(int index) {
    return qualifier_.getByteString(index);
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
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alias_);
    }
    for (int i = 0; i < qualifier_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, qualifier_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInput());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alias_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < qualifier_.size(); i++) {
        dataSize += computeStringSizeNoTag(qualifier_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getQualifierList().size();
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
    if (!(obj instanceof org.apache.spark.connect.proto.SubqueryAlias)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.SubqueryAlias other = (org.apache.spark.connect.proto.SubqueryAlias) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getAlias()
        .equals(other.getAlias())) return false;
    if (!getQualifierList()
        .equals(other.getQualifierList())) return false;
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
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    if (getQualifierCount() > 0) {
      hash = (37 * hash) + QUALIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getQualifierList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.SubqueryAlias parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.SubqueryAlias parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.SubqueryAlias parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.SubqueryAlias prototype) {
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
   * Relation alias.
   * </pre>
   *
   * Protobuf type {@code spark.connect.SubqueryAlias}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.SubqueryAlias)
      org.apache.spark.connect.proto.SubqueryAliasOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_SubqueryAlias_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_SubqueryAlias_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.SubqueryAlias.class, org.apache.spark.connect.proto.SubqueryAlias.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.SubqueryAlias.newBuilder()
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
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      alias_ = "";
      qualifier_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_SubqueryAlias_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.SubqueryAlias getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.SubqueryAlias.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.SubqueryAlias build() {
      org.apache.spark.connect.proto.SubqueryAlias result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.SubqueryAlias buildPartial() {
      org.apache.spark.connect.proto.SubqueryAlias result = new org.apache.spark.connect.proto.SubqueryAlias(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.SubqueryAlias result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.input_ = inputBuilder_ == null
            ? input_
            : inputBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.alias_ = alias_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        qualifier_.makeImmutable();
        result.qualifier_ = qualifier_;
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
      if (other instanceof org.apache.spark.connect.proto.SubqueryAlias) {
        return mergeFrom((org.apache.spark.connect.proto.SubqueryAlias)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.SubqueryAlias other) {
      if (other == org.apache.spark.connect.proto.SubqueryAlias.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.qualifier_.isEmpty()) {
        if (qualifier_.isEmpty()) {
          qualifier_ = other.qualifier_;
          bitField0_ |= 0x00000004;
        } else {
          ensureQualifierIsMutable();
          qualifier_.addAll(other.qualifier_);
        }
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
              input.readMessage(
                  getInputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              alias_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureQualifierIsMutable();
              qualifier_.add(s);
              break;
            } // case 26
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

    private org.apache.spark.connect.proto.Relation input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> inputBuilder_;
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     * @return Whether the input field is set.
     */
    public boolean hasInput() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     * @return The input.
     */
    public org.apache.spark.connect.proto.Relation getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder setInput(org.apache.spark.connect.proto.Relation value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
      } else {
        inputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder setInput(
        org.apache.spark.connect.proto.Relation.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder mergeInput(org.apache.spark.connect.proto.Relation value) {
      if (inputBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          input_ != null &&
          input_ != org.apache.spark.connect.proto.Relation.getDefaultInstance()) {
          getInputBuilder().mergeFrom(value);
        } else {
          input_ = value;
        }
      } else {
        inputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder clearInput() {
      bitField0_ = (bitField0_ & ~0x00000001);
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public org.apache.spark.connect.proto.Relation.Builder getInputBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
      }
    }
    /**
     * <pre>
     * (Required) The input relation of SubqueryAlias.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }

    private java.lang.Object alias_ = "";
    /**
     * <pre>
     * (Required) The alias.
     * </pre>
     *
     * <code>string alias = 2;</code>
     * @return The alias.
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required) The alias.
     * </pre>
     *
     * <code>string alias = 2;</code>
     * @return The bytes for alias.
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required) The alias.
     * </pre>
     *
     * <code>string alias = 2;</code>
     * @param value The alias to set.
     * @return This builder for chaining.
     */
    public Builder setAlias(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      alias_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The alias.
     * </pre>
     *
     * <code>string alias = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlias() {
      alias_ = getDefaultInstance().getAlias();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The alias.
     * </pre>
     *
     * <code>string alias = 2;</code>
     * @param value The bytes for alias to set.
     * @return This builder for chaining.
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      alias_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList qualifier_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureQualifierIsMutable() {
      if (!qualifier_.isModifiable()) {
        qualifier_ = new com.google.protobuf.LazyStringArrayList(qualifier_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @return A list containing the qualifier.
     */
    public com.google.protobuf.ProtocolStringList
        getQualifierList() {
      qualifier_.makeImmutable();
      return qualifier_;
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @return The count of qualifier.
     */
    public int getQualifierCount() {
      return qualifier_.size();
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @param index The index of the element to return.
     * @return The qualifier at the given index.
     */
    public java.lang.String getQualifier(int index) {
      return qualifier_.get(index);
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the qualifier at the given index.
     */
    public com.google.protobuf.ByteString
        getQualifierBytes(int index) {
      return qualifier_.getByteString(index);
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @param index The index to set the value at.
     * @param value The qualifier to set.
     * @return This builder for chaining.
     */
    public Builder setQualifier(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureQualifierIsMutable();
      qualifier_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @param value The qualifier to add.
     * @return This builder for chaining.
     */
    public Builder addQualifier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureQualifierIsMutable();
      qualifier_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @param values The qualifier to add.
     * @return This builder for chaining.
     */
    public Builder addAllQualifier(
        java.lang.Iterable<java.lang.String> values) {
      ensureQualifierIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, qualifier_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQualifier() {
      qualifier_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Qualifier of the alias.
     * </pre>
     *
     * <code>repeated string qualifier = 3;</code>
     * @param value The bytes of the qualifier to add.
     * @return This builder for chaining.
     */
    public Builder addQualifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureQualifierIsMutable();
      qualifier_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.SubqueryAlias)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.SubqueryAlias)
  private static final org.apache.spark.connect.proto.SubqueryAlias DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.SubqueryAlias();
  }

  public static org.apache.spark.connect.proto.SubqueryAlias getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubqueryAlias>
      PARSER = new com.google.protobuf.AbstractParser<SubqueryAlias>() {
    @java.lang.Override
    public SubqueryAlias parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubqueryAlias> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubqueryAlias> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.SubqueryAlias getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

