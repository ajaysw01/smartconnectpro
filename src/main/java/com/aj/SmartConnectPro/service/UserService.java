package com.aj.SmartConnectPro.service;

import com.aj.SmartConnectPro.entities.User;
import com.aj.SmartConnectPro.forms.UserForm;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(UserForm userForm);
    
    Optional<User> getUserById(String id);
    Optional<User> updateUser(User user);
    void deleteUser(String id);
    boolean isUserExist(String userId);
    boolean isUserExistByEmail(String email);
    List<User> getAllUsers();
}
