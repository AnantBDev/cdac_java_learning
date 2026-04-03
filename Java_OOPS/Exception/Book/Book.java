package Git_Java.cdac_java_learning.Java_OOPS.Exception.Book;

public class Book {
    private int regno;
    private String title;
    private String author;

    public Book(int regno, String title, String author) {
        super();
        this.regno = regno;
        this.title = title;
        this.author = author;
    }
    public int getRegno() {
        return regno;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void setRegno(int regno) {
        this.regno = regno;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "Book [regno=" + regno + ", title=" + title + ", author=" + author + "]";
    }
}