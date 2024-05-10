package com.celiabilal.projectsport.services;

import com.celiabilal.projectsport.entities.Discipline;
import com.celiabilal.projectsport.repositories.DisciplineRepositoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplineService {
    @Autowired
    private final DisciplineRepositoryBean disciplineRepository;

    public DisciplineService(DisciplineRepositoryBean disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    public Iterable<Discipline> getAllDiscipline() {
        return disciplineRepository.findAll();
    }

    public Discipline getDisciplineById(Integer id) {
        return disciplineRepository.findById(id).orElse(null);
    }

    public Discipline saveDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);
    }

    public void deleteDiscipline(Integer id) {
        disciplineRepository.deleteById(id);
    }
}
