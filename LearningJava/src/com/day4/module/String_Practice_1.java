package com.day4.module;

import java.util.Arrays;
import java.util.Scanner;

public class String_Practice_1 {

    public static void main(String  [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.next();
        System.out.println("Enter String 2");
        String str2 = sc.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(str1);
        System.out.println(str2);

        char[] str1_split = str1.toCharArray();
        char[] str2_split = str2.toCharArray();
        Arrays.sort(str1_split);
        Arrays.sort(str2_split);
        Boolean b = true;

        if (str1_split.length != str2_split.length) {
            b = false;
        }

        if (str1_split.length == str1.length()) {
            for (int i = 0; i < str1_split.length; i++) {
                if (str1_split[i] != str2_split[i]) {
                    b = false;
                    break;
                }
            }
            System.out.println(b);
        }
    }
}
