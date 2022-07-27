package com.alifschool.alifmain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "inform")
public class Inform {
    @Id
    @Column(name = "name", nullable = false)
    private String name;
}
