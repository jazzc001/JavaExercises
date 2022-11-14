package org.jasmine.client;

import org.jasmine.presentation.StudentPresentation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        StudentPresentation studentPresentation = (StudentPresentation) springContainer.getBean("stdPresentation");
        while(true) {
            studentPresentation.showMenu();
            System.out.println("Enter Choice :");
            int choice = scanner.nextInt();
            studentPresentation.performMenu(choice);
        }
    }
}
