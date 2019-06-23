package com.app.bank.service;

import com.app.bank.model.Customer;

public interface CustomerService {

	public Customer saveCust(Customer customer);
	
	public Customer getcustById(Long custId);
}
