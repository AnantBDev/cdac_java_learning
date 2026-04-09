package com.day10.module;

import java.util.Scanner;

public class Simplecalc {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter one number:");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int n2=sc.nextInt();
        System.out.println("Enter operation: ");
        String op=sc.next();

        switch(op){
            case "+":
                int sum=n1+n2;
                System.out.println("Sum of two numbers is :"+sum);
                break;
            case "-":
                int diff=n2-n1;
                System.out.println("Difference of two numbers: "+diff);
                break;
            case "*":
                int prod=n1*n2;
                System.out.println("Product is : "+prod);
                break;
            case "/":
                double div=n1/n2;
                System.out.println("Divison is : "+div);
                break;
            case "%":
                double mod=n1%n2;
                System.out.println("The mod is : "+mod);
                break;
            default:
                System.out.println("Invalid operatoin.");
        }
    }
}
