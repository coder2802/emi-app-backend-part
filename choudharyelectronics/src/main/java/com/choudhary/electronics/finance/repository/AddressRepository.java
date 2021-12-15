package com.choudhary.electronics.finance.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.choudhary.electronics.finance.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
