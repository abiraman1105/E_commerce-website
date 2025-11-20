package com.arjun.Arjun.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arjun.Arjun.models.product;
import com.arjun.Arjun.repositories.productRepository;

@Service
public class productService {
	@Autowired  
	
	private productRepository productRepository;
	
	public List<product> getAllproducts(){
		return productRepository.findAll(); 
	}

}
