package com.day4.module;

import com.day1.models.Date;

public class CarImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Created Object1
        Car c1=new Car("2024","Jaguar",50000000, new Date(24,"Mar",2025));

        //Shallow Copy manually
        Car c2=c1;

        //Deep Copy Manually
        Car c3=new Car(c1.getMake(),c1.getModel(),c1.getPrice(),c1.getMandate());

        //Copy using Clone
        Car c4= (Car) c1.clone();

        System.out.println("Original: "+ c1);

        c1.setPrice(34000000);
        c1.getMandate().setDay(12);
        System.out.println("Original: "+ c1);
        System.out.println("Shallow Copy: "+ c2);
        System.out.println("Deep Copy: "+ c3);
        System.out.println("Clone copy: "+ c4);


    }
}
