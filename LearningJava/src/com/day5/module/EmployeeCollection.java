package com.day5.module;

import java.util.*;

public class EmployeeCollection {
    public static List<Employee> initializeData(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(445,"aaa",80000, Set.of("Java","C++")));
        employees.add(new Employee(123,"sss",70000, Set.of("Python","C++")));
        employees.add(new Employee(234,"aaa",80000, Set.of("Java","Python")));
        employees.add(new Employee(987,"aaa",80000, Set.of("Java","JavaScript")));
        employees.add(new Employee(567,"aaa",80000, Set.of("Python","C++")));
        employees.add(new Employee(334,"anant",150000, Set.of("Java","SQL")));
        return employees;
    }
    public static void printList(List<Employee> emplist){
        for(Employee e: emplist)
            System.out.println(e);
    }

    public static void addEmployee(List<Employee> emplist, Employee emp){
        boolean exists=false;
        //contains can also be used : will check on whole dataset
        for(Employee e: emplist){
            if(e.getEmpid()==emp.getEmpid()){
                exists=true;
                break;
            }
        }
        if(!exists)
            emplist.add(emp);
    }

    public static void removeEmployee(List<Employee> emplist, Employee e){
        //Syntax for iterate
        Iterator<Employee> it=emplist.iterator();
        while(it.hasNext()){
            Employee emp=it.next();
            if(emp.getEmpid()==e.getEmpid()){
                it.remove();
                break;
            }
        }

    }

    public static List<Employee> filterBySkills(List<Employee> emplist, String skill){
        List<Employee> filtered=new ArrayList<Employee>();
        for(Employee e: emplist){
            if(e.getSkills().contains(skill)){
                filtered.add(e);
            }
        }
        return filtered;
    }

    public static Map<Integer, Double> getSalaryMap(List<Employee> emplist){
        Map<Integer, Double> salmap=new TreeMap<Integer, Double>();
        for(Employee e: emplist){
            salmap.put(e.getEmpid(), e.getSalary());
        }
        return salmap;
    }

    public static void main(String[] args)
    {
        List<Employee> emplist=initializeData();
        printList(emplist);
        System.out.println("-----After Insertion----");
        addEmployee(emplist, new Employee(999,"anant",150000, Set.of("Java","SQL")));
        printList(emplist);
        System.out.println("_____After Removal____");
        removeEmployee(emplist, new Employee(334,"anant",150000, Set.of("Java","SQL")));
        printList(emplist);

        System.out.println("-------Filter by Skills--------");
        List<Employee> byskill=filterBySkills(emplist,"Java");
        System.out.println(byskill);

        System.out.println("---------Map By Salary-----------");
        Map<Integer, Double> salmap=getSalaryMap(emplist);
        System.out.println(salmap);

        System.out.println("-------Sort by Id-------------");
        Collections.sort(emplist);
        printList(emplist);

        System.out.println("------------Sort by name-------------------");
        Collections.sort(emplist,new NameComparator());
        printList(emplist);
        int index = Collections.binarySearch(emplist, new Employee(0,"sss",0,null),
                new NameComparator());
        System.out.println("Found at : "+index);
        System.out.println("-------------------Sort by Salary--------------");

        Collections.sort(emplist,new SalaryComparator());
        printList(emplist);
        index=Collections.binarySearch(emplist,
                new Employee(0,null,90000,null),new SalaryComparator());
        System.out.println("Found at : "+index);
        Employee minsal = Collections.min(emplist,
                new SalaryComparator());
        System.out.print(minsal);

        Employee maxsal = Collections.max(emplist,new SalaryComparator());
        System.out.println(maxsal);
    }

}
