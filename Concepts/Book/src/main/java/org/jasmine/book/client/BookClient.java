package org.jasmine.book.client;

import org.jasmine.book.presentation.BookPresentation;
import org.jasmine.book.presentation.BookPresentationImpl;

import java.util.Scanner;

public class BookClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookPresentation bookPresentation = new BookPresentationImpl();

        while(true) {
            bookPresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice = scanner.nextInt();
            bookPresentation.perforMenu(choice);
        }
    }


}
