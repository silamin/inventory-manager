// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item-service.proto

package com.javainuse.item;

public interface ItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:items.Item)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 itemId = 1;</code>
   */
  int getItemId();

  /**
   * <code>string itemName = 2;</code>
   */
  java.lang.String getItemName();
  /**
   * <code>string itemName = 2;</code>
   */
  com.google.protobuf.ByteString
      getItemNameBytes();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int32 quantity_in_store = 4;</code>
   */
  int getQuantityInStore();
}