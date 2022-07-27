package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.AlifSchoolMathEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlifschoolMathRepository extends MongoRepository<AlifSchoolMathEntity, Long> {
}
