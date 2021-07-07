package com.whut.wedding.entity;


import java.io.Serializable;

public class Room implements Serializable {

  private long roomId;
  private String roomName;
  private String roomHeight;
  private String roomMinFee;
  private String roomForm;
  private String roomPillar;
  private String roomDinner;
  private String roomElectricFee;
  private String roomSplit;
  private String roomArea;
  private String roomLamplight;
  private String roomLed;
  private String roomTables;
  private long tbHotelHotelId;

  private String roomImg;

  public String getRoomImg() {
    return roomImg;
  }

  public void setRoomImg(String roomImg) {
    this.roomImg = roomImg;
  }

  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }


  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }


  public String getRoomHeight() {
    return roomHeight;
  }

  public void setRoomHeight(String roomHeight) {
    this.roomHeight = roomHeight;
  }


  public String getRoomMinFee() {
    return roomMinFee;
  }

  public void setRoomMinFee(String roomMinFee) {
    this.roomMinFee = roomMinFee;
  }


  public String getRoomForm() {
    return roomForm;
  }

  public void setRoomForm(String roomForm) {
    this.roomForm = roomForm;
  }


  public String getRoomPillar() {
    return roomPillar;
  }

  public void setRoomPillar(String roomPillar) {
    this.roomPillar = roomPillar;
  }


  public String getRoomDinner() {
    return roomDinner;
  }

  public void setRoomDinner(String roomDinner) {
    this.roomDinner = roomDinner;
  }


  public String getRoomElectricFee() {
    return roomElectricFee;
  }

  public void setRoomElectricFee(String roomElectricFee) {
    this.roomElectricFee = roomElectricFee;
  }


  public String getRoomSplit() {
    return roomSplit;
  }

  public void setRoomSplit(String roomSplit) {
    this.roomSplit = roomSplit;
  }


  public String getRoomArea() {
    return roomArea;
  }

  public void setRoomArea(String roomArea) {
    this.roomArea = roomArea;
  }


  public String getRoomLamplight() {
    return roomLamplight;
  }

  public void setRoomLamplight(String roomLamplight) {
    this.roomLamplight = roomLamplight;
  }


  public String getRoomLed() {
    return roomLed;
  }

  public void setRoomLed(String roomLed) {
    this.roomLed = roomLed;
  }


  public String getRoomTables() {
    return roomTables;
  }

  public void setRoomTables(String roomTables) {
    this.roomTables = roomTables;
  }


  public long getTbHotelHotelId() {
    return tbHotelHotelId;
  }

  public void setTbHotelHotelId(long tbHotelHotelId) {
    this.tbHotelHotelId = tbHotelHotelId;
  }

  @Override
  public String toString() {
    return "Room{" +
            "roomId=" + roomId +
            ", roomName='" + roomName + '\'' +
            ", roomHeight='" + roomHeight + '\'' +
            ", roomMinFee='" + roomMinFee + '\'' +
            ", roomForm='" + roomForm + '\'' +
            ", roomPillar='" + roomPillar + '\'' +
            ", roomDinner='" + roomDinner + '\'' +
            ", roomElectricFee='" + roomElectricFee + '\'' +
            ", roomSplit='" + roomSplit + '\'' +
            ", roomArea='" + roomArea + '\'' +
            ", roomLamplight='" + roomLamplight + '\'' +
            ", roomLed='" + roomLed + '\'' +
            ", roomTables='" + roomTables + '\'' +
            ", tbHotelHotelId=" + tbHotelHotelId +
            ", roomImg='" + roomImg + '\'' +
            '}';
  }
}
