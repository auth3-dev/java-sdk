package dev.auth3.identity.admin;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: identity/admin/admin.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdminGrpc {

  private AdminGrpc() {}

  public static final String SERVICE_NAME = "depot.devtools.auth.v0.identity.admin.Admin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateIdentityRequest,
      dev.auth3.identity.admin.CreateIdentityResponse> getCreateIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIdentity",
      requestType = dev.auth3.identity.admin.CreateIdentityRequest.class,
      responseType = dev.auth3.identity.admin.CreateIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateIdentityRequest,
      dev.auth3.identity.admin.CreateIdentityResponse> getCreateIdentityMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateIdentityRequest, dev.auth3.identity.admin.CreateIdentityResponse> getCreateIdentityMethod;
    if ((getCreateIdentityMethod = AdminGrpc.getCreateIdentityMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getCreateIdentityMethod = AdminGrpc.getCreateIdentityMethod) == null) {
          AdminGrpc.getCreateIdentityMethod = getCreateIdentityMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.CreateIdentityRequest, dev.auth3.identity.admin.CreateIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateIdentityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("CreateIdentity"))
              .build();
        }
      }
    }
    return getCreateIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityRequest,
      dev.auth3.identity.admin.GetIdentityResponse> getGetIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdentity",
      requestType = dev.auth3.identity.admin.GetIdentityRequest.class,
      responseType = dev.auth3.identity.admin.GetIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityRequest,
      dev.auth3.identity.admin.GetIdentityResponse> getGetIdentityMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityRequest, dev.auth3.identity.admin.GetIdentityResponse> getGetIdentityMethod;
    if ((getGetIdentityMethod = AdminGrpc.getGetIdentityMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetIdentityMethod = AdminGrpc.getGetIdentityMethod) == null) {
          AdminGrpc.getGetIdentityMethod = getGetIdentityMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetIdentityRequest, dev.auth3.identity.admin.GetIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetIdentity"))
              .build();
        }
      }
    }
    return getGetIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityByIdentifierRequest,
      dev.auth3.identity.admin.GetIdentityByIdentifierResponse> getGetIdentityByIdentifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdentityByIdentifier",
      requestType = dev.auth3.identity.admin.GetIdentityByIdentifierRequest.class,
      responseType = dev.auth3.identity.admin.GetIdentityByIdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityByIdentifierRequest,
      dev.auth3.identity.admin.GetIdentityByIdentifierResponse> getGetIdentityByIdentifierMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityByIdentifierRequest, dev.auth3.identity.admin.GetIdentityByIdentifierResponse> getGetIdentityByIdentifierMethod;
    if ((getGetIdentityByIdentifierMethod = AdminGrpc.getGetIdentityByIdentifierMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetIdentityByIdentifierMethod = AdminGrpc.getGetIdentityByIdentifierMethod) == null) {
          AdminGrpc.getGetIdentityByIdentifierMethod = getGetIdentityByIdentifierMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetIdentityByIdentifierRequest, dev.auth3.identity.admin.GetIdentityByIdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdentityByIdentifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentityByIdentifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentityByIdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetIdentityByIdentifier"))
              .build();
        }
      }
    }
    return getGetIdentityByIdentifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentitiesByAttributeRequest,
      dev.auth3.identity.admin.GetIdentitiesByAttributeResponse> getGetIdentitiesByAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdentitiesByAttribute",
      requestType = dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.class,
      responseType = dev.auth3.identity.admin.GetIdentitiesByAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentitiesByAttributeRequest,
      dev.auth3.identity.admin.GetIdentitiesByAttributeResponse> getGetIdentitiesByAttributeMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentitiesByAttributeRequest, dev.auth3.identity.admin.GetIdentitiesByAttributeResponse> getGetIdentitiesByAttributeMethod;
    if ((getGetIdentitiesByAttributeMethod = AdminGrpc.getGetIdentitiesByAttributeMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetIdentitiesByAttributeMethod = AdminGrpc.getGetIdentitiesByAttributeMethod) == null) {
          AdminGrpc.getGetIdentitiesByAttributeMethod = getGetIdentitiesByAttributeMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetIdentitiesByAttributeRequest, dev.auth3.identity.admin.GetIdentitiesByAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdentitiesByAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentitiesByAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentitiesByAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetIdentitiesByAttribute"))
              .build();
        }
      }
    }
    return getGetIdentitiesByAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentitiesRequest,
      dev.auth3.identity.admin.GetIdentitiesResponse> getGetIdentitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdentities",
      requestType = dev.auth3.identity.admin.GetIdentitiesRequest.class,
      responseType = dev.auth3.identity.admin.GetIdentitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentitiesRequest,
      dev.auth3.identity.admin.GetIdentitiesResponse> getGetIdentitiesMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentitiesRequest, dev.auth3.identity.admin.GetIdentitiesResponse> getGetIdentitiesMethod;
    if ((getGetIdentitiesMethod = AdminGrpc.getGetIdentitiesMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetIdentitiesMethod = AdminGrpc.getGetIdentitiesMethod) == null) {
          AdminGrpc.getGetIdentitiesMethod = getGetIdentitiesMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetIdentitiesRequest, dev.auth3.identity.admin.GetIdentitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdentities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetIdentities"))
              .build();
        }
      }
    }
    return getGetIdentitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateIdentityRequest,
      dev.auth3.identity.admin.UpdateIdentityResponse> getUpdateIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIdentity",
      requestType = dev.auth3.identity.admin.UpdateIdentityRequest.class,
      responseType = dev.auth3.identity.admin.UpdateIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateIdentityRequest,
      dev.auth3.identity.admin.UpdateIdentityResponse> getUpdateIdentityMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateIdentityRequest, dev.auth3.identity.admin.UpdateIdentityResponse> getUpdateIdentityMethod;
    if ((getUpdateIdentityMethod = AdminGrpc.getUpdateIdentityMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateIdentityMethod = AdminGrpc.getUpdateIdentityMethod) == null) {
          AdminGrpc.getUpdateIdentityMethod = getUpdateIdentityMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateIdentityRequest, dev.auth3.identity.admin.UpdateIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateIdentityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateIdentity"))
              .build();
        }
      }
    }
    return getUpdateIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteIdentityRequest,
      dev.auth3.identity.admin.DeleteIdentityResponse> getDeleteIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIdentity",
      requestType = dev.auth3.identity.admin.DeleteIdentityRequest.class,
      responseType = dev.auth3.identity.admin.DeleteIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteIdentityRequest,
      dev.auth3.identity.admin.DeleteIdentityResponse> getDeleteIdentityMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteIdentityRequest, dev.auth3.identity.admin.DeleteIdentityResponse> getDeleteIdentityMethod;
    if ((getDeleteIdentityMethod = AdminGrpc.getDeleteIdentityMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getDeleteIdentityMethod = AdminGrpc.getDeleteIdentityMethod) == null) {
          AdminGrpc.getDeleteIdentityMethod = getDeleteIdentityMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.DeleteIdentityRequest, dev.auth3.identity.admin.DeleteIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteIdentityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("DeleteIdentity"))
              .build();
        }
      }
    }
    return getDeleteIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetAddressesRequest,
      dev.auth3.identity.admin.GetAddressesResponse> getGetAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddresses",
      requestType = dev.auth3.identity.admin.GetAddressesRequest.class,
      responseType = dev.auth3.identity.admin.GetAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetAddressesRequest,
      dev.auth3.identity.admin.GetAddressesResponse> getGetAddressesMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetAddressesRequest, dev.auth3.identity.admin.GetAddressesResponse> getGetAddressesMethod;
    if ((getGetAddressesMethod = AdminGrpc.getGetAddressesMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetAddressesMethod = AdminGrpc.getGetAddressesMethod) == null) {
          AdminGrpc.getGetAddressesMethod = getGetAddressesMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetAddressesRequest, dev.auth3.identity.admin.GetAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetAddresses"))
              .build();
        }
      }
    }
    return getGetAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetAddressRequest,
      dev.auth3.identity.admin.GetAddressResponse> getGetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddress",
      requestType = dev.auth3.identity.admin.GetAddressRequest.class,
      responseType = dev.auth3.identity.admin.GetAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetAddressRequest,
      dev.auth3.identity.admin.GetAddressResponse> getGetAddressMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetAddressRequest, dev.auth3.identity.admin.GetAddressResponse> getGetAddressMethod;
    if ((getGetAddressMethod = AdminGrpc.getGetAddressMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetAddressMethod = AdminGrpc.getGetAddressMethod) == null) {
          AdminGrpc.getGetAddressMethod = getGetAddressMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetAddressRequest, dev.auth3.identity.admin.GetAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetAddress"))
              .build();
        }
      }
    }
    return getGetAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateAddressRequest,
      dev.auth3.identity.admin.UpdateAddressResponse> getUpdateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAddress",
      requestType = dev.auth3.identity.admin.UpdateAddressRequest.class,
      responseType = dev.auth3.identity.admin.UpdateAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateAddressRequest,
      dev.auth3.identity.admin.UpdateAddressResponse> getUpdateAddressMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateAddressRequest, dev.auth3.identity.admin.UpdateAddressResponse> getUpdateAddressMethod;
    if ((getUpdateAddressMethod = AdminGrpc.getUpdateAddressMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateAddressMethod = AdminGrpc.getUpdateAddressMethod) == null) {
          AdminGrpc.getUpdateAddressMethod = getUpdateAddressMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateAddressRequest, dev.auth3.identity.admin.UpdateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateAddress"))
              .build();
        }
      }
    }
    return getUpdateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetTraitsRequest,
      dev.auth3.identity.admin.GetTraitsResponse> getGetTraitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTraits",
      requestType = dev.auth3.identity.admin.GetTraitsRequest.class,
      responseType = dev.auth3.identity.admin.GetTraitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetTraitsRequest,
      dev.auth3.identity.admin.GetTraitsResponse> getGetTraitsMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetTraitsRequest, dev.auth3.identity.admin.GetTraitsResponse> getGetTraitsMethod;
    if ((getGetTraitsMethod = AdminGrpc.getGetTraitsMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetTraitsMethod = AdminGrpc.getGetTraitsMethod) == null) {
          AdminGrpc.getGetTraitsMethod = getGetTraitsMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetTraitsRequest, dev.auth3.identity.admin.GetTraitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTraits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetTraitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetTraitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetTraits"))
              .build();
        }
      }
    }
    return getGetTraitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateTraitsRequest,
      dev.auth3.identity.admin.UpdateTraitsResponse> getUpdateTraitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTraits",
      requestType = dev.auth3.identity.admin.UpdateTraitsRequest.class,
      responseType = dev.auth3.identity.admin.UpdateTraitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateTraitsRequest,
      dev.auth3.identity.admin.UpdateTraitsResponse> getUpdateTraitsMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateTraitsRequest, dev.auth3.identity.admin.UpdateTraitsResponse> getUpdateTraitsMethod;
    if ((getUpdateTraitsMethod = AdminGrpc.getUpdateTraitsMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateTraitsMethod = AdminGrpc.getUpdateTraitsMethod) == null) {
          AdminGrpc.getUpdateTraitsMethod = getUpdateTraitsMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateTraitsRequest, dev.auth3.identity.admin.UpdateTraitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTraits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateTraitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateTraitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateTraits"))
              .build();
        }
      }
    }
    return getUpdateTraitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetCredentialsRequest,
      dev.auth3.identity.admin.GetCredentialsResponse> getGetCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCredentials",
      requestType = dev.auth3.identity.admin.GetCredentialsRequest.class,
      responseType = dev.auth3.identity.admin.GetCredentialsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetCredentialsRequest,
      dev.auth3.identity.admin.GetCredentialsResponse> getGetCredentialsMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetCredentialsRequest, dev.auth3.identity.admin.GetCredentialsResponse> getGetCredentialsMethod;
    if ((getGetCredentialsMethod = AdminGrpc.getGetCredentialsMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetCredentialsMethod = AdminGrpc.getGetCredentialsMethod) == null) {
          AdminGrpc.getGetCredentialsMethod = getGetCredentialsMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetCredentialsRequest, dev.auth3.identity.admin.GetCredentialsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetCredentialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetCredentialsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetCredentials"))
              .build();
        }
      }
    }
    return getGetCredentialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateCredentialRequest,
      dev.auth3.identity.admin.UpdateCredentialResponse> getUpdateCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCredential",
      requestType = dev.auth3.identity.admin.UpdateCredentialRequest.class,
      responseType = dev.auth3.identity.admin.UpdateCredentialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateCredentialRequest,
      dev.auth3.identity.admin.UpdateCredentialResponse> getUpdateCredentialMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateCredentialRequest, dev.auth3.identity.admin.UpdateCredentialResponse> getUpdateCredentialMethod;
    if ((getUpdateCredentialMethod = AdminGrpc.getUpdateCredentialMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateCredentialMethod = AdminGrpc.getUpdateCredentialMethod) == null) {
          AdminGrpc.getUpdateCredentialMethod = getUpdateCredentialMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateCredentialRequest, dev.auth3.identity.admin.UpdateCredentialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateCredentialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateCredential"))
              .build();
        }
      }
    }
    return getUpdateCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest,
      dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse> getGetIdentityLoginAttemptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdentityLoginAttempts",
      requestType = dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest.class,
      responseType = dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest,
      dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse> getGetIdentityLoginAttemptsMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest, dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse> getGetIdentityLoginAttemptsMethod;
    if ((getGetIdentityLoginAttemptsMethod = AdminGrpc.getGetIdentityLoginAttemptsMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetIdentityLoginAttemptsMethod = AdminGrpc.getGetIdentityLoginAttemptsMethod) == null) {
          AdminGrpc.getGetIdentityLoginAttemptsMethod = getGetIdentityLoginAttemptsMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest, dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdentityLoginAttempts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetIdentityLoginAttempts"))
              .build();
        }
      }
    }
    return getGetIdentityLoginAttemptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateConnectionRequest,
      dev.auth3.identity.admin.CreateConnectionResponse> getCreateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConnection",
      requestType = dev.auth3.identity.admin.CreateConnectionRequest.class,
      responseType = dev.auth3.identity.admin.CreateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateConnectionRequest,
      dev.auth3.identity.admin.CreateConnectionResponse> getCreateConnectionMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateConnectionRequest, dev.auth3.identity.admin.CreateConnectionResponse> getCreateConnectionMethod;
    if ((getCreateConnectionMethod = AdminGrpc.getCreateConnectionMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getCreateConnectionMethod = AdminGrpc.getCreateConnectionMethod) == null) {
          AdminGrpc.getCreateConnectionMethod = getCreateConnectionMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.CreateConnectionRequest, dev.auth3.identity.admin.CreateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("CreateConnection"))
              .build();
        }
      }
    }
    return getCreateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetConnectionsRequest,
      dev.auth3.identity.admin.GetConnectionsResponse> getGetConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnections",
      requestType = dev.auth3.identity.admin.GetConnectionsRequest.class,
      responseType = dev.auth3.identity.admin.GetConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetConnectionsRequest,
      dev.auth3.identity.admin.GetConnectionsResponse> getGetConnectionsMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetConnectionsRequest, dev.auth3.identity.admin.GetConnectionsResponse> getGetConnectionsMethod;
    if ((getGetConnectionsMethod = AdminGrpc.getGetConnectionsMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetConnectionsMethod = AdminGrpc.getGetConnectionsMethod) == null) {
          AdminGrpc.getGetConnectionsMethod = getGetConnectionsMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetConnectionsRequest, dev.auth3.identity.admin.GetConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetConnections"))
              .build();
        }
      }
    }
    return getGetConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateConnectionRequest,
      dev.auth3.identity.admin.UpdateConnectionResponse> getUpdateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConnection",
      requestType = dev.auth3.identity.admin.UpdateConnectionRequest.class,
      responseType = dev.auth3.identity.admin.UpdateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateConnectionRequest,
      dev.auth3.identity.admin.UpdateConnectionResponse> getUpdateConnectionMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateConnectionRequest, dev.auth3.identity.admin.UpdateConnectionResponse> getUpdateConnectionMethod;
    if ((getUpdateConnectionMethod = AdminGrpc.getUpdateConnectionMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateConnectionMethod = AdminGrpc.getUpdateConnectionMethod) == null) {
          AdminGrpc.getUpdateConnectionMethod = getUpdateConnectionMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateConnectionRequest, dev.auth3.identity.admin.UpdateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateConnection"))
              .build();
        }
      }
    }
    return getUpdateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteConnectionRequest,
      dev.auth3.identity.admin.DeleteConnectionResponse> getDeleteConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConnection",
      requestType = dev.auth3.identity.admin.DeleteConnectionRequest.class,
      responseType = dev.auth3.identity.admin.DeleteConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteConnectionRequest,
      dev.auth3.identity.admin.DeleteConnectionResponse> getDeleteConnectionMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteConnectionRequest, dev.auth3.identity.admin.DeleteConnectionResponse> getDeleteConnectionMethod;
    if ((getDeleteConnectionMethod = AdminGrpc.getDeleteConnectionMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getDeleteConnectionMethod = AdminGrpc.getDeleteConnectionMethod) == null) {
          AdminGrpc.getDeleteConnectionMethod = getDeleteConnectionMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.DeleteConnectionRequest, dev.auth3.identity.admin.DeleteConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("DeleteConnection"))
              .build();
        }
      }
    }
    return getDeleteConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateIdSchemaRequest,
      dev.auth3.identity.admin.CreateIdSchemaResponse> getCreateIdSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIdSchema",
      requestType = dev.auth3.identity.admin.CreateIdSchemaRequest.class,
      responseType = dev.auth3.identity.admin.CreateIdSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateIdSchemaRequest,
      dev.auth3.identity.admin.CreateIdSchemaResponse> getCreateIdSchemaMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateIdSchemaRequest, dev.auth3.identity.admin.CreateIdSchemaResponse> getCreateIdSchemaMethod;
    if ((getCreateIdSchemaMethod = AdminGrpc.getCreateIdSchemaMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getCreateIdSchemaMethod = AdminGrpc.getCreateIdSchemaMethod) == null) {
          AdminGrpc.getCreateIdSchemaMethod = getCreateIdSchemaMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.CreateIdSchemaRequest, dev.auth3.identity.admin.CreateIdSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIdSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateIdSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateIdSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("CreateIdSchema"))
              .build();
        }
      }
    }
    return getCreateIdSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdSchemasRequest,
      dev.auth3.identity.admin.GetIdSchemasResponse> getGetIdSchemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdSchemas",
      requestType = dev.auth3.identity.admin.GetIdSchemasRequest.class,
      responseType = dev.auth3.identity.admin.GetIdSchemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdSchemasRequest,
      dev.auth3.identity.admin.GetIdSchemasResponse> getGetIdSchemasMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdSchemasRequest, dev.auth3.identity.admin.GetIdSchemasResponse> getGetIdSchemasMethod;
    if ((getGetIdSchemasMethod = AdminGrpc.getGetIdSchemasMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetIdSchemasMethod = AdminGrpc.getGetIdSchemasMethod) == null) {
          AdminGrpc.getGetIdSchemasMethod = getGetIdSchemasMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetIdSchemasRequest, dev.auth3.identity.admin.GetIdSchemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdSchemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdSchemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdSchemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetIdSchemas"))
              .build();
        }
      }
    }
    return getGetIdSchemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdSchemaRequest,
      dev.auth3.identity.admin.GetIdSchemaResponse> getGetIdSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdSchema",
      requestType = dev.auth3.identity.admin.GetIdSchemaRequest.class,
      responseType = dev.auth3.identity.admin.GetIdSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdSchemaRequest,
      dev.auth3.identity.admin.GetIdSchemaResponse> getGetIdSchemaMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetIdSchemaRequest, dev.auth3.identity.admin.GetIdSchemaResponse> getGetIdSchemaMethod;
    if ((getGetIdSchemaMethod = AdminGrpc.getGetIdSchemaMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetIdSchemaMethod = AdminGrpc.getGetIdSchemaMethod) == null) {
          AdminGrpc.getGetIdSchemaMethod = getGetIdSchemaMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetIdSchemaRequest, dev.auth3.identity.admin.GetIdSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetIdSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetIdSchema"))
              .build();
        }
      }
    }
    return getGetIdSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetDefaultIdSchemaRequest,
      dev.auth3.identity.admin.GetDefaultIdSchemaResponse> getGetDefaultIdSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefaultIdSchema",
      requestType = dev.auth3.identity.admin.GetDefaultIdSchemaRequest.class,
      responseType = dev.auth3.identity.admin.GetDefaultIdSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetDefaultIdSchemaRequest,
      dev.auth3.identity.admin.GetDefaultIdSchemaResponse> getGetDefaultIdSchemaMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetDefaultIdSchemaRequest, dev.auth3.identity.admin.GetDefaultIdSchemaResponse> getGetDefaultIdSchemaMethod;
    if ((getGetDefaultIdSchemaMethod = AdminGrpc.getGetDefaultIdSchemaMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetDefaultIdSchemaMethod = AdminGrpc.getGetDefaultIdSchemaMethod) == null) {
          AdminGrpc.getGetDefaultIdSchemaMethod = getGetDefaultIdSchemaMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetDefaultIdSchemaRequest, dev.auth3.identity.admin.GetDefaultIdSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefaultIdSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetDefaultIdSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetDefaultIdSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetDefaultIdSchema"))
              .build();
        }
      }
    }
    return getGetDefaultIdSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateIdSchemaRequest,
      dev.auth3.identity.admin.UpdateIdSchemaResponse> getUpdateIdSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIdSchema",
      requestType = dev.auth3.identity.admin.UpdateIdSchemaRequest.class,
      responseType = dev.auth3.identity.admin.UpdateIdSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateIdSchemaRequest,
      dev.auth3.identity.admin.UpdateIdSchemaResponse> getUpdateIdSchemaMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateIdSchemaRequest, dev.auth3.identity.admin.UpdateIdSchemaResponse> getUpdateIdSchemaMethod;
    if ((getUpdateIdSchemaMethod = AdminGrpc.getUpdateIdSchemaMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateIdSchemaMethod = AdminGrpc.getUpdateIdSchemaMethod) == null) {
          AdminGrpc.getUpdateIdSchemaMethod = getUpdateIdSchemaMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateIdSchemaRequest, dev.auth3.identity.admin.UpdateIdSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIdSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateIdSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateIdSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateIdSchema"))
              .build();
        }
      }
    }
    return getUpdateIdSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.MarkDefaultIdSchemaRequest,
      dev.auth3.identity.admin.MarkDefaultIdSchemaResponse> getMarkDefaultIdSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkDefaultIdSchema",
      requestType = dev.auth3.identity.admin.MarkDefaultIdSchemaRequest.class,
      responseType = dev.auth3.identity.admin.MarkDefaultIdSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.MarkDefaultIdSchemaRequest,
      dev.auth3.identity.admin.MarkDefaultIdSchemaResponse> getMarkDefaultIdSchemaMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.MarkDefaultIdSchemaRequest, dev.auth3.identity.admin.MarkDefaultIdSchemaResponse> getMarkDefaultIdSchemaMethod;
    if ((getMarkDefaultIdSchemaMethod = AdminGrpc.getMarkDefaultIdSchemaMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getMarkDefaultIdSchemaMethod = AdminGrpc.getMarkDefaultIdSchemaMethod) == null) {
          AdminGrpc.getMarkDefaultIdSchemaMethod = getMarkDefaultIdSchemaMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.MarkDefaultIdSchemaRequest, dev.auth3.identity.admin.MarkDefaultIdSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkDefaultIdSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.MarkDefaultIdSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.MarkDefaultIdSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("MarkDefaultIdSchema"))
              .build();
        }
      }
    }
    return getMarkDefaultIdSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteIdSchemaRequest,
      dev.auth3.identity.admin.DeleteIdSchemaResponse> getDeleteIdSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIdSchema",
      requestType = dev.auth3.identity.admin.DeleteIdSchemaRequest.class,
      responseType = dev.auth3.identity.admin.DeleteIdSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteIdSchemaRequest,
      dev.auth3.identity.admin.DeleteIdSchemaResponse> getDeleteIdSchemaMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteIdSchemaRequest, dev.auth3.identity.admin.DeleteIdSchemaResponse> getDeleteIdSchemaMethod;
    if ((getDeleteIdSchemaMethod = AdminGrpc.getDeleteIdSchemaMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getDeleteIdSchemaMethod = AdminGrpc.getDeleteIdSchemaMethod) == null) {
          AdminGrpc.getDeleteIdSchemaMethod = getDeleteIdSchemaMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.DeleteIdSchemaRequest, dev.auth3.identity.admin.DeleteIdSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIdSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteIdSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteIdSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("DeleteIdSchema"))
              .build();
        }
      }
    }
    return getDeleteIdSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateOAuth2ClientRequest,
      dev.auth3.identity.admin.CreateOAuth2ClientResponse> getCreateOAuth2ClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOAuth2Client",
      requestType = dev.auth3.identity.admin.CreateOAuth2ClientRequest.class,
      responseType = dev.auth3.identity.admin.CreateOAuth2ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateOAuth2ClientRequest,
      dev.auth3.identity.admin.CreateOAuth2ClientResponse> getCreateOAuth2ClientMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.CreateOAuth2ClientRequest, dev.auth3.identity.admin.CreateOAuth2ClientResponse> getCreateOAuth2ClientMethod;
    if ((getCreateOAuth2ClientMethod = AdminGrpc.getCreateOAuth2ClientMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getCreateOAuth2ClientMethod = AdminGrpc.getCreateOAuth2ClientMethod) == null) {
          AdminGrpc.getCreateOAuth2ClientMethod = getCreateOAuth2ClientMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.CreateOAuth2ClientRequest, dev.auth3.identity.admin.CreateOAuth2ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOAuth2Client"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateOAuth2ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.CreateOAuth2ClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("CreateOAuth2Client"))
              .build();
        }
      }
    }
    return getCreateOAuth2ClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetOAuth2ClientsRequest,
      dev.auth3.identity.admin.GetOAuth2ClientsResponse> getGetOAuth2ClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOAuth2Clients",
      requestType = dev.auth3.identity.admin.GetOAuth2ClientsRequest.class,
      responseType = dev.auth3.identity.admin.GetOAuth2ClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetOAuth2ClientsRequest,
      dev.auth3.identity.admin.GetOAuth2ClientsResponse> getGetOAuth2ClientsMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetOAuth2ClientsRequest, dev.auth3.identity.admin.GetOAuth2ClientsResponse> getGetOAuth2ClientsMethod;
    if ((getGetOAuth2ClientsMethod = AdminGrpc.getGetOAuth2ClientsMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetOAuth2ClientsMethod = AdminGrpc.getGetOAuth2ClientsMethod) == null) {
          AdminGrpc.getGetOAuth2ClientsMethod = getGetOAuth2ClientsMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetOAuth2ClientsRequest, dev.auth3.identity.admin.GetOAuth2ClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOAuth2Clients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetOAuth2ClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetOAuth2ClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetOAuth2Clients"))
              .build();
        }
      }
    }
    return getGetOAuth2ClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateOAuth2ClientRequest,
      dev.auth3.identity.admin.UpdateOAuth2ClientResponse> getUpdateOAuth2ClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOAuth2Client",
      requestType = dev.auth3.identity.admin.UpdateOAuth2ClientRequest.class,
      responseType = dev.auth3.identity.admin.UpdateOAuth2ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateOAuth2ClientRequest,
      dev.auth3.identity.admin.UpdateOAuth2ClientResponse> getUpdateOAuth2ClientMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateOAuth2ClientRequest, dev.auth3.identity.admin.UpdateOAuth2ClientResponse> getUpdateOAuth2ClientMethod;
    if ((getUpdateOAuth2ClientMethod = AdminGrpc.getUpdateOAuth2ClientMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateOAuth2ClientMethod = AdminGrpc.getUpdateOAuth2ClientMethod) == null) {
          AdminGrpc.getUpdateOAuth2ClientMethod = getUpdateOAuth2ClientMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateOAuth2ClientRequest, dev.auth3.identity.admin.UpdateOAuth2ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOAuth2Client"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateOAuth2ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateOAuth2ClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateOAuth2Client"))
              .build();
        }
      }
    }
    return getUpdateOAuth2ClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteOAuth2ClientRequest,
      dev.auth3.identity.admin.DeleteOAuth2ClientResponse> getDeleteOAuth2ClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOAuth2Client",
      requestType = dev.auth3.identity.admin.DeleteOAuth2ClientRequest.class,
      responseType = dev.auth3.identity.admin.DeleteOAuth2ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteOAuth2ClientRequest,
      dev.auth3.identity.admin.DeleteOAuth2ClientResponse> getDeleteOAuth2ClientMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.DeleteOAuth2ClientRequest, dev.auth3.identity.admin.DeleteOAuth2ClientResponse> getDeleteOAuth2ClientMethod;
    if ((getDeleteOAuth2ClientMethod = AdminGrpc.getDeleteOAuth2ClientMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getDeleteOAuth2ClientMethod = AdminGrpc.getDeleteOAuth2ClientMethod) == null) {
          AdminGrpc.getDeleteOAuth2ClientMethod = getDeleteOAuth2ClientMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.DeleteOAuth2ClientRequest, dev.auth3.identity.admin.DeleteOAuth2ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOAuth2Client"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteOAuth2ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.DeleteOAuth2ClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("DeleteOAuth2Client"))
              .build();
        }
      }
    }
    return getDeleteOAuth2ClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetEmailsSetupRequest,
      dev.auth3.identity.admin.GetEmailsSetupResponse> getGetEmailsSetupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailsSetup",
      requestType = dev.auth3.identity.admin.GetEmailsSetupRequest.class,
      responseType = dev.auth3.identity.admin.GetEmailsSetupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetEmailsSetupRequest,
      dev.auth3.identity.admin.GetEmailsSetupResponse> getGetEmailsSetupMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetEmailsSetupRequest, dev.auth3.identity.admin.GetEmailsSetupResponse> getGetEmailsSetupMethod;
    if ((getGetEmailsSetupMethod = AdminGrpc.getGetEmailsSetupMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetEmailsSetupMethod = AdminGrpc.getGetEmailsSetupMethod) == null) {
          AdminGrpc.getGetEmailsSetupMethod = getGetEmailsSetupMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetEmailsSetupRequest, dev.auth3.identity.admin.GetEmailsSetupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailsSetup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetEmailsSetupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetEmailsSetupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetEmailsSetup"))
              .build();
        }
      }
    }
    return getGetEmailsSetupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateEmailsSetupRequest,
      dev.auth3.identity.admin.UpdateEmailsSetupResponse> getUpdateEmailsSetupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailsSetup",
      requestType = dev.auth3.identity.admin.UpdateEmailsSetupRequest.class,
      responseType = dev.auth3.identity.admin.UpdateEmailsSetupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateEmailsSetupRequest,
      dev.auth3.identity.admin.UpdateEmailsSetupResponse> getUpdateEmailsSetupMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.UpdateEmailsSetupRequest, dev.auth3.identity.admin.UpdateEmailsSetupResponse> getUpdateEmailsSetupMethod;
    if ((getUpdateEmailsSetupMethod = AdminGrpc.getUpdateEmailsSetupMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getUpdateEmailsSetupMethod = AdminGrpc.getUpdateEmailsSetupMethod) == null) {
          AdminGrpc.getUpdateEmailsSetupMethod = getUpdateEmailsSetupMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.UpdateEmailsSetupRequest, dev.auth3.identity.admin.UpdateEmailsSetupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailsSetup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateEmailsSetupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.UpdateEmailsSetupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("UpdateEmailsSetup"))
              .build();
        }
      }
    }
    return getUpdateEmailsSetupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetUserBaseStatisticsRequest,
      dev.auth3.identity.admin.GetUserBaseStatisticsResponse> getGetUserBaseStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserBaseStatistics",
      requestType = dev.auth3.identity.admin.GetUserBaseStatisticsRequest.class,
      responseType = dev.auth3.identity.admin.GetUserBaseStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetUserBaseStatisticsRequest,
      dev.auth3.identity.admin.GetUserBaseStatisticsResponse> getGetUserBaseStatisticsMethod() {
    io.grpc.MethodDescriptor<dev.auth3.identity.admin.GetUserBaseStatisticsRequest, dev.auth3.identity.admin.GetUserBaseStatisticsResponse> getGetUserBaseStatisticsMethod;
    if ((getGetUserBaseStatisticsMethod = AdminGrpc.getGetUserBaseStatisticsMethod) == null) {
      synchronized (AdminGrpc.class) {
        if ((getGetUserBaseStatisticsMethod = AdminGrpc.getGetUserBaseStatisticsMethod) == null) {
          AdminGrpc.getGetUserBaseStatisticsMethod = getGetUserBaseStatisticsMethod =
              io.grpc.MethodDescriptor.<dev.auth3.identity.admin.GetUserBaseStatisticsRequest, dev.auth3.identity.admin.GetUserBaseStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserBaseStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetUserBaseStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.auth3.identity.admin.GetUserBaseStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminMethodDescriptorSupplier("GetUserBaseStatistics"))
              .build();
        }
      }
    }
    return getGetUserBaseStatisticsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminStub>() {
        @java.lang.Override
        public AdminStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminStub(channel, callOptions);
        }
      };
    return AdminStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminBlockingStub>() {
        @java.lang.Override
        public AdminBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminBlockingStub(channel, callOptions);
        }
      };
    return AdminBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminFutureStub>() {
        @java.lang.Override
        public AdminFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminFutureStub(channel, callOptions);
        }
      };
    return AdminFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AdminImplBase implements io.grpc.BindableService {

    /**
     */
    public void createIdentity(dev.auth3.identity.admin.CreateIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateIdentityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIdentityMethod(), responseObserver);
    }

    /**
     */
    public void getIdentity(dev.auth3.identity.admin.GetIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdentityMethod(), responseObserver);
    }

    /**
     */
    public void getIdentityByIdentifier(dev.auth3.identity.admin.GetIdentityByIdentifierRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityByIdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdentityByIdentifierMethod(), responseObserver);
    }

    /**
     */
    public void getIdentitiesByAttribute(dev.auth3.identity.admin.GetIdentitiesByAttributeRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentitiesByAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdentitiesByAttributeMethod(), responseObserver);
    }

    /**
     */
    public void getIdentities(dev.auth3.identity.admin.GetIdentitiesRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdentitiesMethod(), responseObserver);
    }

    /**
     */
    public void updateIdentity(dev.auth3.identity.admin.UpdateIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateIdentityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIdentityMethod(), responseObserver);
    }

    /**
     */
    public void deleteIdentity(dev.auth3.identity.admin.DeleteIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteIdentityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIdentityMethod(), responseObserver);
    }

    /**
     */
    public void getAddresses(dev.auth3.identity.admin.GetAddressesRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressesMethod(), responseObserver);
    }

    /**
     */
    public void getAddress(dev.auth3.identity.admin.GetAddressRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressMethod(), responseObserver);
    }

    /**
     */
    public void updateAddress(dev.auth3.identity.admin.UpdateAddressRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAddressMethod(), responseObserver);
    }

    /**
     */
    public void getTraits(dev.auth3.identity.admin.GetTraitsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetTraitsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTraitsMethod(), responseObserver);
    }

    /**
     */
    public void updateTraits(dev.auth3.identity.admin.UpdateTraitsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateTraitsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTraitsMethod(), responseObserver);
    }

    /**
     */
    public void getCredentials(dev.auth3.identity.admin.GetCredentialsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetCredentialsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCredentialsMethod(), responseObserver);
    }

    /**
     */
    public void updateCredential(dev.auth3.identity.admin.UpdateCredentialRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateCredentialResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCredentialMethod(), responseObserver);
    }

    /**
     */
    public void getIdentityLoginAttempts(dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdentityLoginAttemptsMethod(), responseObserver);
    }

    /**
     */
    public void createConnection(dev.auth3.identity.admin.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConnectionMethod(), responseObserver);
    }

    /**
     */
    public void getConnections(dev.auth3.identity.admin.GetConnectionsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectionsMethod(), responseObserver);
    }

    /**
     */
    public void updateConnection(dev.auth3.identity.admin.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConnectionMethod(), responseObserver);
    }

    /**
     */
    public void deleteConnection(dev.auth3.identity.admin.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConnectionMethod(), responseObserver);
    }

    /**
     */
    public void createIdSchema(dev.auth3.identity.admin.CreateIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateIdSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIdSchemaMethod(), responseObserver);
    }

    /**
     */
    public void getIdSchemas(dev.auth3.identity.admin.GetIdSchemasRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdSchemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdSchemasMethod(), responseObserver);
    }

    /**
     */
    public void getIdSchema(dev.auth3.identity.admin.GetIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdSchemaMethod(), responseObserver);
    }

    /**
     */
    public void getDefaultIdSchema(dev.auth3.identity.admin.GetDefaultIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetDefaultIdSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefaultIdSchemaMethod(), responseObserver);
    }

    /**
     */
    public void updateIdSchema(dev.auth3.identity.admin.UpdateIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateIdSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIdSchemaMethod(), responseObserver);
    }

    /**
     */
    public void markDefaultIdSchema(dev.auth3.identity.admin.MarkDefaultIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.MarkDefaultIdSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkDefaultIdSchemaMethod(), responseObserver);
    }

    /**
     */
    public void deleteIdSchema(dev.auth3.identity.admin.DeleteIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteIdSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIdSchemaMethod(), responseObserver);
    }

    /**
     */
    public void createOAuth2Client(dev.auth3.identity.admin.CreateOAuth2ClientRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateOAuth2ClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOAuth2ClientMethod(), responseObserver);
    }

    /**
     */
    public void getOAuth2Clients(dev.auth3.identity.admin.GetOAuth2ClientsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetOAuth2ClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOAuth2ClientsMethod(), responseObserver);
    }

    /**
     */
    public void updateOAuth2Client(dev.auth3.identity.admin.UpdateOAuth2ClientRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateOAuth2ClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOAuth2ClientMethod(), responseObserver);
    }

    /**
     */
    public void deleteOAuth2Client(dev.auth3.identity.admin.DeleteOAuth2ClientRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteOAuth2ClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOAuth2ClientMethod(), responseObserver);
    }

    /**
     */
    public void getEmailsSetup(dev.auth3.identity.admin.GetEmailsSetupRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetEmailsSetupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailsSetupMethod(), responseObserver);
    }

    /**
     */
    public void updateEmailsSetup(dev.auth3.identity.admin.UpdateEmailsSetupRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateEmailsSetupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailsSetupMethod(), responseObserver);
    }

    /**
     */
    public void getUserBaseStatistics(dev.auth3.identity.admin.GetUserBaseStatisticsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetUserBaseStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserBaseStatisticsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateIdentityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.CreateIdentityRequest,
                dev.auth3.identity.admin.CreateIdentityResponse>(
                  this, METHODID_CREATE_IDENTITY)))
          .addMethod(
            getGetIdentityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetIdentityRequest,
                dev.auth3.identity.admin.GetIdentityResponse>(
                  this, METHODID_GET_IDENTITY)))
          .addMethod(
            getGetIdentityByIdentifierMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetIdentityByIdentifierRequest,
                dev.auth3.identity.admin.GetIdentityByIdentifierResponse>(
                  this, METHODID_GET_IDENTITY_BY_IDENTIFIER)))
          .addMethod(
            getGetIdentitiesByAttributeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetIdentitiesByAttributeRequest,
                dev.auth3.identity.admin.GetIdentitiesByAttributeResponse>(
                  this, METHODID_GET_IDENTITIES_BY_ATTRIBUTE)))
          .addMethod(
            getGetIdentitiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetIdentitiesRequest,
                dev.auth3.identity.admin.GetIdentitiesResponse>(
                  this, METHODID_GET_IDENTITIES)))
          .addMethod(
            getUpdateIdentityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateIdentityRequest,
                dev.auth3.identity.admin.UpdateIdentityResponse>(
                  this, METHODID_UPDATE_IDENTITY)))
          .addMethod(
            getDeleteIdentityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.DeleteIdentityRequest,
                dev.auth3.identity.admin.DeleteIdentityResponse>(
                  this, METHODID_DELETE_IDENTITY)))
          .addMethod(
            getGetAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetAddressesRequest,
                dev.auth3.identity.admin.GetAddressesResponse>(
                  this, METHODID_GET_ADDRESSES)))
          .addMethod(
            getGetAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetAddressRequest,
                dev.auth3.identity.admin.GetAddressResponse>(
                  this, METHODID_GET_ADDRESS)))
          .addMethod(
            getUpdateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateAddressRequest,
                dev.auth3.identity.admin.UpdateAddressResponse>(
                  this, METHODID_UPDATE_ADDRESS)))
          .addMethod(
            getGetTraitsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetTraitsRequest,
                dev.auth3.identity.admin.GetTraitsResponse>(
                  this, METHODID_GET_TRAITS)))
          .addMethod(
            getUpdateTraitsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateTraitsRequest,
                dev.auth3.identity.admin.UpdateTraitsResponse>(
                  this, METHODID_UPDATE_TRAITS)))
          .addMethod(
            getGetCredentialsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetCredentialsRequest,
                dev.auth3.identity.admin.GetCredentialsResponse>(
                  this, METHODID_GET_CREDENTIALS)))
          .addMethod(
            getUpdateCredentialMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateCredentialRequest,
                dev.auth3.identity.admin.UpdateCredentialResponse>(
                  this, METHODID_UPDATE_CREDENTIAL)))
          .addMethod(
            getGetIdentityLoginAttemptsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest,
                dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse>(
                  this, METHODID_GET_IDENTITY_LOGIN_ATTEMPTS)))
          .addMethod(
            getCreateConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.CreateConnectionRequest,
                dev.auth3.identity.admin.CreateConnectionResponse>(
                  this, METHODID_CREATE_CONNECTION)))
          .addMethod(
            getGetConnectionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetConnectionsRequest,
                dev.auth3.identity.admin.GetConnectionsResponse>(
                  this, METHODID_GET_CONNECTIONS)))
          .addMethod(
            getUpdateConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateConnectionRequest,
                dev.auth3.identity.admin.UpdateConnectionResponse>(
                  this, METHODID_UPDATE_CONNECTION)))
          .addMethod(
            getDeleteConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.DeleteConnectionRequest,
                dev.auth3.identity.admin.DeleteConnectionResponse>(
                  this, METHODID_DELETE_CONNECTION)))
          .addMethod(
            getCreateIdSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.CreateIdSchemaRequest,
                dev.auth3.identity.admin.CreateIdSchemaResponse>(
                  this, METHODID_CREATE_ID_SCHEMA)))
          .addMethod(
            getGetIdSchemasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetIdSchemasRequest,
                dev.auth3.identity.admin.GetIdSchemasResponse>(
                  this, METHODID_GET_ID_SCHEMAS)))
          .addMethod(
            getGetIdSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetIdSchemaRequest,
                dev.auth3.identity.admin.GetIdSchemaResponse>(
                  this, METHODID_GET_ID_SCHEMA)))
          .addMethod(
            getGetDefaultIdSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetDefaultIdSchemaRequest,
                dev.auth3.identity.admin.GetDefaultIdSchemaResponse>(
                  this, METHODID_GET_DEFAULT_ID_SCHEMA)))
          .addMethod(
            getUpdateIdSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateIdSchemaRequest,
                dev.auth3.identity.admin.UpdateIdSchemaResponse>(
                  this, METHODID_UPDATE_ID_SCHEMA)))
          .addMethod(
            getMarkDefaultIdSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.MarkDefaultIdSchemaRequest,
                dev.auth3.identity.admin.MarkDefaultIdSchemaResponse>(
                  this, METHODID_MARK_DEFAULT_ID_SCHEMA)))
          .addMethod(
            getDeleteIdSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.DeleteIdSchemaRequest,
                dev.auth3.identity.admin.DeleteIdSchemaResponse>(
                  this, METHODID_DELETE_ID_SCHEMA)))
          .addMethod(
            getCreateOAuth2ClientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.CreateOAuth2ClientRequest,
                dev.auth3.identity.admin.CreateOAuth2ClientResponse>(
                  this, METHODID_CREATE_OAUTH2CLIENT)))
          .addMethod(
            getGetOAuth2ClientsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetOAuth2ClientsRequest,
                dev.auth3.identity.admin.GetOAuth2ClientsResponse>(
                  this, METHODID_GET_OAUTH2CLIENTS)))
          .addMethod(
            getUpdateOAuth2ClientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateOAuth2ClientRequest,
                dev.auth3.identity.admin.UpdateOAuth2ClientResponse>(
                  this, METHODID_UPDATE_OAUTH2CLIENT)))
          .addMethod(
            getDeleteOAuth2ClientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.DeleteOAuth2ClientRequest,
                dev.auth3.identity.admin.DeleteOAuth2ClientResponse>(
                  this, METHODID_DELETE_OAUTH2CLIENT)))
          .addMethod(
            getGetEmailsSetupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetEmailsSetupRequest,
                dev.auth3.identity.admin.GetEmailsSetupResponse>(
                  this, METHODID_GET_EMAILS_SETUP)))
          .addMethod(
            getUpdateEmailsSetupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.UpdateEmailsSetupRequest,
                dev.auth3.identity.admin.UpdateEmailsSetupResponse>(
                  this, METHODID_UPDATE_EMAILS_SETUP)))
          .addMethod(
            getGetUserBaseStatisticsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.auth3.identity.admin.GetUserBaseStatisticsRequest,
                dev.auth3.identity.admin.GetUserBaseStatisticsResponse>(
                  this, METHODID_GET_USER_BASE_STATISTICS)))
          .build();
    }
  }

  /**
   */
  public static final class AdminStub extends io.grpc.stub.AbstractAsyncStub<AdminStub> {
    private AdminStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminStub(channel, callOptions);
    }

    /**
     */
    public void createIdentity(dev.auth3.identity.admin.CreateIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateIdentityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdentity(dev.auth3.identity.admin.GetIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdentityByIdentifier(dev.auth3.identity.admin.GetIdentityByIdentifierRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityByIdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdentityByIdentifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdentitiesByAttribute(dev.auth3.identity.admin.GetIdentitiesByAttributeRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentitiesByAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdentitiesByAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdentities(dev.auth3.identity.admin.GetIdentitiesRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdentitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateIdentity(dev.auth3.identity.admin.UpdateIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateIdentityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteIdentity(dev.auth3.identity.admin.DeleteIdentityRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteIdentityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddresses(dev.auth3.identity.admin.GetAddressesRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddress(dev.auth3.identity.admin.GetAddressRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddress(dev.auth3.identity.admin.UpdateAddressRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTraits(dev.auth3.identity.admin.GetTraitsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetTraitsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTraitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTraits(dev.auth3.identity.admin.UpdateTraitsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateTraitsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTraitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCredentials(dev.auth3.identity.admin.GetCredentialsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetCredentialsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCredential(dev.auth3.identity.admin.UpdateCredentialRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateCredentialResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdentityLoginAttempts(dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdentityLoginAttemptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createConnection(dev.auth3.identity.admin.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConnections(dev.auth3.identity.admin.GetConnectionsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConnection(dev.auth3.identity.admin.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteConnection(dev.auth3.identity.admin.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createIdSchema(dev.auth3.identity.admin.CreateIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateIdSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIdSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdSchemas(dev.auth3.identity.admin.GetIdSchemasRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdSchemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdSchemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdSchema(dev.auth3.identity.admin.GetIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDefaultIdSchema(dev.auth3.identity.admin.GetDefaultIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetDefaultIdSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefaultIdSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateIdSchema(dev.auth3.identity.admin.UpdateIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateIdSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIdSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markDefaultIdSchema(dev.auth3.identity.admin.MarkDefaultIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.MarkDefaultIdSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkDefaultIdSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteIdSchema(dev.auth3.identity.admin.DeleteIdSchemaRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteIdSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIdSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOAuth2Client(dev.auth3.identity.admin.CreateOAuth2ClientRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateOAuth2ClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOAuth2ClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOAuth2Clients(dev.auth3.identity.admin.GetOAuth2ClientsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetOAuth2ClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOAuth2ClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOAuth2Client(dev.auth3.identity.admin.UpdateOAuth2ClientRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateOAuth2ClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOAuth2ClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOAuth2Client(dev.auth3.identity.admin.DeleteOAuth2ClientRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteOAuth2ClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOAuth2ClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmailsSetup(dev.auth3.identity.admin.GetEmailsSetupRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetEmailsSetupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailsSetupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmailsSetup(dev.auth3.identity.admin.UpdateEmailsSetupRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateEmailsSetupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailsSetupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserBaseStatistics(dev.auth3.identity.admin.GetUserBaseStatisticsRequest request,
        io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetUserBaseStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserBaseStatisticsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdminBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdminBlockingStub> {
    private AdminBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminBlockingStub(channel, callOptions);
    }

    /**
     */
    public dev.auth3.identity.admin.CreateIdentityResponse createIdentity(dev.auth3.identity.admin.CreateIdentityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIdentityMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetIdentityResponse getIdentity(dev.auth3.identity.admin.GetIdentityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdentityMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetIdentityByIdentifierResponse getIdentityByIdentifier(dev.auth3.identity.admin.GetIdentityByIdentifierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdentityByIdentifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetIdentitiesByAttributeResponse getIdentitiesByAttribute(dev.auth3.identity.admin.GetIdentitiesByAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdentitiesByAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetIdentitiesResponse getIdentities(dev.auth3.identity.admin.GetIdentitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdentitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateIdentityResponse updateIdentity(dev.auth3.identity.admin.UpdateIdentityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIdentityMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.DeleteIdentityResponse deleteIdentity(dev.auth3.identity.admin.DeleteIdentityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIdentityMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetAddressesResponse getAddresses(dev.auth3.identity.admin.GetAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetAddressResponse getAddress(dev.auth3.identity.admin.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateAddressResponse updateAddress(dev.auth3.identity.admin.UpdateAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetTraitsResponse getTraits(dev.auth3.identity.admin.GetTraitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTraitsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateTraitsResponse updateTraits(dev.auth3.identity.admin.UpdateTraitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTraitsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetCredentialsResponse getCredentials(dev.auth3.identity.admin.GetCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCredentialsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateCredentialResponse updateCredential(dev.auth3.identity.admin.UpdateCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse getIdentityLoginAttempts(dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdentityLoginAttemptsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.CreateConnectionResponse createConnection(dev.auth3.identity.admin.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetConnectionsResponse getConnections(dev.auth3.identity.admin.GetConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateConnectionResponse updateConnection(dev.auth3.identity.admin.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.DeleteConnectionResponse deleteConnection(dev.auth3.identity.admin.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.CreateIdSchemaResponse createIdSchema(dev.auth3.identity.admin.CreateIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIdSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetIdSchemasResponse getIdSchemas(dev.auth3.identity.admin.GetIdSchemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdSchemasMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetIdSchemaResponse getIdSchema(dev.auth3.identity.admin.GetIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetDefaultIdSchemaResponse getDefaultIdSchema(dev.auth3.identity.admin.GetDefaultIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefaultIdSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateIdSchemaResponse updateIdSchema(dev.auth3.identity.admin.UpdateIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIdSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.MarkDefaultIdSchemaResponse markDefaultIdSchema(dev.auth3.identity.admin.MarkDefaultIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkDefaultIdSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.DeleteIdSchemaResponse deleteIdSchema(dev.auth3.identity.admin.DeleteIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIdSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.CreateOAuth2ClientResponse createOAuth2Client(dev.auth3.identity.admin.CreateOAuth2ClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOAuth2ClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetOAuth2ClientsResponse getOAuth2Clients(dev.auth3.identity.admin.GetOAuth2ClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOAuth2ClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateOAuth2ClientResponse updateOAuth2Client(dev.auth3.identity.admin.UpdateOAuth2ClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOAuth2ClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.DeleteOAuth2ClientResponse deleteOAuth2Client(dev.auth3.identity.admin.DeleteOAuth2ClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOAuth2ClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetEmailsSetupResponse getEmailsSetup(dev.auth3.identity.admin.GetEmailsSetupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailsSetupMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.UpdateEmailsSetupResponse updateEmailsSetup(dev.auth3.identity.admin.UpdateEmailsSetupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailsSetupMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.auth3.identity.admin.GetUserBaseStatisticsResponse getUserBaseStatistics(dev.auth3.identity.admin.GetUserBaseStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserBaseStatisticsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminFutureStub extends io.grpc.stub.AbstractFutureStub<AdminFutureStub> {
    private AdminFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.CreateIdentityResponse> createIdentity(
        dev.auth3.identity.admin.CreateIdentityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIdentityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetIdentityResponse> getIdentity(
        dev.auth3.identity.admin.GetIdentityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdentityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetIdentityByIdentifierResponse> getIdentityByIdentifier(
        dev.auth3.identity.admin.GetIdentityByIdentifierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdentityByIdentifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetIdentitiesByAttributeResponse> getIdentitiesByAttribute(
        dev.auth3.identity.admin.GetIdentitiesByAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdentitiesByAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetIdentitiesResponse> getIdentities(
        dev.auth3.identity.admin.GetIdentitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdentitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateIdentityResponse> updateIdentity(
        dev.auth3.identity.admin.UpdateIdentityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIdentityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.DeleteIdentityResponse> deleteIdentity(
        dev.auth3.identity.admin.DeleteIdentityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIdentityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetAddressesResponse> getAddresses(
        dev.auth3.identity.admin.GetAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetAddressResponse> getAddress(
        dev.auth3.identity.admin.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateAddressResponse> updateAddress(
        dev.auth3.identity.admin.UpdateAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetTraitsResponse> getTraits(
        dev.auth3.identity.admin.GetTraitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTraitsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateTraitsResponse> updateTraits(
        dev.auth3.identity.admin.UpdateTraitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTraitsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetCredentialsResponse> getCredentials(
        dev.auth3.identity.admin.GetCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCredentialsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateCredentialResponse> updateCredential(
        dev.auth3.identity.admin.UpdateCredentialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse> getIdentityLoginAttempts(
        dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdentityLoginAttemptsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.CreateConnectionResponse> createConnection(
        dev.auth3.identity.admin.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetConnectionsResponse> getConnections(
        dev.auth3.identity.admin.GetConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateConnectionResponse> updateConnection(
        dev.auth3.identity.admin.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.DeleteConnectionResponse> deleteConnection(
        dev.auth3.identity.admin.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.CreateIdSchemaResponse> createIdSchema(
        dev.auth3.identity.admin.CreateIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIdSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetIdSchemasResponse> getIdSchemas(
        dev.auth3.identity.admin.GetIdSchemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdSchemasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetIdSchemaResponse> getIdSchema(
        dev.auth3.identity.admin.GetIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetDefaultIdSchemaResponse> getDefaultIdSchema(
        dev.auth3.identity.admin.GetDefaultIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefaultIdSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateIdSchemaResponse> updateIdSchema(
        dev.auth3.identity.admin.UpdateIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIdSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.MarkDefaultIdSchemaResponse> markDefaultIdSchema(
        dev.auth3.identity.admin.MarkDefaultIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkDefaultIdSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.DeleteIdSchemaResponse> deleteIdSchema(
        dev.auth3.identity.admin.DeleteIdSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIdSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.CreateOAuth2ClientResponse> createOAuth2Client(
        dev.auth3.identity.admin.CreateOAuth2ClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOAuth2ClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetOAuth2ClientsResponse> getOAuth2Clients(
        dev.auth3.identity.admin.GetOAuth2ClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOAuth2ClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateOAuth2ClientResponse> updateOAuth2Client(
        dev.auth3.identity.admin.UpdateOAuth2ClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOAuth2ClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.DeleteOAuth2ClientResponse> deleteOAuth2Client(
        dev.auth3.identity.admin.DeleteOAuth2ClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOAuth2ClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetEmailsSetupResponse> getEmailsSetup(
        dev.auth3.identity.admin.GetEmailsSetupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailsSetupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.UpdateEmailsSetupResponse> updateEmailsSetup(
        dev.auth3.identity.admin.UpdateEmailsSetupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailsSetupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.auth3.identity.admin.GetUserBaseStatisticsResponse> getUserBaseStatistics(
        dev.auth3.identity.admin.GetUserBaseStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserBaseStatisticsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_IDENTITY = 0;
  private static final int METHODID_GET_IDENTITY = 1;
  private static final int METHODID_GET_IDENTITY_BY_IDENTIFIER = 2;
  private static final int METHODID_GET_IDENTITIES_BY_ATTRIBUTE = 3;
  private static final int METHODID_GET_IDENTITIES = 4;
  private static final int METHODID_UPDATE_IDENTITY = 5;
  private static final int METHODID_DELETE_IDENTITY = 6;
  private static final int METHODID_GET_ADDRESSES = 7;
  private static final int METHODID_GET_ADDRESS = 8;
  private static final int METHODID_UPDATE_ADDRESS = 9;
  private static final int METHODID_GET_TRAITS = 10;
  private static final int METHODID_UPDATE_TRAITS = 11;
  private static final int METHODID_GET_CREDENTIALS = 12;
  private static final int METHODID_UPDATE_CREDENTIAL = 13;
  private static final int METHODID_GET_IDENTITY_LOGIN_ATTEMPTS = 14;
  private static final int METHODID_CREATE_CONNECTION = 15;
  private static final int METHODID_GET_CONNECTIONS = 16;
  private static final int METHODID_UPDATE_CONNECTION = 17;
  private static final int METHODID_DELETE_CONNECTION = 18;
  private static final int METHODID_CREATE_ID_SCHEMA = 19;
  private static final int METHODID_GET_ID_SCHEMAS = 20;
  private static final int METHODID_GET_ID_SCHEMA = 21;
  private static final int METHODID_GET_DEFAULT_ID_SCHEMA = 22;
  private static final int METHODID_UPDATE_ID_SCHEMA = 23;
  private static final int METHODID_MARK_DEFAULT_ID_SCHEMA = 24;
  private static final int METHODID_DELETE_ID_SCHEMA = 25;
  private static final int METHODID_CREATE_OAUTH2CLIENT = 26;
  private static final int METHODID_GET_OAUTH2CLIENTS = 27;
  private static final int METHODID_UPDATE_OAUTH2CLIENT = 28;
  private static final int METHODID_DELETE_OAUTH2CLIENT = 29;
  private static final int METHODID_GET_EMAILS_SETUP = 30;
  private static final int METHODID_UPDATE_EMAILS_SETUP = 31;
  private static final int METHODID_GET_USER_BASE_STATISTICS = 32;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_IDENTITY:
          serviceImpl.createIdentity((dev.auth3.identity.admin.CreateIdentityRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateIdentityResponse>) responseObserver);
          break;
        case METHODID_GET_IDENTITY:
          serviceImpl.getIdentity((dev.auth3.identity.admin.GetIdentityRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityResponse>) responseObserver);
          break;
        case METHODID_GET_IDENTITY_BY_IDENTIFIER:
          serviceImpl.getIdentityByIdentifier((dev.auth3.identity.admin.GetIdentityByIdentifierRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityByIdentifierResponse>) responseObserver);
          break;
        case METHODID_GET_IDENTITIES_BY_ATTRIBUTE:
          serviceImpl.getIdentitiesByAttribute((dev.auth3.identity.admin.GetIdentitiesByAttributeRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentitiesByAttributeResponse>) responseObserver);
          break;
        case METHODID_GET_IDENTITIES:
          serviceImpl.getIdentities((dev.auth3.identity.admin.GetIdentitiesRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentitiesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_IDENTITY:
          serviceImpl.updateIdentity((dev.auth3.identity.admin.UpdateIdentityRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateIdentityResponse>) responseObserver);
          break;
        case METHODID_DELETE_IDENTITY:
          serviceImpl.deleteIdentity((dev.auth3.identity.admin.DeleteIdentityRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteIdentityResponse>) responseObserver);
          break;
        case METHODID_GET_ADDRESSES:
          serviceImpl.getAddresses((dev.auth3.identity.admin.GetAddressesRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetAddressesResponse>) responseObserver);
          break;
        case METHODID_GET_ADDRESS:
          serviceImpl.getAddress((dev.auth3.identity.admin.GetAddressRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetAddressResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS:
          serviceImpl.updateAddress((dev.auth3.identity.admin.UpdateAddressRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateAddressResponse>) responseObserver);
          break;
        case METHODID_GET_TRAITS:
          serviceImpl.getTraits((dev.auth3.identity.admin.GetTraitsRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetTraitsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TRAITS:
          serviceImpl.updateTraits((dev.auth3.identity.admin.UpdateTraitsRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateTraitsResponse>) responseObserver);
          break;
        case METHODID_GET_CREDENTIALS:
          serviceImpl.getCredentials((dev.auth3.identity.admin.GetCredentialsRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetCredentialsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CREDENTIAL:
          serviceImpl.updateCredential((dev.auth3.identity.admin.UpdateCredentialRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateCredentialResponse>) responseObserver);
          break;
        case METHODID_GET_IDENTITY_LOGIN_ATTEMPTS:
          serviceImpl.getIdentityLoginAttempts((dev.auth3.identity.admin.GetIdentityLoginAttemptsRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdentityLoginAttemptsResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONNECTION:
          serviceImpl.createConnection((dev.auth3.identity.admin.CreateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_CONNECTIONS:
          serviceImpl.getConnections((dev.auth3.identity.admin.GetConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetConnectionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONNECTION:
          serviceImpl.updateConnection((dev.auth3.identity.admin.UpdateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateConnectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONNECTION:
          serviceImpl.deleteConnection((dev.auth3.identity.admin.DeleteConnectionRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteConnectionResponse>) responseObserver);
          break;
        case METHODID_CREATE_ID_SCHEMA:
          serviceImpl.createIdSchema((dev.auth3.identity.admin.CreateIdSchemaRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateIdSchemaResponse>) responseObserver);
          break;
        case METHODID_GET_ID_SCHEMAS:
          serviceImpl.getIdSchemas((dev.auth3.identity.admin.GetIdSchemasRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdSchemasResponse>) responseObserver);
          break;
        case METHODID_GET_ID_SCHEMA:
          serviceImpl.getIdSchema((dev.auth3.identity.admin.GetIdSchemaRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetIdSchemaResponse>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_ID_SCHEMA:
          serviceImpl.getDefaultIdSchema((dev.auth3.identity.admin.GetDefaultIdSchemaRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetDefaultIdSchemaResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ID_SCHEMA:
          serviceImpl.updateIdSchema((dev.auth3.identity.admin.UpdateIdSchemaRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateIdSchemaResponse>) responseObserver);
          break;
        case METHODID_MARK_DEFAULT_ID_SCHEMA:
          serviceImpl.markDefaultIdSchema((dev.auth3.identity.admin.MarkDefaultIdSchemaRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.MarkDefaultIdSchemaResponse>) responseObserver);
          break;
        case METHODID_DELETE_ID_SCHEMA:
          serviceImpl.deleteIdSchema((dev.auth3.identity.admin.DeleteIdSchemaRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteIdSchemaResponse>) responseObserver);
          break;
        case METHODID_CREATE_OAUTH2CLIENT:
          serviceImpl.createOAuth2Client((dev.auth3.identity.admin.CreateOAuth2ClientRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.CreateOAuth2ClientResponse>) responseObserver);
          break;
        case METHODID_GET_OAUTH2CLIENTS:
          serviceImpl.getOAuth2Clients((dev.auth3.identity.admin.GetOAuth2ClientsRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetOAuth2ClientsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OAUTH2CLIENT:
          serviceImpl.updateOAuth2Client((dev.auth3.identity.admin.UpdateOAuth2ClientRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateOAuth2ClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_OAUTH2CLIENT:
          serviceImpl.deleteOAuth2Client((dev.auth3.identity.admin.DeleteOAuth2ClientRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.DeleteOAuth2ClientResponse>) responseObserver);
          break;
        case METHODID_GET_EMAILS_SETUP:
          serviceImpl.getEmailsSetup((dev.auth3.identity.admin.GetEmailsSetupRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetEmailsSetupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAILS_SETUP:
          serviceImpl.updateEmailsSetup((dev.auth3.identity.admin.UpdateEmailsSetupRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.UpdateEmailsSetupResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BASE_STATISTICS:
          serviceImpl.getUserBaseStatistics((dev.auth3.identity.admin.GetUserBaseStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<dev.auth3.identity.admin.GetUserBaseStatisticsResponse>) responseObserver);
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

  private static abstract class AdminBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdminBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.auth3.identity.admin.AdminProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Admin");
    }
  }

  private static final class AdminFileDescriptorSupplier
      extends AdminBaseDescriptorSupplier {
    AdminFileDescriptorSupplier() {}
  }

  private static final class AdminMethodDescriptorSupplier
      extends AdminBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdminMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdminGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminFileDescriptorSupplier())
              .addMethod(getCreateIdentityMethod())
              .addMethod(getGetIdentityMethod())
              .addMethod(getGetIdentityByIdentifierMethod())
              .addMethod(getGetIdentitiesByAttributeMethod())
              .addMethod(getGetIdentitiesMethod())
              .addMethod(getUpdateIdentityMethod())
              .addMethod(getDeleteIdentityMethod())
              .addMethod(getGetAddressesMethod())
              .addMethod(getGetAddressMethod())
              .addMethod(getUpdateAddressMethod())
              .addMethod(getGetTraitsMethod())
              .addMethod(getUpdateTraitsMethod())
              .addMethod(getGetCredentialsMethod())
              .addMethod(getUpdateCredentialMethod())
              .addMethod(getGetIdentityLoginAttemptsMethod())
              .addMethod(getCreateConnectionMethod())
              .addMethod(getGetConnectionsMethod())
              .addMethod(getUpdateConnectionMethod())
              .addMethod(getDeleteConnectionMethod())
              .addMethod(getCreateIdSchemaMethod())
              .addMethod(getGetIdSchemasMethod())
              .addMethod(getGetIdSchemaMethod())
              .addMethod(getGetDefaultIdSchemaMethod())
              .addMethod(getUpdateIdSchemaMethod())
              .addMethod(getMarkDefaultIdSchemaMethod())
              .addMethod(getDeleteIdSchemaMethod())
              .addMethod(getCreateOAuth2ClientMethod())
              .addMethod(getGetOAuth2ClientsMethod())
              .addMethod(getUpdateOAuth2ClientMethod())
              .addMethod(getDeleteOAuth2ClientMethod())
              .addMethod(getGetEmailsSetupMethod())
              .addMethod(getUpdateEmailsSetupMethod())
              .addMethod(getGetUserBaseStatisticsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
