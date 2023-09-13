package com.example.demo.serviceimpl;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Dao.TheatareDao;
import com.example.demo.model.Theatare;
import com.example.demo.service.TeathereService;
@Service

public class Theatareservcimpl implements TeathereService{
    public Theatareservcimpl(TheatareDao theatredao) {
		super();
		this.theatredao = theatredao;
	}

	public TheatareDao theatredao;
	@Override
	public Theatare saveTheatare(Theatare theatare) {
		
		return theatredao.save(theatare);
	}

	@Override
	public List<Theatare> getalltheatare() {
	
		return theatredao.findAll();
	}

}
