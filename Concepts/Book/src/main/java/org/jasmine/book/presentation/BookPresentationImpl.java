package org.jasmine.book.presentation;

import org.jasmine.book.entity.Book;
import org.jasmine.book.service.BookService;

import java.util.Scanner;

public class BookPresentationImpl implements BookPresentation{
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void showMenu() {
        System.out.println("===========================");
        System.out.println("Employee Management System");
        System.out.println("1. List All Books");
        System.out.println("2. Search Book By ID");
        System.out.println("3. Add New Book");
        System.out.println("4. Exit");
        System.out.println("============================");
    }

    @Override
    public void perforMenu(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch(choice) {
            case 1:
                System.out.println("under development");
                break;
            case 2:
                System.out.println("Enter book ID");
                int id = scanner.nextInt();
                Book searchedBook = bookService.searchBookById(id);
                if(searchedBook !=null) {
                    System.out.println(searchedBook);
                } else {
                    System.out.println("Book with id" + id + "does not exit");
                }
                break;
            case 3:
                System.out.println("under development");
                break;
            case 4:
                System.out.println("Thanks for using Book Management System");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
                break;
        }



    }
}
