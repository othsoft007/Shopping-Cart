package com.othsoft.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import com.othsoft.dao.ProductRepository;
import com.othsoft.model.Product;

@RequestMapping("/products")
@RestController
public class ProductController {
	
	
	@Autowired
	private ProductRepository products; 
	 

	
	@GetMapping(value= "", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Product>> getAllCategories(){
		
		 List<Product> productsResponse = new ArrayList<>();
		 products.findAll().forEach(e -> productsResponse.add(e));
		 return new ResponseEntity<List<Product>>(productsResponse, HttpStatus.OK);
		
	}
}
