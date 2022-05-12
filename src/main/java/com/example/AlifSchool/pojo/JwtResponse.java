package com.example.AlifSchool.pojo;

import com.example.AlifSchool.entitiy.RoleUser;
import lombok.Data;

import java.util.Set;

@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private Set<RoleUser> rolles;

    public JwtResponse(String token, Long id, String username, String email, Set<RoleUser> rolles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.rolles = rolles;
    }
}
