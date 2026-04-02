package com.day3.assignment;


import com.assignment1.part1.FourWheeler;
import com.assignment1.part1.TwoWheeler;
import com.assignment1.part1.Vehicle;

public class Policy {


    public static void showInsurance(Vehicle v) {
        if(v instanceof TwoWheeler){
            System.out.println(v.calculateInsurance());
        }
        if(v instanceof FourWheeler){
            System.out.println(v.calculateInsurance());
        }
    }
}
