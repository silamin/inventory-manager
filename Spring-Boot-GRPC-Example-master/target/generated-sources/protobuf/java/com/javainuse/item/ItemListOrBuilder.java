// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item-service.proto

package com.javainuse.item;

public interface ItemListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:items.ItemList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .items.Item items = 1;</code>
   */
  java.util.List<com.javainuse.item.Item> 
      getItemsList();
  /**
   * <code>repeated .items.Item items = 1;</code>
   */
  com.javainuse.item.Item getItems(int index);
  /**
   * <code>repeated .items.Item items = 1;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .items.Item items = 1;</code>
   */
  java.util.List<? extends com.javainuse.item.ItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .items.Item items = 1;</code>
   */
  com.javainuse.item.ItemOrBuilder getItemsOrBuilder(
      int index);
}