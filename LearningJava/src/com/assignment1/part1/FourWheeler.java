package com.assignment1.part1;

public class FourWheeler extends Vehicle {

    public FourWheeler(String regNo, int make, String model, double price) {
        super(regNo, make, model, price);
    }

    @Override
    public double calculateInsurance() {
        return this.price * 0.10;
    }

    @Override
    public String toString() {
        return "FourWheeler{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", make=" + make +
                ", regNo='" + regNo + '\'' +
                ", InsuranceAmt: " + this.calculateInsurance() + '}';
    }
}