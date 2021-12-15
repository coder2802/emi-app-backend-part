package com.choudhary.electronics.finance.model;

public class CustomerData {

	private Customer customer;
	private Address address;
	
	
	
	public CustomerData() {
		super();
	}



	public CustomerData(Customer customer, Address address) {
		super();
		this.customer = customer;
		this.address = address;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
