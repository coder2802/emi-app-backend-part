package com.choudhary.electronics.finance.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {

	@Id
	private Long id;
	private String name;
	
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "role")
	private Set<UserRole> role=new HashSet<UserRole>();
	
	public Role() {
		super();
	}


	

	public Role(long id, String name, Set<UserRole> role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}




	public Role(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public Set<UserRole> getRole() {
		return role;
	}




	public void setRole(Set<UserRole> role) {
		this.role = role;
	}
	
	
	
}
