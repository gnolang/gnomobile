package land.gno.gnomobile.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * GnomobileService is the service to interact with the Gno blockchain
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GnomobileServiceGrpc {

  private GnomobileServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "land.gno.gnomobile.v1.GnomobileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetRemote.Request,
      land.gno.gnomobile.v1.Rpc.SetRemote.Reply> getSetRemoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRemote",
      requestType = land.gno.gnomobile.v1.Rpc.SetRemote.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.SetRemote.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetRemote.Request,
      land.gno.gnomobile.v1.Rpc.SetRemote.Reply> getSetRemoteMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetRemote.Request, land.gno.gnomobile.v1.Rpc.SetRemote.Reply> getSetRemoteMethod;
    if ((getSetRemoteMethod = GnomobileServiceGrpc.getSetRemoteMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSetRemoteMethod = GnomobileServiceGrpc.getSetRemoteMethod) == null) {
          GnomobileServiceGrpc.getSetRemoteMethod = getSetRemoteMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.SetRemote.Request, land.gno.gnomobile.v1.Rpc.SetRemote.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRemote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetRemote.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetRemote.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRemoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetChainID.Request,
      land.gno.gnomobile.v1.Rpc.SetChainID.Reply> getSetChainIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetChainID",
      requestType = land.gno.gnomobile.v1.Rpc.SetChainID.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.SetChainID.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetChainID.Request,
      land.gno.gnomobile.v1.Rpc.SetChainID.Reply> getSetChainIDMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetChainID.Request, land.gno.gnomobile.v1.Rpc.SetChainID.Reply> getSetChainIDMethod;
    if ((getSetChainIDMethod = GnomobileServiceGrpc.getSetChainIDMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSetChainIDMethod = GnomobileServiceGrpc.getSetChainIDMethod) == null) {
          GnomobileServiceGrpc.getSetChainIDMethod = getSetChainIDMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.SetChainID.Request, land.gno.gnomobile.v1.Rpc.SetChainID.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetChainID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetChainID.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetChainID.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetChainIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request,
      land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply> getSetNameOrBech32Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetNameOrBech32",
      requestType = land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request,
      land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply> getSetNameOrBech32Method() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request, land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply> getSetNameOrBech32Method;
    if ((getSetNameOrBech32Method = GnomobileServiceGrpc.getSetNameOrBech32Method) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSetNameOrBech32Method = GnomobileServiceGrpc.getSetNameOrBech32Method) == null) {
          GnomobileServiceGrpc.getSetNameOrBech32Method = getSetNameOrBech32Method =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request, land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetNameOrBech32"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetNameOrBech32Method;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetPassword.Request,
      land.gno.gnomobile.v1.Rpc.SetPassword.Reply> getSetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPassword",
      requestType = land.gno.gnomobile.v1.Rpc.SetPassword.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.SetPassword.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetPassword.Request,
      land.gno.gnomobile.v1.Rpc.SetPassword.Reply> getSetPasswordMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SetPassword.Request, land.gno.gnomobile.v1.Rpc.SetPassword.Reply> getSetPasswordMethod;
    if ((getSetPasswordMethod = GnomobileServiceGrpc.getSetPasswordMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSetPasswordMethod = GnomobileServiceGrpc.getSetPasswordMethod) == null) {
          GnomobileServiceGrpc.getSetPasswordMethod = getSetPasswordMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.SetPassword.Request, land.gno.gnomobile.v1.Rpc.SetPassword.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetPassword.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SetPassword.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request,
      land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply> getListKeyInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeyInfo",
      requestType = land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request,
      land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply> getListKeyInfoMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request, land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply> getListKeyInfoMethod;
    if ((getListKeyInfoMethod = GnomobileServiceGrpc.getListKeyInfoMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getListKeyInfoMethod = GnomobileServiceGrpc.getListKeyInfoMethod) == null) {
          GnomobileServiceGrpc.getListKeyInfoMethod = getListKeyInfoMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request, land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeyInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListKeyInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.CreateAccount.Request,
      land.gno.gnomobile.v1.Rpc.CreateAccount.Reply> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = land.gno.gnomobile.v1.Rpc.CreateAccount.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.CreateAccount.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.CreateAccount.Request,
      land.gno.gnomobile.v1.Rpc.CreateAccount.Reply> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.CreateAccount.Request, land.gno.gnomobile.v1.Rpc.CreateAccount.Reply> getCreateAccountMethod;
    if ((getCreateAccountMethod = GnomobileServiceGrpc.getCreateAccountMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getCreateAccountMethod = GnomobileServiceGrpc.getCreateAccountMethod) == null) {
          GnomobileServiceGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.CreateAccount.Request, land.gno.gnomobile.v1.Rpc.CreateAccount.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.CreateAccount.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.CreateAccount.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SelectAccount.Request,
      land.gno.gnomobile.v1.Rpc.SelectAccount.Reply> getSelectAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectAccount",
      requestType = land.gno.gnomobile.v1.Rpc.SelectAccount.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.SelectAccount.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SelectAccount.Request,
      land.gno.gnomobile.v1.Rpc.SelectAccount.Reply> getSelectAccountMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.SelectAccount.Request, land.gno.gnomobile.v1.Rpc.SelectAccount.Reply> getSelectAccountMethod;
    if ((getSelectAccountMethod = GnomobileServiceGrpc.getSelectAccountMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSelectAccountMethod = GnomobileServiceGrpc.getSelectAccountMethod) == null) {
          GnomobileServiceGrpc.getSelectAccountMethod = getSelectAccountMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.SelectAccount.Request, land.gno.gnomobile.v1.Rpc.SelectAccount.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SelectAccount.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.SelectAccount.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSelectAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.Query.Request,
      land.gno.gnomobile.v1.Rpc.Query.Reply> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = land.gno.gnomobile.v1.Rpc.Query.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.Query.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.Query.Request,
      land.gno.gnomobile.v1.Rpc.Query.Reply> getQueryMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.Query.Request, land.gno.gnomobile.v1.Rpc.Query.Reply> getQueryMethod;
    if ((getQueryMethod = GnomobileServiceGrpc.getQueryMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getQueryMethod = GnomobileServiceGrpc.getQueryMethod) == null) {
          GnomobileServiceGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.Query.Request, land.gno.gnomobile.v1.Rpc.Query.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.Query.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.Query.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.Call.Request,
      land.gno.gnomobile.v1.Rpc.Call.Reply> getCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Call",
      requestType = land.gno.gnomobile.v1.Rpc.Call.Request.class,
      responseType = land.gno.gnomobile.v1.Rpc.Call.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.Call.Request,
      land.gno.gnomobile.v1.Rpc.Call.Reply> getCallMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Rpc.Call.Request, land.gno.gnomobile.v1.Rpc.Call.Reply> getCallMethod;
    if ((getCallMethod = GnomobileServiceGrpc.getCallMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getCallMethod = GnomobileServiceGrpc.getCallMethod) == null) {
          GnomobileServiceGrpc.getCallMethod = getCallMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Rpc.Call.Request, land.gno.gnomobile.v1.Rpc.Call.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Call"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.Call.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Rpc.Call.Reply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GnomobileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GnomobileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GnomobileServiceStub>() {
        @java.lang.Override
        public GnomobileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GnomobileServiceStub(channel, callOptions);
        }
      };
    return GnomobileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GnomobileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GnomobileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GnomobileServiceBlockingStub>() {
        @java.lang.Override
        public GnomobileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GnomobileServiceBlockingStub(channel, callOptions);
        }
      };
    return GnomobileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GnomobileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GnomobileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GnomobileServiceFutureStub>() {
        @java.lang.Override
        public GnomobileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GnomobileServiceFutureStub(channel, callOptions);
        }
      };
    return GnomobileServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * GnomobileService is the service to interact with the Gno blockchain
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Set the connection addresse for the remote node. If you don't call this,
     * the default is "127.0.0.1:26657"
     * </pre>
     */
    default void setRemote(land.gno.gnomobile.v1.Rpc.SetRemote.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetRemote.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRemoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    default void setChainID(land.gno.gnomobile.v1.Rpc.SetChainID.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetChainID.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetChainIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the nameOrBech32 for the account in the keybase, used for later
     * operations
     * </pre>
     */
    default void setNameOrBech32(land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetNameOrBech32Method(), responseObserver);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    default void setPassword(land.gno.gnomobile.v1.Rpc.SetPassword.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetPassword.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    default void listKeyInfo(land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeyInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    default void createAccount(land.gno.gnomobile.v1.Rpc.CreateAccount.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.CreateAccount.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * SelectAccount selects the account to use for later operations
     * </pre>
     */
    default void selectAccount(land.gno.gnomobile.v1.Rpc.SelectAccount.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SelectAccount.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    default void query(land.gno.gnomobile.v1.Rpc.Query.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.Query.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    default void call(land.gno.gnomobile.v1.Rpc.Call.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.Call.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GnomobileService.
   * <pre>
   * GnomobileService is the service to interact with the Gno blockchain
   * </pre>
   */
  public static abstract class GnomobileServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GnomobileServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GnomobileService.
   * <pre>
   * GnomobileService is the service to interact with the Gno blockchain
   * </pre>
   */
  public static final class GnomobileServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GnomobileServiceStub> {
    private GnomobileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GnomobileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GnomobileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set the connection addresse for the remote node. If you don't call this,
     * the default is "127.0.0.1:26657"
     * </pre>
     */
    public void setRemote(land.gno.gnomobile.v1.Rpc.SetRemote.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetRemote.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRemoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    public void setChainID(land.gno.gnomobile.v1.Rpc.SetChainID.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetChainID.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetChainIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the nameOrBech32 for the account in the keybase, used for later
     * operations
     * </pre>
     */
    public void setNameOrBech32(land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetNameOrBech32Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    public void setPassword(land.gno.gnomobile.v1.Rpc.SetPassword.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetPassword.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    public void listKeyInfo(land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeyInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    public void createAccount(land.gno.gnomobile.v1.Rpc.CreateAccount.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.CreateAccount.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SelectAccount selects the account to use for later operations
     * </pre>
     */
    public void selectAccount(land.gno.gnomobile.v1.Rpc.SelectAccount.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SelectAccount.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    public void query(land.gno.gnomobile.v1.Rpc.Query.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.Query.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    public void call(land.gno.gnomobile.v1.Rpc.Call.Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.Call.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GnomobileService.
   * <pre>
   * GnomobileService is the service to interact with the Gno blockchain
   * </pre>
   */
  public static final class GnomobileServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GnomobileServiceBlockingStub> {
    private GnomobileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GnomobileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GnomobileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set the connection addresse for the remote node. If you don't call this,
     * the default is "127.0.0.1:26657"
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.SetRemote.Reply setRemote(land.gno.gnomobile.v1.Rpc.SetRemote.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRemoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.SetChainID.Reply setChainID(land.gno.gnomobile.v1.Rpc.SetChainID.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetChainIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the nameOrBech32 for the account in the keybase, used for later
     * operations
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply setNameOrBech32(land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetNameOrBech32Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.SetPassword.Reply setPassword(land.gno.gnomobile.v1.Rpc.SetPassword.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply listKeyInfo(land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeyInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.CreateAccount.Reply createAccount(land.gno.gnomobile.v1.Rpc.CreateAccount.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SelectAccount selects the account to use for later operations
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.SelectAccount.Reply selectAccount(land.gno.gnomobile.v1.Rpc.SelectAccount.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.Query.Reply query(land.gno.gnomobile.v1.Rpc.Query.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    public land.gno.gnomobile.v1.Rpc.Call.Reply call(land.gno.gnomobile.v1.Rpc.Call.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GnomobileService.
   * <pre>
   * GnomobileService is the service to interact with the Gno blockchain
   * </pre>
   */
  public static final class GnomobileServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GnomobileServiceFutureStub> {
    private GnomobileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GnomobileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GnomobileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set the connection addresse for the remote node. If you don't call this,
     * the default is "127.0.0.1:26657"
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.SetRemote.Reply> setRemote(
        land.gno.gnomobile.v1.Rpc.SetRemote.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRemoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.SetChainID.Reply> setChainID(
        land.gno.gnomobile.v1.Rpc.SetChainID.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetChainIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the nameOrBech32 for the account in the keybase, used for later
     * operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply> setNameOrBech32(
        land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetNameOrBech32Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.SetPassword.Reply> setPassword(
        land.gno.gnomobile.v1.Rpc.SetPassword.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply> listKeyInfo(
        land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeyInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.CreateAccount.Reply> createAccount(
        land.gno.gnomobile.v1.Rpc.CreateAccount.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SelectAccount selects the account to use for later operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.SelectAccount.Reply> selectAccount(
        land.gno.gnomobile.v1.Rpc.SelectAccount.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.Query.Reply> query(
        land.gno.gnomobile.v1.Rpc.Query.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Rpc.Call.Reply> call(
        land.gno.gnomobile.v1.Rpc.Call.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_REMOTE = 0;
  private static final int METHODID_SET_CHAIN_ID = 1;
  private static final int METHODID_SET_NAME_OR_BECH32 = 2;
  private static final int METHODID_SET_PASSWORD = 3;
  private static final int METHODID_LIST_KEY_INFO = 4;
  private static final int METHODID_CREATE_ACCOUNT = 5;
  private static final int METHODID_SELECT_ACCOUNT = 6;
  private static final int METHODID_QUERY = 7;
  private static final int METHODID_CALL = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_REMOTE:
          serviceImpl.setRemote((land.gno.gnomobile.v1.Rpc.SetRemote.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetRemote.Reply>) responseObserver);
          break;
        case METHODID_SET_CHAIN_ID:
          serviceImpl.setChainID((land.gno.gnomobile.v1.Rpc.SetChainID.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetChainID.Reply>) responseObserver);
          break;
        case METHODID_SET_NAME_OR_BECH32:
          serviceImpl.setNameOrBech32((land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply>) responseObserver);
          break;
        case METHODID_SET_PASSWORD:
          serviceImpl.setPassword((land.gno.gnomobile.v1.Rpc.SetPassword.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SetPassword.Reply>) responseObserver);
          break;
        case METHODID_LIST_KEY_INFO:
          serviceImpl.listKeyInfo((land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((land.gno.gnomobile.v1.Rpc.CreateAccount.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.CreateAccount.Reply>) responseObserver);
          break;
        case METHODID_SELECT_ACCOUNT:
          serviceImpl.selectAccount((land.gno.gnomobile.v1.Rpc.SelectAccount.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.SelectAccount.Reply>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((land.gno.gnomobile.v1.Rpc.Query.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.Query.Reply>) responseObserver);
          break;
        case METHODID_CALL:
          serviceImpl.call((land.gno.gnomobile.v1.Rpc.Call.Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Rpc.Call.Reply>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSetRemoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.SetRemote.Request,
              land.gno.gnomobile.v1.Rpc.SetRemote.Reply>(
                service, METHODID_SET_REMOTE)))
        .addMethod(
          getSetChainIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.SetChainID.Request,
              land.gno.gnomobile.v1.Rpc.SetChainID.Reply>(
                service, METHODID_SET_CHAIN_ID)))
        .addMethod(
          getSetNameOrBech32Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Request,
              land.gno.gnomobile.v1.Rpc.SetNameOrBech32.Reply>(
                service, METHODID_SET_NAME_OR_BECH32)))
        .addMethod(
          getSetPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.SetPassword.Request,
              land.gno.gnomobile.v1.Rpc.SetPassword.Reply>(
                service, METHODID_SET_PASSWORD)))
        .addMethod(
          getListKeyInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.ListKeyInfo.Request,
              land.gno.gnomobile.v1.Rpc.ListKeyInfo.Reply>(
                service, METHODID_LIST_KEY_INFO)))
        .addMethod(
          getCreateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.CreateAccount.Request,
              land.gno.gnomobile.v1.Rpc.CreateAccount.Reply>(
                service, METHODID_CREATE_ACCOUNT)))
        .addMethod(
          getSelectAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.SelectAccount.Request,
              land.gno.gnomobile.v1.Rpc.SelectAccount.Reply>(
                service, METHODID_SELECT_ACCOUNT)))
        .addMethod(
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.Query.Request,
              land.gno.gnomobile.v1.Rpc.Query.Reply>(
                service, METHODID_QUERY)))
        .addMethod(
          getCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Rpc.Call.Request,
              land.gno.gnomobile.v1.Rpc.Call.Reply>(
                service, METHODID_CALL)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GnomobileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetRemoteMethod())
              .addMethod(getSetChainIDMethod())
              .addMethod(getSetNameOrBech32Method())
              .addMethod(getSetPasswordMethod())
              .addMethod(getListKeyInfoMethod())
              .addMethod(getCreateAccountMethod())
              .addMethod(getSelectAccountMethod())
              .addMethod(getQueryMethod())
              .addMethod(getCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}