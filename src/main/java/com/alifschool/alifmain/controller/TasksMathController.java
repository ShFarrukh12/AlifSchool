package com.alifschool.alifmain.controller;

import com.alifschool.alifmain.entity.TasksMathEntity;
import com.alifschool.alifmain.repository.TasksMathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/math")
public class TasksMathController {

    public TasksMathRepository tasksMathRepository;


    @Autowired
    public TasksMathController(TasksMathRepository tasksMathRepository) {
        this.tasksMathRepository = tasksMathRepository;
    }

    @PostMapping("/savetasksmath")
    public TasksMathEntity saveTasksMath(@RequestBody TasksMathEntity tasksMathEntity){
        return tasksMathRepository.save(tasksMathEntity);
    }

    @GetMapping("get/all/tasksname")
    public List<TasksMathEntity> getAllTasksMath(){
        return tasksMathRepository.findAll();
    }
}
