package com.movies.api.controller;

import com.movies.api.model.Film;
import com.movies.api.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @PostMapping
    public Film save(@RequestBody Film film){
        return filmService.save(film);
    }
}
