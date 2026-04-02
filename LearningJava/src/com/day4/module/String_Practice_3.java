package com.day4.module;

import java.util.Scanner;

public class String_Practice_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st=sc.nextLine();
        boolean b=true;
        for(int i=0;i<st.length();i++){
            if(Character.isLowerCase(st.charAt(i))){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println(st+ " is upper case ");
        }
        else{
            System.out.println(st+ " is not upper case ");
        }
    }
}
