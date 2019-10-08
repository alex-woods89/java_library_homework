import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Book book1;
    private Book book2;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Tony");
        library = new Library(3);
        book = new Book("Harry Potter", "J.K Rowling", "Fiction");
        book1 = new Book("Where Rainbows End", "Cecilia Ahern", "Fiction");
        book2 = new Book("PS I Love You", "Cecilia Ahern", "Fiction");
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        borrower.borrowBook(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(2, library.bookCount());
    }
}
