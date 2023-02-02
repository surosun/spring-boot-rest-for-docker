package com.dockerised.practice.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerisedPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerisedPracticeApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Spring Boot Dockarisation Practice ......";
	}

}
