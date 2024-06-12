package com.aj.SmartConnectPro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.SmartConnectPro.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

    //custom query methods
    //custom finder methods
    //extra methods db related propertrie

    Optional<User> findByEmail(String email);
}
