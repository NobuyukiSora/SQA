package org.example.day9.models;

public class Takjil {

    private  String  makanan;
    private  String lokasi;

    public Takjil(String makanan, String lokasi) {
        this.makanan = makanan;
        this.lokasi = lokasi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
}
