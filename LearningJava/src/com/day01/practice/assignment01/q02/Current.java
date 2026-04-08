package com.day01.practice.assignment01.q02;

public class Current extends Account{

    public Current(int accountno, String name, double balance) {
        super(accountno, name, balance);
    }

    @Override
    public void withdraw(int amt) {
        System.out.println("-----Withdraw From Current Account----------");
        if(amt>50000){
            System.out.println("Withrawal Limit breached \n Cannot withdraw more than 50000");
        }
        else{
            if(amt>this.getBalance()){
                System.out.println("Withdrawal limit breached \n ");
            }
            else{
                System.out.println("Before Withdrawal: "+this);
                this.setBalance(this.getBalance()-amt);
                System.out.println("After Withdrawal: "+ this);
            }
        }
    }

    @Override
    public void deposit(int amt) {
        System.out.println("-----Deposit into Current Account----------");
        if(amt>500000){
            System.out.println("Maximum Deposit Amount exceedeed");
        }
        else{
            System.out.println("Before Deposit: "+this);
            this.setBalance(this.getBalance()+amt);
            System.out.println("After Deposit: "+ this);
        }
    }
}
