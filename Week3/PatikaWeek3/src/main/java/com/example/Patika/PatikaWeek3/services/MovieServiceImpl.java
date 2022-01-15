package com.example.Patika.PatikaWeek3.services;

import com.example.Patika.PatikaWeek3.Movie;
import com.example.Patika.PatikaWeek3.entities.MovieEntity;
import com.example.Patika.PatikaWeek3.repositories.MovieDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieDao movieDao;

    //Method of create movie for service
    @Override
    public Long create(Movie movie) {

        MovieEntity createdMovie = movieDao.save(movie.convertToMovieEntity());
        return createdMovie.getId();
    }

    //Method of get movie from service
    @Override
    public Movie retrieve(Long id) {
        MovieEntity entity = movieDao.retrieve(id);
        return Movie.convertFromMovieEntity(entity);
    }
}
