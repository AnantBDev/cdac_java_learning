package com.day3.assignment;

import com.assignment1.part1.FourWheeler;
import com.assignment1.part1.TwoWheeler;
import com.assignment1.part1.Vehicle;

public class admin {

    public static void main(String[] args){
        Vehicle[] v=new Vehicle[2];
        v[0]=new TwoWheeler("TW01", 2024, "Jawa", 250000);
        v[1]=new FourWheeler("FW01",2026,"BMW X01",5000000);
        for (Vehicle f: v){
            System.out.println(f.toString());
            // Two Wheeler - 5%, 4W- 10%
            Policy.showInsurance(f);
        }
    }
}
