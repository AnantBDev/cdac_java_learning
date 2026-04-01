package Git_Java.cdac_java_learning.Java_OOPS.Employee;

public class contractsalary extends employee {


    protected double basic;
    protected double allowance;

    public contractsalary(int empid, String name, double basic, double allowance) {
        super(empid, name); // Calls the 2-parameter constructor in employee
        this.basic = basic;
        this.allowance = allowance;
    }

    @Override
    public double calculateGross() {
        return basic + allowance;
    }

    public double calculateNet() {
        double gross = this.calculateGross();
        return gross - (gross * 0.2); // 20% Tax
    }
}