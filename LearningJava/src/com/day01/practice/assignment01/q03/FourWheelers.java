package com.day01.practice.assignment01.q03;

import com.day01.practice.assignment01.q01.Vehicle;

public class FourWheelers extends Vehicle implements Rentable{

    public FourWheelers(int regNo, int make, String model, int price) {
        super(regNo, make, model, price);
    }

    @Override
    public int rent(int hrs) {
        if(hrs<3){
            return hrs*500;
        }
        return hrs*500+(hrs-3)*200;
    }

    @Override
    public double calculateInsurance() {
        return 0;
    }
}
