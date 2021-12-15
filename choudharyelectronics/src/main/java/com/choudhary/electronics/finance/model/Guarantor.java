package com.choudhary.electronics.finance.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Guarantor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String contact;
	
	@OneToOne(mappedBy="guarantor" , cascade = CascadeType.ALL)
	@JsonIgnore
	private Sales sales;
	
	public Guarantor() {
		super();
	}
	
	
	public Guarantor(Long id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	

	public Guarantor(Long id, String name, String contact, Sales sales) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.sales = sales;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Sales getSales() {
		return sales;
	}


	public void setSales(Sales sales) {
		this.sales = sales;
	}
	
	
}
