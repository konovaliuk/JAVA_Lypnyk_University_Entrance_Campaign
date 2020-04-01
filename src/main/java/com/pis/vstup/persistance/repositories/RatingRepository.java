package com.pis.vstup.persistance.repositories;

import com.pis.vstup.persistance.entities.Rating;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RatingRepository extends CrudRepository<Rating, Integer> {

    List<Rating> findByRating(Integer rating);
    List<Rating> findAllByOrderByRatingDesc();

}
