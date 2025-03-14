package org.example.day8;

public class Day8 {
    public static void main( String[] args ) {
        Employee developer1 = new Developer("fukato@gmail.com", "123asik", "Fukato Nemo");
        Employee hrd1 = new HRD("budiatmoko@gmail.com", "123asikbanget", "Budi Atmoko");

        developer1.gajian(17000000);
        System.out.println(developer1.getSalary());

        hrd1.gajian(8000000);
        System.out.println(hrd1.getSalary());
    }
}
