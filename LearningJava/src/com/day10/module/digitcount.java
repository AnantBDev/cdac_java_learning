package com.day10.module;

public class digitcount {
    public static void main(String [] args){
        int number=167;
        int sum=0;
        int rem;
        while(number>0){
            rem=number%10;
            sum+=rem;
            number=number/10;

        }
        System.out.println("The sum of digits is : "+sum);

    }



}
