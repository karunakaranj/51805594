package com.app.bank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bank.model.Customer;
import com.app.bank.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService; 

	// Create Customer Details
	@PostMapping("/saveCust")
	public ResponseEntity<?> saveUser(@RequestBody Customer customer){
		Customer cust=customerService.saveCust(customer);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}

	// get Customer Details By Id 

	@GetMapping("/getId/{custId}")
	public ResponseEntity<?> getCustById(@PathVariable Long custId){
		Customer cust=customerService.getcustById(custId);
		if(cust!=null) {
			return new ResponseEntity<Customer>(cust,HttpStatus.OK);

		}
		return new ResponseEntity<String>("Customer Details Not Found ",HttpStatus.NOT_FOUND);
	}
}
