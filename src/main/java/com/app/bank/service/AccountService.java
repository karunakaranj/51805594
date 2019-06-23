package com.app.bank.service;

import org.springframework.data.repository.query.Param;

import com.app.bank.model.Account;

public interface AccountService {

	public Account saveAcc(Account acc);
	
	public Account getAccById(Long accId);
	
	
}
