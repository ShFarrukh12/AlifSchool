package com.example.AlifSchool.repositories;

import com.example.AlifSchool.entitiy.AllRoles;
import com.example.AlifSchool.entitiy.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleUser, Long> {
    RoleUser findByName(AllRoles rolename);
}
