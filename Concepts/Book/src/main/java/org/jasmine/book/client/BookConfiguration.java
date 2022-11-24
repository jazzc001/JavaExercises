package org.jasmine.book.client;

import org.jasmine.book.persistence.BookDao;
import org.jasmine.book.persistence.BookDaoImpl;
import org.jasmine.book.presentation.BookPresentation;
import org.jasmine.book.presentation.BookPresentationImpl;
import org.jasmine.book.service.BookService;
import org.jasmine.book.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Driver;
import java.sql.DriverManager;

@Configuration
@ComponentScan(basePackages = "org.jasmine.book")
public class BookConfiguration {
    @Bean(name = "mySqlDataSource")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/Books");
        dataSource.setUsername("root");
        dataSource.setPassword("Drgfna9xt*");
        return dataSource;
    }

    @Bean
    public JdbcTemplate getTemplate() {
        return new JdbcTemplate(getDataSource());
    }



}
