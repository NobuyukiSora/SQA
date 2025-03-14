package org.example.day7.cluster;

public  class Aldo {

    private String nama;

//    public Aldo(String name){
//        this.nama = name;
//    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

 public void receiveCall(){
     System.out.print("YOO");
 }
}
