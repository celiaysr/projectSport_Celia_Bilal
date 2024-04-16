package com.celiabilal.projectsport.repositories;

import com.celiabilal.projectsport.entities.Discipline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplineRepositoryBean extends CrudRepository<Discipline, Integer> {
}
