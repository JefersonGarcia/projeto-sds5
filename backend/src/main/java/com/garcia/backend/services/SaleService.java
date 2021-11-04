package com.garcia.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.garcia.backend.dto.SaleDTO;
import com.garcia.backend.entities.Sale;
import com.garcia.backend.repositories.SaleRepository;
import com.garcia.backend.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable page){
		sellerRepository.findAll();
		Page<Sale> saleList = saleRepository.findAll(page);
		
		return saleList.map(sale -> SaleDTO.create(sale));
	}
	
}
