package com.day01.practice.assignment01.q03;

import com.day01.practice.assignment01.q01.FourWheeler;
import com.day01.practice.assignment01.q01.TwoWheeler;
import com.day01.practice.assignment01.q01.Vehicle;

public class Admin extends Policy{
    public static void main(String[] args){
        Vehicle[] veh= new Vehicle[2];
        veh[0]=new TwoWheeler(1,2024,"Splendor",150000);
        veh[1]=new FourWheeler(2, 2026, "Forrtuner",4500000);

        for(Vehicle v: veh){
            System.out.println("Insurance: "+Policy.displayInsurance(v));
        }
    }
}
