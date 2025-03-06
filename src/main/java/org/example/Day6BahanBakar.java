package org.example;

public class Day6BahanBakar {
    private int ron;
    private int stock;
    private int octan;


    public Day6BahanBakar() {
        ron = 91;
        stock = 40;
        octan = 3;
    }

    public void pakai(int liter) {
        this.stock -= liter;
    }

    public int getStock() {
        return stock;
    }

}
