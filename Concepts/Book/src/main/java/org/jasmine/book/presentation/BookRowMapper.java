package org.jasmine.book.presentation;

import org.jasmine.book.entity.Book;
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
        LocalDate dop = rs.getDate("DateOfPublishing").toLocalDate();

        Book book = new Book(id, name, authorName, copies, dop);
        return book;
    }
}
