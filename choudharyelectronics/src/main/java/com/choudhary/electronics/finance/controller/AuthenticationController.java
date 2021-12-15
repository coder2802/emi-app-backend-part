package com.choudhary.electronics.finance.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.choudhary.electronics.finance.config.JwtUtil;
import com.choudhary.electronics.finance.model.JwtRequest;
import com.choudhary.electronics.finance.model.JwtResponse;
import com.choudhary.electronics.finance.model.User;
import com.choudhary.electronics.finance.service.impl.UserDetailsServiceImpl;

@RestController
@CrossOrigin("*")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired 
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
		
		
		//generate Token
		@PostMapping("/generate-token")
		public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception
		{
			
			
		try
			{
				this.authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
				System.out.println("kkmmmmmnnn");
			
				
			}
	catch(UsernameNotFoundException e)
			{
				e.printStackTrace();
				throw new Exception("User Not Found");
		}
		
			
			//Authenticated
			
			UserDetails userDetails=this.userDetailsServiceImpl.loadUserByUsername(jwtRequest.getUsername());
			
			System.out.println("here");
			System.out.println(userDetails.getUsername());
			String token=this.jwtUtil.generateToken(userDetails);
			System.out.println("generated");
			return ResponseEntity.ok(new JwtResponse(token));
		}
		
		
		private void authenticate(String username , String password) throws Exception
		{
		
		
		
		
		try
		{
			System.out.println("here1");
			System.out.println(username);
			System.out.println(password);
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			
			System.out.println("here6");
			
		}
		catch(DisabledException e)
		{
			throw new Exception("UserDisabled" + e.getMessage());
			
			
		}
		catch(BadCredentialsException e)
		{
			throw new Exception("Invalid Credentials" + e.getMessage());
		}
	}
		
		
		
		//get details of current login user
		@GetMapping("/current-user")
		public User getCurrentUser(Principal principal)
		{
			return ((User)this.userDetailsServiceImpl.loadUserByUsername(principal.getName()));
		}
		
		
}
