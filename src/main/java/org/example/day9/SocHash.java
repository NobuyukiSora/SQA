package org.example.day9;

import java.util.HashMap;
import java.util.HashSet;

public class SocHash {

    public static void main(String[] args) {
        HashSet<String> toDoList = new HashSet<>();
        toDoList.add("Belajar java");
        toDoList.add("Belajar java");
        toDoList.add("Belajar Node");


        System.out.println(toDoList.size());

        for (String item: toDoList){
            System.out.println(item);
        }

        HashMap<String, String> config = new HashMap<>();
        config.put("HOST", "127.0.0.1");
        config.put("PORT", "3306");
        config.put("USER", "root");
        config.put("PASSWORD", "12345");

        System.out.println(config.values());
        System.out.println(config.keySet());

        for (String key: config.keySet()){
            System.out.println(config.get(key));
        }


    }
}
