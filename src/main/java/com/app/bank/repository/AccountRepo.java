package com.app.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.bank.model.Account;
@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{
	/*
	 * UPDATE Customers SET ContactName='Juan' WHERE Country='Mexico';
	 */
	/*
	 * @Query(value="update Account ac set accBalance:accBal where accId=id") public
	 * Account debit(@Param("accBal")double accBal,@Param("id")Long id);
	 * 
	 * @Query(value="update Account ac set accBalance:accBal where accId=id") public
	 * Account creadit(@Param("accBal")double accBal,@Param("id")Long id);
	 */
}
