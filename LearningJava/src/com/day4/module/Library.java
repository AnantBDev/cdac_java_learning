package com.day4.module;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    public static void addBook(List<Book> books, Book book) throws DuplicateBookException{
        for(Book b:books)
        {
            if(b.getRegno()==book.getRegno()) {
                throw new DuplicateBookException(
                        "Book with given registration no already exists");

            }
        }
    }
    public static void main(String [] args){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(123,"Java","abc"));
        books.add(new Book(345,"python","xyz"));
        books.add(new Book(456,"Javascript","pqr"));
        System.out.println(books);
        try{
            addBook(books,new Book(123,"Java8","abc"));
        }
        catch(DuplicateBookException e){
            System.out.println(e);
        }
    }
}
