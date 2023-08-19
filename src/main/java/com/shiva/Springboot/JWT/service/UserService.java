package com.shiva.Springboot.JWT.service;

import com.shiva.Springboot.JWT.model.Role;
import com.shiva.Springboot.JWT.model.User;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addToUser(String username, String rolename);
}
