package com.day3.assignment;

import com.assignment1.part1.Vehicle;

import java.util.Scanner;

public class RentImpl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        rentable r1=new Taxi("T01", 2022, "Bolero", 1600000);

        rentable r2=new Bus("B01", 2022, "Volvo", 5000000);

        System.out.println("Enter the no of hours for Taxi ");
        int n=sc.nextInt();
        System.out.println("Taxi : "+ r1.rent(n));

        System.out.println("Enter the no of hours for Bus");
        n=sc.nextInt();
        System.out.println("Bus: "+r2.rent(n));

    }
}
