package Git_Java.cdac_java_learning.Java_OOPS.Book;

public class book {
    private String title;
    private String author;
    private double price;
    private int unique_id;
    private static int count = 1;

    // DEFAULT CONSTRUCTOR
    public book(){
        title = "Wrath of God";
        author = "Hamza Ali";
        price = 1700;
        unique_id = count++;
    }

    // PARAMETERIZED CONSTRUCTOR
    public book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.unique_id = count++;
    } 

    //GETTTERS AND SETTERS
    public void settitle(String title){      // void dont have a return type that's why we use it.
        this.title = title;
    } 
    public String getitle(){
        return title;
    }
    
    public void setauthor(String author){
        this.author = author;
    }
    public String getauthor(){
        return author;
    }

    public void setprice(double price){
        this.price = price;
    }
    public double getprice(){
        return price;
    }

    // STR METHOD TO RETURN VALUES
    public String toString(){
        return "Title: " + title + " , Author: " + author + " , Price: " + price + " , UniqueId: " + unique_id;
    }

}