package com.whut.wedding.entity;

import java.io.Serializable;

public class User implements Serializable {

  private long userId;
  private String userHeadPortrait;
  private String userNickname;
  private String userSex;
  private String userCity;
  private String userIDcard;
  private String userAdd;
  private String userPostcode;
  private String userQq;
  private String userTel;
  private String userPassword;
  private String userRealname;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserHeadPortrait() {
    return userHeadPortrait;
  }

  public void setUserHeadPortrait(String userHeadPortrait) {
    this.userHeadPortrait = userHeadPortrait;
  }


  public String getUserNickname() {
    return userNickname;
  }

  public void setUserNickname(String userNickname) {
    this.userNickname = userNickname;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public String getUserCity() {
    return userCity;
  }

  public void setUserCity(String userCity) {
    this.userCity = userCity;
  }


  public String getUserIDcard() {
    return userIDcard;
  }

  public void setUserIDcard(String userIDcard) {
    this.userIDcard = userIDcard;
  }


  public String getUserAdd() {
    return userAdd;
  }

  public void setUserAdd(String userAdd) {
    this.userAdd = userAdd;
  }


  public String getUserPostcode() {
    return userPostcode;
  }

  public void setUserPostcode(String userPostcode) {
    this.userPostcode = userPostcode;
  }


  public String getUserQq() {
    return userQq;
  }

  public void setUserQq(String userQq) {
    this.userQq = userQq;
  }


  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
    this.userTel = userTel;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getUserRealname() {
    return userRealname;
  }

  public void setUserRealname(String userRealname) {
    this.userRealname = userRealname;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", userHeadPortrait='" + userHeadPortrait + '\'' +
            ", userNickname='" + userNickname + '\'' +
            ", userSex='" + userSex + '\'' +
            ", userCity='" + userCity + '\'' +
            ", userIDcard='" + userIDcard + '\'' +
            ", userAdd='" + userAdd + '\'' +
            ", userPostcode='" + userPostcode + '\'' +
            ", userQq='" + userQq + '\'' +
            ", userTel='" + userTel + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", userRealname='" + userRealname + '\'' +
            '}';
  }
}
