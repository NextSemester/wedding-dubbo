package com.whut.wedding.controller;

import com.whut.wedding.entity.Hotel;
import com.whut.wedding.entity.HotelInfo;
import com.whut.wedding.entity.Package;
import com.whut.wedding.entity.Page;
import com.whut.wedding.entity.Room;
import com.whut.wedding.service.HotelService;
import com.whut.wedding.service.PackageService;
import com.whut.wedding.service.RoomService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("hotel")
public class HotelController {
    @DubboReference(version = "1.0.0")
    private HotelService hotelService;
    @DubboReference(version = "1.0.0")
    private RoomService roomService;
    @DubboReference(version = "1.0.0")
    private PackageService packageService;

    @RequestMapping("list")
    public String listHotels(Model model){
        List<Hotel> hotels=hotelService.selectAll();
        model.addAttribute("hotels",hotels);
        return "field";
    }

    @RequestMapping("page")
    public String pageHotels(Model model,Integer currentPage) throws Exception{
        //页数默认为1开始
        if(currentPage==null){
            currentPage=1;
        }
        Page<Hotel> hotelPage=hotelService.selectPage(currentPage);
        model.addAttribute("page",hotelPage);
        return "field";
    }

    @RequestMapping("details")
    public String hotelDetails(Model model,Integer hotelId){
        HotelInfo hotelInfo = hotelService.selectHotelInfo(hotelId);
        model.addAttribute("info",hotelInfo);
        //查询酒店的房间
        List<Room> rooms = roomService.selectRoomsByHotelId(hotelId);
        model.addAttribute("rooms",rooms);
        //查询套餐信息
        List<Package> packages = packageService.selectPackageByHotelId(hotelId);
        model.addAttribute("packages",packages);
        return "details";
    }

}
