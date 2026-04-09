package com.day10.module;

public class ThreadDemo {

    public static void main(String [] args){
        Thread t1=new Thread1();
        Thread t2=new Thread(new Thread2());

        t1.start();
        t2.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);

            try{
                Thread.sleep(500);

            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
