package com.day10.module;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {
    Queue<String> queue;
    boolean hasdata=false;

    public MyQueue(){
        queue=new ArrayDeque<String>(1);
    }
    public synchronized void writeData(String value){
        if(hasdata){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(value);
        System.out.println("Set Data: "+value);
        notify();
        hasdata=true;
    }

    public synchronized void readData(){
        if(!hasdata){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String value=queue.remove();
        System.out.println("Got data: "+value);
        hasdata=false;
        notify();
    }
}
