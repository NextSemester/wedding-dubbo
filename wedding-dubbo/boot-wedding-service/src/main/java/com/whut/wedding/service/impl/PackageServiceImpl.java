package com.whut.wedding.service.impl;

import com.whut.wedding.dao.PackageDao;
import com.whut.wedding.entity.Package;
import com.whut.wedding.service.PackageService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@DubboService(version = "1.0.0")
@Service
public class PackageServiceImpl implements PackageService {
    @Autowired
    private PackageDao packageDao;
    @Override
    public List<Package> selectPackageByHotelId(int hotelId) {
        return packageDao.selectPackageByHotelId(hotelId);
    }

    @Override
    public Package selectPackageById(int packageId) {
        return packageDao.selectPackageById(packageId);
    }
}
