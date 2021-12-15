package com.choudhary.electronics.finance.controller;

import java.util.Date;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choudhary.electronics.finance.model.EmiTrack;
import com.choudhary.electronics.finance.model.Sales;
import com.choudhary.electronics.finance.model.SalesData;
import com.choudhary.electronics.finance.model.SalesItems;
import com.choudhary.electronics.finance.service.SalesService;

@RestController
@RequestMapping("/sales")
@CrossOrigin("*")
public class SalesController {

	@Autowired 
	private SalesService salesService;
	
	@PostMapping("/")
	public void addSales(@RequestBody SalesData salesData)
	{
		
		Map<Date, Boolean> map = new HashMap<Date, Boolean>();
		
		 Calendar cal = Calendar.getInstance();
		 
		 
		Sales sales1=salesData.getSales();
		salesData.getSales().getItems().forEach(item->
		{
			int i;
		
			for( i=0;i<item.getEmicount() ; i++)
			{
				cal.setTime(item.getFirstemidate());
			    cal.add(Calendar.MONTH, i);
			    map.put((Date) cal.getTime(), false);
			}
			
			item.setNextemidate(item.getFirstemidate());
			item.setMap(map);
			item.setPaidemicount(0);
			item.setUnpaidemicount(item.getEmicount());
		});
		
		salesData.sales.getItems().forEach(item->
		{
			
			
			item.setSales(sales1);
			
			
			//invoiceItem.setInvoice(invoice);
			
			//invoiceItem.setProduct(item.getProduct());
			
		//	itemset.add(invoiceItem);
			
		});
		
		
		
		 this.salesService.addSales(salesData.sales);
	}
	
	
	//get all sales
	@GetMapping("/")
	public List<Sales> getAllSales()
	{
		List<Sales> allSales= this.salesService.getAllSales();
		
		allSales=allSales.stream().sorted(Comparator.comparingLong(Sales::getInvoiceno).reversed()).collect(Collectors.toList());
		
		return allSales;
	}
	
	
	@GetMapping("/{id}")
	public List<Sales> getSalesOfCustomer(@PathVariable("id") Long id)
	{
		return this.salesService.getSalesByCustomer(id);
	}
	
	

	
}
