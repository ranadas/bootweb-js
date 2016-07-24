package com.rdas.spring.repository;

import com.rdas.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rdas on 23/07/2016.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
