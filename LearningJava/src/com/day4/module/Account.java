package com.day4.module;

public class Account {
    int accno;
    String name;
    int balance;

    public Account(int accno, int balance, String name) {
        this.accno = accno;
        this.balance = balance;
        this.name = name;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amt){
        try{
            if(balance < amt) {
                throw new InsufficientBalanceException("Insuffiecient balance enter an amount lesser than or equal to balace");
            }
            else{
                balance = balance - amt;
                System.out.println("Amount "+amt+"has been withdrawn, new balance is "+balance);
            }
        }catch (InsufficientBalanceException e){
            System.out.println(e);

        }

    }
    public void deposit(int amt){
        try{
            if(amt> 100000) {
                throw new InsufficientBalanceException("Transaction limit exceeded for the day try depositing a lesser amount");
            }
            else{
                balance = balance + amt;
                System.out.println("Amount "+amt+" has been deposited, new balance is "+balance);
            }
        }catch (InsufficientBalanceException e){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
