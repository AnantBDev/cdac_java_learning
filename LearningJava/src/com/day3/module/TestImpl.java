package com.day3.module;

import com.day2.module.Manager;
import com.day2.module.SalariedEmployee;

public class TestImpl {

    public static void main(String[] args){
        SalariedEmployee se=new SalariedEmployee(334, "aaa",60000);
        Manager me=new Manager(5656, "ppp", 80000,20000);
        Consultant c=new Consultant();

        Payrollnew.showTax(se);
        Payrollnew.showTax(me);
        Payrollnew.showTax(c);
    }
}
