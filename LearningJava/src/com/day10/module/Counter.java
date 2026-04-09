package com.day10.module;

public class Counter {
    int count;
    public Counter(){
        count=0;
    }
    public synchronized void increment(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }
}
