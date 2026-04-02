package com.day4.module;

import com.day1.models.Date;

public class Car implements Cloneable {
    private String make;
    private String model;
    private double price;
    private Date mandate; //has-A

    public Car(String make, String model, double price, Date mandate){
        this.make=make;
        this.model=model;
        this.price=price;
        this.mandate=mandate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getMandate() {
        return mandate;
    }

    public void setMandate(Date mandate) {
        this.mandate = mandate;
    }

    public Object clone() throws CloneNotSupportedException {
        // Made a car object with primitives having exact copy from super
        // but for non-primitives we created a new object using getters and setters from class
        // and initialised it into non-primitives
        Car car1=(Car) super.clone();
        car1.mandate=new Date(this.mandate.getDay(), this.mandate.getMonth(), this.mandate.getYear());
        return car1;
        //return super.clone();
    }

    @Override
    public String toString() {
        return "Car[" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", mandate=" + mandate +
                ']';
    }
}
