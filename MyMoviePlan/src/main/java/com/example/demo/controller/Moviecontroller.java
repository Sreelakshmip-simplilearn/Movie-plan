package com.example.demo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Admin;
import com.example.demo.model.Movie;
import com.example.demo.service.Adminservice;
import com.example.demo.service.MovieService;
@RequestMapping("/api/Movie")
@RestController
@CrossOrigin (origins="http://localhost:4200")
public class Moviecontroller {
public Moviecontroller(MovieService movieservice) {
		super();
		this.movieservice = movieservice;
	}

public MovieService movieservice;
@PostMapping
public ResponseEntity<Movie> SaveMovie(@RequestBody Movie movie)
{
	return new ResponseEntity<Movie>(movieservice.Savemovie(movie),HttpStatus.CREATED);
}
@GetMapping
public List<Movie> getallmovies()
{
	return movieservice.getallmovie();
}
}
