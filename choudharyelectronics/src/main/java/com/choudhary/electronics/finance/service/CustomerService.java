package com.choudhary.electronics.finance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Address;
import com.choudhary.electronics.finance.model.Customer;

@Service
public interface CustomerService {

	
	public Customer addCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();

	public List<Customer> getAllCityCustomer(Address address , String city);

	public String findByFirstname(String firstname);
	
}
