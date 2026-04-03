package Git_Java.cdac_java_learning.Java_OOPS.Employee;

public class Manager extends salariedemployee {


    protected int allowance;


    public Manager(int empid, String name, double basic, int allowance) {
        super(empid, name, basic);
        this.allowance = allowance;
    }


    public double calculateGross(){

        return super.calculateGross() + allowance;
    }

}