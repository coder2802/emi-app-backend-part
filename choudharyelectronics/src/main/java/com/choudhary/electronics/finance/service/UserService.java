package com.choudhary.electronics.finance.service;

import java.util.Set;

import com.choudhary.electronics.finance.model.User;
import com.choudhary.electronics.finance.model.UserRole;

public interface UserService {

	public User createUser(User user , Set<UserRole> role) throws Exception;
	
	public User getUser(String username);
}
