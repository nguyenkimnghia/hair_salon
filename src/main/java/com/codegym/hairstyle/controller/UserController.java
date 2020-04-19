package com.codegym.hairstyle.controller;

import com.codegym.hairstyle.model.User;
import com.codegym.hairstyle.service.ServiceResult;
import com.codegym.hairstyle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<ServiceResult> getAllUser (){
        return new ResponseEntity<>(userService.findAllUser(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ServiceResult> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<ServiceResult> updateUser(@RequestBody User user){
        return new ResponseEntity<>(userService.upDateUser(user), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ServiceResult> deleteUser(@PathVariable Long id){
        return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
    }
}
