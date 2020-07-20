package com.maheshwarayya.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to second Projects");
		System.out.println("This is Spring Boot Maven project");
		System.out.println("This is GitHub Based respository")
		SpringApplication.run(DemoApplication.class, args);
	}

}
