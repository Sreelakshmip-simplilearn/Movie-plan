package com.example.demo.serviceimpl;
import org.springframework.stereotype.Service;
import com.example.demo.Dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.service.Userservice;
@Service
public class Userserviceimpl implements Userservice {
public Userserviceimpl(UserDao usrdao) {
		super();
		this.usrdao = usrdao;
	}
public UserDao usrdao;
	@Override
	public User saveUser(User user) {
		return usrdao.save(user);
	}

}
