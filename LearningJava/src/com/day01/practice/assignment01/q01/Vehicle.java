package com.day01.practice.assignment01.q01;

public abstract class Vehicle {
    int regNo;
    int make;
    String model;
    int price;



    public Vehicle(int regNo, int make, String model, int price) {
        this.regNo = regNo;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract double calculateInsurance();

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNo=" + regNo +
                ", make=" + make +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
