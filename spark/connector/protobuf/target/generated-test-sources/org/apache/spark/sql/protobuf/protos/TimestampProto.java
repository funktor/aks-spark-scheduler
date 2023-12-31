// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: timestamp.proto

package org.apache.spark.sql.protobuf.protos;

public final class TimestampProto {
  private TimestampProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TimestampOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.apache.spark.sql.protobuf.protos.Timestamp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 seconds = 1;</code>
     * @return The seconds.
     */
    long getSeconds();

    /**
     * <code>int32 nanos = 2;</code>
     * @return The nanos.
     */
    int getNanos();
  }
  /**
   * Protobuf type {@code org.apache.spark.sql.protobuf.protos.Timestamp}
   */
  public static final class Timestamp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.apache.spark.sql.protobuf.protos.Timestamp)
      TimestampOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Timestamp.newBuilder() to construct.
    private Timestamp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Timestamp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Timestamp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.sql.protobuf.protos.TimestampProto.internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.sql.protobuf.protos.TimestampProto.internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp.class, org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp.Builder.class);
    }

    public static final int SECONDS_FIELD_NUMBER = 1;
    private long seconds_ = 0L;
    /**
     * <code>int64 seconds = 1;</code>
     * @return The seconds.
     */
    @java.lang.Override
    public long getSeconds() {
      return seconds_;
    }

    public static final int NANOS_FIELD_NUMBER = 2;
    private int nanos_ = 0;
    /**
     * <code>int32 nanos = 2;</code>
     * @return The nanos.
     */
    @java.lang.Override
    public int getNanos() {
      return nanos_;
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
      if (seconds_ != 0L) {
        output.writeInt64(1, seconds_);
      }
      if (nanos_ != 0) {
        output.writeInt32(2, nanos_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (seconds_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, seconds_);
      }
      if (nanos_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, nanos_);
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
      if (!(obj instanceof org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp)) {
        return super.equals(obj);
      }
      org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp other = (org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp) obj;

      if (getSeconds()
          != other.getSeconds()) return false;
      if (getNanos()
          != other.getNanos()) return false;
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
      hash = (37 * hash) + SECONDS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSeconds());
      hash = (37 * hash) + NANOS_FIELD_NUMBER;
      hash = (53 * hash) + getNanos();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp parseFrom(
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
    public static Builder newBuilder(org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp prototype) {
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
     * Protobuf type {@code org.apache.spark.sql.protobuf.protos.Timestamp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.apache.spark.sql.protobuf.protos.Timestamp)
        org.apache.spark.sql.protobuf.protos.TimestampProto.TimestampOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.spark.sql.protobuf.protos.TimestampProto.internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.spark.sql.protobuf.protos.TimestampProto.internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp.class, org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp.Builder.class);
      }

      // Construct using org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp.newBuilder()
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
        seconds_ = 0L;
        nanos_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.spark.sql.protobuf.protos.TimestampProto.internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_descriptor;
      }

      @java.lang.Override
      public org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp getDefaultInstanceForType() {
        return org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp build() {
        org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp buildPartial() {
        org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp result = new org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.seconds_ = seconds_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.nanos_ = nanos_;
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
        if (other instanceof org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp) {
          return mergeFrom((org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp other) {
        if (other == org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp.getDefaultInstance()) return this;
        if (other.getSeconds() != 0L) {
          setSeconds(other.getSeconds());
        }
        if (other.getNanos() != 0) {
          setNanos(other.getNanos());
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
              case 8: {
                seconds_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                nanos_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private long seconds_ ;
      /**
       * <code>int64 seconds = 1;</code>
       * @return The seconds.
       */
      @java.lang.Override
      public long getSeconds() {
        return seconds_;
      }
      /**
       * <code>int64 seconds = 1;</code>
       * @param value The seconds to set.
       * @return This builder for chaining.
       */
      public Builder setSeconds(long value) {

        seconds_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 seconds = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeconds() {
        bitField0_ = (bitField0_ & ~0x00000001);
        seconds_ = 0L;
        onChanged();
        return this;
      }

      private int nanos_ ;
      /**
       * <code>int32 nanos = 2;</code>
       * @return The nanos.
       */
      @java.lang.Override
      public int getNanos() {
        return nanos_;
      }
      /**
       * <code>int32 nanos = 2;</code>
       * @param value The nanos to set.
       * @return This builder for chaining.
       */
      public Builder setNanos(int value) {

        nanos_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 nanos = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNanos() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nanos_ = 0;
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


      // @@protoc_insertion_point(builder_scope:org.apache.spark.sql.protobuf.protos.Timestamp)
    }

    // @@protoc_insertion_point(class_scope:org.apache.spark.sql.protobuf.protos.Timestamp)
    private static final org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp();
    }

    public static org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Timestamp>
        PARSER = new com.google.protobuf.AbstractParser<Timestamp>() {
      @java.lang.Override
      public Timestamp parsePartialFrom(
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

    public static com.google.protobuf.Parser<Timestamp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Timestamp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.spark.sql.protobuf.protos.TimestampProto.Timestamp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017timestamp.proto\022$org.apache.spark.sql." +
      "protobuf.protos\"+\n\tTimestamp\022\017\n\007seconds\030" +
      "\001 \001(\003\022\r\n\005nanos\030\002 \001(\005B\020B\016TimestampProtob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_spark_sql_protobuf_protos_Timestamp_descriptor,
        new java.lang.String[] { "Seconds", "Nanos", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
