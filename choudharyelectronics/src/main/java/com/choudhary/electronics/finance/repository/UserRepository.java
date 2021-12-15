package com.choudhary.electronics.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choudhary.electronics.finance.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
