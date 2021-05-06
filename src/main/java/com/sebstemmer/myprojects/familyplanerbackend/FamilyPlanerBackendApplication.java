package com.sebstemmer.myprojects.familyplanerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication public class FamilyPlanerBackendApplication {

	@RequestMapping("/")
	public String home() {
		return "Was geht Omar?";
	}

	public static void main(String[] args) {
		SpringApplication.run(FamilyPlanerBackendApplication.class, args);
	}

}
