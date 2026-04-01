package Git_Java.cdac_java_learning.Java_OOPS.Employee;

public abstract class employee {
    protected int empid;
    protected String name;

    // This constructor takes only TWO parameters
    public employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public abstract double calculateGross();

    @Override
    public String toString() {
        return "Employee Details: ID-" + empid + " | Name-" + name;
    }
}
