package org.jasmine.book.client;

import org.jasmine.book.entity.Book;
import org.jasmine.book.presentation.BookPresentation;
import org.jasmine.book.presentation.BookPresentationImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class BookClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(BookConfiguration.class);


        BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("presentation");

        while(true) {
            bookPresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice = scanner.nextInt();
            bookPresentation.perforMenu(choice);
        }
    }


}
