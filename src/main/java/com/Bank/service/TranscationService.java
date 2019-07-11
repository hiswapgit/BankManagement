package com.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.repository.TranscationRepository;

@Service
public class TranscationService 
{
	@Autowired 
	TranscationRepository transcationrepository;

	
	
	
}
