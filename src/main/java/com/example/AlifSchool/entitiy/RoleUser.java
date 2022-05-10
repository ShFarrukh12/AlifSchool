package com.example.AlifSchool.entitiy;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name", length = 20)
    private AllRoles name;

    public RoleUser(AllRoles name) {
        this.name = name;
    }
}
