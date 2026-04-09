package com.day10.module;

public class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
