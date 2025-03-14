package org.example.day7.cluster;

public class Bro {
    public Aldo aldo;

    public Bro(){
        aldo = new Aldo();
    }

    public void call() {
        aldo.receiveCall();
    }
}
