package com.codegym.hairstyle.service;

public interface ImageService {
    ServiceResult findHairById(Long hair_id);
    ServiceResult findAll();
}
