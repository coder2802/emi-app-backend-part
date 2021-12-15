package com.choudhary.electronics.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choudhary.electronics.finance.model.Product;
import com.choudhary.electronics.finance.service.ProductService;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")

public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public Product addProduct(@RequestBody Product product)
	{
		product.setSgst(product.getCgst());
		product.setActive(true);
		return this.productService.addProduct(product);
	}
	
	
	@GetMapping("/")
	public List<Product> getAllProduct()
	{
		return this.productService.getAllProduct();
	}
	
	
	@PutMapping("/{id}/{active}")
	public void changeStatus(@PathVariable("id") Long id , @PathVariable("active") String active)
	{
		
		System.out.println(active);
		
		this.productService.changeStatus(id, active);
		
		
		
	}
	
	

}
