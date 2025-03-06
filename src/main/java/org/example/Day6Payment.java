package org.example;

public class Day6Payment {
    private int harga = 10000;
    private int jarakTempuh = 0;

    public void pakai(int jarak) {
        this.jarakTempuh += jarak;
    }

    public int getBill() {
        return jarakTempuh * harga;
    }
}
