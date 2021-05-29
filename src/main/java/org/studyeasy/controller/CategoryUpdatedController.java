package org.studyeasy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.services.UpdatedCategoryService;
import org.studyeasy.entity.CategoryUpdated;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api1")
@RestController
public class CategoryUpdatedController {
	
	@Autowired
	UpdatedCategoryService service;
	
	//@PreAuthorize("hasRole('USER')")
	
	
	@RequestMapping("/categories")
	public List<CategoryUpdated> getProducts()
	{
		return service.getCategories();
	}
	
	
}
