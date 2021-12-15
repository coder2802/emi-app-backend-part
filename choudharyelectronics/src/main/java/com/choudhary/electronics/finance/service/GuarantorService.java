package com.choudhary.electronics.finance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.choudhary.electronics.finance.model.Guarantor;

@Service
public interface GuarantorService {

public 	Guarantor addGuarantor(Guarantor guarantor);

public List<Guarantor> getAllGurantor();

}
