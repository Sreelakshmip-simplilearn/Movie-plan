package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
@Service
public interface MovieService {
Movie Savemovie(Movie movie);
List<Movie> getallmovie();
}
