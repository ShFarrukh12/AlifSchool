package com.alifschool.alifmain.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "UNDER_TASKS_FOR_INFORM")
@ToString
public class UnderTasksForInform {

    @Id
    private Long id;

    @Column(name = "NAME_UNTASKS_FOR_INFORM", nullable = false)
    private String name;
}
