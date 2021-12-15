package com.choudhary.electronics.finance.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.SalesItems;

@Service
public interface SalesItemsService {

	SalesItems getItemById(Long id);

	void payItemEmi(SalesItems salesItem);

	List<SalesItems> getSaleOfMonth(Date date);

}
