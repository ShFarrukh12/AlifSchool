package com.alifschool.alifmain.service;

import com.alifschool.alifmain.entity.TasksMathEntity;
import com.alifschool.alifmain.repository.TasksMathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksMathService {

    private TasksMathRepository tasksMathRepository;

    @Autowired
    public TasksMathService(TasksMathRepository tasksMathRepository) {
        this.tasksMathRepository = tasksMathRepository;
    }

    public TasksMathEntity saveTasksMathEntity(TasksMathEntity tasksMathEntity){
        return tasksMathRepository.save(tasksMathEntity);
    }
}
