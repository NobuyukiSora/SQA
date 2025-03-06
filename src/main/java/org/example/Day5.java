package org.example;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array 1: value tidak bisa diubah
        int[] nilai = {1, 2, 3, 4, 5};

        // array 2: value masih bisa diubah
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        String[] data = {"Pesawat", "Mobil", "Kapal"};

        for (int y = 0; y < data.length; y++) {
            System.out.println(data[y]);
        }

        // forEach
        for (String loop : data) {
            System.out.println(loop);
        }

        int totalNilai = 0;
        for (int item : num) {
            totalNilai += item;
        }
        System.out.println("total nilai: " + totalNilai);
        System.out.println("rata2 nilai: " + totalNilai / num.length);

        // array multi dimention
        int[][] number = {{1, 2, 3, 4, 5}, {6, 7, 8}};
        for (int y = 0; y < number.length; y++) {
            for (int x = 0; x < number[y].length; x++) {
                System.out.print(number[y][x]);
            }
            System.out.print('\n');
        }

        String[] cities = {"Jakarta", "Bandung", "Cirebon", "Medan", "Surabaya"};
        String search = "Medan";
        boolean isFound = false;
        int index = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(search)) {
                isFound = true;
                index = i;
                break;
            }
        }
        if (isFound) {
            System.out.println("Data " + search + " ditemukan pada index ke-" + index);
        } else {
            System.out.println("Data " + search + " tidak ditemukan");
        }


    }
}
