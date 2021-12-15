package com.choudhary.electronics.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choudhary.electronics.finance.model.Guarantor;

public interface GuarantorRepository extends JpaRepository<Guarantor, Long> {

}
