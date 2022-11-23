import org.jasmine.book.entity.Book;
import org.jasmine.book.persistence.BookDaoImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookDaoTest {

    BookDaoImpl bookDaoImpl;

    @BeforeEach
    void setUp() throws Exception{
        bookDaoImpl = new BookDaoImpl();
    }

    @AfterEach
    void tearDown() throws Exception {
        bookDaoImpl = null;
    }

    @Nested
    class testListAllRecords{
        @Test
        void lengthWillBeGreaterToZero () {
        assertTrue(bookDaoImpl.listAllBook().size() > 0);
    }
    }

    @Test
    void testCreateRecords() {
        assertEquals(1, bookDaoImpl.createBook(new Book(110, "Hello You", "Me", 123, LocalDate.now())));
    }
    @Test
    void testDeleteRecords() {
        assertEquals(1, bookDaoImpl.deleteBook(110));
    }

    @Test
    void testSearchRecords() {
        DateTimeFormatter df = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("d-MMM-yyyy")).toFormatter();
        Book b102 = new Book(102, "Rolling", "Potter", 12, LocalDate.parse("12-Jan-1998", df));

        assertEquals(b102, bookDaoImpl.serachBook(102));
    }
}
