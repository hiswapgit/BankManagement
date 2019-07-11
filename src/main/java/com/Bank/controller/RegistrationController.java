package com.Bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.entity.User;
import com.Bank.service.RegistrationService;



@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;

	
	
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody User user){
		
		if(null!= user.getPassword() &&null !=user.getDob()&& null!= user.getUserName()&&null !=user.getMail()&& null!=user.getPhoneNo()&&null!=user.getGender())
		{
		
			registrationService.addUser(user);
			
			return new ResponseEntity<>("Sucessfully Register",HttpStatus.OK);
		
		
			
		}
		
		else
		{
	       return new ResponseEntity<>("try again",HttpStatus.OK);
		}
		
	}
}
