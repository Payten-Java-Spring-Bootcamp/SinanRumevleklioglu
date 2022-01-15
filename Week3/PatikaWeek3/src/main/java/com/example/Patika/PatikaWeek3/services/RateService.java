package com.example.Patika.PatikaWeek3.services;

import com.example.Patika.PatikaWeek3.Rate;

import java.util.List;

public interface RateService {

    void rateToMovie(Rate rate);

    List<Rate> retrieveByMovieId(Long movieId);

    List<Rate> retrieveByMovieIdV2(Long movieId);
}
