package com.jasmine.springboot.book.client;

import com.jasmine.springboot.book.presentation.BookPresentation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = "com.jasmine")
public class SpringbootApplication {

	public static void main(String[] args) {

		ApplicationContext springContainer = SpringApplication.run(SpringbootApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		BookPresentation bookPresentation = (BookPresentation) springContainer.getBean("presentation");

		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			bookPresentation.perforMenu(choice);
		}
	}

}
