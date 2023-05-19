package ma.enset.radarservice.web.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: radar-service.proto")
public final class RadarServiceGrpc {

  private RadarServiceGrpc() {}

  public static final String SERVICE_NAME = "RadarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest,
      ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation> getGenerateSpeedViolationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateSpeedViolations",
      requestType = ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest.class,
      responseType = ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest,
      ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation> getGenerateSpeedViolationsMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest, ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation> getGenerateSpeedViolationsMethod;
    if ((getGenerateSpeedViolationsMethod = RadarServiceGrpc.getGenerateSpeedViolationsMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getGenerateSpeedViolationsMethod = RadarServiceGrpc.getGenerateSpeedViolationsMethod) == null) {
          RadarServiceGrpc.getGenerateSpeedViolationsMethod = getGenerateSpeedViolationsMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest, ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RadarService", "GenerateSpeedViolations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("GenerateSpeedViolations"))
                  .build();
          }
        }
     }
     return getGenerateSpeedViolationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarServiceStub newStub(io.grpc.Channel channel) {
    return new RadarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateSpeedViolations(ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateSpeedViolationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateSpeedViolationsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest,
                ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation>(
                  this, METHODID_GENERATE_SPEED_VIOLATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class RadarServiceStub extends io.grpc.stub.AbstractStub<RadarServiceStub> {
    private RadarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateSpeedViolations(ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGenerateSpeedViolationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarServiceBlockingStub> {
    private RadarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation> generateSpeedViolations(
        ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGenerateSpeedViolationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarServiceFutureStub extends io.grpc.stub.AbstractStub<RadarServiceFutureStub> {
    private RadarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GENERATE_SPEED_VIOLATIONS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_SPEED_VIOLATIONS:
          serviceImpl.generateSpeedViolations((ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.GenerateSpeedViolationRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.SpeedViolation>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarService");
    }
  }

  private static final class RadarServiceFileDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier {
    RadarServiceFileDescriptorSupplier() {}
  }

  private static final class RadarServiceMethodDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarServiceFileDescriptorSupplier())
              .addMethod(getGenerateSpeedViolationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
