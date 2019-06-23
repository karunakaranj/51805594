package com.app.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int accId;
	private String ifscCode;
	private String accType;
	private double accBalance;
	public Account() {
		super();
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", ifscCode=" + ifscCode + ", accType=" + accType + ", accBalance="
				+ accBalance + "]";
	}
	
	
	
}
