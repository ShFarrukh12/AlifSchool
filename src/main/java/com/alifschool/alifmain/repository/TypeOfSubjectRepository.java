package com.alifschool.alifmain.repository;

import com.alifschool.alifmain.entity.TypeOfSubjectEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TypeOfSubjectRepository extends MongoRepository<TypeOfSubjectEntity, Long> {
}
