package com.day10.assignment;

public class Account{
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public synchronized void withdraw(int amount){
        if(amount>this.balance){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=============================================");
        System.out.println("Before Withdrawal: "+this);
        this.setBalance(this.balance-amount);
        System.out.println("Amount to be withdrawn: "+amount);
        System.out.println("After Withdrawal: "+this.balance);
        notify();
        System.out.println("=============================================");
    }

    public synchronized void deposit(int amount){
        System.out.println("=============================================");
        System.out.println("Before Deposit: "+this);
        this.setBalance(this.balance+amount);
        System.out.println("Amount to be deposited: "+amount);
        System.out.println("After Deposit: "+this);
        notify();
        System.out.println("=============================================");
    }
}
