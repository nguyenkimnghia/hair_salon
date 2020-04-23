package com.codegym.hairstyle.service.impl;

import com.codegym.hairstyle.model.Hair;
import com.codegym.hairstyle.model.Image;
import com.codegym.hairstyle.repository.HairRepository;
import com.codegym.hairstyle.repository.ImageRepository;
import com.codegym.hairstyle.service.HairService;
import com.codegym.hairstyle.service.ServiceResult;
import com.codegym.hairstyle.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HairServiceImpl implements HairService {
    @Autowired
    private HairRepository hairRepository;

    @Autowired
    ServiceResult serviceResult;

    @Autowired
    ImageRepository imageRepository;

    @Override
    public ServiceResult findAllHair() {
//        Iterable<Hair> hairs = hairRepository.findAll();
//        ServiceResult sr = new ServiceResult();
//        for (Hair hair: hairs) {
//            serviceResult.setData(hair);
//            if (hair.getId() != null){
//                sr.setData(imageRepository.findAllByHair_Id(hair.getId()));
//            }else {
//                return null;
//            }
//        }
        serviceResult.setData(hairRepository.findAll());
        serviceResult.setData(imageRepository.findAll());
        return serviceResult;
    }

    @Override
    public ServiceResult addHair(Hair hair) {
        ServiceResult sr = new ServiceResult();
        sr.setData(hairRepository.save(hair));
        return sr;
    }

    @Override
    public ServiceResult update(Hair hair) {
        ServiceResult sr = new ServiceResult();
        if (!hairRepository.findById(hair.getId()).isPresent()) {
            sr.setStatus(StatusService.FAILED);
            sr.setMessage("not found");
        } else {
            hairRepository.save(hair);
        }

        return sr;
    }

    @Override
    public ServiceResult deleteHair(Long id) {
        ServiceResult sr = new ServiceResult();
        Hair hair = hairRepository.findById(id).orElse(null);
        if (hair == null){
            sr.setStatus(StatusService.FAILED);
            sr.setMessage("not found");
        }else {
            hairRepository.delete(hair);
        }
        return sr;
    }
}
