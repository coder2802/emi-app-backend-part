package com.choudhary.electronics.finance.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choudhary.electronics.finance.model.SalesItems;

public interface SalesItemsRepository extends JpaRepository<SalesItems, Long> {

	List<SalesItems> findBynextemidate(Date date);

	
}
