package com.codegym.hairstyle.controller;

import com.codegym.hairstyle.model.Product;
import com.codegym.hairstyle.service.ProductService;
import com.codegym.hairstyle.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<ServiceResult> getAllProduct(){
        return new ResponseEntity<>(productService.findAllProduct(), HttpStatus.OK);
    }
}
