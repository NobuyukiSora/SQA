package org.example.day9;

import org.example.day9.models.Takjil;

import java.util.ArrayList;
import java.util.LinkedList;

public class DocLinkedList {
    public static void main(String[] args) {
        // ================= ARRAY LIST
        ArrayList<Takjil> takjilArrayList = new ArrayList<>();
        takjilArrayList.add(new Takjil("punya array list: kolak pisang", "jakarta"));
        takjilArrayList.add(new Takjil("punya array list: Es kelapa muda", "depok"));
        takjilArrayList.add(new Takjil("punya array list: gorengan", "tanggerang"));
        takjilArrayList.add(new Takjil("punya array list: kolak", "bogor"));

        // ================= lINKED LIST
        LinkedList<Takjil> listOfTakjil = new LinkedList<>();
        listOfTakjil.add(new Takjil("kolak pisang", "jakarta"));
        listOfTakjil.add(new Takjil("Es kelapa muda", "depok"));
        listOfTakjil.add(new Takjil("gorengan", "tanggerang"));
        listOfTakjil.add(new Takjil("kolak", "bogor"));

        // addFirst
        listOfTakjil.addFirst(new Takjil("ikan", "priuk"));

        // addLast
        listOfTakjil.addLast(new Takjil("Sate", "Madura"));

        // set

        // get
        System.out.println(listOfTakjil.size());
        for (Takjil item : listOfTakjil){
            System.out.print(item.getMakanan() + " | ");
            System.out.println(item.getLokasi());
        }

        // size
        System.out.print("\nsize linked list sebelum remove: ");
        System.out.println(listOfTakjil.size());

        // removeFirst
        listOfTakjil.removeFirst();
        // removeLast
        listOfTakjil.removeLast();
        System.out.println("\nafter remove first and last punya linkedlist: ");
        System.out.println(listOfTakjil.size());
        for (Takjil item : listOfTakjil){
            System.out.print(item.getMakanan() + " | ");
            System.out.println(item.getLokasi());
        }

        System.out.println("\nTambah takjil dari array list: ");
        listOfTakjil.addAll(1, takjilArrayList);
        System.out.println(listOfTakjil.size());
        for (Takjil item : listOfTakjil){
            System.out.print(item.getMakanan() + " | ");
            System.out.println(item.getLokasi());
        }
    }
}
