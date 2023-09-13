package com.example.demo.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.MovieDao;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
@Service
public class Movieservimpl implements MovieService{
public Movieservimpl(MovieDao movdao) {
		super();
		this.movdao = movdao;
	}

public MovieDao movdao;
	@Override
	public Movie Savemovie(Movie movie) {
		return movdao.save(movie);
	}

	@Override
	public List<Movie> getallmovie() {
		
		return movdao.findAll();
	}

}
