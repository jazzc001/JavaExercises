package com.jasmine.springboot.book.persistence;

import com.jasmine.springboot.book.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("BookId");
        String name = rs.getString("BookName");
        String authorName = rs.getString("AuthorName");
        int copies = rs.getInt("NoOfCopies");
        LocalDate dop = rs.getDate("DateOfPublising").toLocalDate();

        Book book = new Book(id, name, authorName, copies, dop);
        return book;
    }
}
