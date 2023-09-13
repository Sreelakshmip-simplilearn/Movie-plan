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
import com.example.demo.model.Seat;
import com.example.demo.service.SeatService;

@RequestMapping("/api/Seat")
@RestController
@CrossOrigin (origins="http://localhost:4200")
public class Seatcontroller {
public Seatcontroller(SeatService seatservice) {
		super();
		this.seatservice = seatservice;
	}

public SeatService seatservice;
@PostMapping
public ResponseEntity<Seat> SaveSeat(@RequestBody Seat seat)
{
	return new ResponseEntity<Seat>(seatservice.saveseat(seat),HttpStatus.CREATED);
}
@GetMapping
public List<Seat> getallmovies()
{
	return seatservice.getallseats();
}
}
