package com.choudhary.electronics.finance;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.choudhary.electronics.finance.model.Role;
import com.choudhary.electronics.finance.model.User;
import com.choudhary.electronics.finance.model.UserRole;
import com.choudhary.electronics.finance.service.UserService;


@SpringBootTest
class ChoudharyelectronicsApplicationTests {

	@Autowired
	private UserService userService;
	
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	void contextLoads() {
	}

	
//@Test
//	public void addUser() throws Exception
//	{
//		User u=new User();
////			
////		
//		u.setUsername("choudhary");
//		u.setEmail("choudhary@gmail.com");
//		u.setContact("9009207980");
////		
//		u.setPassword(encoder.encode("choudhary@123"));
////		
////		
//		Role role=new Role();
//		role.setId(48L);
//		role.setName("ADMIN");
////		
//		UserRole userRole=new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(u);
////		
//		Set<UserRole> userRoleSet=new HashSet<UserRole>();
////		
//		userRoleSet.add(userRole);
////		
//		this.userService.createUser(u, userRoleSet);
////		
////		
//////		
//////	
//	}
////	



}