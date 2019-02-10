package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        String result ="";
        for (String a : list) {
            if (a.length() == 4) {
                result=a;
            }
            list.add(list.indexOf(result), "****");
            System.out.println(list);
        }

    }

//    public void markLength4(List<String> list) {
//        for (String a : list) {
//            if (a.length() == 4) {
//                list.add(list.indexOf(a), "****");
//            }
//        }
//        System.out.println(list);
//    }

}
