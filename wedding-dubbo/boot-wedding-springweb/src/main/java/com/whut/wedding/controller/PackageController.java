package com.whut.wedding.controller;

import com.whut.wedding.entity.HotelInfo;
import com.whut.wedding.entity.Package;
import com.whut.wedding.entity.Room;
import com.whut.wedding.service.HotelService;
import com.whut.wedding.service.PackageService;
import com.whut.wedding.service.RoomService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("package")
public class PackageController {
    @DubboReference(version = "1.0.0")
    private PackageService packageService;
    @DubboReference(version = "1.0.0")
    private RoomService roomService;
    @DubboReference(version = "1.0.0")
    private HotelService hotelService;
    @RequestMapping("findPackage")
    public String findPackage(Model model,Integer packageId){
        Package aPackage = packageService.selectPackageById(packageId);
        model.addAttribute("packageInfo",aPackage);
        List<Room> rooms = roomService.selectRoomsByHotelId((int)aPackage.getTbHotelHotelId());
        model.addAttribute("rooms",rooms);
        HotelInfo hotelInfo = hotelService.selectHotelInfo((int) aPackage.getTbHotelHotelId());
        model.addAttribute("hotelInfo",hotelInfo);
        return "packageDetails";
    }
}
