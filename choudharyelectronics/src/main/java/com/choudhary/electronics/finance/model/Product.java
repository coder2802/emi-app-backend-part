package com.choudhary.electronics.finance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique=true)
	private String name;
	private int hsn;
	private double mrp;
	private double rate;
	private double purchaseprice;
	private double cgst;
	private double sgst;
	private boolean active;
	
	
	
	public Product() {
		super();
	}

	public Product(Long id, String name, int hsn, double mrp, double rate, double purchaseprice, double cgst,
			double sgst, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.hsn = hsn;
		this.mrp = mrp;
		this.rate = rate;
		this.purchaseprice = purchaseprice;
		this.cgst = cgst;
		this.sgst = sgst;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHsn() {
		return hsn;
	}

	public void setHsn(int hsn) {
		this.hsn = hsn;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPurchaseprice() {
		return purchaseprice;
	}

	public void setPurchaseprice(double purchaseprice) {
		this.purchaseprice = purchaseprice;
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	

}
