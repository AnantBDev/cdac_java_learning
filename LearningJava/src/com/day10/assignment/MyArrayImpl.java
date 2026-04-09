package com.day10.assignment;

public class MyArrayImpl implements Runnable{
    MyArray ma=new MyArray(new int[]{10,20,30,40});

    @Override
    public void run() {
        ma.PrintArray();
    }

    public static void main(String[] args){
        MyArrayImpl mai=new MyArrayImpl();
        Thread thread1=new Thread(mai);
        Thread thread2=new Thread(mai);

        thread1.start();
        thread2.start();
    }
}
