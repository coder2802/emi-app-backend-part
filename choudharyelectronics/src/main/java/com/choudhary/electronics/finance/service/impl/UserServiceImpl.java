package com.choudhary.electronics.finance.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.User;
import com.choudhary.electronics.finance.model.UserRole;
import com.choudhary.electronics.finance.repository.RoleRepository;
import com.choudhary.electronics.finance.repository.UserRepository;
import com.choudhary.electronics.finance.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
	
		User local=this.userRepository.findByUsername(user.getUsername());
		
		if(local!=null)
		{
			System.out.println("user is alredy present");
			throw new Exception("User Already Present!!");
		}
		else
		{
			//create User
			for(UserRole ur:userRoles)
			{
				roleRepository.save(ur.getRole());
			}
			
			user.getRole().addAll(userRoles);
			local=this.userRepository.save(user);
			
			
		}
		
		return local;
	}


	@Override
	public User getUser(String username) {
		
		return userRepository.findByUsername(username);
		
		
		
	}

}
