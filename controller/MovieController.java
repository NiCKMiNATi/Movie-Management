package com.example.moviemanagement.controller;

import com.example.moviemanagement.model.Movie;
import com.example.moviemanagement.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private final MovieService movieService;

    @GetMapping
    public String listMovies(Model model){
        model.addAttribute("movies", movieService.getAllMovies());
        return "movies/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("movie", new Movie());
        return "movies/add";
    }

    @PostMapping("/add")
    public String addMovie(@ModelAttribute("movie") Movie movie){
        movieService.saveMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/edit/{id}")
    public String editMovie(@PathVariable("id") Long id, Model model){
        model.addAttribute("movie", movieService.getMovieById(id));
        return "movies/add";
    }

    @PostMapping("/edit")
    public String saveMovie(@PathVariable("id") Long id, Model model){
        Movie movie = movieService.getMovieById(id).orElseThrow(() -> new IllegalArgumentException("Invalid movie ID: " + id));;
        movieService.saveMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable("id") Long id){
        movieService.deleteMovie(id);
        return "redirect:/movies";
    }

}
