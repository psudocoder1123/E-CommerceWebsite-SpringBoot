package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.CheckOut;

@Repository
public interface CheckOutRepository extends CrudRepository<CheckOut, Integer>{

}
