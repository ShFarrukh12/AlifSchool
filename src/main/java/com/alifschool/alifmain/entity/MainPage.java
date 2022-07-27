package com.alifschool.alifmain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "MAIN_PAGE")
public class MainPage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @OneToMany
    @JoinTable(name = "main_page_type_of_subject_id",
            joinColumns = @JoinColumn(name = "type_of_subject_id"),
            inverseJoinColumns = @JoinColumn(name = "main_page_id"))
    private Set<TypeOfSubjectEntity> typeOfSubjectEntity;

}
