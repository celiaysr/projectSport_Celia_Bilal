package com.celiabilal.projectsport.repositories;

import com.celiabilal.projectsport.entities.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepositoryBean extends CrudRepository<Genre, Integer> {

}
