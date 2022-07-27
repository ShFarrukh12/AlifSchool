package com.alifschool.alifmain.entity.MathOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "MATH_TASK_SUM")
public class MathTaskOneSumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "level")
    private int level;
}
