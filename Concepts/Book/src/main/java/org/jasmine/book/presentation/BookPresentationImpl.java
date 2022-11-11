package org.jasmine.book.presentation;

import org.jasmine.book.entity.Book;
import org.jasmine.book.service.BookService;

import java.util.Collection;
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
                Collection<Book> books = bookService.getAllBooks();
                for(Book element: books) {
                    System.out.println(element);
                }
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
                Book book = new Book();
                System.out.println("Create a new book record");
                System.out.println("Enter bookId");
                book.setBookId(scanner.nextInt());
                System.out.println("Enter bookName");
                book.setBookName(scanner.next());
                System.out.println("Enter author name");
                book.setAuthorName(scanner.next());
                System.out.println("Enter no of copy");
                book.setNoOfCopies(scanner.nextInt());

                if(bookService.addBook(book)){
                    System.out.println("Book recorded added");
                } else {
                    System.out.println("Book with id"  + book.getBookId()+ "already exist, cannot add it as a new book");
                }
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
