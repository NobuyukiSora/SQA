package org.example.day10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;
        int actual = calculator.add(1, 2);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDevide() {
        float expected = 3.33f;
        double actual = calculator.divide(10, 3);
        Assert.assertEquals(actual, expected, 0.1);
    }

}
