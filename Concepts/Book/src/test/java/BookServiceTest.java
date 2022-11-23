import lombok.Setter;
import org.jasmine.book.entity.Book;
import org.jasmine.book.persistence.BookDao;
import org.jasmine.book.service.BookServiceImpl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @InjectMocks
    private BookServiceImpl bookServiceImpl;

    @Mock
    private BookDao bookDao;

    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() throws Exception {
        autoCloseable= MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();

    }

    @Nested
    public class TestAddEmployee {

        @Test
        void testAddBookOne() {
            Book bookForTest = new Book(101, "Hello World", "Jasmine", 11, LocalDate.now());
            when(bookDao.createBook(bookForTest)).thenReturn(1);
            assertTrue(bookServiceImpl.addBook(bookForTest));
        }

        @Test
        void testAddBookTwo() {
            Book bookForTest = new Book(101, "Hello World", "Jasmine", 11, LocalDate.now());
            when(bookDao.createBook(bookForTest)).thenReturn(0);
             assertFalse(bookServiceImpl.addBook(bookForTest));
        }
    }

    @Nested
    public class TestDeleteEmployee {

        @Test
        void testDeleteBookOne() {
            when(bookDao.deleteBook(101)).thenReturn(1);
            assertTrue(bookServiceImpl.deleteBook(101));
        }

        @Test
        void testDeleteBookTwo() {
            when(bookDao.deleteBook(101)).thenReturn(0);
            assertFalse(bookServiceImpl.deleteBook(101));
        }
    }


}
