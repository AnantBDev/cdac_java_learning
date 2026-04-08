package com.day01.practice.assignment01.q02;

public class Savings extends Account {
    public Savings(int accountno, String name, double balance) {
        super(accountno, name, balance);
    }


    @Override
    public void withdraw(int amt) {
        System.out.println("-----Withdraw From Savings Account----------");
        if(this.getBalance()<10000){
            System.out.println("Minimum Balance limit exceeded \n Minimum Balance of 10000 needs to be maintained");
        }
        else{
            System.out.println("-------------------------");
            if(amt<this.getBalance()){
                System.out.println("Before Withdrawal: "+this);
                this.setBalance(this.getBalance()-amt);
                System.out.println("After Withdrawal: "+this);
            }
            else{
                System.out.println("Withrawal Amount is more than the current balance");
                System.out.println("Withdrawal Amount "+amt+" Current Balance: "+this.getBalance());
            }
        }
    }

    @Override
    public void deposit(int amt) {
        System.out.println("-----Deposit into Savings Account----------");
        if(amt>100000){
            System.out.println("Deposit limit breached \n Cannot deposit more than  1 Lac rupees");
        }
        else{
            System.out.println("Before Deposit: "+this);
            this.setBalance(this.getBalance()-amt);
            System.out.println("After Deposit: "+this);
        }
    }
}
