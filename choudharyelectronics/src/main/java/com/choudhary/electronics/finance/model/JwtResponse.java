package com.choudhary.electronics.finance.model;

public class JwtResponse {

	private String token;

	public JwtResponse(String token) {
		
		this.token = token;
	}

	public JwtResponse() {
		super();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
