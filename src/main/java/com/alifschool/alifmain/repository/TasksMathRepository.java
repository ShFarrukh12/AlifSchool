package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.TasksMathEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface TasksMathRepository extends JpaRepository<TasksMathEntity, Long> {
}
