package com.day01.practice.assignment01.q01;

public class TwoWheeler extends Vehicle{
    public TwoWheeler(int regNo, int make, String model, int price) {
        super(regNo, make, model, price);
    }

    @Override
    public double calculateInsurance() {
        return this.getPrice()*0.05;
    }
}
