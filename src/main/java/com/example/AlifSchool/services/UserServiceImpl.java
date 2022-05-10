package com.example.AlifSchool.services;

import com.example.AlifSchool.entitiy.RoleUser;
import com.example.AlifSchool.entitiy.User;
import com.example.AlifSchool.repositories.RoleRepository;
import com.example.AlifSchool.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    private  final UserRepository userRepository;
    private  final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public RoleUser saveRole(RoleUser role) {
        log.info("Saving new role {} to the Database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {

    }

    @Override
    public User getUser(String username) {
        return null;
    }


    @Override
    public List<User> getUsers() {
        log.info("Fetching all users {}", getUsers());
        return userRepository.findAll();
    }
}
