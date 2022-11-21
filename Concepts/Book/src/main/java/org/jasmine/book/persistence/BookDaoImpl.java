package org.jasmine.book.persistence;

import org.jasmine.book.Password;
import org.jasmine.book.entity.Book;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class BookDaoImpl implements BookDao{

    public BookDaoImpl() {
    }

    @Override
    public Collection<Book> listAllBook() {
        Connection connection = null;
        PreparedStatement preparedStatement;
        Collection <Book> bookList = new ArrayList<Book>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", Password.password);

            preparedStatement = connection.prepareStatement("SELECT * FROM BOOKS");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                int bookId = resultSet.getInt("BOOKID");
                String bookName = resultSet.getString("BOOKNAME");
                String authorName = resultSet.getString("AUTHORNAME");
                int noOfCopies = resultSet.getInt("NOOFCOPIES");
                LocalDate dateOfPublising = resultSet.getDate("DATEOFPUBLISING").toLocalDate();

                bookList.add(new Book(bookId, bookName, authorName, noOfCopies, dateOfPublising));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return bookList;
    }

    @Override
    public Book serachBook(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement;

        Book book = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", Password.password);

            preparedStatement = connection.prepareStatement("SELECT * FROM BOOKS WHERE BOOKID=?");

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                int bookId = resultSet.getInt("BOOKID");
                String bookName = resultSet.getString("BOOKNAME");
                String authorName = resultSet.getString("AUTHORNAME");
                int noOfCopies = resultSet.getInt("NOOFCOPIES");
                LocalDate dateOfPublishing = resultSet.getDate("DATEOFPUBLISING").toLocalDate();

                book = new Book(bookId, bookName, authorName, noOfCopies, dateOfPublishing);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return book;

    }

    @Override
    public int createBook(Book book) {

        Connection connection = null;
        PreparedStatement preparedStatement;

        int rows = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", Password.password);

            preparedStatement = connection.prepareStatement("INSERT INTO BOOKS VALUES(?,?,?,?,?)");

            preparedStatement.setInt(1, book.getBookId());
            preparedStatement.setString(2, book.getBookName());
            preparedStatement.setString(3, book.getAuthorName());
            preparedStatement.setInt(4, book.getNoOfCopies());
            preparedStatement.setObject(5, book.getDateOfPublishing());

            rows = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return rows;
    }

    @Override
    public int deleteBook(int id) {

        Connection connection = null;
        PreparedStatement preparedStatement;

        int rows = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", Password.password);

            preparedStatement = connection.prepareStatement("DELETE FROM BOOKS WHERE BOOKID=?");

            preparedStatement.setInt(1, id);

            rows = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return rows;
    }
}
