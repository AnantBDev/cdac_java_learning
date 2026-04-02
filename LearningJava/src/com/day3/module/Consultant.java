package com.day3.module;

import com.day2.module.SalariedEmployee;

public class Consultant implements TaxPayer{

    @Override
    public double calculateTax() {
        return 1000;
    }
}
