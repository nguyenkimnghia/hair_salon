package com.codegym.hairstyle.repository;

import com.codegym.hairstyle.model.Image;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ImageRepository extends PagingAndSortingRepository<Image, Long> {

    Iterable<Image> findAllByHair_Id(Long hair_id);
}
