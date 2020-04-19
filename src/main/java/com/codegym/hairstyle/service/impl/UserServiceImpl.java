package com.codegym.hairstyle.service.impl;

import com.codegym.hairstyle.model.User;
import com.codegym.hairstyle.repository.UserRepository;
import com.codegym.hairstyle.service.ServiceResult;
import com.codegym.hairstyle.service.StatusService;
import com.codegym.hairstyle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ServiceResult serviceResult;

    @Override
    public ServiceResult findAllUser() {
        serviceResult.setData(userRepository.findAll());
        return serviceResult;
    }

    @Override
    public ServiceResult addUser(User user) {
        ServiceResult sr = new ServiceResult();
        sr.setData(userRepository.save(user));
        return sr;
    }

    @Override
    public ServiceResult upDateUser(User user) {
        ServiceResult sr = new ServiceResult();
        if (!userRepository.findById(user.getId()).isPresent()){
            sr.setStatus(StatusService.FAILED);
            sr.setMessage("user not found");
        }else {
            userRepository.save(user);
        }
        return sr;
    }

    @Override
    public ServiceResult deleteUser(Long id) {
        ServiceResult sr = new ServiceResult();
        User user = userRepository.findById(id).orElse(null);
        if (user == null){
            sr.setStatus(StatusService.FAILED);
            sr.setMessage("user not found");
        }else {
            userRepository.delete(user);
        }
        return sr;
    }

}
