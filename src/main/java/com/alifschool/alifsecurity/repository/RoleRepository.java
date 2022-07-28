package com.alifschool.alifsecurity.repository;

import com.alifschool.alifsecurity.entities.AllRolles;
import com.alifschool.alifsecurity.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(AllRolles name);
}
