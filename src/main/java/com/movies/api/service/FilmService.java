package com.movies.api.service;

import com.movies.api.model.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    public List <Film>  findAll ();

    public Film update( Film film);

    public Film save( Film film);

    public void  delete (Long id);

    public Optional<Film> findById(Long id);

}
