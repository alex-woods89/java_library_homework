import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Harry Potter", "J.K Rowling", "Fiction");
        book1 = new Book("Where Rainbows End", "Cecilia Ahern", "Fiction");
        book2 = new Book("PS I Love You", "Cecilia Ahern", "Fiction");
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book);
        library.removeBook();
        assertEquals(1,library.bookCount());
    }
}
