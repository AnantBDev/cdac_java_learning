package com.day01.practice.assignment01.q01;

public class FourWheeler extends Vehicle{

    public FourWheeler(int regNo, int make, String model, int price) {
        super(regNo, make, model, price);
    }

    @Override
    public double calculateInsurance() {
        return this.getPrice()*0.10;
    }
}
