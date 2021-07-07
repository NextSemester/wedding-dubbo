package com.whut.wedding.service;

import java.util.List;
import com.whut.wedding.entity.Package;

public interface PackageService {
    List<Package> selectPackageByHotelId(int hotelId);
    Package selectPackageById(int packageId);
}
