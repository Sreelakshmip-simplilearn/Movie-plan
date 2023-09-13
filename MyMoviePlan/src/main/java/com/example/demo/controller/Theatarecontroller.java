package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.model.Theatare;
import com.example.demo.service.TeathereService;

@RequestMapping("/api/Theatare")
@RestController
@CrossOrigin (origins="http://localhost:4200")
public class Theatarecontroller {
	public Theatarecontroller(TeathereService theatareservice) {
		super();
		this.theatareservice = theatareservice;
	}

	public TeathereService theatareservice;
	@PostMapping
	public ResponseEntity<Theatare> SaveTheatare(@RequestBody Theatare theatare)
	{
		return new ResponseEntity<Theatare>(theatareservice.saveTheatare(theatare),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Theatare> getallTheatare()
	{
		return theatareservice.getalltheatare();
	}
}
