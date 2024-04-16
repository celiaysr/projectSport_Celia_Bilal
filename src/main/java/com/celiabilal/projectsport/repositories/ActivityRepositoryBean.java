package com.celiabilal.projectsport.repositories;

import com.celiabilal.projectsport.entities.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepositoryBean extends CrudRepository<Activity, Integer> {
}
