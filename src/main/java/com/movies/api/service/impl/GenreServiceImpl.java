package com.movies.api.service.impl;

import com.movies.api.model.Genre;
import com.movies.api.repository.GenreRepository;
import com.movies.api.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class GenreServiceImpl implements GenreService {
    @Autowired
    private GenreRepository repository;

    @Override
    public List<Genre> findAll() {
        return repository.findAll();
    }

    @Override
    public Genre update(Genre genre) {
        return repository.save(genre);
    }

    @Override
    public Genre save(Genre genre) {
        return repository.save(genre);
    }

    @Override
    public void delete(Long id) {repository.deleteById(id);

    }

    @Override
    public Optional<Genre> findById(Long id) {
        return repository.findById(id);
    }
}
