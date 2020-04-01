package com.pis.vstup.persistance.interfaces;

import com.pis.vstup.persistance.entities.Rating;

import java.util.List;
import java.util.Optional;

public interface IRating {

    List<Rating> findAll();

    List<Rating> findAllSort();

    List<Rating> findByRating(Integer rating);

    Optional<Rating> findById(Integer ratingID);

    Rating save(Rating rating);

    void deleteById(Integer ratingID);

}
