package com.day1.models;

public class Calendar {
    public static void main(String[] args){
        int i=10;
        Date d1=new Date();
        d1.setDate(10,"Jul",2000);
        Date d2=d1;
        d1.displayDate();
        d2.displayDate();
        d1.setDate(11,"Mar",2000);
        System.out.println("__________________________");
        d2.displayDate();
        Date d3=new Date(10, "Jan", 2005);

        //d3.setDate(10,"Jan", 2005);
        System.out.println(i);
        System.out.println(d3);

        //d3.setDay(-1)
    }
}
