package com.example.AlifSchool.entitiy;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "MATH")
public class MathEntiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "SUBJECT")
    public String subject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
