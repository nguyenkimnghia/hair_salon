package com.codegym.hairstyle.repository;

import com.codegym.hairstyle.model.Hair;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HairRepository extends PagingAndSortingRepository<Hair, Long> {

}
