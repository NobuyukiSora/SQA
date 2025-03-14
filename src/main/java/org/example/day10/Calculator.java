package org.example.day10;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // overload
    public double add(int a, int b, double c) {
        return a + b + c;
    }

    private int multiple(int a, int b) {
        return a * b;
    }

    public double divide(float a, float b) {
        return a / b;
    }
}
