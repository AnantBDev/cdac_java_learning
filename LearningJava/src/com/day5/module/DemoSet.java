package com.day5.module;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args){
        Set<String> set=new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");

        System.out.println(set);
        set.remove("three");
        System.out.println(set.contains("four"));

        System.out.println("---------------");
        for(String item: set){
            System.out.println(item.toUpperCase());
        }

        System.out.println("-----------------");
        Iterator<String> it=set.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
