// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user-service.proto

package com.javainuse.user;

public interface UserListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:users.UserList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .users.GetUser users = 1;</code>
   */
  java.util.List<com.javainuse.user.GetUser> 
      getUsersList();
  /**
   * <code>repeated .users.GetUser users = 1;</code>
   */
  com.javainuse.user.GetUser getUsers(int index);
  /**
   * <code>repeated .users.GetUser users = 1;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .users.GetUser users = 1;</code>
   */
  java.util.List<? extends com.javainuse.user.GetUserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .users.GetUser users = 1;</code>
   */
  com.javainuse.user.GetUserOrBuilder getUsersOrBuilder(
      int index);
}