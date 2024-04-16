package com.celiabilal.projectsport.services;

import com.celiabilal.projectsport.entities.Pathology;
import com.celiabilal.projectsport.repositories.PathologyRepositoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PathologyService {

    private final PathologyRepositoryBean pathologyRepository;

    @Autowired
    public PathologyService(PathologyRepositoryBean pathologyRepository) {
        this.pathologyRepository = pathologyRepository;
    }

    public Iterable<Pathology> getAllPathology() {
        return pathologyRepository.findAll();
    }

    public Pathology getPathologyById(Integer id) {
        return pathologyRepository.findById(id).orElse(null);
    }

    public Pathology savePathology(Pathology pathology) {
        return pathologyRepository.save(pathology);
    }

    public void deletePathology(Integer id) {
        pathologyRepository.deleteById(id);
    }

}
