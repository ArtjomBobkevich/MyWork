package com.company;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Value(str);
    }


    public static void Value (String string){
        Map<String,Integer >map=new HashMap<>();
        String [] subStr;
        String delit= "_";
        subStr=string.split(delit);
        int contains=1;
        for (int i=0; i<subStr.length;i++) {
            if (map.containsKey(subStr[i])) {
                map.remove(subStr[i],contains++); /* тут не всё доделано */
            }
            else
                contains=1;
            map.put(subStr[i], contains);
        }
        System.out.println("Все слова: "+map);
    }
}