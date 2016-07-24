package com.rdas.spring.service;

import com.rdas.spring.exception.UserAlreadyExistsException;
import com.rdas.spring.model.User;
import com.rdas.spring.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by rdas on 23/07/2016.
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    @Transactional
    public User save(@NotNull @Valid final User user) {
        log.debug("Creating {}", user);
        User existing = repository.findOne(user.getId());
        if (existing != null) {
            throw new UserAlreadyExistsException(String.format("There already exists a user with id=%s", user   .getId()));
        }
        return repository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getList() {
        log.debug("Retrieving the list of all users");
        return repository.findAll();
    }
}
