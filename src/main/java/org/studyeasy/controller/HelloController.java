package org.studyeasy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.entity.ResponseBody;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api4")
public class HelloController {

	
	@RequestMapping(method = RequestMethod.POST, value = "/products4")
	public ResponseBody addProductHello( @RequestBody String listElement)
	{
		System.out.println(listElement);
		
		 
		
		return new ResponseBody(new String("Sucess"));
		
	}
	
	
}
