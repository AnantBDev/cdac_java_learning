package com.day10.assignment;

public class AccountImpl {
    public static void main(String[] args){
        Account ac=new Account(10000);
        Thread withdrw=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    ac.withdraw(5000);
                }
            }
        });
        Thread depsit=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ac.deposit(5000);
                }
            }
        });

        withdrw.start();
        depsit.start();
    }
}
