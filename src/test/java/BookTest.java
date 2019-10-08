import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
         book = new Book("Harry Potter", "J.K Rowling", "Fiction");
    }

    @Test
    public void canGetBookTitle(){
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void canGetBookAuthor(){
        assertEquals("J.K Rowling", book.getAuthor());
    }

    @Test
    public void canGetBookGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
