package com.example.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitSampleAppApplication {

	public static void main(String[] args) 
	{
		System.out.println("Application started");
		SpringApplication.run(GitSampleAppApplication.class, args);
		
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMessage()
	{
		return new ResponseEntity<String>("Welcome to GUTHUB CICD pipeline !!!!!!",HttpStatus.OK);
	}

}
