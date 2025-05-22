package com.example.moviemanagement.service;

import com.example.moviemanagement.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    // Abstract methods

    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
    Movie saveMovie(Movie movie);
    void deleteMovie(Long id);
}
