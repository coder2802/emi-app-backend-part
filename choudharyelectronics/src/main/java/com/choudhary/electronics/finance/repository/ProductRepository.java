package com.choudhary.electronics.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choudhary.electronics.finance.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
