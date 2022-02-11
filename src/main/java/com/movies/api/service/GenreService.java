package com.movies.api.service;

import com.movies.api.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {
    public List <Genre> findAll();

    public Genre update (Genre genre);

    public Genre save( Genre genre);

    public void delete(Long id);

    public Optional<Genre> findById(Long id);

}
