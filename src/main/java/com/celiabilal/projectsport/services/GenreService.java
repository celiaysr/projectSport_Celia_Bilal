package com.celiabilal.projectsport.services;

import com.celiabilal.projectsport.entities.Genre;
import com.celiabilal.projectsport.repositories.GenreRepositoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {

    @Autowired
    private final GenreRepositoryBean genreRepository;

    public GenreService(GenreRepositoryBean genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Iterable<Genre> getAllGenre() {
        return genreRepository.findAll();
    }

    public Genre getGenreById(Integer id) {
        return genreRepository.findById(id).orElse(null);
    }

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public void deleteGenre(Integer id) {
        genreRepository.deleteById(id);
    }
}
