package com.codegym.hairstyle.controller;

import com.codegym.hairstyle.model.Product;
import com.codegym.hairstyle.service.ProductService;
import com.codegym.hairstyle.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<ServiceResult> getAllProduct(){
        return new ResponseEntity<>(productService.findAllProduct(), HttpStatus.OK);
    }

//    @PostMapping("/addProduct")
//    public ResponseEntity<ServiceResult> addEmployee(@RequestBody Product product, UriComponentsBuilder ucBuilder){
//        productService.addProduct(product);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/product/{id}").buildAndExpand(product.getId()).toUri());
//        return new ResponseEntity<>(headers,HttpStatus.CREATED);
//    }
}
