package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class AcctivitidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcctivitidemoApplication.class, args);
	}

}
