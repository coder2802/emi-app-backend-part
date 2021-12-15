package com.choudhary.electronics.finance.model;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {

	private String authority;
	
	
	
	
	public Authority(String name) {
		this.authority=name;
	}




	public void setAuthority(String authority) {
		this.authority = authority;
	}




	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}

	
}
