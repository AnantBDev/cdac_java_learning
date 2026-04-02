package com.day4.module;

public class ExceptionHandling {

    public static void main(String[] args){
        try{
            int dividend=Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            int result=dividend/divisor;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Divisor cannot be zero "+"Error cause by: "+e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("continue");
    }
}
