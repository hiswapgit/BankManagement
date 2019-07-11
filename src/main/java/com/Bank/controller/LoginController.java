package com.Bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	

	/**
	 * This method is used to check valid user
	 * @Requestparam used to get username and password from user
	 * return sucess if user matches username and password
	 *
	 */
	@Autowired
	TranscationService transcationservice;
	@PostMapping("/validate")
	public ResponseEntity<String> validateUser(@RequestParam String username,@RequestParam String password)
	{
	
	
		if(loginservice.check(username, password))
		{
			return new ResponseEntity<>("Sucessfully Register",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>("Fail try again",HttpStatus.NOT_FOUND);
		}
		
	}


}
