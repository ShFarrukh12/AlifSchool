package com.alifschool.alifmain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surNamel;

}
