package com.choudhary.electronics.finance.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.choudhary.electronics.finance.model.Authority;
import com.choudhary.electronics.finance.model.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="user")
public class User implements UserDetails{

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private String contact;
	private boolean active;
	
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER , mappedBy="user")
	@JsonIgnore
	private Set<UserRole> role=new HashSet<>();
	
	
	
	public User(long id, String firstname, String lastname, String username, String password, String email,
			String contact, boolean active) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.active = active;
		
	}



	public User(long id, String username, String password, String email, String contact, boolean active,
			Set<UserRole> role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.active = active;
		this.role = role;
	}

	
	


	public User(long id, String firstname, String lastname, String username, String password, String email,
			String contact, boolean active, Set<UserRole> role) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.active = active;
		this.role = role;
	}



	public User() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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



	



	


	public Set<UserRole> getRole() {
		return role;
	}



	public void setRole(Set<UserRole> role) {
		this.role = role;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
Set<Authority> set=new HashSet<>();
		
		this.role.forEach(role->{
			set.add(new Authority(role.getRole().getName()));
		});
		return set;

	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
}
