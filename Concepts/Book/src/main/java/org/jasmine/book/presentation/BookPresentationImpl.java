package org.jasmine.book.presentation;

import org.jasmine.book.entity.Book;
import org.jasmine.book.service.BookService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
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
        System.out.println("4. Delete a book");
        System.out.println("5. Exit");
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
                System.out.println("Enter date of publising (dd-Mon-yyy)");
                DateTimeFormatter df = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("d-MMM-yyyy")).toFormatter();
                book.setDateOfPublishing(LocalDate.parse(scanner.next(), df));

                if(bookService.addBook(book)){
                    System.out.println("Book recorded added");
                } else {
                    System.out.println("Book with id"  + book.getBookId()+ "already exist, cannot add it as a new book");
                }
                break;
            case 4:
                System.out.println("please enter book id that you want to delete");
                int bookId = scanner.nextInt();
                if(bookService.deleteBook(bookId)){
                    System.out.println("Book with id " + bookId + " deleted. ");
                } else {
                    System.out.println("Book with id " + bookId + " does not exist. ");
                }
                break;

            case 5:
                System.out.println("Thanks for using Book Management System");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
                break;
        }



    }
}
