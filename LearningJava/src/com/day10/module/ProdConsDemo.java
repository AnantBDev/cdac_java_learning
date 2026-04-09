package com.day10.module;

public class ProdConsDemo {
    public static void main(String [] args){
        MyQueue queue=new MyQueue();
        Thread prod = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    queue.writeData("Value "+i);
                }
            }
        });

        Thread cons=new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    queue.readData();
                }
            }
        });
        prod.start();
        cons.start();
    }
}
