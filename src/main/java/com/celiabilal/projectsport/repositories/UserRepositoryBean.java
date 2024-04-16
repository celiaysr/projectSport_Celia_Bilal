package com.celiabilal.projectsport.repositories;

import com.celiabilal.projectsport.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryBean extends CrudRepository<User, Integer> {

}
