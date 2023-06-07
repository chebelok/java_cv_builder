package com.example.java_cv_builder;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java_cv_builder.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
