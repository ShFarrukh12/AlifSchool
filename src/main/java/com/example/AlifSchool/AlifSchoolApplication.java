package com.example.AlifSchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.example")
public class AlifSchoolApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlifSchoolApplication.class, args);
	}
}
