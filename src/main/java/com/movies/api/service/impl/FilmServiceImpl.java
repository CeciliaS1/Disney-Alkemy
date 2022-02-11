package com.movies.api.service.impl;

import com.movies.api.model.Film;
import com.movies.api.repository.FilmRepository;
import com.movies.api.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository repository;

    @Override
    public List<Film> findAll() {
        return repository.findAll();
    }

    @Override
    public Film update(Film film) {
        return repository.save(film);
    }
    @Override
    public Film save(Film film) {
        return repository.save(film);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Film> findById(Long id) {
        return repository.findById(id);
    }
}
