package com.jasmine.bookspringweb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.jasmine.bookspringweb")
@EntityScan(basePackages = "com.jasmine.bookspringweb.entity")
@EnableJpaRepositories(basePackages = "com.jasmine.bookspringweb.model.persistence")
public class BookspringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookspringwebApplication.class, args);
	}

}
