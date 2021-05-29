package org.studyeasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.CategoryUpdated;
import org.studyeasy.entity.Product;

@Repository
public interface CategoryUpdatedRepository extends JpaRepository<CategoryUpdated, String>{
	
	
}
