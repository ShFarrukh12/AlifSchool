package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.AlifSchoolMathEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlifschoolMathRepository extends JpaRepository<AlifSchoolMathEntity, Long> {
}
