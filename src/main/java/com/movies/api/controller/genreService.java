package com.movies.api.controller;

import com.movies.api.model.Genre;
import com.movies.api.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class genreService {
    @Autowired
    private GenreService genreService;
    @PostMapping
    public Genre save(@RequestBody Genre genre){
        return genreService.save(genre);

    }

}
