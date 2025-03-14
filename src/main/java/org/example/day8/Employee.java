package org.example.day8;

public class Employee extends User {
    private int salary;
    private String department;

    public Employee(String email, String password, String name) {
        super(email, password, name);
    }

    public int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void gajian(int salary) {
        this.salary = 10000 + salary;
    }
}
