package com.day4.module;

import java.util.Locale;
import java.util.Scanner;

public class String_Practice_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the String: ");
        //String s=sc.next();
        boolean res=strequals("hello","hello");
        System.out.println(res);
        boolean res1 = strequalsignorecase("HELLO","Hello");
        System.out.println(res1);
        boolean res3=strequals("Hello","hello");
        System.out.println(res);
        boolean res4 = strequalsignorecase("HELLO ALL","Hello");
        System.out.println(res1);
    }

    public static Boolean strequals(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static Boolean strequalsignorecase(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
