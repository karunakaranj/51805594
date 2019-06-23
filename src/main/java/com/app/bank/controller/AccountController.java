package com.app.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bank.model.Account;
import com.app.bank.service.AccountService;

@RestController
@RequestMapping("/Account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@PostMapping("/saveAcc")
	public ResponseEntity<?> saveAcc(Account acc){
	Account ac=accountService.saveAcc(acc);
	if(ac.getAccBalance()<500) {
		
		return new ResponseEntity<String>("sorry You Should maintain minimum balance of 500",HttpStatus.NOT_ACCEPTABLE);
	}
		return new ResponseEntity<Account>(ac,HttpStatus.OK);
	}
	
}
