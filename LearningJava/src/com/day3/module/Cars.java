package com.day3.module;

import java.util.Objects;

public class Cars {
    int make;
    String model;
    int price;

    public Cars(int make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
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

    @Override
    public String toString() {
        return "Cars{" +
                "make=" + make +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return make == cars.make && price == cars.price && Objects.equals(model, cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price);
    }

    public static void main(String[] args){
        Cars c1=new Cars(2024, "Lamborghini", 90000000);
        Cars c2=new Cars(2022, "Jaquar", 50000000);
        Cars c3=new Cars(2024, "Lamborghini", 90000000);

        System.out.println("C1 VS C2: \n"+"HashCodes: \n"+"c1: "+c1.hashCode()+ "\nc2: "+c2.hashCode()+"\n Checking equals: "+c1.equals(c2));
        System.out.println("C1 vs C3: "+"HashCodes: \n"+"c1: "+c1.hashCode()+ "\nc3: "+c2.hashCode()+"\n Checking equals: "+c1.equals(c3));


    }
}