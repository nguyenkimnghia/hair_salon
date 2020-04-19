package com.codegym.hairstyle.service;


import com.codegym.hairstyle.model.Hair;

public interface HairService {
    ServiceResult findAllHair();

    ServiceResult addHair(Hair hair);

    ServiceResult update(Hair hair);

    ServiceResult deleteHair(Long id);
}
