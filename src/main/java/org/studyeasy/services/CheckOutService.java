package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.CheckOut;
import org.studyeasy.repository.CheckOutRepository;


@Service
public class CheckOutService {
	
	@Autowired
	private CheckOutRepository repo;

	public List<CheckOut> getProducts() 
	{
		 List<CheckOut> list = new ArrayList<>();
			
		 for(CheckOut product: repo.findAll())
		 {
			 list.add(product);
		 }
		
		 	return list;
	}

	public CheckOut getProduct(int id) {
		
		return repo.findById(id).get();
	}

	public void addProduct(CheckOut listElement) 
	{
		
		System.out.println("In chechout service Post");
		
		repo.save(listElement);
		
	}

	public void deleteProduct(int id) {
		repo.deleteById(id);
		
	}


	

}
