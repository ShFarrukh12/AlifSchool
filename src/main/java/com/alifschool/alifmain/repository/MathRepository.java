package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.AlifSchoolMathEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathRepository extends JpaRepository<AlifSchoolMathEntity, Long> {

}
