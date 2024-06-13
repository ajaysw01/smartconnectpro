package com.aj.SmartConnectPro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.SmartConnectPro.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    // extra methods db relatedoperations
    // custom query methods
    // custom finder methods

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

}