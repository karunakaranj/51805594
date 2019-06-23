package com.app.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.model.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Long>{

}
