package org.example.day10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployee {
    Employee employee = new Employee();

    @Test(priority = 1)
    public void testEmployeeName() {
        employee.setName("Aldo");
        Assert.assertEquals(employee.getName(), "Aldo");
    }

    @Test
    public void testEmployeeDepartment() {
        employee.setDepartment("QA");
        Assert.assertEquals(employee.getDepartment(), "QA");
    }

    @Test
    public void testEmployeeSalaryPositive() {
        employee.setSalary(30000000);
        Assert.assertEquals(employee.getSalary(), 30000000);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmployeeSalaryNegative() {
        employee.setSalary(0);
    }
}
