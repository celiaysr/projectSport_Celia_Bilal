package com.celiabilal.projectsport.repositories;

import com.celiabilal.projectsport.entities.Pathology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologyRepositoryBean extends CrudRepository<Pathology, Integer> {

}
