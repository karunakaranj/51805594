package com.app.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addrId;
	private String apartmentName;
	private int buildNo;
	private String streetName;
	private String addrpicode;
	private String city;
	private String state;
	public Address() {
		super();
	}
	public Long getAddrId() {
		return addrId;
	}
	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public int getBuildNo() {
		return buildNo;
	}
	public void setBuildNo(int buildNo) {
		this.buildNo = buildNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getAddrpicode() {
		return addrpicode;
	}
	public void setAddrpicode(String addrpicode) {
		this.addrpicode = addrpicode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", apartmentName=" + apartmentName + ", buildNo=" + buildNo
				+ ", streetName=" + streetName + ", addrpicode=" + addrpicode + ", city=" + city + ", state=" + state
				+ "]";
	}
	
	
	
}
