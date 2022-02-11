package com.movies.api.service.impl;

import com.movies.api.model.User;
import com.movies.api.repository.UserRepository;
import com.movies.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User update(User user) {
        return repository.save(user);

    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
}
