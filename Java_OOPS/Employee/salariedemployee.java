package Git_Java.cdac_java_learning.Java_OOPS.Employee;

public class salariedemployee extends employee {


    protected double basic;

    public salariedemployee(int empid, String name, double basic) {
        super(empid, name); // Calls the 2-parameter constructor in employee
        this.basic = basic;
    }

    @Override
    public double calculateGross() {
        double hra = basic * 0.4;
        double da = basic * 0.12;
        return basic + hra + da;
    }

    public double calculateNet() {
        double gross = this.calculateGross();
        return gross - (gross * 0.2); // 20% Tax
    }
}
