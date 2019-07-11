package com.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.entity.Account;
import com.Bank.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountrepository;
	
	public Account getAccount(Long userid)
	{
		return accountrepository.findByUserid(userid);
	}
	
	
}
