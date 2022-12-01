package com.jasmine.bookspringweb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jasmine.bookspringweb")
public class BookspringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookspringwebApplication.class, args);
	}

}
