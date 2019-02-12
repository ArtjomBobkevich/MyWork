package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Value(str);
    }


    public static void Value (String string){
        Map<Integer,String >map=new HashMap<>();
        Set<String> set=new HashSet<>();
        String [] subStr;
        String delit= "_";
        subStr=string.split(delit);
        for (int i=0; i<subStr.length;i++){
            map.put(i,subStr[i]);
            set.add(subStr[i]);
        }
        System.out.println("Все слова: "+map);
        System.out.println("Уникальные слова: "+set);
        int contains2=0;
        int contains=1;
        for (int i=0;i<map.size();i++){
            for (int j=0;j<map.size()-i;j++){
                if (subStr[i].equals(subStr[j])){
                    contains+=1;
                }
                contains2=contains;
                contains=1;
            }
            System.out.println("Слово "+ subStr[i]+" кол-во раз "+contains2);
        }
    }
}
