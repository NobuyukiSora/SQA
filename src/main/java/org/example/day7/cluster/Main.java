package org.example.day7.cluster;

public class Main {
    public static void main(String[] args) {
        Day7Fruit anggur = new Day7Fruit();
        anggur.grams = 10;
        anggur.calsPerGrams = 30;
        System.out.println(anggur.total());

        Aldo aldo = new Aldo();
        aldo.setNama("nama saya aldo");
        System.out.println(aldo.getNama());
    }
}
