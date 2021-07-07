package com.whut.wedding.service.impl;

import com.whut.wedding.dao.HotelDao;
import com.whut.wedding.dao.HotelInfoDao;
import com.whut.wedding.entity.Hotel;
import com.whut.wedding.entity.HotelInfo;
import com.whut.wedding.entity.Page;
import com.whut.wedding.service.HotelService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@DubboService(version = "1.0.0")
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelDao hotelDao;
    @Autowired
    private HotelInfoDao hotelInfoDao;

    @Override
    public int selectCout() {
        return hotelDao.selectCount();
    }

    @Override
    public Page<Hotel> selectPage(int currentPage) {
        //获得页面总数
        int total=hotelDao.selectCount();
        //确定每一页的行数，计算分页数量
        int pageSize=3;
        int pageCount=total % pageSize == 0 ? total /pageSize : total/pageSize+1;
        //实现分页查询 currentPage从1开始，要减1
        List<Hotel> hotels = hotelDao.selectLimit(pageSize * (currentPage - 1), pageSize);
        //返回分页对象
        Page<Hotel> page=new Page<Hotel>();
        page.setPageCount(pageCount);
        page.setCurrentPage(currentPage);
        page.setData(hotels);
        return page;
    }

    @Override
    public HotelInfo selectHotelInfo(int hotelId) {
        return hotelInfoDao.selectHotelInfo(hotelId);
    }

    @Override
    public List<Hotel> selectAll() {
        return hotelDao.selectAll();
    }
}
