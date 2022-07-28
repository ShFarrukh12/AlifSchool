package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.MathOne.MathTaskOneSumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathTaskOneSumRepository extends JpaRepository<MathTaskOneSumEntity, Long> {
}
