package com.alifschool.alifmain.controller;

import com.alifschool.alifmain.entity.AlifSchoolMathEntity;
import com.alifschool.alifmain.repository.AlifschoolMathRepository;
import com.alifschool.alifmain.repository.TasksMathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/math")
public class AlifSchoolMathController {
    private AlifschoolMathRepository alifschoolMathRepository;
    private TasksMathRepository tasksMathRepository;

    @Autowired
    public AlifSchoolMathController(AlifschoolMathRepository alifschoolMathRepository, TasksMathRepository tasksMathRepository) {
        this.alifschoolMathRepository = alifschoolMathRepository;
        this.tasksMathRepository = tasksMathRepository;
    }


    @GetMapping("/getAll")
    public List<AlifSchoolMathEntity> getAll() {
        return alifschoolMathRepository.findAll();
    }

    @PostMapping("/saveMath")
    public AlifSchoolMathEntity saveAlifMath(@RequestBody AlifSchoolMathEntity alifSchoolMathEntity){
        return alifschoolMathRepository.save(alifSchoolMathEntity);
    }
}
