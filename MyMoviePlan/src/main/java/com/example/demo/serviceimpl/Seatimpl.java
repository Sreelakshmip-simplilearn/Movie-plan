package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dao.SeatDao;
import com.example.demo.model.Seat;
import com.example.demo.service.SeatService;
@Service
public class Seatimpl implements SeatService {
public Seatimpl(SeatDao seatdao) {
		super();
		this.seatdao = seatdao;
	}

public SeatDao seatdao;
	@Override
	public Seat saveseat(Seat seat) {
		
		return seatdao.save(seat);
	}

	@Override
	public List<Seat> getallseats() {
		
		return seatdao.findAll();

	}

}
