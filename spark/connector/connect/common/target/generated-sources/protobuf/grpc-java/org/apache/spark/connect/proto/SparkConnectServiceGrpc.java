package org.apache.spark.connect.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Main interface for the SparkConnect service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: spark/connect/base.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SparkConnectServiceGrpc {

  private SparkConnectServiceGrpc() {}

  public static final String SERVICE_NAME = "spark.connect.SparkConnectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ExecutePlanRequest,
      org.apache.spark.connect.proto.ExecutePlanResponse> getExecutePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecutePlan",
      requestType = org.apache.spark.connect.proto.ExecutePlanRequest.class,
      responseType = org.apache.spark.connect.proto.ExecutePlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ExecutePlanRequest,
      org.apache.spark.connect.proto.ExecutePlanResponse> getExecutePlanMethod() {
    io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ExecutePlanRequest, org.apache.spark.connect.proto.ExecutePlanResponse> getExecutePlanMethod;
    if ((getExecutePlanMethod = SparkConnectServiceGrpc.getExecutePlanMethod) == null) {
      synchronized (SparkConnectServiceGrpc.class) {
        if ((getExecutePlanMethod = SparkConnectServiceGrpc.getExecutePlanMethod) == null) {
          SparkConnectServiceGrpc.getExecutePlanMethod = getExecutePlanMethod =
              io.grpc.MethodDescriptor.<org.apache.spark.connect.proto.ExecutePlanRequest, org.apache.spark.connect.proto.ExecutePlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecutePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.ExecutePlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.ExecutePlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparkConnectServiceMethodDescriptorSupplier("ExecutePlan"))
              .build();
        }
      }
    }
    return getExecutePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.spark.connect.proto.AnalyzePlanRequest,
      org.apache.spark.connect.proto.AnalyzePlanResponse> getAnalyzePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzePlan",
      requestType = org.apache.spark.connect.proto.AnalyzePlanRequest.class,
      responseType = org.apache.spark.connect.proto.AnalyzePlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.spark.connect.proto.AnalyzePlanRequest,
      org.apache.spark.connect.proto.AnalyzePlanResponse> getAnalyzePlanMethod() {
    io.grpc.MethodDescriptor<org.apache.spark.connect.proto.AnalyzePlanRequest, org.apache.spark.connect.proto.AnalyzePlanResponse> getAnalyzePlanMethod;
    if ((getAnalyzePlanMethod = SparkConnectServiceGrpc.getAnalyzePlanMethod) == null) {
      synchronized (SparkConnectServiceGrpc.class) {
        if ((getAnalyzePlanMethod = SparkConnectServiceGrpc.getAnalyzePlanMethod) == null) {
          SparkConnectServiceGrpc.getAnalyzePlanMethod = getAnalyzePlanMethod =
              io.grpc.MethodDescriptor.<org.apache.spark.connect.proto.AnalyzePlanRequest, org.apache.spark.connect.proto.AnalyzePlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.AnalyzePlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.AnalyzePlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparkConnectServiceMethodDescriptorSupplier("AnalyzePlan"))
              .build();
        }
      }
    }
    return getAnalyzePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ConfigRequest,
      org.apache.spark.connect.proto.ConfigResponse> getConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Config",
      requestType = org.apache.spark.connect.proto.ConfigRequest.class,
      responseType = org.apache.spark.connect.proto.ConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ConfigRequest,
      org.apache.spark.connect.proto.ConfigResponse> getConfigMethod() {
    io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ConfigRequest, org.apache.spark.connect.proto.ConfigResponse> getConfigMethod;
    if ((getConfigMethod = SparkConnectServiceGrpc.getConfigMethod) == null) {
      synchronized (SparkConnectServiceGrpc.class) {
        if ((getConfigMethod = SparkConnectServiceGrpc.getConfigMethod) == null) {
          SparkConnectServiceGrpc.getConfigMethod = getConfigMethod =
              io.grpc.MethodDescriptor.<org.apache.spark.connect.proto.ConfigRequest, org.apache.spark.connect.proto.ConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Config"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.ConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparkConnectServiceMethodDescriptorSupplier("Config"))
              .build();
        }
      }
    }
    return getConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.spark.connect.proto.AddArtifactsRequest,
      org.apache.spark.connect.proto.AddArtifactsResponse> getAddArtifactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddArtifacts",
      requestType = org.apache.spark.connect.proto.AddArtifactsRequest.class,
      responseType = org.apache.spark.connect.proto.AddArtifactsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.spark.connect.proto.AddArtifactsRequest,
      org.apache.spark.connect.proto.AddArtifactsResponse> getAddArtifactsMethod() {
    io.grpc.MethodDescriptor<org.apache.spark.connect.proto.AddArtifactsRequest, org.apache.spark.connect.proto.AddArtifactsResponse> getAddArtifactsMethod;
    if ((getAddArtifactsMethod = SparkConnectServiceGrpc.getAddArtifactsMethod) == null) {
      synchronized (SparkConnectServiceGrpc.class) {
        if ((getAddArtifactsMethod = SparkConnectServiceGrpc.getAddArtifactsMethod) == null) {
          SparkConnectServiceGrpc.getAddArtifactsMethod = getAddArtifactsMethod =
              io.grpc.MethodDescriptor.<org.apache.spark.connect.proto.AddArtifactsRequest, org.apache.spark.connect.proto.AddArtifactsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddArtifacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.AddArtifactsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.AddArtifactsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparkConnectServiceMethodDescriptorSupplier("AddArtifacts"))
              .build();
        }
      }
    }
    return getAddArtifactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ArtifactStatusesRequest,
      org.apache.spark.connect.proto.ArtifactStatusesResponse> getArtifactStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArtifactStatus",
      requestType = org.apache.spark.connect.proto.ArtifactStatusesRequest.class,
      responseType = org.apache.spark.connect.proto.ArtifactStatusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ArtifactStatusesRequest,
      org.apache.spark.connect.proto.ArtifactStatusesResponse> getArtifactStatusMethod() {
    io.grpc.MethodDescriptor<org.apache.spark.connect.proto.ArtifactStatusesRequest, org.apache.spark.connect.proto.ArtifactStatusesResponse> getArtifactStatusMethod;
    if ((getArtifactStatusMethod = SparkConnectServiceGrpc.getArtifactStatusMethod) == null) {
      synchronized (SparkConnectServiceGrpc.class) {
        if ((getArtifactStatusMethod = SparkConnectServiceGrpc.getArtifactStatusMethod) == null) {
          SparkConnectServiceGrpc.getArtifactStatusMethod = getArtifactStatusMethod =
              io.grpc.MethodDescriptor.<org.apache.spark.connect.proto.ArtifactStatusesRequest, org.apache.spark.connect.proto.ArtifactStatusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArtifactStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.ArtifactStatusesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.ArtifactStatusesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparkConnectServiceMethodDescriptorSupplier("ArtifactStatus"))
              .build();
        }
      }
    }
    return getArtifactStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.spark.connect.proto.InterruptRequest,
      org.apache.spark.connect.proto.InterruptResponse> getInterruptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Interrupt",
      requestType = org.apache.spark.connect.proto.InterruptRequest.class,
      responseType = org.apache.spark.connect.proto.InterruptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.spark.connect.proto.InterruptRequest,
      org.apache.spark.connect.proto.InterruptResponse> getInterruptMethod() {
    io.grpc.MethodDescriptor<org.apache.spark.connect.proto.InterruptRequest, org.apache.spark.connect.proto.InterruptResponse> getInterruptMethod;
    if ((getInterruptMethod = SparkConnectServiceGrpc.getInterruptMethod) == null) {
      synchronized (SparkConnectServiceGrpc.class) {
        if ((getInterruptMethod = SparkConnectServiceGrpc.getInterruptMethod) == null) {
          SparkConnectServiceGrpc.getInterruptMethod = getInterruptMethod =
              io.grpc.MethodDescriptor.<org.apache.spark.connect.proto.InterruptRequest, org.apache.spark.connect.proto.InterruptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Interrupt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.InterruptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.spark.connect.proto.InterruptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparkConnectServiceMethodDescriptorSupplier("Interrupt"))
              .build();
        }
      }
    }
    return getInterruptMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SparkConnectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SparkConnectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SparkConnectServiceStub>() {
        @java.lang.Override
        public SparkConnectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SparkConnectServiceStub(channel, callOptions);
        }
      };
    return SparkConnectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SparkConnectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SparkConnectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SparkConnectServiceBlockingStub>() {
        @java.lang.Override
        public SparkConnectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SparkConnectServiceBlockingStub(channel, callOptions);
        }
      };
    return SparkConnectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SparkConnectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SparkConnectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SparkConnectServiceFutureStub>() {
        @java.lang.Override
        public SparkConnectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SparkConnectServiceFutureStub(channel, callOptions);
        }
      };
    return SparkConnectServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Main interface for the SparkConnect service.
   * </pre>
   */
  public static abstract class SparkConnectServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Executes a request that contains the query and returns a stream of [[Response]].
     * It is guaranteed that there is at least one ARROW batch returned even if the result set is empty.
     * </pre>
     */
    public void executePlan(org.apache.spark.connect.proto.ExecutePlanRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ExecutePlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecutePlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Analyzes a query and returns a [[AnalyzeResponse]] containing metadata about the query.
     * </pre>
     */
    public void analyzePlan(org.apache.spark.connect.proto.AnalyzePlanRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AnalyzePlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzePlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update or fetch the configurations and returns a [[ConfigResponse]] containing the result.
     * </pre>
     */
    public void config(org.apache.spark.connect.proto.ConfigRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add artifacts to the session and returns a [[AddArtifactsResponse]] containing metadata about
     * the added artifacts.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AddArtifactsRequest> addArtifacts(
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AddArtifactsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddArtifactsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check statuses of artifacts in the session and returns them in a [[ArtifactStatusesResponse]]
     * </pre>
     */
    public void artifactStatus(org.apache.spark.connect.proto.ArtifactStatusesRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ArtifactStatusesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArtifactStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Interrupts running executions
     * </pre>
     */
    public void interrupt(org.apache.spark.connect.proto.InterruptRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.InterruptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInterruptMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecutePlanMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.apache.spark.connect.proto.ExecutePlanRequest,
                org.apache.spark.connect.proto.ExecutePlanResponse>(
                  this, METHODID_EXECUTE_PLAN)))
          .addMethod(
            getAnalyzePlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.spark.connect.proto.AnalyzePlanRequest,
                org.apache.spark.connect.proto.AnalyzePlanResponse>(
                  this, METHODID_ANALYZE_PLAN)))
          .addMethod(
            getConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.spark.connect.proto.ConfigRequest,
                org.apache.spark.connect.proto.ConfigResponse>(
                  this, METHODID_CONFIG)))
          .addMethod(
            getAddArtifactsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.spark.connect.proto.AddArtifactsRequest,
                org.apache.spark.connect.proto.AddArtifactsResponse>(
                  this, METHODID_ADD_ARTIFACTS)))
          .addMethod(
            getArtifactStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.spark.connect.proto.ArtifactStatusesRequest,
                org.apache.spark.connect.proto.ArtifactStatusesResponse>(
                  this, METHODID_ARTIFACT_STATUS)))
          .addMethod(
            getInterruptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.spark.connect.proto.InterruptRequest,
                org.apache.spark.connect.proto.InterruptResponse>(
                  this, METHODID_INTERRUPT)))
          .build();
    }
  }

  /**
   * <pre>
   * Main interface for the SparkConnect service.
   * </pre>
   */
  public static final class SparkConnectServiceStub extends io.grpc.stub.AbstractAsyncStub<SparkConnectServiceStub> {
    private SparkConnectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparkConnectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparkConnectServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes a request that contains the query and returns a stream of [[Response]].
     * It is guaranteed that there is at least one ARROW batch returned even if the result set is empty.
     * </pre>
     */
    public void executePlan(org.apache.spark.connect.proto.ExecutePlanRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ExecutePlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getExecutePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Analyzes a query and returns a [[AnalyzeResponse]] containing metadata about the query.
     * </pre>
     */
    public void analyzePlan(org.apache.spark.connect.proto.AnalyzePlanRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AnalyzePlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update or fetch the configurations and returns a [[ConfigResponse]] containing the result.
     * </pre>
     */
    public void config(org.apache.spark.connect.proto.ConfigRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add artifacts to the session and returns a [[AddArtifactsResponse]] containing metadata about
     * the added artifacts.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AddArtifactsRequest> addArtifacts(
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AddArtifactsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAddArtifactsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Check statuses of artifacts in the session and returns them in a [[ArtifactStatusesResponse]]
     * </pre>
     */
    public void artifactStatus(org.apache.spark.connect.proto.ArtifactStatusesRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ArtifactStatusesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArtifactStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Interrupts running executions
     * </pre>
     */
    public void interrupt(org.apache.spark.connect.proto.InterruptRequest request,
        io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.InterruptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInterruptMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Main interface for the SparkConnect service.
   * </pre>
   */
  public static final class SparkConnectServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SparkConnectServiceBlockingStub> {
    private SparkConnectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparkConnectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparkConnectServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes a request that contains the query and returns a stream of [[Response]].
     * It is guaranteed that there is at least one ARROW batch returned even if the result set is empty.
     * </pre>
     */
    public java.util.Iterator<org.apache.spark.connect.proto.ExecutePlanResponse> executePlan(
        org.apache.spark.connect.proto.ExecutePlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getExecutePlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Analyzes a query and returns a [[AnalyzeResponse]] containing metadata about the query.
     * </pre>
     */
    public org.apache.spark.connect.proto.AnalyzePlanResponse analyzePlan(org.apache.spark.connect.proto.AnalyzePlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzePlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update or fetch the configurations and returns a [[ConfigResponse]] containing the result.
     * </pre>
     */
    public org.apache.spark.connect.proto.ConfigResponse config(org.apache.spark.connect.proto.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check statuses of artifacts in the session and returns them in a [[ArtifactStatusesResponse]]
     * </pre>
     */
    public org.apache.spark.connect.proto.ArtifactStatusesResponse artifactStatus(org.apache.spark.connect.proto.ArtifactStatusesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArtifactStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Interrupts running executions
     * </pre>
     */
    public org.apache.spark.connect.proto.InterruptResponse interrupt(org.apache.spark.connect.proto.InterruptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInterruptMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Main interface for the SparkConnect service.
   * </pre>
   */
  public static final class SparkConnectServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SparkConnectServiceFutureStub> {
    private SparkConnectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparkConnectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparkConnectServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Analyzes a query and returns a [[AnalyzeResponse]] containing metadata about the query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.spark.connect.proto.AnalyzePlanResponse> analyzePlan(
        org.apache.spark.connect.proto.AnalyzePlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzePlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update or fetch the configurations and returns a [[ConfigResponse]] containing the result.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.spark.connect.proto.ConfigResponse> config(
        org.apache.spark.connect.proto.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check statuses of artifacts in the session and returns them in a [[ArtifactStatusesResponse]]
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.spark.connect.proto.ArtifactStatusesResponse> artifactStatus(
        org.apache.spark.connect.proto.ArtifactStatusesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArtifactStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Interrupts running executions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.spark.connect.proto.InterruptResponse> interrupt(
        org.apache.spark.connect.proto.InterruptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInterruptMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_PLAN = 0;
  private static final int METHODID_ANALYZE_PLAN = 1;
  private static final int METHODID_CONFIG = 2;
  private static final int METHODID_ARTIFACT_STATUS = 3;
  private static final int METHODID_INTERRUPT = 4;
  private static final int METHODID_ADD_ARTIFACTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SparkConnectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SparkConnectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_PLAN:
          serviceImpl.executePlan((org.apache.spark.connect.proto.ExecutePlanRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ExecutePlanResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_PLAN:
          serviceImpl.analyzePlan((org.apache.spark.connect.proto.AnalyzePlanRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AnalyzePlanResponse>) responseObserver);
          break;
        case METHODID_CONFIG:
          serviceImpl.config((org.apache.spark.connect.proto.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ConfigResponse>) responseObserver);
          break;
        case METHODID_ARTIFACT_STATUS:
          serviceImpl.artifactStatus((org.apache.spark.connect.proto.ArtifactStatusesRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.ArtifactStatusesResponse>) responseObserver);
          break;
        case METHODID_INTERRUPT:
          serviceImpl.interrupt((org.apache.spark.connect.proto.InterruptRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.InterruptResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ARTIFACTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addArtifacts(
              (io.grpc.stub.StreamObserver<org.apache.spark.connect.proto.AddArtifactsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SparkConnectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SparkConnectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.spark.connect.proto.Base.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SparkConnectService");
    }
  }

  private static final class SparkConnectServiceFileDescriptorSupplier
      extends SparkConnectServiceBaseDescriptorSupplier {
    SparkConnectServiceFileDescriptorSupplier() {}
  }

  private static final class SparkConnectServiceMethodDescriptorSupplier
      extends SparkConnectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SparkConnectServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SparkConnectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SparkConnectServiceFileDescriptorSupplier())
              .addMethod(getExecutePlanMethod())
              .addMethod(getAnalyzePlanMethod())
              .addMethod(getConfigMethod())
              .addMethod(getAddArtifactsMethod())
              .addMethod(getArtifactStatusMethod())
              .addMethod(getInterruptMethod())
              .build();
        }
      }
    }
    return result;
  }
}
