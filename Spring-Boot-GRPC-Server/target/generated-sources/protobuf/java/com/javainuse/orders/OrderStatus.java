// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order-service.proto

package com.javainuse.orders;

/**
 * Protobuf enum {@code orders.OrderStatus}
 */
public enum OrderStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOT_STARTED = 0;</code>
   */
  NOT_STARTED(0),
  /**
   * <code>IN_PROGRESS = 1;</code>
   */
  IN_PROGRESS(1),
  /**
   * <code>COMPLETED = 2;</code>
   */
  COMPLETED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOT_STARTED = 0;</code>
   */
  public static final int NOT_STARTED_VALUE = 0;
  /**
   * <code>IN_PROGRESS = 1;</code>
   */
  public static final int IN_PROGRESS_VALUE = 1;
  /**
   * <code>COMPLETED = 2;</code>
   */
  public static final int COMPLETED_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OrderStatus valueOf(int value) {
    return forNumber(value);
  }

  public static OrderStatus forNumber(int value) {
    switch (value) {
      case 0: return NOT_STARTED;
      case 1: return IN_PROGRESS;
      case 2: return COMPLETED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrderStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrderStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrderStatus>() {
          public OrderStatus findValueByNumber(int number) {
            return OrderStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.javainuse.orders.OrderServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final OrderStatus[] VALUES = values();

  public static OrderStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OrderStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:orders.OrderStatus)
}

