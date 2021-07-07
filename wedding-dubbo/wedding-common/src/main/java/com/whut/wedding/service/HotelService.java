package com.whut.wedding.service;

import com.whut.wedding.entity.Hotel;
import com.whut.wedding.entity.HotelInfo;
import com.whut.wedding.entity.Page;

import java.util.List;

public interface HotelService {
    List<Hotel> selectAll();

    int selectCout();

    /**
     * 分页查询
     * @param currentPage 当前页数
     * @return 分页对象
     */
    Page<Hotel> selectPage(int currentPage);

    /**
     * 查询酒店详情
     * @param hotelId
     * @return
     */
    HotelInfo selectHotelInfo(int hotelId);
}
