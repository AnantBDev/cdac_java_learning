package Git_Java.cdac_java_learning.Java_OOPS.Employee;

public class test {
    public static void main(String[] args) {
        // Test Salaried Employee
        salariedemployee se = new salariedemployee(2342, "Sachin", 60000);
        System.out.println(se);
        System.out.println("Salaried Gross: " + se.calculateGross());
        System.out.println("Salaried Net: " + se.calculateNet());
        System.out.println("-----------------------------------");

        // Test Contract Salary
        contractsalary cs = new contractsalary(856, "Aniket", 9000, 2000);
        System.out.println(cs);
        System.out.println("Contract Gross: " + cs.calculateGross());
        System.out.println("Contract Net: " + cs.calculateNet());
    }
}
