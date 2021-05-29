package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.studyeasy.entity.CategoryUpdated;
import org.studyeasy.entity.Product;
import org.studyeasy.entity.ProductUpdated;
import org.studyeasy.repository.CategoryUpdatedRepository;
import org.studyeasy.repository.ProductUpdatedRepository;


@Service
public class UpdatedCategoryService {

	
	@Autowired
	private CategoryUpdatedRepository repo;
	
	
	public void setcategoryIfnotPresent(ProductUpdated p) {
		
		
		System.out.println("  **********   In setCategory If not present Function    ****************");
		boolean b=false;
		 for(CategoryUpdated cu: repo.findAll())
		 {
			 if(cu.getCategory_name() == p.getCategory())
			 {
				 b=true;
			 }
		 }
		
		
		
		if(b) {
			
		}
		else
		{
			System.out.println(" ********** Adding Category   **********");
			CategoryUpdated cu = new CategoryUpdated();
			cu.setCategory_name(p.getCategory());
			 
			repo.save(cu);
		}
		
	}



	public List<CategoryUpdated> getCategories() {
		
		List<CategoryUpdated> list = new ArrayList<>();
		
		 for(CategoryUpdated c : repo.findAll())
		 {
			 list.add(c);
		 }
		
		 	return list;
	}
	

}
