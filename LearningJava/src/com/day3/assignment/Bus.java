package com.day3.assignment;

import com.assignment1.part1.FourWheeler;

public class Bus extends FourWheeler implements rentable {

    public Bus(String regNo, int make, String model, double price) {
        super(regNo, make, model, price);
    }

    @Override
    public int rent(int hrs) {
        int r=0;
        if (hrs>3){
            r=hrs*500;
            r=r+(hrs-3)*200;
            return r;
        }
        return hrs*500;
    }

    public void showRent(rentable r,int hrs){
        System.out.println(this.rent(hrs));
    }
}
