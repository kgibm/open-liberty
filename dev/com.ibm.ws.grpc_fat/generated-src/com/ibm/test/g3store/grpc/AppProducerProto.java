// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProducerStore.proto

package com.ibm.test.g3store.grpc;

public final class AppProducerProto {
  private AppProducerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_g3store_grpc_AppResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_g3store_grpc_AppResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_g3store_grpc_AppRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_g3store_grpc_AppRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_g3store_grpc_DeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_g3store_grpc_DeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_g3store_grpc_DeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_g3store_grpc_DeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_g3store_grpc_MultiCreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_g3store_grpc_MultiCreateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_g3store_grpc_StreamRequestA_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_g3store_grpc_StreamRequestA_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_g3store_grpc_StreamReplyA_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_g3store_grpc_StreamReplyA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ProducerStore.proto\022\021test.g3store.grpc" +
      "\032\013Store.proto\032\033google/protobuf/empty.pro" +
      "to\"\031\n\013AppResponse\022\n\n\002id\030\001 \001(\t\"+\n\nAppRequ" +
      "est\022\035\n\tretailApp\030\001 \001(\0132\n.RetailApp\" \n\rDe" +
      "leteRequest\022\017\n\007appName\030\001 \001(\t\" \n\016DeleteRe" +
      "sponse\022\016\n\006result\030\001 \001(\t\"%\n\023MultiCreateRes" +
      "ponse\022\016\n\006result\030\001 \001(\t\"!\n\016StreamRequestA\022" +
      "\017\n\007message\030\001 \001(\t\"\037\n\014StreamReplyA\022\017\n\007mess" +
      "age\030\001 \001(\t2\221\004\n\022AppProducerService\022L\n\tcrea" +
      "teApp\022\035.test.g3store.grpc.AppRequest\032\036.t" +
      "est.g3store.grpc.AppResponse\"\000\022R\n\tdelete" +
      "App\022 .test.g3store.grpc.DeleteRequest\032!." +
      "test.g3store.grpc.DeleteResponse\"\000\022N\n\rde" +
      "leteAllApps\022\026.google.protobuf.Empty\032!.te" +
      "st.g3store.grpc.DeleteResponse\"\0000\001\022W\n\ncr" +
      "eateApps\022\035.test.g3store.grpc.AppRequest\032" +
      "&.test.g3store.grpc.MultiCreateResponse\"" +
      "\000(\001\022W\n\rclientStreamA\022!.test.g3store.grpc" +
      ".StreamRequestA\032\037.test.g3store.grpc.Stre" +
      "amReplyA\"\000(\001\022W\n\rserverStreamA\022!.test.g3s" +
      "tore.grpc.StreamRequestA\032\037.test.g3store." +
      "grpc.StreamReplyA\"\0000\001B/\n\031com.ibm.test.g3" +
      "store.grpcB\020AppProducerProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ibm.test.g3store.grpc.StoreProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_test_g3store_grpc_AppResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_test_g3store_grpc_AppResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_g3store_grpc_AppResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_test_g3store_grpc_AppRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_test_g3store_grpc_AppRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_g3store_grpc_AppRequest_descriptor,
        new java.lang.String[] { "RetailApp", });
    internal_static_test_g3store_grpc_DeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_test_g3store_grpc_DeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_g3store_grpc_DeleteRequest_descriptor,
        new java.lang.String[] { "AppName", });
    internal_static_test_g3store_grpc_DeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_test_g3store_grpc_DeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_g3store_grpc_DeleteResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_test_g3store_grpc_MultiCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_test_g3store_grpc_MultiCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_g3store_grpc_MultiCreateResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_test_g3store_grpc_StreamRequestA_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_test_g3store_grpc_StreamRequestA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_g3store_grpc_StreamRequestA_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_test_g3store_grpc_StreamReplyA_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_test_g3store_grpc_StreamReplyA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_g3store_grpc_StreamReplyA_descriptor,
        new java.lang.String[] { "Message", });
    com.ibm.test.g3store.grpc.StoreProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
