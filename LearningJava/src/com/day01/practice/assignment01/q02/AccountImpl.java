package com.day01.practice.assignment01.q02;

public class AccountImpl {
    public static void main(String[] args){
        Account acc1=new Savings(1, "Anant B", 100000);
        acc1.withdraw(5000);
        acc1.withdraw(200000);
        acc1.withdraw(50000);

        Account acc2=new Current(2, "Vachan H", 200000);


        Account acc3=new Savings(1, "Anant B", 100000);
        acc3.deposit(200000);
        acc3.deposit(50000);
        Account acc4=new Current(2, "Vachan H", 200000);
    }
}
