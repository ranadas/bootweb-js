package com.rdas.spring.service;

import com.rdas.spring.model.User;

import java.util.List;

/**
 * Created by rdas on 23/07/2016.
 */
public interface UserService {

    User save(User user);

    List<User> getList();
}
