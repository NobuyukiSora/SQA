package org.example;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 5 % 2;
        System.out.println(result);

        int x = 2;
        int num1 = 10 + x++; //suffix: eksekusi setelah jalan
        System.out.println("suffix: " + num1);

        int y = 2;
        int num2 = 10 + ++y; //prefix: eksekusi sebelum jalan
        System.out.println("prefix: " + num2);

        int stok = 226;
        System.out.print("Beli: ");
        int amount = scanner.nextInt();

        //TERNARY
        System.out.println(amount > stok ? "anda melebihi stok" : (amount <= 0 ? "tidak dapat kurang dari 1 barang" : ""));


        // VALIDATION
        String password = "Indonesia";
        boolean isValid = password.equals("Indonesia");
        boolean isValidInsensitive = password.equalsIgnoreCase("Indonesia");
        boolean isContains = password.contains("Indo");

        switch (password) {
            case "Indonesia" : {
                System.out.println("true");
            }
            default: {
                System.out.println("false");
            }
        }

        String username = "admin";
        String inUsername = "admin";
//        String password = "indonesia";
        String inPassword = "Indonesia";

        if(username.equalsIgnoreCase(inUsername) && password.equals(inPassword)){
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Invalid Login");
        }
    }
}
