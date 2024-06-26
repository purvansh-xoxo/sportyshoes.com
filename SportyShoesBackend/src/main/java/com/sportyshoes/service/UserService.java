package com.sportyshoes.service;

import com.sportyshoes.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
    List<User> searchUsersByName(String name);
}
