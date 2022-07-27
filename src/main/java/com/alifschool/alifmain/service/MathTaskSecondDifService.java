package com.alifschool.alifmain.service;

import com.alifschool.alifmain.entity.MathTaskSecondDifEntity;
import com.alifschool.alifmain.repository.MathTaskSecondDifRepository;
import org.springframework.stereotype.Service;

@Service
public class MathTaskSecondDifService {

    public MathTaskSecondDifRepository mathTaskSecondDifRepository;

    public MathTaskSecondDifService(MathTaskSecondDifRepository mathTaskSecondDifRepository) {
        this.mathTaskSecondDifRepository = mathTaskSecondDifRepository;
    }

    public MathTaskSecondDifEntity newLevel(MathTaskSecondDifEntity mathTaskSecondDifEntity){
        return mathTaskSecondDifRepository.save(mathTaskSecondDifEntity);
    }

}
