package com.day6.module;

import java.util.ArrayList;
import java.util.List;

public class DemoGenLambda {

    public static <T> List<T> operateOnData(Ifunction<T> func, List<T> lst)
    {
        List<T> mapped = new ArrayList<T>();
        for(T item: lst)
        {
            mapped.add(func.apply(item));
        }
        return mapped;
    }
    public static void main(String [] args){
        List<String> slist = List.of("mango","banana","watermelon","strawberry","orange");
        List<String> upper = operateOnData((s) -> s.toUpperCase(),slist);
        System.out.println(upper);

        List<Integer> lst = List.of(12,13,14,15,16,17,18);
        List<Integer> squares = operateOnData((n) -> n*n,lst);

        System.out.println(squares);
    }
}
