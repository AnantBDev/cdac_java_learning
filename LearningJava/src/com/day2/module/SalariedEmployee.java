package com.day2.module;

import com.day3.module.TaxPayer;

public class SalariedEmployee extends Employee implements TaxPayer {
    protected double basic;

    public SalariedEmployee(int empid,String name,double basic){
        super(empid,name);
        this.basic= basic;

    }
    @Override
    public double calculateGross(){
        double hra = basic *0.4;
        double da = basic * 0.12;
        return basic + hra + da;
    }


    public double calculateNet(){
        double tax=0.2*calculateGross();
        return calculateGross()-tax;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    @Override
    public String toString() {
        return super.toString()+"basic: "+basic+" Gross Salary: "+calculateGross()+" Net Salary: "+calculateNet();

    }

    public static void main(String [] args){
        SalariedEmployee s1=new SalariedEmployee(1,"anant",50000);
        SalariedEmployee s2=new SalariedEmployee(2,"vachan",50000);

    }

    @Override
    public double calculateTax() {
        return calculateGross()*0.2;
    }
}

