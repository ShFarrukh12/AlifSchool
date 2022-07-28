package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.MathOne.MathOneAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathOneAnswerRepository extends JpaRepository<MathOneAnswer, Long> {

}
