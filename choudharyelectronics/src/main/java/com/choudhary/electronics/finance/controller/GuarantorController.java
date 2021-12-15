package com.choudhary.electronics.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choudhary.electronics.finance.model.Guarantor;
import com.choudhary.electronics.finance.service.GuarantorService;

@RestController
@RequestMapping("/guarantor")
@CrossOrigin("*")
public class GuarantorController {
	
	@Autowired
	private GuarantorService guarantorService;
	
	@PostMapping("/")
	public ResponseEntity<?> addGuarantor(@RequestBody Guarantor guarantor)
	{
		return ResponseEntity.ok(this.guarantorService.addGuarantor(guarantor));
		
	}

	
	@GetMapping("/")
	public List<Guarantor> getAllGuarantor()
	{
		
		return this.guarantorService.getAllGurantor();
		
	}
}
