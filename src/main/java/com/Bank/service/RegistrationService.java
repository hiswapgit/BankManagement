package com.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.entity.Account;
import com.Bank.entity.User;
import com.Bank.repository.AccountRepository;
import com.Bank.repository.UserRepository;


@Service
public class RegistrationService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired 
	AccountRepository accountrepository;
	
	/**
	 * This method is used create user by using save method of jpa repository
	 * also add account object with randam account_no 
	 *
	 */
	public void addUser(User user){
		
	
		User userdb=userRepository.save(user);
		
		Long acc_no=(long) Math.abs(Math.random()*1000000);
			
		
		Account account=new Account();
		
		account.setAccNO(acc_no);
		
		account.setBalence((long) 100000);
		account.setUserid(userdb);
		
		accountrepository.save(account);
		
	}

	public Boolean existsById(Long id){
		return userRepository.existsById(id);
	}
	
	
	
}
