package com.alifschool.alifmain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "TASKS_INFORM")
@ToString
public class TasksForInform {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME_OF_TASKS_INFORM")
    private String nameOfTasks;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<UnderTasksForInform> underTasksForInform;
}
