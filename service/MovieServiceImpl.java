package com.example.moviemanagement.service;

import com.example.moviemanagement.model.Movie;
import com.example.moviemanagement.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private final MovieRepository movieRepo;


    public MovieServiceImpl(MovieRepository movieRepo){
        this.movieRepo = movieRepo;
    }

    @Override
    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(Long id){
        return movieRepo.findById(id);
    }

    @Override
    public Movie saveMovie(Movie movie){
        return movieRepo.save(movie);
    }

    @Override
    public void deleteMovie(Long id){
        movieRepo.deleteById(id);
    }

}
