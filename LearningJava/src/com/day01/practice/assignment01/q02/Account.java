package com.day01.practice.assignment01.q02;

public abstract class Account {
    int accountno;
    String name;
    double balance;

    public Account(int accountno, String name, double balance) {
        this.accountno = accountno;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(int amt);

    public abstract void deposit(int amt);
}
