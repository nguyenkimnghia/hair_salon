package com.codegym.hairstyle.controller;

import com.codegym.hairstyle.model.Product;
import com.codegym.hairstyle.service.ProductService;
import com.codegym.hairstyle.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<ServiceResult> getAllProduct(){
        return new ResponseEntity<>(productService.findAllProduct(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ServiceResult> addProduct(@RequestBody Product product){

        return new ResponseEntity<>(productService.addProduct(product),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<ServiceResult> deleteProduct(@PathVariable("id") Long id){
        return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<ServiceResult> updateProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.updateProduct(product),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceResult> getProductById(@PathVariable("id") Long id){
        return new ResponseEntity<>(productService.findByIdProduct(id), HttpStatus.OK);
    }
}
