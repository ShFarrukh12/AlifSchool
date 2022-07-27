package com.alifschool.alifmain.controller;

import com.alifschool.alifmain.entity.TypeOfSubjectEntity;
import com.alifschool.alifmain.repository.TypeOfSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeofsubject")
public class TypeOfSubjectController {

    private TypeOfSubjectRepository typeOfSubjectRepository;

    @Autowired
    public TypeOfSubjectController(TypeOfSubjectRepository typeOfSubjectRepository) {
        this.typeOfSubjectRepository = typeOfSubjectRepository;
    }

    @PostMapping("/addtypeofsubject")
    private String addTypeOfSubject(@RequestBody TypeOfSubjectEntity typeOfSubjectEntity){
        typeOfSubjectRepository.save(typeOfSubjectEntity);
        return "TypeOfSubject Add";
    }

    @GetMapping("/all")
    private List<TypeOfSubjectEntity> getAll(){
        return typeOfSubjectRepository.findAll();
    }
}
