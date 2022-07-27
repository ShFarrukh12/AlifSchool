package com.alifschool.alifmain.controller;

import com.alifschool.alifmain.entity.MathOne.MathOneAnswer;
import com.alifschool.alifmain.entity.MathOne.MathTaskOneSumEntity;
import com.alifschool.alifmain.repository.MathOneAnswerRepository;
import com.alifschool.alifmain.repository.MathTaskOneSumRepository;
import com.alifschool.alifmain.service.MathTaskOneSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/math/mathsum")
public class MathTaskOneSumController {

    public MathTaskOneSumService mathTaskOneSumService;
    public MathTaskOneSumRepository mathTaskOneSumRepository;
    public MathTaskOneSumEntity mathTaskOneSumEntity;
    public MathOneAnswerRepository mathOneAnswerRepository;
    public MathOneAnswer mathOneAnswer = new MathOneAnswer();
    private int level;
    public ArrayList art = new ArrayList<>();

    @Autowired
    public MathTaskOneSumController(MathTaskOneSumService mathTaskOneSumService, MathTaskOneSumRepository mathTaskOneSumRepository,
                                    MathOneAnswerRepository mathOneAnswerRepository) {
        this.mathTaskOneSumService = mathTaskOneSumService;
        this.mathTaskOneSumRepository = mathTaskOneSumRepository;
        this.mathOneAnswerRepository = mathOneAnswerRepository;
    }

    int a;

    public int number_1;
    public int number_2;

    @GetMapping("/getnumber")
    public List<Integer> getNumbers() {
        int a = 0;
        int b = 10;
        int random1 = a + (int) (Math.random() * b);
        int random2 = a + (int) (Math.random() * b);
        art.add(random1);
        art.add(random2);
        return art;
    }

    @PostMapping("/saveAnswer")
    public int saveAnswer(@RequestBody MathOneAnswer mathOneAnswer) {
        mathOneAnswerRepository.save(mathOneAnswer);
        if (this.getNumbers().get(0) + this.getNumbers().get(1)== mathOneAnswer.getInteger()) {
            level++;
        }
        return level;
    }

}
