package com.whut.wedding.entity;


import java.io.Serializable;

public class HotelInfo implements Serializable {

  private long infoId;
  private String infoStarLevel;
  private String infoDecorateTime;
  private String infoSubscription;
  private String infoServiceFee;
  private String infoEnterFee;
  private String infoDressingRoom;
  private String infoBus;
  private String infoMicrophone;
  private String infoProjector;
  private String infoTablecloth;
  private String infoElectricCharge;
  private String infoAmusement;
  private String infoCoordinatesA;
  private String infoCoordinatesB;
  private long tbHotelHotelId;

  private String hotelName;
  private String hotelAddress;
  private String hotelTel;
  private String hotelImg;

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public String getHotelAddress() {
    return hotelAddress;
  }

  public void setHotelAddress(String hotelAddress) {
    this.hotelAddress = hotelAddress;
  }

  public String getHotelTel() {
    return hotelTel;
  }

  public void setHotelTel(String hotelTel) {
    this.hotelTel = hotelTel;
  }

  public String getHotelImg() {
    return hotelImg;
  }

  public void setHotelImg(String hotelImg) {
    this.hotelImg = hotelImg;
  }

  public long getInfoId() {
    return infoId;
  }

  public void setInfoId(long infoId) {
    this.infoId = infoId;
  }


  public String getInfoStarLevel() {
    return infoStarLevel;
  }

  public void setInfoStarLevel(String infoStarLevel) {
    this.infoStarLevel = infoStarLevel;
  }


  public String getInfoDecorateTime() {
    return infoDecorateTime;
  }

  public void setInfoDecorateTime(String infoDecorateTime) {
    this.infoDecorateTime = infoDecorateTime;
  }


  public String getInfoSubscription() {
    return infoSubscription;
  }

  public void setInfoSubscription(String infoSubscription) {
    this.infoSubscription = infoSubscription;
  }


  public String getInfoServiceFee() {
    return infoServiceFee;
  }

  public void setInfoServiceFee(String infoServiceFee) {
    this.infoServiceFee = infoServiceFee;
  }


  public String getInfoEnterFee() {
    return infoEnterFee;
  }

  public void setInfoEnterFee(String infoEnterFee) {
    this.infoEnterFee = infoEnterFee;
  }


  public String getInfoDressingRoom() {
    return infoDressingRoom;
  }

  public void setInfoDressingRoom(String infoDressingRoom) {
    this.infoDressingRoom = infoDressingRoom;
  }


  public String getInfoBus() {
    return infoBus;
  }

  public void setInfoBus(String infoBus) {
    this.infoBus = infoBus;
  }


  public String getInfoMicrophone() {
    return infoMicrophone;
  }

  public void setInfoMicrophone(String infoMicrophone) {
    this.infoMicrophone = infoMicrophone;
  }


  public String getInfoProjector() {
    return infoProjector;
  }

  public void setInfoProjector(String infoProjector) {
    this.infoProjector = infoProjector;
  }


  public String getInfoTablecloth() {
    return infoTablecloth;
  }

  public void setInfoTablecloth(String infoTablecloth) {
    this.infoTablecloth = infoTablecloth;
  }


  public String getInfoElectricCharge() {
    return infoElectricCharge;
  }

  public void setInfoElectricCharge(String infoElectricCharge) {
    this.infoElectricCharge = infoElectricCharge;
  }


  public String getInfoAmusement() {
    return infoAmusement;
  }

  public void setInfoAmusement(String infoAmusement) {
    this.infoAmusement = infoAmusement;
  }


  public String getInfoCoordinatesA() {
    return infoCoordinatesA;
  }

  public void setInfoCoordinatesA(String infoCoordinatesA) {
    this.infoCoordinatesA = infoCoordinatesA;
  }


  public String getInfoCoordinatesB() {
    return infoCoordinatesB;
  }

  public void setInfoCoordinatesB(String infoCoordinatesB) {
    this.infoCoordinatesB = infoCoordinatesB;
  }


  public long getTbHotelHotelId() {
    return tbHotelHotelId;
  }

  public void setTbHotelHotelId(long tbHotelHotelId) {
    this.tbHotelHotelId = tbHotelHotelId;
  }

  @Override
  public String toString() {
    return "HotelInfo{" +
            "infoId=" + infoId +
            ", infoStarLevel='" + infoStarLevel + '\'' +
            ", infoDecorateTime='" + infoDecorateTime + '\'' +
            ", infoSubscription='" + infoSubscription + '\'' +
            ", infoServiceFee='" + infoServiceFee + '\'' +
            ", infoEnterFee='" + infoEnterFee + '\'' +
            ", infoDressingRoom='" + infoDressingRoom + '\'' +
            ", infoBus='" + infoBus + '\'' +
            ", infoMicrophone='" + infoMicrophone + '\'' +
            ", infoProjector='" + infoProjector + '\'' +
            ", infoTablecloth='" + infoTablecloth + '\'' +
            ", infoElectricCharge='" + infoElectricCharge + '\'' +
            ", infoAmusement='" + infoAmusement + '\'' +
            ", infoCoordinatesA='" + infoCoordinatesA + '\'' +
            ", infoCoordinatesB='" + infoCoordinatesB + '\'' +
            ", tbHotelHotelId=" + tbHotelHotelId +
            ", hotelName='" + hotelName + '\'' +
            ", hotelAddress='" + hotelAddress + '\'' +
            ", hotelTel='" + hotelTel + '\'' +
            ", hotelImg='" + hotelImg + '\'' +
            '}';
  }
}
