package com.example.AlifSchool.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MainUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToMany
    @Column(name = "TypeLessons", nullable = false)
    @JoinTable(name = "Typelesson",
            joinColumns = @JoinColumn(name = "typelesson_id"),
            inverseJoinColumns = @JoinColumn(name = "mainuser_id"))
    List<TypeLessons> typeLessonsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TypeLessons> getTypeLessonsList() {
        return typeLessonsList;
    }

    public void setTypeLessonsList(List<TypeLessons> typeLessonsList) {
        this.typeLessonsList = typeLessonsList;
    }
}
