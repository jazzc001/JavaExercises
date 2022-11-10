package org.jasmine.book.client;

import org.jasmine.book.persistence.BookDao;
import org.jasmine.book.persistence.BookDaoImpl;
import org.jasmine.book.presentation.BookPresentation;
import org.jasmine.book.presentation.BookPresentationImpl;
import org.jasmine.book.service.BookService;
import org.jasmine.book.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfiguration {



    @Bean(name="dao")
    public BookDao getBookDao() {
        return new BookDaoImpl();
    }

    @Bean(name = "service")
    public BookService getBookService() {
        return new BookServiceImpl(getBookDao());
    }

    @Bean(name="presentation")
    public BookPresentationImpl getBookPresentation() {
        BookPresentationImpl presentation = new BookPresentationImpl();
        presentation.setBookService(getBookService());
        return presentation;
    }

}
