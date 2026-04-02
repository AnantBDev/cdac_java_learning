package com.day4.module;

public class Atm {
    public static void main(){
        Account a1=new Account(1,2000,"Vachan");
        Account a2=new Account(2,200000,"Anant");

        a1.withdraw(3000);
        a1.withdraw(200);
        a2.deposit(300000);
        a2.deposit(10000);
    }
}
