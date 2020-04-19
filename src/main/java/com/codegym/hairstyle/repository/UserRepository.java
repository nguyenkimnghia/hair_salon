package com.codegym.hairstyle.repository;

import com.codegym.hairstyle.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
