package com.movies.api.service;

import java.util.List;
import java.util.Optional;

public interface CharacterService {

    public List<Character> findAll();

    public Character save(Character character);

    public Character update(Character character);

    public void delete (Long id);

    public Optional<Character> findById(Long id);


}
