package com.alifschool.alifmain.service;

import com.alifschool.alifmain.entity.MathOne.MathTaskOneSumEntity;
import com.alifschool.alifmain.repository.MathTaskOneSumRepository;
import org.springframework.stereotype.Service;

@Service
public class MathTaskOneSumService {

    public MathTaskOneSumRepository mathTaskOneSumRepository;

    public MathTaskOneSumService(MathTaskOneSumRepository mathTaskOneSumRepository) {
        this.mathTaskOneSumRepository = mathTaskOneSumRepository;
    }

    public MathTaskOneSumEntity newLevel(MathTaskOneSumEntity mathTaskOneSumEntity){
        return mathTaskOneSumRepository.save(mathTaskOneSumEntity);
    }

}
