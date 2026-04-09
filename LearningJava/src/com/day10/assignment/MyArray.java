package com.day10.assignment;

import java.util.Arrays;

public class MyArray {
    int arr[];

    public MyArray(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int arr[]) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
    public synchronized void PrintArray(){
        System.out.print(Thread.currentThread().getName()+" : ");
        for(int a: this.arr){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(a+", ");
        }
        System.out.println("");
    }
}
