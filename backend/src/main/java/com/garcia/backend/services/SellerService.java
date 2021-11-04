package com.garcia.backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.garcia.backend.dto.SellerDTO;
import com.garcia.backend.entities.Seller;
import com.garcia.backend.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll(){
		List<Seller> result = sellerRepository.findAll();
		
		return result
				.stream()
				.map(x -> SellerDTO.create(x))
				.collect(Collectors.toList());		
	}
	
	
}

