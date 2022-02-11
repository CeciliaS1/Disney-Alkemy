package com.movies.api.service;

import com.movies.api.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> findAll ();

    public User update( User user);

    public User save( User user);

    public void  delete (Long id);

    public Optional<User> findById(Long id);
}
