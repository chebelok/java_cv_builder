package com.example.java_cv_builder;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java_cv_builder.UserProfile;


import java.util.Optional;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
    Optional<UserProfile> findByUserName(String userName);
}
