package com.choudhary.electronics.finance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Guarantor;
import com.choudhary.electronics.finance.repository.GuarantorRepository;
import com.choudhary.electronics.finance.service.GuarantorService;

@Service
public class GuarantorServiceImpl  implements GuarantorService{

	@Autowired
	private GuarantorRepository guarantorRepository;
	
	
	@Override
	public Guarantor addGuarantor(Guarantor guarantor) {
		// TODO Auto-generated method stub
		return this.guarantorRepository.save(guarantor);
	}


	@Override
	public List<Guarantor> getAllGurantor() {
		
		return this.guarantorRepository.findAll();
	}

	
}
