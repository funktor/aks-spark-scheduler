// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * A command that can create DataFrame global temp view or local temp view.
 * </pre>
 *
 * Protobuf type {@code spark.connect.CreateDataFrameViewCommand}
 */
public final class CreateDataFrameViewCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.CreateDataFrameViewCommand)
    CreateDataFrameViewCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDataFrameViewCommand.newBuilder() to construct.
  private CreateDataFrameViewCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDataFrameViewCommand() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDataFrameViewCommand();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_CreateDataFrameViewCommand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_CreateDataFrameViewCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.CreateDataFrameViewCommand.class, org.apache.spark.connect.proto.CreateDataFrameViewCommand.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private org.apache.spark.connect.proto.Relation input_;
  /**
   * <pre>
   * (Required) The relation that this view will be built on.
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
   * (Required) The relation that this view will be built on.
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
   * (Required) The relation that this view will be built on.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * (Required) View name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required) View name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_GLOBAL_FIELD_NUMBER = 3;
  private boolean isGlobal_ = false;
  /**
   * <pre>
   * (Required) Whether this is global temp view or local temp view.
   * </pre>
   *
   * <code>bool is_global = 3;</code>
   * @return The isGlobal.
   */
  @java.lang.Override
  public boolean getIsGlobal() {
    return isGlobal_;
  }

  public static final int REPLACE_FIELD_NUMBER = 4;
  private boolean replace_ = false;
  /**
   * <pre>
   * (Required)
   *
   * If true, and if the view already exists, updates it; if false, and if the view
   * already exists, throws exception.
   * </pre>
   *
   * <code>bool replace = 4;</code>
   * @return The replace.
   */
  @java.lang.Override
  public boolean getReplace() {
    return replace_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (isGlobal_ != false) {
      output.writeBool(3, isGlobal_);
    }
    if (replace_ != false) {
      output.writeBool(4, replace_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (isGlobal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isGlobal_);
    }
    if (replace_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, replace_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.CreateDataFrameViewCommand)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.CreateDataFrameViewCommand other = (org.apache.spark.connect.proto.CreateDataFrameViewCommand) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (getIsGlobal()
        != other.getIsGlobal()) return false;
    if (getReplace()
        != other.getReplace()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + IS_GLOBAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsGlobal());
    hash = (37 * hash) + REPLACE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReplace());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.CreateDataFrameViewCommand prototype) {
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
   * A command that can create DataFrame global temp view or local temp view.
   * </pre>
   *
   * Protobuf type {@code spark.connect.CreateDataFrameViewCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.CreateDataFrameViewCommand)
      org.apache.spark.connect.proto.CreateDataFrameViewCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_CreateDataFrameViewCommand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_CreateDataFrameViewCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.CreateDataFrameViewCommand.class, org.apache.spark.connect.proto.CreateDataFrameViewCommand.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.CreateDataFrameViewCommand.newBuilder()
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
      name_ = "";
      isGlobal_ = false;
      replace_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Commands.internal_static_spark_connect_CreateDataFrameViewCommand_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CreateDataFrameViewCommand getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.CreateDataFrameViewCommand.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CreateDataFrameViewCommand build() {
      org.apache.spark.connect.proto.CreateDataFrameViewCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CreateDataFrameViewCommand buildPartial() {
      org.apache.spark.connect.proto.CreateDataFrameViewCommand result = new org.apache.spark.connect.proto.CreateDataFrameViewCommand(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.CreateDataFrameViewCommand result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.input_ = inputBuilder_ == null
            ? input_
            : inputBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isGlobal_ = isGlobal_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.replace_ = replace_;
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
      if (other instanceof org.apache.spark.connect.proto.CreateDataFrameViewCommand) {
        return mergeFrom((org.apache.spark.connect.proto.CreateDataFrameViewCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.CreateDataFrameViewCommand other) {
      if (other == org.apache.spark.connect.proto.CreateDataFrameViewCommand.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getIsGlobal() != false) {
        setIsGlobal(other.getIsGlobal());
      }
      if (other.getReplace() != false) {
        setReplace(other.getReplace());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              isGlobal_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              replace_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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
     * (Required) The relation that this view will be built on.
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * (Required) View name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required) View name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required) View name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) View name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) View name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean isGlobal_ ;
    /**
     * <pre>
     * (Required) Whether this is global temp view or local temp view.
     * </pre>
     *
     * <code>bool is_global = 3;</code>
     * @return The isGlobal.
     */
    @java.lang.Override
    public boolean getIsGlobal() {
      return isGlobal_;
    }
    /**
     * <pre>
     * (Required) Whether this is global temp view or local temp view.
     * </pre>
     *
     * <code>bool is_global = 3;</code>
     * @param value The isGlobal to set.
     * @return This builder for chaining.
     */
    public Builder setIsGlobal(boolean value) {

      isGlobal_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Whether this is global temp view or local temp view.
     * </pre>
     *
     * <code>bool is_global = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsGlobal() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isGlobal_ = false;
      onChanged();
      return this;
    }

    private boolean replace_ ;
    /**
     * <pre>
     * (Required)
     *
     * If true, and if the view already exists, updates it; if false, and if the view
     * already exists, throws exception.
     * </pre>
     *
     * <code>bool replace = 4;</code>
     * @return The replace.
     */
    @java.lang.Override
    public boolean getReplace() {
      return replace_;
    }
    /**
     * <pre>
     * (Required)
     *
     * If true, and if the view already exists, updates it; if false, and if the view
     * already exists, throws exception.
     * </pre>
     *
     * <code>bool replace = 4;</code>
     * @param value The replace to set.
     * @return This builder for chaining.
     */
    public Builder setReplace(boolean value) {

      replace_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required)
     *
     * If true, and if the view already exists, updates it; if false, and if the view
     * already exists, throws exception.
     * </pre>
     *
     * <code>bool replace = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReplace() {
      bitField0_ = (bitField0_ & ~0x00000008);
      replace_ = false;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.CreateDataFrameViewCommand)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.CreateDataFrameViewCommand)
  private static final org.apache.spark.connect.proto.CreateDataFrameViewCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.CreateDataFrameViewCommand();
  }

  public static org.apache.spark.connect.proto.CreateDataFrameViewCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDataFrameViewCommand>
      PARSER = new com.google.protobuf.AbstractParser<CreateDataFrameViewCommand>() {
    @java.lang.Override
    public CreateDataFrameViewCommand parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDataFrameViewCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDataFrameViewCommand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.CreateDataFrameViewCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

