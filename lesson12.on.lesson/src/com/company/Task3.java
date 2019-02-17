package com.company;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("444444444",4);
        map.put("5",5);
        map.put("666666",6);

       int result= map.entrySet().stream()
                .filter(entry->entry.getKey().length()>3)
                .mapToInt(entry->entry.getValue())
                .sum();
        System.out.println(result);
    }
}
