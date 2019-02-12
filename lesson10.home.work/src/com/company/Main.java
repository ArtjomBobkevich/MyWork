package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
//        System.out.println(set(str));
    }

    public static List<String >list (String string){
        List<String >list=new ArrayList<>();
        String [] subStr;
        String delit= "_";
        subStr=string.split(delit);
        for (int i=0; i<subStr.length;i++){
            list.add(subStr[i]);
        }
        return list;
    }

    public static void  Value ( List<String >list){

    
    }
}
