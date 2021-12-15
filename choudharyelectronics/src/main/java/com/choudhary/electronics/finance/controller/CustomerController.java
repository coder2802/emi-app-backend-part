package com.choudhary.electronics.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choudhary.electronics.finance.model.Customer;
import com.choudhary.electronics.finance.model.CustomerData;
import com.choudhary.electronics.finance.service.CustomerService;
import com.choudhary.electronics.finance.model.Address;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/")
	public ResponseEntity<?> addCustomer(@RequestBody CustomerData customerData)
	{
		
		Customer customer=customerData.getCustomer();
		Address address=customerData.getAddress();
		
		customer.setAddress(address);
		
		return ResponseEntity.ok(this.customerService.addCustomer(customer));
		
		
		
	}
	
	//get all customer
	@GetMapping("/")
	public List<Customer> getAllCustomer()
	{
		return this.customerService.getAllCustomer();
	}

	
	//get all customer of city
	@GetMapping("/address/{city}")
	public List<Customer> getAllCityCustomer(@PathVariable ("city") String city)
	{
		Address address=new Address();
		address.setCity(city);
		
		return this.customerService.getAllCityCustomer(address , city);
	}
	
	
	//get customer firstname
	@GetMapping("/{name}")
	public String checkCustomerFirstname(@PathVariable ("name") String firstname)
	{
		System.out.println(firstname);
		return this.customerService.findByFirstname(firstname);
	}
}
