package com.day7.module;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Employee implements Comparable<Employee> {
    private int empid;
    private String name;
    private double salary;
    private String department;
    private Set<String> skills;

    public Employee(int empid, String name, double salary, String department, Set<String> skills) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", skills=" + skills +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.empid,o.empid);
    }

    public static void main(String[] args){
        List<Employee> lst=initializeData();
        Stream<Employee> stream=lst.stream();


        System.out.println("-----Remove-----");
        lst.removeIf((emp) -> emp.getEmpid()==555);
        lst.forEach(System.out::println);
        lst.add(new Employee(555,"ggg",60000,"IT",Set.of("Python", "Java")));

        System.out.println("-----Update-----");
        stream.filter((emp)-> emp.getEmpid()==555)
                .findFirst().ifPresent((emp)-> emp.setName("ppp"));
        stream=lst.stream();
        stream.forEach(System.out::println);

        System.out.println("-----Filter by Skill-----");
        stream=lst.stream();
        Predicate<Employee> byskills=((emp) -> emp.getSkills().contains("Java"));
        stream.filter(byskills).forEach(System.out::println);

        System.out.println("-----Filter by Salary-----");
        stream=lst.stream();
        Predicate<Employee> bysal=(emp)-> emp.getSalary()>50000
                && emp.getSalary()<90000;
        stream.filter(bysal).forEach(System.out::println);

        System.out.println("-----Group by Dept-----");
        stream=lst.stream();
        Map<String, List<Employee>> bydeptlist= stream.collect(Collectors.
                groupingBy(Employee::getDepartment));
        bydeptlist.forEach((k,v) -> System.out.println(k+" : "+v));

        System.out.println("-----Spending by Dept-----");
        stream=lst.stream();
        Map<String, Double> spending=stream.collect
                (Collectors.groupingBy(Employee::getDepartment,
                Collectors.summingDouble(Employee::getSalary)));
        spending.forEach((k,v) -> System.out.println
                ("Spending for "+ k+" : "+v));

        System.out.println("-----Sorting by Id-----");
        stream=lst.stream();
        stream.sorted().forEach(System.out::println);

        System.out.println("-----Sorting by Name-----");
        Comparator<Employee> byname= Comparator.comparing(Employee::getName);
        stream=lst.stream();
        stream.sorted(byname).forEach(System.out::println);


        System.out.println("-----Min/Max/Ave-----");
        stream=lst.stream();
        Optional<Employee> min=stream.min(Comparator.comparing(Employee::getSalary));
        min.ifPresent(System.out::println);

        stream=lst.stream();
        Optional<Employee> max=stream.max(Comparator.comparing(Employee::getSalary));
        max.ifPresent(System.out::println);

        stream=lst.stream();
        OptionalDouble ave=stream.mapToDouble(Employee::getSalary).average();
        ave.ifPresent(System.out::println);


    }

    public static List<com.day7.module.Employee> initializeData(){
        List<com.day7.module.Employee> employees = new ArrayList<com.day7.module.Employee>();
        employees.add(new com.day7.module.Employee(445,"aaa",80000,"IT", Set.of("Java","C++")));
        employees.add(new com.day7.module.Employee(123,"sss",70000, "IT",Set.of("Python","C++")));
        employees.add(new com.day7.module.Employee(234,"aaa",80000, "ITS",Set.of("Java","Python")));
        employees.add(new com.day7.module.Employee(987,"aaa",80000, "HR",Set.of("Java","JavaScript")));
        employees.add(new com.day7.module.Employee(567,"aaa",80000, "IT",Set.of("Python","C++")));
        employees.add(new com.day7.module.Employee(334,"anant",150000, "ITS",Set.of("Java","SQL")));
        return employees;
    }
}
