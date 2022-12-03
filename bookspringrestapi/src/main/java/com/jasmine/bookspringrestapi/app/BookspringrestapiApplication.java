package com.jasmine.bookspringrestapi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.jasmine.bookspringrestapi")
@EntityScan(basePackages = "com.jasmine.bookspringrestapi.entity")
@EnableJpaRepositories(basePackages = "com.jasmine.bookspringrestapi.persistence")
public class BookspringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookspringrestapiApplication.class, args);
	}

}
