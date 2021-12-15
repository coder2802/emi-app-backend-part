package com.choudhary.electronics.finance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choudhary.electronics.finance.model.Address;
import com.choudhary.electronics.finance.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
	List<Customer> findByAddress_City(String city);

	Customer findByFirstname(String firstname);

}
