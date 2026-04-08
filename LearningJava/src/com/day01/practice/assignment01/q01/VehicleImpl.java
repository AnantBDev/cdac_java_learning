package com.day01.practice.assignment01.q01;

public class VehicleImpl {

    public static void main(String[] args){
        Vehicle v1=new TwoWheeler(1,2024,"Splendor", 150000);
        Vehicle v2=new FourWheeler(2,2026, "Fortuner",4500000);
        System.out.println("Two Wheeler Insurance: "+v1.calculateInsurance());
        System.out.println("Four Wheeler Insurance: "+v2.calculateInsurance());

    }
}
