package com.day10.module;

public class DemoSyncronization {
    public static void main(String [] args){
        CounterJob job = new CounterJob();
        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        t1.start();
        t2.start();
    }
}
