package com.day5.module;

public class Stat <T extends Number>{
    T[] obj;

    public Stat(T[] obj){
        this.obj=obj;
    }

    public double getAverage(){
        double total=0.0;
        for(T item: obj){
            total+=item.doubleValue();
        }
        return total/obj.length;
    }

    public static void main(String[] args){
        Integer[] iarr={1,2,3,4,5,6};
        Double[] darr={1.0,2.0,3.0,4.0,5.0,6.0};

        Stat<Integer> iobj=new Stat<Integer>(iarr);
        System.out.println(iobj.getAverage());
    }
}
