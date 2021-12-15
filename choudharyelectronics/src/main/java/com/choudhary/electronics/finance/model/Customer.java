package com.choudhary.electronics.finance.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstname;
	private String lastname;
	private String email;
	private String contact;
	private Long accountno;
	private Long card;
	
	@OneToOne( cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private Address address;
	
	
	@OneToMany(mappedBy="customer" , fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Sales> sales=new LinkedHashSet<Sales>();

	public Customer() {
		super();
	}

	public Customer(Long id, String firstname, String lastname, String email, Long accountno, Long card,
			Address address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.accountno = accountno;
		this.card = card;
		this.address = address;
	}
	
	

	

	public Customer(Long id, String firstname, String lastname, String email, String contact, Long accountno, Long card,
			Address address, Set<Sales> sales) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contact = contact;
		this.accountno = accountno;
		this.card = card;
		this.address = address;
		this.sales = sales;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getAccountno() {
		return accountno;
	}

	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}

	public Long getCard() {
		return card;
	}

	public void setCard(Long card) {
		this.card = card;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Set<Sales> getSales() {
		return sales;
	}

	public void setSales(Set<Sales> sales) {
		this.sales = sales;
	}

	
	
	
}
