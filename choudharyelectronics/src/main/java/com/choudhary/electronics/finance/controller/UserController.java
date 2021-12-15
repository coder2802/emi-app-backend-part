package com.choudhary.electronics.finance.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choudhary.electronics.finance.model.Role;
import com.choudhary.electronics.finance.model.User;
import com.choudhary.electronics.finance.model.UserRole;
import com.choudhary.electronics.finance.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception
	{
		Set<UserRole> userRoleSet=new HashSet<UserRole>();
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		Role role=new Role();
		role.setId(45L);
		role.setName("Normal");
		
		UserRole userRole=new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		return this.userService.createUser(user, userRoleSet);
		
		
		
		
		
	}
	
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username )
	{
		return this.userService.getUser(username);
	}
	
	
}
