package com.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.entity.User;
import com.Bank.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;
	
	/**
	 * This method is used to check valid user
	 * take usename and password from cotroller and verify
	 * return sucess if user created
	 *
	 */
	
	public boolean check(String username,String password)
	{
		
		User userdb=userRepository.findUserNameAndPassword(username, password);
		if(userdb.getUserName().equals(username)&&userdb.getPassword().equals(password))
		{
			return true;
		}
		else 
			return false;
	}
	


	
}
