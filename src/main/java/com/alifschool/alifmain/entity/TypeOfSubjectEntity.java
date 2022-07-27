package com.alifschool.alifmain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "TYPE_OF_SUBJECT")
@ToString
@AllArgsConstructor
public class TypeOfSubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_of_subject_name")
    private String name;
}
