package org.jasmine.book.client;

import org.jasmine.book.presentation.BookPresentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Scanner;

public class BookClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(BookConfiguration.class);

        ApplicationContext springContainer = new ClassPathXmlApplicationContext("BookConfiguration.xml");
//        ApplicationContext springContainer =
//                new FileSystemXmlApplicationContext("/Users/jasminecheung/NetBeansProjects/Concepts/Book/src/main/java/org/jasmine/book/client/BookConfiguration.xml");

        BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("presentation");

        while(true) {
            bookPresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice = scanner.nextInt();
            bookPresentation.perforMenu(choice);
        }
    }


}
