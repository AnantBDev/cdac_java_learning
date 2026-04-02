package com.day4.module;

public class Calculator {
    public static void main(String[] args){
        try{
            Math.divide(args[0],args[1]);
        }
        //multi catch block
        catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        finally{
            System.out.println("Always get executed");
        }
    }
}
