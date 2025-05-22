package com.example.moviemanagement.repository;

import com.example.moviemanagement.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
