package com.day5.module;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args){
        List lst=new ArrayList();

        lst.add(10);
        lst.add("test");
        lst.add(12.5f);
        lst.add(true);
        lst.add(123);


        System.out.println(lst);

        lst.remove(true); //by value
        lst.remove(3); //by index
        System.out.println(lst);

        System.out.println(lst.get(2));
        System.out.println("----------------------");
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }

        System.out.println("-----------------------");
        for(Object o : lst)
        {
            System.out.println(o);
        }

        System.out.println("_______________________");
        Iterator it = lst.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
