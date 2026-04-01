package Git_Java.cdac_java_learning.Java_OOPS.Employee;

import java.time.Month;
import java.util.Scanner;

public class payroll {

    static  Scanner sc = new Scanner(System.in);

    public void showGross(employee e)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (3 letters)  :");
        String m = sc.next();
        Month month =Month.valueOf(m.toUpperCase());
        System.out.println("gross salary for " + month + ":" + e.calculateGross());

    }
    public static void showNet(salariedemployee e) {
        System.out.println("Net salary: " + e.calculateNet());
    }

    
}