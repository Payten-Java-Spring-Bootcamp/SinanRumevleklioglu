package com.example.Patika.PatikaWeek3.repositories;

import com.example.Patika.PatikaWeek3.entities.MovieEntity;

import java.util.List;

public interface MovieDao {

    MovieEntity save(MovieEntity entity);

    MovieEntity retrieve(Long id);


}
