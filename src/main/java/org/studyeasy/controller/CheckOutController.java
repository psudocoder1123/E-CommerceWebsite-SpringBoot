package org.studyeasy.controller;


import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.services.CheckOutService;
import org.studyeasy.entity.CheckOut;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CheckOutController {
	
	@Autowired
	CheckOutService service;
	
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@RequestMapping("/api3/checkout")
	public List<CheckOut> getProducts(Principal principal)
	{
		System.out.println("*****Spring Boot get All products*****");
		
		List<CheckOut> l = new ArrayList<CheckOut>();
		
		String username= principal.getName();
	
		List<CheckOut> l1 = new ArrayList<CheckOut>();
		l= service.getProducts();
		//Iterate over list
		
		
		
		for(CheckOut co: l)
		{	
			if( co.getUsername().equals(username) )
			{
				l1.add(co);
				System.out.println(co);
			}
		}
		return l1;
	}
	
	
	//Get order for selected User
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")  
	@RequestMapping(method = RequestMethod.POST, value = "/api3/checkout")
	public void addCheckOutProduct( @RequestBody CheckOut listElement)
	{
		
		System.out.println("***************In Check OutController*********************** ");
		service.addProduct(listElement);
	}
	
	//get all orders for admin
	
//	@PreAuthorize("hasRole('ADMIN')")
//	@RequestMapping("/api3/checkoutadmin")
//	public List<CheckOut> getAllProductsForAdmin()
//	{
//		System.out.println("*****Spring Boot get All products*****");
//		return service.getProducts();
//	}
	
	
	
	
	
	

}
