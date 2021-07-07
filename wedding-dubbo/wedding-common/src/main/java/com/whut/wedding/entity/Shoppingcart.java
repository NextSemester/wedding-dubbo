package com.whut.wedding.entity;

import java.io.Serializable;

/**
 * 购物车
 */
public class Shoppingcart implements Serializable {

  private String shoppingcartId;
  private String shoppingcartTime;
  private String shoppingcartName;
  private String shoppingcartType;
  private String shoppingcartPlace;
  private Double shoppingcartPrice;
  private Integer shoppingcartCount;
  private String tbUserUserTel;
  private String shoppingcartImg;
  private String shoppingcartHotelname;


  public String getShoppingcartId() {
    return shoppingcartId;
  }

  public void setShoppingcartId(String shoppingcartId) {
    this.shoppingcartId = shoppingcartId;
  }


  public String getShoppingcartTime() {
    return shoppingcartTime;
  }

  public void setShoppingcartTime(String shoppingcartTime) {
    this.shoppingcartTime = shoppingcartTime;
  }


  public String getShoppingcartName() {
    return shoppingcartName;
  }

  public void setShoppingcartName(String shoppingcartName) {
    this.shoppingcartName = shoppingcartName;
  }


  public String getShoppingcartType() {
    return shoppingcartType;
  }

  public void setShoppingcartType(String shoppingcartType) {
    this.shoppingcartType = shoppingcartType;
  }


  public String getShoppingcartPlace() {
    return shoppingcartPlace;
  }

  public void setShoppingcartPlace(String shoppingcartPlace) {
    this.shoppingcartPlace = shoppingcartPlace;
  }


  public Double getShoppingcartPrice() {
    return shoppingcartPrice;
  }

  public void setShoppingcartPrice(Double shoppingcartPrice) {
    this.shoppingcartPrice = shoppingcartPrice;
  }


  public Integer getShoppingcartCount() {
    return shoppingcartCount;
  }

  public void setShoppingcartCount(Integer shoppingcartCount) {
    this.shoppingcartCount = shoppingcartCount;
  }


  public String getTbUserUserTel() {
    return tbUserUserTel;
  }

  public void setTbUserUserTel(String tbUserUserTel) {
    this.tbUserUserTel = tbUserUserTel;
  }


  public String getShoppingcartImg() {
    return shoppingcartImg;
  }

  public void setShoppingcartImg(String shoppingcartImg) {
    this.shoppingcartImg = shoppingcartImg;
  }


  public String getShoppingcartHotelname() {
    return shoppingcartHotelname;
  }

  public void setShoppingcartHotelname(String shoppingcartHotelname) {
    this.shoppingcartHotelname = shoppingcartHotelname;
  }

}
