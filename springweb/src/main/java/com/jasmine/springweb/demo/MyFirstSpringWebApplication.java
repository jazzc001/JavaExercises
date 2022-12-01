package com.jasmine.springweb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jasmine.springweb")
public class MyFirstSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringWebApplication.class, args);
	}

}
