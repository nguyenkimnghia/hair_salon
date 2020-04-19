package com.codegym.hairstyle.service;

import com.codegym.hairstyle.model.User;

public interface UserService {
    ServiceResult findAllUser();
    ServiceResult addUser(User user);
    ServiceResult upDateUser(User user);
    ServiceResult deleteUser(Long id);
}
