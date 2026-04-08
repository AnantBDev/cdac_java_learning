package com.day01.practice.assignment01.q03;

import java.util.Scanner;

public class RentableImpl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rentable r1=new TwoWheelers(4, 2024, "Discover", 230000);
        Rentable r2=new FourWheelers(5,2026,"EcoSport",12000000);
        System.out.println("Enter the no of hours of two wheeler");
        int hrs1=sc.nextInt();
        System.out.println(r1.rent(hrs1));

        System.out.println("Enter the no of hours of four wheeler");
        int hrs2=sc.nextInt();
        System.out.println(r1.rent(hrs2));
    }
}
