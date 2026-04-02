package com.day3.module;

import com.day2.module.Employee;
import com.day2.module.SalariedEmployee;

import java.util.Scanner;

public class Payrollnew {

    static Scanner sc=new Scanner(System.in);

    public static void showTax(TaxPayer payer){
        System.out.println("Tax: "+payer.calculateTax());
    }
}
