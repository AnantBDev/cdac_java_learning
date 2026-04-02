package com.day4.module;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args){
        String s1="welcome";
        String s2="welcome";

        System.out.println(s1==s2);

        String n1=new String("welcome");
        String n2=new String("welcome");

        System.out.println(n1==n2);
        System.out.println(n2.equals(n1));

        //n3 created in string pool
        String n3=n1.intern();
        System.out.println(s1==n3);
        System.out.println(n1==n3);

        String sentences = "hello how are you";
        String [] words = sentences.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(sentences);
    }
}
