package org.example.day10;

public class Employee {

    private String name;
    private String department;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary tidak boleh 0");
        }
    }

//    public Employee(String name, String department, double salary) {
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
}
