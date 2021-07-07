package com.whut.wedding.entity;


import java.io.Serializable;

public class Package implements Serializable {

  private long packageId;
  private String packageName;
  private long packagePrice;
  private String packageContent;
  private long packageSales;
  private String packageMenuA;
  private String packageMenuB;
  private long tbHotelHotelId;

  private String packageImg;

  public String getPackageImg() {
    return packageImg;
  }

  public void setPackageImg(String packageImg) {
    this.packageImg = packageImg;
  }

  public long getPackageId() {
    return packageId;
  }

  public void setPackageId(long packageId) {
    this.packageId = packageId;
  }


  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public long getPackagePrice() {
    return packagePrice;
  }

  public void setPackagePrice(long packagePrice) {
    this.packagePrice = packagePrice;
  }


  public String getPackageContent() {
    return packageContent;
  }

  public void setPackageContent(String packageContent) {
    this.packageContent = packageContent;
  }


  public long getPackageSales() {
    return packageSales;
  }

  public void setPackageSales(long packageSales) {
    this.packageSales = packageSales;
  }


  public String getPackageMenuA() {
    return packageMenuA;
  }

  public void setPackageMenuA(String packageMenuA) {
    this.packageMenuA = packageMenuA;
  }


  public String getPackageMenuB() {
    return packageMenuB;
  }

  public void setPackageMenuB(String packageMenuB) {
    this.packageMenuB = packageMenuB;
  }


  public long getTbHotelHotelId() {
    return tbHotelHotelId;
  }

  public void setTbHotelHotelId(long tbHotelHotelId) {
    this.tbHotelHotelId = tbHotelHotelId;
  }

  @Override
  public String toString() {
    return "Package{" +
            "packageId=" + packageId +
            ", packageName='" + packageName + '\'' +
            ", packagePrice=" + packagePrice +
            ", packageContent='" + packageContent + '\'' +
            ", packageSales=" + packageSales +
            ", packageMenuA='" + packageMenuA + '\'' +
            ", packageMenuB='" + packageMenuB + '\'' +
            ", tbHotelHotelId=" + tbHotelHotelId +
            ", packageImg='" + packageImg + '\'' +
            '}';
  }
}
