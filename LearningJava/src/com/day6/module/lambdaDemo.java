package com.day6.module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdaDemo {

    //Operation on Number
    public static boolean operateOnNumber(IPredicate p, int n){
        return p.test(n);
    }

    //Operation on lists
    public static List<Integer> operateOnNUmbers(IPredicate p, List<Integer> lst){
        List<Integer> filtered=new ArrayList<Integer>();
        for(Integer item: lst){
            if(p.test(item)){
                filtered.add(item);
            }
        }
        return filtered;
    }

    // Checking Prime
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }


    public static void main(String[] args){
        //Method 1 to implement
        IPredicate iseven = (n) -> n%2==0;
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        boolean result = iseven.test(11);
        System.out.println(result);

        IPredicate isprime = (n) ->
        {
            for(int i=2;i<n;i++){
                if(n%i==0)
                    return false;
            }
            return true;
        };

        boolean check=isprime.test(11);
        System.out.println(check);

        result=operateOnNumber((n)-> n%2==0,2);
        System.out.println(result);

        result=operateOnNumber((n) ->{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        },10);
        System.out.println(result);


        result=operateOnNumber((n)->n>10, 12);
        System.out.println(result);

        result=operateOnNumber((n)->
        {
            for(int i=2;i<n;i++){
                if(n%i==0)
                    return false;
            }
            return true;
        },12);
        System.out.println(result);

        result=operateOnNumber(lambdaDemo::isPrime,12);
        System.out.println(result);

        List<Integer> filtered=operateOnNUmbers((n)-> n%2==1, lst);
        System.out.println(filtered);

        filtered=operateOnNUmbers(lambdaDemo::isPrime,lst);
        System.out.println(filtered);

    }
}
