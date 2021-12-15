package com.choudhary.electronics.finance.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Sales;
import com.choudhary.electronics.finance.model.SalesItems;

@Service
public interface SalesService {

	public Sales addSales(Sales sales);

	public List<Sales> getAllSales();

	public List<Sales> getSalesByCustomer(Long id);

	

	
	
	
}
