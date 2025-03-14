package org.example.day9;

import org.example.day9.models.Takjil;

import java.util.ArrayList;

public class DocArrayList {
    public static void main(String[] args) {
        Main main = new Main();
        main.getDaftarTargetTakjil().add("kolak pisang");
        main.getDaftarTargetTakjil().add("es kelapa muda");
        main.getDaftarTargetTakjil().add("gorengan");
        main.getDaftarTargetTakjil().add("kolak");

        System.out.println(main.getDaftarTargetTakjil());

        ArrayList<String> daftarLokasiTakjil = new ArrayList<String>();
        daftarLokasiTakjil.add("Jakarta");
        daftarLokasiTakjil.add("depok");
        daftarLokasiTakjil.add("tanggerang");
        daftarLokasiTakjil.add("bogor");

        System.out.println(daftarLokasiTakjil);

        // Pembuatan array list dengan object takjil dari models package
        ArrayList<Takjil> listOfTakjil = new ArrayList<>();
        listOfTakjil.add(new Takjil("kolak pisang", "jakarta"));
        listOfTakjil.add(new Takjil("Es kelapa muda", "depok"));
        listOfTakjil.add(new Takjil("gorengan", "tanggerang"));
        listOfTakjil.add(new Takjil("kolak", "bogor"));

        // GET
        System.out.println(listOfTakjil.get(1).getMakanan());
        System.out.println(listOfTakjil.get(3).getMakanan());
        System.out.println(listOfTakjil.get(3).getLokasi());

        listOfTakjil.set(3, new Takjil("bakso", "surabaya"));

        System.out.println(listOfTakjil.get(3).getMakanan());
        System.out.println(listOfTakjil.get(3).getLokasi());

        // SET
        listOfTakjil.set(3, new Takjil("Buah", "lampung"));
        // OR
        listOfTakjil.get(3).setLokasi("lampung");
        listOfTakjil.get(3).setMakanan("buah");

        int index = listOfTakjil.size();

        listOfTakjil.get(index -1).setLokasi("lampung");
        listOfTakjil.get(index -1).setMakanan("buah");

        System.out.println(listOfTakjil.get(3).getMakanan());
        System.out.println(listOfTakjil.get(3).getLokasi());

        for (Takjil item : listOfTakjil){
            System.out.print(item.getMakanan() + " | ");
            System.out.println(item.getLokasi());
        }
        // REMOVE
        System.out.println("== REMOVE");
        listOfTakjil.remove(2);
        for (Takjil item : listOfTakjil){
            System.out.print(item.getMakanan() + " | ");
            System.out.println(item.getLokasi());
        }

        //CLEAR
        System.out.println("== CLEAR");
        listOfTakjil.clear();
        for (Takjil item : listOfTakjil){
            System.out.print(item.getMakanan() + " | ");
            System.out.println(item.getLokasi());
        }
    }
}
