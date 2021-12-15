package com.choudhary.electronics.finance.service;

import java.util.List;

import org.apache.tomcat.jni.Address;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {

	
	public List<Address> getAllAddress();
}
