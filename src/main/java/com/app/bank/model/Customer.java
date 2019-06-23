package com.app.bank.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custId;
	private String custName;
	private String custMobile;
	private String Gender;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="addrId")
	private List<Address> addr;
	
	public Customer() {
		super();
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	public String getGender() {
		return Gender;
	}
	public List<Address> getAddr() {
		return addr;
	}
	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custMobile=" + custMobile + ", Gender="
				+ Gender + ", addr=" + addr + "]";
	}
	
	


}
