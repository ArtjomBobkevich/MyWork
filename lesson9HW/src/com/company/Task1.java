package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        System.out.println(markLength4(list));
    }

    public static List<String> markLength4(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() == 4) {
                iterator.set("****");
                iterator.add(s);
            }
        }
        return list;
    }
}