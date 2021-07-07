package com.whut.wedding.dao;

import com.whut.wedding.entity.Hotel;

import java.util.List;

public interface HotelDao {
    List<Hotel> selectAll();
    int selectCount();
    List<Hotel> selectLimit(int start,int length);
}
