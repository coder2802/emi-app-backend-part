package com.choudhary.electronics.finance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Address;
import com.choudhary.electronics.finance.model.Customer;
import com.choudhary.electronics.finance.repository.CustomerRepository;
import com.choudhary.electronics.finance.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		
		return this.customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return this.customerRepository.findAll();
	}

	@Override
	public List<Customer> getAllCityCustomer(Address address , String city) {
		
		return this.customerRepository.findByAddress_City(city);
	}

	@Override
	public String findByFirstname(String firstname) {
		
		Customer customer= this.customerRepository.findByFirstname(firstname);
		
		if(customer==null)
			return null;
			
		return customer.getFirstname();
	}

}
