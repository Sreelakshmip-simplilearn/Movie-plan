package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Theatare;
@Service
public interface TeathereService {
Theatare saveTheatare(Theatare theatare);
List<Theatare> getalltheatare();
}
