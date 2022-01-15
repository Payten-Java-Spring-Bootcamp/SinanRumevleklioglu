package com.example.Patika.PatikaWeek3.repositories;

import com.example.Patika.PatikaWeek3.entities.RateEntity;

import java.util.List;

public interface RateDao {

    void rateToMovie(RateEntity entity);

    List<RateEntity> retrieveByMovieId(Long movieId);
}
