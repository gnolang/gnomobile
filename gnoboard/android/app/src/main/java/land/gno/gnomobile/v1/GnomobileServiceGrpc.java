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
  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse> getSetRemoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRemote",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse> getSetRemoteMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest, land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse> getSetRemoteMethod;
    if ((getSetRemoteMethod = GnomobileServiceGrpc.getSetRemoteMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSetRemoteMethod = GnomobileServiceGrpc.getSetRemoteMethod) == null) {
          GnomobileServiceGrpc.getSetRemoteMethod = getSetRemoteMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest, land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRemote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRemoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse> getSetChainIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetChainID",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse> getSetChainIDMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest, land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse> getSetChainIDMethod;
    if ((getSetChainIDMethod = GnomobileServiceGrpc.getSetChainIDMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSetChainIDMethod = GnomobileServiceGrpc.getSetChainIDMethod) == null) {
          GnomobileServiceGrpc.getSetChainIDMethod = getSetChainIDMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest, land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetChainID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetChainIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse> getGenerateRecoveryPhraseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateRecoveryPhrase",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse> getGenerateRecoveryPhraseMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest, land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse> getGenerateRecoveryPhraseMethod;
    if ((getGenerateRecoveryPhraseMethod = GnomobileServiceGrpc.getGenerateRecoveryPhraseMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getGenerateRecoveryPhraseMethod = GnomobileServiceGrpc.getGenerateRecoveryPhraseMethod) == null) {
          GnomobileServiceGrpc.getGenerateRecoveryPhraseMethod = getGenerateRecoveryPhraseMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest, land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateRecoveryPhrase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGenerateRecoveryPhraseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse> getListKeyInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeyInfo",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse> getListKeyInfoMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest, land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse> getListKeyInfoMethod;
    if ((getListKeyInfoMethod = GnomobileServiceGrpc.getListKeyInfoMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getListKeyInfoMethod = GnomobileServiceGrpc.getListKeyInfoMethod) == null) {
          GnomobileServiceGrpc.getListKeyInfoMethod = getListKeyInfoMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest, land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeyInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListKeyInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse> getCreateAccountMethod;
    if ((getCreateAccountMethod = GnomobileServiceGrpc.getCreateAccountMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getCreateAccountMethod = GnomobileServiceGrpc.getCreateAccountMethod) == null) {
          GnomobileServiceGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse> getSelectAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectAccount",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse> getSelectAccountMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse> getSelectAccountMethod;
    if ((getSelectAccountMethod = GnomobileServiceGrpc.getSelectAccountMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSelectAccountMethod = GnomobileServiceGrpc.getSelectAccountMethod) == null) {
          GnomobileServiceGrpc.getSelectAccountMethod = getSelectAccountMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSelectAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse> getSetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPassword",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse> getSetPasswordMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest, land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse> getSetPasswordMethod;
    if ((getSetPasswordMethod = GnomobileServiceGrpc.getSetPasswordMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getSetPasswordMethod = GnomobileServiceGrpc.getSetPasswordMethod) == null) {
          GnomobileServiceGrpc.getSetPasswordMethod = getSetPasswordMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest, land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse> getGetActiveAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActiveAccount",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse> getGetActiveAccountMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse> getGetActiveAccountMethod;
    if ((getGetActiveAccountMethod = GnomobileServiceGrpc.getGetActiveAccountMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getGetActiveAccountMethod = GnomobileServiceGrpc.getGetActiveAccountMethod) == null) {
          GnomobileServiceGrpc.getGetActiveAccountMethod = getGetActiveAccountMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActiveAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetActiveAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse> getQueryAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAccount",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse> getQueryAccountMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse> getQueryAccountMethod;
    if ((getQueryAccountMethod = GnomobileServiceGrpc.getQueryAccountMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getQueryAccountMethod = GnomobileServiceGrpc.getQueryAccountMethod) == null) {
          GnomobileServiceGrpc.getQueryAccountMethod = getQueryAccountMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getQueryAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = GnomobileServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getDeleteAccountMethod = GnomobileServiceGrpc.getDeleteAccountMethod) == null) {
          GnomobileServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest, land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest, land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse> getQueryMethod;
    if ((getQueryMethod = GnomobileServiceGrpc.getQueryMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getQueryMethod = GnomobileServiceGrpc.getQueryMethod) == null) {
          GnomobileServiceGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest, land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse> getRenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Render",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse> getRenderMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest, land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse> getRenderMethod;
    if ((getRenderMethod = GnomobileServiceGrpc.getRenderMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getRenderMethod = GnomobileServiceGrpc.getRenderMethod) == null) {
          GnomobileServiceGrpc.getRenderMethod = getRenderMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest, land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Render"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse> getQEvalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QEval",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse> getQEvalMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest, land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse> getQEvalMethod;
    if ((getQEvalMethod = GnomobileServiceGrpc.getQEvalMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getQEvalMethod = GnomobileServiceGrpc.getQEvalMethod) == null) {
          GnomobileServiceGrpc.getQEvalMethod = getQEvalMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest, land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QEval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getQEvalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.CallRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.CallResponse> getCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Call",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.CallRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.CallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.CallRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.CallResponse> getCallMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.CallRequest, land.gno.gnomobile.v1.Gnomobiletypes.CallResponse> getCallMethod;
    if ((getCallMethod = GnomobileServiceGrpc.getCallMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getCallMethod = GnomobileServiceGrpc.getCallMethod) == null) {
          GnomobileServiceGrpc.getCallMethod = getCallMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.CallRequest, land.gno.gnomobile.v1.Gnomobiletypes.CallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Call"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.CallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.CallResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request,
      land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response> getAddressToBech32Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressToBech32",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request,
      land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response> getAddressToBech32Method() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request, land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response> getAddressToBech32Method;
    if ((getAddressToBech32Method = GnomobileServiceGrpc.getAddressToBech32Method) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getAddressToBech32Method = GnomobileServiceGrpc.getAddressToBech32Method) == null) {
          GnomobileServiceGrpc.getAddressToBech32Method = getAddressToBech32Method =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request, land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressToBech32"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddressToBech32Method;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request,
      land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response> getAddressFromBech32Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressFromBech32",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request,
      land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response> getAddressFromBech32Method() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request, land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response> getAddressFromBech32Method;
    if ((getAddressFromBech32Method = GnomobileServiceGrpc.getAddressFromBech32Method) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getAddressFromBech32Method = GnomobileServiceGrpc.getAddressFromBech32Method) == null) {
          GnomobileServiceGrpc.getAddressFromBech32Method = getAddressFromBech32Method =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request, land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressFromBech32"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddressFromBech32Method;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest, land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse> getHelloMethod;
    if ((getHelloMethod = GnomobileServiceGrpc.getHelloMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getHelloMethod = GnomobileServiceGrpc.getHelloMethod) == null) {
          GnomobileServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest, land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse> getHelloStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloStream",
      requestType = land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest.class,
      responseType = land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest,
      land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse> getHelloStreamMethod() {
    io.grpc.MethodDescriptor<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest, land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse> getHelloStreamMethod;
    if ((getHelloStreamMethod = GnomobileServiceGrpc.getHelloStreamMethod) == null) {
      synchronized (GnomobileServiceGrpc.class) {
        if ((getHelloStreamMethod = GnomobileServiceGrpc.getHelloStreamMethod) == null) {
          GnomobileServiceGrpc.getHelloStreamMethod = getHelloStreamMethod =
              io.grpc.MethodDescriptor.<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest, land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getHelloStreamMethod;
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
    default void setRemote(land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRemoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    default void setChainID(land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetChainIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate a recovery phrase of BIP39 mnemonic words using entropy from the
     * crypto library random number generator. This can be used as the mnemonic in
     * CreateAccount.
     * </pre>
     */
    default void generateRecoveryPhrase(land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateRecoveryPhraseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    default void listKeyInfo(land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeyInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    default void createAccount(land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * SelectAccount selects the active account to use for later operations
     * </pre>
     */
    default void selectAccount(land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    default void setPassword(land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetActiveAccount gets the active account which was set by SelectAccount.
     * If there is no active account, then return ErrNoActiveAccount.
     * (To check if there is an active account, use ListKeyInfo and check the
     * length of the result.)
     * </pre>
     */
    default void getActiveAccount(land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActiveAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryAccount retrieves account information from the blockchain for a given
     * address.
     * </pre>
     */
    default void queryAccount(land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAccount deletes the account with the given name, using the password
     * to ensure access. However, if skip_password is true, then ignore the
     * password. If the account doesn't exist, then return ErrCryptoKeyNotFound.
     * If the password is wrong, then return ErrDecryptionFailed.
     * </pre>
     */
    default void deleteAccount(land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    default void query(land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Render calls the Render function for package_path with optional args. The
     * package path should include the prefix like "gno.land/". This is similar to
     * using a browser URL &lt;testnet&gt;/&lt;pkgPath&gt;:&lt;args&gt; where &lt;pkgPath&gt; doesn't have
     * the prefix like "gno.land/".
     * </pre>
     */
    default void render(land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * QEval evaluates the given expression with the realm code at package_path.
     * The package path should include the prefix like "gno.land/". The expression
     * is usually a function call like "GetBoardIDFromName(&#92;"testboard&#92;")". The
     * return value is a typed expression like
     * "(1 gno.land/r/demo/boards.BoardID)&#92;n(true bool)".
     * </pre>
     */
    default void qEval(land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQEvalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    default void call(land.gno.gnomobile.v1.Gnomobiletypes.CallRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.CallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Convert a byte array address to a bech32 string address.
     * </pre>
     */
    default void addressToBech32(land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressToBech32Method(), responseObserver);
    }

    /**
     * <pre>
     * Convert a bech32 string address to a byte array address.
     * </pre>
     */
    default void addressFromBech32(land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressFromBech32Method(), responseObserver);
    }

    /**
     * <pre>
     * Hello is for debug purposes
     * </pre>
     */
    default void hello(land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * HelloStream is for debug purposes
     * </pre>
     */
    default void helloStream(land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloStreamMethod(), responseObserver);
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
    public void setRemote(land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRemoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    public void setChainID(land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetChainIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate a recovery phrase of BIP39 mnemonic words using entropy from the
     * crypto library random number generator. This can be used as the mnemonic in
     * CreateAccount.
     * </pre>
     */
    public void generateRecoveryPhrase(land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateRecoveryPhraseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    public void listKeyInfo(land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeyInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    public void createAccount(land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SelectAccount selects the active account to use for later operations
     * </pre>
     */
    public void selectAccount(land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    public void setPassword(land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetActiveAccount gets the active account which was set by SelectAccount.
     * If there is no active account, then return ErrNoActiveAccount.
     * (To check if there is an active account, use ListKeyInfo and check the
     * length of the result.)
     * </pre>
     */
    public void getActiveAccount(land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActiveAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryAccount retrieves account information from the blockchain for a given
     * address.
     * </pre>
     */
    public void queryAccount(land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAccount deletes the account with the given name, using the password
     * to ensure access. However, if skip_password is true, then ignore the
     * password. If the account doesn't exist, then return ErrCryptoKeyNotFound.
     * If the password is wrong, then return ErrDecryptionFailed.
     * </pre>
     */
    public void deleteAccount(land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    public void query(land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Render calls the Render function for package_path with optional args. The
     * package path should include the prefix like "gno.land/". This is similar to
     * using a browser URL &lt;testnet&gt;/&lt;pkgPath&gt;:&lt;args&gt; where &lt;pkgPath&gt; doesn't have
     * the prefix like "gno.land/".
     * </pre>
     */
    public void render(land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QEval evaluates the given expression with the realm code at package_path.
     * The package path should include the prefix like "gno.land/". The expression
     * is usually a function call like "GetBoardIDFromName(&#92;"testboard&#92;")". The
     * return value is a typed expression like
     * "(1 gno.land/r/demo/boards.BoardID)&#92;n(true bool)".
     * </pre>
     */
    public void qEval(land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQEvalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    public void call(land.gno.gnomobile.v1.Gnomobiletypes.CallRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.CallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Convert a byte array address to a bech32 string address.
     * </pre>
     */
    public void addressToBech32(land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressToBech32Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Convert a bech32 string address to a byte array address.
     * </pre>
     */
    public void addressFromBech32(land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressFromBech32Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Hello is for debug purposes
     * </pre>
     */
    public void hello(land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HelloStream is for debug purposes
     * </pre>
     */
    public void helloStream(land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest request,
        io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getHelloStreamMethod(), getCallOptions()), request, responseObserver);
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
    public land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse setRemote(land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRemoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse setChainID(land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetChainIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate a recovery phrase of BIP39 mnemonic words using entropy from the
     * crypto library random number generator. This can be used as the mnemonic in
     * CreateAccount.
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse generateRecoveryPhrase(land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateRecoveryPhraseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse listKeyInfo(land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeyInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse createAccount(land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SelectAccount selects the active account to use for later operations
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse selectAccount(land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse setPassword(land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetActiveAccount gets the active account which was set by SelectAccount.
     * If there is no active account, then return ErrNoActiveAccount.
     * (To check if there is an active account, use ListKeyInfo and check the
     * length of the result.)
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse getActiveAccount(land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActiveAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryAccount retrieves account information from the blockchain for a given
     * address.
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse queryAccount(land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAccount deletes the account with the given name, using the password
     * to ensure access. However, if skip_password is true, then ignore the
     * password. If the account doesn't exist, then return ErrCryptoKeyNotFound.
     * If the password is wrong, then return ErrDecryptionFailed.
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse deleteAccount(land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse query(land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Render calls the Render function for package_path with optional args. The
     * package path should include the prefix like "gno.land/". This is similar to
     * using a browser URL &lt;testnet&gt;/&lt;pkgPath&gt;:&lt;args&gt; where &lt;pkgPath&gt; doesn't have
     * the prefix like "gno.land/".
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse render(land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QEval evaluates the given expression with the realm code at package_path.
     * The package path should include the prefix like "gno.land/". The expression
     * is usually a function call like "GetBoardIDFromName(&#92;"testboard&#92;")". The
     * return value is a typed expression like
     * "(1 gno.land/r/demo/boards.BoardID)&#92;n(true bool)".
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse qEval(land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQEvalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.CallResponse call(land.gno.gnomobile.v1.Gnomobiletypes.CallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Convert a byte array address to a bech32 string address.
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response addressToBech32(land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressToBech32Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Convert a bech32 string address to a byte array address.
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response addressFromBech32(land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressFromBech32Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Hello is for debug purposes
     * </pre>
     */
    public land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse hello(land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HelloStream is for debug purposes
     * </pre>
     */
    public java.util.Iterator<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse> helloStream(
        land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getHelloStreamMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse> setRemote(
        land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRemoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse> setChainID(
        land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetChainIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate a recovery phrase of BIP39 mnemonic words using entropy from the
     * crypto library random number generator. This can be used as the mnemonic in
     * CreateAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse> generateRecoveryPhrase(
        land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateRecoveryPhraseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the keys informations in the keybase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse> listKeyInfo(
        land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeyInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new account the keybase using the name an password specified by
     * SetAccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse> createAccount(
        land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SelectAccount selects the active account to use for later operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse> selectAccount(
        land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the password for the account in the keybase, used for later operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse> setPassword(
        land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetActiveAccount gets the active account which was set by SelectAccount.
     * If there is no active account, then return ErrNoActiveAccount.
     * (To check if there is an active account, use ListKeyInfo and check the
     * length of the result.)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse> getActiveAccount(
        land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActiveAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryAccount retrieves account information from the blockchain for a given
     * address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse> queryAccount(
        land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAccount deletes the account with the given name, using the password
     * to ensure access. However, if skip_password is true, then ignore the
     * password. If the account doesn't exist, then return ErrCryptoKeyNotFound.
     * If the password is wrong, then return ErrDecryptionFailed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse> deleteAccount(
        land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Make an ABCI query to the remote node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse> query(
        land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Render calls the Render function for package_path with optional args. The
     * package path should include the prefix like "gno.land/". This is similar to
     * using a browser URL &lt;testnet&gt;/&lt;pkgPath&gt;:&lt;args&gt; where &lt;pkgPath&gt; doesn't have
     * the prefix like "gno.land/".
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse> render(
        land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QEval evaluates the given expression with the realm code at package_path.
     * The package path should include the prefix like "gno.land/". The expression
     * is usually a function call like "GetBoardIDFromName(&#92;"testboard&#92;")". The
     * return value is a typed expression like
     * "(1 gno.land/r/demo/boards.BoardID)&#92;n(true bool)".
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse> qEval(
        land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQEvalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Call a specific realm function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.CallResponse> call(
        land.gno.gnomobile.v1.Gnomobiletypes.CallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Convert a byte array address to a bech32 string address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response> addressToBech32(
        land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressToBech32Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Convert a bech32 string address to a byte array address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response> addressFromBech32(
        land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressFromBech32Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Hello is for debug purposes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse> hello(
        land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_REMOTE = 0;
  private static final int METHODID_SET_CHAIN_ID = 1;
  private static final int METHODID_GENERATE_RECOVERY_PHRASE = 2;
  private static final int METHODID_LIST_KEY_INFO = 3;
  private static final int METHODID_CREATE_ACCOUNT = 4;
  private static final int METHODID_SELECT_ACCOUNT = 5;
  private static final int METHODID_SET_PASSWORD = 6;
  private static final int METHODID_GET_ACTIVE_ACCOUNT = 7;
  private static final int METHODID_QUERY_ACCOUNT = 8;
  private static final int METHODID_DELETE_ACCOUNT = 9;
  private static final int METHODID_QUERY = 10;
  private static final int METHODID_RENDER = 11;
  private static final int METHODID_QEVAL = 12;
  private static final int METHODID_CALL = 13;
  private static final int METHODID_ADDRESS_TO_BECH32 = 14;
  private static final int METHODID_ADDRESS_FROM_BECH32 = 15;
  private static final int METHODID_HELLO = 16;
  private static final int METHODID_HELLO_STREAM = 17;

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
          serviceImpl.setRemote((land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse>) responseObserver);
          break;
        case METHODID_SET_CHAIN_ID:
          serviceImpl.setChainID((land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse>) responseObserver);
          break;
        case METHODID_GENERATE_RECOVERY_PHRASE:
          serviceImpl.generateRecoveryPhrase((land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse>) responseObserver);
          break;
        case METHODID_LIST_KEY_INFO:
          serviceImpl.listKeyInfo((land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse>) responseObserver);
          break;
        case METHODID_SELECT_ACCOUNT:
          serviceImpl.selectAccount((land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse>) responseObserver);
          break;
        case METHODID_SET_PASSWORD:
          serviceImpl.setPassword((land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse>) responseObserver);
          break;
        case METHODID_GET_ACTIVE_ACCOUNT:
          serviceImpl.getActiveAccount((land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse>) responseObserver);
          break;
        case METHODID_QUERY_ACCOUNT:
          serviceImpl.queryAccount((land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse>) responseObserver);
          break;
        case METHODID_RENDER:
          serviceImpl.render((land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse>) responseObserver);
          break;
        case METHODID_QEVAL:
          serviceImpl.qEval((land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse>) responseObserver);
          break;
        case METHODID_CALL:
          serviceImpl.call((land.gno.gnomobile.v1.Gnomobiletypes.CallRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.CallResponse>) responseObserver);
          break;
        case METHODID_ADDRESS_TO_BECH32:
          serviceImpl.addressToBech32((land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response>) responseObserver);
          break;
        case METHODID_ADDRESS_FROM_BECH32:
          serviceImpl.addressFromBech32((land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response>) responseObserver);
          break;
        case METHODID_HELLO:
          serviceImpl.hello((land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO_STREAM:
          serviceImpl.helloStream((land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest) request,
              (io.grpc.stub.StreamObserver<land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse>) responseObserver);
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
              land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.SetRemoteResponse>(
                service, METHODID_SET_REMOTE)))
        .addMethod(
          getSetChainIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.SetChainIDResponse>(
                service, METHODID_SET_CHAIN_ID)))
        .addMethod(
          getGenerateRecoveryPhraseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.GenerateRecoveryPhraseResponse>(
                service, METHODID_GENERATE_RECOVERY_PHRASE)))
        .addMethod(
          getListKeyInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.ListKeyInfoResponse>(
                service, METHODID_LIST_KEY_INFO)))
        .addMethod(
          getCreateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.CreateAccountResponse>(
                service, METHODID_CREATE_ACCOUNT)))
        .addMethod(
          getSelectAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.SelectAccountResponse>(
                service, METHODID_SELECT_ACCOUNT)))
        .addMethod(
          getSetPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.SetPasswordResponse>(
                service, METHODID_SET_PASSWORD)))
        .addMethod(
          getGetActiveAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.GetActiveAccountResponse>(
                service, METHODID_GET_ACTIVE_ACCOUNT)))
        .addMethod(
          getQueryAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.QueryAccountResponse>(
                service, METHODID_QUERY_ACCOUNT)))
        .addMethod(
          getDeleteAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.DeleteAccountResponse>(
                service, METHODID_DELETE_ACCOUNT)))
        .addMethod(
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.QueryRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.QueryResponse>(
                service, METHODID_QUERY)))
        .addMethod(
          getRenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.RenderRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.RenderResponse>(
                service, METHODID_RENDER)))
        .addMethod(
          getQEvalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.QEvalRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.QEvalResponse>(
                service, METHODID_QEVAL)))
        .addMethod(
          getCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.CallRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.CallResponse>(
                service, METHODID_CALL)))
        .addMethod(
          getAddressToBech32Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Request,
              land.gno.gnomobile.v1.Gnomobiletypes.AddressToBech32Response>(
                service, METHODID_ADDRESS_TO_BECH32)))
        .addMethod(
          getAddressFromBech32Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Request,
              land.gno.gnomobile.v1.Gnomobiletypes.AddressFromBech32Response>(
                service, METHODID_ADDRESS_FROM_BECH32)))
        .addMethod(
          getHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.HelloRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.HelloResponse>(
                service, METHODID_HELLO)))
        .addMethod(
          getHelloStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamRequest,
              land.gno.gnomobile.v1.Gnomobiletypes.HelloStreamResponse>(
                service, METHODID_HELLO_STREAM)))
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
              .addMethod(getGenerateRecoveryPhraseMethod())
              .addMethod(getListKeyInfoMethod())
              .addMethod(getCreateAccountMethod())
              .addMethod(getSelectAccountMethod())
              .addMethod(getSetPasswordMethod())
              .addMethod(getGetActiveAccountMethod())
              .addMethod(getQueryAccountMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getQueryMethod())
              .addMethod(getRenderMethod())
              .addMethod(getQEvalMethod())
              .addMethod(getCallMethod())
              .addMethod(getAddressToBech32Method())
              .addMethod(getAddressFromBech32Method())
              .addMethod(getHelloMethod())
              .addMethod(getHelloStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
