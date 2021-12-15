package com.choudhary.electronics.finance.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Customer;
import com.choudhary.electronics.finance.model.Sales;
import com.choudhary.electronics.finance.model.SalesItems;
import com.choudhary.electronics.finance.repository.SalesRepository;
import com.choudhary.electronics.finance.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesRepository salesRepository;
	
	
	@Override
	public Sales addSales(Sales sales) {
		
		return this.salesRepository.save(sales);
	}


	@Override
	public List<Sales> getAllSales() {
		
		return this.salesRepository.findAll();
	}


	@Override
	public List<Sales> getSalesByCustomer(Long id) {
		
		Customer customer=new Customer();
		customer.setId(id);
		
		return this.salesRepository.findByCustomer(customer);
	}


	

	

}
