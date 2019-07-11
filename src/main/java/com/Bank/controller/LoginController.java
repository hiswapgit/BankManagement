package com.Bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.entity.User;
import com.Bank.service.AccountService;
import com.Bank.service.LoginService;
import com.Bank.service.TranscationService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService loginservice;
	
	@Autowired 
	AccountService accountservice;
	
	@Autowired
	TranscationService transcationservice;
	@PostMapping("/validate")
	public ResponseEntity<String> validateUser(@RequestBody User user)
	{
	
	
		 String username=user.getUserName(); 
		 String password=user.getPassword();
		 
		
		Long id=user.getId();
		
		User user1=loginservice.getOne(id);
		
		if(username.equals(user1.getUserName())&&password.equals(user1.getPassword()))
		{
			
			
			
			
			return new ResponseEntity<>("Sucessfully Register",HttpStatus.OK);
			
			
		}
		
		
		else
		{
			return new ResponseEntity<>("Fail try again",HttpStatus.NOT_FOUND);
		}
		
	}


}
