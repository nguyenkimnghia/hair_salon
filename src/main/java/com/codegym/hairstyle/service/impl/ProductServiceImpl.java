package com.codegym.hairstyle.service.impl;

import com.codegym.hairstyle.model.Product;
import com.codegym.hairstyle.repository.ProductRepository;
import com.codegym.hairstyle.service.ProductService;
import com.codegym.hairstyle.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    private ServiceResult sr;

    @Override
    public ServiceResult findAllProduct() {
        sr.setData(productRepository.findAll());
        return sr;
    }
}
