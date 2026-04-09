package com.day10.module;

public class CounterJob implements Runnable{
    Counter c=new Counter();

    @Override
    public void run() {
        for(int i=0;i<50;i++){
            c.increment();
            System.out.println(Thread.currentThread().getName()+" : "+c.getCount());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
        }

    }
}
