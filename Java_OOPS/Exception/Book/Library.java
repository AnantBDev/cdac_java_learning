package Git_Java.cdac_java_learning.Java_OOPS.Exception.Book;

import java.util.ArrayList;
import java.util.List;
public class Library {

    public static void addBook(List<Book> books, Book book) throws DuplicateBookException{
            for(Book b: books){
                if(b.getRegno()==book.getRegno()){
                    throw new DuplicateBookException("Book with given" + " reg no. already exists");
                }
            }
        }
    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(3, "1984", "George Orwell"));
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald")); // Duplicate book
        
        try {
            addBook(books, new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        } catch (DuplicateBookException e) {
            System.out.println(e);
        }
    }
}
