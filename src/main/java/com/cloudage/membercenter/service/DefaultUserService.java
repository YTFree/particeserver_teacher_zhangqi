package com.cloudage.membercenter.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudage.membercenter.entity.User;
import com.cloudage.membercenter.repository.IUserRepository;

@Component
@Service
@Transactional
public class DefaultUserService implements IUserService {

	@Autowired
	IUserRepository userRepo;
	

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}
	
	public User findByAccount(String account){
		return userRepo.finfUserByAccount(account);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findUserByEmail(email);
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return userRepo.findOne(id);
	}

}
