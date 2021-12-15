package com.choudhary.electronics.finance.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choudhary.electronics.finance.model.Customer;
import com.choudhary.electronics.finance.model.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {

	 public List<Sales> findByCustomer(Customer customer);

}
