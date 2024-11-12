package com.example.martha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MarthaApplication {
	
	
	@GetMapping("/message")
	public String message(){
		return "Welcome to my Demo";
		
	}
	

	public static void main(String[] args) {
		SpringApplication.run(MarthaApplication.class, args);
	}

}
