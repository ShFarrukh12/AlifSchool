package com.example.AlifSchool.services;

import com.example.AlifSchool.entitiy.RoleUser;
import com.example.AlifSchool.entitiy.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    RoleUser saveRole(RoleUser role);
    void addRoleToUser(String username, String rolename);
    User getUser(String username);
    List<User> getUsers();
}
