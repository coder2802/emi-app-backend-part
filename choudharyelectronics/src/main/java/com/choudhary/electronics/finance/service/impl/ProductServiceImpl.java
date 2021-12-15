package com.choudhary.electronics.finance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Product;
import com.choudhary.electronics.finance.repository.ProductRepository;
import com.choudhary.electronics.finance.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		
		return this.productRepository.save(product);
		
	}

	@Override
	public List<Product> getAllProduct() {
		
		return this.productRepository.findAll();
	}

	@Override
	public void changeStatus(Long Id, String active) {
		
		System.out.println(active);
		Product p=productRepository.findById(Id).get();
		if(active.equalsIgnoreCase("true"))
			p.setActive(true);
		else
			p.setActive(false);
		
		
		if(p.isActive())
			System.out.println("status true");
		else
			System.out.println("status false");
		
		
		productRepository.save(p);
		
	}


	
	
	
}
