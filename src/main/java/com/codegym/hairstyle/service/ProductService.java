package com.codegym.hairstyle.service;

import com.codegym.hairstyle.model.Product;

import java.util.List;

public interface ProductService {
    ServiceResult findAllProduct();

    ServiceResult addProduct(Product product);
}
