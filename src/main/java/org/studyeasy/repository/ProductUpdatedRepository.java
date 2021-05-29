package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.ProductUpdated;

@Repository
public interface ProductUpdatedRepository extends CrudRepository<ProductUpdated, Integer>{

}
