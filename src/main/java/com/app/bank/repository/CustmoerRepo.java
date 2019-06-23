package com.app.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.model.Customer;
@Repository
public interface CustmoerRepo extends JpaRepository<Customer, Long>{

}
