package com.example.demo.controller;

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
import com.example.demo.service.Adminservice;
@RequestMapping("/api/Admin")
@RestController
@CrossOrigin (origins="http://localhost:4200")
public class Admincontroller {
public Admincontroller(Adminservice adminservice) {
		super();
		this.adminservice = adminservice;
	}
public Adminservice adminservice;
@PostMapping
public ResponseEntity<Admin> SaveAdmin(@RequestBody Admin admin)
{
	return new ResponseEntity<Admin>(adminservice.saveadmin(admin),HttpStatus.CREATED);
}
}
