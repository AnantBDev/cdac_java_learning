package com.day6.assignment;

import java.util.ArrayList;
import java.util.List;

public class DemoLambdaFn {
    public static void main(String[] args){

        //Calculating Sqaure
        INumber getsquare=(n)-> n*n;
        int sq= getsquare.apply(4);
        System.out.println("Square: "+sq);

        //Calculating factorial
        INumber fact=(n) ->
        {
            int f=1;
            for(int i=n;i>=1;i--){
                f=f*i;
            }
            return f;
        };
        int fac=fact.apply(5);
        System.out.println("Factorial: "+fac);

        //OperateOnNumbers

        //Nearest Even Number - Functional Programming Language
        List<Integer> lst=new ArrayList<Integer>(List.of(1,2,3,4,5));
        List<Integer> filtered=operateOnNumbers(DemoLambdaFn::nearesteven, lst);
        System.out.println("Nearest Even No: "+filtered);

        //Cubes of all Numbers in the list

        filtered=operateOnNumbers(DemoLambdaFn::calcCube,lst);
        System.out.println("Cubes: "+filtered);


    }

    public static List<Integer> operateOnNumbers(INumber i, List<Integer> lst){
        List<Integer> l=new ArrayList<Integer>();
        for(int item: lst){
            l.add(i.apply(item));
        }
        return l;
    }
    public static int calcCube(int n){
        return n*n*n;
    }
    public static int nearesteven(int n){
        if(n%2==0){
            return n;
        }
        return n+1;
    }
}
