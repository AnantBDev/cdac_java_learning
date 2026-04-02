package com.day4.module;

public class Math {

    public static void divide(String n1, String n2)
        throws ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException{
        int dividend= Integer.parseInt(n1);
        int divisor= Integer.parseInt(n2);

        int result=dividend/divisor;
        System.out.println(result);
    }
}
