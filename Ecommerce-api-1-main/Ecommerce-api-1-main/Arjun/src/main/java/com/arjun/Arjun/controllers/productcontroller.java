package com.arjun.Arjun.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arjun.Arjun.models.product;
import com.arjun.Arjun.services.productService;

@RestController
@RequestMapping("/products")

public class productcontroller {
	
	@Autowired
	private productService productService;
	
	@GetMapping
	
	public List<product> getAllproducts(){
		
		return productService.getAllproducts();
		 
		 
	}
@GetMapping("/category")
	
	public List<Map<String,Object>> getcategoryproducts(){
		return Arrays.asList(
			Map.of("name","product 1","price",234),
			Map.of("name","product 2","price",123)
		  	
		
			);
	}
	

}
