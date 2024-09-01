package com.jetbrains.slim.photoz.clone.repository;

import com.jetbrains.slim.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}

