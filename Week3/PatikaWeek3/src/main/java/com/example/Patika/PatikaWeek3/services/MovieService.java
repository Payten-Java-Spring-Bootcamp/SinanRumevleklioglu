package com.example.Patika.PatikaWeek3.services;

import com.example.Patika.PatikaWeek3.Movie;


public interface MovieService {

    Long create(Movie movie);

    Movie retrieve(Long id);
}
