package com.example.Patika.PatikaWeek3.requests;


import com.example.Patika.PatikaWeek3.Movie;
import com.example.Patika.PatikaWeek3.MovieGenre;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MovieRequest {

    @NotBlank
    private String name;

    @NotNull
    private MovieGenre genre;

    @NotNull
    private Integer releaseYear;

    @NotNull
    private String director;

    public Movie convertToMovie(){
        return Movie.builder()
                .movieName(name)
                .movieGenre(genre)
                .releaseYear(releaseYear)
                .directorName(director)
                .build();
    }
}
