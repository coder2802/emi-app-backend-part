package com.choudhary.electronics.finance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Product;

@Service
public interface ProductService {

	//add product
		public Product addProduct(Product product);
		
		//get all product
		public List<Product> getAllProduct();
		
		
		//change product status
		public void changeStatus(Long Id , String active);

		
	
	
}
