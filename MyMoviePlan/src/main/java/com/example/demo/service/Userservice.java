package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
@Service
public interface Userservice {
User saveUser(User user);

}
