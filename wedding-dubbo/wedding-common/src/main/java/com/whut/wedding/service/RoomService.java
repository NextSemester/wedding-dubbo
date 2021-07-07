package com.whut.wedding.service;

import com.whut.wedding.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> selectRoomsByHotelId(int hotelId);
}
