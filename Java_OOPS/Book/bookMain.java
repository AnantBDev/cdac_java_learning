package Git_Java.cdac_java_learning.Java_OOPS.Book;

import java.util.Scanner;

public class bookMain {
    public static void main(String[] args){
        // CREATING BOOK OBJECTS
        book b1 = new book("Darbhanga's Empire", "Ajit Saurav", 2000);
        book b2 = new book("Mahi: The untold story", "MS Dhoni", 2400);
        
        Scanner sc = new Scanner(System.in);

        // Assigning user defined values
        System.out.println("Title: ");
        String title = sc.next();

        System.out.println("Author: ");
        String author = sc.next();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        book b3 = new book(title, author, price);
        
        //
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        /*  2. CREATE A METHOD TO CALCULATE DISCOUNT WHICH ACCEPTS DISCOUNT % AND STORES DISCOUNTED PRICE
        public double calculateDiscount(){
            
            Scanner sc2 = new Scanner(System.in);

            System.out.println("Price: ");
            double p = sc2.nextDouble();

            System.out.println("Enter Discount % : ");
            double discount = sc2.nextDouble();

            System.out.println("Discounted Price: ", p * (discount/100)) ;
        } */
    }
}
