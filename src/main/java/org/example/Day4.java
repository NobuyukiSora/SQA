package org.example;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        // Digunakan ketika jumlah perulangan sudah diketahui sebelumnya
        for(int i = 0; i < 5; i++){
            System.out.println("for " + i);
        }

        // Digunakan ketika jumlah perulangan belum diketahui sebelumnya
        int i = 0;
        while (i<5){
            System.out.println("while " + i);
            i++;
        }

        for(int loop = 0; loop < 10; loop++){
            System.out.print((loop % 2 == 1) ? loop : "");
        }
        System.out.print("\n");
        int loop = 1;
        while (loop<10){
            System.out.println(loop++);
            loop++;
        }
        int width = 10;
//        for(int y = 0; y < width; y++){
//            for(int x = 0; x < width; x++){
//                System.out.print('*');
//            }
//            System.out.print('\n');
//        }

//        for(int y = 0; y < width; y++){
//            for(int x = 0; x < y; x++){
//                System.out.print('*');
//            }
//            System.out.print('\n');
//        }

//        for(int y = 0; y < width; y++){
//            for(int starsx = (y-1)/2; starsx >= 0; starsx-- ){
//                System.out.print('*');
//            }
//            System.out.print('\n');
//        }

        Scanner scanner = new Scanner(System.in);
//        for(int y = 0; y < width; y++){
//            System.out.print("input ke-" + y + ":");
//            int input = scanner.nextInt();
//            if(input == 0){
//                break;
//            }
//        }

        String userPassword = "Indonesia";
        for(int y = 2; y >= 0; y--){
            System.out.print("Masukkan password anda: ");
            String input = scanner.nextLine();
            if(input.equals(userPassword)){
                System.out.println("Kamu berhasil masuk");
                break;
            } else if(y == 0){
                System.out.println("Anda terblokir");
                break;
            } else {
                System.out.println("Kamu akan diblokir jika salah " + y + " kali lagi");
            }

        }

    }
}
