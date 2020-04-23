package com.codegym.hairstyle.service.impl;

import com.codegym.hairstyle.repository.ImageRepository;
import com.codegym.hairstyle.service.ImageService;
import com.codegym.hairstyle.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageRepository imageRepository;

    @Override
    public ServiceResult findHairById(Long hair_id) {
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setData(imageRepository.findAllByHair_Id(hair_id));
        return serviceResult;
    }

    @Override
    public ServiceResult findAll() {
        ServiceResult sr = new ServiceResult();
        sr.setData(imageRepository.findAll());
        return sr;
    }
}
