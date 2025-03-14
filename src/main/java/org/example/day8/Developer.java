package org.example.day8;

public class Developer extends Employee {
    private int tunjangan = 10000000;
    private int benefit = 5000000;

    public Developer(String email, String password, String name) {
        super(email, password, name);
    }

    @Override
    public void gajian(int salary) {
        this.setSalary(salary + tunjangan + benefit);
    }
}
