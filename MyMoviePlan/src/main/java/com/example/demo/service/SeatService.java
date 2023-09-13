package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Seat;

@Service
public interface SeatService {
Seat saveseat(Seat seat);
List<Seat> getallseats();
}
