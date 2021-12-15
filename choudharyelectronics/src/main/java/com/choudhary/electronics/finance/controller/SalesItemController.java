package com.choudhary.electronics.finance.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choudhary.electronics.finance.model.EmiTrack;
import com.choudhary.electronics.finance.model.SalesItems;
import com.choudhary.electronics.finance.repository.SalesItemsRepository;
import com.choudhary.electronics.finance.service.SalesItemsService;

@RestController
@RequestMapping("/salesitem")
@CrossOrigin("*")
public class SalesItemController {
	
	@Autowired 
	SalesItemsService salesItemsService;
	
	
	@GetMapping("/{id}")
	public SalesItems getItemById(@PathVariable("id") Long id)
	{
		System.out.println("here");
		return this.salesItemsService.getItemById(id);
	}
	
	@PutMapping("/")
	public void payemi(@RequestBody EmiTrack emiTrack)
	{
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("in fun");
		SalesItems salesItem=salesItemsService.getItemById(emiTrack.getId());
		
		salesItem.getEmimap().put(emiTrack.getDate(), emiTrack.getAmount());
		
		salesItem.getMap().forEach((k, v) ->{
		
		    System.out.println((k + ":" + v));
		    if(k==salesItem.getNextemidate())
		    {
		    	v=true;
		    }
		    
		});
		
		
		//change next emi date
		cal.setTime(salesItem.getNextemidate());
	    cal.add(Calendar.MONTH, 1);
	    salesItem.setNextemidate((Date) cal.getTime());
	    
		
	
		
		
		salesItem.setPaidemicount(salesItem.getPaidemicount() + 1);
		salesItem.setUnpaidemicount(salesItem.getUnpaidemicount() - 1);
		
		System.out.println(salesItem.getPaidemicount());
		System.out.println(salesItem.getEmiamt());
		if(salesItem.getPaidemicount() == salesItem.getEmicount())
			salesItem.setStatus(true);
		
		this.salesItemsService.payItemEmi(salesItem);
	}

	
	
	
	
}
