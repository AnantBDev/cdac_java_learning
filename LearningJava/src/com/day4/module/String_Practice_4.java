package com.day4.module;

import java.util.Scanner;

public class String_Practice_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.next();
        System.out.println("Enter the index about which you want to move left: ");
        int ind=sc.nextInt();

        String st=s.substring(ind);
        st=st+s.substring(0,ind);
        System.out.println("Changes String: "+st);

    }
}
