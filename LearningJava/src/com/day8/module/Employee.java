package com.day8.module;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {
    private static final long SerialVersionID=1L;
    private int empid;
    private String name;
    private transient double salary;
    private String department;
    public Employee(int empid,String name,double salary,String department){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String [] args){
        File f= new File("employee.txt");
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(445,"aaa",8000,"IT"));
        employees.add(new Employee(123,"ss",7000,"IT"));
        employees.add(new Employee(334,"PP",5000,"ITS"));
        employees.add(new Employee(678,"bbb",9000,"ITS"));

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))){
            for(Employee employee:employees){
                out.writeObject(employee);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))) {
            while (true) {
                try {
                    Employee employee = (Employee) in.readObject();
                    System.out.println(employee);
                } catch (EOFException e) {
                    break;
                }

            }
        }
        catch (ClassNotFoundException | IOException e){
            System.out.println(e);
        }
    }

}
