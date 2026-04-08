package com.day6.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAssgn {
    public static void main(String[] args) {

        List<String> colors= List.of("Red", "orange","Yellow","green","Blue","indigo","Violet");

        // ColoursUpperCase
        System.out.println("--------------In Upper Case--------------------");
        Stream<String> uppercase= colors.stream().map(String::toUpperCase);
        List<String> upcase=uppercase.collect(Collectors.toList());
        System.out.println(upcase);


        //ColorsLowerCase
        System.out.println("");
        System.out.println("--------------In Lower Case---------------------");
        Stream<String> lowercase= colors.stream().map(String::toLowerCase);
        List<String> lowcase=lowercase.collect(Collectors.toList());
        System.out.println(lowcase);

        //List of colours less than 'm' in ascending order
        System.out.println("");
        System.out.println("------List in Ascending Order------------");
        Stream<String> st= colors.stream().map(String::toLowerCase).filter((s)-> s.charAt(0)<'m').sorted();
        List<String> lst=st.toList();
        System.out.println(lst);


        //List of colours less than 'm' in descending order
        System.out.println("");
        System.out.println("------List in Descending Order------------");
        st= colors.stream().map(String::toLowerCase).filter((s)-> s.charAt(0)<'m').sorted(Comparator.reverseOrder());
        lst=st.toList();
        System.out.println(lst);


        //List of colours with length equal to 5 in ascending order
        System.out.println("");
        System.out.println("------List in Ascending Order 5 characters------------");
        st= colors.stream().map(String::toLowerCase).filter((s)-> s.length()==5).sorted();
        lst=st.toList();
        System.out.println(lst);

        //List of colours with length equal to 5 in descending order
        System.out.println("");
        System.out.println("------List in Descending Order 5 characters------------");
        st= colors.stream().map(String::toLowerCase).filter((s)-> s.length()==5).sorted(Comparator.reverseOrder());
        lst=st.toList();
        System.out.println(lst);
        

    }
}
