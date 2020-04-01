package com.pis.vstup.persistance.springdata;

import com.pis.vstup.persistance.entities.Rating;
import com.pis.vstup.persistance.interfaces.IRating;
import com.pis.vstup.persistance.repositories.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("RatingService")
@Transactional
@AllArgsConstructor
public class RatingImpl implements IRating {

    private final RatingRepository ratingRepository;

    @Override
    public List<Rating> findAll() {
        return (List<Rating>) ratingRepository.findAll();
    }

    @Override
    public List<Rating> findAllSort() {
        return ratingRepository.findAllByOrderByRatingDesc();
    }

    @Override
    public List<Rating> findByRating(Integer rating) {
        return ratingRepository.findByRating(rating);
    }

    @Override
    public Optional<Rating> findById(Integer ratingID) {
        return ratingRepository.findById(ratingID);
    }

    @Override
    public Rating save(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public void deleteById(Integer ratingID) {
        ratingRepository.deleteById(ratingID);
    }
}
