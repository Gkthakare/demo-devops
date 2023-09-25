package com.example.demodevops;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class DemoDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevopsApplication.class, args);
	}
@GetMapping("/hello")
public String sayhello()
{
	return "hello CICD...";
}
}
