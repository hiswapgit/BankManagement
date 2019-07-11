package com.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.entity.User;
import com.Bank.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;
	
public User getOne(Long id){
	
	
		return userRepository.getOne(id);
		
		}

	
}
