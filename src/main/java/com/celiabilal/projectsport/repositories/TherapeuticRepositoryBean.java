package com.celiabilal.projectsport.repositories;

import com.celiabilal.projectsport.entities.Therapeutic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapeuticRepositoryBean extends CrudRepository<Therapeutic, Integer> {

}