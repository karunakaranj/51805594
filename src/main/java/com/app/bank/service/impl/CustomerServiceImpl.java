package com.app.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.model.Customer;
import com.app.bank.repository.CustmoerRepo;
import com.app.bank.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustmoerRepo custmoerRepo;
	@Override
	public Customer saveCust(Customer customer) {
		return custmoerRepo.save(customer);
	}

	@Override
	public Customer getcustById(Long custId) {
		return custmoerRepo.findById(custId).get();
	}

}
