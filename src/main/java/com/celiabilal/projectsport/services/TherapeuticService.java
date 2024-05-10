package com.celiabilal.projectsport.services;

import com.celiabilal.projectsport.entities.Therapeutic;
import com.celiabilal.projectsport.repositories.TherapeuticRepositoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TherapeuticService {
    private final TherapeuticRepositoryBean therapeuticRepository;

    @Autowired
    public TherapeuticService(TherapeuticRepositoryBean therapeuticRepository) {
        this.therapeuticRepository = therapeuticRepository;
    }

    public Iterable<Therapeutic> getAllTherapeutic() {
        return therapeuticRepository.findAll();
    }

    public Therapeutic getTherapeuticById(Integer id) {
        return therapeuticRepository.findById(id).orElse(null);
    }

    public Therapeutic saveTherapeutic(Therapeutic therapeutic) {
        return therapeuticRepository.save(therapeutic);
    }

    public void deleteTherapeutic(Integer id) {
        therapeuticRepository.deleteById(id);
    }
}
