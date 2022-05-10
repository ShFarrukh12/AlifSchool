package com.example.AlifSchool.entitiy;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TYPELESSON")
public class TypeLessons {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "LESSONSNAME")
    public String name;
}
