package com.day4.module;

import java.util.Scanner;


public class String_Practice_2 {
//    public static boolean checklower(int ch){
//        if (ch>=97 && ch<=122){
//            return true;
//        }
//        return false;
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The string:");
        String str1=sc.nextLine();
        char s[]=str1.toCharArray();
        int cntup=0,cntlow=0,cntsp=0;
        for(int i=0;i<str1.length();i++){
            if (Character.isLowerCase(s[i])){
                cntlow++;
            }
            else if(Character.isUpperCase(s[i])){
                cntup++;
            }
            else if(!Character.isLetterOrDigit(s[i])){
                cntsp++;
            }
        }
    System.out.println("Lower Case: "+cntlow+"\nUpper Case: "+cntup+"\nSpecial Character: "+cntsp);
    }
}
