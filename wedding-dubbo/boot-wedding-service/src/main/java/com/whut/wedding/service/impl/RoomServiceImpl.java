package com.whut.wedding.service.impl;

import com.whut.wedding.dao.RoomDao;
import com.whut.wedding.entity.Room;
import com.whut.wedding.service.RoomService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@DubboService(version = "1.0.0")
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomDao roomDao;
    @Override
    public List<Room> selectRoomsByHotelId(int hotelId) {
        return roomDao.selectRoomsByHotelId(hotelId);
    }
}
