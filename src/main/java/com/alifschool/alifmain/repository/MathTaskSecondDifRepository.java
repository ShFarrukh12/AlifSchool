package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.MathTaskSecondDifEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathTaskSecondDifRepository extends JpaRepository<MathTaskSecondDifEntity, Long> {
}
