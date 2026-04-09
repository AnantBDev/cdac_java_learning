package com.day10.module;

public class DemoThread1 {

    public static void main(String [] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+" : " + i);
                }
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);

                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2=new Thread(r);
        t2.start();
    }
}
