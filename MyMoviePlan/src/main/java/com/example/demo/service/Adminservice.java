package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
@Service
public interface Adminservice {
Admin saveadmin(Admin admin);
void deleteadmin(int adminid);

}
