package com.choudhary.electronics.finance.model;

import java.util.Date;

public class EmiTrack {
	
	private Long id;
	
	private Date date;
	
	private Double amount;

	
	
	public EmiTrack() {
		super();
	}



	public EmiTrack(Date date, Double amount) {
		super();
		
		this.date = date;
		this.amount = amount;
	}



	


	


	public EmiTrack(Long id, Date date, Double amount) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Double getAmount() {
		return amount;
	}



	public void setAmount(Double amount) {
		this.amount = amount;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	

}
