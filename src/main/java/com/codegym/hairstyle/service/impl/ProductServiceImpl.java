package com.codegym.hairstyle.service.impl;

import com.codegym.hairstyle.model.Product;
import com.codegym.hairstyle.repository.ProductRepository;
import com.codegym.hairstyle.service.ProductService;
import com.codegym.hairstyle.service.ServiceResult;
import com.codegym.hairstyle.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    @Override
    public ServiceResult addProduct(Product product) {
        ServiceResult sr = new ServiceResult();
        sr.setData(productRepository.save(product));
        return sr;
    }

    @Override
    public ServiceResult deleteProduct(Long id) {
        ServiceResult sr = new ServiceResult();
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            sr.setStatus(StatusService.FAILED);
            sr.setMessage("Product not found");
        } else {
            productRepository.delete(product);
        }
        return sr;
    }

    @Override
    public ServiceResult updateProduct(Product product) {
        ServiceResult sr = new ServiceResult();
        if (!productRepository.findById(product.getId()).isPresent()){
            sr.setStatus(StatusService.FAILED);
            sr.setMessage("product not found");
        }else {
            sr.setData(productRepository.save(product));
        }
        return null;
    }

    @Override
    public ServiceResult findByIdProduct(Long id) {
        ServiceResult result = new ServiceResult();
        result.setData(productRepository.findById(id));
        return result;
    }


}
