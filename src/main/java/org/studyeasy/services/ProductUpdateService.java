package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.ProductUpdated;
import org.studyeasy.repository.ProductUpdatedRepository;


@Service
public class ProductUpdateService {
	
	@Autowired
	private ProductUpdatedRepository repo;
	
	@Autowired
	private UpdatedCategoryService ser;

	public List<ProductUpdated> getProducts() 
	{
		 List<ProductUpdated> list = new ArrayList<>();
			
		 for(ProductUpdated product: repo.findAll())
		 {
			 list.add(product);
		 }
		
		 	return list;
	}

	public ProductUpdated getProduct(int id) {
		
		return repo.findById(id).get();
	}

	public void addProduct(ProductUpdated listElement) {
		
		System.out.println("*********** In Product Updated Service *************");
		ser.setcategoryIfnotPresent(listElement);
		repo.save(listElement);
		
	}

	public void updateProduct(ProductUpdated listElement) {
		
		repo.save(listElement);
	}

	public void deleteProduct(int id) {
		repo.deleteById(id);
		
	}


	

}
