package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.Dao.Admindao;

import com.example.demo.model.Admin;
import com.example.demo.service.Adminservice;
@Service
public class Adminservimp implements Adminservice{
public Adminservimp(Admindao admdao) {
		super();
		this.admdao = admdao;
	}
public Admindao admdao;
	@Override
	public Admin saveadmin(Admin admin) {
		return admdao.save(admin);
	}
	@Override
	public void deleteadmin(int adminid) {
		admdao.findById(adminid);
		admdao.deleteById(adminid);
	}
	
	
		
	
	}


