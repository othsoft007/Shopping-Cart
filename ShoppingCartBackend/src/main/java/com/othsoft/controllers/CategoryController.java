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
import com.othsoft.dao.CategoryRepository;
import com.othsoft.model.Category;

@RequestMapping("/caterogies")
@RestController
public class CategoryController {
	
	
	@Autowired
	private CategoryRepository catagories; 
	 

	
	@GetMapping(value= "", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Category>> getAllCategories(){
		
		 List<Category> catagoriesResponse = new ArrayList<>();
		 catagories.findAll().forEach(e -> catagoriesResponse.add(e));
		 return new ResponseEntity<List<Category>>(catagoriesResponse, HttpStatus.OK);
		
	}
}
