package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Seat;

public interface SeatDao extends JpaRepository<Seat,Integer> {

}
