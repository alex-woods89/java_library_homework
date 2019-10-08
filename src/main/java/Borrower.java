import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;
    private String name;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int bookCount(){
       return this.collection.size();
    }


    public void borrowBook(Library library){
        Book book = library.removeBook();
        this.collection.add(book);

    }
}


