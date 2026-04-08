package com.day01.practice.assignment01.q03;

import com.day01.practice.assignment01.q01.Vehicle;

public class TwoWheelers extends Vehicle implements Rentable{
    public TwoWheelers(int regNo, int make, String model, int price) {
        super(regNo, make, model, price);
    }

    @Override
    public int rent(int hrs) {
        if(hrs<3){
            return 300*hrs;
        }
        return 300*hrs+100*(hrs-3);
    }

    @Override
    public double calculateInsurance() {
        return 0;
    }
}
