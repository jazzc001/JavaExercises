package org.jasmine.book.persistence;

import org.jasmine.book.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("bookId");
        String name = rs.getString("bookName");
        String authorName = rs.getString("authorName");
        int copies = rs.getInt("noOfCopies");
        LocalDate dop = rs.getDate("dateOfPublising").toLocalDate();

        Book book = new Book(id, name, authorName, copies, dop);
        return book;
    }
}
