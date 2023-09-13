package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Theatare;
import com.example.demo.model.User;
import com.example.demo.service.Userservice;
@RequestMapping("/api/User")
@RestController
@CrossOrigin (origins="http://localhost:4200")
public class Usercontroller {
public Usercontroller(Userservice userservice) {
		super();
		this.userservice = userservice;
	}

public Userservice userservice;
@PostMapping
public ResponseEntity<User> SaveUser(@RequestBody User user)
{
	return new ResponseEntity<User>(userservice.saveUser(user),HttpStatus.CREATED);
}
}
