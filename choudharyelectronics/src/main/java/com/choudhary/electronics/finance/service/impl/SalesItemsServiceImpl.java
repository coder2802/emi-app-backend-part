package com.choudhary.electronics.finance.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.SalesItems;
import com.choudhary.electronics.finance.repository.SalesItemsRepository;
import com.choudhary.electronics.finance.service.SalesItemsService;

@Service
public class SalesItemsServiceImpl  implements SalesItemsService{

	@Autowired
	private SalesItemsRepository salesItemsRepository;
	
	
	@Override
	public SalesItems getItemById(Long id) {
		
		return this.salesItemsRepository.findById(id).get();
	}


	@Override
	public void payItemEmi(SalesItems salesItem) {
		
		this.salesItemsRepository.save(salesItem);
		
	}


	@Override
	public List<SalesItems> getSaleOfMonth(Date date) {
		
		return this.salesItemsRepository.findBynextemidate(date);
	}

}
