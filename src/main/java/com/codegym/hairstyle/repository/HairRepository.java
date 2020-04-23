package com.codegym.hairstyle.repository;

import com.codegym.hairstyle.model.Hair;
import com.codegym.hairstyle.service.ServiceResult;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HairRepository extends PagingAndSortingRepository<Hair, Long> {
}
