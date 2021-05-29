package org.studyeasy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.services.ProductUpdateService;
import org.studyeasy.entity.ProductUpdated;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductUpdatedController {
	
	@Autowired
	ProductUpdateService service;
	
	
	@RequestMapping("/api2/products2")
	public List<ProductUpdated> getProducts()
	{
		return service.getProducts();
	}
	
	@RequestMapping("/api2/products2/{id}")
	public ProductUpdated getProduct(@PathVariable int id)
	{
		ProductUpdated p= service.getProduct(id); //Using get it will convert from optional to Customer type
		System.out.println("sending Single prod");
		System.out.println(p);
		return p;
	}
	
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, value = "/api2/products3")
	public void addProduct( @RequestBody ProductUpdated listElement)
	{
		service.addProduct(listElement);
	}
	
	

	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void updateProduct( @RequestBody ProductUpdated listElement)
	{
		service.updateProduct(listElement);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		service.deleteProduct(id);
		
	}

	
}
