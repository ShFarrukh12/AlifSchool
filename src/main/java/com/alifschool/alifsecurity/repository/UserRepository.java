package com.alifschool.alifsecurity.repository;

import com.alifschool.alifsecurity.entities.SealUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SealUser, Long> {
	Optional<SealUser> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);
}
