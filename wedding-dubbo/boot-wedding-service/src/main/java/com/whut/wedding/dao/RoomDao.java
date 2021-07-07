package com.whut.wedding.dao;

import com.whut.wedding.entity.Room;

import java.util.List;

public interface RoomDao {
    List<Room> selectRoomsByHotelId(int hotelId);
}
