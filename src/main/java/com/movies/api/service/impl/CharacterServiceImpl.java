package com.movies.api.service.impl;

import com.movies.api.repository.CharacterRepository;
import com.movies.api.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CharacterServiceImpl implements CharacterService {
//primero importo y despues implemnto

    @Autowired
    private CharacterRepository repository;

    @Override
    public List<Character> findAll() {
        return repository.findAll();
    }

    @Override
    public Character save(Character character) {
        return repository.save(character);
    }

    @Override
    public Character update(Character character) {
        return repository.save(character); // es en minuscula porque es el NOMBRE del parametro, no el parametro en sí
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Character> findById(Long id) {
        return repository.findById(id);

    }
}
