// UserService.java
package com.example.userservice.service;

import com.example.userservice.model.User;

public interface UserService {
    User registerUser(User user);
    User loginUser(String username, String password);
    User getUserById(Long userId);
}
