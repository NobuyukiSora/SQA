package org.example;

public class Day6Mobil {
    private String merk;
    private String warna;
    private Day6BahanBakar bahanBakar;
    private Day6Payment payment;

    public Day6Mobil(Day6BahanBakar bahanBakar, Day6Payment payment){
        this.bahanBakar = bahanBakar;
        this.payment = payment;
    }

    public void jalan() {
        this.bahanBakar.pakai(1);
        this.payment.pakai(1);
    }

    public void checkBahanBakar() {
        System.out.println(this.bahanBakar.getStock());
    }
    public void checkBill() {
        System.out.println(this.payment.getBill());
    }
}

