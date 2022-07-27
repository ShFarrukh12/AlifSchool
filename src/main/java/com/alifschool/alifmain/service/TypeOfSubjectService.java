package com.alifschool.alifmain.service;

import com.alifschool.alifmain.entity.TypeOfSubjectEntity;
import com.alifschool.alifmain.repository.TypeOfSubjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TypeOfSubjectService {

    private TypeOfSubjectRepository typeOfSubjectRepository;

    @Autowired
    public TypeOfSubjectService(TypeOfSubjectRepository typeOfSubjectRepository) {
        this.typeOfSubjectRepository = typeOfSubjectRepository;
    }

    public TypeOfSubjectEntity saveTypeOfSubject(TypeOfSubjectEntity typeOfSubjectEntity) {
        if (typeOfSubjectEntity == null) {
            throw new RuntimeException("typeOfSubject must be not null");
        }
        log.info("Save Details", typeOfSubjectEntity.toString());
        return typeOfSubjectRepository.save(typeOfSubjectEntity);
    }

}
