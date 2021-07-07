package com.whut.wedding.dao;

import com.whut.wedding.entity.Package;

import java.util.List;

public interface PackageDao {
    List<Package> selectPackageByHotelId(int hotelId);

    Package selectPackageById(int packageId);
}
