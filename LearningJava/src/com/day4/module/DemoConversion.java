package com.day4.module;

public class DemoConversion {
    public static void main(String [] args){
        int i=10;
        Integer j = Integer.valueOf(i); //primitive to object
        int k = j.intValue();//object to premitive

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        //After java 5

        int x = 10;
        Integer y = x; //Auto boxing
        int z=x; //Auto Unboxing
        System.out.println(y);
        System.out.println(z);

        //String parsing
        String n = "30";
        int m = Integer.parseInt(n);
        System.out.println(m);

        Integer p = Integer.valueOf(n);
        System.out.println(p);
    }
}
