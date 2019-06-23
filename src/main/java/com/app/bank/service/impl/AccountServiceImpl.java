package com.app.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.model.Account;
import com.app.bank.repository.AccountRepo;
import com.app.bank.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;
	
	@Override
	public Account saveAcc(Account acc) {
		return accountRepo.save(acc);
	}

	@Override
	public Account getAccById(Long accId) {
		return accountRepo.findById(accId).get();
	}

	

}
