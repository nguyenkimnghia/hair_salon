package com.codegym.hairstyle.controller;

import com.codegym.hairstyle.model.Hair;
import com.codegym.hairstyle.service.HairService;
import com.codegym.hairstyle.service.ImageService;
import com.codegym.hairstyle.service.ServiceResult;
import com.codegym.hairstyle.service.impl.ImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/hair")
public class HairController {
    @Autowired
    private HairService hairService;

    @Autowired
    ImageService imageService;

    @GetMapping("/image")
    public ResponseEntity<ServiceResult> getAllImage(){
        return new ResponseEntity<>(imageService.findAll(),HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<ServiceResult> getAllHair(){
        return new ResponseEntity<>(hairService.findAllHair(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ServiceResult> addHair(@RequestBody Hair hair){
        return new ResponseEntity<>(hairService.addHair(hair), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<ServiceResult> upDateHair(@RequestBody Hair hair){
        return new ResponseEntity<>(hairService.update(hair), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ServiceResult> deleteHair(@PathVariable Long id){
        return new ResponseEntity<>(hairService.deleteHair(id),HttpStatus.OK);
    }
}
