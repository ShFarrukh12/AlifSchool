package com.example.AlifSchool.pojo;

import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private List<String> rolles;

    public JwtResponse(String token, Long id, String username, String email, List<String> rolles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.rolles = rolles;
    }
}
