package com.alifschool.alifmain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "TASKS_MATH_ENTITY")
public class TasksMathEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String nameTasks;

}
